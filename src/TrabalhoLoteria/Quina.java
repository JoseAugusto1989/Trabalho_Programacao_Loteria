package TrabalhoLoteria;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Quina implements Loterias {
	
	 public ArrayList<Integer> dezenas = new ArrayList<>();
	    
	    
	 @Override
	 public ArrayList<Integer> getDezenas() {
         return dezenas;
     }
	    
	 public void setDezenas(ArrayList<Integer> dezenas) {
		 this.dezenas = dezenas;
	 }
	     
     @Override
     public boolean validar(int valida) {
    	 if (valida < 1 || valida > 80){
             return false;
         }
	     return true;
	 }

	 @Override
     public void setDezenas(int dezenas) {
         this.dezenas.add(dezenas);
     }

     @Override
     public int confere(ArrayList<Integer> aposta, ArrayList<Integer> jogo) {
         int cont = 0;
         for (int i=0; i<aposta.size(); i++) {
        	 for (int j=0; j<jogo.size(); j++) {
	        	 if (aposta.get(i) == jogo.get(j)) {
	        		 cont++;
	                    
	             }
	         }
	     }
	     return cont;       
	 }

	 @Override
     public void randomicos() {
		 int find = 0, c, i;
	     ArrayList<Integer> num = new ArrayList<>();
	     Random rand = new Random();

	     for (i=0; i<5; i++) {
	    	 find = rand.nextInt(80) + 1;
	         if (i == 0) {
	        	 num.add(find);
	        	 
	         } else {
	             c = 0;
	             while (c < i) {
	            	 if (num.get(c).equals(find)) {
	            	 	 find = rand.nextInt(5) + 1;
	                     c = 0;
	                     
	                 } else {
	                	 c++;
	                 }
	             }
	             num.add(find);
	         }
	         Collections.sort(num);
	     }
	     System.out.println("SEU JOGO ALEATORIO QUINA");
	     System.out.print(num);
	     System.out.println("\n");
	        
	 }

	 @Override
	 public void cincoMais(ArrayList<Integer> vet) {
         System.out.println("CINCO NUMEROS QUE MAIS SAIRAM: ");
		     vet.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
	         .sorted(Map.Entry.<Integer, Long>comparingByValue()
	         .reversed())
	         .limit(5)
	         .forEachOrdered(e -> System.out.println("Nº " + e.getKey() + " apareceu " + e.getValue() + " vezes"));
	         System.out.println("\n");
	        
	 }

	 @Override
     public void cincoMenos(ArrayList<Integer> vet) {
	     System.out.println("CINCO NUMEROS QUE MENOS SAIRAM: ");
	         vet.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
	         .sorted(Map.Entry.<Integer, Long>comparingByValue())
	         .limit(5)
	         .forEachOrdered(e -> System.out.println("Nº " + e.getKey() + " apareceu " + e.getValue() + " vezes"));
	         System.out.println("\n");
	        
	 }

}

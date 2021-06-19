package TrabalhoLoteria;

import java.util.ArrayList;

public class View {
	
	ArrayList<Jogo> mList = new ArrayList<>();
	
	public void menu1() {
        System.out.println("1 - Mega-Sena");
        System.out.println("2 - Quina");
        System.out.println("3 - Lotofácil");
        System.out.println("9 - Sair\n");
        System.out.print("Digite sua opçao: ");
         	
	}
	
	public void menu2() {
		System.out.println("1 - 5 números que mais saíram");
        System.out.println("2 - 5 números que menos saíram");
        System.out.println("3 - Gerar números randômicos");
        System.out.println("4 - Escolher meus números\n");
        System.out.print("Digite sua opção: ");
        
	}
	
	public void menu3() {
		System.out.println("1. 5 números que mais saíram");
        System.out.println("2. 5 números que menos saíram");
        System.out.println("3. Gerar números randômicos");
        System.out.println("4. Escolher meus números");
        System.out.println("\n");
        
	}
	
	public void menu4() {
		System.out.println("1. 5 números que mais saíram");
        System.out.println("2. 5 números que menos saíram");
        System.out.println("3. Gerar números randômicos");
        System.out.println("4. Escolher minhas dezenas");
        System.out.println("\n");
        
	}
	
}

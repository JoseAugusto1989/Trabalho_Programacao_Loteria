package TrabalhoLoteria;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class StartApp {
	
	static Scanner scan = new Scanner(System.in);	
	static View view = new View();
	
    public static void main (String[]args) throws FileNotFoundException {
        
        File megaCSV = new File("d:\\ArquivosCSV\\mega.csv");
        File quinaCSV = new File("d:\\ArquivosCSV\\quina.csv");
        File lotofacilCSV = new File("d:\\ArquivosCSV\\lotofacil.csv");
        BufferedReader buffMega = new BufferedReader(new FileReader(megaCSV));
        BufferedReader buffLotofacil = new BufferedReader(new FileReader(lotofacilCSV));
        BufferedReader buffQuina = new BufferedReader(new FileReader(quinaCSV));  
        ArrayList<Jogo> mList = new ArrayList<>();
    	ArrayList<Jogo> qList = new ArrayList<>();
    	ArrayList<Jogo> lList = new ArrayList<>(); 
       
        String line = " ";
        
        Jogo mega = new Jogo();
        String[] c = line.split(","); 
        	methodToReadCSV(buffMega, mList, mega, c, 8);
        	
        Jogo lotofacil = new Jogo();
        String[] e = line.split(","); 
           methodToReadCSV(buffLotofacil, lList, lotofacil, e, 17);
              
        Jogo quina = new Jogo();
        String[] d = line.split(","); 
        	methodToReadCSV(buffQuina, qList, quina, d, 7);
 
        int opcao, opcao2;
        boolean a;

        do {
        	
            view.menu1();
            	opcao = scan.nextInt();
            	System.out.println("\n");
            	
            if (opcao == 1) {
                Loterias jogo = Factory.criarJogo(opcao);
                view.menu2();
                	opcao2 = scan.nextInt();
                	System.out.println("\n");
                
            if (opcao2 == 1) {
                ArrayList<Integer> vet = new ArrayList<Integer>();
                int aux = 0;
                    
                for (int j=0; j<mList.size(); j++) {
                    for (int i=0; i<6; i++) {
                    	vet.add(aux,mList.get(j).getDezenas().get(i));
                        aux++;
                    }
                }
                jogo.cincoMais(vet);
         
            }
                
            if (opcao2 == 2) {
                 ArrayList<Integer> vet = new ArrayList<>();
                 int aux = 0;
                    
                 for (int j=0; j<mList.size(); j++) {
                     for (int i=0; i<6; i++) {
                    	 vet.add(aux,mList.get(j).getDezenas().get(i));
                         aux++;
                     }
                 }
                 jogo.cincoMenos(vet);
                     
            }
                
            if (opcao2 == 3) {
            	jogo.randomicos();
            
            }
                
            if (opcao2 == 4) {
                int aux = 0;
                System.out.println("ATENÇÃO: SEUS NÚMEROS DEVEM ESTAR ENTRE 1 E 60");

                for (int i=0; i<6; i++) {
                    System.out.print("Escolha o " + (i + 1) + "° número: ");
                    	aux = scan.nextInt();
                    	a = jogo.validar(aux);
                        
                        if (a == false) {
                            System.out.println("Seus números devem estar entre 1 e 60");
                            System.out.print("Informe novamente o número: ");
                            i--;
                            
                        }
                        jogo.setDezenas(aux);
                        System.out.println(jogo.getDezenas());
                }
                int acerto = 0; 
                
                for (int i=0; i<mList.size(); i++) {
                    acerto = jogo.confere(jogo.getDezenas(), mList.get(i).getDezenas());
                    
                    switch (acerto) {
                        case 4:
                            System.out.println("No concurso de número: " + mList.get(i).getConcurso());
                            System.out.println("Data: " + mList.get(i).getData());
                            System.out.println("Você acertou " + acerto + " números, e ganhou na QUADRA!!");
                            System.out.println("\n");
                            	break;
                            
                        case 5:
                            System.out.println("No concurso de número: " + mList.get(i).getConcurso());
                            System.out.println("Data: " + mList.get(i).getData());
                            System.out.println("Você acertou " + acerto + " números, e ganhou na QUINA!!");
                            System.out.println("\n");
                            	break;
                            
                        case 6:
                            System.out.println("No concurso de número: " + mList.get(i).getConcurso());
                            System.out.println("Data: " + mList.get(i).getData());
                            System.out.println("Você acertou " + acerto + " números, e ganhou na MEGA!!");
                            System.out.println("\n");
                            	break;
                    }
                }  
            }
        }
            
        if (opcao == 2) {
        	Loterias jogo = Factory.criarJogo(opcao);
        		view.menu3();
                	opcao2 = scan.nextInt();
                	System.out.printf("\n");
                
                if (opcao2 == 1) {
                	ArrayList<Integer> vet = new ArrayList<>();
                    int aux = 0;
                    
                    for (int j=0; j<qList.size(); j++) {
                        for (int i=0; i<5; i++) {
                            vet.add(aux,qList.get(j).getDezenas().get(i));
                            aux++;
                        }
                    }
                    jogo.cincoMais(vet);
                    
                }
                
                if (opcao2 == 2) {
                    
                    ArrayList<Integer> vet = new ArrayList<>();
                    int aux = 0;
                    
                    for (int j=0; j<qList.size(); j++) {
                        for (int i=0; i<5; i++) {
                            
                            vet.add(aux,qList.get(j).getDezenas().get(i));
                            aux++;
                        }
                    }
                    
                    jogo.cincoMenos(vet);
                     
                }
                
                if (opcao2 == 3) {
                    jogo.randomicos();
                    
                }
                
                if (opcao2 == 4) {
                    int aux = 0;
                    System.out.println("ATENÇÃO: SEUS NÚMEROS DEVEM ESTAR ENTRE 1 E 80");

                    for (int i=0; i<5; i++) {
                        System.out.print("Escolha o " + (i + 1) + "° número: ");
                        	aux = scan.nextInt();
                        	a = jogo.validar(aux);
                        
                        if (a == false) {
                            System.out.println("seus números devem estar entre 1 e 80");
                            System.out.print("Informe novamente o número: ");
                            i--;
                            
                        }
                        jogo.setDezenas(aux);
                        System.out.println(jogo.getDezenas());
                        
                    }
                    int acerto = 0; 
                    for (int i=0; i<qList.size(); i++) {
                        acerto = jogo.confere(jogo.getDezenas(), qList.get(i).getDezenas());
                    
                    switch (acerto){
                        case 2:
                            System.out.println("No concurso de número: " + qList.get(i).getConcurso());
                            System.out.println("Data: " + qList.get(i).getData());
                            System.out.println("Você acertou " + acerto + " números, e ganhou na DUQUE!!");
                            System.out.println("\n");
                            	break;
                            	
                        case 3:
                            System.out.println("No concurso de número: " + qList.get(i).getConcurso());
                            System.out.println("Data: " + qList.get(i).getData());
                            System.out.println("Você acertou " + acerto + " números, e ganhou na TERNO!!");
                            System.out.println("\n");
                            	break;
                            	
                        case 4:
                            System.out.println("No concurso de número: " + qList.get(i).getConcurso());
                            System.out.println("Data: " + qList.get(i).getData());
                            System.out.println("Você acertou " + acerto + " números, e ganhou na QUADRA!!");
                            System.out.println("\n");
                            	break;
                        case 5:
                            System.out.println("No concurso de número: " + qList.get(i).getConcurso());
                            System.out.println("Data: " + qList.get(i).getData());
                            System.out.println("Você acertou " + acerto + " números, e ganhou na QUINA!!");
                            System.out.println("\n");
                            	break;
                    }
                }  
            }
        }
            
        if (opcao == 3) {
        	Loterias jogo = Factory.criarJogo(opcao);
        		view.menu4();
                
                opcao2 = scan.nextInt();
                System.out.println("\n");
                
                if (opcao2 == 1) {
                    ArrayList<Integer> vet = new ArrayList<>();
                    int aux = 0;
                    
                    for (int j=0; j<lList.size(); j++) {
                        for (int i=0; i<15; i++) {
                            vet.add(aux,lList.get(j).getDezenas().get(i));
                            aux++;
                        }
                    }
                    jogo.cincoMais(vet);
                    
                }
                
                if (opcao2 == 2) {
                    ArrayList<Integer> vet = new ArrayList<>();
                    int aux = 0;
                    
                    for (int j=0; j<lList.size(); j++) {
                        for (int i=0; i<15; i++) {
                            vet.add(aux,lList.get(j).getDezenas().get(i));
                            aux++;
                        }
                    }
                    jogo.cincoMenos(vet);
                     
                }
                
                if (opcao2 == 3) {
                    jogo.randomicos();
                    
                }
                
                if (opcao2 == 4) {
                    int aux = 0;
                    System.out.println("ATENÇÃO: OS NÚMEROS DEVEM ESTAR ENTRE 1 E 25");

                    for (int i=0; i<15; i++) {
                        System.out.print("Escolha o " + (i + 1) + "° número: ");
                        	aux = scan.nextInt();
                        	a = jogo.validar(aux);
                        
                        if (a == false) {
                            System.out.println("Seus números devem estar entre 1 e 25");
                            System.out.print("Informe novamente seu número: ");
                            i--;
                        }
                        jogo.setDezenas(aux);
                        System.out.println(jogo.getDezenas());
                    }
                    
                    int acerto = 0; 
                    for (int i=0; i<lList.size(); i++){
                        acerto = jogo.confere(jogo.getDezenas(), lList.get(i).getDezenas());
                    
                    switch (acerto){
                        case 11:
                            System.out.println("No concurso de número: " + lList.get(i).getConcurso());
                            System.out.println("Data: " + lList.get(i).getData());
                            System.out.println("Você acertou " + acerto + " números, e ganhou!!");
                            System.out.println("\n");
                            	break;
                            	
                        case 12:
                            System.out.println("No concurso de número: " + lList.get(i).getConcurso());
                            System.out.println("Data: " + lList.get(i).getData());
                            System.out.println("Você acertou " + acerto + " números, e ganhou!!");
                            System.out.println("\n");
                            	break;
                            	
                        case 13:
                            System.out.println("No concurso de número: " + lList.get(i).getConcurso());
                            System.out.println("Data: " + lList.get(i).getData());
                            System.out.println("Você acertou " + acerto + " números, e ganhou!!");
                            System.out.println("\n");
                            	break;
                            	
                        case 14:
                            System.out.println("No concurso de número: " + lList.get(i).getConcurso());
                            System.out.println("Data: " + lList.get(i).getData());
                            System.out.println("Você acertou " + acerto + " números, e ganhou!!");
                            System.out.println("\n");
                            	break;
                            	
                        case 15:
                            System.out.println("No concurso de número: " + lList.get(i).getConcurso());
                            System.out.println("Data: " + lList.get(i).getData());
                            System.out.println("Você acertou " + acerto + " números, e ganhou!!");
                            System.out.println("\n");
                            	break;
                    }
                }  
            }
        }

        if (opcao == 9) {
            System.out.println("Fim do App!!!");
        }
            
        } while(opcao != 9);
        
        scan.close();
    }
    
    private static void methodToReadCSV(BufferedReader bufRea, ArrayList<Jogo> list, Jogo lote, String[] x, int numb) {
    	
    	String line = " ";
    	 try {
         	while ((line = bufRea.readLine()) != null) {
                 
                 lote = new Jogo();
                 x = line.split(","); 
                 lote.setConcurso(Integer.parseInt(x[0]));
                 lote.setData(x[1]);
                 
                 for (int i=2; i<numb; i++) {
                 	lote.add(Integer.parseInt(x[i]));
                 	
                 }                       
                 list.add(lote); 
             }
         	
         } catch (Exception e) {
         	System.out.println("* Corrigir erro no programa: " +e.getMessage() + "\n");
         	
         }
    }

}

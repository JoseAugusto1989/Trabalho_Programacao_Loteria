package TrabalhoLoteria;

import java.util.ArrayList;

public class View {
	
	ArrayList<Jogo> mList = new ArrayList<>();
	
	public void menu1() {
        System.out.println("1 - Mega-Sena");
        System.out.println("2 - Quina");
        System.out.println("3 - Lotof�cil");
        System.out.println("9 - Sair\n");
        System.out.print("Digite sua op�ao: ");
         	
	}
	
	public void menu2() {
		System.out.println("1 - 5 n�meros que mais sa�ram");
        System.out.println("2 - 5 n�meros que menos sa�ram");
        System.out.println("3 - Gerar n�meros rand�micos");
        System.out.println("4 - Escolher meus n�meros\n");
        System.out.print("Digite sua op��o: ");
        
	}
	
	public void menu3() {
		System.out.println("1. 5 n�meros que mais sa�ram");
        System.out.println("2. 5 n�meros que menos sa�ram");
        System.out.println("3. Gerar n�meros rand�micos");
        System.out.println("4. Escolher meus n�meros");
        System.out.println("\n");
        
	}
	
	public void menu4() {
		System.out.println("1. 5 n�meros que mais sa�ram");
        System.out.println("2. 5 n�meros que menos sa�ram");
        System.out.println("3. Gerar n�meros rand�micos");
        System.out.println("4. Escolher minhas dezenas");
        System.out.println("\n");
        
	}
	
}

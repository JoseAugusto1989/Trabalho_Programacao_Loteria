package TrabalhoLoteria;

public class Factory {

	 public static Loterias criarJogo (int opcao) {
	       
	       if (opcao == 1) {
	           return new  MegaSena();
	           
	       } else if (opcao == 2) {
	           return new Quina();
	           
	       } else {
	           return new Lotofacil();
	           
	       }
	  }  
}

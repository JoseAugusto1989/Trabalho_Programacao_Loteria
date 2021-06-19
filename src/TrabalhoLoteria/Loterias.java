package TrabalhoLoteria;

import java.util.ArrayList;

public interface Loterias {
	
	public abstract boolean validar(int valida); 
	
    public abstract void setDezenas(int dezenas); 
    
    public abstract int confere(ArrayList<Integer> aposta, ArrayList<Integer> jogo); 
    
    public abstract void randomicos();
    
    public abstract void cincoMais(ArrayList<Integer> vet);
    
    public abstract void cincoMenos(ArrayList<Integer> vet);
    
    public abstract ArrayList<Integer> getDezenas();

}

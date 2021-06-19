package TrabalhoLoteria;

import java.util.ArrayList;

public class Jogo {
	    
	    private int concurso; 
	    private String data; 
	    public ArrayList<Integer> dezenas = new ArrayList<>();
	   

	    public int getConcurso() {
	        return concurso;
	    }

	    public void setConcurso(int concurso) {
	        this.concurso = concurso;
	    }

	    public String getData() {
	        return data;
	    }

	    public void setData(String data) {
	        this.data = data;
	    }  

	    public ArrayList<Integer> getDezenas() {
	        return dezenas;
	    }

	    public void setDezenas(ArrayList<Integer> dezenas) {
	        this.dezenas = dezenas;
	    }
	    
	    public void add(Integer x){
	        this.dezenas.add(x);
	    }  

}

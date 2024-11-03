package uni1a;

import java.util.List;

public class Temporada {

	private int numTemporada;
	private List<String> episodios;
	
	public Temporada(int numTemporada, List<String> episodios) {
		this.numTemporada = numTemporada;
		this.episodios = episodios;
		
	}
	
	public int getNumeroTemporada() {
		return numTemporada;
	}
	
	public void setNumeroTemporada(int numTemporada) {
		this.numTemporada = numTemporada;
		
	}
	
	public List<String> getEpisodios(){
		return episodios;
	}
	
	public void setEpisodios(List<String> episodios) {
		this.episodios = episodios;
		
	}
}


package pub.std.poo.java.bootcamp;

public class Conteudo {
	private String dsNomeConteudo;
	private String dsDescrConteudo;
	private double vlExpConteudo;
	
	public Conteudo(String nmConteudo, String dsConteudo, int vlExpConteudo) {
		this.dsNomeConteudo = nmConteudo;
		this.dsDescrConteudo = dsConteudo;
		this.vlExpConteudo = vlExpConteudo;
	}
	
	//Getters
	public String getNomeConteudo() {
		return dsNomeConteudo;
	}
	public String getDescricaoConteudo() {
		return dsDescrConteudo;
	}
	public double getExpConteudo() {
		return vlExpConteudo;
	}
	
	
	

}

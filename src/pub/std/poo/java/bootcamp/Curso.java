package pub.std.poo.java.bootcamp;

import java.util.ArrayList;
import java.util.List;

public class Curso {
	private String dsNomeCurso;
	private String dsDescrCurso;
	private List<Conteudo> listConteudosCurso;
	private double vlTotalExpCurso;
	
	public Curso(String dsNomeCurso, String dsDescrCurso) {
		this.dsNomeCurso = dsNomeCurso;
		this.dsDescrCurso = dsDescrCurso;
		this.listConteudosCurso = new ArrayList<>();
	}
	
	public void adicionarConteudo(Conteudo novoConteudoCurso) {
		listConteudosCurso.add(novoConteudoCurso);
	}

	public String getNmCurso() {
		return dsNomeCurso;
	}

	public String getDsCurso() {
		return dsDescrCurso;
	}

	public List<Conteudo> getListConteudosCurso() {
		return listConteudosCurso;
	}
	
	public double getVlTotalExp() {
		return vlTotalExpCurso;
	}
	
	
	
}

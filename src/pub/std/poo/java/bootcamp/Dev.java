package pub.std.poo.java.bootcamp;

import java.util.List;
import java.util.ArrayList;

public class Dev {
	private String dsNomeDev;
	private int cdMatriculaDev;
	private double vlExpDev;
	private static int SEQ_MATRICULA = 1;
	
	private List<Curso> listCursosInscrito = new ArrayList<>();
	private List<Conteudo> listConteudoConcluido = new ArrayList<>();
	
	public Dev(String dsNomeDev) {
		this.dsNomeDev = dsNomeDev;
		this.cdMatriculaDev = SEQ_MATRICULA++;
		this.vlExpDev = 0;
	}
	
	public void inscreverEmBootcamp(Bootcamp novoBootcamp) {
		listCursosInscrito.addAll(novoBootcamp.getListCursosBootcamp());
	}
	
	public void concluirConteudo(Conteudo conteudoConcluido) {
		listConteudoConcluido.add(conteudoConcluido);
		vlExpDev = vlExpDev + conteudoConcluido.getExpConteudo();
	}
								

	public String getDsNomeDev() {
		return dsNomeDev;
	}

	public int getCdMatriculaDev() {
		return cdMatriculaDev;
	}

	public double getVlExpDev() {
		return vlExpDev;
	}

	public List<Curso> getCursosInscrito() {
		return listCursosInscrito;
	}

	public List<Conteudo> getCursoConcluido() {
		return listConteudoConcluido;
	}
	
	public void imprimirDadosDev() {
		System.out.println("===============================================");
		System.out.println("Dados do Dev "+getDsNomeDev());
		System.out.println("===============================================");
		System.out.println("== NOME: "+getDsNomeDev());
		System.out.println("== MATIRUCLA: "+getCdMatriculaDev());
		System.out.println("== EXP: "+getVlExpDev());
		System.out.println("== CURSOS INSCRITO: ");
		for (Curso cursoInscrito : listCursosInscrito) {
			System.out.println("===== CURSO "+Integer.valueOf(listCursosInscrito.indexOf(cursoInscrito)+1)+ ": "+cursoInscrito.getNmCurso());
		}
		System.out.println("== CONTEUDO CONCLUIDO: ");
		for (Conteudo conteudoConcluido : listConteudoConcluido) {
			System.out.println("===== "+Integer.valueOf(listConteudoConcluido.indexOf(conteudoConcluido)+1)+ ": "+conteudoConcluido.getNomeConteudo());
		}
		

	}
	
	
}

package pub.std.poo.java.bootcamp;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Bootcamp {
	private LocalDate dtInicial;
	private LocalDate dtFinal;
	private String dsNomeBootcamp;
	private String dsDescrBootcamp;
	
	private List<Curso> listCursosBootcamp;
	private List<Dev> listDevsBootcamp;
	
	
	public Bootcamp(String nomeBootcamp, String descricaoBootcamp) {
		this.dtInicial = LocalDate.now();
		this.dtFinal = dtInicial.plusDays(60);
		this.dsNomeBootcamp = nomeBootcamp;
		this.dsDescrBootcamp = descricaoBootcamp;
		this.listCursosBootcamp = new ArrayList<Curso>();
		this.listDevsBootcamp = new ArrayList<Dev>();
		
	}
	
	public void adicionarDev(Dev novoDev) {
		listDevsBootcamp.add(novoDev);
	}
	
	public void adicionarCurso(Curso cursoParaBootcamp) {
		listCursosBootcamp.add(cursoParaBootcamp);
	}
	
	public LocalDate getDataInicial() {
		return dtInicial;
	}
	public LocalDate getDataFinal() {
		return dtFinal;
	}
	public String getNomeBootcamp() {
		return dsNomeBootcamp;
	}
	public String getDescricaoBootcamp() {
		return dsDescrBootcamp;
	}
	public List<Curso> getListCursosBootcamp() {
		return listCursosBootcamp;
	}
	public List<Dev> getListDevsBootcamp() {
		return listDevsBootcamp;
	}
	
	
}

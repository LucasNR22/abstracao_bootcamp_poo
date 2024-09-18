import pub.std.poo.java.bootcamp.Bootcamp;
import pub.std.poo.java.bootcamp.Conteudo;
import pub.std.poo.java.bootcamp.Curso;
import pub.std.poo.java.bootcamp.Dev;

public class Main {

	public static void main(String[] args) {
		//Criacao de DEV
		Dev Lucas = new Dev("Lucas");
		
		//Criacao de BOOTCAMP
		Bootcamp JavaBasico = new Bootcamp("DIO | Java Basico", "Bootcamp de java basico da DIO");
		
		//Criacao de CURSO
		Curso SintaxeBasica = new Curso("Sintaxe basica Java", "Aprendendo a sintaxe basica de Java");
		
		//Criacao de CONTEUDOS
		Conteudo AnatomiaClasses = new Conteudo("Anatomia das classes em Java","Aprendendo as estruturas das classes em Java", 40);
		Conteudo TiposVariaveis = new Conteudo("Tipos e Variaveis em Java","Aprendendo Tipos e Variaveis em Java", 40);
		Conteudo Operacoes = new Conteudo("Operacoes basicas em Java","Aprendendo as operacoes basicas em Java", 40);
		Conteudo Metodos = new Conteudo("Metodos basicas em Java","Aprendendo o que sao metodos em Java", 40);
		Conteudo Escopo = new Conteudo("Escopo em Java","Aprendendo o escopo dos metodos em Java", 40);
		
		//Adicionando Conteudos ao Curso
		SintaxeBasica.adicionarConteudo(AnatomiaClasses);
		SintaxeBasica.adicionarConteudo(TiposVariaveis);
		SintaxeBasica.adicionarConteudo(Operacoes);
		SintaxeBasica.adicionarConteudo(Metodos);
		SintaxeBasica.adicionarConteudo(Escopo);
		
		//Adicionando Curso e Dev ao Bootcamp
		JavaBasico.adicionarCurso(SintaxeBasica);
		JavaBasico.adicionarDev(Lucas);
		
		Lucas.inscreverEmBootcamp(JavaBasico);
		
		Lucas.concluirConteudo(AnatomiaClasses);
		Lucas.concluirConteudo(TiposVariaveis);
		Lucas.concluirConteudo(Operacoes);
		
		Lucas.imprimirDadosDev();
		
		//Criando novo DEV:
		Dev Camila = new Dev("Camila");
		
		Camila.inscreverEmBootcamp(JavaBasico);
		
		Camila.concluirConteudo(AnatomiaClasses);
		Camila.concluirConteudo(TiposVariaveis);
		Camila.concluirConteudo(Operacoes);
		Camila.concluirConteudo(Metodos);
		Camila.concluirConteudo(Escopo);
		
		Camila.imprimirDadosDev();
		
	}

}

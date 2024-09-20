package cursojava.executavel;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {
	/*Main é um metodo auto executavel em java*/
	public static void main(String[] args) {
		
		/* new Aluno é uma instancia (Criação de um Objeto)*/
		/* aluno1 é uma referencia para o obejeto aluno*/
		Aluno aluno1 = new Aluno(); /*Aqui sera o aluno Joao*/
		aluno1.setNome("Joao");
		aluno1.setIdade(50);
		aluno1.setDataNascimento("28/11/1967");
		aluno1.setRegistroGeral("44552.4555.545");
		aluno1.setNumeroCpf("27751279320");
		aluno1.setNomeMae("Maria do Scorro");
		aluno1.setNomePai("Francisco");
		aluno1.setDataMatricula("01/01/2024");
		aluno1.setSerieMatriculado("5");
		aluno1.setNomeEscola("JDEV TREINAMENTO");
		aluno1.setNota1(90);
		aluno1.setNota2(80.8);
		aluno1.setNota3(70.9);
		aluno1.setNota4(90.7);
		
		
		System.out.println("Nome é = " + aluno1.getNome());
		System.out.println("Idade é = " + aluno1.getIdade());
		System.out.println("Nascimento é = " + aluno1.getDataNascimento());
		System.out.println("Media da nota é" + aluno1.getMediaNota());
		System.out.println("Resultado = " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		System.out.println("-----------------------------------------------------------------");
		
		
		Aluno aluno2 = new Aluno(); /*Aqui sera o aluno Pedro*/
		aluno2.setNome("Pedro");
		aluno2.setIdade(40);
		aluno2.setDataNascimento("10/10/2019");

		System.out.println("Nome aluno2 é = " + aluno2.getNome());
		System.out.println("Idade aluno2 é = " + aluno2.getIdade());
		System.out.println("Nascimento aluno2 é = " + aluno2.getDataNascimento());
			
		Aluno aluno3 = new Aluno(); /*Aqui sera o aluno MArcio*/
		
		Aluno aluno4 = new Aluno("Maria"); /*O valor padrao é Maria */
		
		Aluno aluno5 = new Aluno("Jose", 50);
		
	}
}

package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {
	/*Main é um metodo auto executavel em java*/
	public static void main(String[] args) {
		
		/* new Aluno é uma instancia (Criação de um Objeto)*/
		/* aluno1 é uma referencia para o obejeto aluno*/
		
		String nome = JOptionPane.showInputDialog("Nome do aluno?");
		String idade = JOptionPane.showInputDialog("Idade?");
		String datanascimento = JOptionPane.showInputDialog("Data nascimento?");
		String registroGeral = JOptionPane.showInputDialog("RG?");
		String numeroCpf = JOptionPane.showInputDialog("CPF?");
		String nomeMae = JOptionPane.showInputDialog("Nome da Mae?");
		String nomePai = JOptionPane.showInputDialog("Nome do Pai?");
		String dataMatricula = JOptionPane.showInputDialog("Data matricula?");
		String escola = JOptionPane.showInputDialog("Nome da Escola?");
		String serie = JOptionPane.showInputDialog("Serie ");
		String nota1 = JOptionPane.showInputDialog("Nota 1 ");
		String nota2 = JOptionPane.showInputDialog("Nota 2 ");
		String nota3 = JOptionPane.showInputDialog("Nota 3 ");
		String nota4 = JOptionPane.showInputDialog("Nota 4 ");
		
		
		Aluno aluno1 = new Aluno(); /*Aqui sera o aluno Joao*/
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(datanascimento);
		aluno1.setRegistroGeral(registroGeral);
		aluno1.setNumeroCpf(numeroCpf);
		aluno1.setNomeMae(nomeMae);
		aluno1.setNomePai(nomePai);
		aluno1.setDataMatricula(dataMatricula);
		aluno1.setSerieMatriculado(serie);
		aluno1.setNomeEscola(escola);
		
		aluno1.setNota1(Double.parseDouble(nota1));
		aluno1.setNota2(Double.parseDouble(nota2));
		aluno1.setNota3(Double.parseDouble(nota3));
		aluno1.setNota4(Double.parseDouble(nota4));
		
		
		System.out.println(aluno1.toString());
		System.out.println("Média do aluno =" + aluno1.getMediaNota());
		System.out.println("Resultado " + aluno1.getAlunoAprovado());
		
	}
}

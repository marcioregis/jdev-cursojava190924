package cursojava.executavel;
import javax.swing.JOptionPane;
import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class PrimeiraClasseJava {
	/*Main é um metodo auto executavel em java*/
	public static void main(String[] args) {
		
		/* new Aluno é uma instancia (Criação de um Objeto)*/
		/* aluno1 é uma referencia para o obejeto aluno*/
		String nome = JOptionPane.showInputDialog("Nome do aluno?");
		/*
		String idade = JOptionPane.showInputDialog("Idade?");
		String datanascimento = JOptionPane.showInputDialog("Data nascimento?");
		String registroGeral = JOptionPane.showInputDialog("RG?");
		String numeroCpf = JOptionPane.showInputDialog("CPF?");
		String nomeMae = JOptionPane.showInputDialog("Nome da Mae?");
		String nomePai = JOptionPane.showInputDialog("Nome do Pai?");
		String dataMatricula = JOptionPane.showInputDialog("Data matricula?");
		String escola = JOptionPane.showInputDialog("Nome da Escola?");
		String serie = JOptionPane.showInputDialog("Serie ");
	    */
		
		Aluno aluno1 = new Aluno(); 
		aluno1.setNome(nome);
		/*
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(datanascimento);
		aluno1.setRegistroGeral(registroGeral);
		aluno1.setNumeroCpf(numeroCpf);
		aluno1.setNomeMae(nomeMae);
		aluno1.setNomePai(nomePai);
		aluno1.setDataMatricula(dataMatricula);
		aluno1.setSerieMatriculado(serie);
		aluno1.setNomeEscola(escola);
		*/
		
		/* Atributos do objeto Disciplina*/
		
		for (int pos = 1; pos <=4; pos++) {
			String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina "+pos+" ?");
			String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina "+pos+" ?");
			
			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(pos));

			aluno1.getDisciplinas().add(disciplina);
		}
		
		int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina ?");
		if (escolha ==0) {
			String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplica 1,2,3 ou4 ?");
			aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() -1);
		}
		
		System.out.println(aluno1.toString());
		System.out.println("Média do aluno =" + aluno1.getMediaNota());
		System.out.println("Resultado " + aluno1.getAlunoAprovado2());
		
	}
}

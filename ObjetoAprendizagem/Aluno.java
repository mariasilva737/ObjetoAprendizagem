import java.sql.Date;

public class Aluno {
	
	private String senha;
	public String nome;
	public String email;
	public Date data_nascimento;
	int[] interesses = new int[20]; // aluno diz o que se interessa no primeiro acesso
	int[] recomendações = new int[20]; // o que nos recomendamos para o aluno
	int[] metadados = new int[20]; //o que capturamos da busca do aluno
	
	//Construtores
	
	public Aluno(String senha, String nome, String email, Date data_nascimento) {
		super();
		this.nome = nome;
		this.email = email;
		this.data_nascimento = data_nascimento;
	}
	

}

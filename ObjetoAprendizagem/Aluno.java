import java.sql.Date;

//javax.persistence.OneToMany


//@Entity(name = "Aluno")
public class Aluno {
	
	//É a chave primária
	//@id
	//@GeneratedValue
	private int id;
	
	//@Column
	private String senha;
	public String nome;
	public String email;
	public Date data_nascimento;
	
	//@OneToMany(cascade = CascadeType.ALL)
	int[] interesses = new int[20]; // aluno diz o que se interessa no primeiro acesso
	
	//@OneToMany(cascade = CascadeType.ALL)
	int[] recomendações = new int[20]; // o que nos recomendamos para o aluno
	
	//@OneToMany(cascade = CascadeType.ALL)
	int[] metadados = new int[20]; //o que capturamos da busca do aluno
	
	//Construtores
	
	public Aluno(String senha, String nome, String email, Date data_nascimento) {
		super();
		this.nome = nome;
		this.email = email;
		this.data_nascimento = data_nascimento;
	}
	

}

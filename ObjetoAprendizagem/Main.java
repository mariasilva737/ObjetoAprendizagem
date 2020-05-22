import java.sql.Date;

public class Main {
	
public static void main(String[] args) {
    Aluno i = new Aluno("senha", "Jose Francisco", "aluno@aluno.br", new Date(19/05/2020));
    System.out.println("Nome: " + i.nome);
    System.out.println("CPF: " + i.email);
    System.out.println("Data de nascimento: " + i.data_nascimento.toString());
	    
        }

}

import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;

//@Entity(name = "ObjetoDeAprendizagem")
public class ObjetoDeAprendizagem {
	
	//@ManyToOne
	ArrayList<String> conteudo = new ArrayList<String> ();
	
	//@Column
	public String autor;
	public String fonte;
	
	public ObjetoDeAprendizagem(String autor, String fonte) {
		this.autor = autor;
		this.fonte = fonte;
		
	}

}

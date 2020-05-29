
//@Entity(name = "Video")
public class Video extends ObjetoDeAprendizagem{
	
	public Video(String autor, String fonte) {
		super(autor, fonte);
        
    }
	
	//@Column
    public String duracao;
    public String qualidade;

}

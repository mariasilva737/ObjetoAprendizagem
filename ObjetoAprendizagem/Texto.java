
//@Entity(name = "Texto")
public class Texto extends ObjetoDeAprendizagem{
	public Texto(String autor, String fonte) {
		super(autor, fonte);
        
    }
    public String revista;
    public int quantidadedepaginas;
    public String idioma;
    public String qualidade;

}

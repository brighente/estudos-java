
public class pessoa {
	private Integer codigo;
	private String nome;
	
	public pessoa() {
		
	}
	
	public pessoa(Integer codigo, String nome) {
		 this.codigo = codigo;
		 this.nome = nome;
	}
	
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	
	public Integer getCodigo() {
		return codigo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
}

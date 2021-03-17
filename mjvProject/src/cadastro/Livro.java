package cadastro;

public class Livro extends Produto{

	private Integer paginas;
	
	private Cadastro livro;

	public Integer getPaginas() {
		return paginas;
	}

	public void setPaginas(Integer paginas) {
		this.paginas = paginas;
	}

	public Cadastro getLivro() {
		return livro;
	}

	public void setLivro(Cadastro livro) {
		this.livro = livro;
	}
}

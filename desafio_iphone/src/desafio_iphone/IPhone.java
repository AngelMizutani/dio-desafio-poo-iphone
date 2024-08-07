package desafio_iphone;

public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
	private String nomeUsuario;
	private String numeroUsuario;
	
	
	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public String getNumeroUsuario() {
		return numeroUsuario;
	}

	public void setNumeroUsuario(String numeroUsuario) {
		this.numeroUsuario = numeroUsuario;
	}

	public String cadastrarUsuario(String nome, String numero) {
		return "Usuário " + nome + ", " + numero + " cadastrado com sucesso.";
	}

	@Override
	public void exibirPagina() {
		// TODO Auto-generated method stub
		System.out.println("Exibindo página no navegador do Iphone");
	}

	@Override
	public void adicionarNovaAba() {
		// TODO Auto-generated method stub
		System.out.println("Abrindo nova aba no navegador do Iphone");
	}

	@Override
	public void atualizarPagina() {
		// TODO Auto-generated method stub
		System.out.println("Atualizando página no navegador do Iphone");
	}

	@Override
	public void ligar(String numero) {
		// TODO Auto-generated method stub
		System.out.println("Ligando para o número " + numero + " pelo Iphone");
	}

	@Override
	public void atender() {
		// TODO Auto-generated method stub
		System.out.println("Atendendo no Iphone");
	}

	@Override
	public void iniciarCorreioVoz() {
		// TODO Auto-generated method stub
		System.out.println("Iniciando correio de voz do Iphone");
	}

	@Override
	public void tocar() {
		// TODO Auto-generated method stub
		System.out.println("Tocando música no Iphone");
	}

	@Override
	public void pausar() {
		// TODO Auto-generated method stub
		System.out.println("Pausando música no Iphone");
	}

	@Override
	public void selecionarMusica(String musica) {
		// TODO Auto-generated method stub
		System.out.println("Música selecionada no Iphone: " + musica);
	}

}

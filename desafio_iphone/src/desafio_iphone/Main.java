package desafio_iphone;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IPhone iphoneUsuario = new IPhone();
		
		iphoneUsuario.setNomeUsuario("Zelda");
		iphoneUsuario.setNumeroUsuario("123456789");
		
		String cadastro = iphoneUsuario.cadastrarUsuario(iphoneUsuario.getNomeUsuario(), iphoneUsuario.getNumeroUsuario());
		System.out.println(cadastro);
		
		iphoneUsuario.exibirPagina();
		iphoneUsuario.adicionarNovaAba();
		iphoneUsuario.atualizarPagina();
		
		iphoneUsuario.ligar("951456753");
		iphoneUsuario.atender();
		iphoneUsuario.iniciarCorreioVoz();
		
		iphoneUsuario.selecionarMusica("Bon Jovi - It's My Life");
		iphoneUsuario.tocar();
		iphoneUsuario.pausar();
		
	}

}

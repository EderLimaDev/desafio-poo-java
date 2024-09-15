package sistemaOperacional;

import sistemaOperacional.aparelhoTelefonico.AparelhoTelefonico;
import sistemaOperacional.navegadorInternet.OperaGx;
import sistemaOperacional.reprodutorMusical.MediaPlayer;

public class Mac implements AparelhoTelefonico, OperaGx, MediaPlayer {
	
	
	//Funções do Aparelho Telefonico
	private String numero;
	public String pegarNumero() {
		return numero;
	}
	public void ligar(String numero) {
		this.numero = numero;
		System.out.println("LIGANDO PARA: " + numero);
	}
	
	public void atender() {
		System.out.println("ATENDENDO CHAMADA");
	}
	public void iniciarCorreioVoz() {
		System.out.println("INICIANDO CORREIO DE VOZ");
	}
	
	
	
	//Funções do Navegador de Internet
		private String url;
		public String pegarUrl() {
			return url;
		}
		public void exibirPagina(String url) {
			this.url = url;
			System.out.println("NAVEGANDO PARA: " + url);
		}
		
		public void adicionarNovaAba() {
			System.out.println("ADICIONANDO NOVA ABA");
		}
		public void atualizarPagina() {
			System.out.println("ATUALIZANDO PÁGINA");
		}
		
		
		
		//Funções do Reprodutor Musical
		private String musica;
		public String pegarMusica() {
			return musica;
		}
		public void selecionarMusica(String musica) {
			this.musica = musica;
			System.out.println("SELECIONANDO A MÚSICA: " + musica);
		}
		
		public void tocar() {
			System.out.println("TOCANDO A MUSICA ESCOLHIDA");
		}
		public void pausar() {
			System.out.println("PAUSANDO");
		}
		
	
		
}

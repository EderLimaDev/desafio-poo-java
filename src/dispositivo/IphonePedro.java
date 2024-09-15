package dispositivo;

import sistemaOperacional.Mac;


public class IphonePedro {
	public static void main(String[] args) {
		Mac so = new Mac();	
		
		so.ligar("9915125");
		so.atender();
		so.iniciarCorreioVoz();
		
		
		so.exibirPagina("www.google.com");
		so.atualizarPagina();
		so.adicionarNovaAba();
		
		so.selecionarMusica("Nothing Else Matters");
		so.tocar();
		so.pausar();
	
	}
}

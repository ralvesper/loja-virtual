package br.optimize.loja_virtual.dominio;

public class ValidacaoLogin {
	private boolean valido;
	private String mensagem;
	public boolean isValido() {
		return valido;
	}
	public void setValido(boolean valido) {
		this.valido = valido;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
	
}

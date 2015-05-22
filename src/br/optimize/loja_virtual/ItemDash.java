package br.optimize.loja_virtual;

public class ItemDash {
	private int idImg;
	private String titulo;

	public ItemDash(int idImg, String titulo) {
		super();
		this.idImg = idImg;
		this.titulo = titulo;
	}

	public int getIdImg() {
		return idImg;
	}

	public void setIdImg(int idImg) {
		this.idImg = idImg;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

}

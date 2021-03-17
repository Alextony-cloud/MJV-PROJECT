package service;

import java.util.Date;

import cadastro.Cadastro;

public abstract class TransmissorMensagem {
	
	private Date data;
	protected Cadastro destinatario;

	abstract void enviar(String mensagem);

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
}

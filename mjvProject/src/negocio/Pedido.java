package negocio;

import java.util.Date;

import cadastro.Cadastro;

public class Pedido {
	
	private Integer id;
	private Date data;
	private Double valoTotal;
	private PedidoItem itens;
	private Cadastro cliente;
	
	public Cadastro getCliente() {
		return cliente;
	}
	public void setCliente(Cadastro cliente) {
		this.cliente = cliente;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Double getValoTotal() {
		return valoTotal;
	}
	public void setValoTotal(Double valoTotal) {
		this.valoTotal = valoTotal;
	}
	public PedidoItem getItens() {
		return itens;
	}
	public void setItens(PedidoItem itens) {
		this.itens = itens;
	}

}

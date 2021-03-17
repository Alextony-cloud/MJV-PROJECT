package exercicioMjv;

import java.util.Date;

public abstract class TransmissorMensagem {
	
	Date data;

	abstract void enviar(String mensagem);
}

/*Crie um sistema que permita o cadastro de an�ncios. O an�ncio dever� conter os seguintes dados:
	nome do an�ncio
	cliente
	data de in�cio
	data de t�rmino
	investimento por dia
		
	O sistema fornecer� os relat�rios de cada an�ncio contendo:
	valor total investido
	quantidade m�xima de visualiza��es
	quantidade m�xima de cliques
	quantidade m�xima de compartilhamentos
	Os relat�rios poder�o ser filtrados por intervalo de tempo e cliente.
	*/
package segundoDesafio;
	
public class Anuncio {
	String nomeDoAnuncio;
	String cliente;
	String dataDeInicio;
	String dataDeTermino;
	Float investimentoDiario;
	
	
	public String getNomeDoAnuncio() {
		return nomeDoAnuncio;
	}
	public void setNomeDoAnuncio(String nomeDoAnuncio) {
		this.nomeDoAnuncio = nomeDoAnuncio;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public String getDataDeInicio() {
		return dataDeInicio;
	}
	public void setDataDeInicio(String dataDeInicio) {
		this.dataDeInicio = dataDeInicio;
	}
	public String getDataDeTermino() {
		return dataDeTermino;
	}
	public void setDataDeTermino(String dataDeTermino) {
		this.dataDeTermino = dataDeTermino;
	}
	public Float getInvestimentoDiario() {
		return investimentoDiario;
	}
	public void setInvestimentoDiario(Float investimentoDiario) {
		this.investimentoDiario = investimentoDiario;
	}
	
	

}

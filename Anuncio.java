/*Crie um sistema que permita o cadastro de anúncios. O anúncio deverá conter os seguintes dados:
	nome do anúncio
	cliente
	data de início
	data de término
	investimento por dia
		
	O sistema fornecerá os relatórios de cada anúncio contendo:
	valor total investido
	quantidade máxima de visualizações
	quantidade máxima de cliques
	quantidade máxima de compartilhamentos
	Os relatórios poderão ser filtrados por intervalo de tempo e cliente.
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

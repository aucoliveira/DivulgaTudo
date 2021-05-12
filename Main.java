package segundoDesafio;
import java.util.ArrayList;
import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Anuncio> cadastroDeAnuncio = new ArrayList<Anuncio>();
		
		
		
		int opcao=0;
		do {
			
			imprimeTraco();
			imprimeSaltaLinha("Digite:\n 1 - Para cadastrar um novo anuncio;\n 2 - Para listar os anuncios já cadastrados;"
					+ "\n 3 - Para gerar relatório; \n 4 - Sair; ");
			opcao = scanner.nextInt();
			switch(opcao) {
				case 1:
					imprimeTraco();
					imprimeSaltaLinha("Realize o cadastro do anuncio logo abaixo: ");
					imprimeTraco();
					Anuncio anuncio = new Anuncio();
					recebe("",scanner);
					anuncio.setNomeDoAnuncio(recebeString("Digite o nome do anuncio: ", scanner));
					anuncio.setCliente(recebeString("Digite o nome do cliente: ", scanner));
					anuncio.setDataDeInicio(recebeString("Digite a data inicial contendo apenas números no formado dia, mês e ano,ex:01052021: ", scanner));
					anuncio.setDataDeTermino(recebeString("Digite a data de termino contendo apenas números no formado dia, mês e ano,ex:01052021: ", scanner));
					anuncio.setInvestimentoDiario(recebeFloat ("Digite o valor de investimento diário", scanner));
					cadastroDeAnuncio.add(anuncio);
					imprimeTraco();
					break;
				case 2:
					imprimeTraco();
					imprimeSaltaLinha("Listagem de anuncios: ");
					imprimeTraco();
					for(int i = 0; i < cadastroDeAnuncio.size(); i++) {
			            System.out.println(i+"-"+((Anuncio) cadastroDeAnuncio.get(i)).getNomeDoAnuncio());
			            imprimeTraco();
					}
					break;
				case 3:
					imprimeTraco();
					imprimeSaltaLinha("Escolha qual anuncio quer gerar relatório: ");
					imprimeTraco();
					
					for(int i = 0; i < cadastroDeAnuncio.size(); i++) {
			            System.out.println(i+"-"+((Anuncio) cadastroDeAnuncio.get(i)).getNomeDoAnuncio());
			            imprimeTraco();
					}
					imprimeTraco();
					imprimeNaMesmaLinha("digite a o anuncio escolhido: ");
					int escolha = scanner.nextInt();
					System.out.println("Nome do Anuncio: "+((Anuncio) cadastroDeAnuncio.get(escolha)).getNomeDoAnuncio());
					System.out.println("Nome do Cliente: "+((Anuncio) cadastroDeAnuncio.get(escolha)).getCliente());
					System.out.println("Data de inicio: "+((Anuncio) cadastroDeAnuncio.get(escolha)).getDataDeInicio());
					System.out.println("Data de termino: "+((Anuncio) cadastroDeAnuncio.get(escolha)).getDataDeTermino());
					System.out.println("Investimento diário: "+((Anuncio) cadastroDeAnuncio.get(escolha)).getInvestimentoDiario());
		            imprimeTraco();
		            imprimeNaMesmaLinha("Digite  a quantidade de dias para gerar relatório: ");
		            Integer dia = scanner.nextInt();
		            imprimeTraco();
		            calculadoraDeAlcanceDeAnuncio(((Anuncio) cadastroDeAnuncio.get(escolha)).getInvestimentoDiario(),dia);
					break;
				case 4:
					imprimeTraco();
					imprimeSaltaLinha("Saindo do menu, obrigado.");
					imprimeTraco();
					break;
				default:
					imprimeTraco();
					imprimeSaltaLinha("Opção invalida.");
					break;
					
			}
		
		}while(!(opcao ==4));
		
		scanner.close();

	}
	static void imprimeNaMesmaLinha(String texto){
		System.out.print(texto);
	}
	static void imprimeSaltaLinha(String texto) {
		System.out.println(texto);
	}
	static void imprimeTraco() {
		System.out.println("---------------------------------");
	}
	static String recebeString(String texto,Scanner scanner) {
		imprimeNaMesmaLinha(texto);
		String recebe = scanner.nextLine();
		return recebe;
	}
	static String recebe(String texto, Scanner scanner) {
		String recebe = scanner.nextLine();
		return recebe;
	}
	static Float recebeFloat(String texto,Scanner scanner) {
		imprimeNaMesmaLinha(texto);
		Float recebe = scanner.nextFloat();
		return recebe;
	}
	
	static void calculadoraDeAlcanceDeAnuncio(Float valorInvestido, Integer dia) {
		
		Integer visualizacao = (int)(valorInvestido *30);
		Integer compartilhamento = (int)(valorInvestido*40);
		Integer clicam = 0;
		
		
		for(int i =0; i<2; i++) {
					
					if(visualizacao >100) {
						clicam =12;
						if(visualizacao >=200) {
							clicam = clicam *(visualizacao/100) ;
						}
					}
					if(clicam>= 20) {
						compartilhamento = compartilhamento +3*(clicam/20);
						visualizacao = visualizacao +3*40*(clicam/20);
					}
				}
		System.out.println("O total de visualização: " +visualizacao*dia);
		System.out.println("O total de cliques: " +clicam*dia);
		System.out.println("O total de compartilhamento: " +compartilhamento*dia);
	
}
}

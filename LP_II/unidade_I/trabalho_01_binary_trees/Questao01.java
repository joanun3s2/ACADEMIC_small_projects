import java.util.ArrayList;
import java.util.Scanner;

public class Questao01 {

	public static void desvioPadrao(double conjunto[]) {
		double soma = 0.0; // soma dos elementos
	    double desvioPadrao = 0.0; // desvio padrão
	    int tam = conjunto.length; // tamanho dos dados
	 
	    // vamos somar todos os elementos
	    for(int i = 0; i < tam; i++){
	      soma = soma + conjunto[i];
	    }
	 
	    // agora obtemos a média do conjunto de dados    
	    double media = soma / tam;
	 
	    // e finalmente obtemos o desvio padrão
	    for(int i = 0; i < tam; i++){
	      desvioPadrao = desvioPadrao + Math.pow(conjunto[i] - media, 2);
	    }
	     
	    // Calculamos o Desvio Padrao Amostral e limitamos a 4 casas decimais
	    String mediaString = String.format("%.4f", media);
	    String desvPadAm = String.format("%.4f", Math.sqrt(desvioPadrao / tam));
	    
	    // mostramos o resultado
	    System.out.println("Média: " + mediaString);
	    System.out.println("Desvio Padrão Amostral: " + desvPadAm);
	  
	  }
	
	public static void main(String args[]){
		
		System.out.println("Questao 01 - Media e Desvio padrao formal");
		System.out.println("Digite 5 valores para calcular média e o desvio padrão amostral (separados por espaço):");
		
		// Lê entrada do usuario
		Scanner tec = new Scanner(System.in);
		String input = tec.nextLine();
		String[] arrayValores = input.split(" ");
		
		// Cria lista double e converte as strings
		double valores[] = {0, 0, 0, 0, 0};
		int i=0;
		for(String valor : arrayValores) {
			valores[i] = Double.parseDouble(valor);
			i++;
		}
		
		desvioPadrao(valores);
		
	}
	
}

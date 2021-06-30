import java.util.ArrayList;
import java.util.Scanner;

public class Questao04 {

public static double equacaoRecursiva(ArrayList<Double> valores, int index, int n, double soma1, double soma2) {
		
		if(index < 0) {
			double bloco1 = (soma1/n);
			double bloco2 = Math.pow((soma2/n), 2);
			double result = Math.sqrt((bloco1 - bloco2));
			
			return result;
		}
		
		double valor1 = Math.pow(valores.get(index), 2);
		double valor2 = valores.get(index);
		
		return equacaoRecursiva(valores, index-1, n, soma1+valor1, soma2+valor2);
	}
	
	public static void main(String[] args) {
        
		System.out.println("Questao 04 - Equacao por recursao em cauda");
		System.out.println("Digite uma sequencia de valores (separados por espaço)");
		
		// Recebe a entrada do usuario
		Scanner tec = new Scanner(System.in);
		String input = tec.nextLine();
		
		String[] arrayValores = input.split(" ");
		ArrayList<Double> valores = new ArrayList<>();
		
		// Passa os valores para um array
		for(String valor : arrayValores) {
			valores.add(Double.parseDouble(valor));
		}
		
		double media = equacaoRecursiva(valores, valores.size()-1, valores.size(), 0, 0);
		
		System.out.println("O resultado da expressão é: " + media);
		
	}
	
}

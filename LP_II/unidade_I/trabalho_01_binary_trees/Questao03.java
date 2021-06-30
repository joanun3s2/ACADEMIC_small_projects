import java.util.ArrayList;
import java.util.Scanner;

public class Questao03 {

	private double mediaRecursiva(ArrayList<Double> valores, int index, int quant, double soma) {
		
		if(index < 0) {
			return (soma/quant);
		}
		
		double valor = valores.get(index);
		
		return mediaRecursiva(valores, index-1, quant, soma+valor);
	}
	
	public static void main(String[] args) {
        
		System.out.println("Questao 03 - Media por recursao (non-static)");
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
		
		double media = new Questao03().mediaRecursiva(valores, valores.size()-1, valores.size(), 0);
		
		System.out.println("A media calculada é: " + media);
		
	}
}

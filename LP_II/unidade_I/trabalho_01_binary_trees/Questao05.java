import java.util.Scanner;

public class Questao05 {

	public static void main(String [] args) {
	
		System.out.println("Questao 05 - Armazenar digitos da matricula \n ");
		System.out.println("Criando arvore com a matricula 20180120067.. \n");
		
		int matricula[] = {2, 0, 1, 8, 0, 1, 2, 0, 0, 6, 7};
		
		Tree tree = new Tree(matricula);
		
		System.out.println("Imprimindo arvore usando metodo 'inOrder':");
		tree.inOrder();
	
	}
	
}


public class Questao09 {

	public static void main(String[] args) {
		
		System.out.println("Questao 09 - Arvore com nos de n filhos \n");
		System.out.println("Criando uma arvore com a raiz de valor 6 e 6 filhos.. \n");
		
        TreeN treen = new TreeN(6, 6);

        System.out.println("Imprindo node raiz(0) e os 6 filhos:");
        
        treen.levelOrder();
    }

}

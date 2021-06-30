public class Questao07 {

	public static void main(String[] args){
		
		System.out.println("Questao 07 - Override do metodo 'equals' \n");
		System.out.println("Criando duas arvores iguais e comparando.. \n");
		
		Tree tree = new Tree();
		Tree tree2 = new Tree();
		
		if(tree.equals(tree2))
			System.out.println("As arvores sao iguais!");
		else
			System.out.println("As arvores NAO sao iguais!");
	}
}
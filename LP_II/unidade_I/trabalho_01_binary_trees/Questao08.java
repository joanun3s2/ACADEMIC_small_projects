import java.io.File;

public class Questao08 {

	public static void busca(File arquivo, String busca) {
		
        if(arquivo.isDirectory()){
        	
            File[] arquivos = arquivo.listFiles();
            for(File f : arquivos){
                busca(f, busca);
            }
            
        }else{
        	
            String nome = arquivo.getName();
            if(nome.equals(busca)){
                System.out.println("O arquivo procurado foi encontrado: " + nome);
            } 
        }

	}
	
	public static void main(String [] args) {
		
		System.out.println("Questao 08 - Busca de arquivo \n");
		System.out.println("Buscando por arquivo Questao08.java.. \n");
		
		File arquivo = new File("Questao08.java");
        String busca  = "Questao08.java";
        busca(arquivo, busca);
        
    }

}

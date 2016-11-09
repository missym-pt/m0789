package d09112016;

public class Exercicio_maf3 {
	// com as medidas de tres modelos fornecidas cria um programa junte todas as medidas num unico array e as imprima.
	
	//int[] lara = {86, 60, 86}; 
	//int[] joana = {87, 64, 90};
	//int[] irina = {90, 57, 89}; 
	
	//com este programa pretende-se praticar a atribuição de elementos a um array e o loop for.
	
	//facil
	public Exercicio_maf3() {
		
		int[] lara = {86, 60, 86}; 
		int[] joana = {87, 64, 90};
		int[] irina = {90, 57, 89};
		
		int[][] medidasModelos = new int[3][3];
		
		medidasModelos[0]= lara;
		medidasModelos[1]= joana;
		medidasModelos[2]= irina;
		
		System.out.println("As medidas no array são: ");
		
		for (int i=0; i<medidasModelos.length; i++){
			for (int j=0; j<3; j++){
				
				System.out.println(medidasModelos[i][j]);
			}
			
		}
		
		
	}

}

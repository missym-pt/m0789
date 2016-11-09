package d09112016;

public class Treino_arrays {

	public Treino_arrays() {

		//Nº de golos num jogo Porto-Benfica
		//começamos com tipo de variável[] nome da variável = inicializar variável
		int[] golos = new int[2];
		
		//atribuir variáveis ao array
		
		golos[0]=1;
		
		golos[1]=1;
		
		//Instanciação com inicialização de variáveis
		
		int[] portoBenfica = {1, 1};
		
		int[] sportingArouca = {3, 0};
		
		int[] maritimoBraga = {0, 1};
		
		int[][] jogosGrandes = new int[2][3];
		
		jogosGrandes[0][0]=portoBenfica[0];
		jogosGrandes[1][0]=portoBenfica[1];
		jogosGrandes[0][1]=sportingArouca[0];
		jogosGrandes[1][1]=sportingArouca[1];
		jogosGrandes[0][2]=maritimoBraga[0];
		jogosGrandes[1][2]=maritimoBraga[1];
		
		System.out.println(jogosGrandes[0][1]);
		
		
		
		
	}

}

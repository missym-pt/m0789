package d09112016;

public class Treino_arrays {

	public Treino_arrays() {

		//N� de golos num jogo Porto-Benfica
		//come�amos com tipo de vari�vel[] nome da vari�vel = inicializar vari�vel
		int[] golos = new int[2];
		
		//atribuir vari�veis ao array
		
		golos[0]=1;
		
		golos[1]=1;
		
		//Instancia��o com inicializa��o de vari�veis
		
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

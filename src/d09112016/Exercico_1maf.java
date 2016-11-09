package d09112016;

import java.util.Scanner;

public class Exercico_1maf {
		//cria um programa que mediante uma tabela de notas de 20 alunos existe, determine a percentagem de notas positivas e negativas .
	    //Com este exercicio pretende-se que o formando exercite o loop for e o condicional if sobre arrays
		//dificil
	    
	public Exercico_1maf() {

		int auxpos = 0;
		int auxneg = 0;
		int positivas_perc = 0;
		int negativas_perc = 0;
		
		int[] notasTurma = {10, 11, 20, 16, 8, 12, 9, 15, 14, 13, 0, 12, 11, 10, 17, 18, 14, 16, 12, 11};
		/*int[] notasTurma = new int[20];
				for (int i=0; i <20; i++)
					notasTurma[i] = i;
		*/
		
		for (int i = 0; i < notasTurma.length; i++) {
			if (notasTurma[i] >= 10) {

				auxpos++;
			//	System.out.println(auxpos);
				// System.out.println(notasTurma[i] );
				positivas_perc = (auxpos * 100) / notasTurma.length;

			} else {
				auxneg++;
				negativas_perc = (auxneg * 100) / notasTurma.length;
			}
		}
		
		System.out.println("A percentagem das notas positivas e " + positivas_perc + ". A percentagem de notas negativas e " + negativas_perc );
		}
			
	}



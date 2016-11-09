package d09112016;

import java.util.Scanner;

//Efetua um programa que indica a media de idades do teu agregado familiar utilizando arrays (recebe as idades para um array e calcula a media apartir dessesvalores armazenados)
//Com este exercicio pretende-se que o formando aplique os seus conhecimentos acerca de arrays e ciclos
//Grau médio

public class Exercicio_2maf {
 
	public Exercicio_2maf() {
		
		int x = 0;
		int t = 0;
		int soma=0;
		int media=0;
		
		System.out.println("Qual o número de elementos do teu agregado familiar? ");
		
		x = (new Scanner(System.in)).nextInt();
		
		int[] idadesAgregado = new int[x];		
		
		while (t<x){
			
			System.out.println("Indica a idade do " + (t+1) +"º elemento");
			idadesAgregado[t] = (new Scanner(System.in)).nextInt();
			t++;
		}
		
		for (int i=0; i<x; i++){
			soma+=idadesAgregado[i];
		}
		
		    media=soma/x;
		    System.out.println("A media de idades do agregado familiar são " + media + " anos.");
		
		}
	
	}


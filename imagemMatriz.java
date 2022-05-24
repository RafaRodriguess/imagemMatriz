package Matriz;

import java.util.Scanner;

public class imagemMatriz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// contadores e matriz 16x16 declarados
		int i, j, matriz_imagem[][] = new int[16][16];
		// repetição informando a linha
		for (i = 0; i < 16; i++) {
			// printando a linha em que está a receber
			System.out.printf("Informe os valores da linha %d\n", i + 1);
			// repetição informando a linha em que está recebendo
			for (j = 0; j < 16; j++) {
				// printando qual linha e coluna a ser recebida nas posições
				System.out.printf("Digite o valor da posição da matriz[%d][%d]: ", i, j);
				// recebendo os valores das colunas
				matriz_imagem[i][j] = sc.nextInt();
			}
			// quebra de linha
			System.out.println();
		}
		// repetição para printar as linhas e colunas
		// primeiro for para contagem da linha
		for (i = 0; i < 16; i++) {
			// segundo for para contagem da coluna juntamente com a linha no for anterior
			for (j = 0; j < 16; j++) {
				// printando valores dentro do vetorna nas posições
				System.out.printf("%d ", matriz_imagem[i][j]);
			}
			// quebra de linha
			System.out.println();
		}
		// fechando scanner
		sc.close();
	}
}

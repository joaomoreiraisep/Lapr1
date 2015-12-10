package grupo8_1dg_projeto;

import java.util.Scanner;

/**
 *
 * @author Bruno Silva
 * @author Ana Leite
 * @author Ricardo Osório
 * @author João Moreira
 */
public class Grupo8_1DG_projeto {

    public static void main(String[] args) {

    }
    

    public static int pivo(int[][] Matriz) {
        Scanner ler = new Scanner(System.in);
        int[] vec = new int[4];
        int coluna = 0;
        int linha = 0;
        int aux = 0;
        int n = 0;
        int a = 0;  

        for (int i = 0; i < Matriz.length - 1; i++) {
            for (int j = i + 1; j < Matriz.length; j++) {
                if (Matriz[0][i] > Matriz[0][j]) {
                    coluna = j;
                }
            }
        }      
        for (int h = 0; h < Matriz.length; h++) {
            a = Matriz[h][Matriz[0].length - 1] / Matriz[h][coluna];
            if (n == 0 && a > 0) {
                aux = a;
                linha = h;
                n++;
            } else if (n != 0 && a < aux) {
                aux = a;
                linha = h;
            }
        }
        return Matriz[linha][coluna];
    }
}

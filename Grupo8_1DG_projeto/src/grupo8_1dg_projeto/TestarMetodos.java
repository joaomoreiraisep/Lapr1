package grupo8_1dg_projeto;

/**
 *
 * @author Bruno Silva
 * @author Ana Leite
 * @author Ricardo Osório
 * @author João Moreira
 */
public class TestarMetodos {

    public static Boolean testepivo(int[][] Matriz) {
        int teste = Grupo8_1DG_projeto.pivo(Matriz);
        if (teste > 0){
            return true;
        }else{
            return false;
        }
    }
}

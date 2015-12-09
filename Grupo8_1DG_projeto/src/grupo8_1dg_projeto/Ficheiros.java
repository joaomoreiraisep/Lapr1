package grupo8_1dg_projeto;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Ficheiros {
    
    public static Scanner fileLeitura() throws FileNotFoundException{
        Scanner file=new Scanner(new File("Ficheiro.txt"));
        return file;
    }
    
    public static int numeroCondicoes(Scanner file){
        String line;
        int numLinhas=0;
        while(file.hasNext()){
            line=file.nextLine();
            numLinhas++;
        }
        return numLinhas;
    }
    
    //para já assume que o Z nunca vai ter um coeficiente diferente de 1
    public static void LerFicheiroParaMatriz(Scanner file, int [][]Matriz) {
        String linha[];
        int contLinha=0;
        while(file.hasNext()){
            linha=file.nextLine().trim().split("X");
            if(linha.length==3){                                                //verifica que tem as duas variaveis
                if(contLinha==0){                                               //primeira linha é a diferente
                    if(!linha[0].replace("Z", "").replace("=", "").replaceAll(" ", "").isEmpty()){
                    Matriz[0][1]=Integer.parseInt(linha[0].replace("Z", "").replace("=", "").replaceAll(" ", ""))*-1;
                    }else{
                    Matriz[0][1]=-1;
                    }
                    if(!linha[1].replaceFirst("1", "").replace("+", "").replaceAll(" ", "").isEmpty()){
                    Matriz[0][2]=Integer.parseInt(linha[1].replaceFirst("1", "").replace("+", "").replaceAll(" ", ""))*-1;
                    }else{
                    Matriz[0][2]=-1;
                    }
                }else{                                                          //outras linhas
                    if(!linha[0].isEmpty()){
                        Matriz[contLinha][1]=Integer.parseInt(linha[0]);
                    }else{
                        Matriz[contLinha][1]=1;
                    }
                    if(linha[1].replaceFirst("1", "").replaceAll(" ", "").replace("+", "").isEmpty()){
                        Matriz[contLinha][2]=1;
                    }else{
                        Matriz[contLinha][2]=Integer.parseInt(linha[1].replaceFirst("1", "").replaceAll(" ", "").replace("+", ""));
                    }
                    if(!linha[2].replaceFirst("2", "").replaceAll(" ", "").replace("<=", "").isEmpty()){
                        Matriz[contLinha][6]=Integer.parseInt(linha[2].replaceFirst("2", "").replaceAll(" ", "").replace("<=", ""));
                    }else{
                        Matriz[contLinha][6]=1;
                    }
                }
            }
            contLinha++;                                                        //pode variar,pode ter uma condição, duas, tres, etc
        }
    }
}

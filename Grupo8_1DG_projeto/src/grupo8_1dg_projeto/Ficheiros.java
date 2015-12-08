package grupo8_1dg_projeto;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Ficheiros {
    
    public static Scanner fileLeitura() throws FileNotFoundException{
        Scanner file=new Scanner(new File("Ficheiro.txt"));
        return file;
    }
    
    public static int LerFicheiro(Scanner file) {
        String line;
        int contPag=0;
        while(file.hasNext()){
            contPag++;
            line=file.nextLine();
            //vou aqui
        }
        return contPag;
    }
    
}

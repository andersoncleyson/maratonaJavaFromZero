package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {
        CriarNovoArquivo();
    }

    private static void CriarNovoArquivo(){
        File file = new File("arquivo/teste.txt");
        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado "+ isCriado);

        }catch (IOException e){
            e.printStackTrace();
        }

    }
}

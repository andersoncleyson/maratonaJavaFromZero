package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import java.io.*;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {

    }

    public static void lerArquivo(){
        Reader reader = null;

        try {
            reader = new BufferedReader(new FileReader("test.txt"));

        } catch (FileNotFoundException e) {

            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException exception) {
                exception.printStackTrace();
            }
        }

    }
}

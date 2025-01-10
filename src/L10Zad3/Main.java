package L10Zad3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        int bajt;

        try(
                FileInputStream fis = new FileInputStream("src/L10Z3/plik.txt");
                FileOutputStream fos = new FileOutputStream("src/L10Z3/plikDoZapisu.txt")
        ){
            do {
                bajt = fis.read();
                if (bajt !=-1) System.out.println((char) bajt);
                if ( Character.isWhitespace( (char) bajt ) && bajt !=-1){
                    fos.write('-');
                }
                else if( bajt !=-1){
                    fos.write(bajt);
                }
            } while (bajt != -1);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

package L10Zad5;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean znaj = true;
        String c;

        System.out.println("Wprowadź 3 cyfry jakiegoś konta.");
        c = br.readLine();
        System.out.println("Podane 3 cyfry konta: " + c);

        br = new BufferedReader(new FileReader("src/L10Zad5/plewibnra.txt"));

        do {
            String line = br.readLine();
            if (line != null && line.trim().startsWith(c)){
                System.out.println(line);
                znaj = false;
            }
            else if(line == null){
                System.out.println("Nie znaleziono takiego konta");
                break;
            }
        } while (znaj);



//        try(FileReader fr = new FileReader("plewibnra.txt")){
//            do {
//                fr.read();
//            } while (fr.read() != -1);
//        } catch (Exception e) {
//            System.out.println("Coś poszło nie tak");
//            System.out.println(e);
//        }

    }
}

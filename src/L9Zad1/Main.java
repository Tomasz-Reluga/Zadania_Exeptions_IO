package L9Zad1;

public class Main {

    public static void main(String[] args) {
        NullPointerClass nullPointerClass = new NullPointerClass();

        try {
            nullPointerClass.nullPointerMethod();
        } catch (Exception e) {
            System.out.println("Coś poszło nie tak!");
            System.out.println("PrintStackTrace: ");
            e.printStackTrace();
            System.out.println(e);
        }
    }
}

package L9Zad3;

public class NotEnoughMoneyExecption extends Exception{
    int balance, kwota;

    public NotEnoughMoneyExecption(int balance, int kwota) {
        this.balance = balance;
        this.kwota = kwota;
    }

    @Override
    public String toString(){
        return "Środki na koncie są niewystarczające aby wykonać przelew";
    }
}

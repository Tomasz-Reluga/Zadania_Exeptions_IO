package L9Zad3;

public class Account {
    private int balance;
    private String owner, accountNumber;

    public Account(String owner, int balance, String accountNumber) {
        this.owner = owner;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void przelew(int kwota, String numberKontaDocelowego){

        try {
            if(kwota > this.getBalance()){
                throw new NotEnoughMoneyExecption(this.getBalance(), kwota);
            }
            else{
                System.out.println("Przelew został wykonany!");
            }
        } catch (NotEnoughMoneyExecption e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println("Wszystkie inne wyjątki");
        } finally {
            System.out.println("Aktualny stan konta: " + this.getBalance());
        }

    }

}

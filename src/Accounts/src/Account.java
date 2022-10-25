import java.util.List;

public abstract class Account implements AccountInterface{

    private static int sequence = 1;
    private final int agency;
    protected int number;
    protected Double balance;
    protected Client client;

    public Account(Client client) {
        this.agency = Bank.getAgency();
        this.number = sequence++;
        this.balance = 0.0;
        this.client = client;
        Bank.clients.add(client);
    }

    public void withdraw(double value){
        if (value > this.balance)
            throw new IllegalArgumentException("The balance must be higher than the value that you wish to withdraw.");
        this.balance = this.balance - value;
    }

    public void deposit(double value){
        if (value <= 0)
            throw new IllegalArgumentException("The deposit value must be more than zero.");
        this.balance = this.balance + value;
    }

    public void transfer(double value, Account account){
        this.withdraw(value);
        account.deposit(value);
    }

    @Override
    public void statement() {
        System.out.printf(String.format("Agency: %d\n", this.agency));
        System.out.printf(String.format("Number: %d\n", this.number));
        System.out.printf(String.format("Balance: %.2f\n", this.balance));
        System.out.printf(String.format("Account Owner: %s\n", this.client.getName()));
    }

    public int getAgency() {
        return agency;
    }

    public int getNumber() {
        return number;
    }

    public Double getBalance() {
        return balance;
    }
}

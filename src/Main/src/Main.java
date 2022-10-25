public class Main {
    public static void main(String[] args) {
        Client client = new Client("Carlos", "Melo");
        Account ca = new CheckingAccount(client);
        Account sa = new SavingsAccount(client);

        ca.deposit(100);
        ca.transfer(80, sa);

        sa.statement();
        ca.statement();

        Bank.showClients();
    }
}

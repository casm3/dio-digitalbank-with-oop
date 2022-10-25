public class SavingsAccount extends Account{
    public SavingsAccount(Client client) {
        super(client);
    }

    @Override
    public void statement() {
        System.out.println("=== Savings Account Statement ===");
        super.statement();
    }
}

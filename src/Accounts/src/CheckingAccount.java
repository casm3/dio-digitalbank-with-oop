public class CheckingAccount extends Account {

    public CheckingAccount(Client client) {
        super(client);
    }

    @Override
    public void statement() {
        System.out.println("=== Checking Account Statement ===");
        super.statement();
    }
}

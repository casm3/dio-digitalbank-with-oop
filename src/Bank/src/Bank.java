import java.util.ArrayList;
import java.util.List;

public class Bank {
    private static final int DEFAULT_AGENCY = 1;
    private static final String DEFAULT_NAME = "MyBank";
    private String name;
    protected static int agency = DEFAULT_AGENCY;

    protected static List<Client> clients = new ArrayList<Client>();

    public Bank() {
        this.name = DEFAULT_NAME;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getAgency() {
        return Bank.agency;
    }

    public void setAgency(int agency) {
        Bank.agency = agency;
    }

    public static void showClients(){
        for(Client client : clients){
            System.out.println(client.getName());
        }
    }
}

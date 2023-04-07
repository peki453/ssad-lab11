public interface Bank {
    void withdrawMoney(String clientName, int amount);
    void depositMoney(String clientName, int amount);
}

public class RealBank implements Bank {
    @Override
    public void withdrawMoney(String clientName, int amount) {
        // Withdraw money from the client's account
        System.out.println("Withdrawing $" + amount + " from " + clientName + "'s account");
    }

    @Override
    public void depositMoney(String clientName, int amount) {
        // Deposit money into the client's account
        System.out.println("Depositing $" + amount + " into " + clientName + "'s account");
    }
}

public class BankClient {
    private String name;
    private Bank bank;

    public BankClient(String name, Bank bank) {
        this.name = name;
        this.bank = bank;
    }

    public void withdrawMoney(int amount) {
        bank.withdrawMoney(name, amount);
    }

    public void depositMoney(int amount) {
        bank.depositMoney(name, amount);
    }
}

public class Main {
    public static void main(String[] args) {
        Bank bank = new RealBank();
        BankClient client = new BankClient("John", bank);

        client.depositMoney(500);
        client.withdrawMoney(200);
    }
}

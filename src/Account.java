public class Account {
    private int accountNumber = 0;
    private String agency = "";
    private String name = "";
    private double balance = 0.0;

    public void setAccountNumber(int newAccoountNumber) {
        if (this.accountNumber == 0) {
            this.accountNumber = newAccoountNumber;
        }
    }

    public void setAgency(String newAgency) {
        if (this.agency == "") {
            this.agency = newAgency;
        }
    }

    public void setName(String newName) {
        if (this.name == "") {
            this.name = newName;
        }
    }

    public void deposit(double value) {
        this.balance += value;
    }

    public void toWithdraw(double value) {
        if (this.balance >= value) {
            this.balance -= value;
        } else {
            System.out.println("Saldo Indisponível.");
        }
    }

    public String getName() {
        return this.name;
    }

    public int getNumber() {
        return this.accountNumber;
    }

    public String getAgency() {
        return this.agency;
    }

    public double getBalance() {
        return this.balance;
    }
}

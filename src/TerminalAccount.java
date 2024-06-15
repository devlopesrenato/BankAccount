import java.util.Locale;
import java.util.Scanner;

public class TerminalAccount {
    public static void main(String[] args) {
        Account account = new Account();
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome:");
        String name = scanner.next();
        account.setName(name);

        System.out.println("Digite a agencia da conta:");
        String agency = scanner.next();
        account.setAgency(agency);

        System.out.println("Digite o numero da conta:");
        int accountNumber = scanner.nextInt();
        account.setAccountNumber(accountNumber);

        System.out.println("Digite o valor do primeiro deposito:");
        double initialBalance = scanner.nextDouble();
        account.deposit(initialBalance);

        System.out.println("Olá " + account.getName()
                + ", obrigado por criar uma conta em nosso banco, sua agência é " + account.getAgency()
                + ", conta " + account.getNumber() + " e seu saldo R$ " + account.getBalance()
                + " já está disponível para saque");
    }
}

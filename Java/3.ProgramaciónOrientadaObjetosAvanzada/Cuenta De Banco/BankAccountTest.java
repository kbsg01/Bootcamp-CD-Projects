public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount usuario1 = new BankAccount();
        BankAccount usuario2 = new BankAccount();
        BankAccount usuario3 = new BankAccount();

        usuario1.depositoCuenta("Ahorros", 500.00);
        usuario1.depositoCuenta("Corriente", 500.00);
        usuario2.depositoCuenta("Corriente", 50.00);
        usuario2.depositoCuenta("Ahorros", 650.00);
        usuario3.depositoCuenta("Corriente", 1000.00);
        usuario3.depositoCuenta("Ahorros", 1500.00);
        usuario1.retiroCuenta("Ahorros", 200.00);
        usuario1.retiroCuenta("Corriente", 150.00 );
        usuario2.retiroCuenta("Ahorros", 50.00);
        usuario2.retiroCuenta("Corriente", 100.00);
        usuario3.retiroCuenta("Ahorros", 500.00);
        usuario3.retiroCuenta("Corriente)", 450.00);

        usuario1.miBalance();
        usuario2.miBalance();
        usuario3.miBalance();
    }
}
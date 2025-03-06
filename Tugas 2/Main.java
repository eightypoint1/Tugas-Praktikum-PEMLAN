public class Main {
    public static void main(String[] args) {
        // Instansiasi dua objek
        BankAccount akun1 = new BankAccount("Rekening1", "Orang1");
        BankAccount akun2 = new BankAccount("Rekening2", "Orang2",50);


        akun1.displayInfo();
        akun2.displayInfo();

        akun1.withdraw(20);
        akun1.deposit(0);
        akun1.deposit(50);
        akun1.withdraw(20);
        akun1.displayInfo();
    }
}

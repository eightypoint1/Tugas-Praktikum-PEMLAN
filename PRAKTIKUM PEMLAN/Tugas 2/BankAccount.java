// Pembuatan Class BankAccout 
public class BankAccount {
    // Data Field
    String noRek;
    String namaPemilik;
    double saldo;

    // Constructor No Arg
    BankAccount(){}

    // Constructor 3 Arg: noRek, namaPemilik, saldo
    BankAccount(String noRek, String namaPemilik, double saldo) {
        this.noRek = noRek;
        this.namaPemilik = namaPemilik;
        this.saldo = saldo;
    }

    // Constructor 2 Arg: noRek, namaPemilik, saldo default value: 0.0
    BankAccount(String noRek, String namaPemilik) {
        this.noRek = noRek;
        this.namaPemilik = namaPemilik;
        this.saldo = 0;
    }

    // method displayInfo: Menunjukan info rekening (noRek, namaPemilik, saldo)
    public void displayInfo() {
        System.out.println("\nNomor rekening: " + noRek);
        System.out.println("Nama Pemilik: " + namaPemilik);
        System.out.println("Saldo: " + saldo +"\n");
    }

    // method deposit: menambahkan uang ke dalam saldo
    public void deposit(double nominal) {
        // Jika nominal kurang atau sama dengan 0, maka deposit tidak dapat terjadi
        if (nominal <= 0) {
            System.out.println("Nominal deposit harus lebih dari 0!\n");
            return;
        }

        saldo += nominal;
        System.out.println("Deposit Berhasil!");
        System.out.println("Saldo: " + saldo + "\n");
    }

    // method withdraw: mengambil uang dari saldo
    public void withdraw(double nominal){
        // Jika nominal kurang atau sama dengan 0, maka withdraw tidak dapat terjadi
        if (nominal <= 0) {
            System.out.println("Nominal withdraw harus lebih dari 0!\n");
            return;
        }

        // Jika nominal withdraw lebih dari saldo, maka withdraw tidak dapat terjadi
        if (saldo  < nominal) {
            System.out.println("Saldo tidak mencukupi\n");
            return;
        }

        saldo -= nominal;
        System.out.println("Withdraw Berhasil!");
        System.out.println("Saldo: " + saldo + "\n");
    }

}
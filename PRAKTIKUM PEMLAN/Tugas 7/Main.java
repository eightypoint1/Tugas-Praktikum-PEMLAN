// Saya akan menggunakan contoh error memakai package net, jadi perlu mengimport sesuai kebutuhan
// Termasuk IOException yang diperlukan untuk exception handling dalam method connect()
import java.io.*;
import java.net.*;
import java.util.*;

/*
 *  Program yang saya ciptakan ini seputar package net java, terutama tentang objek url.
 *  satu-satunya "kegunaan" dari program ini adalah untuk melakukan pengecekan terhadap sebuah string url yang digunakan pengguna
 *  Exception yang digunakan dalam program ini MalformedURLException, UnknownHostException, dan IOException
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Selamat datang ke program pengecekan URL!!!!");
        System.out.println("Anda akan diminta untuk memasukkan sebuah URL, dan program ini akan mengecek jika URL valid atau tidak");
        System.out.println("Tapi sebelumnya, ini adalah dua contoh url yang salah, supaya input anda tidak juga ikut salah =\n");

        // Contoh exception "MalformedURLException"
        try {
            // Membuat objek URL, dengan argumen yang seharusnya dalam bentuk URL
            // Tapi argumen kehilangan beberapa hal, pertama protokol yang valid tidak ada (ftp://,http://,https://)
            // Lalu tidak ada root domain yang juga valid (.com,.org,dll)
            String Url = "abc://bukanurluntuknyatatidaktopi.hihihaha";
            System.out.println("URL = " + Url);
            URL url = new URL(Url);
        } catch (MalformedURLException e) {
            // Karena format URL tidak benar, maka akan keluar MalformedURLException
            System.out.println("MalformedURLException, artinya format URL yang anda berikan tidak lengkap atau ada yang salah, coba cek protokol dan root domainnya");
        }

        // Contoh Exception "UnknownHostException" dan juga "IOException"
        try {
            // Di contoh ini format URL benar, tapi domain name ini tidak valid 
            String Url = "http://urlyangtidaknyatauntuknyatatidaktopi.com";
            URL url = new URL(Url);
            System.out.println("\nURL = " + Url);
            // Buat objek untuk melakukan koneksi menggunakan url yang sudah kita buat
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            // lakukan connection
            connection.connect();
        } catch (UnknownHostException e) {
            // Karena domain yang kita masukkan tidak valid maka tidak menunjuk kemana-mana, maka keluar UnkownHostException
            System.out.println("UnknownHostException, domainnya gak valid, coba cek, emang domain namenya udah bener?");
        }  catch (IOException e) {
            // Kita perlu IOexception karena method connect memerlukannya, jadi jika ada masalah seperti server sedang down, akan keluar exception ini
            System.out.println("IOException, servernya paling lagi down, URl mu benar kok ;)");
        }

        // Contoh koneksi valid
        // Bisa kelihatan kalau tidak ada exception yang dikerluarkan di output
        try {
            // url yang valid, format juga sudah benar
            System.out.println("\nNah ini baru contoh url yang benar");
            String Url = "http://example.com";
            URL url = new URL(Url);
            System.out.println("URL = " + Url);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.connect();
        } catch (MalformedURLException e) {
            System.out.println("MalformedURLException");
        }catch (UnknownHostException e) {
            System.out.println("UnknownHostException");
        }  catch (IOException e) {
            System.out.println("IOException");
        } finally {
            System.out.println("Seharusnya tidak ada error di atas print statement ini");
        }

        System.out.println("\nNah, karena sudah tahu mana yang salah dan mana yang benar, silakan inputkan URL anda = ");
        String Url = scan.nextLine();
        // Untuk mengecek jika ada exception yang keluar karena url yang diinput salah
        boolean ngakException = true;

        try {
            URL url = new URL(Url);
            System.out.println("URL = " + Url);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.connect();
        } catch (MalformedURLException e) {
            System.out.println("MalformedURLException, artinya format URL yang anda berikan tidak lengkap atau ada yang salah, coba cek protokol dan root domainnya");
            ngakException = false;
        }catch (UnknownHostException e) {
            System.out.println("UnknownHostException, domainnya gak valid, coba cek, emang domain namenya udah bener?");
            ngakException = false;
        }  catch (IOException e) {
            System.out.println("IOException, servernya paling lagi down, URl mu benar kok ;)");
        }

        if (ngakException) {
            System.out.println("Hore, karena ngak ada exception (yang karena url rusak) artinya URL udah berjalan dengan baik, Terimakasih sudah menggunakan program ini !!!");
        }  else {
            System.out.println("Kelihatannya masih ada sesuatu yang salah dengan URl yang anda inputkan, coba cek lagi");
        }
    }  
}

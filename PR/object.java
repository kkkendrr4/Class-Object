package PR;
import java.util.Scanner;

public class object {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===========================");
        System.out.println("SELAMAT DATANG DI KNOWSPEC");
        System.out.println("===========================");


        device[] laptops = {
            new device("MacBook Pro 14", "Apple", "M1 Pro", "16 GB", "512 GB SSD"),
            new device("XPS 13", "Dell", "Intel Core i7", "16 GB", "1 TB SSD"),
            new device("ROG Zephyrus G14", "ASUS", "AMD Ryzen 9", "16 GB", "1 TB SSD")
        };

        System.out.println("\nDaftar Laptop:");
        for (int i = 0; i < laptops.length; i++) {
            System.out.println((i + 1) + ". " + laptops[i].name);
        }

        System.out.print("Masukkan pilihan (1/2/3): ");
        int pilihdevice = scanner.nextInt();

        if (pilihdevice >= 1 && pilihdevice <= laptops.length) {
            System.out.println("\nSpesifikasi Laptop yang dipilih:");
            laptops[pilihdevice - 1].tampilspek();
        } else {
            System.out.println("Pilihan tidak valid!");
        }

        scanner.close();
    }
}

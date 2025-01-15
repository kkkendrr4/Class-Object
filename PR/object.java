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

        device[] handphones = {
            new device("iPhone 14", "Apple", "A15 Bionic", "6 GB", "256 GB Storage"),
            new device("Galaxy S22", "Samsung", "Exynos 2200", "8 GB", "256 GB Storage"),
            new device("Xiaomi 12", "Xiaomi", "Snapdragon 8 Gen 1", "8 GB", "256 GB Storage")
        };

        device[] tablets = {
            new device("iPad Pro 12.9", "Apple", "M1", "8 GB", "512 GB Storage"),
            new device("Galaxy Tab S8", "Samsung", "Snapdragon 8 Gen 1", "8 GB", "256 GB Storage"),
            new device("MatePad Pro", "Huawei", "Kirin 9000E", "8 GB", "256 GB Storage")
        };

        System.out.println("\nProgram Spesifikasi Perangkat");
        System.out.println("1. Laptop");
        System.out.println("2. Handphone");
        System.out.println("3. Tablet");
        System.out.print("Pilih jenis perangkat (1/2/3): ");
        int pilihan = scanner.nextInt();

        device[] devicepilihan = null;
        String tipedevice = "";

        if (pilihan == 1) {
            devicepilihan = laptops;
            tipedevice = "Laptop";
        } else if (pilihan == 2) {
            devicepilihan = handphones;
            tipedevice = "Handphone";
        } else if (pilihan == 3) {
            devicepilihan = tablets;
            tipedevice = "Tablet";
        } else {
            System.out.println("Pilihan tidak valid!");
        }

        if (devicepilihan != null) {
            System.out.println("\nPilih " + tipedevice + ":");
            for (int i = 0; i < devicepilihan.length; i++) {
                System.out.println((i + 1) + ". " + devicepilihan[i].name);
            }
            System.out.print("Masukkan pilihan: ");
            int pilihdevice = scanner.nextInt();

            if (pilihdevice >= 1 && pilihdevice <= devicepilihan.length) {
                System.out.println("\nSpesifikasi " + tipedevice + " yang dipilih:");
                devicepilihan[pilihdevice - 1].tampilspek();
            } else {
                System.out.println("Pilihan tidak valid!");
            }
        }

        scanner.close();
    }
}

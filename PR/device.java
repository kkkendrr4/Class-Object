package PR;

public class device {
    String name;
    String brand;
    String processor;
    String ram;
    String storage;

    public device(String name, String brand, String processor, String ram, String storage) {
        this.name = name;
        this.brand = brand;
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
    }

    public void tampilspek() {
        System.out.println("Nama: " + name);
        System.out.println("Merek: " + brand);
        System.out.println("Prosesor: " + processor);
        System.out.println("RAM: " + ram);
        System.out.println("Penyimpanan: " + storage);
    }
}

public class Smartphone {
    String brand;
    String model;
    int price;
}
public class Main {
    public static void main(String[] args) {
        Smartphone phone1 = new Smartphone();
        Smartphone phone2 = new Smartphone();
        phone1.brand = "Apple";
        phone1.model = "iPhone 18";
        phone1.price = 164000;
        phone2.brand = "Samsung";
        phone2.model = "Galaxy S24";
        phone2.price = 67000;
        System.out.println(phone1.brand);
        System.out.println(phone1.model);
        System.out.println(phone1.price);
        System.out.println(phone2.brand);
        System.out.println(phone2.model);
        System.out.println(phone2.price);

        phone1.price = 450000;    //second hand price
        System.out.println(phone1.price);
    }
}

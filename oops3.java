
//method callinng

public class Smartphone {
    String brand;
    String model;
    int price;

    public void call() {
        System.out.println("Calling..."+ brand + " " + model);
    }
    
    public void sendMessage() {
        System.out.println("Sending message..."+ brand + " " + model);
    }
    
    public void browse() {
        System.out.println("Browsing..."+ brand + " " + model);
    }
    public void takePhoto() {
        System.out.println("Taking photo..."+ brand + " " + model);
    }
}

public class Main {
    public static void main(String[] args) {
        Smartphone phone1 = new Smartphone();
        Smartphone phone2 = new Smartphone();
        Smartphone phone3 = new Smartphone();
        phone1.brand = "Apple";
        phone1.model = "iPhone 18";
        phone1.price = 164000;
      
        System.out.println(phone1.brand);
        System.out.println(phone1.model);
        System.out.println(phone1.price);
        
        phone2.brand = "Samsung";
        phone2.model = "Galaxy S24";
       
        System.out.println(phone2.brand);
        System.out.println(phone2.model);
        
        phone3.brand = "Google";
        phone3.model = "Pixel 8";
        
        
       phone1.call();
       phone2.call();
       phone3.call();
       phone1.sendMessage();
       phone2.sendMessage();
       phone3.sendMessage();
       phone1.browse();
       phone2.browse();
       phone3.browse();
       phone1.takePhoto();
       phone2.takePhoto();
       phone3.takePhoto();

         }
}


// A Factory scenario

public class factory{
    String name;
    int age;
    int id;
    int salary;
    int quantity;
    
public void display() {
    System.out.println(name);
    System.out.println(age);
    System.out.println(id);
    System.out.println(salary);
}
}
class employee  extends factory {
    
}
class employer extends factory {
    
}
class supplier extends factory {
    
}
class customer extends factory {
    
}

public class mains {
    public static void main(String[] args) {
        employee e1 = new employee();
        employer emp1 = new employer();
        supplier sup1 = new supplier();
        customer cus1 = new customer();
        customer cus2 = new customer();
        
        
        
        e1.name = "fahad";
        e1.age = 21;
        e1.id = 1;
        e1.salary = 50000;
        System.out.println(e1.name);
        System.out.println(e1.age);
        System.out.println(e1.id);
        System.out.println(e1.salary);
        e1.display();

        emp1.name = "Babar Azam";
        emp1.age = 25;
        emp1.id = 2;
        emp1.salary = 100000;
        System.out.println(emp1.name);
        System.out.println(emp1.age);
        System.out.println(emp1.id);
        System.out.println(emp1.salary);
        emp1.display();

        sup1.name = "Supplier Babu";
        sup1.age = 30;
        sup1.id = 3;
        sup1.quantity = 100;
        System.out.println(sup1.name);
        System.out.println(sup1.age);
        System.out.println(sup1.id);
        System.out.println(sup1.quantity);
        sup1.display();

        cus1.name = "Customer 1";
        cus1.age = 25;
        cus1.id = 4;
        cus1.quantity = 50;
        System.out.println(cus1.name);
        System.out.println(cus1.age);
        System.out.println(cus1.id);
        System.out.println(cus1.quantity);
        cus1.display();
        
        cus2.name = "Customer 2";
        cus2.age = 30;
        cus2.id = 5;
        cus2.quantity = 75;
        System.out.println(cus2.name);
        System.out.println(cus2.age);
        System.out.println(cus2.id);
        System.out.println(cus2.quantity);
        cus2.display();
       




        
    }
}


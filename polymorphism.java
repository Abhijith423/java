//compile time polymorphism

public class polymorphism {

    int add(int a, int b) {
        return a + b;
    }
    int add(int a, int b, int c) {
        return a + b + c;
    }
    int add(double a, double b) {
        return (int)(a + b);
    }
    
   
        
    }
public class main3 {
    public static void main(String[] args) {
        polymorphism obj = new polymorphism();
        System.out.println(obj.add(1, 2));
        System.out.println(obj.add(1, 2, 3));
        System.out.println(obj.add(1.0, 2.0));
       
    }
}

//method with parameter

public class para {
    static void myName(String name) {
        System.out.println("Hello " + name);
    }
    public static void main(String[] args) {
        myName("Abhijith");
        myName("John");
        
    }
}

//multiple parameters
public class para {
    static void zNum(int a, int b) {
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
    }
    public static void main(String[] args) {
        zNum(15,20);
    }
}

public class para {
    static void zNum(float a, float b, float c) {
        System.out.println(a + b + c);
        System.out.println(a - b - c);
        System.out.println(a * b * c);
        System.out.println(a / b / c);
    }
    public static void main(String[] args) {
        zNum(300.6f, 200.4f, 100.2f);
    }
}


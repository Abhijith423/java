public class overloading{
    static int findSum(int a, int b) {
        return a + b;
    }
    static int findSum(int x, int y, int z) {
        return x + y + z;
    }
    static double findSum(double c, double d) {
        return c - d;
    }
    static float findSum(float e, float f) {
        return e + f;
    }

    public static void main(String[] args) {
        int a=12, b=16;
        int x=10,y=40,z=30;
        double c=10.5, d=1.5;
        float e=10.5f, f=5.5f;

        System.out.println(findSum(a, b));
        System.out.println(findSum(x, y, z));
        System.out.println(findSum(c, d));
        System.out.println(findSum(e, f));
        
    }
    
   
}

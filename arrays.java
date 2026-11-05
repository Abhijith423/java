public class arrays {
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        String[] temp = {"Banana", "Apple"};
        System.out.println(cars[0]);
        System.out.println(temp[1]);
        System.out.println(cars.length);
        System.out.println(temp.length);

        float[] prices = {10.5f, 20.0f, 30.5f};
        System.out.println(prices[2]);
        System.out.println(prices[0]+prices[2]);

        cars[0] = "Ferari";
        System.out.println(cars[0]);

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);

        int [][] v={{78,90,56},{12,34,56}};
        System.out.println(v[0][0]);
        System.out.println(v[1][1]);
        System.out.println(v[1][2]);
        }
    }
}

class City{
    String Name;
    int population;
    String state;
    String country;
    String FamousFor;
    
}
    
public  class Demo{
    public static void main(String[] args) {
        City myCity1 = new City();
        City myCity2 = new City();
        City myCity3 = new City();
        City myCity4 = new City();
        myCity1.Name = "Delhi";
        myCity1.population = 30000000;
        myCity1.state = "Delhi";
        myCity1.country = "India";
        myCity1.FamousFor = "Capital of India";
        myCity2.Name = "Mumbai";
        myCity2.population = 20000000;
        myCity2.state = "Maharashtra";
        myCity2.country = "India";
        myCity2.FamousFor = "Financial Capital of India";
        myCity3.Name = "Bangalore";
        myCity3.population = 15000000;
        myCity3.state = "Karnataka";
        myCity3.country = "India";
        myCity3.FamousFor = "IT Hub";
        myCity4.Name = "Thiruvanthapuram";
        myCity4.population = 10000000;
        myCity4.state = "Kerala";
        myCity4.country = "India";
        myCity4.FamousFor = "Richest Temple in the world";
        System.out.println(myCity1.Name);
        System.out.println(myCity1.population);
        System.out.println(myCity1.state);
        System.out.println(myCity1.country);
        System.out.println(myCity1.FamousFor);
        System.out.println(myCity2.Name);
        System.out.println(myCity2.population);
        System.out.println(myCity2.state);
        System.out.println(myCity2.country);
        System.out.println(myCity2.FamousFor);
        System.out.println(myCity3.Name);
        System.out.println(myCity3.population);
        System.out.println(myCity3.state);
        System.out.println(myCity3.country);
        System.out.println(myCity3.FamousFor);
        System.out.println(myCity4.Name);
        System.out.println(myCity4.population);
        System.out.println(myCity4.state);
        System.out.println(myCity4.country);
        System.out.println(myCity4.FamousFor);
    }
}

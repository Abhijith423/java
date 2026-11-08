public class person {
    String name;
    int age;
    int id;
    int salary;
    
public void display() {
    System.out.println(name);
    System.out.println(age);
    System.out.println(id);
    System.out.println(salary);
}
}
class Developers extends person {
    
}
class Recruiters extends person {
    
}
class Trainers extends person {
    
}
class Analyst extends person {
    
}

public class mains {
    public static void main(String[] args) {
        Developers d1 = new Developers();
        Developers d2 = new Developers();
        Developers d3 = new Developers();
        Recruiters r1 = new Recruiters();
        Trainers t1 = new Trainers();
        Analyst a1 = new Analyst();
        
        d1.name = "Abhijith";
        d1.age = 21;
        d1.id = 1;
        d1.salary = 50000;
        System.out.println(d1.name);
        System.out.println(d1.age);
        System.out.println(d1.id);
        System.out.println(d1.salary);
        d1.display();

        d2.name="Amal";
        d2.age=22;
        d2.id=2;
        d2.salary = 60000;
        System.out.println(d2.name);
        System.out.println(d2.age);
        System.out.println(d2.id);
        System.out.println(d2.salary);
        d2.display();
        
        d3.name="Sreekar";
        d3.age=23;
        d3.id=3;
        d3.salary = 70000;
        System.out.println(d3.name);
        System.out.println(d3.age);
        System.out.println(d3.id);

        r1.name="Jinu Raj";
        r1.age=29;
        r1.id=4;
        System.out.println(r1.name);
        System.out.println(r1.age);
        System.out.println(r1.id);

        t1.name="Toufik";
        t1.age=27;
        t1.id=5;
        System.out.println(t1.name);
        System.out.println(t1.age);
        System.out.println(t1.id);

        a1.name="Sreejith Kumar";
        a1.age=40;
        a1.id=6;
        System.out.println(a1.name);
        System.out.println(a1.age);
        System.out.println(a1.id);
        a1.display();
        



        
    }
}


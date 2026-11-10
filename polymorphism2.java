class poly{
    void animal(){
        System.out.println("Animal sound");
    }
}
class dog extends poly{
    void animal(){
        System.out.println("Dog sound");
    }
}
class cat extends poly{
    void animal(){
        System.out.println("Cat sound");
    }
}
class lion extends poly{
    void animal(){
        System.out.println("Lion roar");
    }
}

class main4 {
    public static void main(String[] args) {
        poly obj = new poly();
        obj.animal();
        obj = new dog();
        obj.animal();
        obj = new cat();
        obj.animal();
        obj = new lion();
        obj.animal();

    }
}

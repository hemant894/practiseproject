package PractiseProject.Ready1;

public class Mycar {
    String color;
    String model;
    int price=50000;
    int speed;
    Mycar(String model){
        System.out.println("model name is ;" + model);
    }
    public void speedup(int increment)
    {
        speed = speed + increment;

    }
}

package Animals;

public class Wolf extends Animal{

    public Wolf(){
        this.name = "Wolf";
    }

    @Override
    public void move() {
        System.out.println("run");
    }

    @Override
    public void eat() {
        System.out.println("rabbit");
    }
}

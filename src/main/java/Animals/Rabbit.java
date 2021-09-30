package Animals;

public class Rabbit extends Animal{

    public Rabbit(){
        this.name = "Rabbit";
    }

    @Override
    public void move() {
        System.out.println("jump");
    }

    @Override
    public void eat() {
        System.out.println("grass");
    }
}

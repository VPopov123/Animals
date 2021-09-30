import Animals.Animal;
import Animals.Rabbit;
import Animals.Wolf;

public class Application {

    public static void main(String[] args){

        Animal rabbit = new Rabbit();
        Animal wolf = new Wolf();

        rabbit.getName();
        rabbit.move();
        rabbit.eat();

        wolf.getName();
        wolf.move();
        wolf.eat();


    }

}

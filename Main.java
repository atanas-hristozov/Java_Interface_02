public class Main {
    public static void main(String[] args) {
        Rabbit rabit = new Rabbit();
        Fox fox = new Fox();
        Fish fish = new Fish();
        rabit.flee();
        fox.hunt();
        fish.flee();
        fish.hunt();
    }
}
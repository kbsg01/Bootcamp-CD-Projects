public class HumanTest {
    public static void main(String[] args) {
        Human wizard = new Human("Max");
        Human ninja = new Human("Will");
        Human samurai = new Human("Eleven");

        wizard.attack(ninja);
        samurai.attack(ninja);
        ninja.attack(samurai);
    }
}

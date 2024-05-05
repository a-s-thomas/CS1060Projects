public class Player {
    String name;

    Die die;

    public Player(String name, Die die) {
        this.name = name;
        this.die = die;
    }

    @Override
    public String toString() {
        return this.name;
    }
}

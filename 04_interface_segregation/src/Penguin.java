public class Penguin implements FeatheredCreature, SwimmingCreature {
    String currentLocation;
    int numberOfFeathers;

    public Penguin(int initialFeatherCount) {
        this.numberOfFeathers = initialFeatherCount;
    }

    @Override
    public void molt() {
        this.numberOfFeathers -= 1;
    }

    public void fly() { throw new UnsupportedOperationException(); }

    @Override
    public void swim() {
        this.currentLocation = "in the water";
    }
}

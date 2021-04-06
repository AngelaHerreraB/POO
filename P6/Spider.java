public class Spider extends Animal {
    private boolean poisonous;

    public Spider(String name, int age, boolean poisonous) {
        super(name, age);
        boolean vaccinate = false;
        setPoison(poisonous);
    }

    public void setPoison(boolean poisonous) {
        this.poisonous = poisonous;
    }

    public boolean getPoison() {
        return poisonous;
    }

    @override

    public void eat(String name) {
        System.out.println(name + "is eating an insect");
    }
}
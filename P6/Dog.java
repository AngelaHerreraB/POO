public class Dog extends Animal {
    private String breed;

    public Dog(String name, String breed, int age) {
        super(name, age);
        setBreed(breed);
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void bark(String name) {
        System.out.println(name + "is barking");
    }

    @override

    public void eat(String name) {
        System.out.println(name + "is eating Pedigree");
    }
}
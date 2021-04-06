public class Veterinarian {
    private String name;
    private double salary;

    public Veterinarian(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void vaccinate(Animal animal) {
        animal.setVaccinated(true);
        System.out.println(animal.getName() + " was vaccinated");
    }

    public void Poison(Animal animales) {
        for (Animal a : animales) {
            if (a instanceof Spider) {
                if (((Spider) a).getPoison() == true) {
                    System.out.println("The spider is poisonous");
                } else {
                    System.out.println("The spider is not poisonous");
                }
            }
        }
    }
}
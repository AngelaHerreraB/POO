public class Animal {
    private String name;
    private int age;
    private boolean vaccinated;

    public Animal(String name, int age) {
        setName(name);
        setAge(age);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setVaccinated(boolean vaccinated) {
        this.vaccinated = vaccinated;
    }

    public boolean getVaccinated() {
        return vaccinated;
    }

    public void eat() {
        System.out.println(name + " is eating");
    }

}

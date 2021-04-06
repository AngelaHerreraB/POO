import java.util.Scanner;

public class Zoo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int op;
        int aux;
        int c = 0;
        String name;
        int age;
        String breed;
        boolean poisonous;
        Animal[] animales = new Animal[50];

        do {
            System.out.println("Menu\n1-Agregar animal\n2-Mostrar\n3-Eliminar\n4-Salir");
            op = sc.nextInt();
            switch (op) {
            case 1:
                System.out.println("Animal's type:\n1-Dog\n2-Spider");
                aux = sc.nextInt();
                System.out.println("Name: ");
                name = sc.next();
                System.out.println("Age: ");
                age = sc.nextInt();

                if (aux == 1) {
                    System.out.println("Breed: ");
                    breed = sc.next();
                    animales[c] = new Dog(name, breed, age);
                    c = c + 1;
                } else if (aux == 2) {
                    System.out.println("Is it poisonous? (true/false)");
                    poisonous = sc.nextBoolean();
                    animales[c] = new Spider(name, age, poisonous);
                    c = c + 1;
                } else {
                    System.out.println("Invalid option");
                }
                break;
            case 2:
                for (Animal a : animales) {
                    if (a instanceof Spider) {
                        System.out.println("Name: " + ((Spider) a).getName());
                        System.out.println("Age: " + ((Spider) a).getAge());
                        System.out.println("Poisonous: " + ((Spider) a).getPoison());
                    } else {
                        System.out.println("Name: " + ((Dog) a).getName());
                        System.out.println("Age: " + ((Dog) a).getAge());
                        System.out.println("Breed: " + ((Dog) a).getBreed());
                    }
                }
                break;
            case 3:
                System.out.println("Type of animal to delete\n1-Dog\n2-Spider");
                aux = sc.nextInt();
                System.out.println("Name of the animal: ");
                name = sc.next();
                if (aux == 1) {
                    for (Animal a : animales) {
                        if (a instanceof Dog) {
                            if (a.getName() == name) {
                                ((Dog) a).setName("");
                                ((Dog) a).setAge(0);
                                ((Dog) a).setBreed("");
                            }
                        }
                    }
                } else if (aux == 2) {
                    for (Animal a : animales) {
                        if (a instanceof Spider) {
                            if (a.getName() == name) {
                                ((Spider) a).setName("");
                                ((Spider) a).setAge(0);
                                ((Spider) a).setPoison(false);
                            }
                        }
                    }
                } else {
                    System.out.println("Invalid option");
                }

                break;
            case 4:
                break;
            default:
                break;
            }
        } while (op != 4);
        sc.close();
    }
}
class Animal{
    private String name;
    private int age;
    private char gender;

    public Animal(String name,int age,char gender){
        this.name=name;
        this.age=age;
        this.gender=gender;

    }

    public void ProduceSound(){
        System.out.println("Animal produce sounds");
    }
}

class Dog extends Animal{

    public Dog(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    public void ProduceSound() {
        System.out.println(name + " Bow Wow");
    }
}

// Frog Class
class Frog extends Animal {

    public Frog(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    public void ProduceSound() {
        System.out.println(name + " says: Croak Croak!");
    }
}

// Cat Class
class Cat extends Animal {

    public Cat(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    public void ProduceSound() {
        System.out.println(name + " says: Meow Meow!");
    }
}

// Kitten Class (Always Female)
class Kitten extends Cat {

    public Kitten(String name, int age) {
        super(name, age, "Female");
    }

    @Override
    public void ProduceSound() {
        System.out.println(name + " (Kitten) says: Meow Meow!");
    }
}

// Tomcat Class (Always Male)
class Tomcat extends Cat {

    public Tomcat(String name, int age) {
        super(name, age, "Male");
    }

    @Override
    public void ProduceSound() {
        System.out.println(name + " (Tomcat) says: Meow Meow!");
    }
}

public class TestAnimal {
    public static void main(String[] args) {

        Animal[] animals = {
            new Dog("Bruno", 4, "Male"),
            new Dog("Rocky", 6, "Male"),
            new Frog("Froggy", 2, "Female"),
            new Frog("Jumpy", 3, "Male"),
            new Cat("Kitty", 5, "Female"),
            new Cat("Lucy", 4, "Female"),
            new Kitten("Mimi", 1),
            new Kitten("Lily", 2),
            new Tomcat("Tom", 6),
            new Tomcat("Max", 7)
        };

        int dogAge = 0, dogCount = 0;
        int frogAge = 0, frogCount = 0;
        int catAge = 0, catCount = 0;
        int kittenAge = 0, kittenCount = 0;
        int tomcatAge = 0, tomcatCount = 0;

        for (Animal a : animals) {

            if (a instanceof Kitten) {
                kittenAge += a.age;
                kittenCount++;
            }
            else if (a instanceof Tomcat) {
                tomcatAge += a.age;
                tomcatCount++;
            }
            else if (a instanceof Cat) {
                catAge += a.age;
                catCount++;
            }
            else if (a instanceof Dog) {
                dogAge += a.age;
                dogCount++;
            }
            else if (a instanceof Frog) {
                frogAge += a.age;
                frogCount++;
            }
        }

        System.out.println("Average Dog Age = " + (double) dogAge / dogCount);
        System.out.println("Average Frog Age = " + (double) frogAge / frogCount);
        System.out.println("Average Cat Age = " + (double) catAge / catCount);
        System.out.println("Average Kitten Age = " + (double) kittenAge / kittenCount);
        System.out.println("Average Tomcat Age = " + (double) tomcatAge / tomcatCount);
    }
}
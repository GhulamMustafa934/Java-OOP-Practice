class Animal {

    protected String name;
    protected int age;
    protected String gender;

    public Animal(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void produceSound() {
        System.out.println("Animal makes a sound.");
    }
}

class Dog extends Animal {

    public Dog(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    public void produceSound() {
        System.out.println("Bow wow");
    }
}

class Frog extends Animal {

    public Frog(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    public void produceSound() {
        System.out.println("Croak");
    }
}

class Cat extends Animal {

    public Cat(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    public void produceSound() {
        System.out.println("Meow");
    }
}

class Kitten extends Cat {

    public Kitten(String name, int age) {
        super(name, age, "Female");
    }

    @Override
    public void produceSound() {
        System.out.println("Meow");
    }
}

class Tomcat extends Cat {

    public Tomcat(String name, int age) {
        super(name, age, "Male");
    }

    @Override
    public void produceSound() {
        System.out.println("Meow");
    }
}

public class Main2 {

    public static void main(String[] args) {

        Animal[] animals = {
            new Dog("Tommy", 5, "Male"),
            new Dog("Rocky", 4, "Male"),
            new Frog("Froggy", 2, "Male"),
            new Frog("Green", 3, "Female"),
            new Kitten("Kitty", 1),
            new Kitten("Snow", 2),
            new Tomcat("Tiger", 4),
            new Tomcat("Leo", 5)
        };

        double dogAge = 0, frogAge = 0, kittenAge = 0, tomcatAge = 0;
        int dogCount = 0, frogCount = 0, kittenCount = 0, tomcatCount = 0;

        for (Animal a : animals) {

            a.produceSound();

            if (a instanceof Dog) {
                dogAge += a.getAge();
                dogCount++;
            } else if (a instanceof Frog) {
                frogAge += a.getAge();
                frogCount++;
            } else if (a instanceof Kitten) {
                kittenAge += a.getAge();
                kittenCount++;
            } else if (a instanceof Tomcat) {
                tomcatAge += a.getAge();
                tomcatCount++;
            }
        }

        System.out.println("\nAverage Ages:");

        if (dogCount > 0)
            System.out.println("Dog = " + (dogAge / dogCount));

        if (frogCount > 0)
            System.out.println("Frog = " + (frogAge / frogCount));

        if (kittenCount > 0)
            System.out.println("Kitten = " + (kittenAge / kittenCount));

        if (tomcatCount > 0)
            System.out.println("Tomcat = " + (tomcatAge / tomcatCount));
    }
}
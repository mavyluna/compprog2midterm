class Person {
    String name;
    int age;
    String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void printPerson() {
        System.out.println("Name: " + name + ", Age: " + age + ", Address: " + address);
    }
}

class Dog {
    String name;
    String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public void changeName(String newName) {
        this.name = newName;
    }

    public void changeBreed(String newBreed) {
        this.breed = newBreed;
    }

    public void printDog() {
        System.out.println("Dog Name: " + name + ", Breed: " + breed);
    }
}

class Rectangle {
    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double calculateArea() {
        return width * height;
    }

    public double calculatePerimeter() {
        return 2 * (width + height);
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("5 Persons");
        Person p1 = new Person("Frank Ocean", 37, "Los Angeles, CA");
        Person p2 = new Person("SZA", 35, "Los Angeles, CA");
        Person p3 = new Person("Billie Eilish", 23, "Los Angeles, CA");
        Person p4 = new Person("Justin Vernon", 43, "Eau Claire, WI");
        Person p5 = new Person("Hozier", 34, "Wicklow, IR");

        p1.printPerson();
        p2.printPerson();
        p3.printPerson();
        p4.printPerson();
        p5.printPerson();

        System.out.println("\n2 Dogs");
        Dog d1 = new Dog("Drake", "Pomeranian");
        Dog d2 = new Dog("Friday", "Shih Tzu");

        d1.printDog();
        d2.printDog();

        d1.changeName("Frankie");
        d1.changeBreed("Labrador");

        d2.changeName("Chloe");
        d2.changeBreed("French Bulldog");

        System.out.println("Updated:");
        d1.printDog();
        d2.printDog();

        System.out.println("\nArea and Perimeter of a Rectangle");
        Rectangle rect = new Rectangle(6.5, 12.0);
        System.out.println("Width: " + rect.width + ", Height: " + rect.height);
        System.out.println("Area: " + rect.calculateArea());
        System.out.println("Perimeter: " + rect.calculatePerimeter());

    }
}

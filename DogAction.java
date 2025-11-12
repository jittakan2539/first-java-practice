class Dog {
    String name;
    String breed;
    int age;

    //Methods
    void greet() {
        System.out.println("My name is " + name + ". I am a " + breed + ". I am " + age + " years old.");
    }

    void bark() {
        System.out.println(name + " says, 'Woolf! Woolf!'");
    }

    void fetch(String item) {
        System.out.println(name + " goes fetch " + item + " for me.");
    }
}

class DogAction {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        //Create a name and breed
        myDog.name = "Otis";
        myDog.breed = "pug";
        
        myDog.greet();
        myDog.bark();
        myDog.fetch("a stick");
    }
}
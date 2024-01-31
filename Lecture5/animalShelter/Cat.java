package animalShelter;

public class Cat extends Animal{

    private String fur;    
    private static int catCounter;

    public Cat(String name, int age){
        super(name, age);
        dogCounter++;
    }

    public String toString(){
        return "Dog breed: " + breed + "\n";
    }
}
package animalShelter;

public class Dog extends Animal{

    private String breed;    
    private static int dogCounter;

    public Dog(String name, int age, String breed){
        super(name, age);
        this.breed = breed;
        dogCounter++;
    }

    public String toString(){
        return super.toString()+ "Dog breed: " + breed + "\n";
    }
}
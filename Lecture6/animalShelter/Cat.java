package animalShelter;

public class Cat extends Animal{

    private String fur;    
    private static int catCounter;

    public Cat(String name, int age, String fur){
        super(name, age);
        this.fur = fur;
        catCounter++;
    }
    public String getFur(){
        return fur;
    }
    protected void setFur(String fur){
        this.fur =  fur;
    }

    public String toString(){
        return super.toString() + "Cat fur: " + fur + "\n";
    }
}
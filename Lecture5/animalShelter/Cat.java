package animalShelter;

public class Cat extends Animal{

    private String fur;    
    private static int catCounter;

    public Cat(String name, int age, int daysInRescue, String fur){
        super(name, age, daysInRescue);
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

    public static void main(String[] args) {
        Cat myCat = new Cat("Fluffy", 2, 3, "long");
        System.out.println(myCat);
    }
}
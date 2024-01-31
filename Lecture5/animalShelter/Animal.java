package animalShelter;

public class Animal {

    private String name;
    private int age;
    private int daysInRescue;
    private static int animalCounter;

    protected Animal(String name, int age){
        this.name = name;
        this.age = age;
        animalCounter++;
    }

    public String getName(){
        return name;
    }
    protected void setName(String name){
        this.name =  name;
    }

    public int getAge(){
        return age;
    }

    protected void setAge(int age){
        this.age =  age;
    }

    public int daysInRescue(){
        return daysInRescue;
    }

    protected void setDaysInRescue(int daysInRescue){
        this.daysInRescue =  daysInRescue;
    }
    public String toString(){
        return "Name: " + name + "\nAge: " + age +"\nDays in rescue:" + daysInRescue +"\n";
    }

    
}

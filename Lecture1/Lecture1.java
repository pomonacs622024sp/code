public class Lecture1 {
    public static void main(String[] args) {
        //This is a comment

        /*
         * This is a multi-line comment.
         * So much easier than Python
         */

         //declaring and initializing a variable
         int numberOfCS62Students = 38; 

         //assigning a new value to an already declared variable
         numberOfCS62Students = 39; 

         //other useful primitives
         double temperatureCelsius = 27.5;

         boolean lovingCS62 = true;

         char initialOfName = 'A';

        //Strings are not primitives
        String name = "Alexandra";

        //print statements
        System.out.println("Hello World");
        System.out.println(name);
        System.out.println(numberOfCS62Students);
        System.out.println(lovingCS62);

        System.out.println("My name is " + name + " and I will be teaching " + numberOfCS62Students + " students this semester");

        int result = +1;
        // result is now 1
        System.out.println(result);

        result--;
        // result is now 0
        System.out.println(result);

        result++;
        // result is now 1
        System.out.println(result);

        result = -result;
        // result is now -1
        System.out.println(result);

        boolean success = false;
        // false
        System.out.println(success);
        // true
        System.out.println(!success);

        int i = 3;
        i++;
        // prints i (4)
        System.out.println(i);
        ++i;			   
        // prints i (5)
        System.out.println(i);
        // first increments to 6 then prints it (6)
        System.out.println(++i);
        // first prints i (6) then increments i to 7 
        System.out.println(i++);
        // prints i (7)
        System.out.println(i);
<<<<<<< HEAD

        // Examples of arrays

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};;
        int[] numbers = {10, 20, 30, 40};
        System.out.println(cars[0]);
        cars[0] = "Toyota";
        System.out.println(cars[0]);
        System.out.println(cars.length);

        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        System.out.println(myNumbers[1][2]); // Outputs 7
        myNumbers[1][2] = 9;
        System.out.println(myNumbers[1][2]); // Outputs 9 instead of 7






=======
>>>>>>> 2dd87f9 (removed arrays from lecture1)
    }
}

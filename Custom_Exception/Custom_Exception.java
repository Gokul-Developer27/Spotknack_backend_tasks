import java.util.Scanner;
//class declaration
class Custom_Exception {

     static void checkAge(int age) throws InvalidAgeException {
// throws keyword is used to declare an exception in a class

        if (age < 18) {
            throw new InvalidAgeException("Age is below 18");
            //throw keyword is used to throw errors if any
        }

        System.out.println("You are eligible.");
    }
//program execution starts here
    public static void main(String[] args) throws InvalidAgeException {

         checkAge(20);

    }
}
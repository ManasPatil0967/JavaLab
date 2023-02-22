//This program is a recursive function that will calculate factorial of a number.
class Main{
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        int num = Integer.parseInt(System.console().readLine());
        int num2 = factorial(num);
        System.out.println("The factorial of the number is: " + num2);
    }
    public static int factorial(int num) {
        if(num==1)
        {
            return 1; //The base case
        }
        else{
            return num*factorial(num-1); //This is the recursive call
        }
    }
}
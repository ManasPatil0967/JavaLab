//This program will ask the user to enter a number and then it will add all the numbers from 1 to the number entered by the user.
class Main{
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        int num = Integer.parseInt(System.console().readLine());
        int num2 = sum(num);
        System.out.println("The sum of the two numbers is: " + num2);
    }
    public static int sum(int num) {
        if(num==1)
        {
            return 1; //The base case
        }
        else{
            return num+sum(num-1); //This is the recursive call
        }
    }
}
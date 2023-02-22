//This program is a recursive function that will calculate the fibonacci sequence of a number and takes input by BufferedReader.
import java.io.*;
class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number: ");
        int num = Integer.parseInt(br.readLine());
        int num2 = fibonacci(num);
        System.out.println("The fibonacci of the number is: " + num2);
    }
    public static int fibonacci(int num) {
        //The following two are the base cases
        if(num==1)
        {
            return 1;
        }
        else if(num==2)
        {
            return 1;
        }
        else{
            return fibonacci(num-1)+fibonacci(num-2); //This is the recursive call
        }
    }
}

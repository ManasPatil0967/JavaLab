//This is a recursive function that will perform binary search on an array of integers and will search a number from user input using Scanner.
import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int num2 = binarySearch(arr, num, 0, arr.length-1);
        System.out.println("The number is at index: " + num2);
    }
    public static int binarySearch(int[] arr, int num, int start, int end) {
        if(start>end)
        {
            return -1; //The base case
        }
        else{
            int mid = (start+end)/2;
            if(arr[mid]==num)
            {
                return mid; //The base case
            }
            else if(arr[mid]>num)
            {
                return binarySearch(arr, num, start, mid-1); //This is the recursive call
            }
            else{
                return binarySearch(arr, num, mid+1, end); //This is the recursive call
            }
        }
    }
}


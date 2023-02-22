//This is a recursive function that will print Hello World endlessly with a separate function.
class Main{
    public static void main(String[] args) {
        printHello();
    }
    public static void printHello() {
        System.out.println("Hello World");
        printHello(); //This is the recursive call
    }
}
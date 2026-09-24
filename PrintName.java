import java.util.Scanner;
public class PrintName {

    public void printMyName(String name) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        PrintName printer = new PrintName();

        String myName = "Alex";

        printer.printMyName(myName);
    }
}
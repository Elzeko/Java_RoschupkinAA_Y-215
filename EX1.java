/*
Реализовать программу, получающую на вход в качестве аргумента имя человека
и выводящую "Hello "+ имя, в противном случае, если параметр 
не передавался, "Нello world".
*/
import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Vvedite imya: ");
        String name = in.nextLine();

        if (name != "") {
            System.out.println("\tHello, "+ name + "!");
        }
        else {
            System.out.println("\tHello, World!");
        }

        in.close();
    }
}
/*
Написать программу, получающую на вход в качестве аргумента несколько параметров
В программе вывести "Вы ввели" + N (количество параметров) + "параметров ".
Если параметры не передавались, вывести "Вы не передавали параметров".
*/
import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {
        int N = 0;
        Scanner in = new Scanner(System.in);
        String x = in.nextLine();

        while (x != "") {
            x = in.nextLine();
            N++;
        }

        if (N != 0) {
            System.out.print("\tVi vveli "+ N +" parametrov!");
        }
        else {
            System.out.print("\tVi ne vveli parametri.");
        }

        in.close();
    }
}
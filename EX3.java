/*
Передавать в качестве параметров два целочисленных числа. Вывести на
экран как сами значения так и их сумму ("З +2 - 5"). Если количество параметров
не равно 2, вывести сообщение "Неверное количество параметров.
*/
import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {
        if (args.length == 2) {
            System.out.print("\t"+ args[0] +" + "+ args[1] +" = "+ (Integer.parseInt(args[0])+Integer.parseInt(args[1])));
        }
        else {
            System.out.print("\tNevernoe kolichestvo parametrov.");
        }
    }
}
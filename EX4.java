/*
Ввести в качестве параметров имя пользователя и пароль. Проверить в методе mаin() 
соответствие введенных значений заранее определенным значениям. В
случае полного соответствия вывести сообщение "Вас узнали. Добро пожаловать", в
противном случае вывести сообщение "Логин и пароль не распознаны. Доступ запрещен".
*/
import java.util.Scanner;

public class EX4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Vvedite login: ");
        String inputlogin = input.nextLine();

        System.out.print("Vvedite pass: ");
        String inputpass = input.nextLine();

        String login = "a";
        String pass = "a";


        if (login.equals(inputlogin)){
            if (pass.equals(inputpass)){
                System.out.print("\tВас узнали. Добро пожаловать");
            }
            else {
                System.out.print("\tПароль не распознан. Доступ запрещен");
            }
        }
        else {
            System.out.print("\tЛогин не распознан. Доступ запрещен");
        }
        input.close();
    }
}
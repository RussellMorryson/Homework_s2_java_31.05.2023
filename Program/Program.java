package Program;

import java.util.*;

class Program extends Calculator{
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner in = new Scanner(System.in);
        boolean work = true;
        while(work) {
            System.out.print("Введите первое число: ");
            calc.setNumber1(in.nextDouble());

            System.out.print("Введите вид операции: \nСложение '+' \nВычитание '-' \nУмножение '*' \nДеление '/' \n");
            calc.setSynbol(in.next());

            System.out.print("Введите второе число: ");
            calc.setNumber2(in.nextDouble());

            System.out.println("Сформированно выражение: " + calc.getNumber1() + " " + calc.getSynbol() + " " + calc.getNumber2());
            System.out.println("Результат: " + calc.operation());

            System.out.println("Хотите произвести другие расчеты y / n ?");

            boolean access = true;
            while (access) {
                String accept = in.next();
                switch (accept) {
                    case "y":
                        access = false;
                        break;
                    case "n":
                        access = false;
                        work = false;
                        break;
                    default:
                        System.out.println("Некорректный ввод. Повторите попытку!");
                }
            }
        }
        System.out.println("До свидания!");
        in.close();
    }
}
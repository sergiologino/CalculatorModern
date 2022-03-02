import java.util.Scanner;
public class CalculatorMod {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите число1 ");
        int operand =  scan.nextInt();
        int result = 0;
        char operator = ' ';
        while (operator != 's'){
            if (operator=='c') {
                System.out.print("Введите число1 ");
                operand =  scan.nextInt();
            }
            System.out.print("Введите операцию ");
            operator = scan.next().charAt(0);
            switch (operator) {
                case 'c':
                    operand=0;
                    result=0;
                    break;
                case '*':
                    System.out.print("Введите число2 ");
                    result = operand * scan.nextInt();
                    break;
                case '/':
                    System.out.print("Введите число2 ");
                    result = operand / scan.nextInt();
                    break;
                case '+':
                    System.out.print("Введите число2 ");
                    result = operand + scan.nextInt();
                    break;
                case '-':
                    System.out.print("Введите число2 ");
                    result = operand - scan.nextInt();
                    break;

                case 's':
                    // ничего не делаем - выходим
                    break;
                default:
                    System.out.println("Неправильный оператор");
            }
            System.out.println("Результат: " + result);
            operand = result;
        }
        System.out.println("Exit");
    }
}
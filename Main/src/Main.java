import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите выражение:");
        String input = sc.nextLine();
        System.out.println("Результат выражения =" + calc(input));
    }
    public static String calc(String input) {
        String[] numberMatOper = input.split(" ");
        if (numberMatOper.length != 3) {
            throw new NumberFormatException("\nФормат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *). Попробуйте снова!");
        }
        String num1 = numberMatOper[0];
        String num2 = numberMatOper[2];
        char operations = numberMatOper[1].charAt(0);
        return " " + getSumm(Integer.parseInt(num1), Integer.parseInt(num2), operations);
        }
    public static int getSumm(int x1, int x2, char oper) {
        if ((x1 < 1 || x1 > 10) || (x2 < 1 || x2 > 10)) {
            throw new NumberFormatException("\nКалькулятор умеет работать с целыми числами от 1 до 10. Попробуйте снова!");
        }
        int result = 0;
        switch (oper) {
            case '+':
                result = x1 + x2;
                break;
            case '-':
                result = x1 - x2;
                break;
            case '*':
                result = x1 * x2;
                break;
            case '/':
                result = x1 / x2;
                break;
            default:
                break;
        }
        if (result < 1) {
            throw new NumberFormatException("\nКалькулятор не умеет работать с отрицательными числами. Попробуйте снова!");
        }
        return result;
    }
}

package homework.one;

/**
 * 1. Написать метод увеличения счета (счет и часть для увеличения int, всегда положительные), объяснить какие могут быть проблемы.
 */
public class PunktOne {

    public static void main(String[] args) {
        int newBalance = addToAccount(300, 200);
        if (500 == newBalance) {
            System.out.println("Success add balance operation");
        } else {
            System.out.println("Incorrect add balance operation");
        }
    }


    public static int addToAccount(int balance, int addSumm) {
        return balance + addSumm;
    }
}

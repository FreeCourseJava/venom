package homework.one;

/**
 * 1. Написать метод увеличения счета (счет и часть для увеличения int, всегда положительные), объяснить какие могут быть проблемы.
 */
public class PunktOne {
    static Account acc1 = new Account(11111111111111l, 100);
    static Account acc2 = new Account(22222222222222l, 200);
    static Account acc3 = new Account(33333333333333l, 300);
    static Account acc4 = new Account(44444444444444l, -400);

    public static void main(String[] args) {
        int newBalance = addToAccount(acc1.balance, 200);
        if (newBalance > 0)
            System.out.println("Success add balance operation for account number: " + acc1.accountNumber);
        else System.out.println("Incorrect add balance operation for account number: " + acc1.accountNumber);

    }


    public static int addToAccount(int balance, int addSumm) {
        return balance + addSumm;

    }
}

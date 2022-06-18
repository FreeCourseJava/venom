/**
 * 1. Написать метод увеличения счета (счет и часть для увеличения int, всегда положительные), объяснить какие могут быть проблемы.
 */
public class HomeWork1 {
    static Account acc1 = new Account(11111111111111l, 100);
    static Account acc2 = new Account(22222222222222l, 200);
    static Account acc3 = new Account(33333333333333l, 300);
    static Account acc4 = new Account(44444444444444l, -400);

    public static void addToAccount(long accountNumber, int addSumm) {
        if (acc1.accountNumber == accountNumber) {
            acc1.balance = acc1.balance + addSumm;
            return;
        }

        if (acc2.accountNumber == accountNumber) {
            acc2.balance = acc2.balance + addSumm;
            return;
        }

        if (acc3.accountNumber == accountNumber) {
            acc3.balance = acc3.balance + addSumm;
            return;
        }

        if (acc4.accountNumber == accountNumber) {
            acc4.balance = acc4.balance + addSumm;
            return;
        }

        throw new RuntimeException("Account: " + accountNumber + " not found");
    }
}

/**
 * 2. Пиграться с char. Объявить переменную, прибавить к ней int значение (допустим 1 10 22) и отнять, объяснить как это рабоатет, т.е. какой результат получаем и почему.
 * 3. Написать метод ничего принимающий int и выводящий в консоль: Результат равен: значение_переменной овец (штук). Метод ничего не возращает, только выводит в консоль.
 */
public class HomeWork1_2 {
    public static void main(String[] args) {
        char testLetter = 'a';
        char testLetter2 = 'A';
        boolean isLettersEqual = testLetter == testLetter2;
        System.out.println("testLetter["+ testLetter+"]");
        System.out.println("testLetter2["+ testLetter2+"]");
        System.out.println("testLetter == testLetter2 : ["+ isLettersEqual +"]");

        char newLetter = 97;
        char letter65000 = 65000;
        boolean isLettersEqual2 = testLetter == newLetter;
        System.out.println("testLetter == newLetter2 : ["+ isLettersEqual2 +"]");

        int sum = 0 + testLetter;

        char charAfterSum3 = (char) (testLetter + 3);
        System.out.println("0 + testLetter: ["+ sum +"]");

        System.out.println("character at index 65000: ["+ letter65000 +"]");
        System.out.println("testLetter + 3: ["+ charAfterSum3 +"]");


        int i = 0 + testLetter2;
        System.out.println("testLetter2 at index : ["+ (int) testLetter2 +"]");

    }

    public static void printSheeps(int sheepsCount) {
        System.out.println("Результат равен: "+ sheepsCount +" овец (штук).");
    }
}

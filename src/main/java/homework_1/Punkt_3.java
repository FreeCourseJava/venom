package homework_1;

/**
 * 3. Написать метод ничего принимающий int и выводящий в консоль: Результат равен: значение_переменной овец (штук). Метод ничего не возращает, только выводит в консоль.
 */
public class Punkt_3 {


    public static void main(String[] args) {
        for (int i = 0; i < 45; i++) {
            printSheeps(i);
        }
    }

    public static void printSheeps(int sheepsCount) {
        System.out.println("Результат равен: "+ sheepsCount +" овец (штук).");
    }

}

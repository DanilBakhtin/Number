package Main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите целые числа через пробел." +
                "Если число будет не целое или не числом, тогда оно не будет подсчитано" +
                "в общей сумме и произведении.");

        //Ввод строки с числами
        String numbers = in.nextLine();

        //Делим строку на подстроки через пробелы
        String[] sl = numbers.split(" ");

        int summ = 0;
        long multi = 1;

        for (int i = 0; i < sl.length; i++){
            int chislo;
            //Исключение на то, число введено или нет
            try {
                chislo = Integer.parseInt(sl[i]);
            }
            catch (Exception e){
                //Если введено не число, то переходим к следующей иттерации
                continue;
            }
            summ += chislo;
            multi *= chislo;
        }

        //Вывод получившихся значений
        System.out.println("Сумма введеных чисел: " + summ);
        System.out.println("Произведение введеных чисел: " + multi);
    }
}

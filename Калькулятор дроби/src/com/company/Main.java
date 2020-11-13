package com.company;

public class Main {

    public static void main(String[] args) {
        // Задаем число и его степень.
        number(5, 2);
    }

    public static void number(int x, int y) {
        // Переменая result нужна для складывание. Например если x=x*x. То в этом случае будет правильна максимальная степень это 2. Выше будет считаться ошибочным числом.
        // А в этом случае будет складыватся. Например 5^3 в методе складывании x =x*x будет 5*5=25 / 25*25=625.      5   5          25   =   25 * 5 / result = 125
        // В медоте складывании result = x; перед циклом и в самом цикле result * x. То выйдет такая схема result= result*x = 25 / result = result*x
        // Спасибо человеку из Java Rush "VK" за подсказку с тем как работает степень.
        int result = x;
        // Цикл for который перемножает X самого на себя пока X не получит значения степени Y.
        for(int a = 1; a < y; a++) {
            // Перемножение.
            result = result * x;
        }
        // Вывод на экран.
        System.out.print("Число " + x + " в степени " + y + " = ");
        System.out.println(result);
    }
}

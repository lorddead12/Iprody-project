package io.iprody.lessons.lesson8;

public class HomeWorkLesson8 {
    public static void main(String[] args) {
        testStringWork("HoasdfpolloH");
    }

    /*
    * Решение задач реализованы в классе StringWork.
    * Метод testStringWork() предназначен для тестирования реализованных задач.
    */
    public static void testStringWork(String source) {
        StringWork stringWork = new StringWork();

        // Задача №1.
        System.out.println(
                stringWork.findSymbolOccurrence(
                        source,
                        'o'));

        // Задача №2.
        System.out.println(
                stringWork.findWordPosition(
                        source,
                        "pollo"));

        // Задача №3.
        String reverseStr = stringWork.stringReverse(source);
        System.out.println(reverseStr);

        // Задача №4.
        boolean isPalindrome = stringWork.isPalindrome(source);
        boolean isPalindrome1 = stringWork.isPalindrome("Allo");
        System.out.println(isPalindrome);
        System.out.println(isPalindrome1);
    }
}

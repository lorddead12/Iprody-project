package io.iprody.lessons.lesson8;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class GuessWord {
    private static final Scanner KEYBOARD_INPUT = new Scanner(System.in);
    private static final char[] PROMPT = {  '#','#','#','#','#',
                                            '#','#','#','#','#',
                                            '#','#','#','#','#'};
    private static final String[] RESPONSE_WORDS = {
            "apple", "orange", "lemon", "banana", "apricot", "avocado",
            "broccoli", "carrot", "cherry", "garlic", "grape", "melon",
            "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
            "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

    private final int indexWord;

    private GuessWord() {
        // Решил инициализировать в конструкторе вместо сеттера
        indexWord = new Random().nextInt(RESPONSE_WORDS.length);
    }
        /*Метод запуска программы*/
    public static void runGuessWord() {
        GuessWord guessWord = new GuessWord();
        boolean isWin = false;

        while (!isWin) {
            String answerUser = guessWord.guessAnswerUser();
            if (guessWord.checkAnswerUser(answerUser)) {
                isWin = true;
                System.out.println("Поздравляю вас с победой! Удачи!");
            }
        }
    }
        /*Метод проверки ответа пользователя*/
    private boolean checkAnswerUser(String answer) {
        int lenResponseWord =  RESPONSE_WORDS[indexWord].length();
        int minLen =
                Math.min(answer.length(), lenResponseWord);

        for (int i = 0; i < minLen; i++) {
            char letterAnswer = answer.charAt(i);
            char letterGuessWord = RESPONSE_WORDS[indexWord].charAt(i);

            if (!(letterGuessWord == letterAnswer)) {
                printPrompt();
                return false;
            } else {
                lenResponseWord--;
                PROMPT[i] = letterAnswer;
            }
        }

        if (lenResponseWord != 0) {
            printPrompt();
        }

        return lenResponseWord == 0;
    }
        /*Метод ввода пользователем слова*/
    private String guessAnswerUser() {
        System.out.print("Введите угадываемое слово: ");
        return KEYBOARD_INPUT.next();
    }
        /*Метод печати подсказки*/
    private void printPrompt() {
        System.out.println("Вы не угадали, попробуйте еще раз!");
        System.out.print("Вот вам подсказка: ");
        System.out.println(Arrays.toString(PROMPT));
    }
}

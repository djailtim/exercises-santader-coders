package Lesson5;

import java.util.Scanner;

class Utils {
    public static boolean isNumber(String number) {
        return number != null && number.matches("[0-9]*");
    }

    public static Integer inputCorrectChoice(Scanner input, String choiceOfWhich) {
        while (Integer.parseInt(choiceOfWhich) != 1 && Integer.parseInt(choiceOfWhich) != 2) {
            System.out.print(Messages.messageErrorOptionInput);
            choiceOfWhich = input.nextLine();
        }
        return Integer.parseInt(choiceOfWhich);
    }
}
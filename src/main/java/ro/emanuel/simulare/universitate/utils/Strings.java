package ro.emanuel.simulare.universitate.utils;

import java.util.List;

public class Strings {

    public static final String APPROVAL_SUCCESS = "Cererea a fost procesata cu succes!";
    public static final String APPROVAL_ERROR = "Cererea nu a putut fi procesata.";
    public static final String ADD_STUDENT_ERROR = "The student could not be added because you selected an invalid option.";

    public static String formatCommandNumber(int n) {
        return (n + 1) + ". ";
    }

    public static void printConsoleCarrige() {
        System.out.print("> ");
    }

    public static void printStringList(List<String> list) {
        list.forEach(element -> {
            int i = list.indexOf(element);
            System.out.println(formatCommandNumber(i) + element);
        });
    }

}

package ro.emanuel.simulare.universitate.commands;

import ro.emanuel.simulare.universitate.Console;
import ro.emanuel.simulare.universitate.ConsoleCommand;
import ro.emanuel.simulare.universitate.Student;
import ro.emanuel.simulare.universitate.University;

import java.util.List;
import java.util.Scanner;

import static ro.emanuel.simulare.universitate.utils.Strings.ADD_STUDENT_ERROR;

public class InscriereStudentCommand extends ConsoleCommand {

    private static final Scanner in = new Scanner(System.in);
    private static final University university = University.getInstance();

    public InscriereStudentCommand() {
        name = "Inscriere Student";
    }

    public void execute() {
        System.out.println("Enter your student name: ");
        System.out.print("Nume student: ");
        String name = in.nextLine();
        System.out.println("Specializarea:");
        printSpecializari(university.getSpecializari());
        Console.printConsoleCarrige();
        String specializare = getSpecializareById(in.nextInt());

        if (specializare != null) {
            university.getSecretariat().getStudents().add(new Student(name, specializare));
            System.out.println("Added new student with name: " + name + "\n");
        } else System.out.println(ADD_STUDENT_ERROR + "\n");
    }

    private void printSpecializari(List<String> specializari) {
        specializari.forEach(specializare -> {
            int index = university.getSpecializari().indexOf(specializare);
            System.out.println((index + 1) + ". " + specializare);
        });
    }

    private String getSpecializareById(int id) {
        if (id == 0 || id > university.getSpecializari().size())
            return null;

        return university.getSpecializari().get(id - 1);
    }
}

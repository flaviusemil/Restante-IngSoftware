package ro.emanuel.simulare.universitate.commands;

import ro.emanuel.simulare.universitate.ConsoleCommand;
import ro.emanuel.simulare.universitate.Student;
import ro.emanuel.simulare.universitate.University;

import java.util.Scanner;

public class InscriereStudentCommand extends ConsoleCommand {

    private static final Scanner in = new Scanner(System.in);

    public InscriereStudentCommand() {
        name = "Inscriere Student";
    }

    public void execute() {
        System.out.println("Enter your student name: ");
        String name = in.nextLine();
        University.getInstance().getSecretariat().getStudents().add(new Student(name));
        System.out.println("Added new student with name: " + name);
    }
}

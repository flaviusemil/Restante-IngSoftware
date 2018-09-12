package ro.emanuel.simulare.universitate.commands;

import ro.emanuel.simulare.universitate.ConsoleCommand;
import ro.emanuel.simulare.universitate.Secretariat;
import ro.emanuel.simulare.universitate.Student;

import java.util.Scanner;

import static ro.emanuel.simulare.universitate.utils.Strings.*;

public class InscriereStudentCommand extends ConsoleCommand {

    private static final Scanner in = new Scanner(System.in);
    private static final Secretariat SECRETARIAT = Secretariat.getInstance();

    public InscriereStudentCommand() {
        name = "Inscriere Student";
    }

    public void execute() {
        System.out.print("Nume student: ");
        String name = in.nextLine();

        System.out.println("Specializarea:");
        printStringList(SECRETARIAT.getSpecializari());

        printConsoleCarrige();
        String specializare = getSpecializareById(in.nextInt());
        in.nextLine();

        if (specializare != null) {
            SECRETARIAT.getStudents().add(new Student(name, specializare));
            System.out.println("Added new student with name: " + name + "\n");
        } else System.out.println(ADD_STUDENT_ERROR + "\n");
    }

    private String getSpecializareById(int id) {
        if (id <= 0 || id > SECRETARIAT.getSpecializari().size())
            return null;

        return SECRETARIAT.getSpecializari().get(id - 1);
    }
}

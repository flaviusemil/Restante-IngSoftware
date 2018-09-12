package ro.emanuel.simulare.universitate.commands;

import ro.emanuel.simulare.universitate.ConsoleCommand;
import ro.emanuel.simulare.universitate.University;

public class InformatiiDespreStudentCommand extends ConsoleCommand {

    private static final University university = University.getInstance();

    public InformatiiDespreStudentCommand() {
        name = "Informatii despre student";
    }

    @Override
    public void execute() {
        System.out.println("Studentii inscrisi la " + university.getName());
        University.getInstance().getSecretariat().getStudents().forEach(System.out::println);
        System.out.println();
    }
}

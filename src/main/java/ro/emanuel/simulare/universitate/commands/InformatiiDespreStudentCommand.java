package ro.emanuel.simulare.universitate.commands;

import ro.emanuel.simulare.universitate.ConsoleCommand;
import ro.emanuel.simulare.universitate.University;

public class InformatiiDespreStudentCommand extends ConsoleCommand {

    public InformatiiDespreStudentCommand() {
        name = "Informatii despre student";
    }

    @Override
    public void execute() {
        University.getInstance().getSecretariat().getStudents().forEach(System.out::println);
    }
}

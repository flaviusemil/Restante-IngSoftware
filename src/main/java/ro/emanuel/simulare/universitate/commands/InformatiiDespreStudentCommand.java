package ro.emanuel.simulare.universitate.commands;

import ro.emanuel.simulare.universitate.ConsoleCommand;
import ro.emanuel.simulare.universitate.Secretariat;
import ro.emanuel.simulare.universitate.Student;

import java.util.List;
import java.util.stream.Collectors;

import static ro.emanuel.simulare.universitate.utils.Strings.printStringList;

public class InformatiiDespreStudentCommand extends ConsoleCommand {

    private static final Secretariat SECRETARIAT = Secretariat.getInstance();

    public InformatiiDespreStudentCommand() {
        name = "Informatii despre student";
    }

    @Override
    public void execute() {
        System.out.println("Studentii inscrisi la " + SECRETARIAT.getName() + ":");
        List<String> students = SECRETARIAT.getStudents()
                .stream()
                .map(Student::toString)
                .collect(Collectors.toList());

        printStringList(students);

        System.out.println();
    }
}

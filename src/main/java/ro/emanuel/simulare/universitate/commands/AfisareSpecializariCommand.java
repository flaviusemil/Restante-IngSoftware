package ro.emanuel.simulare.universitate.commands;

import ro.emanuel.simulare.universitate.ConsoleCommand;
import ro.emanuel.simulare.universitate.University;

public class AfisareSpecializariCommand extends ConsoleCommand {

    private static final University university = University.getInstance();

    public AfisareSpecializariCommand() {
        name = "Afisare specializari";
    }

    @Override
    public void execute() {
        System.out.println("Specializarile disponibile la " + university.getName());
        university.getSpecializari().forEach(System.out::println);
        System.out.println();
    }
}

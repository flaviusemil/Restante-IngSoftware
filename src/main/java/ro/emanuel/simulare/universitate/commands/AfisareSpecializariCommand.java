package ro.emanuel.simulare.universitate.commands;

import ro.emanuel.simulare.universitate.ConsoleCommand;
import ro.emanuel.simulare.universitate.Secretariat;

import static ro.emanuel.simulare.universitate.utils.Strings.printStringList;

public class AfisareSpecializariCommand extends ConsoleCommand {

    private final Secretariat SECRETARIAT = Secretariat.getInstance();

    public AfisareSpecializariCommand() {
        name = "Afisare specializari";
    }

    @Override
    public void execute() {
        System.out.println("Specializarile disponibile la " + SECRETARIAT.getName());
        printStringList(SECRETARIAT.getSpecializari());
        System.out.println();
    }
}

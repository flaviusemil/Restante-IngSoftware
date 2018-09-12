package ro.emanuel.simulare.universitate.commands;

import ro.emanuel.simulare.universitate.ConsoleCommand;
import ro.emanuel.simulare.universitate.Secretariat;
import ro.emanuel.simulare.universitate.utils.Profesor;
import ro.emanuel.simulare.universitate.utils.ProfessorType;

import java.util.List;
import java.util.stream.Collectors;

public class AfisareProfesoriCommand extends ConsoleCommand {

    public AfisareProfesoriCommand() {
        name = "Afisare profesori";
    }
    private static final Secretariat SECRETARIAT = Secretariat.getInstance();

    @Override
    public void execute() {
        System.out.println("Lista profesorilor de la " + SECRETARIAT.getName());
        listRectors();
        listDecans();
        listProfessors();
        listAssistents();

        System.out.println();
    }

    private void listRectors() {
        List<Profesor> rectors = getProfessorsOfType(ProfessorType.RECTOR);
        System.out.println("Rectors:");
        rectors.forEach(System.out::println);
    }

    private void listDecans() {
        List<Profesor> decans = getProfessorsOfType(ProfessorType.DECAN);
        System.out.println("\tDecans:");
        decans.forEach(decan -> System.out.println("\t" + decan));
    }

    private void listProfessors() {
        List<Profesor> professors = getProfessorsOfType(ProfessorType.PROFESOR);
        System.out.println("\t\tProfessors:");
        professors.forEach(professor -> System.out.println("\t\t" + professor));
    }

    private void listAssistents() {
        List<Profesor> assistents = getProfessorsOfType(ProfessorType.ASISTENT);
        System.out.println("\t\t\tAssistants:");
        assistents.forEach(assistent -> System.out.println("\t\t\t" + assistent));
    }

    private List<Profesor> getProfessorsOfType(ProfessorType type) {
        return SECRETARIAT.getProfessors().stream()
                .filter(profesor -> profesor.getType().equals(type))
                .collect(Collectors.toList());
    }
}

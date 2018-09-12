package ro.emanuel.simulare.universitate.commands;

import ro.emanuel.simulare.universitate.ConsoleCommand;
import ro.emanuel.simulare.universitate.University;
import ro.emanuel.simulare.universitate.utils.Profesor;
import ro.emanuel.simulare.universitate.utils.ProfessorType;
import java.util.List;
import java.util.stream.Collectors;

public class AfisareProfesoriCommand extends ConsoleCommand {

    public AfisareProfesoriCommand() {
        name = "Afisare profesori";
    }
    private University university = University.getInstance();

    @Override
    public void execute() {
        System.out.println("Lista profesorilor de la " + university.getName());
        listRectors();
        listDecans();
        listProfesors();
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

    private void listProfesors() {
        List<Profesor> profesors = getProfessorsOfType(ProfessorType.PROFESOR);
        System.out.println("\t\tDecans:");
        profesors.forEach(profesor -> System.out.println("\t\t" + profesor));
    }

    private void listAssistents() {
        List<Profesor> asistents = getProfessorsOfType(ProfessorType.ASISTENT);
        System.out.println("\t\t\tDecans:");
        asistents.forEach(asistent -> System.out.println("\t\t\t" + asistent));
    }

    private List<Profesor> getProfessorsOfType(ProfessorType type) {
        return university.getProfesors().stream()
                .filter(profesor -> profesor.getType().equals(type))
                .collect(Collectors.toList());
    }
}

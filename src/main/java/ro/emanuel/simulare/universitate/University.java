package ro.emanuel.simulare.universitate;

import lombok.Getter;
import lombok.Setter;
import ro.emanuel.simulare.universitate.profesors.AsistentProfesor;
import ro.emanuel.simulare.universitate.profesors.DecanProfesor;
import ro.emanuel.simulare.universitate.profesors.ProfesorProfesor;
import ro.emanuel.simulare.universitate.profesors.RectorProfesor;
import ro.emanuel.simulare.universitate.utils.Profesor;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class University {

    private static final University university = new University();

    private University() {
        this.name = "Universitatea Emanuel";
        addSpecializari();
        addProfesori();
    };

    private Secretariat secretariat = new Secretariat();
    private List<String> specializari = new ArrayList<>();
    private List<Profesor> profesors = new ArrayList<>();
    private String name;

    private void addSpecializari() {
        this.specializari.add("Management");
        this.specializari.add("Informatica-Economica");
    }

    private void addProfesori() {
        Profesor asistent = new AsistentProfesor("Mihai");
        Profesor profesor = new ProfesorProfesor("Marcel");
        Profesor decan = new DecanProfesor("Ion");
        Profesor rector = new RectorProfesor("Ilie");

        this.profesors.add(asistent);
        this.profesors.add(profesor);
        this.profesors.add(decan);
        this.profesors.add(rector);
    }

    public static University getInstance() {
        return university;
    }

}

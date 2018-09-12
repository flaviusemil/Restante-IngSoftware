package ro.emanuel.simulare.universitate;

import lombok.Getter;
import lombok.Setter;
import ro.emanuel.simulare.universitate.profesors.AsistentProfesor;
import ro.emanuel.simulare.universitate.profesors.DecanProfesor;
import ro.emanuel.simulare.universitate.profesors.ProfesorProfesor;
import ro.emanuel.simulare.universitate.profesors.RectorProfesor;
import ro.emanuel.simulare.universitate.utils.Profesor;
import ro.emanuel.simulare.universitate.utils.ProfessorType;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static ro.emanuel.simulare.universitate.utils.Strings.APPROVAL_ERROR;

@Getter
@Setter
public class Secretariat {

    private static final Secretariat SECRETARIAT = new Secretariat();
    private static RequestHandler handler;

    private List<String> specializari = new ArrayList<>();
    private List<Student> students = new ArrayList<>();
    private List<Profesor> professors = new ArrayList<>();

    private String name;

    private Secretariat() {
        this.name = "Universitatea Emanuel";
        addSpecializari();
        addProfesori();
    }

    private void addSpecializari() {
        this.specializari.add("Management");
        this.specializari.add("Informatica-Economica");
    }

    private void addProfesori() {
        Profesor asistent = new AsistentProfesor("Mihai");
        Profesor profesor = new ProfesorProfesor("Marcel");
        Profesor decan = new DecanProfesor("Ion");
        Profesor rector = new RectorProfesor("Ilie");

        RequestHandler handler0 = new RequestHandlerImpl(asistent);
        RequestHandler handler1 = new RequestHandlerImpl(profesor);
        RequestHandler handler2 = new RequestHandlerImpl(decan);
        RequestHandler handler3 = new RequestHandlerImpl(rector);

        handler0.next(handler1);
        handler1.next(handler2);
        handler2.next(handler3);

        this.handler = handler0;
        this.professors.add(asistent);
        this.professors.add(profesor);
        this.professors.add(decan);
        this.professors.add(rector);
    }

    public ApprovalResponse sendRequest(Request request) {
        Optional<Profesor> profs = getProfessors().stream()
                .filter(professor -> professor.getType().equals(ProfessorType.ASISTENT))
                .findFirst();

        if (profs.isPresent())
            return handler.approve(request);

        return new ApprovalResponse(APPROVAL_ERROR);
    }
    public static Secretariat getInstance() {
        return SECRETARIAT;
    }

    @Override
    public String toString() {
        return this.name;
    }
}

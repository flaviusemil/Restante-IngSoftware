package ro.emanuel.simulare.universitate.profesors;

import ro.emanuel.simulare.universitate.ApprovalResponse;
import ro.emanuel.simulare.universitate.utils.Profesor;
import ro.emanuel.simulare.universitate.Request;
import ro.emanuel.simulare.universitate.utils.ProfessorType;

public class AsistentProfesor extends Profesor {

    public AsistentProfesor(String name) {
        this.name = name;
        this.type = ProfessorType.ASISTENT;
    }

    @Override
    public ApprovalResponse approve(Request request) {
        return null;
    }
}

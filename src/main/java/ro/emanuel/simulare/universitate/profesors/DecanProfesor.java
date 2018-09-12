package ro.emanuel.simulare.universitate.profesors;

import ro.emanuel.simulare.universitate.ApprovalResponse;
import ro.emanuel.simulare.universitate.utils.Profesor;
import ro.emanuel.simulare.universitate.Request;
import ro.emanuel.simulare.universitate.utils.ProfessorType;

public class DecanProfesor extends Profesor {

    public DecanProfesor(String name) {
        this.name = name;
        this.type = ProfessorType.DECAN;
    }

    @Override
    public ApprovalResponse approve(Request request) {
        return null;
    }
}

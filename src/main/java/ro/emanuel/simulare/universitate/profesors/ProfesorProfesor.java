package ro.emanuel.simulare.universitate.profesors;

import ro.emanuel.simulare.universitate.utils.Profesor;
import ro.emanuel.simulare.universitate.utils.ProfessorType;

public class ProfesorProfesor extends Profesor {

    public ProfesorProfesor(String name) {
        this.name = name;
        this.type = ProfessorType.PROFESOR;
    }
}

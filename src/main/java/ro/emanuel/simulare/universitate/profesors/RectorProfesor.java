package ro.emanuel.simulare.universitate.profesors;

import ro.emanuel.simulare.universitate.utils.Profesor;
import ro.emanuel.simulare.universitate.utils.ProfessorType;

public class RectorProfesor extends Profesor {

    public RectorProfesor(String name) {
        this.name = name;
        this.type = ProfessorType.RECTOR;
    }
}

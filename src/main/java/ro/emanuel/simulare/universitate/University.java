package ro.emanuel.simulare.universitate;

import lombok.Getter;
import lombok.Setter;
import ro.emanuel.simulare.universitate.utils.Profesor;

import java.util.List;

@Getter
@Setter
public class University {

    private static final University university = new University();

    private University() {};

    protected Secretariat secretariat;
    protected List<String> specializari;
    protected List<Profesor> profesors;

    public static University getInstance() {
        return university;
    }

}

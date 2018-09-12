package ro.emanuel.simulare.universitate.utils;

import lombok.Getter;
import ro.emanuel.simulare.universitate.RequestApprover;

@Getter
public abstract class Profesor implements RequestApprover {
    protected ProfessorType type;
    protected String name;

    @Override
    public String toString() {
        return this.name;
    }
}

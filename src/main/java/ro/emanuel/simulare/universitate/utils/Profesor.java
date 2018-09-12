package ro.emanuel.simulare.universitate.utils;

import ro.emanuel.simulare.universitate.RequestApprover;

public abstract class Profesor implements RequestApprover {
    protected ProfessorType type;
    protected String name;
}

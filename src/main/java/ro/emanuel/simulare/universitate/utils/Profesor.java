package ro.emanuel.simulare.universitate.utils;

import lombok.Getter;
import ro.emanuel.simulare.universitate.ApprovalResponse;
import ro.emanuel.simulare.universitate.Request;
import ro.emanuel.simulare.universitate.RequestApprover;

import static ro.emanuel.simulare.universitate.utils.Strings.APPROVAL_SUCCESS;

@Getter
public abstract class Profesor implements RequestApprover {
    protected ProfessorType type;
    protected String name;

    @Override
    public ApprovalResponse approve(Request request) {
        if (request.getProfesor().equals(name))
            return new ApprovalResponse(APPROVAL_SUCCESS);

        return new ApprovalResponse(RequestStatus.NOT_COMPLETED);
    }

    @Override
    public String toString() {
        return this.name;
    }
}

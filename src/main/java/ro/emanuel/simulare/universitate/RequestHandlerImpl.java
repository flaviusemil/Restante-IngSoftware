package ro.emanuel.simulare.universitate;

import ro.emanuel.simulare.universitate.utils.Profesor;

import static ro.emanuel.simulare.universitate.utils.RequestStatus.NOT_COMPLETED;
import static ro.emanuel.simulare.universitate.utils.Strings.APPROVAL_ERROR;

public class RequestHandlerImpl implements RequestHandler {

    private Profesor approver;
    private RequestHandler next;

    public RequestHandlerImpl(Profesor profesor) {
        this.approver = profesor;
    }

    @Override
    public ApprovalResponse approve(Request request) {

        ApprovalResponse response = this.approver.approve(request);

        if (response.getStatus().equals(NOT_COMPLETED)) {
            if (next == null)
                return new ApprovalResponse(APPROVAL_ERROR);

            return next.approve(request);
        }

        return response;
    }

    @Override
    public void next(RequestHandler handler) {
        this.next = handler;
    }
}

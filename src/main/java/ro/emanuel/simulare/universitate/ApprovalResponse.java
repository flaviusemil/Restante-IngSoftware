package ro.emanuel.simulare.universitate;

import lombok.Getter;
import lombok.Setter;
import ro.emanuel.simulare.universitate.utils.RequestStatus;

@Getter
@Setter
public class ApprovalResponse {

    public ApprovalResponse(String message) {
        this.setStatus(RequestStatus.COMPLETED);
        this.setMessage(message);
    }

    private RequestStatus status;
    private String message;
}

package ro.emanuel.simulare.universitate;

public interface RequestHandler {
    ApprovalResponse approve(Request request);
    void next(RequestHandler handler);
}

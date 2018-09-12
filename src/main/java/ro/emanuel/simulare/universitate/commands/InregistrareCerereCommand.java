package ro.emanuel.simulare.universitate.commands;

import ro.emanuel.simulare.universitate.ApprovalResponse;
import ro.emanuel.simulare.universitate.ConsoleCommand;
import ro.emanuel.simulare.universitate.Request;
import ro.emanuel.simulare.universitate.Secretariat;

import java.util.Scanner;

public class InregistrareCerereCommand extends ConsoleCommand {

    private static final Scanner in = new Scanner(System.in);
    private static final Secretariat SECRETARIAT = Secretariat.getInstance();

    public InregistrareCerereCommand() {
        name = "Inregistrare cerere";
    }

    @Override
    public void execute() {
        System.out.println("Introduceti mesajul cerererii:");
        String mesaj = in.nextLine();
        System.out.print("Nume profesor: ");
        String professor = in.nextLine();

        Request request = new Request(professor, mesaj);
        ApprovalResponse response = SECRETARIAT.sendRequest(request);
        System.out.println(response.getMessage() + "\n");
    }
}

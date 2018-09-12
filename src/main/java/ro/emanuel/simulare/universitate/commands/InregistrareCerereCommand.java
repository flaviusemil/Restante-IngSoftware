package ro.emanuel.simulare.universitate.commands;

import ro.emanuel.simulare.universitate.ConsoleCommand;
import ro.emanuel.simulare.universitate.Request;
import ro.emanuel.simulare.universitate.University;

import java.util.Scanner;

public class InregistrareCerereCommand extends ConsoleCommand {

    private static final Scanner in = new Scanner(System.in);
    private static final University university = University.getInstance();

    public InregistrareCerereCommand() {
        name = "Inregistrare cerere";
    }

    @Override
    public void execute() {
        System.out.println("Introduceti mesajul cerererii:");
        String mesaj = in.nextLine();
        System.out.print("Nume profesor: ");
        String profesorName = in.nextLine();

        Request request = new Request(profesorName, mesaj);
        university.getSecretariat().sendRequest(request);
    }
}

package ro.emanuel.simulare.universitate.commands;

import ro.emanuel.simulare.universitate.Request;
import ro.emanuel.simulare.universitate.ConsoleCommand;

import java.util.Scanner;

public class InregistrareCerereCommand extends ConsoleCommand {

    private static final Scanner in = new Scanner(System.in);

    public InregistrareCerereCommand() {
        name = "Inregistrare cerere";
    }

    @Override
    public void execute() {
        System.out.println("Introduceti mesajul cerererii:");
        String mesaj = in.nextLine();

        Request request = new Request(mesaj);
    }
}

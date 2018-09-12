package ro.emanuel.simulare.universitate;

import ro.emanuel.simulare.universitate.commands.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import static java.util.Optional.empty;

public class Console {

    private static final List<ConsoleCommand> commands = new ArrayList<>();
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        initCommands();
        init();
    }

    private static void init() {
        Optional<ConsoleCommand> command;
        do {
            printWelcomeMessage();
            printConsoleCarrige();
            command = getCommand(in.nextInt());
            command.ifPresent(ConsoleCommand::execute);
        } while (command.isPresent());
    }

    private static void initCommands() {
        commands.add(new InscriereStudentCommand());
        commands.add(new InformatiiDespreStudentCommand());
        commands.add(new AfisareSpecializariCommand());
        commands.add(new AfisareProfesoriCommand());
        commands.add(new InregistrareCerereCommand());
    }

    private static Optional<ConsoleCommand> getCommand(int i) {
        if (i == 0 || i > commands.size())
            return empty();

        return Optional.of(commands.get(i - 1));
    }

    static void printWelcomeMessage() {
        System.out.println("Welcome to Emanuel University Portal!");
        System.out.println("Please select your desired operation from the list below:\n");
        printOptions();
        System.out.println("Note: to exit the app, insert any other number.");
        System.out.println();
    }

    public static void printConsoleCarrige() {
        System.out.print("> ");
    }

    private static void printOptions() {
        commands.forEach(command -> {
            int index = commands.indexOf(command);
            System.out.println(formatCommandNumber(index) + command.name);
        });
    }

    private static String formatCommandNumber(int n) {
        return (n + 1) + ". ";
    }
}

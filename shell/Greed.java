package shell;

public class Greed {
  final static String PURPLE = "\u001B[35m";
  final static String RESET = "\u001B[0m";

  public static void PrintAsciiArt() {
    String[] lines = {
    PURPLE +  " __          __  _                            _______           _           _     " + RESET,
    PURPLE +  " \\ \\        / / | |                          |__   __|         | |         | |    " + RESET,
    PURPLE +  "  \\ \\  /\\  / /__| | ___ ___  _ __ ___   ___     | | ___        | | __ _ ___| |__  " + RESET,
    PURPLE +  "   \\ \\/  \\/ / _ \\ |/ __/ _ \\| '_ ` _ \\ / _ \\    | |/ _ \\   _   | |/ _` / __| '_ \\ " + RESET,
    PURPLE +  "    \\  /\\  /  __/ | (_| (_) | | | | | |  __/    | | (_) | | |__| | (_| \\__ \\ | | |" + RESET,
    PURPLE +  "     \\/  \\/ \\___|_|\\___\\___/|_| |_| |_|\\___|    |_|\\___/   \\____/ \\__,_|___/_| |_|" + RESET,
    PURPLE +  "                                                                                  " + RESET,
    PURPLE +  "                                                                                  " + RESET
    };

    for (String line : lines) {
     System.out.println(line);
    }
  }
}

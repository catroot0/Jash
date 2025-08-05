package shell;

import java.util.Arrays;

public class CommandHandler {
  private static String[] commands = {"exit", "clear"};

  public static void HandleCommand(String command) {
    switch (command) {
      case "exit":
          Exit();
        break;
      case "clear":
          Clear();
        break;
    }
  }

  public static boolean Validate(String command) {
    String clearedCommand = command.trim().toLowerCase();
    boolean commandExist = Arrays.asList(commands).contains(clearedCommand);

    if (commandExist)
      return true;
    else 
      return false;
  }

  private static void Exit() {
    System.exit(0);
  }

  private static void Clear() {
    try {
      if (System.getProperty("os.name").startsWith("Windows")) {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
      } else {
        new ProcessBuilder("clear").inheritIO().start().waitFor();
      }
    } catch (Exception error) {
      System.err.println(error);
    }
  }

  public static void SendError(String commandName) {
    System.out.format("Command \'%s\' does not exist!\n", commandName);
  }
}

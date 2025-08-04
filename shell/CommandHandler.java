package shell;

import java.util.Arrays;

public class CommandHandler {
  private static String[] commands = {"exit"};

  public static boolean HandleExit(String command) {
    if (command.toLowerCase().equals("exit")) {
      return true;
    } else {
      return false;
    }
  }

  public static boolean IsValidCommand(String command) {
    boolean commandExist = Arrays.asList(commands).contains(command);

    if (commandExist)
      return true;
    else 
      return false;
  }

  public static void SendError(String commandName) {
    System.out.format("Command \'%s\' does not exist!\n", commandName);
  }
}

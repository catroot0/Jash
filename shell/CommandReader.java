package shell;

import java.util.Scanner;

public class CommandReader {
  private Scanner scanner = new Scanner(System.in);

  public void ReadCommand() {
    while (true) {
      System.out.print("> ");
      String command = scanner.nextLine();

      boolean isValidCommand = CommandHandler.IsValidCommand(command);
      if (!isValidCommand) CommandHandler.SendError(command);

      boolean isExit = CommandHandler.HandleExit(command);
      
      if (isExit) break;
    }
  }
}

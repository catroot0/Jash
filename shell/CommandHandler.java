package shell;

public class CommandHandler {

  public static void HandleCommand(String command) {
    String clearedCommand = command.trim().toLowerCase();
    switch (clearedCommand) {
      case "exit":
          Exit();
        break;
      case "clear":
          Clear();
        break;
      case "help":
          Help();
        break;
      case "whoami":
          WhoAmI();
        break;
      default:
        System.out.println("Command '" + command + "' does not exist!");
    }
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

  private static void Help() {
    System.out.println("Available commands:");
    System.out.println("- help: shows the available commands.");
    System.out.println("- exit: exits the shell.");
    System.out.println("- clear: clears the shell.");
    System.out.println("- whoami: tell you the name of the user you are currently using.");
  }

  private static void WhoAmI() {
    String userName = System.getProperty("user.name");
    System.out.format("You are %s\n", userName);
  }
}

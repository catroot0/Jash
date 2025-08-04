package shell;

public class HandleCommand {
  public static boolean HandleExit(String command) {
    if (command.toLowerCase().equals("exit")) {
      return true;
    } else {
      return false;
    }
  }
}

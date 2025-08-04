package shell;

public class Main {
  public static void main(String[] args) {
    System.out.println("Welcome to jash!");
    var commandReader = new CommandReader(); // using var because its cleaner

    commandReader.ReadCommand();
  }
}
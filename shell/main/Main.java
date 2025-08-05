package shell.main;
import shell.CommandReader;
import shell.Greed;

public class Main {
  public static void main(String[] args) {
    Greed.PrintAsciiArt();
    var commandReader = new CommandReader();

    commandReader.ReadCommand();
  }
}
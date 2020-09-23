package hw7.command;

public class CommandHistoryFactory {
  private CommandHistoryFactory() {}
  static public CommandHistory newCommandHistory() {
    // TODO
    return new CommandHistoryObj();
  }
}

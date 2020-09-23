package hw7.command;

public class CommandHistoryFactory {
  private CommandHistoryFactory() {}
  static public CommandHistory newCommandHistory() {
    // Test of making some changes 
    return new CommandHistoryObj();
  }
}

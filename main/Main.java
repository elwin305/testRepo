package hw7.main;

import hw7.ui.UIFactory;
import hw7.ui.UI;
import hw7.data.Data;

public class Main {
  private Main() {}
  public static void main(String[] args) {
    UI ui;
    if (Math.random() <= 0.5) {
      ui = new hw7.ui.TextUI();
    } else {
      ui = new hw7.ui.PopupUI();
    }
    Control control = new Control(Data.newInventory(), ui);
    control.run();
  }
}

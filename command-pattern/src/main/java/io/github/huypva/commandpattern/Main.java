package io.github.huypva.commandpattern;

/**
 * @author huypva
 */
public class Main {

  public static void main(String[] args) {
    Receiver receiver = new Receiver();

    Command command1 = new Concrete1Command(receiver);
    command1.execute();

    Command command2 = new Concrete2Command(receiver);
    command2.execute();
  }
}

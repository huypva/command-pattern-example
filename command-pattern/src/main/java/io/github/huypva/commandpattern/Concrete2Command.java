package io.github.huypva.commandpattern;

import lombok.AllArgsConstructor;

/**
 * @author huypva
 */
@AllArgsConstructor
public class Concrete2Command implements Command {

  Receiver receiver;

  @Override
  public void execute() {
    this.receiver.execute2();
  }
}

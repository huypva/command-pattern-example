package io.github.huypva.commandpattern;

import lombok.AllArgsConstructor;

/**
 * @author huypva
 */
@AllArgsConstructor
public class Concrete1Command implements Command {

  Receiver receiver;

  @Override
  public void execute() {
    this.receiver.execute1();
  }
}

package io.github.huypva.commandpattern;

import lombok.extern.slf4j.Slf4j;

/**
 * @author huypva
 */
@Slf4j
public class Receiver {

  public void execute1() {
    log.info("Receiver execute1");
  }

  public void execute2() {
    log.info("Receiver execute2");
  }
}

package ch.ivyteam.di.uni.impl;

import ch.ivyteam.di.uni.Manager;
import ch.ivyteam.di.uni.NiceService;

public class NiceServiceImpl extends AbstractService implements NiceService {

  public NiceServiceImpl(Manager manager) {
    super(manager, "Nice");
  }
}

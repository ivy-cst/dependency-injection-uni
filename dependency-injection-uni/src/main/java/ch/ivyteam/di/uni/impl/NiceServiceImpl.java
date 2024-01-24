package ch.ivyteam.di.uni.impl;

import ch.ivyteam.di.uni.Manager;
import ch.ivyteam.di.uni.NiceService;
import jakarta.inject.Inject;

public class NiceServiceImpl extends AbstractService implements NiceService {

  @Inject
  public NiceServiceImpl(Manager manager) {
    super(manager, "Nice");
  }
}

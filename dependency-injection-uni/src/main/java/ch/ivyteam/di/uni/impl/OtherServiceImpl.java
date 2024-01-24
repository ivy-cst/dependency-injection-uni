package ch.ivyteam.di.uni.impl;

import ch.ivyteam.di.uni.Manager;
import ch.ivyteam.di.uni.OtherService;
import jakarta.inject.Inject;

public class OtherServiceImpl extends AbstractService implements OtherService {

  @Inject
  public OtherServiceImpl(Manager manager) {
    super(manager, "Other");
  }

  @Inject
  public void methodInjection() {
    System.out.println("Also executed after construction");
  }
}

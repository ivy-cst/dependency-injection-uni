package ch.ivyteam.di.uni.impl;

import ch.ivyteam.di.uni.Manager;
import ch.ivyteam.di.uni.OtherService;

public class OtherServiceImpl extends AbstractService implements OtherService {

  public OtherServiceImpl(Manager manager) {
    super(manager, "Other");
  }
}

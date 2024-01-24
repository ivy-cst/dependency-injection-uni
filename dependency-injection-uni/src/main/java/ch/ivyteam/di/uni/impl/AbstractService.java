package ch.ivyteam.di.uni.impl;

import ch.ivyteam.di.uni.Manager;
import ch.ivyteam.di.uni.Service;

public class AbstractService implements Service {

  private Manager manager;
  private String name;

  public AbstractService(Manager manager, String name) {
    this.manager = manager;
    this.name = name;
  }

  @Override
  public Manager manager() {
    return manager;
  }

  @Override
  public String name() {
    return name;
  }

  @Override
  public String info() {
    return manager + " " + this;
  }

  @Override
  public String toString() {
    return getClass().getSimpleName() + ":" + name;
  }
}

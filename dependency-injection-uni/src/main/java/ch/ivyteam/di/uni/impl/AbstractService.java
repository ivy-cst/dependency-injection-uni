package ch.ivyteam.di.uni.impl;

import ch.ivyteam.di.uni.Manager;
import ch.ivyteam.di.uni.Service;

public class AbstractService implements Service {

  private final Manager manager;
  private final String name;

  public AbstractService(Manager manager, String name) {
    this.manager = manager;
    this.name = name;
    System.out.println("Created " + info());
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
    return this + " of " + manager;
  }

  @Override
  public String toString() {
    return getClass().getSimpleName() + ":" + name;
  }
}

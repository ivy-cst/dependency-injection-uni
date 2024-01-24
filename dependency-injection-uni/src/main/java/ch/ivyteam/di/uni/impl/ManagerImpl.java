package ch.ivyteam.di.uni.impl;

import ch.ivyteam.di.uni.Manager;

public class ManagerImpl implements Manager {

  private final String name;

  public ManagerImpl(String name) {
    this.name = name;
  }

  @Override
  public String name() {
    return name;
  }

  @Override
  public String toString() {
    return getClass().getSimpleName() + ":" + name;
  }
}

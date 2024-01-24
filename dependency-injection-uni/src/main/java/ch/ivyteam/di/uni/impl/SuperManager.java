package ch.ivyteam.di.uni.impl;

import ch.ivyteam.di.uni.Manager;

//@Singleton
public class SuperManager implements Manager {

  public SuperManager() {
    System.out.println("Created Super Manager");
  }

  @Override
  public String name() {
    return "Super";
  }

  @Override
  public String toString() {
    return getClass().getSimpleName();
  }
}

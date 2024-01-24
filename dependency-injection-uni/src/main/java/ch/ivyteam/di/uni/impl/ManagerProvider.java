package ch.ivyteam.di.uni.impl;

import ch.ivyteam.di.uni.Manager;
import jakarta.inject.Inject;
import jakarta.inject.Provider;

public class ManagerProvider implements Provider<Manager>{

  @Inject
  private SuperManager manager;

  @Override
  public Manager get() {
    return manager;
  }}

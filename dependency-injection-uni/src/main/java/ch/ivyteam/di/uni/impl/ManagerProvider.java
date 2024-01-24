package ch.ivyteam.di.uni.impl;

import ch.ivyteam.di.uni.Manager;
import jakarta.inject.Provider;
import jakarta.inject.Singleton;

@Singleton
public class ManagerProvider implements Provider<Manager>{

  private Manager manager = new SuperManager();

  @Override
  public Manager get() {
    return manager;
  }}

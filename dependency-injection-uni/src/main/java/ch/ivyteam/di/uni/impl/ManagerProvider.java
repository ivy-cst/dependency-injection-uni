package ch.ivyteam.di.uni.impl;

import com.google.inject.Injector;

import ch.ivyteam.di.uni.Manager;
import jakarta.inject.Inject;
import jakarta.inject.Provider;

public class ManagerProvider implements Provider<Manager>{

  @Inject
  private Injector injector;

  @Override
  public Manager get() {
    return injector.getInstance(SuperManager.class);
  }}

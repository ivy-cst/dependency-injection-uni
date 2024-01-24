package ch.ivyteam.di.uni;

import com.google.inject.ImplementedBy;

import ch.ivyteam.di.uni.impl.SuperManager;

@ImplementedBy(SuperManager.class)
public interface Manager {

  String name();
}

package ch.ivyteam.di.uni;

import com.google.inject.ProvidedBy;

import ch.ivyteam.di.uni.impl.ManagerProvider;

@ProvidedBy(ManagerProvider.class)
public interface Manager {

  String name();
}

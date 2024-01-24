package ch.ivyteam.di.uni;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.google.inject.Guice;
import com.google.inject.Injector;

import ch.ivyteam.di.uni.impl.NiceServiceImpl;
import ch.ivyteam.di.uni.impl.OtherServiceImpl;
import ch.ivyteam.di.uni.impl.SuperManager;

class TestServices {

  private final Injector injector = Guice.createInjector();

  @Test
  void niceService() {
    Manager superManager = injector.getInstance(SuperManager.class);
    NiceService niceService = new NiceServiceImpl(superManager);
    assertEquals("Nice", niceService.name());
    assertEquals("Super", niceService.manager().name());
    assertEquals("NiceServiceImpl:Nice of SuperManager", niceService.info());
  }

  @Test
  void otherService() {
    Manager superManager = injector.getInstance(SuperManager.class);
    OtherService niceService = new OtherServiceImpl(superManager);
    assertEquals("Other", niceService.name());
    assertEquals("Super", niceService.manager().name());
    assertEquals("OtherServiceImpl:Other of SuperManager", niceService.info());
  }

}

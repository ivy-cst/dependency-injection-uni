package ch.ivyteam.di.uni;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import ch.ivyteam.di.uni.impl.NiceServiceImpl;
import ch.ivyteam.di.uni.impl.OtherServiceImpl;
import ch.ivyteam.di.uni.impl.SuperManager;

class TestServices {

  @Test
  void niceService() {
    Manager superManager = new SuperManager();
    NiceService niceService = new NiceServiceImpl(superManager);
    assertEquals("Nice", niceService.name());
    assertEquals("Super", niceService.manager().name());
    assertEquals("NiceServiceImpl:Nice of SuperManager", niceService.info());
  }

  @Test
  void otherService() {
    Manager superManager = new SuperManager();
    OtherService niceService = new OtherServiceImpl(superManager);
    assertEquals("Other", niceService.name());
    assertEquals("Super", niceService.manager().name());
    assertEquals("OtherServiceImpl:Other of SuperManager", niceService.info());
  }
}

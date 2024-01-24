package ch.ivyteam.di.uni;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import ch.ivyteam.di.uni.impl.ManagerImpl;
import ch.ivyteam.di.uni.impl.NiceServiceImpl;
import ch.ivyteam.di.uni.impl.OtherServiceImpl;

class TestServices {

  @Test
  void niceService() {
    Manager superManager = new ManagerImpl("Super");
    NiceService niceService = new NiceServiceImpl(superManager);
    assertEquals("Nice", niceService.name());
    assertEquals("Super", niceService.manager().name());
    assertEquals("ManagerImpl:Super NiceServiceImpl:Nice", niceService.info());
  }

  @Test
  void otherService() {
    Manager superManager = new ManagerImpl("Super");
    OtherService niceService = new OtherServiceImpl(superManager);
    assertEquals("Other", niceService.name());
    assertEquals("Super", niceService.manager().name());
    assertEquals("ManagerImpl:Super OtherServiceImpl:Other", niceService.info());
  }
}

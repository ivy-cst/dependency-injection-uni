package ch.ivyteam.di.uni;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

import ch.ivyteam.di.uni.impl.NiceServiceImpl;
import ch.ivyteam.di.uni.impl.OtherServiceImpl;

class TestServices {

  private static final Injector injector = Guice.createInjector(new TstManagerModule());

  @Test
  void niceService() {
//    Manager superManager = injector.getInstance(SuperManager.class);
    NiceService niceService = injector.getInstance(NiceServiceImpl.class);
    assertEquals("Nice", niceService.name());
    assertEquals("Super", niceService.manager().name());
    assertEquals("NiceServiceImpl:Nice of SuperManager", niceService.info());
  }

  @Test
  void otherService() {
//    Manager superManager = injector.getInstance(SuperManager.class);
    OtherService niceService = injector.getInstance(OtherServiceImpl.class);
    assertEquals("Other", niceService.name());
    assertEquals("Super", niceService.manager().name());
    assertEquals("OtherServiceImpl:Other of SuperManager", niceService.info());
  }


  @Test
  void withoutDi() {
    TestManager manager = new TestManager();
    NiceService service = new NiceServiceImpl(manager);
    assertEquals("Test", manager.name());
    assertEquals("Nice", service.name());
  }


  static class TstManagerModule extends AbstractModule {
    @Override
    protected void configure() {
//      bind(Manager.class).to(TestManager.class);
    }

  }
}

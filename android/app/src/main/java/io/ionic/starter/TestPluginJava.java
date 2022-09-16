package io.ionic.starter;

import com.getcapacitor.Plugin;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin
public class TestPluginJava extends Plugin {

  @Override
  public void load() {
    super.load();

    System.out.println("TEST PLUGIN JAVA INIT");
  }
}

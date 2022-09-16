package io.ionic.starter;

import android.os.Bundle;

import com.getcapacitor.BridgeActivity;

public class MainActivity extends BridgeActivity {
  @Override
  public void onCreate(Bundle savedInstanceState) {
    registerPlugin(TestPlugin.class); // This fails with "cannot find symbol class TestPlugin"
    registerPlugin(TestPluginJava.class);
    super.onCreate(savedInstanceState);
  }
}

package io.ionic.starter

import com.getcapacitor.Plugin
import com.getcapacitor.annotation.CapacitorPlugin

@CapacitorPlugin
class TestPlugin : Plugin() {

  override fun load() {
    super.load()

    println("TEST PLUGIN INIT")
  }
}

package computerdatabase

import io.gatling.app.Gatling
import io.gatling.core.config.GatlingPropertiesBuilder

object GatlingRun extends App {

  val simulationClass = classOf[AdvancedSimulation].getName

  val gatlingProperties = new GatlingPropertiesBuilder()
    .simulationClass(simulationClass)
    .build

  Gatling.fromMap(gatlingProperties)
}

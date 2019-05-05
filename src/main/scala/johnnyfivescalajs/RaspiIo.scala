package johnnyfivescalajs

import johnnyfivescalajs.JohnnyFive.IO

import scala.scalajs.js
import scala.scalajs.js.annotation._


@js.native
@JSImport("raspi-io", JSImport.Namespace)
object RaspiIo extends js.Object {


  def RaspiIo(): RaspiIo = js.native


  @js.native
  class RaspiIo protected() extends IO{

  }

}

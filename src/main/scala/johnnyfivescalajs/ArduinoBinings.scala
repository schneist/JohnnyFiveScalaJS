package johnnyfivescalajs

import java.nio.Buffer

import scala.concurrent.Future
import scala.scalajs.js

class AndroidCompBindings() extends AbstractBinding {


  override def constructor(opt: Options): Unit = ???

  override def open(path: String, options: Options): Future[Unit] = ???

  override def close(): Future[Unit] = ???

  override def read(buffer: Buffer, offset: Int, length: Int): Future[Buffer] = ???

  override def write(buffer: Buffer): Future[Unit] = ???

  override def update(options: Options): Future[Unit] = ???

  override def set(options: Options): Future[Unit] = ???

  override def get(): Future[Flags] = ???

  override def getBaudRate(): Future[Int] = Future.successful(5600)

  override def flush(): Future[Unit] = ???

  override def drain(): Future[Unit] = ???

  override def list(): Future[List[PortInfo]] = ???
}



trait Flags extends js.Object{
  val brk :js.UndefOr[Boolean] = js.undefined
  val cts :js.UndefOr[Boolean] = js.undefined
  val dtr :js.UndefOr[Boolean] = js.undefined
  val dts :js.UndefOr[Boolean] = js.undefined
  val rts :js.UndefOr[Boolean] = js.undefined
}

object DefaultFlags extends Flags {
  override val brk = false
  override val cts = false
  override val dtr = true
  override val dts = false
  override val rts = true
}

trait Options extends js.Object {
  val autoOpen :js.UndefOr[Boolean] = js.undefined
  val baudRare:js.UndefOr[Int] = js.undefined
  val dataBits :js.UndefOr[Int] = js.undefined
  val hupcl :js.UndefOr[Boolean] = js.undefined
  val lock :js.UndefOr[Boolean] = js.undefined
  val parity :js.UndefOr[String] = js.undefined
  val rtscts :js.UndefOr[Boolean] = js.undefined
  val stopBits  :js.UndefOr[Int] = js.undefined
  val xany :js.UndefOr[Boolean] = js.undefined
  val xoff :js.UndefOr[Boolean] = js.undefined
  val xon :js.UndefOr[Boolean] = js.undefined
  val highWaterMark :js.UndefOr[Int] = js.undefined

}

object DefaultOptions extends js.Object {
  val autoOpen = true
  val baudRare = 9600
  val dataBits =  8
  val hupcl = true
  val lock=  true
  val parity = "none"
  val rtscts = false
  val stopBits = 1
  val xany= false
  val xoff= false
  val xon = false
  val highWaterMark =  64 * 1024

}

trait PortInfo extends js.Object {
  val comName:js.UndefOr[String] = js.undefined
  val manufacturer: js.UndefOr[String] = js.undefined
  val serialNumber: js.UndefOr[String] = js.undefined
  val pnpId : js.UndefOr[String] = js.undefined
  val locationId : js.UndefOr[String] = js.undefined
  val vendorId : js.UndefOr[String] = js.undefined
  val productId : js.UndefOr[String] = js.undefined
}

trait AbstractBinding  extends  js.Object{





  def list(): Future[List[PortInfo]]

  def constructor(opt: Options)

  /**
    * Opens a connection to the serial port referenced by the path. Future resolves after the port is opened, configured and ready for use.
    * @param {string} path the path or com port to open
    * @param {Options} options Options for the serialport
    * @returns {Future} Resolves after the port is opened and configured.
    */
  def open(path: String, options: Options): Future[Unit]

  /**
    * Closes an open port
    */
  def close(): Future[Unit]

  /**
    * Request a number of bytes from the SerialPort. This function is similar to Node's [`fs.read`](http://nodejs.org/api/fs.html#fs_fs_read_fd_buffer_offset_length_position_callback) except it will always return at least one byte.

The in progress reads must error when the port is closed with an error object that has the property `canceled` equal to `true`. Any other error will cause a disconnection.

    * @param {buffer} buffer Accepts a [`Buffer`](http://nodejs.org/api/buffer.html) object.
    * @param {integer} offset The offset in the buffer to start writing at.
    * @param {integer} length Specifies the maximum number of bytes to read.
    * @returns {Future} Resolves with the number of bytes read after a read operation.
    */
  def read(buffer: Buffer, offset: Int, length: Int): Future[Buffer]

  /**
    * Write bytes to the SerialPort. Only called when there is no pending write operation.

The in progress writes must error when the port is closed with an error object that has the property `canceled` equal to `true`. Any other error will cause a disconnection.

    * @param {buffer} buffer - Accepts a [`Buffer`](http://nodejs.org/api/buffer.html) object.
    * @returns {Future} Resolves after the data is passed to the operating system for writing.
    */
  def write(buffer: Buffer): Future[Unit]


  /**
    * Changes connection settings on an open port. Only `baudRate` is supported.
    * @returns {Future} Resolves once the port's baud rate changes.
    */
  def update(options: Options): Future[Unit]

  /**
    * Set control flags on an open port.
    * @param {object=} options All options are operating system default when the port is opened. Every flag is set on each call to the provided or default values. All options are always provided.
    * @param {Boolean} [options.brk=false] flag for brk
    * @param {Boolean} [options.cts=false] flag for cts
    * @param {Boolean} [options.dsr=false] flag for dsr
    * @param {Boolean} [options.dtr=true] flag for dtr
    * @param {Boolean} [options.rts=true] flag for rts
    * @returns {Future} Resolves once the port's flags are set.
    */
  def set(options :Options): Future[Unit]

  /**
    * Get the control flags (CTS, DSR, DCD) on the open port.
    * @returns {Future} Resolves with the retrieved flags.
    */
  def get(): Future[Flags]

  /**
    * Get the OS reported baud rate for the open port. Used mostly for debugging custom baud rates.
    */
  def getBaudRate(): Future[Int]

  /**
    * Flush (discard) data received but not read, and written but not transmitted.
    * @returns {Future} Resolves once the flush operation finishes.
    */
  def flush(): Future[Unit]

  /**
    * Drain waits until all output data is transmitted to the serial port. An in progress write should be completed before this returns.
    * @returns {Future} Resolves once the drain operation finishes.
    * @throws {TypeError} When given invalid arguments, a `TypeError` is thrown.
    */
  def drain():Future[Unit]
}
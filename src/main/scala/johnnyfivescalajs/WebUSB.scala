
/*
package johnnyfivescalajs

import scala.concurrent.Future
import scala.scalajs.js
import scala.scalajs.js.Promise
import scala.scalajs.js.annotation._


@js.native
@JSImport("webusb", JSImport.Namespace)
object WebUSB extends js.Object {


  @js.native
  class USB protected() extends js.Object {
    def this() = this()

    def getDevices(): Promise[Array[USBDevice]]
  }


  @js.native
  class USBDevice protected() extends js.Object {

    /**
      * Major USB protocol version supported by the device
      */
    var  usbVersionMajor: Int = js.native

    /**
      * Minor USB protocol version supported by the device
      */
    var usbVersionMinor: Int = js.native

    /**
      * Sub minor USB protocol version supported by the device
      */
    var usbVersionSubminor: Int = js.native

    /**
      * Communication interface class of the device
      */
    var deviceClass: Int = js.native

    /**
      * Communication interface sub class of the device
      */
    var deviceSubclass: Int = js.native

    /**
      * Communication interface protocol of the device
      */
    var deviceProtocol : Int = js.native

    /**
      * Vendor Identifier of the device
      */
    var vendorId: Int = js.native

    /**
      * Product Identifier of the device
      */
    var productId: Int = js.native

    /**
      * Major version of the device
      */
    var deviceVersionMajor: Int = js.native

    /**
      * Minor version of the device
      */
    var deviceVersionMinor: Int = js.native

    /**
      * Sub minor version of the device
      */
    var deviceVersionSubminor: Int = js.native

    /**
      * Manufacturer name of the device
      */
    var manufacturerName: String = js.native

    /**
      * Product name of the device
      */
    var productName: String = js.native

    /**
      * Serial Int of the device
      */
    var serialNumber: String = js.native


    /**
      * List of configurations supported by the device
      */
    def configurations : Array[USBConfiguration]  = js.native


    /**
      * The currently selected configuration
      */
    def configuration(): USBConfiguration  = js.native


    /**
      * A flag indicating whether the device is open
      */
    def opened(): Boolean = js.native

    /**
      * URL advertised by the device (not part of Web USB specification)
      */
    var url: String = js.native



    /**
      * Opens the device
      */
    def  open(): Future[Unit]  = js.native

    /**
      * Closes the device
      */
    def close(): Future[Unit]  = js.native

    /**
      * Select a configuration for the device
      * @param configurationValue The configuration value to select
      * @returns Promise containing any error
      */
    def  selectConfiguration(configurationValue: Int): Future[Unit]  = js.native

    /**
      * Claim an interface on the device
      * @param interfaceNumber The interface Int to claim
      * @returns Promise containing any error
      */
    def  claimInterface(interfaceNumber: Int): Future[Unit]  = js.native

    /**
      * Release an interface on the device
      * @param interfaceNumber The interface Int to release
      * @returns Promise containing any error
      */
    def  releaseInterface(interfaceNumber: Int): Future[Unit]  = js.native

    /**
      * Select an alternate interface on the device
      * @param interfaceNumber The interface Int to change
      * @param alternateSetting The alternate setting to use
      * @returns Promise containing any error
      */
    def  selectAlternateInterface(interfaceNumber: Int, alternateSetting: Int): Future[Unit]  = js.native

    /**
      * Undertake a control transfer in from the device
      *
      * __Note:__ The transfer result currently has a status always set to "ok"
      *
      * @param setup The USB control transfer parameters
      * @param length The amount of data to transfer
      * @returns Promise containing a result
      */
    def  controlTransferIn(setup: USBControlTransferParameters, length: Int): Future[USBInTransferResult]  = js.native

    /**
      * Undertake a control transfer out to the device
      *
      * __Note:__ The transfer result currently has a status always set to "ok" and the bytesWritten always set to the length of the data
      *
      * @param setup The USB control transfer parameters
      * @param data The data to transfer
      * @returns Promise containing a result
      */
    def  controlTransferOut(setup: USBControlTransferParameters, data: BufferSource): Promise[USBOutTransferResult] = js.native

    /**
      * Clear a halt condition on an endpoint
      *
      * @param direction The direction of the endpoint to clear
      * @param endpointNumber The endpoint Int of the endpoint to clear
      * @returns Promise containing any error
      */
    def  clearHalt(direction: USBDirection, endpointNumber: Int): Future[Unit]  = js.native

    /**
      * Undertake a transfer in from the device
      *
      * __Note:__ The transfer result currently has a status always set to "ok"
      *
      * @param endpointNumber The Int of the endpoint to transfer from
      * @param length The amount of data to transfer
      * @returns Promise containing a result
      */
    def  transferIn(endpointNumber: Int, length: Int): Promise[USBInTransferResult] = js.native

    /**
      * Undertake a transfer out to the device
      *
      * __Note:__ The transfer result currently has a status always set to "ok" and the bytesWritten always set to the length of the data
      *
      * @param endpointNumber The Int of the endpoint to transfer to
      * @param data The data to transfer
      * @returns Promise containing a result
      */
    def  transferOut(endpointNumber: Int, data: BufferSource): Promise[USBOutTransferResult] = js.native

    /**
      * @hidden
      * Undertake an isochronous transfer in from the device
      * @param endpointNumber The Int of the endpoint to transfer from
      * @param packetLengths An array of packet lengths outlining the amount to transfer
      * @returns Promise containing a result
      */
    def  isochronousTransferIn(endpointNumber: Int, packetLengths: Array[Int]): Promise[USBIsochronousInTransferResult] = js.native

    /**
      * @hidden
      * Undertake an isochronous transfer out to the device
      * @param endpointNumber The Int of the endpoint to transfer to
      * @param data The data to transfer
      * @param packetLengths An array of packet lengths outlining the amount to transfer
      * @returns Promise containing a result
      */
    def  isochronousTransferOut(endpointNumber: Int, data: BufferSource, packetLengths: Array[Int]): Promise[USBIsochronousOutTransferResult] = js.native

    /**
      * Soft reset the device
      * @returns Promise containing any error
      */
    def  reset(): Future[Unit]  = js.native
  }

  @js.native
  class USBControlTransferParameters

  @js.native
  class BufferSource

  @js.native
  class USBOutTransferResult

  @js.native
  class USBIsochronousInTransferResult

  @js.native
  class USBIsochronousOutTransferResult

  @js.native
  class USBInTransferResult

  @js.native
  class USBDirection

  @js.native
  class USBConfiguration

}


*/
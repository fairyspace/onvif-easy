package io.github.fairyspace.soap.ver10.device;


import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"manufacturer", "model", "firmwareVersion", "serialNumber", "hardwareId"})
@XmlRootElement(name = "GetDeviceInformationResponse")
public class GetDeviceInformationResponse {

    @XmlElement(name = "Manufacturer", required = true)
    protected String manufacturer;
    @XmlElement(name = "Model", required = true)
    protected String model;
    @XmlElement(name = "FirmwareVersion", required = true)
    protected String firmwareVersion;
    @XmlElement(name = "SerialNumber", required = true)
    protected String serialNumber;
    @XmlElement(name = "HardwareId", required = true)
    protected String hardwareId;

    public String getManufacturer() {
        return manufacturer;
    }
    public void setManufacturer(String value) {
        this.manufacturer = value;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String value) {
        this.model = value;
    }
    public String getFirmwareVersion() {
        return firmwareVersion;
    }
    public void setFirmwareVersion(String value) {
        this.firmwareVersion = value;
    }
    public String getSerialNumber() {
        return serialNumber;
    }
    public void setSerialNumber(String value) {
        this.serialNumber = value;
    }
    public String getHardwareId() {
        return hardwareId;
    }
    public void setHardwareId(String value) {
        this.hardwareId = value;
    }
}

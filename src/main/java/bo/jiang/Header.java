package bo.jiang;

/**
 * @author shumpert.jiang
 */
public class Header {
  private String uuid;
  private String serviceId;
  private ReturnCode returnCode;

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public void setServiceId(String serviceId) {
    this.serviceId = serviceId;
  }

  public void setReturnCode(ReturnCode returnCode) {
    this.returnCode = returnCode;
  }

  public String getUuid() {
    return uuid;
  }

  public String getServiceId() {
    return serviceId;
  }

  public ReturnCode getReturnCode() {
    return returnCode;
  }
}

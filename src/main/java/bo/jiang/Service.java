package bo.jiang;

/**
 * @author shumpert.jiang
 */
public class Service {
  private String serviceId;
  private Class<? extends IService> clazz;

  public Service(String serviceId, Class clazz) {
    this.serviceId = serviceId;
    this.clazz = clazz;
  }

  public String getServiceId() {
    return serviceId;
  }

  public Class getClazz() {
    return clazz;
  }

  public void setServiceId(String serviceId) {
    this.serviceId = serviceId;
  }

  public void setClazz(Class clazz) {
    this.clazz = clazz;
  }
}

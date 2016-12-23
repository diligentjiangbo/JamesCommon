package bo.jiang;

/**
 * @author shumpert.jiang
 */
public enum ReturnCode {
  SUCCESS("James-001", "SUCCESS"),
  ERROR("James-002", "ERROR");

  private String code;
  private String description;

  ReturnCode(String code, String description) {
    this.code = code;
    this.description = description;
  }

  public String getCode() {
    return code;
  }

  public String getDescription() {
    return description;
  }

  @Override
  public String toString() {
    return code + ":" + description;
  }
}

package bo.jiang;

/**
 * @author shumpert.jiang
 */
public enum MsgType {
  SERVICE(1),
  REQUEST(2),
  RESPONSE(3);

  private int index;

  MsgType(int index) {
    this.index = index;
  }

  public int getIndex() {
    return index;
  }

  public static MsgType getByIndex(int index) {
    for (MsgType msgType : MsgType.values()) {
      if (msgType.getIndex() == index) {
        return msgType;
      }
    }
    return null;
  }

}

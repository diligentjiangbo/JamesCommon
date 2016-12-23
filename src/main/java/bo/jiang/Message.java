package bo.jiang;

/**
 * @author shumpert.jiang
 */
public class Message {
  private Header header;
  private byte[] body;

  public Message() {
    this.header = new Header();
  }


  public void setBody(byte[] body) {
    this.body = body;
  }


  public byte[] getBody() {
    return body;
  }

  public Header getHeader() {
    return header;
  }

  public void setHeader(Header header) {
    this.header = header;
  }
}

package common;

/** Represents a message created by a MessageMaker. */
public class Message {
  /** The message. */
  private final String mMessage;

  /**
   * Initialize a Message.
   *
   * @param msg the message string.
   */
  public Message(String msg) {
    mMessage = msg;
  }

  /** @return the message. */
  public String getMessage() {
    return mMessage;
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return getMessage();
  }
}

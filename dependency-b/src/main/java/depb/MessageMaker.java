package depb;

import common.Message;

/**
 * Makes a message for display by the app.
 */
public class MessageMaker {
  private Message mMessage = null;

  /** @return the message string to display. */
  public Message getMessage() {
    if (null == mMessage) {
      throw new RuntimeException("Message isn't created yet");
    }

    return mMessage;
  }

  /** Create a message to return from getMessage(). */
  public void createMessage() {
    mMessage = new Message("We're back with more from 'dependency B'.");
  }
}

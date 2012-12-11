package depa;

import common.Message;

/**
 * Makes a message for display by the app.
 */
public class MessageMaker {
  /** @return the message string to display. */
  public Message getMessage() {
    return new Message("And now, a message from our sponsor, 'dependency A'.");
  }
}

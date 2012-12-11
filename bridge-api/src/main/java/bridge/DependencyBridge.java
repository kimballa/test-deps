
package bridge;

import common.Message;

/**
 * Bridge that uses the MessageMaker from one dependency or another.
 */
public abstract class DependencyBridge {

  /** @return a Message from the MessageMaker. */
  public abstract Message getMessage();

}


package bridgea;

import bridge.DependencyBridge;
import common.Message;
import depa.MessageMaker;

/** Bridge to the "A" implementation. **/
public class BridgeImplA extends DependencyBridge {
  /** {@inheritDoc} */
  @Override
  public Message getMessage() {
    return new MessageMaker().getMessage();
  }
}


package bridgea;

import bridge.BridgeFactory;
import bridge.DependencyBridge;
import common.Message;

/** Factory class that creates a BridgeImplA if it's appropriate to do so. */
public class BridgeAFactory extends BridgeFactory {
  /** {@inheritDoc} */
  @Override
  public int getPriority(String runtimeHint) {
    if (runtimeHint.equals("A")) {
      return 1000; // Very confident; the runtime version is the right one.
    }

    return 0; // Don't know how to provide a bridge to this runtime version.
  }

  /** {@inheritDoc} */
  @Override
  public DependencyBridge newBridge() {
    // Only classload the bridge if we're selected. Do this at runtime.
    try {
      Class<? extends DependencyBridge> klazz =
          (Class<? extends DependencyBridge>) Class.forName("bridgea.BridgeImplA");
      return klazz.newInstance();
    } catch (Exception e) {
      throw new RuntimeException("Couldn't load DependencyBridge", e);
    }
  }
}

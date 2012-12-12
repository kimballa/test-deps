package mainapi;

import bridge.BridgeFactory;
import bridge.DependencyBridge;
import common.DepVersion;
import delegation.PriorityLoader;

/**
 * Our main "library" -- this interfaces with one of either
 * dependency-a or dependency-b through a bridge API.
 */
public class MainApi {
  /** @return a friendly message from our sponsor. */
  public String getMessageString() {
    // Load the appropriate dependency bridge based on the DepVersion class actually
    // present on the classpath, from dependency-a or dependency-b.  In practice,
    // these next two lines (and better error checking!) would both be wrapped in a
    // convenient wrapper for use by real API library methods like getMessageString().
    BridgeFactory bridgeFactory = PriorityLoader.get().loadProvider(BridgeFactory.class,
        new DepVersion().getVersion());
    DependencyBridge bridge = bridgeFactory.newBridge();

    return bridge.getMessage().toString();
  }
}

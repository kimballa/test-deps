
package bridge;

import delegation.PriorityProvider;

/**
 * Factory for bridge implementations.
 */
public abstract class BridgeFactory implements PriorityProvider {

  /**
   * @return our confidence we can create the right DependencyBridge based on
   *     the dependency runtime version.
   */
  @Override
  public abstract int getPriority(String runtimeHint);

  /**
   * Create a new DependencyBridge implementation.
   *
   * @return a new DependencyBridge implementation.
   */
  public abstract DependencyBridge newBridge();
}

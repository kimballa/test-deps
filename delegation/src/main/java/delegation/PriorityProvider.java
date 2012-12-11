package delegation;

/**
 * A service that can be used with greater or lower confidence based
 * on different runtime conditions.
 */
public interface PriorityProvider {
  /**
   * Return the priority of this object based on the runtime conditions.
   *
   * @param runtimeHint a hint provided by the underlying system that
   *     is used to calculate the priority.
   * @return the priority of this provider instance. Higher priority
   *     implies a better fit. 0 means it does not fit at all and cannot
   *     be used.
   */
  int getPriority(String runtimeHint);
}

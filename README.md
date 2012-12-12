

THE GOAL:

Write a client program ("client") that depends on an API ("main-api").
This main API depends on one of two dependency implementations (dependency-a,
or dependency-b) that provides behavior needed by the main API.

Both of these dependencies craft a message and can return it to the client. 
When we run the client.Client program, we should see one of the following
printed to the console:

    And now, a message from our sponsor, 'dependency A'.
    We're back with more from 'dependency B'.


The trick is that dep-a and dep-b both have incompatible APIs. So the main API
accesses these through "bridge" implementations; each bridge knows how to talk
to exactly one dependency version. The bridge to use is loaded at runtime
based on hints about which dependency version is also present on the classpath.

We use the java.util.ServiceLoader API to iterate through bridge implementations
available at runtime, and choose the best one to run.


RUNNING:

    ./run-demo.sh a # run with the "A" dependency.
    ./run-demo.sh b # run with the "B" dependency.

The actual classpath used at runtime is in client/target/dependency/.



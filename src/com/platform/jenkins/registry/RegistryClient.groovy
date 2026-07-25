package com.platform.jenkins.registry

/**
 * Minimal contract for interacting with a container registry.
 *
 * This interface defines the small set of operations required by the current
 * architecture without implementing real transport, authentication, or
 * registry-specific behavior.
 */
interface RegistryClient {

    /**
     * Push the provided image to the registry.
     *
     * @param imageReference fully qualified image reference to push
     */
    void pushImage(String imageReference)
}

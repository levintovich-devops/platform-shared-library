package com.platform.jenkins.registry

/**
 * Minimal concrete registry client for the first milestone.
 *
 * This class implements the registry contract and provides a placeholder for
 * future registry interaction logic without introducing transport or
 * authentication behavior yet.
 */
class DockerRegistryClient implements RegistryClient {

    /**
     * Push the provided image to the registry.
     *
     * This method intentionally does not perform any real network operations.
     * It serves as a clear extension point for future registry integration.
     *
     * @param imageReference fully qualified image reference to push
     */
    @Override
    void pushImage(String imageReference) {
        // Future registry interaction will be implemented here.
    }
}

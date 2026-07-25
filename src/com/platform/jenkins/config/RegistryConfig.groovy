package com.platform.jenkins.config

import groovy.transform.Immutable

/**
 * Minimal registry configuration for the shared library.
 *
 * This class holds the immutable registry settings required by the current
 * architecture without introducing support for future registry features.
 */
@Immutable
class RegistryConfig {

    /**
     * Registry type, such as dockerhub.
     */
    String type

    /**
     * Registry endpoint URL.
     */
    String url

    /**
     * Registry namespace or organization name.
     */
    String namespace
}

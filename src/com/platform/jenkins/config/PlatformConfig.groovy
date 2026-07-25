package com.platform.jenkins.config

import groovy.transform.Immutable

/**
 * Central configuration object for the shared library.
 *
 * This class carries the immutable configuration values needed by pipeline
 * entrypoints and supporting components without embedding any behavior.
 */
@Immutable
class PlatformConfig {

    /**
     * Repository identifier for the application or service being built.
     */
    String repository

    /**
     * Branch or branch pattern used for the current build.
     */
    String branch

    /**
     * Registry-specific configuration for image publication.
     */
    RegistryConfig registryConfig

    /**
     * Jenkins credential identifier used for registry authentication.
     */
    String credentialsId

}

package com.platform.jenkins.context

import com.platform.jenkins.config.PlatformConfig
import com.platform.jenkins.version.VersionInfo
import groovy.transform.Immutable

/**
 * Immutable runtime context for the current build.
 *
 * This class carries the minimal data needed by the shared library during a
 * build run without embedding any behavior.
 */
@Immutable
class BuildContext {

    /**
     * Central platform configuration for the current build.
     */
    PlatformConfig platformConfig

    /**
     * Resolved image version information for the current build.
     */
    VersionInfo versionInfo
}

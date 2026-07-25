package com.platform.jenkins.version

import groovy.transform.Immutable

/**
 * Immutable value object representing the resolved Docker image tag
 * for the current build.
 *
 * This model is intentionally minimal and contains only the final tag value.
 * Version generation is delegated to VersionService.
 */
@Immutable
class VersionInfo {

    /**
     * The resolved image tag for the current build.
     */
    String imageVersion
}

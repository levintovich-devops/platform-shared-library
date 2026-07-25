package com.platform.jenkins.version

import java.time.Instant
import java.time.ZoneOffset
import java.time.format.DateTimeFormatter

/**
 * Minimal service responsible for generating a Docker image tag.
 *
 * This implementation uses a timestamp-based version format for the first
 * milestone and does not depend on Jenkins APIs or release metadata.
 */
class VersionService {

    private static final DateTimeFormatter UTC_TIMESTAMP_FORMATTER =
        DateTimeFormatter.ofPattern('yyyyMMddHHmmss').withZone(ZoneOffset.UTC)

    /**
     * Generate a timestamp-based image tag and return it as VersionInfo.
     *
     * @return resolved image version information
     */
    VersionInfo resolveImageVersion() {
        String timestamp = UTC_TIMESTAMP_FORMATTER.format(Instant.now())

        return new VersionInfo(imageVersion: timestamp)
    }
}

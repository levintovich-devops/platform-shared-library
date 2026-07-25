import com.platform.jenkins.config.PlatformConfig
import com.platform.jenkins.config.RegistryConfig
import com.platform.jenkins.context.BuildContext
import com.platform.jenkins.version.VersionInfo
import com.platform.jenkins.version.VersionService

/**
 * Minimal shared-library entrypoint for the first milestone.
 *
 * This function assembles the initial runtime context for a pipeline run
 * without performing build, test, Docker, or registry actions.
 */
def call(Map config = [:]) {
    RegistryConfig registryConfig = new RegistryConfig(
        type: config.registry?.type ?: 'dockerhub',
        url: config.registry?.url ?: '',
        namespace: config.registry?.namespace ?: ''
    )

    PlatformConfig platformConfig = new PlatformConfig(
        repository: config.repository ?: '',
        branch: config.branch ?: 'main',
        registryConfig: registryConfig,
        credentialsId: config.credentialsId ?: ''
    )

    VersionService versionService = new VersionService()
    VersionInfo versionInfo = versionService.resolveImageVersion()

    BuildContext buildContext = new BuildContext(
        platformConfig: platformConfig,
        versionInfo: versionInfo
    )

    // The runtime context remains internal to this entrypoint for now.
}

import com.platform.jenkins.config.RegistryConfig

def call(Map config = [:]) {
    echo "Step 1"

    RegistryConfig registryConfig = new RegistryConfig(
        type: 'dockerhub',
        url: '',
        namespace: ''
    )

    echo "Step 2"
}

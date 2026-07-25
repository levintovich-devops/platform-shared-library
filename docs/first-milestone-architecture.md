# First Milestone Architecture

## Objective

Establish the minimum structure for a reusable Jenkins Shared Library that can support future pipeline expansion without coupling consumers to implementation details.

## Scope

This milestone includes only the foundational building blocks:

- shared-library entrypoint;
- configuration model;
- versioning model;
- build context;
- registry abstraction with Docker Hub support;
- minimal directory structure and documentation.

No full pipeline execution, deployment logic, or advanced capabilities are included yet.

## Design Principles

- Reuse over duplication: one library, many pipelines.
- Externalize configuration: avoid hardcoded registry, branch, credential, or naming values.
- Separate concerns: configuration, versioning, registry selection, and stage orchestration remain distinct.
- Keep entrypoints thin and declarative.
- Prefer extensibility over premature feature completeness.

## Proposed Structure

```text
vars/
  platformPipeline.groovy

src/com/platform/jenkins/
  config/
    PlatformConfig.groovy
    RegistryConfig.groovy
  context/
    BuildContext.groovy
  version/
    VersionInfo.groovy
    VersionService.groovy
  registry/
    RegistryClient.groovy
    RegistryFactory.groovy
    DockerHubRegistry.groovy

resources/
  platform/
    defaults.yml
```

## Core Components

### 1. Pipeline Entrypoint
The shared library entrypoint exposes a single declarative interface for Jenkins pipelines. It should load configuration, create a build context, resolve the registry implementation, and delegate execution to thin stage components.

### 2. Configuration Layer
A central configuration object should hold repository metadata, branch settings, registry details, credentials references, and runtime flags. Default values should come from a YAML resource file and be overridden by pipeline input when needed.

### 3. Versioning Layer
Versioning should be centralized in a dedicated service that calculates build and release identifiers. The output should be represented as a structured value object so that version data can be reused consistently across pipeline reporting and image naming.

### 4. Build Context
A build context object should aggregate configuration and version data for the current run. This provides a single runtime object that downstream stages can consume without reaching into multiple sources.

### 5. Registry Abstraction
Registry behavior should be abstracted behind a common interface. The initial implementation should support Docker Hub, while the factory pattern allows future support for alternative registries such as Artifactory, Harbor, or ECR.

## Execution Flow

```text
Jenkins job
  -> platformPipeline
  -> PlatformConfig
  -> VersionService
  -> BuildContext
  -> RegistryFactory
  -> RegistryClient / DockerHubRegistry
```

## Milestone Deliverables

- minimal shared-library skeleton;
- configuration loading from defaults;
- version calculation service and value object;
- build context object;
- registry abstraction and Docker Hub implementation stub;
- documentation describing the foundation and next extension points.

## Deferred Work

The following are explicitly out of scope for this milestone:

- full Docker build and publish flows;
- deployment automation;
- Helm/Kubernetes/Argo CD integration;
- security scanning and notification capabilities.

## Success Criteria

The milestone is successful if the library provides a clear and minimal foundation that is extensible, configuration-driven, and ready for the next incremental implementation step.

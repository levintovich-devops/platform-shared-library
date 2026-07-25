# Platform Shared Library

A reusable Jenkins Shared Library for building standardized CI/CD pipelines across multiple projects.

This repository contains a configurable and extensible pipeline framework that centralizes common CI/CD functionality, including build orchestration, versioning, container image management, registry integration, and future platform capabilities.

The library is designed around Platform Engineering principles:
- reusable pipeline components;
- configuration-driven behavior;
- separation of concerns;
- extensible architecture;
- consistent delivery workflows across projects.

## Purpose

This library was initially created as part of the **Payment Platform** reference architecture, which serves as my professional portfolio project.

Rather than implementing CI/CD logic inside individual Jenkinsfiles, the goal is to provide a reusable platform library that can be shared across multiple repositories and future projects.

As the platform evolves, the library is intended to support additional capabilities such as:
- Docker image management;
- multiple container registries;
- Helm deployments;
- Kubernetes;
- Argo CD;
- security scanning;
- notifications;
- and other reusable Platform Engineering components.

## Goals

- Keep Jenkinsfiles small and declarative.
- Eliminate duplicated pipeline logic.
- Provide reusable platform services.
- Support future expansion without changing application repositories.
- Demonstrate enterprise Platform Engineering practices.

## Current Status

The repository currently focuses on the architectural foundation. Implementation will be introduced incrementally, starting with configuration management, versioning, and registry abstraction.

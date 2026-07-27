FROM jenkins/inbound-agent:latest

USER root

RUN apt-get update && \
    apt-get install -y \
        git \
        curl \
        unzip \
        jq \
        ca-certificates && \
    apt-get clean && \
    rm -rf /var/lib/apt/lists/*

USER jenkins
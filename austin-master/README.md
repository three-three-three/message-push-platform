![](doc/images/title.jpeg)

<p align="center">

![Static Badge](https://img.shields.io/badge/Java-orange)
![Static Badge](https://img.shields.io/badge/SpringBoot-red)
![Static Badge](https://img.shields.io/badge/MySQL-orange)
![Static Badge](https://img.shields.io/badge/maven-red)
![Static Badge](https://img.shields.io/badge/Cache-Redis-blue)
![Static Badge](https://img.shields.io/badge/Message%20queue-kafka-blue)
![Static Badge](https://img.shields.io/badge/Timed%20task-xxljob-blue)
![Static Badge](https://img.shields.io/badge/Log%20collection-Graylog-blue)
![Static Badge](https://img.shields.io/badge/Distributed%20Computing%20Engine-Flink-blue)
![Static Badge](https://img.shields.io/badge/Monitor-%20Prometheus%20%26%20Grafana-blue)
![Static Badge](https://img.shields.io/badge/Deploy-%20Docker-blue)
![Static Badge](https://img.shields.io/badge/Frontend%20Page-amis-blue)
</p>

## About Message Push Platform

**Core Functionality**：Send various types of messages, including emails, text messages, WeChat, etc., through a unified interface, and track the message delivery process.

**Significance**：Enterprises requiring message 
delivery should possess a message push platform. This platform facilitates the consolidated sending and administration of diverse message types, minimizing the need for repetitive coding for different message formats.

**Design highlights**：
1. Messages from different channels can be sent, including functions such as timing sending.
2. Different channels and different message types do not affect each other, and the dynamic thread pool can be used to configure and control the consumption capacity.
3. Improved system performance by utilizing Kafka as a message queue to achieve asynchronous and decoupled message processing.
4. Implemented platform-level deduplication using Redis to prevent duplicate sending of identical messages within a short period of time.

**Functional flow chart**：
![](doc/images/mpp-flowchart.png)

## How To Deploy
[installing guide(To be perfected)](doc/INSTALL.md)
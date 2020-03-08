#!/bin/bash

set -euo pipefail

docker exec -it broker-1 \
  kafka-topics --create --zookeeper zookeeper:2181 --replication-factor 1 --partitions 1 --topic myTopic
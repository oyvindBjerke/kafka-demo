#!/bin/bash

set -euo pipefail

docker exec -it broker-1 \
  kafka-topics --zookeeper zookeeper:2181 --list
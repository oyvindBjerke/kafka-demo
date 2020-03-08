#!/bin/bash

set -euo pipefail

docker exec -it broker-1 \
  kafka-console-consumer --zookeeper zookeeper:2181 --bootstrap-server localhost:9092 --topic myTopic --from-beginning
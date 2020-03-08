#!/bin/bash

set -euo pipefail

docker exec -it broker-1 \
  kafka-console-producer --broker-list broker-1:9092 --topic myTopic
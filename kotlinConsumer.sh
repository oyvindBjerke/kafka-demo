#!/bin/bash

set -euo pipefail

docker build -t kotlin-consumer ./kotlin-consumer

docker rm -f kotlin-consumer || true

docker run --name kotlin-consumer --net kafka-demo kotlin-consumer
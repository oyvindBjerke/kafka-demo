# kafka-demo

## Run kafka cluster

`$ bash docker-compose up -d`

## Create topic: myTopic

`$ bash createTopic.sh`

## Verify that topic was created

`$ bash listTopics.sh`

## Start consumer

`$ bash consumer.sh`

## Start kotlin consumer

`$ bash kotlinConsumer.sh`

## Start producer

`$ bash producer.sh`

## Producer some messages

In producer shell, type a message and hit enter. That message should then be available in the consumers.

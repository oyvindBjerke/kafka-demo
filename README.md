# kafka-demo

## Run kafka cluster

`$ docker-compose -d up`

## Create topic: myTopic

`$ createTopic.sh`

## Verify that topic was created

`$ listTopics.sh`

## Start consumer

`$ consumer.sh`

## Start producer

`$ producer.sh`

## Producer some messages

In producer shell, type a message and hit enter. That message should then be available in the consumer shell.
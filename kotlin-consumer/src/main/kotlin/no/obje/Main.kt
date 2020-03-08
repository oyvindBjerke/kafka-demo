package no.obje

import org.apache.kafka.clients.consumer.ConsumerConfig.*
import org.apache.kafka.clients.consumer.KafkaConsumer
import org.apache.kafka.common.serialization.StringDeserializer
import java.time.Duration
import java.util.*

fun main() {
    val consumer = createConsumer()
    while (true) {
        val records = consumer.poll(Duration.ofSeconds(1))
        records.iterator().forEach {
            val value = it.value()
            println(value)
        }
    }
}

fun createConsumer(): KafkaConsumer<String, String> {
    val properties = Properties()
    properties[BOOTSTRAP_SERVERS_CONFIG] = "broker-1:9092" // "advertised listeners" feature might cause silent failure
    properties[GROUP_ID_CONFIG] = UUID.randomUUID().toString()
    properties[AUTO_OFFSET_RESET_CONFIG] = "earliest"
    properties[KEY_DESERIALIZER_CLASS_CONFIG] = StringDeserializer::class.java
    properties[VALUE_DESERIALIZER_CLASS_CONFIG] = StringDeserializer::class.java
    val consumer = KafkaConsumer<String, String>(properties)
    consumer.subscribe(listOf("myTopic"))
    return consumer
}
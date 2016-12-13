package org.apache.flink.streaming.connectors.kafka;

import org.junit.Test;

import java.util.Properties;


public class FlinkKafkaConsumerWatermarkRestoringTest {

	@Test
	public void watermarkRestoringTest(){
		FlinkKafkaConsumerBase flinkKafkaConsumerBase = new FlinkKafkaConsumer08(
			"test topic",
			new KafkaConsumerTestBase.FixedNumberDeserializationSchema(1),
			new Properties());
	}
}

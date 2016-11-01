package com.fh.test;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.TreeMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang.StringUtils;
import org.jruby.RubyProcess.Sys;

import com.bfd.facade.MerchantServer;
import com.glorycube.msgrep.common.MsgTemplateUtil;
import com.paic.qhcs.test.QhDataUtils;
import com.rong360.api.Rong360DataUtils;
import com.shzx.api.ZxDataUtils;
import com.suanhua.cpcs.api.ShDataUtils;
import com.util.RandomUtils;

import kafka.javaapi.producer.Producer;
import kafka.producer.KeyedMessage;
import kafka.producer.ProducerConfig;
import net.sf.json.JSONObject;

public class KafkaProducer {
	private final Producer<String, String> producer;
	public final static String TOPIC = "mykafka";// "TEST-TOPIC"; 03前海 04百融
														// 05算话

	private KafkaProducer() {
		Properties props = new Properties();
		// 此处配置的是kafka的端口
		props.put("metadata.broker.list", "192.168.197.130:9092");//hc4

		// 配置value的序列化类
		props.put("serializer.class", "kafka.serializer.StringEncoder");
		// 配置key的序列化类
		props.put("key.serializer.class", "kafka.serializer.StringEncoder");

		props.put("request.required.acks", "-1");

		producer = new Producer<String, String>(new ProducerConfig(props));
	}
	
	
		/**
		 * 功能: 上海资信
		 * 作者: LCL
		 * 创建日期:2016年8月4日
		 * @throws Exception
		 */
		void sendShzxMsg() throws Exception {
			String batch_seq_num = RandomUtils.generateString(32); // 批次号
			// 返回结果的key
			String key = "ZX0001";// 生成查询批次号_原系统批次号
			Map<String, String> paramMaps = new HashMap<String, String>();
			String result = "test_kafka";
			producer.send(new KeyedMessage<String, String>("mykafka", key, "{" + result + "}"));
			System.out.println(key);
			System.out.println("上海资信======" + "{" + result + "}");
		}
	public static void main(String[] args) throws InterruptedException, UnsupportedEncodingException {
		try {
			new KafkaProducer().sendShzxMsg();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}

}

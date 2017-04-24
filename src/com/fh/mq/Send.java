package com.fh.mq;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

public class Send {

  private final static String QUEUE_NAME = "hello";

  public static void main(String[] argv) throws Exception {
    ConnectionFactory factory = new ConnectionFactory();//初始化连接工厂
    factory.setHost("localhost");
    factory.setPort(5672);//默认端口号
    Connection connection = factory.newConnection();//建立连接
    Channel channel = connection.createChannel();//建立信道

    channel.queueDeclare(QUEUE_NAME, true, false, false, null);//声明队列
    String message = "Hello World!";
    channel.basicPublish("", QUEUE_NAME, null, message.getBytes("UTF-8"));//发布消息
    System.out.println(" [x] Sent '" + message + "'");

    channel.close();//关闭信道
    connection.close();//关闭连接
    System.out.println("send finish*****");
  }
}
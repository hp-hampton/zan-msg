package com.zan.stream.producer.channel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.support.MessageBuilder;

/**
 * @version 1.0
 * @author: hupeng
 * @create: 2019-01-09 02:48
 * @description:
 **/
@EnableBinding(value = {Sink.class, OutputChannel.class})
public class OutputListening {

    @Autowired
    private OutputChannel outputChannel;

    public void sender() {
        outputChannel.output().send(MessageBuilder.withPayload("hello hupeng").build());
    }
}

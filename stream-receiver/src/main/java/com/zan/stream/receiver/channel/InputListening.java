package com.zan.stream.receiver.channel;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

/**
 * @version 1.0
 * @author: hupeng
 * @create: 2019-01-09 02:43
 * @description:
 **/
@EnableBinding(value = {Sink.class, InputChannel.class})
public class InputListening {

    @StreamListener(InputChannel.CHANNEL)
    public void receive(Object payload) {
        System.out.println(payload.toString());
    }
}

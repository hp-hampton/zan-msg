package com.zan.stream.producer.channel;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.SubscribableChannel;

/**
 * @version 1.0
 * @author: hupeng
 * @create: 2019-01-09 02:46
 * @description:
 **/

public interface OutputChannel {

    String CHANNEL = "myInput";

    @Output(value = OutputChannel.CHANNEL)
    SubscribableChannel output();
}

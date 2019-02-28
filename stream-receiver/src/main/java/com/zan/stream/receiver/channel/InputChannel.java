package com.zan.stream.receiver.channel;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/**
 * @version 1.0
 * @author: hupeng
 * @create: 2019-01-09 02:32
 * @description:
 **/

public interface InputChannel {

    String CHANNEL = "myInput";

    @Input(InputChannel.CHANNEL)
    SubscribableChannel input();
}

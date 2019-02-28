package com.zan.stream.producer.controller;

import com.zan.stream.producer.channel.OutputListening;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version 1.0
 * @author: hupeng
 * @create: 2019-01-09 02:51
 * @description:
 **/
@RestController
@RequestMapping("/sender")
public class SenderController {

    @Autowired
    private OutputListening outputListening;

    @GetMapping
    public void sender() {
        outputListening.sender();
    }
}

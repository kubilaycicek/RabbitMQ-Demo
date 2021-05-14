package com.rabbitmq.rabbitmqdemo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class SimpleMessage implements Serializable {
    private String name;
    private String description;
}

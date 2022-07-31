package com.microservice.bean;

import lombok.Data;
import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor
public class LimitConfiguration {
    private int minimum;
    private int maximum;
}

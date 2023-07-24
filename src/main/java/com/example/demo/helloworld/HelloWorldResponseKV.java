package com.example.demo.helloworld;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@Getter
public class HelloWorldResponseKV implements Serializable {
    @SerializedName("Hello")
    private String hello;

    private HelloWorldResponseKV(String hello) {
        this.hello = hello;
    }

    public static HelloWorldResponseKV of(final String successesMessage) {
        return new HelloWorldResponseKV(successesMessage);
    }
}

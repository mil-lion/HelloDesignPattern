/*
 * File:    TestJson.java
 * Project: HelloDesignPattern
 * Date:    14 дек. 2019 г. 00:18:56
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2019 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.structural.composite;

import javax.json.Json;
import javax.json.JsonObject;

/**
 *
 * @author Igor Morenko <morenko at lionsoft.ru>
 */
public class TestJson {

    public static void main(String[] args) {

        JsonObject json = Json.createObjectBuilder()
                .add("firstName", "Igor")
                .add("lastName", "Morenko")
                .add("birthday", 1971)
                .add("teacher", true)
                .add("courses", Json.createArrayBuilder()
                        .add(Json.createObjectBuilder().add("name", "java"))
                        .add(Json.createObjectBuilder().add("name", "oracle"))
                )
                .add("address", Json.createObjectBuilder()
                        .add("city", "Moscow")
                        .add("street", "Bardina")
                        .add("zip", 300125)
                )
                .build();
        System.out.println("json = " + json);

    }
}

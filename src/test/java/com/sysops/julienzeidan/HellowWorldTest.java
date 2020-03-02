package com.sysops.julienzeidan;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class HellowWorldTest {

    @Test
    public void should_return_hello_world() {
        HellowWorld hellowWorld = new HellowWorld();
        String result = hellowWorld.helloWorld();


    }
}
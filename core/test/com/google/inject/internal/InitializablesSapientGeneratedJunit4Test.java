package com.google.inject.internal;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.is;

public class InitializablesSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    //Sapient generated method id: ${3155f475-158f-3510-8516-db6562387204}, hash: FEA4745E0F8FE205709163214C65012B
    @Test()
    public void ofTest() {
        //Arrange Statement(s)
        Object object = new Object();

        //Act Statement(s)
        Initializable result = Initializables.of(object);

        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }
}

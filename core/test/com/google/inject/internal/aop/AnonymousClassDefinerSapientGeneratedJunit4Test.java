package com.google.inject.internal.aop;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Ignore;

public class AnonymousClassDefinerSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    //Sapient generated method id: ${3d0bbb66-c655-3fc9-bcd2-e53aac08c7c7}, hash: E1FD2C85DFA50B6D0D3F971C534F464A
    @Ignore()
    @Test()
    public void defineTest() throws Exception {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        AnonymousClassDefiner target = new AnonymousClassDefiner();
        byte[] byteArray = new byte[]{(byte) 10, (byte) 20, (byte) 30, (byte) 40, (byte) 50};
        //Act Statement(s)
        Class<?> result = target.define(Object.class, byteArray);
        //Assert statement(s)
        assertThat(result, equalTo(Object.class));
    }
}

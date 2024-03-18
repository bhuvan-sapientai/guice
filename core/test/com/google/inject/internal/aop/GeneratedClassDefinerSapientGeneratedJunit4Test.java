package com.google.inject.internal.aop;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.util.function.BiFunction;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;

import org.junit.Ignore;

public class GeneratedClassDefinerSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final BiFunction defineAccessMock = mock(BiFunction.class, "defineAccess");

    //Sapient generated method id: ${3d0bbb66-c655-3fc9-bcd2-e53aac08c7c7}, hash: 1E4F82FB55F1232425CD0817B1FB0736
    @Ignore()
    @Test()
    public void defineTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        GeneratedClassDefiner target = new GeneratedClassDefiner(defineAccessMock);
        byte[] byteArray = new byte[]{(byte) 1, (byte) 2, (byte) 3, (byte) 4};
        doReturn(Object.class).when(defineAccessMock).apply((ClassLoader) any(), eq(byteArray));
        //Act Statement(s)
        Class<?> result = target.define(Object.class, byteArray);
        //Assert statement(s)
        assertThat(result, equalTo(Object.class));
        verify(defineAccessMock).apply((ClassLoader) any(), eq(byteArray));
    }
}

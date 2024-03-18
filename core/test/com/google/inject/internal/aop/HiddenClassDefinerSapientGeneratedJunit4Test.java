package com.google.inject.internal.aop;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import sun.misc.Unsafe;

import java.lang.invoke.MethodHandles;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;

import org.junit.Ignore;

public class HiddenClassDefinerSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Unsafe THE_UNSAFEMock = mock(Unsafe.class, "THE_UNSAFE");

    //Sapient generated method id: ${3d0bbb66-c655-3fc9-bcd2-e53aac08c7c7}, hash: 575DB9ACCB366FEFA70075D77E44585D
    @Ignore()
    @Test()
    public void defineTest() throws Exception {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        HiddenClassDefiner target = new HiddenClassDefiner();
        MethodHandles.Lookup methodHandlesLookupMock = mock(MethodHandles.Lookup.class);
        Object object = new Object();
        doReturn(methodHandlesLookupMock).when(THE_UNSAFEMock).getObject(object, 0L);
        MethodHandles.Lookup methodHandlesLookupMock2 = mock(MethodHandles.Lookup.class);
        doReturn(methodHandlesLookupMock2).when(methodHandlesLookupMock).in(Class.class);
        byte[] byteArray = new byte[]{(byte) 0};
        //Act Statement(s)
        Class<?> result = target.define(Class.class, byteArray);
        //Assert statement(s)
        assertThat(result, equalTo(Object.class));
        verify(THE_UNSAFEMock).getObject(object, 0L);
        verify(methodHandlesLookupMock).in(Class.class);
    }
}

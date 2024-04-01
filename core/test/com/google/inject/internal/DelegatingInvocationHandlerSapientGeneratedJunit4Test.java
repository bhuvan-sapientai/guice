package com.google.inject.internal;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.lang.reflect.Method;

import static org.mockito.Mockito.mock;

public class DelegatingInvocationHandlerSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${3d248ac7-4f8d-30dd-a934-5dc1d805f87c}, hash: 9481F9A98FC9A8D03585B930563475F6
    @Test()
    public void invokeThrowsIllegalStateException() throws Throwable {
        //Arrange Statement(s)
        DelegatingInvocationHandler<Object> target = new DelegatingInvocationHandler<>();
        thrown.expect(IllegalStateException.class);
        Object object = new Object();
        Method methodMock = mock(Method.class);
        Object[] objectArray = new Object[]{};

        //Act Statement(s)
        target.invoke(object, methodMock, objectArray);
    }

    //Sapient generated method id: ${4f8c50fb-9007-31a1-9bd0-72d08b1c10b9}, hash: 6EED6C6B2009F7C1CAFBAEE9FD82DE3D
    @Test()
    public void setDelegateTest() {
        //Arrange Statement(s)
        DelegatingInvocationHandler<Object> target = new DelegatingInvocationHandler<>();
        Object object = new Object();

        //Act Statement(s)
        target.setDelegate(object);
    }
}

package com.google.inject.internal;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.util.List;
import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInterceptor;

import java.util.ArrayList;
import java.util.function.BiFunction;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.hamcrest.Matchers.is;

import org.junit.Ignore;

public class InterceptorStackCallbackSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    //Sapient generated method id: ${93eb0251-18f6-3880-853a-57868a8572c5}, hash: E64E1CAA1B3392B4C332AB2856BB39BC
    @Ignore()
    @Test()
    public void invokeTest() throws Throwable {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: object of type InterceptorStackCallback.InterceptedMethodInvocation
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Method methodMock = mock(Method.class, "someMethod");
        List<MethodInterceptor> methodInterceptorList = new ArrayList<>();
        BiFunction biFunctionMock = mock(BiFunction.class, "null");
        InterceptorStackCallback target = new InterceptorStackCallback(methodMock, methodInterceptorList, biFunctionMock);
        Object object = new Object();
        Method methodMock2 = mock(Method.class, "null");
        Object object2 = new Object();
        Object[] objectArray = new Object[]{object2};
        //Act Statement(s)
        Object result = target.invoke(object, methodMock2, objectArray);
        //Assert statement(s)
        //TODO: Please implement equals method in Object for verification of the entire object or you need to adjust respective assertion statements
        assertThat(result, is(notNullValue()));
    }
}

package com.google.inject.internal.aop;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.security.PrivilegedAction;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.hamcrest.Matchers.is;

import org.junit.Ignore;

public class ChildClassDefinerSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    //Sapient generated method id: ${472706b7-79aa-3767-8c05-3da18bc0e369}, hash: CB2B2694CCB6C386BA2B60C908AC3FC8
    @Ignore()
    @Test()
    public void defineWhenHostLoaderIsNotNull() throws Exception {
        /* Branches:
         * (hostLoader != null) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: CHILD_LOADER_CACHE, childLoader
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ChildClassDefiner target = new ChildClassDefiner();
        byte[] byteArray = new byte[]{};
        //Act Statement(s)
        Class<?> result = target.define(Object.class, byteArray);
        //Assert statement(s)
        assertThat(result, equalTo(Object.class));
    }

    //Sapient generated method id: ${494c6959-2e3f-37b7-8267-6aca48af9543}, hash: 8B848CB2A07B3CB86855808F300506E9
    @Ignore()
    @Test()
    public void defineWhenHostLoaderIsNull() throws Exception {
        /* Branches:
         * (hostLoader != null) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: childLoader
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ChildClassDefiner target = new ChildClassDefiner();
        byte[] byteArray = new byte[]{(byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5};
        //Act Statement(s)
        Class<?> result = target.define(Object.class, byteArray);
        //Assert statement(s)
        assertThat(result, equalTo(Object.class));
    }

    //Sapient generated method id: ${9444d3dd-805b-3cd6-8801-06f84a1d2690}, hash: A20C4804375CA35B1BED100BD9766356
    @Ignore()
    @Test()
    public void doPrivilegedTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        PrivilegedAction privilegedActionMock = mock(PrivilegedAction.class);
        //Act Statement(s)
        Object result = ChildClassDefiner.doPrivileged(privilegedActionMock);
        //Assert statement(s)
        //TODO: Please implement equals method in Object for verification of the entire object or you need to adjust respective assertion statements
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${f7289839-259e-339f-9294-5aa42bd5e4b1}, hash: 76226CDAFE83052E9271AA043D3FDF0E
    @Test()
    public void childLoaderTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
        //Act Statement(s)
        //TODO: Please change the modifier of the below class from private to public to isolate the test case scenario.
        //ChildClassDefiner.ChildLoader result = ChildClassDefiner.childLoader(classLoader);
        //Assert statement(s)
        //assertThat(result, is(notNullValue()));
    }
}

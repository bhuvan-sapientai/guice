package com.google.inject.internal;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import com.google.inject.TypeLiteral;
import com.google.common.collect.ImmutableMap;

import java.lang.reflect.Constructor;

import com.google.inject.spi.InjectionPoint;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

import org.junit.Ignore;

public class ProxyFactorySapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final ImmutableMap interceptorsMock = mock(ImmutableMap.class, "interceptors");

    private final Constructor constructorMock = mock(Constructor.class);

    private final Iterable methodAspectsMock = mock(Iterable.class, "value");

    private final TypeLiteral typeLiteralMock = mock(TypeLiteral.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${522f6081-37ae-3de0-b55a-d92d8b750799}, hash: F480630B6B4E2113EAAD0CD2A10416D6
    @Ignore()
    @Test()
    public void createWhenInterceptorsIsEmpty() throws Throwable {
        /* Branches:
         * (interceptors.isEmpty()) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: object of type Member - Method: getDeclaringClass
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn(null).when(methodAspectsMock).iterator();
        InjectionPoint injectionPoint = InjectionPoint.forConstructor(constructorMock, typeLiteralMock);
        ProxyFactory target = new ProxyFactory(injectionPoint, methodAspectsMock);
        doReturn(true).when(interceptorsMock).isEmpty();
        //Act Statement(s)
        ConstructionProxy result = target.create();
        //Assert statement(s)
        //TODO: Please implement equals method in ConstructionProxy for verification of the entire object or you need to adjust respective assertion statements
        assertThat(result, is(notNullValue()));
        verify(methodAspectsMock).iterator();
        verify(interceptorsMock).isEmpty();
    }

    //Sapient generated method id: ${fc5e4389-22cf-3a89-9304-bcac0a826deb}, hash: 162B27E7A9D2875BA01ECC1EA487937D
    @Ignore()
    @Test()
    public void createWhenInterceptorsNotIsEmpty() throws Throwable {
        /* Branches:
         * (interceptors.isEmpty()) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: object of type Member - Method: getDeclaringClass
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn(null).when(methodAspectsMock).iterator();
        InjectionPoint injectionPoint = InjectionPoint.forConstructor(constructorMock, typeLiteralMock);
        ProxyFactory target = new ProxyFactory(injectionPoint, methodAspectsMock);
        doReturn(false).when(interceptorsMock).isEmpty();
        //Act Statement(s)
        ConstructionProxy result = target.create();
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
        verify(methodAspectsMock).iterator();
        verify(interceptorsMock).isEmpty();
    }

    //Sapient generated method id: ${2856b4dc-7e24-3c24-9713-8cbf7f591f85}, hash: 524FE9423AB8FBE36DA919C50B47035E
    @Ignore()
    @Test()
    public void createWhenCaughtThrowableThrowsErrorsException() throws ErrorsException {
        /* Branches:
         * (interceptors.isEmpty()) : false
         * (catch-exception (Throwable)) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: object of type Member, object of type Errors
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn(null).when(methodAspectsMock).iterator();
        InjectionPoint injectionPoint = InjectionPoint.forConstructor(constructorMock, typeLiteralMock);
        ProxyFactory target = new ProxyFactory(injectionPoint, methodAspectsMock);
        doReturn(false).when(interceptorsMock).isEmpty();
        thrown.expect(ErrorsException.class);
        //Act Statement(s)
        target.create();
        //Assert statement(s)
        verify(methodAspectsMock).iterator();
        verify(interceptorsMock).isEmpty();
    }
}

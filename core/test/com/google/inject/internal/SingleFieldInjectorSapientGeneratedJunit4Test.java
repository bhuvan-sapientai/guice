package com.google.inject.internal;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import com.google.inject.TypeLiteral;
import com.google.inject.spi.Dependency;
import com.google.inject.Key;

import java.lang.reflect.Constructor;

import com.google.inject.spi.InjectionPoint;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;

import org.junit.Ignore;

public class SingleFieldInjectorSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final BindingImpl bindingMock = mock(BindingImpl.class, "binding");

    private final Constructor constructorMock = mock(Constructor.class);

    private final InjectorImpl injectorMock = mock(InjectorImpl.class);

    private final InternalContext internalContextMock = mock(InternalContext.class);

    private final InternalFactory<Object> internalFactoryMock = mock(InternalFactory.class);

    private final Key keyMock = mock(Key.class);

    private final TypeLiteral typeLiteralMock = mock(TypeLiteral.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${1f6be77e-d6f3-3aba-ab3e-60c81abd554c}, hash: BD17BED379A4419534A5CB4E2EF28AD5
    @Ignore()
    @Test()
    public void injectTest() throws InternalProvisionException, ErrorsException, IllegalAccessException {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: field, dependency
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Errors errors = new Errors();
        doReturn(bindingMock).when(injectorMock).getBindingOrThrow(keyMock, errors, InjectorImpl.JitLimitation.NO_JIT);
        InjectionPoint injectionPoint = InjectionPoint.forConstructor(constructorMock, typeLiteralMock);
        SingleFieldInjector target = new SingleFieldInjector(injectorMock, injectionPoint, errors);
        doReturn(internalFactoryMock).when(bindingMock).getInternalFactory();
        Object object = new Object();
        doReturn(object).when(internalFactoryMock).get(eq(internalContextMock), (Dependency) any(), eq(false));
        Object object2 = new Object();
        //Act Statement(s)
        target.inject(internalContextMock, object2);
        //Assert statement(s)
        verify(injectorMock).getBindingOrThrow(keyMock, errors, InjectorImpl.JitLimitation.NO_JIT);
        verify(bindingMock).getInternalFactory();
        verify(internalFactoryMock).get(eq(internalContextMock), (Dependency) any(), eq(false));
    }

    //Sapient generated method id: ${f8f5b792-168a-3ebc-aa33-0db84c3b0e4e}, hash: 7416FF1E3009C848AE0474F4B5F33BFB
    @Ignore()
    @Test()
    public void injectWhenCaughtInternalProvisionExceptionThrowsInternalProvisionException() throws InternalProvisionException, ErrorsException, IllegalArgumentException, IllegalAccessException {
        /* Branches:
         * (catch-exception (InternalProvisionException)) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: field, dependency
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Errors errors = new Errors();
        doReturn(bindingMock).when(injectorMock).getBindingOrThrow(keyMock, errors, InjectorImpl.JitLimitation.NO_JIT);
        InjectionPoint injectionPoint = InjectionPoint.forConstructor(constructorMock, typeLiteralMock);
        SingleFieldInjector target = new SingleFieldInjector(injectorMock, injectionPoint, errors);
        doReturn(internalFactoryMock).when(bindingMock).getInternalFactory();
        Object object = new Object();
        doReturn(object).when(internalFactoryMock).get(eq(internalContextMock), (Dependency) any(), eq(false));
        thrown.expect(InternalProvisionException.class);
        Object object2 = new Object();
        //Act Statement(s)
        target.inject(internalContextMock, object2);
        //Assert statement(s)
        verify(injectorMock).getBindingOrThrow(keyMock, errors, InjectorImpl.JitLimitation.NO_JIT);
        verify(bindingMock).getInternalFactory();
        verify(internalFactoryMock).get(eq(internalContextMock), (Dependency) any(), eq(false));
    }

    //Sapient generated method id: ${6614296c-d23c-3d02-95bd-52bb0ab1c942}, hash: D0E55D057B8CE717C35B6BE16EBA63C3
    @Ignore()
    @Test()
    public void injectWhenCaughtIllegalAccessExceptionThrowsAssertionError() throws InternalProvisionException, ErrorsException, IllegalArgumentException, IllegalAccessException {
        /* Branches:
         * (catch-exception (IllegalAccessException)) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: field, dependency
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Errors errors = new Errors();
        doReturn(bindingMock).when(injectorMock).getBindingOrThrow(keyMock, errors, InjectorImpl.JitLimitation.NO_JIT);
        InjectionPoint injectionPoint = InjectionPoint.forConstructor(constructorMock, typeLiteralMock);
        SingleFieldInjector target = new SingleFieldInjector(injectorMock, injectionPoint, errors);
        doReturn(internalFactoryMock).when(bindingMock).getInternalFactory();
        Object object = new Object();
        doReturn(object).when(internalFactoryMock).get(eq(internalContextMock), (Dependency) any(), eq(false));
        thrown.expect(AssertionError.class);
        Object object2 = new Object();
        //Act Statement(s)
        target.inject(internalContextMock, object2);
        //Assert statement(s)
        verify(injectorMock).getBindingOrThrow(keyMock, errors, InjectorImpl.JitLimitation.NO_JIT);
        verify(bindingMock).getInternalFactory();
        verify(internalFactoryMock).get(eq(internalContextMock), (Dependency) any(), eq(false));
    }
}

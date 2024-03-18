package com.google.inject.internal;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.lang.reflect.Field;

import com.google.inject.TypeLiteral;
import com.google.inject.spi.Dependency;
import com.google.inject.Key;

import java.lang.reflect.Constructor;

import com.google.inject.spi.InjectionPoint;

import static org.mockito.Mockito.doNothing;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;

import org.junit.Ignore;

public class SingleFieldInjectorSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Field fieldMock = mock(Field.class, "field");

    private final BindingImpl bindingMock = mock(BindingImpl.class, "binding");

    private final Constructor constructorMock = mock(Constructor.class);

    private final InjectorImpl injectorMock = mock(InjectorImpl.class);

    private final InternalContext internalContextMock = mock(InternalContext.class);

    private final InternalFactory<Object> internalFactoryMock = mock(InternalFactory.class);

    private final Key keyMock = mock(Key.class, "Key");

    private final TypeLiteral typeLiteralMock = mock(TypeLiteral.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${1f6be77e-d6f3-3aba-ab3e-60c81abd554c}, hash: DF0D5D8F0D589FC2A97DFAF6D60C48EE
    @Ignore()
    @Test()
    public void injectTest() throws InternalProvisionException, ErrorsException, IllegalArgumentException, IllegalAccessException {
        //Arrange Statement(s)
        Key keyMock = mock(Key.class);
        Errors errors = new Errors();
        doReturn(bindingMock).when(injectorMock).getBindingOrThrow(keyMock, errors, InjectorImpl.JitLimitation.NO_JIT);
        InjectionPoint injectionPoint = InjectionPoint.forConstructor(constructorMock, typeLiteralMock);
        SingleFieldInjector target = new SingleFieldInjector(injectorMock, injectionPoint, errors);
        doNothing().when(fieldMock).setAccessible(true);
        doReturn(internalFactoryMock).when(bindingMock).getInternalFactory();
        Object objectMock = mock(Object.class);
        doReturn(objectMock).when(internalFactoryMock).get(eq(internalContextMock), (Dependency) any(), eq(false));
        Object object = new Object();
        doNothing().when(fieldMock).set(object, objectMock);
        //Act Statement(s)
        target.inject(internalContextMock, object);
        //Assert statement(s)
        verify(injectorMock).getBindingOrThrow(keyMock, errors, InjectorImpl.JitLimitation.NO_JIT);
        verify(fieldMock).setAccessible(true);
        verify(bindingMock).getInternalFactory();
        verify(internalFactoryMock).get(eq(internalContextMock), (Dependency) any(), eq(false));
        verify(fieldMock).set(object, objectMock);
    }

    //Sapient generated method id: ${f8f5b792-168a-3ebc-aa33-0db84c3b0e4e}, hash: A4DF37C6185CBC7B6C6B439085BDA947
    @Ignore()
    @Test()
    public void injectWhenCaughtInternalProvisionExceptionThrowsInternalProvisionException() throws InternalProvisionException, ErrorsException, IllegalArgumentException, IllegalAccessException {
        /* Branches:
         * (catch-exception (InternalProvisionException)) : true
         */
        //Arrange Statement(s)
        Errors errors = new Errors();
        doReturn(bindingMock).when(injectorMock).getBindingOrThrow(keyMock, errors, InjectorImpl.JitLimitation.NO_JIT);
        InjectionPoint injectionPoint = InjectionPoint.forConstructor(constructorMock, typeLiteralMock);
        SingleFieldInjector target = new SingleFieldInjector(injectorMock, injectionPoint, errors);
        doNothing().when(fieldMock).setAccessible(true);
        doReturn(internalFactoryMock).when(bindingMock).getInternalFactory();
        InternalProvisionException internalProvisionExceptionMock = mock(InternalProvisionException.class);
        doThrow(internalProvisionExceptionMock).when(internalFactoryMock).get(eq(internalContextMock), (Dependency) any(), eq(false));
        Object object = new Object();
        Object object2 = new Object();
        doNothing().when(fieldMock).set(object, object2);
        thrown.expect(InternalProvisionException.class);
        //Act Statement(s)
        target.inject(internalContextMock, object);
        //Assert statement(s)
        verify(injectorMock).getBindingOrThrow(keyMock, errors, InjectorImpl.JitLimitation.NO_JIT);
        verify(fieldMock).setAccessible(true);
        verify(bindingMock).getInternalFactory();
        verify(internalFactoryMock).get(eq(internalContextMock), (Dependency) any(), eq(false));
        verify(fieldMock).set(object, object2);
    }

    //Sapient generated method id: ${6614296c-d23c-3d02-95bd-52bb0ab1c942}, hash: B4AAD7D7F0DE767E674ED6A73B33521A
    @Ignore()
    @Test()
    public void injectWhenCaughtIllegalAccessExceptionThrowsAssertionError() throws InternalProvisionException, ErrorsException, IllegalArgumentException, IllegalAccessException {
        /* Branches:
         * (catch-exception (IllegalAccessException)) : true
         */
        //Arrange Statement(s)
        Errors errors = new Errors();
        doReturn(bindingMock).when(injectorMock).getBindingOrThrow(keyMock, errors, InjectorImpl.JitLimitation.NO_JIT);
        InjectionPoint injectionPoint = InjectionPoint.forConstructor(constructorMock, typeLiteralMock);
        SingleFieldInjector target = new SingleFieldInjector(injectorMock, injectionPoint, errors);
        doNothing().when(fieldMock).setAccessible(true);
        doReturn(internalFactoryMock).when(bindingMock).getInternalFactory();
        Object object = new Object();
        doReturn(object).when(internalFactoryMock).get(eq(internalContextMock), (Dependency) any(), eq(false));
        IllegalAccessException illegalAccessExceptionMock = mock(IllegalAccessException.class);
        Object object2 = new Object();
        doThrow(illegalAccessExceptionMock).when(fieldMock).set(object2, object);
        thrown.expect(AssertionError.class);
        //Act Statement(s)
        target.inject(internalContextMock, object2);
        //Assert statement(s)
        verify(injectorMock).getBindingOrThrow(keyMock, errors, InjectorImpl.JitLimitation.NO_JIT);
        verify(fieldMock).setAccessible(true);
        verify(bindingMock).getInternalFactory();
        verify(internalFactoryMock).get(eq(internalContextMock), (Dependency) any(), eq(false));
        verify(fieldMock).set(object2, object);
    }
}

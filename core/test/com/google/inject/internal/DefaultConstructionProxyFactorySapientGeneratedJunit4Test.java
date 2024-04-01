package com.google.inject.internal;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import com.google.inject.TypeLiteral;
import org.mockito.MockedStatic;

import java.lang.reflect.Constructor;
import java.util.function.BiFunction;

import com.google.inject.spi.InjectionPoint;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

import org.junit.Ignore;

public class DefaultConstructionProxyFactorySapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final InjectionPoint injectionPointMock = mock(InjectionPoint.class, "injectionPoint");

    private final Constructor constructorMock = mock(Constructor.class);

    //Sapient generated method id: ${02854da6-c639-332f-871d-5f5cce5a1cfb}, hash: 657F66F4E5E04996BFCB352904422798
    @Test()
    public void createWhenFastConstructorIsNotNull() throws LinkageError, Exception {
        /* Branches:
         * (InternalFlags.isBytecodeGenEnabled()) : true
         * (fastConstructor != null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        BiFunction biFunctionMock = mock(BiFunction.class);
        try (MockedStatic<BytecodeGen> bytecodeGen = mockStatic(BytecodeGen.class)) {
            bytecodeGen.when(() -> BytecodeGen.fastConstructor(constructorMock)).thenReturn(biFunctionMock);
            DefaultConstructionProxyFactory target = new DefaultConstructionProxyFactory(injectionPointMock);
            doReturn(constructorMock).when(injectionPointMock).getMember();
            //Act Statement(s)
            ConstructionProxy result = target.create();
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            bytecodeGen.verify(() -> BytecodeGen.fastConstructor(constructorMock), atLeast(1));
            verify(injectionPointMock).getMember();
        }
    }

    //Sapient generated method id: ${32400975-ab0c-3f80-a0cd-a43d5de0c9a8}, hash: 2A0A6F89DFC2F88E5EDC19994E1A4231
    @Ignore()
    @Test()
    public void createWhenFastConstructorIsNull() throws LinkageError, Exception {
        /* Branches:
         * (InternalFlags.isBytecodeGenEnabled()) : true
         * (fastConstructor != null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<BytecodeGen> bytecodeGen = mockStatic(BytecodeGen.class);
             MockedStatic<InternalFlags> internalFlags = mockStatic(InternalFlags.class)) {
            internalFlags.when(() -> InternalFlags.isBytecodeGenEnabled()).thenReturn(true);
            bytecodeGen.when(() -> BytecodeGen.fastConstructor(constructorMock)).thenReturn(null);
            DefaultConstructionProxyFactory target = new DefaultConstructionProxyFactory(injectionPointMock);
            doReturn(constructorMock).when(injectionPointMock).getMember();
            //Act Statement(s)
            ConstructionProxy result = target.create();
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            internalFlags.verify(() -> InternalFlags.isBytecodeGenEnabled(), atLeast(1));
            bytecodeGen.verify(() -> BytecodeGen.fastConstructor(constructorMock), atLeast(1));
            verify(injectionPointMock).getMember();
        }
    }

    //Sapient generated method id: ${872e19d0-71f4-39e9-b842-615e1b56a74d}, hash: 5D0AE39BF4F27C1242C9134987E1DDCE
    @Ignore()
    @Test()
    public void createWhenCaughtExceptionOrLinkageError() throws LinkageError, Exception {
        /* Branches:
         * (InternalFlags.isBytecodeGenEnabled()) : true
         * (fastConstructor != null) : true
         * (catch-exception (Exception | LinkageError)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TypeLiteral typeLiteralMock = mock(TypeLiteral.class);
        try (MockedStatic<InternalFlags> internalFlags = mockStatic(InternalFlags.class)) {
            internalFlags.when(() -> InternalFlags.isBytecodeGenEnabled()).thenReturn(false);
            InjectionPoint injectionPoint = InjectionPoint.forConstructor(constructorMock, typeLiteralMock);
            DefaultConstructionProxyFactory target = new DefaultConstructionProxyFactory(injectionPoint);
            //Act Statement(s)
            ConstructionProxy result = target.create();
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            internalFlags.verify(() -> InternalFlags.isBytecodeGenEnabled(), atLeast(1));
        }
    }
}

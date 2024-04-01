package com.google.inject.internal;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.List;
import java.lang.reflect.Member;
import java.util.function.Function;
import java.util.ArrayList;
import java.lang.reflect.Constructor;
import java.util.function.BiFunction;
import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInterceptor;

import java.util.BitSet;

import com.google.inject.TypeLiteral;
import com.google.common.collect.ImmutableMap;
import org.mockito.MockedStatic;
import com.google.inject.spi.InjectionPoint;

import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.hamcrest.Matchers.is;

import org.junit.Ignore;

public class ProxyFactorySapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final ImmutableMap interceptorsMock = mock(ImmutableMap.class, "interceptors");

    private final InjectionPoint injectionPointMock = mock(InjectionPoint.class, "injectionPoint");

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${522f6081-37ae-3de0-b55a-d92d8b750799}, hash: 613B5C54AC8AA52FD411DEE65C493694
    @Ignore()
    @Test()
    public void createWhenInterceptorsIsEmpty() throws Throwable {
        /* Branches:
         * (interceptors.isEmpty()) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: object of type Member
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Constructor constructorMock = mock(Constructor.class);
        TypeLiteral typeLiteralMock = mock(TypeLiteral.class);
        InjectionPoint injectionPoint = InjectionPoint.forConstructor(constructorMock, typeLiteralMock);
        Iterable<MethodAspect> iterable = new ArrayList<>();
        ProxyFactory target = new ProxyFactory(injectionPoint, iterable);
        //Act Statement(s)
        ConstructionProxy result = target.create();
        //Assert statement(s)
        //TODO: Please implement equals method in ConstructionProxy for verification of the entire object or you need to adjust respective assertion statements
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${fc5e4389-22cf-3a89-9304-bcac0a826deb}, hash: 0C2BCFC4138ED8C115EE7E06A37FD034
    @Ignore()
    @Test()
    public void createWhenInterceptorsNotIsEmpty() throws Throwable {
        /* Branches:
         * (interceptors.isEmpty()) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: matchedInterceptors
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Member memberMock = mock(Member.class);
        MethodAspect methodAspectMock = mock(MethodAspect.class);
        Method methodMock = mock(Method.class);
        BytecodeGen.EnhancerBuilder bytecodeGenEnhancerBuilderMock = mock(BytecodeGen.EnhancerBuilder.class);
        Function functionMock = mock(Function.class);
        BiFunction biFunctionMock = mock(BiFunction.class);
        try (MockedStatic<BytecodeGen> bytecodeGen = mockStatic(BytecodeGen.class)) {
            doReturn(memberMock).when(injectionPointMock).getMember();
            doReturn(true).when(methodAspectMock).matches(Object.class);
            doReturn(true).when(methodAspectMock).matches(methodMock);
            List<MethodInterceptor> methodInterceptorList = new ArrayList<>();
            List<MethodInterceptor> methodInterceptorList2 = new ArrayList<>();
            doReturn(methodInterceptorList, methodInterceptorList2).when(methodAspectMock).interceptors();
            bytecodeGen.when(() -> BytecodeGen.enhancerBuilder(Object.class)).thenReturn(bytecodeGenEnhancerBuilderMock);
            Method[] methodArray = new Method[]{methodMock};
            doReturn(methodArray).when(bytecodeGenEnhancerBuilderMock).getEnhanceableMethods();
            doReturn(functionMock).when(bytecodeGenEnhancerBuilderMock).buildEnhancer((BitSet) any());
            bytecodeGen.when(() -> BytecodeGen.superMethod(functionMock, methodMock)).thenReturn(biFunctionMock);
            Iterable<MethodAspect> iterable = new ArrayList<>(List.of(methodAspectMock));
            ProxyFactory target = new ProxyFactory(injectionPointMock, iterable);
            //Act Statement(s)
            ConstructionProxy result = target.create();
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            verify(injectionPointMock).getMember();
            verify(methodAspectMock).matches(Object.class);
            verify(methodAspectMock).matches(methodMock);
            verify(methodAspectMock, times(2)).interceptors();
            bytecodeGen.verify(() -> BytecodeGen.enhancerBuilder(Object.class), atLeast(1));
            verify(bytecodeGenEnhancerBuilderMock).getEnhanceableMethods();
            verify(bytecodeGenEnhancerBuilderMock).buildEnhancer((BitSet) any());
            bytecodeGen.verify(() -> BytecodeGen.superMethod(functionMock, methodMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${2856b4dc-7e24-3c24-9713-8cbf7f591f85}, hash: C6196679CC296A12F5E4EC30CA4E3494
    @Ignore()
    @Test()
    public void createWhenCaughtThrowableThrowsErrorsException() throws ErrorsException {
        /* Branches:
         * (interceptors.isEmpty()) : false
         * (catch-exception (Throwable)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn(null).when(injectionPointMock).getMember();
        Iterable<MethodAspect> iterable = new ArrayList<>();
        ProxyFactory target = new ProxyFactory(injectionPointMock, iterable);
        doReturn(false).when(interceptorsMock).isEmpty();
        thrown.expect(NullPointerException.class);
        //Act Statement(s)
        target.create();
        //Assert statement(s)
        verify(injectionPointMock, times(2)).getMember();
        verify(interceptorsMock).isEmpty();
    }
}

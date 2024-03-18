package com.google.inject.internal;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.lang.reflect.Method;
import java.lang.reflect.InvocationHandler;
import java.util.function.Function;

import org.mockito.MockedStatic;

import java.lang.reflect.Constructor;

import com.google.inject.internal.aop.ClassBuilding;

import java.util.function.BiFunction;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

import org.junit.Ignore;

public class BytecodeGenSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Constructor constructorMock = mock(Constructor.class);

    //Sapient generated method id: ${e1df64ca-a36d-3e1f-a192-75c39d1b1fbd}, hash: 8832AB91D90649A219877646FA00B663
    @Ignore()
    @Test()
    public void isCircularProxyWhenCircularProxyTypeCacheContainsKeyObjectGetClass() {
        /* Branches:
         * (object != null) : true
         * (circularProxyTypeCache.containsKey(object.getClass())) : true
         */
        //Arrange Statement(s)
        Object object = new Object();
        //Act Statement(s)
        boolean result = BytecodeGen.isCircularProxy(object);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
    }

    //Sapient generated method id: ${44a25a05-01ef-3064-83f5-58a1c8e7f3ea}, hash: 2D3EC91352E80B707CAFAA89BE1B9C9B
    @Test()
    public void isCircularProxyWhenCircularProxyTypeCacheNotContainsKeyObjectGetClass() {
        /* Branches:
         * (object != null) : true
         * (circularProxyTypeCache.containsKey(object.getClass())) : false
         */
        //Arrange Statement(s)
        Object object = new Object();
        //Act Statement(s)
        boolean result = BytecodeGen.isCircularProxy(object);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${bb4c2023-7389-3754-93ca-0584fd34ad08}, hash: 2A964214D17165444C966B001E1D4134
    @Ignore()
    @Test()
    public void newCircularProxyTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        InvocationHandler invocationHandlerMock = mock(InvocationHandler.class);
        //Act Statement(s)
        Object result = BytecodeGen.newCircularProxy(Object.class, invocationHandlerMock);
        //Assert statement(s)
        //TODO: Please implement equals method in Object for verification of the entire object or you need to adjust respective assertion statements
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${6922b4ac-1218-3a9e-88b1-444bc99ed30a}, hash: D7846D7DCBEE189FF9508FD02A166715
    @Test()
    public void enhancerBuilderTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: ENHANCER_BUILDERS
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        BytecodeGen.EnhancerBuilder result = BytecodeGen.enhancerBuilder(Object.class);
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${dbb24628-7ae2-32cb-81d0-022c97c14313}, hash: 8202DBDF28265A588EE6209C7C0DB7D7
    @Ignore()
    @Test()
    public void enhancedConstructorTest() {
        //Arrange Statement(s)
        Function enhancerMock = mock(Function.class);
        BiFunction biFunctionMock = mock(BiFunction.class);
        try (MockedStatic<ClassBuilding> classBuilding = mockStatic(ClassBuilding.class)) {
            doReturn(biFunctionMock).when(enhancerMock).apply("String");
            classBuilding.when(() -> ClassBuilding.canEnhance(constructorMock)).thenReturn(true);
            classBuilding.when(() -> ClassBuilding.signature(constructorMock)).thenReturn("String");
            //Act Statement(s)
            BiFunction<Object, Object[], Object> result = BytecodeGen.enhancedConstructor(enhancerMock, constructorMock);
            //Assert statement(s)
            assertThat(result, equalTo(biFunctionMock));
            verify(enhancerMock).apply("String");
            classBuilding.verify(() -> ClassBuilding.canEnhance(constructorMock), atLeast(1));
            classBuilding.verify(() -> ClassBuilding.signature(constructorMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${1f06b569-9b8a-36f8-a602-2346ea755eec}, hash: 5AF78A5B2A0A393A6F52AD56F83B9AF2
    @Ignore()
    @Test()
    public void superMethodTest() {
        //Arrange Statement(s)
        Function enhancerMock = mock(Function.class, "EnhancerByGuice");
        Method methodMock = mock(Method.class, "FastClassByGuice");
        try (MockedStatic<ClassBuilding> classBuilding = mockStatic(ClassBuilding.class)) {
            doReturn(null).when(enhancerMock).apply("String");
            classBuilding.when(() -> ClassBuilding.signature(methodMock)).thenReturn("String");
            //Act Statement(s)
            BiFunction<Object, Object[], Object> result = BytecodeGen.superMethod(enhancerMock, methodMock);
            //Assert statement(s)
            assertThat(result, is(nullValue()));
            verify(enhancerMock).apply("String");
            classBuilding.verify(() -> ClassBuilding.signature(methodMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${1032a1a6-3169-3046-a7dd-cbcd6ce927c6}, hash: 57E92CBFA4F6D11A3459BCC203772E76
    @Ignore()
    @Test()
    public void fastConstructorWhenCanFastInvokeConstructor() {
        /* Branches:
         * (canFastInvoke(constructor)) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: FAST_CLASSES - Method: get
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Constructor memberMock = mock(Constructor.class);
        try (MockedStatic<ClassBuilding> classBuilding = mockStatic(ClassBuilding.class)) {
            doReturn(Object.class).when(memberMock).getDeclaringClass();
            classBuilding.when(() -> ClassBuilding.canFastInvoke(memberMock)).thenReturn(true);
            classBuilding.when(() -> ClassBuilding.signature(memberMock)).thenReturn("String");
            //Act Statement(s)
            BiFunction<Object, Object[], Object> result = BytecodeGen.fastConstructor(memberMock);
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            verify(memberMock).getDeclaringClass();
            classBuilding.verify(() -> ClassBuilding.canFastInvoke(memberMock), atLeast(1));
            classBuilding.verify(() -> ClassBuilding.signature(memberMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${90372059-d87c-378f-9a8b-6a9f60f8bece}, hash: 5691D9D3E822BE88FF01BA4479C89372
    @Test()
    public void fastConstructorWhenCanFastInvokeNotConstructor() {
        /* Branches:
         * (canFastInvoke(constructor)) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ClassBuilding> classBuilding = mockStatic(ClassBuilding.class)) {
            classBuilding.when(() -> ClassBuilding.canFastInvoke(constructorMock)).thenReturn(false);
            //Act Statement(s)
            BiFunction<Object, Object[], Object> result = BytecodeGen.fastConstructor(constructorMock);
            //Assert statement(s)
            assertThat(result, is(nullValue()));
            classBuilding.verify(() -> ClassBuilding.canFastInvoke(constructorMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${68604c4f-22dd-329d-acc6-ad06a14a3a84}, hash: 3AE9CBC6F9A6F1A6397B65CBAE0F25FD
    @Ignore()
    @Test()
    public void fastMethodWhenCanFastInvokeMethod() {
        /* Branches:
         * (canFastInvoke(method)) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: FAST_CLASSES - Method: get
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Method memberMock = mock(Method.class, "fastMethod");
        try (MockedStatic<ClassBuilding> classBuilding = mockStatic(ClassBuilding.class)) {
            doReturn(null).when(memberMock).getDeclaringClass();
            classBuilding.when(() -> ClassBuilding.canFastInvoke(memberMock)).thenReturn(true);
            classBuilding.when(() -> ClassBuilding.signature(memberMock)).thenReturn("java.util.function.BiFunction<java.lang.Object, java.lang.Object[], java.lang.Object>");
            //Act Statement(s)
            BiFunction<Object, Object[], Object> result = BytecodeGen.fastMethod(memberMock);
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            verify(memberMock).getDeclaringClass();
            classBuilding.verify(() -> ClassBuilding.canFastInvoke(memberMock), atLeast(1));
            classBuilding.verify(() -> ClassBuilding.signature(memberMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${5a10a0fc-1dd7-3f67-ac31-0b738fff1ec4}, hash: 347226BC691C2871C2D77CF8FE599F3B
    @Test()
    public void fastMethodWhenCanFastInvokeNotMethod() {
        /* Branches:
         * (canFastInvoke(method)) : false
         */
        //Arrange Statement(s)
        Method methodMock = mock(Method.class);
        try (MockedStatic<ClassBuilding> classBuilding = mockStatic(ClassBuilding.class)) {
            classBuilding.when(() -> ClassBuilding.canFastInvoke(methodMock)).thenReturn(false);
            //Act Statement(s)
            BiFunction<Object, Object[], Object> result = BytecodeGen.fastMethod(methodMock);
            //Assert statement(s)
            assertThat(result, is(nullValue()));
            classBuilding.verify(() -> ClassBuilding.canFastInvoke(methodMock), atLeast(1));
        }
    }
}

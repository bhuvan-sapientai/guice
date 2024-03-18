package com.google.inject.internal.aop;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.stubbing.Answer;

import java.lang.reflect.Method;
import java.lang.reflect.Executable;

import org.objectweb.asm.Type;
import org.objectweb.asm.MethodVisitor;

import java.util.Collection;

import org.objectweb.asm.ClassWriter;
import org.mockito.MockedStatic;

import java.util.ArrayList;
import java.lang.invoke.MethodHandle;
import java.lang.reflect.Constructor;

import static org.mockito.Mockito.doNothing;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.is;

import org.junit.Ignore;

public class FastClassSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Method methodMock = mock(Method.class);

    private final MethodVisitor mvMock = mock(MethodVisitor.class);

    //Sapient generated method id: ${53d5dcdc-51e7-34c0-a8bd-fc803c8dc469}, hash: 717F55529124D0393A13362CE54C69CF
    @Ignore()
    @Test()
    public void generateGlueTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: cw, mv, object of type FieldVisitor
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Type> type = mockStatic(Type.class)) {
            type.when(() -> Type.getInternalName(Object.class)).thenReturn("java/D");
            FastClass target = spy(new FastClass(Object.class));
            Collection<Executable> collection = new ArrayList<>();
            doNothing().when(target).generateTrampoline((ClassWriter) any(), eq(collection));
            //Act Statement(s)
            byte[] result = target.generateGlue(collection);
            byte[] byteResultArray = new byte[]{(byte) -54, (byte) -2, (byte) -70, (byte) -66, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            //Assert statement(s)
            assertThat(result, equalTo(byteResultArray));
            type.verify(() -> Type.getInternalName(Object.class), atLeast(1));
            verify(target).generateTrampoline((ClassWriter) any(), eq(collection));
        }
    }

    //Sapient generated method id: ${774a332f-f8d8-3f73-8257-32f421f4068a}, hash: 59EDA358B61ED7916A2AA11FCB980634
    @Ignore()
    @Test()
    public void generateConstructorInvokerTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Constructor constructorMock = mock(Constructor.class);
        try (MockedStatic<Type> type = mockStatic(Type.class);
             MockedStatic<BytecodeTasks> bytecodeTasks = mockStatic(BytecodeTasks.class)) {
            doNothing().when(mvMock).visitTypeInsn(187, "java/D");
            doNothing().when(mvMock).visitInsn(89);
            doNothing().when(mvMock).visitMethodInsn(183, "java/D", "<init>", "return_of_getConstructorDescriptor1", false);
            type.when(() -> Type.getInternalName(Object.class)).thenReturn("java/D");
            Class<?>[] classArray = new Class[]{};
            bytecodeTasks.when(() -> BytecodeTasks.unpackArguments(mvMock, classArray)).thenAnswer((Answer<Void>) invocation -> null);
            type.when(() -> Type.getConstructorDescriptor(constructorMock)).thenReturn("return_of_getConstructorDescriptor1");
            FastClass target = new FastClass(Object.class);
            //Act Statement(s)
            target.generateConstructorInvoker(mvMock, constructorMock);
            //Assert statement(s)
            verify(mvMock).visitTypeInsn(187, "java/D");
            verify(mvMock).visitInsn(89);
            verify(mvMock).visitMethodInsn(183, "java/D", "<init>", "return_of_getConstructorDescriptor1", false);
            type.verify(() -> Type.getInternalName(Object.class), atLeast(1));
            bytecodeTasks.verify(() -> BytecodeTasks.unpackArguments(mvMock, classArray), atLeast(1));
            type.verify(() -> Type.getConstructorDescriptor(constructorMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${8cc85d66-ea8a-3a0f-aa85-912e93627b91}, hash: A8938C6EA8636DFE224532EDCB62D7C1
    @Ignore()
    @Test()
    public void generateMethodInvokerWhenReturnTypeEqualsDefaultType() {
        /* Branches:
         * ((method.getModifiers() & STATIC) == 0) : false
         * (returnType == void.class) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Type> type = mockStatic(Type.class);
             MockedStatic<BytecodeTasks> bytecodeTasks = mockStatic(BytecodeTasks.class)) {
            doNothing().when(mvMock).visitMethodInsn(184, "java/D", "name1", "return_of_getMethodDescriptor1", false);
            doNothing().when(mvMock).visitInsn(1);
            type.when(() -> Type.getInternalName(Object.class)).thenReturn("java/D");
            Class<?>[] classArray = new Class[]{};
            bytecodeTasks.when(() -> BytecodeTasks.unpackArguments(mvMock, classArray)).thenAnswer((Answer<Void>) invocation -> null);
            type.when(() -> Type.getMethodDescriptor(methodMock)).thenReturn("return_of_getMethodDescriptor1");
            FastClass target = new FastClass(Object.class);
            //Act Statement(s)
            target.generateMethodInvoker(mvMock, methodMock);
            //Assert statement(s)
            verify(mvMock).visitMethodInsn(184, "java/D", "name1", "return_of_getMethodDescriptor1", false);
            verify(mvMock).visitInsn(1);
            type.verify(() -> Type.getInternalName(Object.class), atLeast(1));
            bytecodeTasks.verify(() -> BytecodeTasks.unpackArguments(mvMock, classArray), atLeast(1));
            type.verify(() -> Type.getMethodDescriptor(methodMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${de8d6337-15da-311d-b869-7c8166d2cb6f}, hash: C59B4A1271039E2B963475B89CC8DABD
    @Ignore()
    @Test()
    public void generateMethodInvokerWhenNotHostIsInterfaceAndReturnTypeEqualsDefaultType() {
        /* Branches:
         * ((method.getModifiers() & STATIC) == 0) : true
         * (hostIsInterface) : false
         * (returnType == void.class) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Type> type = mockStatic(Type.class);
             MockedStatic<BytecodeTasks> bytecodeTasks = mockStatic(BytecodeTasks.class)) {
            doNothing().when(mvMock).visitVarInsn(25, 1);
            doNothing().when(mvMock).visitTypeInsn(192, "java/D");
            doNothing().when(mvMock).visitMethodInsn(182, "java/D", "name1", "return_of_getMethodDescriptor1", false);
            doNothing().when(mvMock).visitInsn(1);
            type.when(() -> Type.getInternalName(Object.class)).thenReturn("java/D");
            Class<?>[] classArray = new Class[]{};
            bytecodeTasks.when(() -> BytecodeTasks.unpackArguments(mvMock, classArray)).thenAnswer((Answer<Void>) invocation -> null);
            type.when(() -> Type.getMethodDescriptor(methodMock)).thenReturn("return_of_getMethodDescriptor1");
            FastClass target = new FastClass(Object.class);
            //Act Statement(s)
            target.generateMethodInvoker(mvMock, methodMock);
            //Assert statement(s)
            verify(mvMock).visitVarInsn(25, 1);
            verify(mvMock).visitTypeInsn(192, "java/D");
            verify(mvMock).visitMethodInsn(182, "java/D", "name1", "return_of_getMethodDescriptor1", false);
            verify(mvMock).visitInsn(1);
            type.verify(() -> Type.getInternalName(Object.class), atLeast(1));
            bytecodeTasks.verify(() -> BytecodeTasks.unpackArguments(mvMock, classArray), atLeast(1));
            type.verify(() -> Type.getMethodDescriptor(methodMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${b807789b-7ab9-3be1-abbc-9888481c4801}, hash: 01274ED5AFB82B276EBB2E1E7A55BFD0
    @Ignore()
    @Test()
    public void generateMethodInvokerWhenReturnTypeNotEqualsDefaultTypeAndReturnTypeIsPrimitive() {
        /* Branches:
         * ((method.getModifiers() & STATIC) == 0) : true
         * (hostIsInterface) : true
         * (returnType == void.class) : false
         * (returnType.isPrimitive()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Type typeMock = mock(Type.class);
        try (MockedStatic<BytecodeTasks> bytecodeTasks = mockStatic(BytecodeTasks.class);
             MockedStatic<Type> type = mockStatic(Type.class)) {
            doNothing().when(mvMock).visitVarInsn(25, 1);
            doNothing().when(mvMock).visitTypeInsn(192, "java/D");
            doNothing().when(mvMock).visitMethodInsn(185, "java/D", "name1", "return_of_getMethodDescriptor1", true);
            type.when(() -> Type.getInternalName(Object.class)).thenReturn("java/D");
            Class<?>[] classArray = new Class[]{};
            bytecodeTasks.when(() -> BytecodeTasks.unpackArguments(mvMock, classArray)).thenAnswer((Answer<Void>) invocation -> null);
            type.when(() -> Type.getMethodDescriptor(methodMock)).thenReturn("return_of_getMethodDescriptor1");
            type.when(() -> Type.getType(Object.class)).thenReturn(typeMock);
            bytecodeTasks.when(() -> BytecodeTasks.box(mvMock, typeMock)).thenAnswer((Answer<Void>) invocation -> null);
            FastClass target = new FastClass(Object.class);
            //Act Statement(s)
            target.generateMethodInvoker(mvMock, methodMock);
            //Assert statement(s)
            verify(mvMock).visitVarInsn(25, 1);
            verify(mvMock).visitTypeInsn(192, "java/D");
            verify(mvMock).visitMethodInsn(185, "java/D", "name1", "return_of_getMethodDescriptor1", true);
            type.verify(() -> Type.getInternalName(Object.class), atLeast(1));
            bytecodeTasks.verify(() -> BytecodeTasks.unpackArguments(mvMock, classArray), atLeast(1));
            type.verify(() -> Type.getMethodDescriptor(methodMock), atLeast(1));
            type.verify(() -> Type.getType(Object.class), atLeast(1));
            bytecodeTasks.verify(() -> BytecodeTasks.box(mvMock, typeMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${92a3c3cd-f051-3cde-b832-697fabbcb7eb}, hash: 171C913C5F10A6C02F566FC89D352E3F
    @Ignore()
    @Test()
    public void lookupInvokerTableTest() throws Throwable {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Type> type = mockStatic(Type.class)) {
            type.when(() -> Type.getInternalName(Object.class)).thenReturn("java/D");
            FastClass target = new FastClass(Object.class);
            //Act Statement(s)
            MethodHandle result = target.lookupInvokerTable(Object.class);
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            type.verify(() -> Type.getInternalName(Object.class), atLeast(1));
        }
    }
}

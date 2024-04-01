package com.google.inject.internal.aop;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.stubbing.Answer;

import java.lang.reflect.Method;
import java.lang.reflect.Executable;

import org.objectweb.asm.Type;
import org.objectweb.asm.MethodVisitor;

import java.util.Map;
import java.util.HashMap;
import java.util.Collection;

import org.objectweb.asm.ClassWriter;
import org.mockito.MockedStatic;

import java.util.ArrayList;
import java.lang.invoke.MethodHandle;
import java.lang.reflect.Constructor;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

import org.junit.Ignore;

public class EnhancerSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Constructor constructorMock = mock(Constructor.class);

    private final Method methodMock = mock(Method.class);

    private final MethodVisitor mvMock = mock(MethodVisitor.class);

    private final Type typeMock = mock(Type.class);

    //Sapient generated method id: ${b9a47407-2e5c-3bcd-90a2-5919e718afa4}, hash: EB54E4F9A8255B17EBA635D37894FC99
    @Ignore()
    @Test()
    public void generateGlueWhenMembersIsEmptyAndRemainingBridgeMethodsIsEmpty() {
        /* Branches:
         * (ClassDefining.canLoadProxyByName(hostClass)) : false  #  inside setupInvokerTable method
         * (for-each(members)) : false
         * (for-each(remainingBridgeMethods)) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: cw, object of type FieldVisitor
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ClassDefining> classDefining = mockStatic(ClassDefining.class, CALLS_REAL_METHODS);
             MockedStatic<Type> type = mockStatic(Type.class)) {
            type.when(() -> Type.getInternalName(Object.class)).thenReturn("java/");
            classDefining.when(() -> ClassDefining.canDowncastToProxy(Object.class)).thenReturn(true);
            classDefining.when(() -> ClassDefining.canLoadProxyByName(Object.class)).thenReturn(false);
            Map<Method, Method> methodMethodMap = new HashMap<>();
            Enhancer target = spy(new Enhancer(Object.class, methodMethodMap));
            Collection<Executable> collection = new ArrayList<>();
            doNothing().when(target).generateTrampoline((ClassWriter) any(), eq(collection));
            //Act Statement(s)
            byte[] result = target.generateGlue(collection);
            byte[] byteResultArray = new byte[]{(byte) -54, (byte) -2, (byte) -70, (byte) -66, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            //Assert statement(s)
            assertThat(result, equalTo(byteResultArray));
            type.verify(() -> Type.getInternalName(Object.class), atLeast(1));
            classDefining.verify(() -> ClassDefining.canDowncastToProxy(Object.class), atLeast(1));
            classDefining.verify(() -> ClassDefining.canLoadProxyByName(Object.class), atLeast(1));
            verify(target, atLeast(1)).generateTrampoline((ClassWriter) any(), eq(collection));
        }
    }

    //Sapient generated method id: ${c9f990f5-52f8-381e-9e9c-4d207eee47c8}, hash: DCA1EE6C12F35AF27EF0B9D520629A80
    @Ignore()
    @Test()
    public void generateGlueWhenConstructorGetParameterTypesIsNotEmptyAndRemainingBridgeMethodsIsEmpty() {
        /* Branches:
         * (ClassDefining.canLoadProxyByName(hostClass)) : true  #  inside setupInvokerTable method
         * (for-each(members)) : true
         * (member instanceof Constructor<?>) : true
         * (for-each(constructor.getParameterTypes())) : true  #  inside enhanceConstructor method
         * (for-each(remainingBridgeMethods)) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: cw, object of type FieldVisitor
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<BytecodeTasks> bytecodeTasks = mockStatic(BytecodeTasks.class);
             MockedStatic<Type> type = mockStatic(Type.class);
             MockedStatic<ClassDefining> classDefining = mockStatic(ClassDefining.class, CALLS_REAL_METHODS)) {
            classDefining.when(() -> ClassDefining.canDowncastToProxy(Object.class)).thenReturn(true);
            classDefining.when(() -> ClassDefining.canLoadProxyByName(Object.class)).thenReturn(true);
            type.when(() -> Type.getConstructorDescriptor(constructorMock)).thenReturn("AJ");
            type.when(() -> Type.getInternalName(Object.class)).thenReturn("java/KM").thenReturn("return_of_getInternalName1");
            bytecodeTasks.when(() -> BytecodeTasks.loadArgument((MethodVisitor) any(), eq(Object.class), eq(2))).thenReturn(0);
            Map<Method, Method> methodMethodMap = new HashMap<>();
            Enhancer target = spy(new Enhancer(Object.class, methodMethodMap));
            Collection<Executable> collection = new ArrayList<>();
            collection.add(constructorMock);
            doNothing().when(target).generateTrampoline((ClassWriter) any(), eq(collection));
            //Act Statement(s)
            byte[] result = target.generateGlue(collection);
            byte[] byteResultArray = new byte[]{(byte) -54, (byte) -2, (byte) -70, (byte) -66, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            //Assert statement(s)
            assertThat(result, equalTo(byteResultArray));
            type.verify(() -> Type.getInternalName(Object.class), atLeast(2));
            classDefining.verify(() -> ClassDefining.canDowncastToProxy(Object.class), atLeast(1));
            classDefining.verify(() -> ClassDefining.canLoadProxyByName(Object.class), atLeast(1));
            type.verify(() -> Type.getConstructorDescriptor(constructorMock), atLeast(1));
            bytecodeTasks.verify(() -> BytecodeTasks.loadArgument((MethodVisitor) any(), eq(Object.class), eq(2)), atLeast(1));
            verify(target, atLeast(1)).generateTrampoline((ClassWriter) any(), eq(collection));
        }
    }

    //Sapient generated method id: ${1e653d20-94d9-3775-9f74-56f3f591d969}, hash: F873B30DD3D4F10724AA28C0C69E5EAF
    @Ignore()
    @Test()
    public void generateGlueWhenReturnTypeEqualsDefaultTypeAndRemainingBridgeMethodsIsEmpty() {
        /* Branches:
         * (ClassDefining.canLoadProxyByName(hostClass)) : true  #  inside setupInvokerTable method
         * (for-each(members)) : true
         * (member instanceof Constructor<?>) : false
         * (returnType == void.class) : true  #  inside enhanceMethod method
         * (for-each(remainingBridgeMethods)) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: cw, object of type FieldVisitor
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<BytecodeTasks> bytecodeTasks = mockStatic(BytecodeTasks.class);
             MockedStatic<Type> type = mockStatic(Type.class);
             MockedStatic<ClassDefining> classDefining = mockStatic(ClassDefining.class, CALLS_REAL_METHODS)) {
            classDefining.when(() -> ClassDefining.canDowncastToProxy(Object.class)).thenReturn(true);
            classDefining.when(() -> ClassDefining.canLoadProxyByName(Object.class)).thenReturn(true);
            type.when(() -> Type.getMethodDescriptor(methodMock)).thenReturn("return_of_getMethodDescriptor1");
            type.when(() -> Type.getInternalName(Object.class)).thenReturn("java/H").thenReturn("return_of_getInternalName1");
            bytecodeTasks.when(() -> BytecodeTasks.pushInteger((MethodVisitor) any(), eq(0))).thenAnswer((Answer<Void>) invocation -> null);
            Class<?>[] classArray = new Class[]{};
            bytecodeTasks.when(() -> BytecodeTasks.packArguments((MethodVisitor) any(), eq(classArray))).thenAnswer((Answer<Void>) invocation -> null);
            Map<Method, Method> methodMethodMap = new HashMap<>();
            Enhancer target = spy(new Enhancer(Object.class, methodMethodMap));
            Collection<Executable> collection = new ArrayList<>();
            collection.add(methodMock);
            doNothing().when(target).generateTrampoline((ClassWriter) any(), eq(collection));
            //Act Statement(s)
            byte[] result = target.generateGlue(collection);
            byte[] byteResultArray = new byte[]{(byte) -54, (byte) -2, (byte) -70, (byte) -66, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            //Assert statement(s)
            assertThat(result, equalTo(byteResultArray));
            type.verify(() -> Type.getInternalName(Object.class), atLeast(2));
            classDefining.verify(() -> ClassDefining.canDowncastToProxy(Object.class), atLeast(1));
            classDefining.verify(() -> ClassDefining.canLoadProxyByName(Object.class), atLeast(1));
            type.verify(() -> Type.getMethodDescriptor(methodMock), atLeast(1));
            bytecodeTasks.verify(() -> BytecodeTasks.pushInteger((MethodVisitor) any(), eq(0)), atLeast(1));
            bytecodeTasks.verify(() -> BytecodeTasks.packArguments((MethodVisitor) any(), eq(classArray)), atLeast(1));
            verify(target, atLeast(1)).generateTrampoline((ClassWriter) any(), eq(collection));
        }
    }

    //Sapient generated method id: ${858b6607-9cbe-32ce-b346-83fe223dbaa4}, hash: A65C15C9650E2FC6D66F4BF199101D6F
    @Ignore()
    @Test()
    public void generateGlueWhenReturnTypeIsPrimitiveAndRemainingBridgeMethodsIsEmpty() {
        /* Branches:
         * (ClassDefining.canLoadProxyByName(hostClass)) : true  #  inside setupInvokerTable method
         * (for-each(members)) : true
         * (member instanceof Constructor<?>) : false
         * (returnType == void.class) : false  #  inside enhanceMethod method
         * (returnType.isPrimitive()) : true  #  inside enhanceMethod method
         * (for-each(remainingBridgeMethods)) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: cw, object of type FieldVisitor
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<BytecodeTasks> bytecodeTasks = mockStatic(BytecodeTasks.class);
             MockedStatic<Type> type = mockStatic(Type.class);
             MockedStatic<ClassDefining> classDefining = mockStatic(ClassDefining.class, CALLS_REAL_METHODS)) {
            classDefining.when(() -> ClassDefining.canDowncastToProxy(Object.class)).thenReturn(true);
            classDefining.when(() -> ClassDefining.canLoadProxyByName(Object.class)).thenReturn(true);
            type.when(() -> Type.getMethodDescriptor(methodMock)).thenReturn("return_of_getMethodDescriptor1");
            type.when(() -> Type.getInternalName(Object.class)).thenReturn("java/H").thenReturn("return_of_getInternalName1");
            bytecodeTasks.when(() -> BytecodeTasks.pushInteger((MethodVisitor) any(), eq(0))).thenAnswer((Answer<Void>) invocation -> null);
            Class<?>[] classArray = new Class[]{};
            bytecodeTasks.when(() -> BytecodeTasks.packArguments((MethodVisitor) any(), eq(classArray))).thenAnswer((Answer<Void>) invocation -> null);
            type.when(() -> Type.getType(Object.class)).thenReturn(typeMock);
            doReturn(0).when(typeMock).getOpcode(172);
            bytecodeTasks.when(() -> BytecodeTasks.unbox((MethodVisitor) any(), eq(typeMock))).thenAnswer((Answer<Void>) invocation -> null);
            Map<Method, Method> methodMethodMap = new HashMap<>();
            Enhancer target = spy(new Enhancer(Object.class, methodMethodMap));
            Collection<Executable> collection = new ArrayList<>();
            collection.add(methodMock);
            doNothing().when(target).generateTrampoline((ClassWriter) any(), eq(collection));
            //Act Statement(s)
            byte[] result = target.generateGlue(collection);
            byte[] byteResultArray = new byte[]{(byte) -54, (byte) -2, (byte) -70, (byte) -66, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            //Assert statement(s)
            assertThat(result, equalTo(byteResultArray));
            type.verify(() -> Type.getInternalName(Object.class), atLeast(2));
            classDefining.verify(() -> ClassDefining.canDowncastToProxy(Object.class), atLeast(1));
            classDefining.verify(() -> ClassDefining.canLoadProxyByName(Object.class), atLeast(1));
            type.verify(() -> Type.getMethodDescriptor(methodMock), atLeast(1));
            bytecodeTasks.verify(() -> BytecodeTasks.pushInteger((MethodVisitor) any(), eq(0)), atLeast(1));
            bytecodeTasks.verify(() -> BytecodeTasks.packArguments((MethodVisitor) any(), eq(classArray)), atLeast(1));
            type.verify(() -> Type.getType(Object.class), atLeast(1));
            verify(typeMock, atLeast(1)).getOpcode(172);
            bytecodeTasks.verify(() -> BytecodeTasks.unbox((MethodVisitor) any(), eq(typeMock)), atLeast(1));
            verify(target, atLeast(1)).generateTrampoline((ClassWriter) any(), eq(collection));
        }
    }

    //Sapient generated method id: ${28c6b758-a740-31fd-90d5-76a9e1cf8814}, hash: F0E3EB52E8B9E37BB902660EF6EC0B6E
    @Ignore()
    @Test()
    public void generateGlueWhenReturnTypeNotIsPrimitiveAndRemainingBridgeMethodsIsEmpty() {
        /* Branches:
         * (ClassDefining.canLoadProxyByName(hostClass)) : true  #  inside setupInvokerTable method
         * (for-each(members)) : true
         * (member instanceof Constructor<?>) : false
         * (returnType == void.class) : false  #  inside enhanceMethod method
         * (returnType.isPrimitive()) : false  #  inside enhanceMethod method
         * (for-each(remainingBridgeMethods)) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: cw, object of type FieldVisitor
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Type> type = mockStatic(Type.class);
             MockedStatic<BytecodeTasks> bytecodeTasks = mockStatic(BytecodeTasks.class);
             MockedStatic<ClassDefining> classDefining = mockStatic(ClassDefining.class, CALLS_REAL_METHODS)) {
            classDefining.when(() -> ClassDefining.canDowncastToProxy(Object.class)).thenReturn(true);
            classDefining.when(() -> ClassDefining.canLoadProxyByName(Object.class)).thenReturn(true);
            type.when(() -> Type.getMethodDescriptor(methodMock)).thenReturn("return_of_getMethodDescriptor1");
            type.when(() -> Type.getInternalName(Object.class)).thenReturn("java/H").thenReturn("return_of_getInternalName1").thenReturn("return_of_getInternalName1");
            bytecodeTasks.when(() -> BytecodeTasks.pushInteger((MethodVisitor) any(), eq(0))).thenAnswer((Answer<Void>) invocation -> null);
            Class<?>[] classArray = new Class[]{};
            bytecodeTasks.when(() -> BytecodeTasks.packArguments((MethodVisitor) any(), eq(classArray))).thenAnswer((Answer<Void>) invocation -> null);
            Map<Method, Method> methodMethodMap = new HashMap<>();
            Enhancer target = spy(new Enhancer(Object.class, methodMethodMap));
            Collection<Executable> collection = new ArrayList<>();
            collection.add(methodMock);
            doNothing().when(target).generateTrampoline((ClassWriter) any(), eq(collection));
            //Act Statement(s)
            byte[] result = target.generateGlue(collection);
            byte[] byteResultArray = new byte[]{(byte) -54, (byte) -2, (byte) -70, (byte) -66, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
            //Assert statement(s)
            assertThat(result, equalTo(byteResultArray));
            type.verify(() -> Type.getInternalName(Object.class), atLeast(3));
            classDefining.verify(() -> ClassDefining.canDowncastToProxy(Object.class), atLeast(1));
            classDefining.verify(() -> ClassDefining.canLoadProxyByName(Object.class), atLeast(1));
            type.verify(() -> Type.getMethodDescriptor(methodMock), atLeast(1));
            bytecodeTasks.verify(() -> BytecodeTasks.pushInteger((MethodVisitor) any(), eq(0)), atLeast(1));
            bytecodeTasks.verify(() -> BytecodeTasks.packArguments((MethodVisitor) any(), eq(classArray)), atLeast(1));
            verify(target, atLeast(1)).generateTrampoline((ClassWriter) any(), eq(collection));
        }
    }

    //Sapient generated method id: ${774a332f-f8d8-3f73-8257-32f421f4068a}, hash: 539FD66934F581E02A6E5A52F192D494
    @Ignore()
    @Test()
    public void generateConstructorInvokerTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<BytecodeTasks> bytecodeTasks = mockStatic(BytecodeTasks.class);
             MockedStatic<Type> type = mockStatic(Type.class);
             MockedStatic<ClassDefining> classDefining = mockStatic(ClassDefining.class, CALLS_REAL_METHODS)) {
            doNothing().when(mvMock).visitTypeInsn(187, "java/F$$EnhancerByGuice$$0");
            doNothing().when(mvMock).visitInsn(89);
            doNothing().when(mvMock).visitVarInsn(25, 1);
            doNothing().when(mvMock).visitTypeInsn(192, "[Ljava/lang/reflect/InvocationHandler;");
            doNothing().when(mvMock).visitMethodInsn(183, "java/F$$EnhancerByGuice$$0", "<init>", "([Ljava/lang/reflect/InvocationHandler;D", false);
            type.when(() -> Type.getInternalName(Object.class)).thenReturn("java/F");
            classDefining.when(() -> ClassDefining.canDowncastToProxy(Object.class)).thenReturn(true);
            type.when(() -> Type.getConstructorDescriptor(constructorMock)).thenReturn("AD");
            Class<?>[] classArray = new Class[]{};
            bytecodeTasks.when(() -> BytecodeTasks.unpackArguments(mvMock, classArray)).thenAnswer((Answer<Void>) invocation -> null);
            Map<Method, Method> methodMethodMap = new HashMap<>();
            Enhancer target = new Enhancer(Object.class, methodMethodMap);
            //Act Statement(s)
            target.generateConstructorInvoker(mvMock, constructorMock);
            //Assert statement(s)
            verify(mvMock, atLeast(1)).visitTypeInsn(187, "java/F$$EnhancerByGuice$$0");
            verify(mvMock, atLeast(1)).visitInsn(89);
            verify(mvMock, atLeast(1)).visitVarInsn(25, 1);
            verify(mvMock, atLeast(1)).visitTypeInsn(192, "[Ljava/lang/reflect/InvocationHandler;");
            verify(mvMock, atLeast(1)).visitMethodInsn(183, "java/F$$EnhancerByGuice$$0", "<init>", "([Ljava/lang/reflect/InvocationHandler;D", false);
            type.verify(() -> Type.getInternalName(Object.class), atLeast(1));
            classDefining.verify(() -> ClassDefining.canDowncastToProxy(Object.class), atLeast(1));
            type.verify(() -> Type.getConstructorDescriptor(constructorMock), atLeast(1));
            bytecodeTasks.verify(() -> BytecodeTasks.unpackArguments(mvMock, classArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${03044afa-d7bc-3c8b-83a8-91d084c0ef1d}, hash: 292CBE7D424234B4F5F8D499C8EB2B4B
    @Ignore()
    @Test()
    public void generateMethodInvokerWhenTargetEqualsMethodAndReturnTypeEqualsDefaultType() {
        /* Branches:
         * (target != method) : false
         * (returnType == void.class) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Type> type = mockStatic(Type.class);
             MockedStatic<BytecodeTasks> bytecodeTasks = mockStatic(BytecodeTasks.class);
             MockedStatic<ClassDefining> classDefining = mockStatic(ClassDefining.class, CALLS_REAL_METHODS)) {
            doNothing().when(mvMock).visitVarInsn(25, 1);
            doNothing().when(mvMock).visitTypeInsn(192, "java/K$$EnhancerByGuice$$0");
            doNothing().when(mvMock).visitMethodInsn(183, "java/K", "name1", "return_of_getMethodDescriptor1", false);
            doNothing().when(mvMock).visitInsn(1);
            type.when(() -> Type.getInternalName(Object.class)).thenReturn("java/K");
            classDefining.when(() -> ClassDefining.canDowncastToProxy(Object.class)).thenReturn(true);
            Class<?>[] classArray = new Class[]{};
            bytecodeTasks.when(() -> BytecodeTasks.unpackArguments(mvMock, classArray)).thenAnswer((Answer<Void>) invocation -> null);
            type.when(() -> Type.getMethodDescriptor(methodMock)).thenReturn("return_of_getMethodDescriptor1");
            Map<Method, Method> methodMethodMap = new HashMap<>();
            Enhancer target = new Enhancer(Object.class, methodMethodMap);
            //Act Statement(s)
            target.generateMethodInvoker(mvMock, methodMock);
            //Assert statement(s)
            verify(mvMock, atLeast(1)).visitVarInsn(25, 1);
            verify(mvMock, atLeast(1)).visitTypeInsn(192, "java/K$$EnhancerByGuice$$0");
            verify(mvMock, atLeast(1)).visitMethodInsn(183, "java/K", "name1", "return_of_getMethodDescriptor1", false);
            verify(mvMock, atLeast(1)).visitInsn(1);
            type.verify(() -> Type.getInternalName(Object.class), atLeast(1));
            classDefining.verify(() -> ClassDefining.canDowncastToProxy(Object.class), atLeast(1));
            bytecodeTasks.verify(() -> BytecodeTasks.unpackArguments(mvMock, classArray), atLeast(1));
            type.verify(() -> Type.getMethodDescriptor(methodMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${2a755978-4d80-37e5-9e42-b29f2516bfd9}, hash: 777DB7F67146FBCD76BA6D7591D68E25
    @Ignore()
    @Test()
    public void generateMethodInvokerWhenReturnTypeIsPrimitive() {
        /* Branches:
         * (target != method) : true
         * (returnType == void.class) : false
         * (returnType.isPrimitive()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Method methodMock2 = mock(Method.class);
        try (MockedStatic<BytecodeTasks> bytecodeTasks = mockStatic(BytecodeTasks.class);
             MockedStatic<Type> type = mockStatic(Type.class);
             MockedStatic<ClassDefining> classDefining = mockStatic(ClassDefining.class, CALLS_REAL_METHODS)) {
            doNothing().when(mvMock).visitVarInsn(25, 1);
            doNothing().when(mvMock).visitTypeInsn(192, "java/C$$EnhancerByGuice$$0");
            doNothing().when(mvMock).visitMethodInsn(182, "java/C", "name1", "return_of_getMethodDescriptor1", false);
            type.when(() -> Type.getInternalName(Object.class)).thenReturn("java/C");
            classDefining.when(() -> ClassDefining.canDowncastToProxy(Object.class)).thenReturn(true);
            Class<?>[] classArray = new Class[]{};
            bytecodeTasks.when(() -> BytecodeTasks.unpackArguments(mvMock, classArray)).thenAnswer((Answer<Void>) invocation -> null);
            type.when(() -> Type.getMethodDescriptor(methodMock)).thenReturn("return_of_getMethodDescriptor1");
            type.when(() -> Type.getType(Object.class)).thenReturn(typeMock);
            bytecodeTasks.when(() -> BytecodeTasks.box(mvMock, typeMock)).thenAnswer((Answer<Void>) invocation -> null);
            Map<Method, Method> methodMethodMap = new HashMap<>();
            Enhancer target = new Enhancer(Object.class, methodMethodMap);
            //Act Statement(s)
            target.generateMethodInvoker(mvMock, methodMock2);
            //Assert statement(s)
            verify(mvMock, atLeast(1)).visitVarInsn(25, 1);
            verify(mvMock, atLeast(1)).visitTypeInsn(192, "java/C$$EnhancerByGuice$$0");
            verify(mvMock, atLeast(1)).visitMethodInsn(182, "java/C", "name1", "return_of_getMethodDescriptor1", false);
            type.verify(() -> Type.getInternalName(Object.class), atLeast(1));
            classDefining.verify(() -> ClassDefining.canDowncastToProxy(Object.class), atLeast(1));
            bytecodeTasks.verify(() -> BytecodeTasks.unpackArguments(mvMock, classArray), atLeast(1));
            type.verify(() -> Type.getMethodDescriptor(methodMock), atLeast(1));
            type.verify(() -> Type.getType(Object.class), atLeast(1));
            bytecodeTasks.verify(() -> BytecodeTasks.box(mvMock, typeMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${92a3c3cd-f051-3cde-b832-697fabbcb7eb}, hash: FE32779065305424CA622EDBFCC60171
    @Ignore()
    @Test()
    public void lookupInvokerTableTest() throws Throwable {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ClassDefining> classDefining = mockStatic(ClassDefining.class, CALLS_REAL_METHODS);
             MockedStatic<Type> type = mockStatic(Type.class)) {
            type.when(() -> Type.getInternalName(Object.class)).thenReturn("java/K");
            classDefining.when(() -> ClassDefining.canDowncastToProxy(Object.class)).thenReturn(true);
            Map<Method, Method> methodMethodMap = new HashMap<>();
            Enhancer target = new Enhancer(Object.class, methodMethodMap);
            //Act Statement(s)
            MethodHandle result = target.lookupInvokerTable(Object.class);
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            type.verify(() -> Type.getInternalName(Object.class), atLeast(1));
            classDefining.verify(() -> ClassDefining.canDowncastToProxy(Object.class), atLeast(1));
        }
    }
}

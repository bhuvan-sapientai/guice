package com.google.inject.internal.util;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.lang.reflect.Member;

import org.mockito.MockedStatic;

import java.lang.reflect.Constructor;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;

import org.junit.Ignore;

public class ClassesSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Member memberMock = mock(Member.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${e4845536-e9a6-3d4a-9480-ba73e702a544}, hash: 0364D5EDA346B593C977F583A7AC7317
    @Ignore()
    @Test()
    public void isInnerClassWhenClazzGetEnclosingClassIsNotNull() {
        /* Branches:
         * (!Modifier.isStatic(clazz.getModifiers())) : true
         * (clazz.getEnclosingClass() != null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        boolean result = Classes.isInnerClass(Object.class);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
    }

    //Sapient generated method id: ${dc676e37-a1bb-356f-a53f-4abb6228cc80}, hash: 4F6CEA283413870337B6B2388B4DC019
    @Test()
    public void isInnerClassWhenClazzGetEnclosingClassIsNull() {
        /* Branches:
         * (!Modifier.isStatic(clazz.getModifiers())) : true
         * (clazz.getEnclosingClass() != null) : false
         */
        //Act Statement(s)
        boolean result = Classes.isInnerClass(Object.class);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${2dc798b2-96b3-3e16-8343-ec421534ff7c}, hash: 0DB5EF5DB7E6ECB387CD0AF30A736129
    @Test()
    public void isConcreteWhenModifierNotIsAbstractModifiers() {
        /* Branches:
         * (!clazz.isInterface()) : true
         * (!Modifier.isAbstract(modifiers)) : true
         */
        //Act Statement(s)
        boolean result = Classes.isConcrete(Object.class);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
    }

    //Sapient generated method id: ${3e64af40-4e55-3909-b5ba-d49b96319e23}, hash: FB7F11FCB257A9BA81D4A9B22AE8FB44
    @Ignore()
    @Test()
    public void isConcreteWhenModifierIsAbstractModifiers() {
        /* Branches:
         * (!clazz.isInterface()) : true
         * (!Modifier.isAbstract(modifiers)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        boolean result = Classes.isConcrete(Object.class);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${20a5ac5b-5555-3c81-9a97-80f4acc9e8f9}, hash: AE5816DC36CB7D0EAC88D17794396D14
    @Test()
    public void toStringWhenMemberTypeEqualsMethod() {
        /* Branches:
         * (memberType == Method.class) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Classes> classes = mockStatic(Classes.class, CALLS_REAL_METHODS)) {
            doReturn(Object.class).when(memberMock).getDeclaringClass();
            doReturn("A").when(memberMock).getName();
            classes.when(() -> Classes.memberType(memberMock)).thenReturn(Method.class);
            //Act Statement(s)
            String result = Classes.toString(memberMock);
            //Assert statement(s)
            assertThat(result, equalTo("java.lang.Object.A()"));
            verify(memberMock, atLeast(1)).getDeclaringClass();
            verify(memberMock, atLeast(1)).getName();
            classes.verify(() -> Classes.memberType(memberMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${ab921e6d-1594-3cb9-8ace-e81742e97110}, hash: 7CE01C0F8B30EEE31C76A66B50E6A3DF
    @Test()
    public void toStringWhenMemberTypeEqualsField() {
        /* Branches:
         * (memberType == Method.class) : false
         * (memberType == Field.class) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Classes> classes = mockStatic(Classes.class, CALLS_REAL_METHODS)) {
            doReturn(Object.class).when(memberMock).getDeclaringClass();
            doReturn("A").when(memberMock).getName();
            classes.when(() -> Classes.memberType(memberMock)).thenReturn(Field.class);
            //Act Statement(s)
            String result = Classes.toString(memberMock);
            //Assert statement(s)
            assertThat(result, equalTo("java.lang.Object.A"));
            verify(memberMock, atLeast(1)).getDeclaringClass();
            verify(memberMock, atLeast(1)).getName();
            classes.verify(() -> Classes.memberType(memberMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${ad90d513-5068-3d49-a3a5-26ac1083b78d}, hash: CC13A374920BF90C6B43A924F5FAFF31
    @Test()
    public void toStringWhenMemberTypeEqualsConstructor() {
        /* Branches:
         * (memberType == Method.class) : false
         * (memberType == Field.class) : false
         * (memberType == Constructor.class) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Classes> classes = mockStatic(Classes.class, CALLS_REAL_METHODS)) {
            doReturn(Object.class).when(memberMock).getDeclaringClass();
            classes.when(() -> Classes.memberType(memberMock)).thenReturn(Constructor.class);
            //Act Statement(s)
            String result = Classes.toString(memberMock);
            //Assert statement(s)
            assertThat(result, equalTo("java.lang.Object.<init>()"));
            verify(memberMock, atLeast(1)).getDeclaringClass();
            classes.verify(() -> Classes.memberType(memberMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${ad26e415-b1f0-3df3-8bc9-cb373428e225}, hash: B00921B611F036FF83E48B6F7C799C34
    @Test()
    public void toStringWhenMemberTypeNotEqualsConstructorThrowsAssertionError() {
        /* Branches:
         * (memberType == Method.class) : false
         * (memberType == Field.class) : false
         * (memberType == Constructor.class) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Classes> classes = mockStatic(Classes.class, CALLS_REAL_METHODS)) {
            classes.when(() -> Classes.memberType(memberMock)).thenReturn(java.lang.reflect.Member.class);
            thrown.expect(AssertionError.class);
            //Act Statement(s)
            Classes.toString(memberMock);
            //Assert statement(s)
            classes.verify(() -> Classes.memberType(memberMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${ecc29db4-bf9f-3556-9c53-c92ab1bb6065}, hash: 776DA9C0FE079A1777CF536C7403F331
    @Ignore()
    @Test()
    public void memberTypeWhenMemberNotInstanceOfConstructorThrowsIllegalArgumentException() {
        /* Branches:
         * (member instanceof Field) : false
         * (member instanceof Method) : false
         * (member instanceof Constructor) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unsupported implementation class for Member, interface java.lang.reflect.Member");
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage(illegalArgumentException.getMessage());
        Member memberMock = mock(Member.class, "valid_value");
        //Act Statement(s)
        Classes.memberType(memberMock);
    }
}

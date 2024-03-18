package com.google.inject.internal.util;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.lang.reflect.Member;

import org.mockito.MockedStatic;

import java.lang.reflect.Constructor;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;

import org.junit.Ignore;

public class StackTraceElementsSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${f83bf260-c94d-3632-9156-ede1f8f02d1f}, hash: A23D43923CAD5C1E24303EE27FC80219
    @Test()
    public void forMemberWhenMemberIsNull() {
        /* Branches:
         * (member == null) : true
         */
        //Arrange Statement(s)
        Member member = null;
        //Act Statement(s)
        Object result = StackTraceElements.forMember(member);
        //Assert statement(s)
        assertThat(result, equalTo("[unknown source]"));
    }

    //Sapient generated method id: ${6806c3d7-2e17-352b-94a1-a352f1d93303}, hash: F7D394F5C8E869E0D51F29F3D0817FE1
    @Ignore()
    @Test()
    public void forMemberWhenMemberTypeEqualsConstructor() {
        /* Branches:
         * (member == null) : false
         * (lineNumberOrNull == null) : true
         * (memberType == Constructor.class) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: lineNumbersCache
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Member memberMock = mock(Member.class);
        try (MockedStatic<Classes> classes = mockStatic(Classes.class)) {
            classes.when(() -> Classes.memberType(memberMock)).thenReturn(Constructor.class);
            //Act Statement(s)
            Object result = StackTraceElements.forMember(memberMock);
            StackTraceElement stackTraceElement = new StackTraceElement("java.lang.Object", "<init>", "return_of_getSource1", 0);
            //Assert statement(s)
            assertThat(result, equalTo(stackTraceElement));
            classes.verify(() -> Classes.memberType(memberMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${968ae35e-186f-3688-a415-18f6e66da848}, hash: 96AFE9D987E01B034F0FD55219D9C6E5
    @Test()
    public void forMemberWhenLineNumberOrNullIsNotNullAndMemberTypeNotEqualsConstructor() {
        /* Branches:
         * (member == null) : false
         * (lineNumberOrNull == null) : false
         * (memberType == Constructor.class) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: lineNumbersCache
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Member memberMock = mock(Member.class, "Integer");
        try (MockedStatic<Classes> classes = mockStatic(Classes.class)) {
            doReturn(null).when(memberMock).getDeclaringClass();
            doReturn(null).when(memberMock).getName();
            classes.when(() -> Classes.memberType(memberMock)).thenReturn(java.lang.reflect.Member.class);
            thrown.expect(NullPointerException.class);
            //Act Statement(s)
            StackTraceElements.forMember(memberMock);
            //Assert statement(s)
            verify(memberMock).getDeclaringClass();
            verify(memberMock).getName();
            classes.verify(() -> Classes.memberType(memberMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${3bf454f7-de85-3395-9868-dfec671e8f1f}, hash: 405140D3D993A9740D4D1589F0D16AAF
    @Ignore()
    @Test()
    public void forTypeTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: lineNumbersCache
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        Object result = StackTraceElements.forType(Object.class);
        StackTraceElement stackTraceElement = new StackTraceElement("java.lang.Object", "class", "return_of_getSource1", 0);
        //Assert statement(s)
        assertThat(result, equalTo(stackTraceElement));
    }

    //Sapient generated method id: ${a19bb477-d7a7-3e52-afe2-4f0348585562}, hash: 0ED74D66C048BF470A5DD922AD9C68E3
    @Test()
    public void clearCacheTest() {
        //Act Statement(s)
        StackTraceElements.clearCache();
    }

    //Sapient generated method id: ${5a5ae1db-90c2-3301-b0c0-49b4b547fd05}, hash: ED2B69140731E79411C859B4E9A172AC
    @Test()
    public void convertToInMemoryStackTraceElementWhenStackTraceElementsLengthEquals0() {
        /* Branches:
         * (stackTraceElements.length == 0) : true
         */
        //Arrange Statement(s)
        StackTraceElement[] stackTraceElementArray = new StackTraceElement[]{};
        //Act Statement(s)
        StackTraceElements.InMemoryStackTraceElement[] result = StackTraceElements.convertToInMemoryStackTraceElement(stackTraceElementArray);
        //Assert statement(s)
        assertThat(result.length, equalTo(0));
    }

    //Sapient generated method id: ${89481d6f-346e-364e-aff5-2dc024508d7c}, hash: 204F27228A8A2293EA53D0D35CE05BC2
    @Ignore()
    @Test()
    public void convertToInMemoryStackTraceElementWhenCachedIsNull() {
        /* Branches:
         * (stackTraceElements.length == 0) : false
         * (i < stackTraceElements.length) : true
         * (cached != null) : false  #  inside weakIntern method
         * (cached != null) : false  #  inside weakIntern method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: inMemoryStackTraceElement - Method: getClassName
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        StackTraceElement stackTraceElement = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement[] stackTraceElementArray = new StackTraceElement[]{stackTraceElement};
        //Act Statement(s)
        StackTraceElements.InMemoryStackTraceElement[] result = StackTraceElements.convertToInMemoryStackTraceElement(stackTraceElementArray);
        StackTraceElements.InMemoryStackTraceElement stackTraceElementsInMemoryStackTraceElement = new StackTraceElements.InMemoryStackTraceElement("", (String) null, 0);
        StackTraceElements.InMemoryStackTraceElement[] inMemoryStackTraceElementResultArray = new StackTraceElements.InMemoryStackTraceElement[]{stackTraceElementsInMemoryStackTraceElement};
        //Assert statement(s)
        assertThat(result, equalTo(inMemoryStackTraceElementResultArray));
    }

    //Sapient generated method id: ${4da0e98e-27f4-3b1b-a3b9-da72b1a5b3c0}, hash: 3F46630DDDFC447440DFD92AB9D3BB29
    @Ignore()
    @Test()
    public void convertToInMemoryStackTraceElementWhenCachedIsNullAndCachedIsNull() {
        /* Branches:
         * (stackTraceElements.length == 0) : false
         * (i < stackTraceElements.length) : true
         * (cached != null) : false  #  inside weakIntern method
         * (cached != null) : false  #  inside weakIntern method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: inMemoryStackTraceElement - Method: getClassName
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        StackTraceElement stackTraceElement = new StackTraceElement("declaringClass1", "methodName1", "fileName1", 0);
        StackTraceElement[] stackTraceElementArray = new StackTraceElement[]{stackTraceElement};
        //Act Statement(s)
        StackTraceElements.InMemoryStackTraceElement[] result = StackTraceElements.convertToInMemoryStackTraceElement(stackTraceElementArray);
        StackTraceElements.InMemoryStackTraceElement stackTraceElementsInMemoryStackTraceElement = new StackTraceElements.InMemoryStackTraceElement("", "", 0);
        StackTraceElements.InMemoryStackTraceElement[] inMemoryStackTraceElementResultArray = new StackTraceElements.InMemoryStackTraceElement[]{stackTraceElementsInMemoryStackTraceElement};
        //Assert statement(s)
        assertThat(result, equalTo(inMemoryStackTraceElementResultArray));
    }

    //Sapient generated method id: ${473140db-316a-36bf-8c72-d0fe3f0301af}, hash: 0B79388E9729D425A06EF411DC1B8625
    @Test()
    public void convertToStackTraceElementWhenInMemoryStackTraceElementsLengthEquals0() {
        /* Branches:
         * (inMemoryStackTraceElements.length == 0) : true
         */
        //Arrange Statement(s)
        StackTraceElements.InMemoryStackTraceElement[] inMemoryStackTraceElementArray = new StackTraceElements.InMemoryStackTraceElement[]{};
        //Act Statement(s)
        StackTraceElement[] result = StackTraceElements.convertToStackTraceElement(inMemoryStackTraceElementArray);
        //Assert statement(s)
        assertThat(result.length, equalTo(0));
    }

    //Sapient generated method id: ${346e8fa2-193c-3977-9e4a-8d9a81af722f}, hash: 03E5BD3BA084CC2DB657180B55CCC7DF
    @Test()
    public void convertToStackTraceElementWhenILessThanInMemoryStackTraceElementsLength() {
        /* Branches:
         * (inMemoryStackTraceElements.length == 0) : false
         * (i < inMemoryStackTraceElements.length) : true
         */
        //Arrange Statement(s)
        StackTraceElements.InMemoryStackTraceElement stackTraceElementsInMemoryStackTraceElementMock = mock(StackTraceElements.InMemoryStackTraceElement.class);
        doReturn("return_of_getClassName1").when(stackTraceElementsInMemoryStackTraceElementMock).getClassName();
        doReturn("return_of_getMethodName1").when(stackTraceElementsInMemoryStackTraceElementMock).getMethodName();
        doReturn(0).when(stackTraceElementsInMemoryStackTraceElementMock).getLineNumber();
        StackTraceElements.InMemoryStackTraceElement[] inMemoryStackTraceElementArray = new StackTraceElements.InMemoryStackTraceElement[]{stackTraceElementsInMemoryStackTraceElementMock};
        //Act Statement(s)
        StackTraceElement[] result = StackTraceElements.convertToStackTraceElement(inMemoryStackTraceElementArray);
        StackTraceElement stackTraceElement = new StackTraceElement("return_of_getClassName1", "return_of_getMethodName1", "Unknown Source", 0);
        StackTraceElement[] stackTraceElementResultArray = new StackTraceElement[]{stackTraceElement};
        StackTraceElements.InMemoryStackTraceElement[] inMemoryStackTraceElementInMemoryStackTraceElementArrayArray = new StackTraceElements.InMemoryStackTraceElement[]{stackTraceElementsInMemoryStackTraceElementMock};
        //Assert statement(s)
        assertThat(result, equalTo(stackTraceElementResultArray));
        assertThat(inMemoryStackTraceElementArray, equalTo(inMemoryStackTraceElementInMemoryStackTraceElementArrayArray));
        verify(stackTraceElementsInMemoryStackTraceElementMock).getClassName();
        verify(stackTraceElementsInMemoryStackTraceElementMock).getMethodName();
        verify(stackTraceElementsInMemoryStackTraceElementMock).getLineNumber();
    }
}

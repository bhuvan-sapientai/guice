package com.google.inject.internal.util;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.io.IOException;

import org.junit.rules.ExpectedException;

import java.lang.reflect.Member;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;

import org.junit.Ignore;

public class LineNumbersSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${de2215b4-ae16-383b-a56c-ffd45ad8cbbf}, hash: 9C32DB25A45CEBCF7A6BC3997E47AF4D
    @Test()
    public void getLineNumberWhenTypeNotEqualsMemberGetDeclaringClassThrowsIllegalArgumentException() throws IOException {
        /* Branches:
         * (type == member.getDeclaringClass()) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: object of type ClassReader
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Member memberMock = mock(Member.class, "some_value");
        doReturn(null).when(memberMock).getDeclaringClass();
        LineNumbers target = new LineNumbers(Object.class);
        thrown.expect(IllegalArgumentException.class);
        //Act Statement(s)
        target.getLineNumber(memberMock);
        //Assert statement(s)
        verify(memberMock, times(2)).getDeclaringClass();
    }

    //Sapient generated method id: ${98d839b7-379d-396a-bd5e-12636521c5a2}, hash: 4F2E73F258DBB2AD2CA425EE8E3E86AD
    @Ignore()
    @Test()
    public void getLineNumberWhenMemberNotInstanceOfConstructorThrowsIllegalArgumentException() throws IOException {
        /* Branches:
         * (type == member.getDeclaringClass()) : true
         * (member instanceof Field) : false  #  inside memberKey method
         * (member instanceof Method) : false  #  inside memberKey method
         * (member instanceof Constructor) : false  #  inside memberKey method
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: object of type ClassReader
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        LineNumbers target = new LineNumbers(Object.class);
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unsupported implementation class for Member, ");
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage(illegalArgumentException.getMessage());
        Member memberMock = mock(Member.class);
        //Act Statement(s)
        target.getLineNumber(memberMock);
    }

    //Sapient generated method id: ${0fa5ca5d-711b-3964-bece-10b521da65b3}, hash: 6C4186EF75BF1ADC301E14D537A29B73
    @Ignore()
    @Test()
    public void getFirstLineWhenFirstLineEqualsIntegerMAX_VALUE() throws IOException {
        /* Branches:
         * (firstLine == Integer.MAX_VALUE) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: object of type ClassReader
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        LineNumbers target = new LineNumbers(String.class);
        //Act Statement(s)
        int result = target.getFirstLine();
        //Assert statement(s)
        assertThat(result, equalTo(1));
    }
}

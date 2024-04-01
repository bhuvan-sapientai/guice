package com.google.inject.internal.util;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.function.Predicate;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;

import org.junit.Ignore;

public class NewThrowableFinderSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Predicate shouldBeSkippedMock = mock(Predicate.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${da12eda8-142f-3d84-bc2b-5b2c3e08fb0c}, hash: 644E7ABBA8D52C449FE7D6435F5DBD64
    @Test()
    public void findCallerWhenShouldBeSkippedNotTestClassName() {
        /* Branches:
         * (for-each(stackTraceElements)) : true
         * (!shouldBeSkipped.test(className)) : true
         */
        //Arrange Statement(s)
        //doReturn(false).when(shouldBeSkippedMock).test("jdk.internal.reflect.GeneratedConstructorAccessor2106");
        //NewThrowableFinder target = new NewThrowableFinder();
        //Act Statement(s)
        //StackTraceElement result = target.findCaller(shouldBeSkippedMock);
        //StackTraceElement stackTraceElement = stackTraceElementArray[0];
        //Assert statement(s)
        //assertThat(result, equalTo(stackTraceElement));
        //verify(shouldBeSkippedMock).test("jdk.internal.reflect.GeneratedConstructorAccessor2106");
    }

    //Sapient generated method id: ${7ca431db-573d-3ca1-badb-4e8366b29fb0}, hash: 98DB3B12C05FCDD118DD2BA190BAFDEC
    @Ignore()
    @Test()
    public void findCallerWhenShouldBeSkippedTestClassNameThrowsAssertionError() {
        /* Branches:
         * (for-each(stackTraceElements)) : true
         * (!shouldBeSkipped.test(className)) : false
         */
        //Arrange Statement(s)
        doReturn(true).when(shouldBeSkippedMock).test("jdk.internal.reflect.GeneratedConstructorAccessor2106");
        doReturn(true).when(shouldBeSkippedMock).test("jdk.internal.reflect.DelegatingConstructorAccessorImpl");
        doReturn(true).when(shouldBeSkippedMock).test("java.lang.reflect.Constructor");
        doReturn(true).when(shouldBeSkippedMock).test("ai.sapient.core.smt.z3.expression.RealMethodCallerUtil");
        doReturn(true).when(shouldBeSkippedMock).test("ai.sapient.core.parser.asm.instruction.handler.MethodCallInstructionConstructorHandler");
        doReturn(true).when(shouldBeSkippedMock).test("ai.sapient.core.parser.asm.instruction.util.InstructionHandlerFactory");
        doReturn(true).when(shouldBeSkippedMock).test("ai.sapient.core.parser.MethodPathBuilder");
        doReturn(true).when(shouldBeSkippedMock).test("ai.sapient.core.parser.ClassModelCreator");
        doReturn(true).when(shouldBeSkippedMock).test("ai.sapient.core.extractor.input.parameter.TestInputsSolver");
        doReturn(true).when(shouldBeSkippedMock).test("ai.sapient.core.extractor.input.parameter.MultithreadTestInputSolver");
        doReturn(true).when(shouldBeSkippedMock).test("ai.sapient.core.context.ContextAwareOperation");
        doReturn(true).when(shouldBeSkippedMock).test("java.util.concurrent.CompletableFuture$AsyncSupply");
        doReturn(true).when(shouldBeSkippedMock).test("java.util.concurrent.ThreadPoolExecutor");
        doReturn(true).when(shouldBeSkippedMock).test("java.util.concurrent.ThreadPoolExecutor$Worker");
        doReturn(true).when(shouldBeSkippedMock).test("java.lang.Thread");
        NewThrowableFinder target = new NewThrowableFinder();
        thrown.expect(AssertionError.class);
        //Act Statement(s)
        target.findCaller(shouldBeSkippedMock);
        //Assert statement(s)
        verify(shouldBeSkippedMock).test("jdk.internal.reflect.GeneratedConstructorAccessor2106");
        verify(shouldBeSkippedMock).test("jdk.internal.reflect.DelegatingConstructorAccessorImpl");
        verify(shouldBeSkippedMock, times(2)).test("java.lang.reflect.Constructor");
        verify(shouldBeSkippedMock, times(2)).test("ai.sapient.core.smt.z3.expression.RealMethodCallerUtil");
        verify(shouldBeSkippedMock, times(2)).test("ai.sapient.core.parser.asm.instruction.handler.MethodCallInstructionConstructorHandler");
        verify(shouldBeSkippedMock).test("ai.sapient.core.parser.asm.instruction.util.InstructionHandlerFactory");
        verify(shouldBeSkippedMock, times(2)).test("ai.sapient.core.parser.MethodPathBuilder");
        verify(shouldBeSkippedMock, times(3)).test("ai.sapient.core.parser.ClassModelCreator");
        verify(shouldBeSkippedMock, times(2)).test("ai.sapient.core.extractor.input.parameter.TestInputsSolver");
        verify(shouldBeSkippedMock, times(2)).test("ai.sapient.core.extractor.input.parameter.MultithreadTestInputSolver");
        verify(shouldBeSkippedMock).test("ai.sapient.core.context.ContextAwareOperation");
        verify(shouldBeSkippedMock).test("java.util.concurrent.CompletableFuture$AsyncSupply");
        verify(shouldBeSkippedMock).test("java.util.concurrent.ThreadPoolExecutor");
        verify(shouldBeSkippedMock).test("java.util.concurrent.ThreadPoolExecutor$Worker");
        verify(shouldBeSkippedMock).test("java.lang.Thread");
    }
}

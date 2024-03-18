package com.google.inject.spi;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import com.google.inject.Binder;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;

import org.junit.Ignore;

public class RequireAtInjectOnConstructorsOptionSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    //Sapient generated method id: ${0f0a622f-1e3b-3dc0-a3ae-a6ceb63c4e13}, hash: EB94B9E598AAAB61936C6E9DA7C782CF
    @Ignore()
    @Test()
    public void applyToTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Binder binderMock = mock(Binder.class);
        Binder binderMock2 = mock(Binder.class);
        Object object = new Object();
        doReturn(binderMock2).when(binderMock).withSource(object);
        doNothing().when(binderMock2).requireAtInjectOnConstructors();
        Object object2 = new Object();
        RequireAtInjectOnConstructorsOption target = new RequireAtInjectOnConstructorsOption(object2);
        //Act Statement(s)
        target.applyTo(binderMock);
        //Assert statement(s)
        verify(binderMock).withSource(object);
        verify(binderMock2).requireAtInjectOnConstructors();
    }

    //Sapient generated method id: ${85010207-16d2-3170-b836-208737cec5b9}, hash: 78328E3ED3AD73ABBBC6C6B8622C0F80
    @Ignore()
    @Test()
    public void acceptVisitorTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        RequireAtInjectOnConstructorsOption target = new RequireAtInjectOnConstructorsOption(object);
        ElementVisitor<Object> visitorMock = mock(ElementVisitor.class, "Object");
        Object object2 = new Object();
        doReturn(object2).when(visitorMock).visit(target);
        //Act Statement(s)
        Object result = target.acceptVisitor(visitorMock);
        //Assert statement(s)
        assertThat(result, equalTo(object2));
        verify(visitorMock).visit(target);
    }
}

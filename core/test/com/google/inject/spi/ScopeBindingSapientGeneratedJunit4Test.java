package com.google.inject.spi;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.lang.annotation.Annotation;

import org.mockito.MockedStatic;
import com.google.inject.Binder;
import com.google.inject.internal.Errors;
import com.google.inject.Scope;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;

import org.junit.Ignore;

public class ScopeBindingSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Scope scopeMock = mock(Scope.class);

    //Sapient generated method id: ${85010207-16d2-3170-b836-208737cec5b9}, hash: 217A1858781FDDB732AE15311C3C1A3D
    @Ignore()
    @Test()
    public void acceptVisitorTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        ScopeBinding target = new ScopeBinding(object, Annotation.class, scopeMock);
        ElementVisitor<Object> visitorMock = mock(ElementVisitor.class);
        Object object2 = new Object();
        doReturn(object2).when(visitorMock).visit(target);
        //Act Statement(s)
        Object result = target.acceptVisitor(visitorMock);
        //Assert statement(s)
        assertThat(result, equalTo(object2));
        verify(visitorMock).visit(target);
    }

    //Sapient generated method id: ${0f0a622f-1e3b-3dc0-a3ae-a6ceb63c4e13}, hash: 4143239E134EA59F4CF0F602E1E005F6
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
        doNothing().when(binderMock2).bindScope(Annotation.class, scopeMock);
        Object object2 = new Object();
        Scope scopeMock2 = mock(Scope.class);
        ScopeBinding target = new ScopeBinding(object2, Annotation.class, scopeMock2);
        //Act Statement(s)
        target.applyTo(binderMock);
        //Assert statement(s)
        verify(binderMock).withSource(object);
        verify(binderMock2).bindScope(Annotation.class, scopeMock);
    }

    //Sapient generated method id: ${363d3698-f34c-39ad-914f-376a19498023}, hash: 222D93D58EF5EDBBDA88516BDFFDB463
    @Ignore()
    @Test()
    public void toStringTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: object of type MoreObjects.ToStringHelper
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object objectMock = mock(Object.class);
        try (MockedStatic<Errors> errors = mockStatic(Errors.class)) {
            Object object = new Object();
            errors.when(() -> Errors.convert(object)).thenReturn(objectMock);
            Object object2 = new Object();
            ScopeBinding target = new ScopeBinding(object2, Annotation.class, scopeMock);
            //Act Statement(s)
            String result = target.toString();
            //Assert statement(s)
            assertThat(result, equalTo("result1"));
            errors.verify(() -> Errors.convert(object), atLeast(1));
        }
    }
}

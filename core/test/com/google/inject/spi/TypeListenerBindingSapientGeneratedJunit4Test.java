package com.google.inject.spi;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import com.google.inject.matcher.Matcher;
import com.google.inject.TypeLiteral;
import com.google.inject.Binder;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;

import org.junit.Ignore;

public class TypeListenerBindingSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Matcher<TypeLiteral<?>> matcherMock = mock(Matcher.class);

    private final TypeListener typeListenerMock = mock(TypeListener.class);

    //Sapient generated method id: ${85010207-16d2-3170-b836-208737cec5b9}, hash: 5FCF26E837B7B81163C4468A674107BA
    @Ignore()
    @Test()
    public void acceptVisitorTest() {
        //Arrange Statement(s)
        Object object = new Object();
        TypeListenerBinding target = new TypeListenerBinding(object, typeListenerMock, matcherMock);
        ElementVisitor<Object> visitorMock = mock(ElementVisitor.class);
        Object object2 = new Object();
        doReturn(object2).when(visitorMock).visit(target);
        //Act Statement(s)
        Object result = target.acceptVisitor(visitorMock);
        //Assert statement(s)
        assertThat(result, equalTo(object2));
        verify(visitorMock).visit(target);
    }

    //Sapient generated method id: ${0f0a622f-1e3b-3dc0-a3ae-a6ceb63c4e13}, hash: C0DF2618EB65C9007CD607EBAF6180FB
    @Ignore()
    @Test()
    public void applyToTest() {
        //Arrange Statement(s)
        Binder binderMock = mock(Binder.class);
        Binder binderMock2 = mock(Binder.class);
        Object object = new Object();
        doReturn(binderMock2).when(binderMock).withSource(object);
        doNothing().when(binderMock2).bindListener(matcherMock, typeListenerMock);
        TypeListenerBinding target = new TypeListenerBinding(object, typeListenerMock, matcherMock);
        //Act Statement(s)
        target.applyTo(binderMock);
        //Assert statement(s)
        verify(binderMock).withSource(object);
        verify(binderMock2).bindListener(matcherMock, typeListenerMock);
    }
}

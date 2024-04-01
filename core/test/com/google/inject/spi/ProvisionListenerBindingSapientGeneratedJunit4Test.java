package com.google.inject.spi;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import com.google.inject.matcher.Matcher;
import com.google.inject.Binder;
import com.google.inject.Binding;
import com.google.common.collect.ImmutableList;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

import org.junit.Ignore;

public class ProvisionListenerBindingSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final ImmutableList listenersMock = mock(ImmutableList.class, "listeners");

    private final Matcher<Binding<?>> matcherMock = mock(Matcher.class);

    private final ProvisionListener provisionListenerMock = mock(ProvisionListener.class);

    //Sapient generated method id: ${85010207-16d2-3170-b836-208737cec5b9}, hash: E9AEE4D7F4B9C709F418B6BED5C6DB42
    @Ignore()
    @Test()
    public void acceptVisitorTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        ProvisionListener[] provisionListenerArray = new ProvisionListener[]{provisionListenerMock};
        ProvisionListenerBinding target = new ProvisionListenerBinding(object, matcherMock, provisionListenerArray);
        ElementVisitor<Object> visitorMock = mock(ElementVisitor.class, "Object");
        doReturn(null).when(visitorMock).visit(target);
        //Act Statement(s)
        Object result = target.acceptVisitor(visitorMock);
        //Assert statement(s)
        assertThat(result, is(nullValue()));
        verify(visitorMock).visit(target);
    }

    //Sapient generated method id: ${0f0a622f-1e3b-3dc0-a3ae-a6ceb63c4e13}, hash: 20F63E68514B6ADBB13FD8B8460C12BD
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
        ProvisionListener[] provisionListenerArray = new ProvisionListener[]{};
        doNothing().when(binderMock2).bindListener(matcherMock, provisionListenerArray);
        Object object2 = new Object();
        ProvisionListener[] provisionListenerArray2 = new ProvisionListener[]{provisionListenerMock};
        ProvisionListenerBinding target = spy(new ProvisionListenerBinding(object2, matcherMock, provisionListenerArray2));
        doReturn(object).when(target).getSource();
        doReturn(0).when(listenersMock).size();
        ProvisionListener[] provisionListenerArray3 = new ProvisionListener[]{};
        doReturn(provisionListenerArray).when(listenersMock).toArray(provisionListenerArray3);
        //Act Statement(s)
        target.applyTo(binderMock);
        //Assert statement(s)
        verify(binderMock).withSource(object);
        verify(binderMock2).bindListener(matcherMock, provisionListenerArray);
        verify(target).getSource();
        verify(listenersMock).size();
        verify(listenersMock).toArray(provisionListenerArray3);
    }
}

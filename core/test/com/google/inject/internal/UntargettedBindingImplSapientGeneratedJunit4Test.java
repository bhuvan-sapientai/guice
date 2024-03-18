package com.google.inject.internal;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import com.google.inject.spi.Elements;
import com.google.inject.binder.LinkedBindingBuilder;
import com.google.inject.spi.BindingTargetVisitor;
import org.mockito.MockedStatic;
import com.google.inject.Binder;
import com.google.inject.Key;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;

import org.junit.Ignore;

public class UntargettedBindingImplSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final InjectorImpl injectorImplMock = mock(InjectorImpl.class);

    private final Key<Object> keyMock = mock(Key.class);

    private final Scoping scopingMock = mock(Scoping.class);

    //Sapient generated method id: ${8144240a-8b49-3cdc-8570-b3706c172a53}, hash: CA0F093618A1A0C260FECFA3850053B9
    @Ignore()
    @Test()
    public void acceptTargetVisitorTest() {
        //Arrange Statement(s)
        Object object = new Object();
        UntargettedBindingImpl target = new UntargettedBindingImpl(injectorImplMock, keyMock, object);
        BindingTargetVisitor<Object, Object> visitorMock = mock(BindingTargetVisitor.class);
        Object object2 = new Object();
        doReturn(object2).when(visitorMock).visit(target);
        //Act Statement(s)
        Object result = target.acceptTargetVisitor(visitorMock);
        //Assert statement(s)
        assertThat(result, equalTo(object2));
        verify(visitorMock).visit(target);
    }

    //Sapient generated method id: ${da0d3db3-e38a-36e1-8dd5-ef2abf7e3a21}, hash: 0242992349AF4B44BA4ECA5305B18FA9
    @Test()
    public void withScopingTest() {
        //Arrange Statement(s)
        Object object = new Object();
        UntargettedBindingImpl target = new UntargettedBindingImpl(injectorImplMock, keyMock, object);
        //Act Statement(s)
        BindingImpl result = target.withScoping(scopingMock);
        UntargettedBindingImpl untargettedBindingImpl = new UntargettedBindingImpl(object, keyMock, scopingMock);
        //Assert statement(s)
        assertThat(result, equalTo(untargettedBindingImpl));
    }

    //Sapient generated method id: ${43ae4532-e963-39a9-b37c-2a93c33a9ff0}, hash: D9A3DD801142821BDFE85CE00D6551CD
    @Test()
    public void withKeyTest() {
        //Arrange Statement(s)
        Object object = new Object();
        UntargettedBindingImpl target = spy(new UntargettedBindingImpl(injectorImplMock, keyMock, object));
        doReturn(scopingMock).when(target).getScoping();
        Key<Object> keyMock2 = mock(Key.class);
        //Act Statement(s)
        BindingImpl result = target.withKey(keyMock2);
        UntargettedBindingImpl untargettedBindingImpl = new UntargettedBindingImpl(object, keyMock2, scopingMock);
        //Assert statement(s)
        assertThat(result, equalTo(untargettedBindingImpl));
        verify(target).getScoping();
    }

    //Sapient generated method id: ${0f0a622f-1e3b-3dc0-a3ae-a6ceb63c4e13}, hash: CDA1F7F7078D899A4CC2B054E226F1A1
    @Ignore()
    @Test()
    public void applyToTest() {
        //Arrange Statement(s)
        Binder binderMock = mock(Binder.class);
        Binder binderMock2 = mock(Binder.class);
        LinkedBindingBuilder linkedBindingBuilderMock = mock(LinkedBindingBuilder.class);
        try (MockedStatic<Elements> elements = mockStatic(Elements.class)) {
            GuiceInternal guiceInternal = GuiceInternal.GUICE_INTERNAL;
            Object object = new Object();
            elements.when(() -> Elements.withTrustedSource(guiceInternal, binderMock2, object)).thenReturn(binderMock);
            doReturn(linkedBindingBuilderMock).when(binderMock).bind(keyMock);
            UntargettedBindingImpl target = spy(new UntargettedBindingImpl(injectorImplMock, keyMock, object));
            doReturn(scopingMock).when(target).getScoping();
            doNothing().when(scopingMock).applyTo(linkedBindingBuilderMock);
            //Act Statement(s)
            target.applyTo(binderMock2);
            //Assert statement(s)
            elements.verify(() -> Elements.withTrustedSource(guiceInternal, binderMock2, object), atLeast(1));
            verify(binderMock).bind(keyMock);
            verify(target).getScoping();
            verify(scopingMock).applyTo(linkedBindingBuilderMock);
        }
    }

    //Sapient generated method id: ${363d3698-f34c-39ad-914f-376a19498023}, hash: 7C8B823285A8F156EC1CA2BC853AAF76
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
        Object object = new Object();
        UntargettedBindingImpl target = new UntargettedBindingImpl(injectorImplMock, keyMock, object);
        //Act Statement(s)
        String result = target.toString();
        //Assert statement(s)
        assertThat(result, equalTo("result1"));
    }
}

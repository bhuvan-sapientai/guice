package com.google.inject.internal;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import com.google.inject.spi.Elements;
import com.google.inject.binder.LinkedBindingBuilder;

import java.util.Set;

import com.google.inject.spi.BindingTargetVisitor;
import com.google.inject.spi.Dependency;
import org.mockito.MockedStatic;
import com.google.inject.Binder;
import com.google.common.collect.ImmutableSet;
import com.google.inject.Key;
import com.google.inject.binder.ScopedBindingBuilder;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;

import org.junit.Ignore;

public class LinkedBindingImplSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final InjectorImpl injectorImplMock = mock(InjectorImpl.class);

    private final InternalFactory<Object> internalFactoryMock = mock(InternalFactory.class);

    private final Key<Object> keyMock = mock(Key.class);

    private final Key<Object> keyMock2 = mock(Key.class);

    private final Scoping scopingMock = mock(Scoping.class);

    //Sapient generated method id: ${8144240a-8b49-3cdc-8570-b3706c172a53}, hash: 70DCDA81AEB4FC9446AFF22DF8AB8772
    @Ignore()
    @Test()
    public void acceptTargetVisitorTest() {
        //Arrange Statement(s)
        Object object = new Object();
        LinkedBindingImpl target = new LinkedBindingImpl(injectorImplMock, keyMock, object, internalFactoryMock, scopingMock, keyMock2);
        BindingTargetVisitor<Object, Object> visitorMock = mock(BindingTargetVisitor.class);
        Object object2 = new Object();
        doReturn(object2).when(visitorMock).visit(target);
        //Act Statement(s)
        Object result = target.acceptTargetVisitor(visitorMock);
        //Assert statement(s)
        assertThat(result, equalTo(object2));
        verify(visitorMock).visit(target);
    }

    //Sapient generated method id: ${903fef97-987f-323e-a528-d02591a6bcb2}, hash: D6EAC04922F6695A52D0B6DA4A3CA2C9
    @Test()
    public void getDependenciesTest() {
        //Arrange Statement(s)
        InjectorImpl injectorImplMock = mock(InjectorImpl.class, "some_value");
        Key key = Key.get(Object.class);
        Object object = new Object();
        InternalFactory<Object> internalFactoryMock = mock(InternalFactory.class, "some_value");
        Scoping scopingMock = mock(Scoping.class, "some_value");
        Key key2 = Key.get(Object.class);
        LinkedBindingImpl target = new LinkedBindingImpl(injectorImplMock, key, object, internalFactoryMock, scopingMock, key2);
        //Act Statement(s)
        Set<Dependency<?>> result = target.getDependencies();
        Dependency<Object> dependency = Dependency.get(key2);
        ImmutableSet<Dependency<?>> anySet = ImmutableSet.of(dependency);
        //Assert statement(s)
        assertThat(result, equalTo(anySet));
    }

    //Sapient generated method id: ${da0d3db3-e38a-36e1-8dd5-ef2abf7e3a21}, hash: D77E0D80B7BA320BE2AA2E2276B085B3
    @Test()
    public void withScopingTest() {
        //Arrange Statement(s)
        Object object = new Object();
        LinkedBindingImpl target = new LinkedBindingImpl(injectorImplMock, keyMock, object, internalFactoryMock, scopingMock, keyMock2);
        Scoping scopingMock2 = mock(Scoping.class);
        //Act Statement(s)
        BindingImpl result = target.withScoping(scopingMock2);
        LinkedBindingImpl linkedBindingImpl = new LinkedBindingImpl(object, keyMock, scopingMock2, keyMock2);
        //Assert statement(s)
        assertThat(result, equalTo(linkedBindingImpl));
    }

    //Sapient generated method id: ${43ae4532-e963-39a9-b37c-2a93c33a9ff0}, hash: 9D42832E4912930E2D2545B0B118E2B5
    @Test()
    public void withKeyTest() {
        //Arrange Statement(s)
        Object object = new Object();
        LinkedBindingImpl target = new LinkedBindingImpl(injectorImplMock, keyMock, object, internalFactoryMock, scopingMock, keyMock2);
        Key<Object> keyMock3 = mock(Key.class);
        //Act Statement(s)
        BindingImpl result = target.withKey(keyMock3);
        LinkedBindingImpl linkedBindingImpl = new LinkedBindingImpl(object, keyMock3, scopingMock, keyMock2);
        //Assert statement(s)
        assertThat(result, equalTo(linkedBindingImpl));
    }

    //Sapient generated method id: ${0f0a622f-1e3b-3dc0-a3ae-a6ceb63c4e13}, hash: E388445BAD93779FD57B06C3C2308DD9
    @Ignore()
    @Test()
    public void applyToTest() {
        //Arrange Statement(s)
        ScopedBindingBuilder scopedBindingBuilderMock = mock(ScopedBindingBuilder.class);
        Binder binderMock = mock(Binder.class);
        Binder binderMock2 = mock(Binder.class);
        LinkedBindingBuilder linkedBindingBuilderMock = mock(LinkedBindingBuilder.class);
        try (MockedStatic<Elements> elements = mockStatic(Elements.class)) {
            doNothing().when(scopingMock).applyTo(scopedBindingBuilderMock);
            GuiceInternal guiceInternal = GuiceInternal.GUICE_INTERNAL;
            Object object = new Object();
            elements.when(() -> Elements.withTrustedSource(guiceInternal, binderMock2, object)).thenReturn(binderMock);
            doReturn(linkedBindingBuilderMock).when(binderMock).bind(keyMock);
            doReturn(scopedBindingBuilderMock).when(linkedBindingBuilderMock).to(keyMock2);
            LinkedBindingImpl target = new LinkedBindingImpl(injectorImplMock, keyMock, object, internalFactoryMock, scopingMock, keyMock2);
            //Act Statement(s)
            target.applyTo(binderMock2);
            //Assert statement(s)
            verify(scopingMock).applyTo(scopedBindingBuilderMock);
            elements.verify(() -> Elements.withTrustedSource(guiceInternal, binderMock2, object), atLeast(1));
            verify(binderMock).bind(keyMock);
            verify(linkedBindingBuilderMock).to(keyMock2);
        }
    }

    //Sapient generated method id: ${363d3698-f34c-39ad-914f-376a19498023}, hash: 4470B832467A107456FAD39CE8D20D28
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
        LinkedBindingImpl target = new LinkedBindingImpl(injectorImplMock, keyMock, object, internalFactoryMock, scopingMock, keyMock2);
        //Act Statement(s)
        String result = target.toString();
        //Assert statement(s)
        assertThat(result, equalTo("result1"));
    }
}

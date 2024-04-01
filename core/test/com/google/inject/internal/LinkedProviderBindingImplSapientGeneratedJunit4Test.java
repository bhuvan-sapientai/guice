package com.google.inject.internal;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import jakarta.inject.Provider;
import com.google.common.collect.ImmutableSet;
import com.google.inject.Key;
import com.google.inject.spi.Elements;
import com.google.inject.binder.LinkedBindingBuilder;

import java.util.Set;

import com.google.inject.spi.BindingTargetVisitor;
import com.google.inject.spi.Dependency;
import org.mockito.MockedStatic;
import com.google.inject.Binder;
import com.google.inject.binder.ScopedBindingBuilder;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

import org.junit.Ignore;

public class LinkedProviderBindingImplSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final InjectorImpl injectorImplMock = mock(InjectorImpl.class);

    private final InternalFactory<Object> internalFactoryMock = mock(InternalFactory.class);

    private final Key<Object> keyMock = mock(Key.class);

    private final Key<Provider<Object>> keyMock2 = mock(Key.class);

    private final Scoping scopingMock = mock(Scoping.class);

    //Sapient generated method id: ${f0196c5a-a713-319e-9fb3-56348536195e}, hash: F9C069F31CB25A045D2F038EB0E1908A
    @Test()
    public void createWithInitializerTest() {
        //Arrange Statement(s)
        Object object = new Object();
        DelayedInitialize delayedInitializeMock = mock(DelayedInitialize.class);
        //Act Statement(s)
        LinkedProviderBindingImpl result = LinkedProviderBindingImpl.createWithInitializer(injectorImplMock, keyMock, object, internalFactoryMock, scopingMock, keyMock2, delayedInitializeMock);
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${8144240a-8b49-3cdc-8570-b3706c172a53}, hash: 6DB1718C1E745FE9DFFCB0FDF7E9C1DC
    @Ignore()
    @Test()
    public void acceptTargetVisitorTest() {
        //Arrange Statement(s)
        Object object = new Object();
        LinkedProviderBindingImpl target = new LinkedProviderBindingImpl(injectorImplMock, keyMock, object, internalFactoryMock, scopingMock, keyMock2);
        BindingTargetVisitor<Object, Object> visitorMock = mock(BindingTargetVisitor.class);
        Object object2 = new Object();
        doReturn(object2).when(visitorMock).visit(target);
        //Act Statement(s)
        Object result = target.acceptTargetVisitor(visitorMock);
        //Assert statement(s)
        assertThat(result, equalTo(object2));
        verify(visitorMock).visit(target);
    }

    //Sapient generated method id: ${0d95007e-3799-3c62-89de-2b58eddf052a}, hash: A4E109C73A729C179CB4D5903BDBA359
    @Test()
    public void initializeWhenDelayedInitializerIsNull() throws ErrorsException {
        /* Branches:
         * (delayedInitializer != null) : false
         */
        //Arrange Statement(s)
        Object object = new Object();
        LinkedProviderBindingImpl target = new LinkedProviderBindingImpl(injectorImplMock, keyMock, object, internalFactoryMock, scopingMock, keyMock2);
        InjectorImpl injectorImplMock2 = mock(InjectorImpl.class);
        Errors errorsMock = mock(Errors.class);
        //Act Statement(s)
        target.initialize(injectorImplMock2, errorsMock);
    }

    //Sapient generated method id: ${903fef97-987f-323e-a528-d02591a6bcb2}, hash: ABC30F411F37B5299FAE21E3629F8E7D
    @Test()
    public void getDependenciesTest() {
        //Arrange Statement(s)
        InjectorImpl injectorImplMock = mock(InjectorImpl.class, "some_value");
        Key key = Key.get(Object.class);
        Object object = new Object();
        InternalFactory<Object> internalFactoryMock = mock(InternalFactory.class, "some_value");
        Scoping scopingMock = mock(Scoping.class, "some_value");
        Key key2 = Key.get(Object.class);
        LinkedProviderBindingImpl target = new LinkedProviderBindingImpl(injectorImplMock, key, object, internalFactoryMock, scopingMock, key2);
        //Act Statement(s)
        Set<Dependency<?>> result = target.getDependencies();
        Dependency dependency = Dependency.get(key2);
        ImmutableSet<Dependency<?>> anySet = ImmutableSet.of(dependency);
        //Assert statement(s)
        assertThat(result, equalTo(anySet));
    }

    //Sapient generated method id: ${da0d3db3-e38a-36e1-8dd5-ef2abf7e3a21}, hash: 6D81F908673739A3FF1D03E0C08C91D7
    @Test()
    public void withScopingTest() {
        //Arrange Statement(s)
        Object object = new Object();
        LinkedProviderBindingImpl target = new LinkedProviderBindingImpl(injectorImplMock, keyMock, object, internalFactoryMock, scopingMock, keyMock2);
        Scoping scopingMock2 = mock(Scoping.class);
        //Act Statement(s)
        BindingImpl result = target.withScoping(scopingMock2);
        LinkedProviderBindingImpl linkedProviderBindingImpl = new LinkedProviderBindingImpl(object, keyMock, scopingMock2, keyMock2);
        //Assert statement(s)
        assertThat(result, equalTo(linkedProviderBindingImpl));
    }

    //Sapient generated method id: ${43ae4532-e963-39a9-b37c-2a93c33a9ff0}, hash: 8C8D3B449311246EEB67C507D9E56634
    @Test()
    public void withKeyTest() {
        //Arrange Statement(s)
        Object object = new Object();
        LinkedProviderBindingImpl target = new LinkedProviderBindingImpl(injectorImplMock, keyMock, object, internalFactoryMock, scopingMock, keyMock2);
        Key<Object> keyMock3 = mock(Key.class);
        //Act Statement(s)
        BindingImpl result = target.withKey(keyMock3);
        LinkedProviderBindingImpl linkedProviderBindingImpl = new LinkedProviderBindingImpl(object, keyMock3, scopingMock, keyMock2);
        //Assert statement(s)
        assertThat(result, equalTo(linkedProviderBindingImpl));
    }

    //Sapient generated method id: ${0f0a622f-1e3b-3dc0-a3ae-a6ceb63c4e13}, hash: B144D25750F0F4C4BA4B5F0A5A70C5CA
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
            doReturn(scopedBindingBuilderMock).when(linkedBindingBuilderMock).toProvider(keyMock2);
            LinkedProviderBindingImpl target = new LinkedProviderBindingImpl(injectorImplMock, keyMock, object, internalFactoryMock, scopingMock, keyMock2);
            //Act Statement(s)
            target.applyTo(binderMock2);
            //Assert statement(s)
            verify(scopingMock).applyTo(scopedBindingBuilderMock);
            elements.verify(() -> Elements.withTrustedSource(guiceInternal, binderMock2, object), atLeast(1));
            verify(binderMock).bind(keyMock);
            verify(linkedBindingBuilderMock).toProvider(keyMock2);
        }
    }

    //Sapient generated method id: ${363d3698-f34c-39ad-914f-376a19498023}, hash: 2EF70745589E1325403F3FC8AE476865
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
        LinkedProviderBindingImpl target = new LinkedProviderBindingImpl(injectorImplMock, keyMock, object, internalFactoryMock, scopingMock, keyMock2);
        //Act Statement(s)
        String result = target.toString();
        //Assert statement(s)
        assertThat(result, equalTo("result1"));
    }
}

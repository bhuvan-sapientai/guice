package com.google.inject.internal;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.util.HashSet;

import com.google.common.collect.ImmutableSet;
import com.google.inject.Key;

import java.lang.reflect.Constructor;

import com.google.inject.util.Providers;
import com.google.inject.spi.Elements;
import com.google.inject.TypeLiteral;
import com.google.inject.binder.LinkedBindingBuilder;
import com.google.inject.spi.ProviderWithExtensionVisitor;
import com.google.inject.Provider;

import java.util.Set;

import com.google.inject.spi.BindingTargetVisitor;
import com.google.inject.spi.Dependency;
import org.mockito.MockedStatic;
import com.google.inject.Binder;
import com.google.inject.binder.ScopedBindingBuilder;
import com.google.inject.spi.InjectionPoint;

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

public class ProviderInstanceBindingImplSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final InjectorImpl injectorImplMock = mock(InjectorImpl.class);

    private final InternalFactory<Object> internalFactoryMock = mock(InternalFactory.class);

    private final Key<Object> keyMock = mock(Key.class);

    private final jakarta.inject.Provider<Object> providerMock = mock(jakarta.inject.Provider.class);

    private final Scoping scopingMock = mock(Scoping.class);

    //Sapient generated method id: ${1fd4b126-14cf-357e-98f4-48b43a64f592}, hash: DD694DAFFAAF26256CAD3EEA7AC069E0
    @Ignore()
    @Test()
    public void acceptTargetVisitorWhenProviderInstanceInstanceOfProviderWithExtensionVisitor() {
        /* Branches:
         * (providerInstance instanceof ProviderWithExtensionVisitor) : true
         */
        //Arrange Statement(s)
        Object object = new Object();
        ProviderWithExtensionVisitor providerWithExtensionVisitorMock = mock(ProviderWithExtensionVisitor.class);
        Set<InjectionPoint> injectionPointSet = new HashSet<>();
        ProviderInstanceBindingImpl target = new ProviderInstanceBindingImpl(injectorImplMock, keyMock, object, internalFactoryMock, scopingMock, providerWithExtensionVisitorMock, injectionPointSet);
        Object object2 = new Object();
        BindingTargetVisitor<Object, Object> bindingTargetVisitorMock = mock(BindingTargetVisitor.class);
        doReturn(object2).when(providerWithExtensionVisitorMock).acceptExtensionVisitor(bindingTargetVisitorMock, target);
        //Act Statement(s)
        Object result = target.acceptTargetVisitor(bindingTargetVisitorMock);
        //Assert statement(s)
        assertThat(result, equalTo(object2));
        verify(providerWithExtensionVisitorMock).acceptExtensionVisitor(bindingTargetVisitorMock, target);
    }

    //Sapient generated method id: ${58c59da7-f088-3d60-97d3-de61b8373362}, hash: E9A411BCC14834F01EE0375CEDEFA1F0
    @Ignore()
    @Test()
    public void acceptTargetVisitorWhenProviderInstanceNotInstanceOfProviderWithExtensionVisitor() {
        /* Branches:
         * (providerInstance instanceof ProviderWithExtensionVisitor) : false
         */
        //Arrange Statement(s)
        Object object = new Object();
        Set<InjectionPoint> injectionPointSet = new HashSet<>();
        ProviderInstanceBindingImpl target = new ProviderInstanceBindingImpl(injectorImplMock, keyMock, object, internalFactoryMock, scopingMock, providerMock, injectionPointSet);
        BindingTargetVisitor<Object, Object> visitorMock = mock(BindingTargetVisitor.class);
        Object object2 = new Object();
        doReturn(object2).when(visitorMock).visit(target);
        //Act Statement(s)
        Object result = target.acceptTargetVisitor(visitorMock);
        //Assert statement(s)
        assertThat(result, equalTo(object2));
        verify(visitorMock).visit(target);
    }

    //Sapient generated method id: ${11d8a15a-006b-3735-aa01-1bcaadc08948}, hash: 5D270CE2E32B4124A1B82B15C5B2F7B8
    @Test()
    public void getProviderInstanceTest() {
        //Arrange Statement(s)
        Provider<Object> providerMock = mock(Provider.class);
        jakarta.inject.Provider<Object> providerMock2 = mock(jakarta.inject.Provider.class);
        try (MockedStatic<Providers> providers = mockStatic(Providers.class)) {
            providers.when(() -> Providers.guicify(providerMock2)).thenReturn(providerMock);
            Object object = new Object();
            Set<InjectionPoint> injectionPointSet = new HashSet<>();
            ProviderInstanceBindingImpl target = new ProviderInstanceBindingImpl(injectorImplMock, keyMock, object, internalFactoryMock, scopingMock, providerMock2, injectionPointSet);
            //Act Statement(s)
            Provider result = target.getProviderInstance();
            //Assert statement(s)
            assertThat(result, equalTo(providerMock));
            providers.verify(() -> Providers.guicify(providerMock2), atLeast(1));
        }
    }

    //Sapient generated method id: ${4cafec08-f58b-3940-87bc-b59f7116f3c3}, hash: 2C4A787D89B931E74CD2396FBBDA36F2
    @Test()
    public void getInjectionPointsTest() {
        //Arrange Statement(s)
        Object object = new Object();
        Set<InjectionPoint> injectionPointSet = new HashSet<>();
        ProviderInstanceBindingImpl target = new ProviderInstanceBindingImpl(injectorImplMock, keyMock, object, internalFactoryMock, scopingMock, providerMock, injectionPointSet);
        //Act Statement(s)
        Set<InjectionPoint> result = target.getInjectionPoints();
        ImmutableSet<InjectionPoint> injectionPointSet2 = ImmutableSet.copyOf(injectionPointSet);
        //Assert statement(s)
        assertThat(result, equalTo(injectionPointSet2));
    }

    //Sapient generated method id: ${17f9e115-013b-3389-8357-1c2f1b881593}, hash: 1D20FC4A062ADD64F6F6800CC78B7AAC
    @Test()
    public void getDependenciesWhenProviderInstanceNotInstanceOfHasDependencies() {
        /* Branches:
         * (providerInstance instanceof HasDependencies) : false
         */
        //Arrange Statement(s)
        Object object = new Object();
        Set<InjectionPoint> injectionPointSet = new HashSet<>();
        ProviderInstanceBindingImpl target = new ProviderInstanceBindingImpl(injectorImplMock, keyMock, object, internalFactoryMock, scopingMock, providerMock, injectionPointSet);
        //Act Statement(s)
        Set<Dependency<?>> result = target.getDependencies();
        //Assert statement(s)
        assertThat(result.size(), equalTo(0));
    }

    //Sapient generated method id: ${da0d3db3-e38a-36e1-8dd5-ef2abf7e3a21}, hash: D613FDC4B6C2F2F3528DD726CD026E41
    @Test()
    public void withScopingTest() {
        //Arrange Statement(s)
        Object object = new Object();
        Set<InjectionPoint> injectionPointSet = new HashSet<>();
        ProviderInstanceBindingImpl target = spy(new ProviderInstanceBindingImpl(injectorImplMock, keyMock, object, internalFactoryMock, scopingMock, providerMock, injectionPointSet));
        Object object2 = new Object();
        doReturn(object2).when(target).getSource();
        Scoping scopingMock2 = mock(Scoping.class);
        //Act Statement(s)
        BindingImpl result = target.withScoping(scopingMock2);
        ImmutableSet<InjectionPoint> injectionPointSet2 = ImmutableSet.copyOf(injectionPointSet);
        ProviderInstanceBindingImpl providerInstanceBindingImpl = new ProviderInstanceBindingImpl(object2, keyMock, scopingMock2, injectionPointSet2, providerMock);
        //Assert statement(s)
        assertThat(result, equalTo(providerInstanceBindingImpl));
        verify(target).getSource();
    }

    //Sapient generated method id: ${43ae4532-e963-39a9-b37c-2a93c33a9ff0}, hash: A0D7B0CE06E0FF0E6B2304F05412B079
    @Test()
    public void withKeyTest() {
        //Arrange Statement(s)
        Object object = new Object();
        Set<InjectionPoint> injectionPointSet = new HashSet<>();
        ProviderInstanceBindingImpl target = spy(new ProviderInstanceBindingImpl(injectorImplMock, keyMock, object, internalFactoryMock, scopingMock, providerMock, injectionPointSet));
        Object object2 = new Object();
        doReturn(object2).when(target).getSource();
        Key<Object> keyMock2 = mock(Key.class);
        //Act Statement(s)
        BindingImpl result = target.withKey(keyMock2);
        ImmutableSet<InjectionPoint> injectionPointSet2 = ImmutableSet.copyOf(injectionPointSet);
        ProviderInstanceBindingImpl providerInstanceBindingImpl = new ProviderInstanceBindingImpl(object2, keyMock2, scopingMock, injectionPointSet2, providerMock);
        //Assert statement(s)
        assertThat(result, equalTo(providerInstanceBindingImpl));
        verify(target).getSource();
    }

    //Sapient generated method id: ${0f0a622f-1e3b-3dc0-a3ae-a6ceb63c4e13}, hash: A61DF859F08F8618526D2929EE5BE692
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
            doReturn(scopedBindingBuilderMock).when(linkedBindingBuilderMock).toProvider(providerMock);
            Object object2 = new Object();
            Set<InjectionPoint> injectionPointSet = new HashSet<>();
            ProviderInstanceBindingImpl target = spy(new ProviderInstanceBindingImpl(injectorImplMock, keyMock, object2, internalFactoryMock, scopingMock, providerMock, injectionPointSet));
            doReturn(object).when(target).getSource();
            //Act Statement(s)
            target.applyTo(binderMock2);
            //Assert statement(s)
            verify(scopingMock).applyTo(scopedBindingBuilderMock);
            elements.verify(() -> Elements.withTrustedSource(guiceInternal, binderMock2, object), atLeast(1));
            verify(binderMock).bind(keyMock);
            verify(linkedBindingBuilderMock).toProvider(providerMock);
            verify(target).getSource();
        }
    }

    //Sapient generated method id: ${363d3698-f34c-39ad-914f-376a19498023}, hash: 03228F32789481672AA7DC7C239A7651
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
        Key key = Key.get(Object.class);
        Object object = new Object();
        Constructor constructorMock = mock(Constructor.class);
        TypeLiteral typeLiteralMock = mock(TypeLiteral.class);
        InjectionPoint injectionPoint = InjectionPoint.forConstructor(constructorMock, typeLiteralMock);
        Set<InjectionPoint> injectionPointSet = new HashSet<>();
        injectionPointSet.add(injectionPoint);
        ProviderInstanceBindingImpl target = spy(new ProviderInstanceBindingImpl(injectorImplMock, key, object, internalFactoryMock, scopingMock, providerMock, injectionPointSet));
        Key keyMock = mock(Key.class);
        doReturn(keyMock).when(target).getKey();
        Object object2 = new Object();
        doReturn(object2).when(target).getSource();
        //Act Statement(s)
        String result = target.toString();
        //Assert statement(s)
        assertThat(result, equalTo("result1"));
        verify(target).getKey();
        verify(target).getSource();
    }
}

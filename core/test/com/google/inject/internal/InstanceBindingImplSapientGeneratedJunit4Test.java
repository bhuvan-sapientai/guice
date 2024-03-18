package com.google.inject.internal;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.util.HashSet;

import com.google.common.collect.ImmutableSet;
import com.google.inject.Key;

import java.lang.reflect.Constructor;

import com.google.inject.spi.HasDependencies;
import com.google.inject.spi.Elements;
import com.google.inject.TypeLiteral;
import com.google.inject.binder.LinkedBindingBuilder;

import java.util.Set;

import com.google.inject.spi.BindingTargetVisitor;
import com.google.inject.spi.Dependency;
import org.mockito.MockedStatic;
import com.google.inject.Binder;
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

public class InstanceBindingImplSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Constructor constructorMock = mock(Constructor.class);

    private final InjectorImpl injectorImplMock = mock(InjectorImpl.class);

    private final InternalFactory<Object> internalFactoryMock = mock(InternalFactory.class);

    private final Key<Object> keyMock = mock(Key.class);

    private final Scoping scopingMock = mock(Scoping.class);

    private final TypeLiteral typeLiteralMock = mock(TypeLiteral.class);

    //Sapient generated method id: ${8144240a-8b49-3cdc-8570-b3706c172a53}, hash: EAB50160B5E8D8643D008DA33DA9FD8F
    @Ignore()
    @Test()
    public void acceptTargetVisitorTest() {
        //Arrange Statement(s)
        Object object = new Object();
        Set<InjectionPoint> injectionPointSet = new HashSet<>();
        Object object2 = new Object();
        InstanceBindingImpl target = new InstanceBindingImpl(injectorImplMock, keyMock, object, internalFactoryMock, injectionPointSet, object2);
        BindingTargetVisitor<Object, Object> visitorMock = mock(BindingTargetVisitor.class);
        Object object3 = new Object();
        doReturn(object3).when(visitorMock).visit(target);
        //Act Statement(s)
        Object result = target.acceptTargetVisitor(visitorMock);
        //Assert statement(s)
        assertThat(result, equalTo(object3));
        verify(visitorMock).visit(target);
    }

    //Sapient generated method id: ${4cafec08-f58b-3940-87bc-b59f7116f3c3}, hash: 293145F479312D0A0D3E61ADD19C2355
    @Test()
    public void getInjectionPointsTest() {
        //Arrange Statement(s)
        Object object = new Object();
        Set<InjectionPoint> injectionPointSet = new HashSet<>();
        Object object2 = new Object();
        InstanceBindingImpl target = new InstanceBindingImpl(injectorImplMock, keyMock, object, internalFactoryMock, injectionPointSet, object2);
        //Act Statement(s)
        Set<InjectionPoint> result = target.getInjectionPoints();
        ImmutableSet<InjectionPoint> injectionPointSet2 = ImmutableSet.copyOf(injectionPointSet);
        //Assert statement(s)
        assertThat(result, equalTo(injectionPointSet2));
    }

    //Sapient generated method id: ${e0b0bebf-01fa-3438-a538-11211485e695}, hash: 443A58BD53D6F7BE22129052A1BA65F2
    @Ignore()
    @Test()
    public void getDependenciesWhenInstanceInstanceOfHasDependencies() {
        /* Branches:
         * (instance instanceof HasDependencies) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        HasDependencies hasDependenciesMock = mock(HasDependencies.class);
        Key keyMock = mock(Key.class);
        Dependency dependency = Dependency.get(keyMock);
        Set<Dependency<?>> anySet = new HashSet<>();
        anySet.add(dependency);
        doReturn(anySet).when(hasDependenciesMock).getDependencies();
        Key key = Key.get(Object.class);
        Object object = new Object();
        InjectionPoint injectionPoint = InjectionPoint.forConstructor(constructorMock, typeLiteralMock);
        Set<InjectionPoint> injectionPointSet = new HashSet<>();
        injectionPointSet.add(injectionPoint);
        InstanceBindingImpl target = new InstanceBindingImpl(injectorImplMock, key, object, internalFactoryMock, injectionPointSet, hasDependenciesMock);
        //Act Statement(s)
        Set<Dependency<?>> result = target.getDependencies();
        ImmutableSet immutableSet = ImmutableSet.of();
        //Assert statement(s)
        assertThat(result, equalTo(immutableSet));
        verify(hasDependenciesMock).getDependencies();
    }

    //Sapient generated method id: ${7bc0ec3c-fbf5-3b7e-ba5d-3f456c61029d}, hash: 242E4B2A017F81F5E7E5D78FF3073886
    @Test()
    public void getDependenciesWhenInstanceNotInstanceOfHasDependencies() {
        /* Branches:
         * (instance instanceof HasDependencies) : false
         */
        //Arrange Statement(s)
        Object object = new Object();
        Set<InjectionPoint> injectionPointSet = new HashSet<>();
        Object object2 = new Object();
        InstanceBindingImpl target = new InstanceBindingImpl(injectorImplMock, keyMock, object, internalFactoryMock, injectionPointSet, object2);
        //Act Statement(s)
        Set<Dependency<?>> result = target.getDependencies();
        //Assert statement(s)
        assertThat(result.size(), equalTo(0));
    }

    //Sapient generated method id: ${da0d3db3-e38a-36e1-8dd5-ef2abf7e3a21}, hash: FCF2995457D9BC8B324AA4BDAB346090
    @Test()
    public void withScopingTest() {
        //Arrange Statement(s)
        Object object = new Object();
        Set<InjectionPoint> injectionPointSet = new HashSet<>();
        Object object2 = new Object();
        InstanceBindingImpl target = spy(new InstanceBindingImpl(injectorImplMock, keyMock, object, internalFactoryMock, injectionPointSet, object2));
        Object object3 = new Object();
        doReturn(object3).when(target).getSource();
        //Act Statement(s)
        BindingImpl result = target.withScoping(scopingMock);
        ImmutableSet<InjectionPoint> injectionPointSet2 = ImmutableSet.copyOf(injectionPointSet);
        InstanceBindingImpl instanceBindingImpl = new InstanceBindingImpl(object3, keyMock, scopingMock, injectionPointSet2, object2);
        //Assert statement(s)
        assertThat(result, equalTo(instanceBindingImpl));
        verify(target).getSource();
    }

    //Sapient generated method id: ${43ae4532-e963-39a9-b37c-2a93c33a9ff0}, hash: 272FBCBFF86E83F8AD30A548177E4D39
    @Test()
    public void withKeyTest() {
        //Arrange Statement(s)
        Object object = new Object();
        Set<InjectionPoint> injectionPointSet = new HashSet<>();
        Object object2 = new Object();
        InstanceBindingImpl target = spy(new InstanceBindingImpl(injectorImplMock, keyMock, object, internalFactoryMock, injectionPointSet, object2));
        Object object3 = new Object();
        doReturn(object3).when(target).getSource();
        doReturn(scopingMock).when(target).getScoping();
        Key<Object> keyMock2 = mock(Key.class);
        //Act Statement(s)
        BindingImpl result = target.withKey(keyMock2);
        ImmutableSet<InjectionPoint> injectionPointSet2 = ImmutableSet.copyOf(injectionPointSet);
        InstanceBindingImpl instanceBindingImpl = new InstanceBindingImpl(object3, keyMock2, scopingMock, injectionPointSet2, object2);
        //Assert statement(s)
        assertThat(result, equalTo(instanceBindingImpl));
        verify(target).getSource();
        verify(target).getScoping();
    }

    //Sapient generated method id: ${0f0a622f-1e3b-3dc0-a3ae-a6ceb63c4e13}, hash: 4DBEB2C7CF2CBDB6B2B1024B65E1A2AF
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
            Object object2 = new Object();
            doNothing().when(linkedBindingBuilderMock).toInstance(object2);
            Object object3 = new Object();
            Set<InjectionPoint> injectionPointSet = new HashSet<>();
            InstanceBindingImpl target = spy(new InstanceBindingImpl(injectorImplMock, keyMock, object3, internalFactoryMock, injectionPointSet, object2));
            doReturn(object).when(target).getSource();
            //Act Statement(s)
            target.applyTo(binderMock2);
            //Assert statement(s)
            elements.verify(() -> Elements.withTrustedSource(guiceInternal, binderMock2, object), atLeast(1));
            verify(binderMock).bind(keyMock);
            verify(linkedBindingBuilderMock).toInstance(object2);
            verify(target).getSource();
        }
    }

    //Sapient generated method id: ${363d3698-f34c-39ad-914f-376a19498023}, hash: 837566BF20EB53CE8A8CF9AE88EB7688
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
        InjectorImpl injectorImplMock = mock(InjectorImpl.class, "some_value");
        Key key = Key.get(Object.class);
        Object object = new Object();
        InternalFactory<Object> internalFactoryMock = mock(InternalFactory.class, "some_value");
        InjectionPoint injectionPoint = InjectionPoint.forConstructor(constructorMock, typeLiteralMock);
        Set<InjectionPoint> injectionPointSet = new HashSet<>();
        injectionPointSet.add(injectionPoint);
        Object object2 = new Object();
        InstanceBindingImpl target = spy(new InstanceBindingImpl(injectorImplMock, key, object, internalFactoryMock, injectionPointSet, object2));
        Key keyMock = mock(Key.class);
        doReturn(keyMock).when(target).getKey();
        Object object3 = new Object();
        doReturn(object3).when(target).getSource();
        //Act Statement(s)
        String result = target.toString();
        //Assert statement(s)
        assertThat(result, equalTo("result1"));
        verify(target).getKey();
        verify(target).getSource();
    }
}

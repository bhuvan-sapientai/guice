package com.google.inject.spi;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import com.google.inject.internal.Errors;
import com.google.inject.Provider;
import org.mockito.MockedStatic;
import com.google.inject.Binder;
import com.google.inject.Key;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

import org.junit.Ignore;

public class ProviderLookupSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Dependency<Object> dependencyMock = mock(Dependency.class);

    private final Key keyMock = mock(Key.class);

    //Sapient generated method id: ${a377c75a-5e17-3222-adbe-6e7d38993c02}, hash: 23EA4F86F9FD4D53EC84A5B1C8AE681A
    @Ignore()
    @Test()
    public void getKeyTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Dependency> dependency = mockStatic(Dependency.class)) {
            dependency.when(() -> Dependency.get(keyMock)).thenReturn(dependencyMock);
            Object object = new Object();
            Key key = Key.get(Object.class);
            ProviderLookup<Object> target = new ProviderLookup(object, key);
            //Act Statement(s)
            Key result = target.getKey();
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            dependency.verify(() -> Dependency.get(keyMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${85010207-16d2-3170-b836-208737cec5b9}, hash: AD966557FBD3D2BDA32F06C782C0B611
    @Ignore()
    @Test()
    public void acceptVisitorTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Dependency<Object> dependencyMock = mock(Dependency.class, "Dependency");
        ElementVisitor<Object> visitorMock = mock(ElementVisitor.class);
        try (MockedStatic<Dependency> dependency = mockStatic(Dependency.class)) {
            dependency.when(() -> Dependency.get(keyMock)).thenReturn(dependencyMock);
            Object object = new Object();
            Key key = Key.get(Object.class);
            ProviderLookup<Object> target = new ProviderLookup(object, key);
            Object object2 = new Object();
            doReturn(object2).when(visitorMock).visit(target);
            //Act Statement(s)
            Object result = target.acceptVisitor(visitorMock);
            //Assert statement(s)
            assertThat(result, equalTo(object2));
            dependency.verify(() -> Dependency.get(keyMock), atLeast(1));
            verify(visitorMock).visit(target);
        }
    }

    //Sapient generated method id: ${a95841c5-3cf7-323e-a315-a7d63e44019c}, hash: 8A09CF1E9E04DA8C096011BA384219EE
    @Ignore()
    @Test()
    public void initializeDelegateWhenThisDelegateIsNull() {
        /* Branches:
         * (this.delegate == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Provider<Object> providerMock = mock(Provider.class);
        try (MockedStatic<Dependency> dependency = mockStatic(Dependency.class)) {
            dependency.when(() -> Dependency.get(keyMock)).thenReturn(dependencyMock);
            Object object = new Object();
            Key key = Key.get(Object.class);
            ProviderLookup<Object> target = new ProviderLookup(object, key);
            //Act Statement(s)
            target.initializeDelegate(providerMock);
            //Assert statement(s)
            assertThat(target.getDelegate(), is(notNullValue()));
            dependency.verify(() -> Dependency.get(keyMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${0f0a622f-1e3b-3dc0-a3ae-a6ceb63c4e13}, hash: 659C08A2DF260295E6CD6ECF068AA2A1
    @Ignore()
    @Test()
    public void applyToTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Binder binderMock = mock(Binder.class, "Binder");
        Binder binderMock2 = mock(Binder.class);
        Provider providerMock = mock(Provider.class);
        Dependency<Object> dependencyMock2 = mock(Dependency.class);
        try (MockedStatic<Dependency> dependency = mockStatic(Dependency.class)) {
            Object object = new Object();
            doReturn(binderMock2).when(binderMock).withSource(object);
            doReturn(providerMock).when(binderMock2).getProvider(dependencyMock);
            dependency.when(() -> Dependency.get(keyMock)).thenReturn(dependencyMock2);
            Object object2 = new Object();
            Key key = Key.get(Object.class);
            ProviderLookup<Object> target = spy(new ProviderLookup(object2, key));
            doNothing().when(target).initializeDelegate(providerMock);
            //Act Statement(s)
            target.applyTo(binderMock);
            //Assert statement(s)
            verify(binderMock).withSource(object);
            verify(binderMock2).getProvider(dependencyMock);
            dependency.verify(() -> Dependency.get(keyMock), atLeast(1));
            verify(target).initializeDelegate(providerMock);
        }
    }

    //Sapient generated method id: ${00dff819-cb70-3ea6-9be9-223a26306dab}, hash: 81DB3EDDEF292F70CBD005513C53DDF4
    @Ignore()
    @Test()
    public void getProviderTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Dependency> dependency = mockStatic(Dependency.class)) {
            dependency.when(() -> Dependency.get(keyMock)).thenReturn(dependencyMock);
            Object object = new Object();
            Key key = Key.get(Object.class);
            ProviderLookup<Object> target = new ProviderLookup(object, key);
            //Act Statement(s)
            Provider result = target.getProvider();
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            dependency.verify(() -> Dependency.get(keyMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${363d3698-f34c-39ad-914f-376a19498023}, hash: DD3AD0B661155C4B5ADC9FBB1F004575
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
        Dependency<Object> dependencyMock = mock(Dependency.class, "Dependency");
        Object objectMock = mock(Object.class, "Object");
        try (MockedStatic<Errors> errors = mockStatic(Errors.class);
             MockedStatic<Dependency> dependency = mockStatic(Dependency.class)) {
            dependency.when(() -> Dependency.get(keyMock)).thenReturn(dependencyMock);
            Object object = new Object();
            errors.when(() -> Errors.convert(object)).thenReturn(objectMock);
            Object object2 = new Object();
            Key key = Key.get(Object.class);
            ProviderLookup<Object> target = new ProviderLookup(object2, key);
            //Act Statement(s)
            String result = target.toString();
            //Assert statement(s)
            assertThat(result, equalTo("result1"));
            dependency.verify(() -> Dependency.get(keyMock), atLeast(1));
            errors.verify(() -> Errors.convert(object), atLeast(1));
        }
    }
}

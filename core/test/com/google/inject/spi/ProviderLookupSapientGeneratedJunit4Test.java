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

    private final Dependency<Object> dependencyMock = mock(Dependency.class, "dependency");

    private final Key keyMock = mock(Key.class);

    private final Key keyMock2 = mock(Key.class);

    //Sapient generated method id: ${a377c75a-5e17-3222-adbe-6e7d38993c02}, hash: 2328C4109721CD378432EA216110C353
    @Ignore()
    @Test()
    public void getKeyTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Key keyMock3 = mock(Key.class);
        try (MockedStatic<Dependency> dependency = mockStatic(Dependency.class)) {
            Dependency dependency2 = Dependency.get(keyMock);
            dependency.when(() -> Dependency.get(keyMock2)).thenReturn(dependency2);
            Object object = new Object();
            Key key = Key.get(Object.class);
            ProviderLookup<Object> target = new ProviderLookup(object, key);
            doReturn(keyMock3).when(dependencyMock).getKey();
            //Act Statement(s)
            Key result = target.getKey();
            //Assert statement(s)
            assertThat(result, equalTo(keyMock3));
            dependency.verify(() -> Dependency.get(keyMock2), atLeast(1));
            verify(dependencyMock).getKey();
        }
    }

    //Sapient generated method id: ${85010207-16d2-3170-b836-208737cec5b9}, hash: 5A7926D1FC6C1340335CDCC5C80DEB9C
    @Ignore()
    @Test()
    public void acceptVisitorTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ElementVisitor<Object> visitorMock = mock(ElementVisitor.class);
        try (MockedStatic<Dependency> dependency = mockStatic(Dependency.class)) {
            Dependency dependency2 = Dependency.get(keyMock);
            dependency.when(() -> Dependency.get(keyMock2)).thenReturn(dependency2);
            Object object = new Object();
            Key key = Key.get(Object.class);
            ProviderLookup<Object> target = new ProviderLookup(object, key);
            Object object2 = new Object();
            doReturn(object2).when(visitorMock).visit(target);
            //Act Statement(s)
            Object result = target.acceptVisitor(visitorMock);
            //Assert statement(s)
            assertThat(result, equalTo(object2));
            dependency.verify(() -> Dependency.get(keyMock2), atLeast(1));
            verify(visitorMock).visit(target);
        }
    }

    //Sapient generated method id: ${a95841c5-3cf7-323e-a315-a7d63e44019c}, hash: BE173F49F71372007886BC3626380397
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
            Dependency dependency2 = Dependency.get(keyMock);
            dependency.when(() -> Dependency.get(keyMock2)).thenReturn(dependency2);
            Object object = new Object();
            Key key = Key.get(Object.class);
            ProviderLookup<Object> target = new ProviderLookup(object, key);
            //Act Statement(s)
            target.initializeDelegate(providerMock);
            //Assert statement(s)
            assertThat(target.getDelegate(), is(notNullValue()));
            dependency.verify(() -> Dependency.get(keyMock2), atLeast(1));
        }
    }

    //Sapient generated method id: ${0f0a622f-1e3b-3dc0-a3ae-a6ceb63c4e13}, hash: A9EC261782790F6D7FE72A28954A94A8
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
        try (MockedStatic<Dependency> dependency = mockStatic(Dependency.class)) {
            Object object = new Object();
            doReturn(binderMock2).when(binderMock).withSource(object);
            doReturn(providerMock).when(binderMock2).getProvider(dependencyMock);
            Dependency dependency2 = Dependency.get(keyMock);
            dependency.when(() -> Dependency.get(keyMock2)).thenReturn(dependency2);
            Object object2 = new Object();
            Key key = Key.get(Object.class);
            ProviderLookup<Object> target = spy(new ProviderLookup(object2, key));
            doNothing().when(target).initializeDelegate(providerMock);
            //Act Statement(s)
            target.applyTo(binderMock);
            //Assert statement(s)
            verify(binderMock).withSource(object);
            verify(binderMock2).getProvider(dependencyMock);
            dependency.verify(() -> Dependency.get(keyMock2), atLeast(1));
            verify(target).initializeDelegate(providerMock);
        }
    }

    //Sapient generated method id: ${00dff819-cb70-3ea6-9be9-223a26306dab}, hash: AF2C989CD82A1B8CEF69DCB8AE9AA312
    @Ignore()
    @Test()
    public void getProviderTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Dependency> dependency = mockStatic(Dependency.class)) {
            Dependency dependency2 = Dependency.get(keyMock);
            dependency.when(() -> Dependency.get(keyMock2)).thenReturn(dependency2);
            Object object = new Object();
            Key key = Key.get(Object.class);
            ProviderLookup<Object> target = new ProviderLookup(object, key);
            //Act Statement(s)
            Provider result = target.getProvider();
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            dependency.verify(() -> Dependency.get(keyMock2), atLeast(1));
        }
    }

    //Sapient generated method id: ${363d3698-f34c-39ad-914f-376a19498023}, hash: 4FD2D7FA3BA53FE2AC18A04D17252566
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
        try (MockedStatic<Errors> errors = mockStatic(Errors.class);
             MockedStatic<Dependency> dependency = mockStatic(Dependency.class)) {
            Dependency dependency2 = Dependency.get(keyMock);
            dependency.when(() -> Dependency.get(keyMock2)).thenReturn(dependency2);
            Object object = new Object();
            Object object2 = new Object();
            errors.when(() -> Errors.convert(object2)).thenReturn(object);
            Object object3 = new Object();
            Key key = Key.get(Object.class);
            ProviderLookup<Object> target = new ProviderLookup(object3, key);
            //Act Statement(s)
            String result = target.toString();
            //Assert statement(s)
            assertThat(result, equalTo("result1"));
            dependency.verify(() -> Dependency.get(keyMock2), atLeast(1));
            errors.verify(() -> Errors.convert(object2), atLeast(1));
        }
    }
}

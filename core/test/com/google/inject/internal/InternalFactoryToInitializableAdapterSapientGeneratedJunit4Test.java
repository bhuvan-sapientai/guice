package com.google.inject.internal;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.List;

import org.mockito.stubbing.Answer;
import jakarta.inject.Provider;
import com.google.inject.spi.Dependency;
import org.mockito.MockedStatic;
import com.google.inject.Binding;

import java.util.ArrayList;

import com.google.inject.Key;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

import org.junit.Ignore;

public class InternalFactoryToInitializableAdapterSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Initializable<Provider<Object>> initializableMock = mock(Initializable.class, "initializable");

    private final Binding bindingMock = mock(Binding.class);

    private final Initializable<Provider<Object>> initializableMock2 = mock(Initializable.class);

    private final Key keyMock = mock(Key.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${9c25887d-767d-38e9-b5ae-c2e4012c49be}, hash: B8E4BB61FB8BC2856B52DA57337FA399
    @Ignore()
    @Test()
    public void getTest() throws InternalProvisionException {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        List list = new ArrayList<>();
        ProvisionListenerStackCallback provisionListenerStackCallback = new ProvisionListenerStackCallback(bindingMock, list);
        InternalFactoryToInitializableAdapter target = spy(new InternalFactoryToInitializableAdapter(initializableMock2, object, provisionListenerStackCallback));
        Provider providerMock = mock(Provider.class);
        doReturn(providerMock).when(initializableMock).get();
        Object object2 = new Object();
        InternalContext internalContextMock = mock(InternalContext.class);
        doReturn(object2).when(target).circularGet(eq(providerMock), eq(internalContextMock), (Dependency) any(), eq(provisionListenerStackCallback));
        Dependency dependency = Dependency.get(keyMock);
        //Act Statement(s)
        Object result = target.get(internalContextMock, dependency, false);
        //Assert statement(s)
        assertThat(result, equalTo(object2));
        verify(initializableMock).get();
        verify(target).circularGet(eq(providerMock), eq(internalContextMock), (Dependency) any(), eq(provisionListenerStackCallback));
    }

    //Sapient generated method id: ${9d69d459-8b9e-363b-84ee-3df37ace1ef0}, hash: 72D579BC685569C55A8E81C9729FE80D
    @Ignore()
    @Test()
    public void provisionWhenDependencyNotIsNullable() throws InternalProvisionException {
        /* Branches:
         * (t == null) : true  #  inside provision method
         * (!dependency.isNullable()) : true  #  inside provision method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Provider<Object> providerMock = mock(Provider.class, "someProvider");
        ConstructionContext<Object> constructionContextMock = mock(ConstructionContext.class, "someConstructionContext");
        Initializable<Provider<Object>> initializableMock2 = mock(Initializable.class, "someInitializable");
        try (MockedStatic<InternalProvisionException> internalProvisionException = mockStatic(InternalProvisionException.class)) {
            doReturn(null).when(providerMock).get();
            doNothing().when(constructionContextMock).setProxyDelegates((Object) null);
            Object object = new Object();
            internalProvisionException.when(() -> InternalProvisionException.onNullInjectedIntoNonNullableDependency(eq(object), (Dependency) any())).thenAnswer((Answer<Void>) invocation -> null);
            Object object2 = new Object();
            List list = new ArrayList<>();
            ProvisionListenerStackCallback provisionListenerStackCallback = new ProvisionListenerStackCallback(bindingMock, list);
            InternalFactoryToInitializableAdapter target = new InternalFactoryToInitializableAdapter(initializableMock2, object2, provisionListenerStackCallback);
            Dependency dependency = Dependency.get(keyMock);
            //Act Statement(s)
            Object result = target.provision(providerMock, dependency, constructionContextMock);
            //Assert statement(s)
            assertThat(result, is(nullValue()));
            verify(providerMock).get();
            verify(constructionContextMock).setProxyDelegates((Object) null);
            internalProvisionException.verify(() -> InternalProvisionException.onNullInjectedIntoNonNullableDependency(eq(object), (Dependency) any()));
        }
    }

    //Sapient generated method id: ${aaee6b7e-4dda-3a6c-b2f6-74d7fd61056e}, hash: FA0A7C3055914F42777589A875BCE553
    @Ignore()
    @Test()
    public void provisionWhenDependencyNotIsNullableAndCaughtRuntimeExceptionThrowsInternalProvisionException() throws InternalProvisionException {
        /* Branches:
         * (t == null) : true  #  inside provision method
         * (!dependency.isNullable()) : true  #  inside provision method
         * (catch-exception (RuntimeException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Provider<Object> providerMock = mock(Provider.class);
        ConstructionContext<Object> constructionContextMock = mock(ConstructionContext.class);
        InternalProvisionException internalProvisionExceptionMock = mock(InternalProvisionException.class);
        InternalProvisionException internalProvisionExceptionMock2 = mock(InternalProvisionException.class);
        try (MockedStatic<InternalProvisionException> internalProvisionException = mockStatic(InternalProvisionException.class)) {
            doReturn(null).when(providerMock).get();
            doNothing().when(constructionContextMock).setProxyDelegates((Object) null);
            Object object = new Object();
            internalProvisionException.when(() -> InternalProvisionException.onNullInjectedIntoNonNullableDependency(eq(object), (Dependency) any())).thenAnswer((Answer<Void>) invocation -> null);
            RuntimeException runtimeException = new RuntimeException();
            internalProvisionException.when(() -> InternalProvisionException.errorInProvider(runtimeException)).thenReturn(internalProvisionExceptionMock);
            doThrow(internalProvisionExceptionMock2).when(internalProvisionExceptionMock).addSource(object);
            Object object2 = new Object();
            List list = new ArrayList<>();
            ProvisionListenerStackCallback provisionListenerStackCallback = new ProvisionListenerStackCallback(bindingMock, list);
            InternalFactoryToInitializableAdapter target = new InternalFactoryToInitializableAdapter(initializableMock2, object2, provisionListenerStackCallback);
            thrown.expect(InternalProvisionException.class);
            Dependency dependency = Dependency.get(keyMock);
            //Act Statement(s)
            target.provision(providerMock, dependency, constructionContextMock);
            //Assert statement(s)
            verify(providerMock).get();
            verify(constructionContextMock).setProxyDelegates((Object) null);
            internalProvisionException.verify(() -> InternalProvisionException.onNullInjectedIntoNonNullableDependency(eq(object), (Dependency) any()));
            internalProvisionException.verify(() -> InternalProvisionException.errorInProvider(runtimeException), atLeast(1));
            verify(internalProvisionExceptionMock).addSource(object);
        }
    }

    //Sapient generated method id: ${363d3698-f34c-39ad-914f-376a19498023}, hash: 82A7495EEFC0C43591955C0CF06F6335
    @Ignore()
    @Test()
    public void toStringTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        List list = new ArrayList<>();
        ProvisionListenerStackCallback provisionListenerStackCallback = new ProvisionListenerStackCallback(bindingMock, list);
        InternalFactoryToInitializableAdapter target = new InternalFactoryToInitializableAdapter(initializableMock2, object, provisionListenerStackCallback);
        //Act Statement(s)
        String result = target.toString();
        //Assert statement(s)
        assertThat(result, equalTo("<init>_initializable2"));
    }
}

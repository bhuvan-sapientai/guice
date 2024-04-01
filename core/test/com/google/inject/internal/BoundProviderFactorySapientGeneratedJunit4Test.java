package com.google.inject.internal;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.mockito.InjectMocks;
import org.junit.After;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.List;

import org.mockito.MockitoAnnotations;
import jakarta.inject.Provider;
import com.google.inject.Binding;

import java.util.ArrayList;

import com.google.inject.Key;
import org.mockito.stubbing.Answer;
import com.google.inject.spi.Dependency;
import org.mockito.MockedStatic;

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
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

import org.junit.Ignore;

public class BoundProviderFactorySapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final InjectorImpl injectorMock = mock(InjectorImpl.class, "some_value");

    private final InternalFactory<Provider<Object>> providerFactoryMock = mock(InternalFactory.class, "providerFactory");

    private AutoCloseable autoCloseableMocks;

    @InjectMocks()
    private BoundProviderFactory target;

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    @After()
    public void afterTest() throws Exception {
        if (autoCloseableMocks != null)
            autoCloseableMocks.close();
    }

    //Sapient generated method id: ${24131180-1b52-321d-8d94-bbb2fdf08388}, hash: EF03C179772AD1468ADC410745009996
    @Test()
    public void notifyTest() throws ErrorsException {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Errors errorsMock = mock(Errors.class);
        Object object = new Object();
        Errors errors = errorsMock.withSource(object);
        doReturn(errors).when(errorsMock).withSource(object);
        Key key = Key.get(Object.class);
        Object object2 = new Object();
        Binding bindingMock = mock(Binding.class);
        List list = new ArrayList<>();
        ProvisionListenerStackCallback provisionListenerStackCallback = new ProvisionListenerStackCallback(bindingMock, list);
        target = new BoundProviderFactory(injectorMock, key, object2, provisionListenerStackCallback);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        InternalFactory<Provider<Object>> internalFactoryMock = mock(InternalFactory.class);
        doReturn(internalFactoryMock).when(injectorMock).getInternalFactory((Key) any(), (Errors) any(), eq(InjectorImpl.JitLimitation.NEW_OR_EXISTING_JIT));
        //Act Statement(s)
        target.notify(errorsMock);
        //Assert statement(s)
        verify(errorsMock).withSource(object);
        verify(injectorMock).getInternalFactory((Key) any(), (Errors) any(), eq(InjectorImpl.JitLimitation.NEW_OR_EXISTING_JIT));
    }

    //Sapient generated method id: ${1fbd76da-f6c0-36a0-80b0-fd764cfa79dc}, hash: 78341F2E82A1F16F79085C1AD11F696E
    @Ignore()
    @Test()
    public void notifyWhenCaughtErrorsException() throws ErrorsException {
        /* Branches:
         * (catch-exception (ErrorsException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Errors errorsMock = mock(Errors.class);
        Object object = new Object();
        Errors errors = errorsMock.withSource(object);
        doReturn(errors).when(errorsMock).withSource(object);
        Errors errorsMock2 = mock(Errors.class);
        Errors errorsMock3 = mock(Errors.class);
        doReturn(errorsMock2).when(errorsMock).merge(errorsMock3);
        Key key = Key.get(Object.class);
        Object object2 = new Object();
        Binding bindingMock = mock(Binding.class);
        List list = new ArrayList<>();
        ProvisionListenerStackCallback provisionListenerStackCallback = new ProvisionListenerStackCallback(bindingMock, list);
        target = new BoundProviderFactory(injectorMock, key, object2, provisionListenerStackCallback);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        InternalFactory<Provider<Object>> internalFactoryMock = mock(InternalFactory.class);
        doReturn(internalFactoryMock).when(injectorMock).getInternalFactory((Key) any(), (Errors) any(), eq(InjectorImpl.JitLimitation.NEW_OR_EXISTING_JIT));
        //Act Statement(s)
        target.notify(errorsMock);
        //Assert statement(s)
        verify(errorsMock).withSource(object);
        verify(errorsMock).merge(errorsMock3);
        verify(injectorMock).getInternalFactory((Key) any(), (Errors) any(), eq(InjectorImpl.JitLimitation.NEW_OR_EXISTING_JIT));
    }

    //Sapient generated method id: ${9c25887d-767d-38e9-b5ae-c2e4012c49be}, hash: F3365E18123251E80BD2C6CE5A2F3FC6
    @Ignore()
    @Test()
    public void getTest() throws InternalProvisionException {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Key key = Key.get(Object.class);
        Object object = new Object();
        Binding bindingMock = mock(Binding.class);
        List list = new ArrayList<>();
        ProvisionListenerStackCallback provisionListenerStackCallback = new ProvisionListenerStackCallback(bindingMock, list);
        target = spy(new BoundProviderFactory(injectorMock, key, object, provisionListenerStackCallback));
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        Provider providerMock = mock(Provider.class);
        InternalContext internalContextMock = mock(InternalContext.class);
        doReturn(providerMock).when(providerFactoryMock).get(eq(internalContextMock), (Dependency) any(), eq(true));
        Object object2 = new Object();
        doReturn(object2).when(target).circularGet(eq(providerMock), eq(internalContextMock), (Dependency) any(), eq(provisionListenerStackCallback));
        Key key2Mock = mock(Key.class);
        Dependency dependency = Dependency.get(key2Mock);
        //Act Statement(s)
        Object result = target.get(internalContextMock, dependency, false);
        //Assert statement(s)
        assertThat(result, equalTo(object2));
        verify(providerFactoryMock).get(eq(internalContextMock), (Dependency) any(), eq(true));
        verify(target).circularGet(eq(providerMock), eq(internalContextMock), (Dependency) any(), eq(provisionListenerStackCallback));
    }

    //Sapient generated method id: ${06fe1158-3151-3d47-aefa-3b130b69f394}, hash: AD8C4F6ACEEDCDF42851C0636F11F125
    @Ignore()
    @Test()
    public void getWhenCaughtInternalProvisionExceptionThrowsInternalProvisionException() throws InternalProvisionException {
        /* Branches:
         * (catch-exception (InternalProvisionException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Key key = Key.get(Object.class);
        Object object = new Object();
        Binding bindingMock = mock(Binding.class);
        List list = new ArrayList<>();
        ProvisionListenerStackCallback provisionListenerStackCallback = new ProvisionListenerStackCallback(bindingMock, list);
        target = spy(new BoundProviderFactory(injectorMock, key, object, provisionListenerStackCallback));
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        Provider providerMock = mock(Provider.class);
        InternalContext internalContextMock = mock(InternalContext.class);
        doReturn(providerMock).when(providerFactoryMock).get(eq(internalContextMock), (Dependency) any(), eq(true));
        Object object2 = new Object();
        doReturn(object2).when(target).circularGet(eq(providerMock), eq(internalContextMock), (Dependency) any(), eq(provisionListenerStackCallback));
        thrown.expect(InternalProvisionException.class);
        Key key2Mock = mock(Key.class);
        Dependency dependency = Dependency.get(key2Mock);
        //Act Statement(s)
        target.get(internalContextMock, dependency, false);
        //Assert statement(s)
        verify(providerFactoryMock).get(eq(internalContextMock), (Dependency) any(), eq(true));
        verify(target).circularGet(eq(providerMock), eq(internalContextMock), (Dependency) any(), eq(provisionListenerStackCallback));
    }

    //Sapient generated method id: ${9d69d459-8b9e-363b-84ee-3df37ace1ef0}, hash: BB14F59F0EA27C326F026C0B36FCDDF2
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
        Provider<Object> providerMock = mock(Provider.class);
        ConstructionContext<Object> constructionContextMock = mock(ConstructionContext.class);
        Binding bindingMock = mock(Binding.class);
        Key key2Mock = mock(Key.class);
        try (MockedStatic<InternalProvisionException> internalProvisionException = mockStatic(InternalProvisionException.class)) {
            doReturn(null).when(providerMock).get();
            doNothing().when(constructionContextMock).setProxyDelegates((Object) null);
            Object object = new Object();
            internalProvisionException.when(() -> InternalProvisionException.onNullInjectedIntoNonNullableDependency(eq(object), (Dependency) any())).thenAnswer((Answer<Void>) invocation -> null);
            Key key = Key.get(Object.class);
            Object object2 = new Object();
            List list = new ArrayList<>();
            ProvisionListenerStackCallback provisionListenerStackCallback = new ProvisionListenerStackCallback(bindingMock, list);
            target = new BoundProviderFactory(injectorMock, key, object2, provisionListenerStackCallback);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            Dependency dependency = Dependency.get(key2Mock);
            //Act Statement(s)
            Object result = target.provision(providerMock, dependency, constructionContextMock);
            //Assert statement(s)
            assertThat(result, is(nullValue()));
            verify(providerMock).get();
            verify(constructionContextMock).setProxyDelegates((Object) null);
            internalProvisionException.verify(() -> InternalProvisionException.onNullInjectedIntoNonNullableDependency(eq(object), (Dependency) any()));
        }
    }

    //Sapient generated method id: ${aaee6b7e-4dda-3a6c-b2f6-74d7fd61056e}, hash: FA30F148C90DC49E382986DFA9FC8FFB
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
        Binding bindingMock = mock(Binding.class);
        Key key2Mock = mock(Key.class);
        try (MockedStatic<InternalProvisionException> internalProvisionException = mockStatic(InternalProvisionException.class)) {
            doReturn(null).when(providerMock).get();
            doNothing().when(constructionContextMock).setProxyDelegates((Object) null);
            Object object = new Object();
            internalProvisionException.when(() -> InternalProvisionException.onNullInjectedIntoNonNullableDependency(eq(object), (Dependency) any())).thenAnswer((Answer<Void>) invocation -> null);
            RuntimeException runtimeException = new RuntimeException();
            internalProvisionException.when(() -> InternalProvisionException.errorInProvider(runtimeException)).thenThrow(internalProvisionExceptionMock);
            Key key = Key.get(Object.class);
            Object object2 = new Object();
            List list = new ArrayList<>();
            ProvisionListenerStackCallback provisionListenerStackCallback = new ProvisionListenerStackCallback(bindingMock, list);
            target = new BoundProviderFactory(injectorMock, key, object2, provisionListenerStackCallback);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            thrown.expect(InternalProvisionException.class);
            Dependency dependency = Dependency.get(key2Mock);
            //Act Statement(s)
            target.provision(providerMock, dependency, constructionContextMock);
            //Assert statement(s)
            verify(providerMock).get();
            verify(constructionContextMock).setProxyDelegates((Object) null);
            internalProvisionException.verify(() -> InternalProvisionException.onNullInjectedIntoNonNullableDependency(eq(object), (Dependency) any()));
            internalProvisionException.verify(() -> InternalProvisionException.errorInProvider(runtimeException), atLeast(1));
        }
    }

    //Sapient generated method id: ${363d3698-f34c-39ad-914f-376a19498023}, hash: C27A9A7F04EE2448CE304684A6FB0EE2
    @Test()
    public void toStringTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Key key = Key.get(Object.class);
        Object object = new Object();
        Binding bindingMock = mock(Binding.class);
        List list = new ArrayList<>();
        ProvisionListenerStackCallback provisionListenerStackCallback = new ProvisionListenerStackCallback(bindingMock, list);
        target = new BoundProviderFactory(injectorMock, key, object, provisionListenerStackCallback);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.toString();
        //Assert statement(s)
        assertThat(result, equalTo("Key[type=java.lang.Object, annotation=[none]]"));
    }
}

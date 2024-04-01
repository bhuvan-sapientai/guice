package com.google.inject.internal;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.mockito.InjectMocks;
import org.junit.After;
import org.junit.Test;
import com.google.inject.spi.PrivateElements;
import org.mockito.MockitoAnnotations;
import com.google.inject.spi.Dependency;
import com.google.inject.Key;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;

import org.junit.Ignore;

public class ExposedKeyFactorySapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final PrivateElements privateElementsMock = mock(PrivateElements.class, "privateElements");

    private final BindingImpl<Object> delegateMock = mock(BindingImpl.class, "delegate");

    private AutoCloseable autoCloseableMocks;

    @InjectMocks()
    private ExposedKeyFactory target;

    @After()
    public void afterTest() throws Exception {
        if (autoCloseableMocks != null)
            autoCloseableMocks.close();
    }

    //Sapient generated method id: ${3f16f116-a121-33b2-ae1d-cac28c740321}, hash: 0ED453C86C7E789FD75D6FE832DBD1E0
    @Ignore()
    @Test()
    public void notifyWhenExplicitBindingGetInternalFactoryEqualsThis() {
        /* Branches:
         * (explicitBinding.getInternalFactory() == this) : true
         */
        //Arrange Statement(s)
        Errors errorsMock = mock(Errors.class);
        Errors errorsMock2 = mock(Errors.class);
        Object object = new Object();
        doReturn(errorsMock2).when(errorsMock).withSource(object);
        Errors errorsMock3 = mock(Errors.class);
        Key<Object> keyMock = mock(Key.class);
        doReturn(errorsMock3).when(errorsMock2).exposedButNotBound(keyMock);
        target = new ExposedKeyFactory(keyMock, privateElementsMock);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        InjectorImpl injectorImplMock = mock(InjectorImpl.class);
        doReturn(injectorImplMock).when(privateElementsMock).getInjector();
        InjectorBindingData injectorBindingDataMock = mock(InjectorBindingData.class);
        doReturn(injectorBindingDataMock).when(injectorImplMock).getBindingData();
        BindingImpl<Object> bindingImplMock = mock(BindingImpl.class);
        doReturn(bindingImplMock).when(injectorBindingDataMock).getExplicitBinding(keyMock);
        doReturn(null).when(bindingImplMock).getInternalFactory();
        doReturn(object).when(bindingImplMock).getSource();
        //Act Statement(s)
        target.notify(errorsMock);
        //Assert statement(s)
        verify(errorsMock).withSource(object);
        verify(errorsMock2).exposedButNotBound(keyMock);
        verify(privateElementsMock).getInjector();
        verify(injectorImplMock).getBindingData();
        verify(injectorBindingDataMock).getExplicitBinding(keyMock);
        verify(bindingImplMock).getInternalFactory();
        verify(bindingImplMock).getSource();
    }

    //Sapient generated method id: ${d8d7f540-8b46-3df9-964d-6c5927fc001c}, hash: 287C5585661B7CA61227CC376A5D4284
    @Ignore()
    @Test()
    public void notifyWhenExplicitBindingGetInternalFactoryNotEqualsThis() {
        /* Branches:
         * (explicitBinding.getInternalFactory() == this) : false
         */
        //Arrange Statement(s)
        Key<Object> keyMock = mock(Key.class);
        target = new ExposedKeyFactory(keyMock, privateElementsMock);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        InjectorImpl injectorImplMock = mock(InjectorImpl.class);
        doReturn(injectorImplMock).when(privateElementsMock).getInjector();
        InjectorBindingData injectorBindingDataMock = mock(InjectorBindingData.class);
        doReturn(injectorBindingDataMock).when(injectorImplMock).getBindingData();
        BindingImpl<Object> bindingImplMock = mock(BindingImpl.class);
        doReturn(bindingImplMock).when(injectorBindingDataMock).getExplicitBinding(keyMock);
        InternalFactory<Object> internalFactoryMock = mock(InternalFactory.class);
        doReturn(internalFactoryMock).when(bindingImplMock).getInternalFactory();
        Errors errorsMock = mock(Errors.class);
        //Act Statement(s)
        target.notify(errorsMock);
        //Assert statement(s)
        verify(privateElementsMock).getInjector();
        verify(injectorImplMock).getBindingData();
        verify(injectorBindingDataMock).getExplicitBinding(keyMock);
        verify(bindingImplMock).getInternalFactory();
    }

    //Sapient generated method id: ${9c25887d-767d-38e9-b5ae-c2e4012c49be}, hash: C3C850C1D7BC469144041C992D3DCADD
    @Ignore()
    @Test()
    public void getTest() throws InternalProvisionException {
        //Arrange Statement(s)
        Key<Object> keyMock = mock(Key.class);
        target = new ExposedKeyFactory(keyMock, privateElementsMock);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        InternalFactory<Object> internalFactoryMock = mock(InternalFactory.class);
        doReturn(internalFactoryMock).when(delegateMock).getInternalFactory();
        Object object = new Object();
        InternalContext internalContextMock = mock(InternalContext.class);
        Dependency dependencyMock = mock(Dependency.class);
        doReturn(object).when(internalFactoryMock).get(internalContextMock, dependencyMock, false);
        //Act Statement(s)
        Object result = target.get(internalContextMock, dependencyMock, false);
        //Assert statement(s)
        assertThat(result, equalTo(object));
        verify(delegateMock).getInternalFactory();
        verify(internalFactoryMock).get(internalContextMock, dependencyMock, false);
    }
}

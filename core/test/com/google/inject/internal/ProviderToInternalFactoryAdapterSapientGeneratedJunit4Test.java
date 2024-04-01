package com.google.inject.internal;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import com.google.inject.ProvisionException;
import com.google.inject.spi.Dependency;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;

import org.junit.Ignore;

public class ProviderToInternalFactoryAdapterSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final InjectorImpl injectorMock = mock(InjectorImpl.class, "injector");

    private final InternalFactory<Object> internalFactoryMock = mock(InternalFactory.class, "<init>_internalFactory1");

    private final Dependency dependencyMock = mock(Dependency.class);

    private final InternalContext internalContextMock = mock(InternalContext.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${9c25887d-767d-38e9-b5ae-c2e4012c49be}, hash: BFE31002BA541D12AAA5348E2016D445
    @Ignore()
    @Test()
    public void getTest() throws InternalProvisionException {
        //Arrange Statement(s)
        ProviderToInternalFactoryAdapter target = new ProviderToInternalFactoryAdapter(injectorMock, internalFactoryMock);
        doReturn(internalContextMock).when(injectorMock).enterContext();
        doReturn(dependencyMock).when(internalContextMock).getDependency();
        doNothing().when(internalContextMock).close();
        Object object = new Object();
        doReturn(object).when(internalFactoryMock).get(internalContextMock, dependencyMock, true);
        //Act Statement(s)
        Object result = target.get();
        //Assert statement(s)
        assertThat(result, equalTo(object));
        verify(injectorMock).enterContext();
        verify(internalContextMock).getDependency();
        verify(internalContextMock).close();
        verify(internalFactoryMock).get(internalContextMock, dependencyMock, true);
    }

    //Sapient generated method id: ${fdcbe85d-44dc-3d74-86a1-e4838cc1304c}, hash: B677F6793D9B0DE79287975549E08825
    @Ignore()
    @Test()
    public void getWhenCaughtInternalProvisionExceptionThrowsProvisionException() throws InternalProvisionException {
        /* Branches:
         * (catch-exception (InternalProvisionException)) : true
         */
        //Arrange Statement(s)
        ProviderToInternalFactoryAdapter target = new ProviderToInternalFactoryAdapter(injectorMock, internalFactoryMock);
        doReturn(internalContextMock).when(injectorMock).enterContext();
        doReturn(dependencyMock).when(internalContextMock).getDependency();
        InternalProvisionException internalProvisionExceptionMock = mock(InternalProvisionException.class);
        doThrow(internalProvisionExceptionMock).when(internalFactoryMock).get(internalContextMock, dependencyMock, true);
        ProvisionException provisionExceptionMock = mock(ProvisionException.class);
        doThrow(provisionExceptionMock).when(internalProvisionExceptionMock).toProvisionException();
        thrown.expect(ProvisionException.class);
        //Act Statement(s)
        target.get();
        //Assert statement(s)
        verify(injectorMock).enterContext();
        verify(internalContextMock).getDependency();
        verify(internalFactoryMock).get(internalContextMock, dependencyMock, true);
        verify(internalProvisionExceptionMock, atLeast(1)).toProvisionException();
    }

    //Sapient generated method id: ${363d3698-f34c-39ad-914f-376a19498023}, hash: 23E69231C7AEE07C67175C50D6C5A198
    @Ignore()
    @Test()
    public void toStringTest() {
        //Arrange Statement(s)
        ProviderToInternalFactoryAdapter target = new ProviderToInternalFactoryAdapter(injectorMock, internalFactoryMock);
        //Act Statement(s)
        String result = target.toString();
        //Assert statement(s)
        assertThat(result, equalTo("<init>_internalFactory1"));
    }
}

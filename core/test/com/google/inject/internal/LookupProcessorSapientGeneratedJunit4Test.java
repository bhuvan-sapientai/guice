package com.google.inject.internal;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.mockito.InjectMocks;
import org.junit.After;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import com.google.inject.spi.MembersInjectorLookup;
import com.google.inject.TypeLiteral;
import org.mockito.MockitoAnnotations;
import com.google.inject.Provider;
import com.google.inject.spi.Dependency;
import com.google.inject.spi.ProviderLookup;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;

public class LookupProcessorSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final InjectorImpl injectorMock = mock(InjectorImpl.class, "injector");

    private final Errors errorsMock = mock(Errors.class, "errors");

    private AutoCloseable autoCloseableMocks;

    @InjectMocks()
    private LookupProcessor target;

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    @After()
    public void afterTest() throws Exception {
        if (autoCloseableMocks != null)
            autoCloseableMocks.close();
    }

    //Sapient generated method id: ${16746c7e-3a2f-3c61-b771-51e0fa2a0c06}, hash: 5C577661AFB6621BD4A85222FB4F931C
    @Test()
    public void visit17ThrowsNullPointerException() throws ErrorsException {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        target = new LookupProcessor(errorsMock);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        thrown.expect(NullPointerException.class);
        Object object = new Object();
        TypeLiteral typeLiteralMock = mock(TypeLiteral.class);
        MembersInjectorLookup membersInjectorLookup = new MembersInjectorLookup(object, typeLiteralMock);
        //Act Statement(s)
        target.visit(membersInjectorLookup);
    }

    //Sapient generated method id: ${adb40cd6-6aac-3dd9-a66d-f45be774d602}, hash: F15BA310B4A527E23884AC8ECFA3792F
    @Test()
    public void visit18Test() throws ErrorsException {
        //Arrange Statement(s)
        ProviderLookup<Object> lookupMock = mock(ProviderLookup.class);
        Dependency dependencyMock = mock(Dependency.class);
        doReturn(dependencyMock).when(lookupMock).getDependency();
        Provider<Object> providerMock = mock(Provider.class);
        doNothing().when(lookupMock).initializeDelegate(providerMock);
        target = new LookupProcessor(errorsMock);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(providerMock).when(injectorMock).getProviderOrThrow(dependencyMock, errorsMock);
        InjectorBindingData injectorBindingDataMock = mock(InjectorBindingData.class);
        doReturn(injectorBindingDataMock).when(injectorMock).getBindingData();
        doNothing().when(injectorBindingDataMock).putProviderLookup(lookupMock);
        //Act Statement(s)
        Boolean result = target.visit(lookupMock);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
        verify(lookupMock).getDependency();
        verify(lookupMock).initializeDelegate(providerMock);
        verify(injectorMock).getProviderOrThrow(dependencyMock, errorsMock);
        verify(injectorMock).getBindingData();
        verify(injectorBindingDataMock).putProviderLookup(lookupMock);
    }

    //Sapient generated method id: ${da878c65-2fc5-3e4e-8d59-1ae38f418ebd}, hash: 2AA8E34227E63A2387CEDD266E4914BF
    @Test()
    public void visit18WhenCaughtErrorsException() throws ErrorsException {
        /* Branches:
         * (catch-exception (ErrorsException)) : true
         */
        //Arrange Statement(s)
        target = new LookupProcessor(errorsMock);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        Errors errorsMock2 = mock(Errors.class);
        ErrorsException errorsException = new ErrorsException(errorsMock2);
        Dependency dependencyMock = mock(Dependency.class);
        doThrow(errorsException).when(injectorMock).getProviderOrThrow(dependencyMock, errorsMock);
        Errors errorsMock3 = mock(Errors.class);
        doReturn(errorsMock3).when(errorsMock).merge(errorsMock2);
        Object object = new Object();
        ProviderLookup providerLookup = new ProviderLookup(object, dependencyMock);
        //Act Statement(s)
        Boolean result = target.visit(providerLookup);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
        verify(injectorMock).getProviderOrThrow(dependencyMock, errorsMock);
        verify(errorsMock).merge(errorsMock2);
    }
}

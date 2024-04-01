package com.google.inject.internal;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.mockito.stubbing.Answer;
import com.google.inject.Provider;
import com.google.inject.spi.Dependency;
import org.mockito.MockedStatic;
import com.google.inject.Key;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

import org.junit.Ignore;

public class InternalFactoryToProviderAdapterSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Provider<Object> providerMock = mock(Provider.class, "provider");

    private final InternalContext contextMock = mock(InternalContext.class);

    private final Key keyMock = mock(Key.class);

    private final Provider<Object> providerMock2 = mock(Provider.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${0c0d128a-bf3b-3877-9178-eedc363499a3}, hash: D088720C4849E52007EC4E1E6381F483
    @Ignore()
    @Test()
    public void getWhenDependencyNotIsNullable() throws InternalProvisionException {
        /* Branches:
         * (t == null) : true
         * (!dependency.isNullable()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<InternalProvisionException> internalProvisionException = mockStatic(InternalProvisionException.class)) {
            doNothing().when(contextMock).setDependency((Dependency) any());
            Object object = new Object();
            internalProvisionException.when(() -> InternalProvisionException.onNullInjectedIntoNonNullableDependency(eq(object), (Dependency) any())).thenAnswer((Answer<Void>) invocation -> null);
            Object object2 = new Object();
            InternalFactoryToProviderAdapter target = new InternalFactoryToProviderAdapter(providerMock2, object2);
            doReturn(null).when(providerMock).get();
            Dependency dependency = Dependency.get(keyMock);
            //Act Statement(s)
            Object result = target.get(contextMock, dependency, false);
            //Assert statement(s)
            assertThat(result, is(nullValue()));
            verify(contextMock).setDependency((Dependency) any());
            internalProvisionException.verify(() -> InternalProvisionException.onNullInjectedIntoNonNullableDependency(eq(object), (Dependency) any()));
            verify(providerMock).get();
        }
    }

    //Sapient generated method id: ${275b4d2a-62d5-35f8-a27e-3012fa22c0a7}, hash: 4D8FFB5B670A2D28887BF08F99ACBFFB
    @Ignore()
    @Test()
    public void getWhenDependencyNotIsNullableAndCaughtRuntimeExceptionThrowsInternalProvisionException() throws InternalProvisionException {
        /* Branches:
         * (t == null) : true
         * (!dependency.isNullable()) : true
         * (catch-exception (RuntimeException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        InternalProvisionException internalProvisionExceptionMock = mock(InternalProvisionException.class);
        InternalProvisionException internalProvisionExceptionMock2 = mock(InternalProvisionException.class);
        try (MockedStatic<InternalProvisionException> internalProvisionException = mockStatic(InternalProvisionException.class)) {
            doNothing().when(contextMock).setDependency((Dependency) any());
            Object object = new Object();
            internalProvisionException.when(() -> InternalProvisionException.onNullInjectedIntoNonNullableDependency(eq(object), (Dependency) any())).thenAnswer((Answer<Void>) invocation -> null);
            RuntimeException runtimeException = new RuntimeException();
            internalProvisionException.when(() -> InternalProvisionException.errorInProvider(runtimeException)).thenReturn(internalProvisionExceptionMock);
            doThrow(internalProvisionExceptionMock2).when(internalProvisionExceptionMock).addSource(object);
            Object object2 = new Object();
            InternalFactoryToProviderAdapter target = new InternalFactoryToProviderAdapter(providerMock2, object2);
            doReturn(null).when(providerMock).get();
            thrown.expect(InternalProvisionException.class);
            Dependency dependency = Dependency.get(keyMock);
            //Act Statement(s)
            target.get(contextMock, dependency, false);
            //Assert statement(s)
            verify(contextMock).setDependency((Dependency) any());
            internalProvisionException.verify(() -> InternalProvisionException.onNullInjectedIntoNonNullableDependency(eq(object), (Dependency) any()));
            internalProvisionException.verify(() -> InternalProvisionException.errorInProvider(runtimeException), atLeast(1));
            verify(internalProvisionExceptionMock).addSource(object);
            verify(providerMock).get();
        }
    }

    //Sapient generated method id: ${363d3698-f34c-39ad-914f-376a19498023}, hash: 1AC185627350D73D65581F8C9DAC8BF7
    @Ignore()
    @Test()
    public void toStringTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        InternalFactoryToProviderAdapter target = new InternalFactoryToProviderAdapter(providerMock2, object);
        //Act Statement(s)
        String result = target.toString();
        //Assert statement(s)
        assertThat(result, equalTo("<init>_provider2"));
    }
}

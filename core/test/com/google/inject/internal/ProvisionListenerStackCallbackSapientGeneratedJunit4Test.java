package com.google.inject.internal;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.List;

import com.google.inject.spi.ProvisionListener;
import org.mockito.MockedStatic;
import com.google.inject.Binding;

import java.util.ArrayList;

import com.google.inject.Key;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

import org.junit.Ignore;

public class ProvisionListenerStackCallbackSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Binding<Object> bindingMock = mock(Binding.class, "binding");

    private final InternalContext internalContextMock = mock(InternalContext.class);

    private final ProvisionListenerStackCallback.ProvisionCallback<Object> provisionListenerStackCallbackProvisionCallbackMock = mock(ProvisionListenerStackCallback.ProvisionCallback.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${178fe98a-8d5c-3f4f-9e58-6be2ab39a8b2}, hash: 0A5C9FFC2814111A399DAC50E4169F5B
    @Test()
    public void emptyListenerTest() {
        //Act Statement(s)
        ProvisionListenerStackCallback result = ProvisionListenerStackCallback.emptyListener();
        //Assert statement(s)
        //TODO: Please implement equals method in ProvisionListenerStackCallback for verification of the entire object or you need to adjust respective assertion statements
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${9ef55106-ad22-355b-9586-af18afeb1bfc}, hash: 2A22BD763A1F8B86B4B50A4C49E8D0CC
    @Test()
    public void hasListenersWhenListenersLengthNotGreaterThan0() {
        /* Branches:
         * (listeners.length > 0) : false
         */
        //Arrange Statement(s)
        List<ProvisionListener> provisionListenerList = new ArrayList<>();
        ProvisionListenerStackCallback<Object> target = new ProvisionListenerStackCallback(bindingMock, provisionListenerList);
        //Act Statement(s)
        boolean result = target.hasListeners();
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${58d99bbe-9da4-3442-8b79-8fa722cd98af}, hash: 6090DD5C89A1E90B0C2EE3BB6BDD0906
    @Test()
    public void provisionWhenProvisionExceptionDuringProvisionIsNotNullThrowsInternalProvisionException() throws InternalProvisionException {
        /* Branches:
         * (provision.exceptionDuringProvision != null) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: provision
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        List<ProvisionListener> provisionListenerList = new ArrayList<>();
        ProvisionListenerStackCallback<Object> target = new ProvisionListenerStackCallback(bindingMock, provisionListenerList);
        thrown.expect(InternalProvisionException.class);
        //Act Statement(s)
        target.provision(internalContextMock, provisionListenerStackCallbackProvisionCallbackMock);
    }

    //Sapient generated method id: ${231e6db6-4e35-3d03-912a-bcef5ff09464}, hash: 73CB612099C3552436A84E9141C30660
    @Test()
    public void provisionWhenCaughtRuntimeExceptionAndProvisionExceptionDuringProvisionIsNotNullThrowsInternalProvisionException() throws InternalProvisionException {
        /* Branches:
         * (catch-exception (RuntimeException)) : true
         * (provision.exceptionDuringProvision != null) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: provision
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        List<ProvisionListener> provisionListenerList = new ArrayList<>();
        ProvisionListenerStackCallback<Object> target = new ProvisionListenerStackCallback(bindingMock, provisionListenerList);
        thrown.expect(InternalProvisionException.class);
        //Act Statement(s)
        target.provision(internalContextMock, provisionListenerStackCallbackProvisionCallbackMock);
    }

    //Sapient generated method id: ${f5fba208-c985-312a-a64a-7015ddba230e}, hash: F396C5F74E20727DB8D491221124C3A7
    @Ignore()
    @Test()
    public void provisionWhenCaughtIsNull() throws InternalProvisionException {
        /* Branches:
         * (provision.exceptionDuringProvision != null) : false
         * (caught != null) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: provision
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        List<ProvisionListener> provisionListenerList = new ArrayList<>();
        ProvisionListenerStackCallback<Object> target = new ProvisionListenerStackCallback(bindingMock, provisionListenerList);
        //Act Statement(s)
        Object result = target.provision(internalContextMock, provisionListenerStackCallbackProvisionCallbackMock);
        //Assert statement(s)
        //TODO: Please implement equals method in Object for verification of the entire object or you need to adjust respective assertion statements
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${c579b26a-3a10-31bd-9b7d-688bfd9db7d8}, hash: 6F2E40A73C90E703CA8B83820D386AF8
    @Ignore()
    @Test()
    public void provisionWhenProvisionExceptionDuringProvisionIsNullAndCaughtIsNull() throws InternalProvisionException {
        /* Branches:
         * (catch-exception (RuntimeException)) : true
         * (provision.exceptionDuringProvision != null) : false
         * (caught != null) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: provision
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        List<ProvisionListener> provisionListenerList = new ArrayList<>();
        ProvisionListenerStackCallback<Object> target = new ProvisionListenerStackCallback(bindingMock, provisionListenerList);
        //Act Statement(s)
        Object result = target.provision(internalContextMock, provisionListenerStackCallbackProvisionCallbackMock);
        //Assert statement(s)
        //TODO: Please implement equals method in Object for verification of the entire object or you need to adjust respective assertion statements
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${1759d6e0-d92a-31b5-ba1a-23724e82146f}, hash: 150CF9DEDEF4873284CEFB83E7ED74B3
    @Ignore()
    @Test()
    public void provisionWhenProvisionErredListenerIsNotNullThrowsInternalProvisionException() throws InternalProvisionException {
        /* Branches:
         * (catch-exception (RuntimeException)) : true
         * (provision.exceptionDuringProvision != null) : false
         * (caught != null) : true
         * (provision.erredListener != null) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: provision
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        InternalProvisionException internalProvisionExceptionMock = mock(InternalProvisionException.class);
        Key keyMock = mock(Key.class);
        try (MockedStatic<InternalProvisionException> internalProvisionException = mockStatic(InternalProvisionException.class)) {
            RuntimeException runtimeException = new RuntimeException();
            Object[] objectArray = new Object[]{ProvisionListener.class, keyMock, runtimeException};
            internalProvisionException.when(() -> InternalProvisionException.errorInUserCode(ErrorId.OTHER, runtimeException, "Error notifying ProvisionListener %s of %s.\n Reason: %s", objectArray)).thenThrow(internalProvisionExceptionMock);
            List<ProvisionListener> provisionListenerList = new ArrayList<>();
            ProvisionListenerStackCallback<Object> target = new ProvisionListenerStackCallback(bindingMock, provisionListenerList);
            doReturn(keyMock).when(bindingMock).getKey();
            thrown.expect(InternalProvisionException.class);
            //Act Statement(s)
            target.provision(internalContextMock, provisionListenerStackCallbackProvisionCallbackMock);
            //Assert statement(s)
            internalProvisionException.verify(() -> InternalProvisionException.errorInUserCode(ErrorId.OTHER, runtimeException, "Error notifying ProvisionListener %s of %s.\n Reason: %s", objectArray), atLeast(1));
            verify(bindingMock).getKey();
        }
    }
}

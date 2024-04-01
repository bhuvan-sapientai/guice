package com.google.inject.internal;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.util.List;

import com.google.inject.Binding;

import java.util.ArrayList;

import com.google.inject.Key;
import com.google.inject.spi.ProvisionListenerBinding;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.hamcrest.Matchers.is;

import org.junit.Ignore;

public class ProvisionListenerCallbackStoreSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Binding<Object> bindingMock = mock(Binding.class);

    private final Key keyMock = mock(Key.class);

    private final Key keyMock2 = mock(Key.class);

    //Sapient generated method id: ${0f081d7b-38fd-34fe-89fd-7e9e73b7455d}, hash: BC39B63BF5582F8164F863DC096C85C5
    @Ignore()
    @Test()
    public void getWhenINTERNAL_BINDINGSContainsBindingGetKey() {
        /* Branches:
         * (!INTERNAL_BINDINGS.contains(binding.getKey())) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: INTERNAL_BINDINGS, object of type CacheBuilder
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn(keyMock).when(bindingMock).getKey();
        List<ProvisionListenerBinding> provisionListenerBindingList = new ArrayList<>();
        ProvisionListenerCallbackStore target = new ProvisionListenerCallbackStore(provisionListenerBindingList);
        //Act Statement(s)
        ProvisionListenerStackCallback result = target.get(bindingMock);
        //Assert statement(s)
        assertThat(result, is(nullValue()));
        verify(bindingMock).getKey();
    }

    //Sapient generated method id: ${c531ead8-506e-32f2-897d-f94220bd5989}, hash: 26824F2199E1E5A865E98FA48CBC031A
    @Ignore()
    @Test()
    public void getWhenCallbackHasListeners() {
        /* Branches:
         * (!INTERNAL_BINDINGS.contains(binding.getKey())) : true
         * (callback.hasListeners()) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: cache, INTERNAL_BINDINGS, object of type CacheBuilder
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        doReturn(keyMock, keyMock2).when(bindingMock).getKey();
        List<ProvisionListenerBinding> provisionListenerBindingList = new ArrayList<>();
        ProvisionListenerCallbackStore target = new ProvisionListenerCallbackStore(provisionListenerBindingList);
        //Act Statement(s)
        ProvisionListenerStackCallback result = target.get(bindingMock);
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
        verify(bindingMock, times(2)).getKey();
    }

    //Sapient generated method id: ${f8274cb8-0fa6-3ad0-8c23-442fe189b5f6}, hash: 2CB3F35B2632FA3367ADEA8B8D3374D0
    @Test()
    public void getWhenCallbackNotHasListeners() {
        /* Branches:
         * (!INTERNAL_BINDINGS.contains(binding.getKey())) : true
         * (callback.hasListeners()) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: cache, INTERNAL_BINDINGS, object of type CacheBuilder
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        doReturn(keyMock, keyMock2).when(bindingMock).getKey();
        List<ProvisionListenerBinding> provisionListenerBindingList = new ArrayList<>();
        ProvisionListenerCallbackStore target = new ProvisionListenerCallbackStore(provisionListenerBindingList);
        //Act Statement(s)
        ProvisionListenerStackCallback result = target.get(bindingMock);
        //Assert statement(s)
        assertThat(result, is(nullValue()));
        verify(bindingMock, times(2)).getKey();
    }

    //Sapient generated method id: ${08db0b87-0cd9-33db-b875-3522bd2f3b65}, hash: 3120AD795ED7D237C9747B7E187D1419
    @Ignore()
    @Test()
    public void removeWhenCacheAsMapRemoveTypeIsNotNull() {
        /* Branches:
         * (cache.asMap().remove(type) != null) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: cache, object of type CacheBuilder
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        List<ProvisionListenerBinding> provisionListenerBindingList = new ArrayList<>();
        ProvisionListenerCallbackStore target = new ProvisionListenerCallbackStore(provisionListenerBindingList);
        Binding bindingMock = mock(Binding.class);
        //Act Statement(s)
        boolean result = target.remove(bindingMock);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
    }

    //Sapient generated method id: ${ca8eea7f-76ac-3d33-96d0-6a90d47e4d00}, hash: CABF7A70135E4FBE65DFFF1EFB0E7066
    @Test()
    public void removeWhenCacheAsMapRemoveTypeIsNull() {
        /* Branches:
         * (cache.asMap().remove(type) != null) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: cache, object of type CacheBuilder
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        List<ProvisionListenerBinding> provisionListenerBindingList = new ArrayList<>();
        ProvisionListenerCallbackStore target = new ProvisionListenerCallbackStore(provisionListenerBindingList);
        Binding bindingMock = mock(Binding.class);
        //Act Statement(s)
        boolean result = target.remove(bindingMock);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }
}

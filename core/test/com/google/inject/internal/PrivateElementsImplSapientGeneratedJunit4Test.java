package com.google.inject.internal;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.mockito.InjectMocks;
import org.junit.After;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.List;

import org.mockito.MockitoAnnotations;
import com.google.inject.spi.Element;
import com.google.inject.Injector;

import java.util.HashSet;

import com.google.common.collect.ImmutableSet;

import java.util.ArrayList;

import com.google.inject.Key;
import com.google.inject.spi.ElementVisitor;
import com.google.common.collect.ImmutableList;

import java.util.Set;

import com.google.common.collect.ImmutableMap;
import com.google.inject.PrivateBinder;
import com.google.inject.Binder;

import static org.mockito.Mockito.doNothing;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

import org.junit.Ignore;

public class PrivateElementsImplSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final ImmutableMap exposedKeysToSourcesMock = mock(ImmutableMap.class, "exposedKeysToSources");

    private AutoCloseable autoCloseableMocks;

    @InjectMocks()
    private PrivateElementsImpl target;

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    @After()
    public void afterTest() throws Exception {
        if (autoCloseableMocks != null)
            autoCloseableMocks.close();
    }

    //Sapient generated method id: ${84d7d6d7-b237-38a6-96a5-440c92daaa5a}, hash: 9B11C19DE63765FF2979E1C3AA05F531
    @Test()
    public void getElementsWhenElementsIsNull() {
        /* Branches:
         * (elements == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        target = new PrivateElementsImpl(object);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        List<Element> result = target.getElements();
        ArrayList<Element> elementList2 = new ArrayList<>();
        ImmutableList<Element> elementList = ImmutableList.copyOf(elementList2);
        //Assert statement(s)
        assertThat(result, equalTo(elementList));
        assertThat(target.getElementsMutable(), is(nullValue()));
    }

    //Sapient generated method id: ${e95fbc8f-13cc-37f9-b850-963df68174a2}, hash: D53A8CE6F527C3D8B82EFF6D8E072508
    @Test()
    public void initInjectorWhenThisInjectorIsNull() {
        /* Branches:
         * (this.injector == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        target = new PrivateElementsImpl(object);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        Injector injectorMock = mock(Injector.class, "valid_injector_value");
        //Act Statement(s)
        target.initInjector(injectorMock);
        //Assert statement(s)
        assertThat(target.getInjector(), is(notNullValue()));
    }

    //Sapient generated method id: ${d8396be2-350e-3a01-a8f7-ba0ca571f5af}, hash: B04853EA54EFEBC0B1522CE038FBBE1D
    @Test()
    public void getExposedKeysWhenExposureBuildersIsEmpty() {
        /* Branches:
         * (exposedKeysToSources == null) : true
         * (for-each(exposureBuilders)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        target = new PrivateElementsImpl(object);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        ImmutableSet immutableSet = ImmutableSet.of();
        doReturn(immutableSet).when(exposedKeysToSourcesMock).keySet();
        //Act Statement(s)
        Set<Key<?>> result = target.getExposedKeys();
        //Assert statement(s)
        assertThat(result, equalTo(immutableSet));
        verify(exposedKeysToSourcesMock).keySet();
    }

    //Sapient generated method id: ${85010207-16d2-3170-b836-208737cec5b9}, hash: 98C85C8BE9CD1F94F421F19AE03E71FE
    @Ignore()
    @Test()
    public void acceptVisitorTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        target = new PrivateElementsImpl(object);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        ElementVisitor<Object> visitorMock = mock(ElementVisitor.class, "Object");
        Object object2 = new Object();
        doReturn(object2).when(visitorMock).visit(target);
        //Act Statement(s)
        Object result = target.acceptVisitor(visitorMock);
        //Assert statement(s)
        assertThat(result, equalTo(object2));
        verify(visitorMock).visit(target);
    }

    //Sapient generated method id: ${de2cb11d-c6d7-36be-8061-2d03393c560a}, hash: 49FCAE15CA6DB23A267A0C0C79EFCAA2
    @Test()
    public void addExposureBuilderTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        target = new PrivateElementsImpl(object);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        Binder binderMock = mock(Binder.class);
        Object object2 = new Object();
        Key keyMock = mock(Key.class);
        ExposureBuilder exposureBuilder = new ExposureBuilder(binderMock, object2, keyMock);
        //Act Statement(s)
        target.addExposureBuilder(exposureBuilder);
    }

    //Sapient generated method id: ${26d5a84b-6b8d-3b9d-9271-de13f6740746}, hash: B7CBD801F52258A530989EA4773997E2
    @Ignore()
    @Test()
    public void applyToWhenExposedKeysToSourcesEntrySetIsNotEmpty() {
        /* Branches:
         * (for-each(getElements())) : true
         * (for-each(exposedKeysToSources.entrySet())) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Binder binderMock = mock(Binder.class, "Binder");
        Binder binderMock2 = mock(Binder.class);
        Object object = new Object();
        doReturn(binderMock2).when(binderMock).withSource(object);
        PrivateBinder privateBinderMock = mock(PrivateBinder.class);
        doReturn(privateBinderMock).when(binderMock2).newPrivateBinder();
        PrivateBinder privateBinderMock2 = mock(PrivateBinder.class);
        Object object2 = new Object();
        doReturn(privateBinderMock2).when(privateBinderMock).withSource(object2);
        Key keyMock = mock(Key.class);
        doNothing().when(privateBinderMock2).expose(keyMock);
        Object object3 = new Object();
        target = spy(new PrivateElementsImpl(object3));
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        Element elementMock = mock(Element.class);
        List<Element> elementList = new ArrayList<>();
        elementList.add(elementMock);
        doReturn(elementList).when(target).getElements();
        doNothing().when(elementMock).applyTo(privateBinderMock);
        Set<Key<?>> anySet = new HashSet<>();
        doReturn(anySet).when(target).getExposedKeys();
        ImmutableMap exposedKeysToSourcesMock2 = mock(ImmutableMap.class);
        ImmutableSet immutableSet = ImmutableSet.of();
        doReturn(immutableSet).when(exposedKeysToSourcesMock2).entrySet();
        //Act Statement(s)
        target.applyTo(binderMock);
        //Assert statement(s)
        verify(binderMock).withSource(object);
        verify(binderMock2).newPrivateBinder();
        verify(privateBinderMock).withSource(object2);
        verify(privateBinderMock2).expose(keyMock);
        verify(target).getElements();
        verify(elementMock).applyTo(privateBinderMock);
        verify(target).getExposedKeys();
        verify(exposedKeysToSourcesMock2).entrySet();
    }

    //Sapient generated method id: ${31c50362-16a2-3c8a-988f-dcf9bbacebf0}, hash: D8630D7FE21296ADF926A699C11D9EF9
    @Ignore()
    @Test()
    public void getExposedSourceWhenSourceIsNotNull() {
        /* Branches:
         * (source != null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        target = spy(new PrivateElementsImpl(object));
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        Set<Key<?>> anySet = new HashSet<>();
        doReturn(anySet).when(target).getExposedKeys();
        ImmutableMap exposedKeysToSourcesMock2 = mock(ImmutableMap.class);
        Object object2 = new Object();
        doReturn(object2).when(exposedKeysToSourcesMock2).get((Key) any());
        Key key = Key.get(Object.class);
        //Act Statement(s)
        Object result = target.getExposedSource(key);
        //Assert statement(s)
        assertThat(result, equalTo(object2));
        verify(target).getExposedKeys();
        verify(exposedKeysToSourcesMock2).get((Key) any());
    }

    //Sapient generated method id: ${271cbd1a-c9f1-3b76-9494-8973bcc204c8}, hash: 2E4677A9958311BBF99C657B9DD28B7B
    @Ignore()
    @Test()
    public void getExposedSourceWhenSourceIsNullThrowsIllegalArgumentException() {
        /* Branches:
         * (source != null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        target = spy(new PrivateElementsImpl(object));
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        Set<Key<?>> anySet = new HashSet<>();
        doReturn(anySet).when(target).getExposedKeys();
        ImmutableMap exposedKeysToSourcesMock2 = mock(ImmutableMap.class);
        doReturn(null).when(exposedKeysToSourcesMock2).get((Key) any());
        thrown.expect(IllegalArgumentException.class);
        Key key = Key.get(Object.class);
        //Act Statement(s)
        target.getExposedSource(key);
        //Assert statement(s)
        verify(target).getExposedKeys();
        verify(exposedKeysToSourcesMock2).get((Key) any());
    }

    //Sapient generated method id: ${363d3698-f34c-39ad-914f-376a19498023}, hash: 3E2B2A1EE22468107E5937010E2AE45E
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
        Object object = new Object();
        target = spy(new PrivateElementsImpl(object));
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        Set<Key<?>> anySet = new HashSet<>();
        doReturn(anySet).when(target).getExposedKeys();
        //Act Statement(s)
        String result = target.toString();
        //Assert statement(s)
        assertThat(result, equalTo("result1"));
        verify(target).getExposedKeys();
    }
}

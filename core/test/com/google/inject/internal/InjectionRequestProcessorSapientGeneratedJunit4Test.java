package com.google.inject.internal;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.mockito.InjectMocks;
import org.junit.After;
import org.junit.Test;
import com.google.inject.ConfigurationException;
import com.google.inject.spi.InjectionRequest;
import com.google.inject.spi.Message;
import com.google.inject.TypeLiteral;
import org.mockito.MockitoAnnotations;

import java.util.Set;
import java.util.HashSet;
import java.util.Collection;
import java.util.ArrayList;

import com.google.inject.spi.InjectionPoint;
import com.google.inject.spi.StaticInjectionRequest;

import static org.mockito.Mockito.doNothing;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;

public class InjectionRequestProcessorSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final InjectorImpl injectorMock = mock(InjectorImpl.class, "injector");

    private final Initializer initializerMock = mock(Initializer.class, "initializer");

    private final Errors errorsMock = mock(Errors.class, "errors");

    private AutoCloseable autoCloseableMocks;

    @InjectMocks()
    private InjectionRequestProcessor target;

    @After()
    public void afterTest() throws Exception {
        if (autoCloseableMocks != null)
            autoCloseableMocks.close();
    }

    //Sapient generated method id: ${3aac8d70-6d26-35c3-a38b-c3a6cac3b6bc}, hash: 51E7DA7D94FFD3325AA833A46925005A
    @Test()
    public void visit17Test() {
        //Arrange Statement(s)
        Errors errors = new Errors();
        target = new InjectionRequestProcessor(errors, initializerMock);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        InjectorBindingData injectorBindingDataMock = mock(InjectorBindingData.class);
        doReturn(injectorBindingDataMock).when(injectorMock).getBindingData();
        StaticInjectionRequest staticInjectionRequestMock = mock(StaticInjectionRequest.class);
        doNothing().when(injectorBindingDataMock).putStaticInjectionRequest(staticInjectionRequestMock);

        //Act Statement(s)
        Boolean result = target.visit(staticInjectionRequestMock);

        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
        verify(injectorMock).getBindingData();
        verify(injectorBindingDataMock).putStaticInjectionRequest(staticInjectionRequestMock);
    }

    //Sapient generated method id: ${adb40cd6-6aac-3dd9-a66d-f45be774d602}, hash: AD0BAFF62A762631C8076677106FCA8C
    @Test()
    public void visit18Test() throws ConfigurationException {
        //Arrange Statement(s)
        InjectionRequest requestMock = mock(InjectionRequest.class);
        Set<InjectionPoint> injectionPointSet = new HashSet<>();
        doReturn(injectionPointSet).when(requestMock).getInjectionPoints();
        TypeLiteral typeLiteralMock = mock(TypeLiteral.class);
        Object object = new Object();
        doReturn(object).when(requestMock).getInstance();
        Object object2 = new Object();
        Object object3 = new Object();
        doReturn(object2, object3).when(requestMock).getSource();
        TypeLiteral typeLiteralMock2 = mock(TypeLiteral.class);
        doReturn(typeLiteralMock, typeLiteralMock2).when(requestMock).getType();
        target = new InjectionRequestProcessor(errorsMock, initializerMock);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        Initializable<Object> initializableMock = mock(Initializable.class);
        doReturn(initializableMock).when(initializerMock).requestInjection(injectorMock, typeLiteralMock, object, null, object2, injectionPointSet, errorsMock);
        InjectorBindingData injectorBindingDataMock = mock(InjectorBindingData.class);
        doReturn(injectorBindingDataMock).when(injectorMock).getBindingData();
        doNothing().when(injectorBindingDataMock).putInjectionRequest((InjectionRequest) any());

        //Act Statement(s)
        Boolean result = target.visit(requestMock);

        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
        verify(requestMock).getInjectionPoints();
        verify(requestMock, times(2)).getType();
        verify(requestMock).getInstance();
        verify(requestMock, times(2)).getSource();
        verify(initializerMock).requestInjection(injectorMock, typeLiteralMock, object, null, object2, injectionPointSet, errorsMock);
        verify(injectorMock).getBindingData();
        verify(injectorBindingDataMock).putInjectionRequest((InjectionRequest) any());
    }

    //Sapient generated method id: ${932f1a72-3bff-3178-ba42-43dc9c820ff3}, hash: ACB32FAD9F20720A90BE54CC077D15FF
    @Test()
    public void visit18WhenCaughtConfigurationException() throws ConfigurationException {
        /* Branches:
         * (catch-exception (ConfigurationException)) : true
         */
        //Arrange Statement(s)
        InjectionRequest requestMock = mock(InjectionRequest.class);
        ConfigurationException configurationExceptionMock = mock(ConfigurationException.class);
        doThrow(configurationExceptionMock).when(requestMock).getInjectionPoints();
        Collection<Message> collection = new ArrayList<>();
        doReturn(collection).when(configurationExceptionMock).getErrorMessages();
        Set set = new HashSet<>();
        doReturn(set).when(configurationExceptionMock).getPartialValue();
        TypeLiteral typeLiteralMock = mock(TypeLiteral.class);
        Object object = new Object();
        doReturn(object).when(requestMock).getInstance();
        Object object2 = new Object();
        Object object3 = new Object();
        doReturn(object2, object3).when(requestMock).getSource();
        TypeLiteral typeLiteralMock2 = mock(TypeLiteral.class);
        doReturn(typeLiteralMock, typeLiteralMock2).when(requestMock).getType();
        target = new InjectionRequestProcessor(errorsMock, initializerMock);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        Errors errorsMock2 = mock(Errors.class);
        doReturn(errorsMock2).when(errorsMock).merge(collection);
        Initializable<Object> initializableMock = mock(Initializable.class);
        doReturn(initializableMock).when(initializerMock).requestInjection(injectorMock, typeLiteralMock, object, null, object2, set, errorsMock);
        InjectorBindingData injectorBindingDataMock = mock(InjectorBindingData.class);
        doReturn(injectorBindingDataMock).when(injectorMock).getBindingData();
        doNothing().when(injectorBindingDataMock).putInjectionRequest((InjectionRequest) any());

        //Act Statement(s)
        Boolean result = target.visit(requestMock);

        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
        verify(requestMock).getInjectionPoints();
        verify(configurationExceptionMock, atLeast(1)).getErrorMessages();
        verify(configurationExceptionMock, atLeast(1)).getPartialValue();
        verify(requestMock, times(2)).getType();
        verify(requestMock).getInstance();
        verify(requestMock, times(2)).getSource();
        verify(errorsMock).merge(collection);
        verify(initializerMock).requestInjection(injectorMock, typeLiteralMock, object, null, object2, set, errorsMock);
        verify(injectorMock).getBindingData();
        verify(injectorBindingDataMock).putInjectionRequest((InjectionRequest) any());
    }

    //Sapient generated method id: ${bf0ce60b-5bdc-3751-babd-9b6f326995af}, hash: BA4B9363382EE72BA29D53F650471498
    @Test()
    public void validateWhenStaticInjectionsIsEmpty() {
        /* Branches:
         * (for-each(staticInjections)) : false
         */
        //Arrange Statement(s)
        target = new InjectionRequestProcessor(errorsMock, initializerMock);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);

        //Act Statement(s)
        target.validate();
    }

    //Sapient generated method id: ${bbc465ec-1610-3a11-ab80-5e1475feabbd}, hash: 63E2F6065662D90FD375A309CCA33940
    @Test()
    public void injectMembersWhenStaticInjectionsIsEmpty() {
        /* Branches:
         * (for-each(staticInjections)) : false
         */
        //Arrange Statement(s)
        target = new InjectionRequestProcessor(errorsMock, initializerMock);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);

        //Act Statement(s)
        target.injectMembers();
    }
}

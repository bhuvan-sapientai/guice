package com.google.inject.internal;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;

import org.junit.rules.ExpectedException;

import java.util.List;
import java.util.HashSet;

import com.google.inject.Binding;

import java.util.ArrayList;

import com.google.inject.Key;

import java.lang.reflect.Constructor;

import com.google.inject.TypeLiteral;

import java.util.Set;

import com.google.inject.spi.Dependency;
import org.mockito.MockedStatic;
import com.google.inject.spi.InjectionPoint;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.hamcrest.Matchers.is;

import org.junit.Ignore;

public class ConstructorInjectorSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final ConstructionProxy<java.lang.Object> constructionProxyMock = mock(ConstructionProxy.class, "constructionProxy");

    private final ConstructionContext<java.lang.Object> constructionContextMock = mock(ConstructionContext.class);

    private final Constructor constructorMock = mock(Constructor.class);

    private final InternalContext contextMock = mock(InternalContext.class);

    private final Dependency dependencyMock = mock(Dependency.class);

    private final InjectorImpl.InjectorOptions injectorImplInjectorOptionsMock = mock(InjectorImpl.InjectorOptions.class);

    private final InternalContext internalContextMock = mock(InternalContext.class);

    private final Key keyMock = mock(Key.class);

    private final MembersInjectorImpl<java.lang.Object> localMembersInjectorMock = mock(MembersInjectorImpl.class);

    private final MembersInjectorImpl<java.lang.Object> membersInjectorImplMock = mock(MembersInjectorImpl.class);

    private final ProvisionListenerStackCallback<java.lang.Object> provisionListenerStackCallbackMock = mock(ProvisionListenerStackCallback.class);

    private final TypeLiteral typeLiteralMock = mock(TypeLiteral.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${49f22cac-3604-3497-90db-d26edb0e7397}, hash: DCD02567C05D90BE46F869ECA4B0F33A
    @Test()
    public void constructWhenConstructionContextIsConstructing() throws InternalProvisionException, InvocationTargetException {
        /* Branches:
         * (constructionContext.isConstructing()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn(injectorImplInjectorOptionsMock).when(contextMock).getInjectorOptions();
        doReturn(typeLiteralMock).when(keyMock).getTypeLiteral();
        doReturn(Object.class).when(typeLiteralMock).getRawType();
        Set<InjectionPoint> injectionPointSet = new HashSet<>();
        SingleParameterInjector<?>[] singleParameterInjectorArray = new SingleParameterInjector[]{};
        ConstructorInjector<java.lang.Object> target = new ConstructorInjector(injectionPointSet, constructionProxyMock, singleParameterInjectorArray, membersInjectorImplMock);
        doReturn(constructionContextMock).when(contextMock).getConstructionContext(target);
        doReturn(true).when(constructionContextMock).isConstructing();
        java.lang.Object object = new java.lang.Object();
        doReturn(object).when(constructionContextMock).createProxy(injectorImplInjectorOptionsMock, java.lang.Object.class);
        Dependency dependency = Dependency.get(keyMock);
        //Act Statement(s)
        java.lang.Object result = target.construct(contextMock, dependency, provisionListenerStackCallbackMock);
        //Assert statement(s)
        assertThat(result, equalTo(object));
        verify(contextMock).getInjectorOptions();
        verify(keyMock).getTypeLiteral();
        verify(typeLiteralMock).getRawType();
        verify(contextMock).getConstructionContext(target);
        verify(constructionContextMock).isConstructing();
        verify(constructionContextMock).createProxy(injectorImplInjectorOptionsMock, java.lang.Object.class);
    }

    //Sapient generated method id: ${4d517ada-89b7-3a9e-9289-6ee0971952e5}, hash: F273C0D0DD99D49493C6E61964D4030A
    @Test()
    public void constructWhenContextGetInjectorOptionsNotDisableCircularProxies() throws InternalProvisionException, InvocationTargetException {
        /* Branches:
         * (constructionContext.isConstructing()) : false
         * (t != null) : true
         * (context.getInjectorOptions().disableCircularProxies) : false
         */
        //Arrange Statement(s)
        doReturn(injectorImplInjectorOptionsMock).when(contextMock).getInjectorOptions();
        Set<InjectionPoint> injectionPointSet = new HashSet<>();
        SingleParameterInjector<?>[] singleParameterInjectorArray = new SingleParameterInjector[]{};
        ConstructorInjector<java.lang.Object> target = new ConstructorInjector(injectionPointSet, constructionProxyMock, singleParameterInjectorArray, membersInjectorImplMock);
        doReturn(constructionContextMock).when(contextMock).getConstructionContext(target);
        doReturn(false).when(constructionContextMock).isConstructing();
        java.lang.Object object = new java.lang.Object();
        doReturn(object).when(constructionContextMock).getCurrentReference();
        //Act Statement(s)
        java.lang.Object result = target.construct(contextMock, dependencyMock, provisionListenerStackCallbackMock);
        //Assert statement(s)
        assertThat(result, equalTo(object));
        verify(contextMock).getInjectorOptions();
        verify(contextMock).getConstructionContext(target);
        verify(constructionContextMock).isConstructing();
        verify(constructionContextMock).getCurrentReference();
    }

    //Sapient generated method id: ${5518bfd1-919d-3a21-9890-4da022deb59b}, hash: C1206064BF3927902F6FE2BA1FE64531
    @Ignore()
    @Test()
    public void constructWhenProvisionCallbackIsNull() throws InternalProvisionException, InvocationTargetException {
        /* Branches:
         * (constructionContext.isConstructing()) : false
         * (t != null) : false
         * (provisionCallback == null) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<SingleParameterInjector> singleParameterInjector = mockStatic(SingleParameterInjector.class)) {
            java.lang.Object object = new java.lang.Object();
            doNothing().when(localMembersInjectorMock).injectMembers(object, internalContextMock, false);
            doNothing().when(localMembersInjectorMock).notifyListeners(object);
            java.lang.Object[] objectArray = new java.lang.Object[]{};
            SingleParameterInjector<?>[] singleParameterInjectorArray = new SingleParameterInjector[]{};
            singleParameterInjector.when(() -> SingleParameterInjector.getAll(internalContextMock, singleParameterInjectorArray)).thenReturn(objectArray);
            Set<InjectionPoint> injectionPointSet = new HashSet<>();
            ConstructorInjector<java.lang.Object> target = new ConstructorInjector(injectionPointSet, constructionProxyMock, singleParameterInjectorArray, localMembersInjectorMock);
            doReturn(object).when(constructionProxyMock).newInstance(objectArray);
            doReturn(constructionContextMock).when(internalContextMock).getConstructionContext(target);
            doReturn(false).when(constructionContextMock).isConstructing();
            doReturn(null).when(constructionContextMock).getCurrentReference();
            doNothing().when(constructionContextMock).startConstruction();
            doNothing().when(constructionContextMock).setProxyDelegates(object);
            doNothing().when(constructionContextMock).finishConstruction();
            doNothing().when(constructionContextMock).setCurrentReference(object);
            doNothing().when(constructionContextMock).removeCurrentReference();
            ProvisionListenerStackCallback<java.lang.Object> provisionListenerStackCallback = null;
            //Act Statement(s)
            java.lang.Object result = target.construct(internalContextMock, dependencyMock, provisionListenerStackCallback);
            //Assert statement(s)
            assertThat(result, equalTo(object));
            verify(localMembersInjectorMock).injectMembers(object, internalContextMock, false);
            verify(localMembersInjectorMock).notifyListeners(object);
            singleParameterInjector.verify(() -> SingleParameterInjector.getAll(internalContextMock, singleParameterInjectorArray), atLeast(1));
            verify(constructionProxyMock).newInstance(objectArray);
            verify(internalContextMock).getConstructionContext(target);
            verify(constructionContextMock).isConstructing();
            verify(constructionContextMock).getCurrentReference();
            verify(constructionContextMock).startConstruction();
            verify(constructionContextMock).setProxyDelegates(object);
            verify(constructionContextMock, times(2)).finishConstruction();
            verify(constructionContextMock).setCurrentReference(object);
            verify(constructionContextMock).removeCurrentReference();
        }
    }

    //Sapient generated method id: ${cff8da45-d78b-34f0-8f03-f7fdc59d1133}, hash: ACD63024456C896470E7278249A017CC
    @Ignore()
    @Test()
    public void constructWhenProvisionCallbackIsNotNull() throws InternalProvisionException, InvocationTargetException {
        /* Branches:
         * (constructionContext.isConstructing()) : false
         * (t != null) : false
         * (provisionCallback == null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        InjectionPoint injectionPoint = InjectionPoint.forConstructor(constructorMock, typeLiteralMock);
        Set<InjectionPoint> injectionPointSet = new HashSet<>();
        injectionPointSet.add(injectionPoint);
        SingleParameterInjector singleParameterInjectorMock = mock(SingleParameterInjector.class);
        SingleParameterInjector<?>[] singleParameterInjectorArray = new SingleParameterInjector[]{singleParameterInjectorMock};
        ConstructorInjector<java.lang.Object> target = new ConstructorInjector(injectionPointSet, constructionProxyMock, singleParameterInjectorArray, membersInjectorImplMock);
        doReturn(constructionContextMock).when(contextMock).getConstructionContext(target);
        doReturn(false).when(constructionContextMock).isConstructing();
        doReturn(null).when(constructionContextMock).getCurrentReference();
        doNothing().when(constructionContextMock).startConstruction();
        doNothing().when(constructionContextMock).finishConstruction();
        Dependency dependency = Dependency.get(keyMock);
        Binding bindingMock = mock(Binding.class);
        List list = new ArrayList<>();
        ProvisionListenerStackCallback provisionListenerStackCallback = new ProvisionListenerStackCallback(bindingMock, list);
        //Act Statement(s)
        java.lang.Object result = target.construct(contextMock, dependency, provisionListenerStackCallback);
        //Assert statement(s)
        //TODO: Please implement equals method in Object for verification of the entire object or you need to adjust respective assertion statements
        assertThat(result, is(notNullValue()));
        verify(contextMock).getConstructionContext(target);
        verify(constructionContextMock).isConstructing();
        verify(constructionContextMock).getCurrentReference();
        verify(constructionContextMock).startConstruction();
        verify(constructionContextMock).finishConstruction();
    }

    //Sapient generated method id: ${67010575-b658-3123-ab39-37b06314161d}, hash: 3441FDC7810DEE78562FB9D2A25C7987
    @Ignore()
    @Test()
    public void constructWhenUserExceptionGetCauseIsNotNullThrowsInternalProvisionException() throws InternalProvisionException, InvocationTargetException {
        /* Branches:
         * (constructionContext.isConstructing()) : false
         * (t != null) : false
         * (provisionCallback == null) : true
         * (catch-exception (InvocationTargetException)) : true  #  inside provision method
         * (userException.getCause() != null) : true  #  inside provision method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        SingleParameterInjector singleParameterInjector2Mock = mock(SingleParameterInjector.class);
        InternalProvisionException internalProvisionExceptionMock = mock(InternalProvisionException.class);
        InternalProvisionException internalProvisionExceptionMock2 = mock(InternalProvisionException.class);
        InjectionPoint injectionPointMock = mock(InjectionPoint.class, "InjectionPoint");
        try (MockedStatic<InternalProvisionException> internalProvisionException = mockStatic(InternalProvisionException.class);
             MockedStatic<SingleParameterInjector> singleParameterInjector = mockStatic(SingleParameterInjector.class)) {
            java.lang.Object object = new java.lang.Object();
            doNothing().when(localMembersInjectorMock).injectMembers(object, internalContextMock, false);
            doNothing().when(localMembersInjectorMock).notifyListeners(object);
            java.lang.Object[] objectArray = new java.lang.Object[]{};
            SingleParameterInjector<?>[] singleParameterInjectorArray = new SingleParameterInjector[]{singleParameterInjector2Mock};
            singleParameterInjector.when(() -> SingleParameterInjector.getAll(internalContextMock, singleParameterInjectorArray)).thenReturn(objectArray);
            Throwable throwable = new Throwable();
            internalProvisionException.when(() -> InternalProvisionException.errorInjectingConstructor(throwable)).thenReturn(internalProvisionExceptionMock);
            doThrow(internalProvisionExceptionMock2).when(internalProvisionExceptionMock).addSource(injectionPointMock);
            InjectionPoint injectionPoint = InjectionPoint.forConstructor(constructorMock, typeLiteralMock);
            Set<InjectionPoint> injectionPointSet = new HashSet<>();
            injectionPointSet.add(injectionPoint);
            ConstructorInjector<java.lang.Object> target = new ConstructorInjector(injectionPointSet, constructionProxyMock, singleParameterInjectorArray, localMembersInjectorMock);
            doReturn(object).when(constructionProxyMock).newInstance(objectArray);
            doReturn(injectionPointMock).when(constructionProxyMock).getInjectionPoint();
            doReturn(constructionContextMock).when(internalContextMock).getConstructionContext(target);
            doReturn(false).when(constructionContextMock).isConstructing();
            doReturn(null).when(constructionContextMock).getCurrentReference();
            doNothing().when(constructionContextMock).startConstruction();
            doNothing().when(constructionContextMock).setProxyDelegates(object);
            doNothing().when(constructionContextMock).finishConstruction();
            doNothing().when(constructionContextMock).setCurrentReference(object);
            thrown.expect(InternalProvisionException.class);
            Dependency dependency = Dependency.get(keyMock);
            ProvisionListenerStackCallback<java.lang.Object> provisionListenerStackCallback = null;
            //Act Statement(s)
            target.construct(internalContextMock, dependency, provisionListenerStackCallback);
            //Assert statement(s)
            verify(localMembersInjectorMock).injectMembers(object, internalContextMock, false);
            verify(localMembersInjectorMock).notifyListeners(object);
            singleParameterInjector.verify(() -> SingleParameterInjector.getAll(internalContextMock, singleParameterInjectorArray), atLeast(1));
            internalProvisionException.verify(() -> InternalProvisionException.errorInjectingConstructor(throwable), atLeast(1));
            verify(internalProvisionExceptionMock).addSource(injectionPointMock);
            verify(constructionProxyMock).newInstance(objectArray);
            verify(constructionProxyMock).getInjectionPoint();
            verify(internalContextMock).getConstructionContext(target);
            verify(constructionContextMock).isConstructing();
            verify(constructionContextMock).getCurrentReference();
            verify(constructionContextMock).startConstruction();
            verify(constructionContextMock).setProxyDelegates(object);
            verify(constructionContextMock).finishConstruction();
            verify(constructionContextMock).setCurrentReference(object);
        }
    }
}

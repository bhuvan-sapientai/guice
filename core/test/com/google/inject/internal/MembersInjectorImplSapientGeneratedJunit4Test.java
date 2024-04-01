package com.google.inject.internal;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.List;

import com.google.inject.ProvisionException;
import com.google.inject.Binding;
import com.google.common.collect.ImmutableSet;

import java.util.ArrayList;

import com.google.inject.Key;
import com.google.inject.TypeLiteral;
import com.google.common.collect.ImmutableList;
import org.mockito.MockedStatic;
import com.google.inject.spi.InjectionPoint;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.atLeast;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.mockito.Mockito.mockStatic;

import org.junit.Ignore;

public class MembersInjectorImplSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final InjectorImpl injectorMock = mock(InjectorImpl.class, "injector");

    private final Binding bindingMock = mock(Binding.class);

    private final EncounterImpl<Object> encounterMock = mock(EncounterImpl.class);

    private final InternalContext internalContextMock = mock(InternalContext.class);

    private final TypeLiteral<Object> typeLiteralMock = mock(TypeLiteral.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${aeb0abda-58ca-3464-8952-07907b7d318f}, hash: 4E45455E15508416C700B14FD1B4F51C
    @Test()
    public void getMemberInjectorsWhenMemberInjectorsIsNull() {
        /* Branches:
         * (memberInjectors == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<InternalFlags> internalFlags = mockStatic(InternalFlags.class)) {
            ImmutableSet immutableSet = ImmutableSet.of();
            doReturn(immutableSet).when(encounterMock).getMembersInjectors();
            ImmutableSet immutableSet2 = ImmutableSet.of();
            doReturn(immutableSet2).when(encounterMock).getInjectionListeners();
            internalFlags.when(() -> InternalFlags.isBytecodeGenEnabled()).thenReturn(false);
            TypeLiteral typeLiteral = TypeLiteral.get(Object.class);
            ImmutableList immutableList = ImmutableList.of();
            MembersInjectorImpl target = new MembersInjectorImpl(injectorMock, typeLiteral, encounterMock, immutableList);
            //Act Statement(s)
            ImmutableList<SingleMemberInjector> result = target.getMemberInjectors();
            ImmutableList<SingleMemberInjector> singleMemberInjectorList = ImmutableList.of();
            //Assert statement(s)
            assertThat(result, equalTo(singleMemberInjectorList));
            verify(encounterMock).getMembersInjectors();
            verify(encounterMock).getInjectionListeners();
            internalFlags.verify(() -> InternalFlags.isBytecodeGenEnabled(), atLeast(1));
        }
    }

    //Sapient generated method id: ${9d6de1e0-5989-3bde-85bf-27f1b1047b19}, hash: 33273AB09FEB80E44D1848B1577517F9
    @Test()
    public void injectMembersTest() throws InternalProvisionException {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<InternalFlags> internalFlags = mockStatic(InternalFlags.class)) {
            ImmutableSet immutableSet = ImmutableSet.of();
            doReturn(immutableSet).when(encounterMock).getMembersInjectors();
            ImmutableSet immutableSet2 = ImmutableSet.of();
            doReturn(immutableSet2).when(encounterMock).getInjectionListeners();
            internalFlags.when(() -> InternalFlags.isBytecodeGenEnabled()).thenReturn(false);
            TypeLiteral typeLiteral = TypeLiteral.get(Object.class);
            ImmutableList immutableList = ImmutableList.of();
            MembersInjectorImpl target = spy(new MembersInjectorImpl(injectorMock, typeLiteral, encounterMock, immutableList));
            Object object = new Object();
            doNothing().when(target).injectAndNotify(eq(object), eq((Key) null), eq((ProvisionListenerStackCallback) null), (TypeLiteral) any(), eq(false));
            //Act Statement(s)
            target.injectMembers(object);
            //Assert statement(s)
            verify(encounterMock).getMembersInjectors();
            verify(encounterMock).getInjectionListeners();
            internalFlags.verify(() -> InternalFlags.isBytecodeGenEnabled(), atLeast(1));
            verify(target).injectAndNotify(eq(object), eq((Key) null), eq((ProvisionListenerStackCallback) null), (TypeLiteral) any(), eq(false));
        }
    }

    //Sapient generated method id: ${48666504-bde4-31e5-847d-a206f777ca6f}, hash: 0F2B009E9072099143A8AC3C4422059D
    @Ignore()
    @Test()
    public void injectMembersWhenCaughtInternalProvisionExceptionThrowsProvisionException() throws InternalProvisionException {
        /* Branches:
         * (catch-exception (InternalProvisionException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<InternalFlags> internalFlags = mockStatic(InternalFlags.class)) {
            ImmutableSet immutableSet = ImmutableSet.of();
            doReturn(immutableSet).when(encounterMock).getMembersInjectors();
            ImmutableSet immutableSet2 = ImmutableSet.of();
            doReturn(immutableSet2).when(encounterMock).getInjectionListeners();
            internalFlags.when(() -> InternalFlags.isBytecodeGenEnabled()).thenReturn(false);
            TypeLiteral typeLiteral = TypeLiteral.get(Object.class);
            ImmutableList immutableList = ImmutableList.of();
            MembersInjectorImpl target = spy(new MembersInjectorImpl(injectorMock, typeLiteral, encounterMock, immutableList));
            Object object = new Object();
            doNothing().when(target).injectAndNotify(eq(object), eq((Key) null), eq((ProvisionListenerStackCallback) null), (TypeLiteral) any(), eq(false));
            Throwable throwable = new Throwable();
            ProvisionException provisionException = new ProvisionException("message1", throwable);
            thrown.expect(ProvisionException.class);
            thrown.expectMessage(provisionException.getMessage());
            thrown.expectCause(is(instanceOf(Throwable.class)));
            //Act Statement(s)
            target.injectMembers(object);
            //Assert statement(s)
            verify(encounterMock).getMembersInjectors();
            verify(encounterMock).getInjectionListeners();
            internalFlags.verify(() -> InternalFlags.isBytecodeGenEnabled(), atLeast(1));
            verify(target).injectAndNotify(eq(object), eq((Key) null), eq((ProvisionListenerStackCallback) null), (TypeLiteral) any(), eq(false));
        }
    }

    //Sapient generated method id: ${08a2dae6-9fee-3583-9cde-4e1a5482985b}, hash: 5B6C3F5341B6060E604174A670E64EE4
    @Test()
    public void injectAndNotifyWhenInstanceIsNull() throws InternalProvisionException {
        /* Branches:
         * (instance == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<InternalFlags> internalFlags = mockStatic(InternalFlags.class)) {
            ImmutableSet immutableSet = ImmutableSet.of();
            doReturn(immutableSet).when(encounterMock).getMembersInjectors();
            ImmutableSet immutableSet2 = ImmutableSet.of();
            doReturn(immutableSet2).when(encounterMock).getInjectionListeners();
            internalFlags.when(() -> InternalFlags.isBytecodeGenEnabled()).thenReturn(false);
            TypeLiteral typeLiteral = TypeLiteral.get(Object.class);
            ImmutableList immutableList = ImmutableList.of();
            MembersInjectorImpl target = new MembersInjectorImpl(injectorMock, typeLiteral, encounterMock, immutableList);
            //TODO: Needs initialization with real value
            Object object = null;
            Key key = Key.get(Object.class);
            List list = new ArrayList<>();
            ProvisionListenerStackCallback provisionListenerStackCallback = new ProvisionListenerStackCallback(bindingMock, list);
            Object object2 = new Object();
            //Act Statement(s)
            target.injectAndNotify(object, key, provisionListenerStackCallback, object2, false);
            //Assert statement(s)
            verify(encounterMock).getMembersInjectors();
            verify(encounterMock).getInjectionListeners();
            internalFlags.verify(() -> InternalFlags.isBytecodeGenEnabled(), atLeast(1));
        }
    }

    //Sapient generated method id: ${68c8f405-0dac-3b45-bf88-b6451bd19aa4}, hash: 880189AFB049A407E49C66B69501BF5D
    @Ignore()
    @Test()
    public void injectAndNotifyWhenProvisionCallbackHasListenersAndNotToolableOnly() throws InternalProvisionException {
        /* Branches:
         * (instance == null) : false
         * (provisionCallback != null) : true
         * (provisionCallback.hasListeners()) : true
         * (!toolableOnly) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ProvisionListenerStackCallback<Object> provisionCallbackMock = mock(ProvisionListenerStackCallback.class);
        doReturn(true).when(provisionCallbackMock).hasListeners();
        Object object = new Object();
        doReturn(object).when(provisionCallbackMock).provision(eq(internalContextMock), (ProvisionListenerStackCallback.ProvisionCallback) any());
        doNothing().when(internalContextMock).close();
        ImmutableSet immutableSet = ImmutableSet.of();
        doReturn(immutableSet).when(encounterMock).getMembersInjectors();
        ImmutableSet immutableSet2 = ImmutableSet.of();
        doReturn(immutableSet2).when(encounterMock).getInjectionListeners();
        ImmutableList immutableList = ImmutableList.of();
        ImmutableList immutableList2 = ImmutableList.of();
        doReturn(immutableList, immutableList2).when(encounterMock).getAspects();
        ImmutableList immutableList3 = ImmutableList.of();
        MembersInjectorImpl target = spy(new MembersInjectorImpl(injectorMock, typeLiteralMock, encounterMock, immutableList3));
        doReturn(internalContextMock).when(injectorMock).enterContext();
        Object object2 = new Object();
        doNothing().when(target).notifyListeners(object2);
        Key<Object> keyMock = mock(Key.class);
        Object object3 = new Object();
        //Act Statement(s)
        target.injectAndNotify(object2, keyMock, provisionCallbackMock, object3, false);
        //Assert statement(s)
        verify(provisionCallbackMock).hasListeners();
        verify(provisionCallbackMock).provision(eq(internalContextMock), (ProvisionListenerStackCallback.ProvisionCallback) any());
        verify(internalContextMock).close();
        verify(encounterMock).getMembersInjectors();
        verify(encounterMock).getInjectionListeners();
        verify(encounterMock, times(2)).getAspects();
        verify(injectorMock).enterContext();
        verify(target).notifyListeners(object2);
    }

    //Sapient generated method id: ${d3eeac0f-ef8c-35f8-8329-2787f02b0c85}, hash: E7F386D1CB483A1EAB5D97568C0B9DDA
    @Test()
    public void injectAndNotifyWhenProvisionCallbackNotHasListenersAndNotToolableOnly() throws InternalProvisionException {
        /* Branches:
         * (instance == null) : false
         * (provisionCallback != null) : true
         * (provisionCallback.hasListeners()) : false
         * (!toolableOnly) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<InternalFlags> internalFlags = mockStatic(InternalFlags.class)) {
            ImmutableSet immutableSet = ImmutableSet.of();
            doReturn(immutableSet).when(encounterMock).getMembersInjectors();
            ImmutableSet immutableSet2 = ImmutableSet.of();
            doReturn(immutableSet2).when(encounterMock).getInjectionListeners();
            internalFlags.when(() -> InternalFlags.isBytecodeGenEnabled()).thenReturn(false);
            TypeLiteral typeLiteral = TypeLiteral.get(Object.class);
            ImmutableList immutableList = ImmutableList.of();
            MembersInjectorImpl target = spy(new MembersInjectorImpl(injectorMock, typeLiteral, encounterMock, immutableList));
            doReturn(internalContextMock).when(injectorMock).enterContext();
            doNothing().when(internalContextMock).close();
            Object object = new Object();
            doNothing().when(target).injectMembers(object, internalContextMock, false);
            doNothing().when(target).notifyListeners(object);
            Key key = Key.get(Object.class);
            List list = new ArrayList<>();
            ProvisionListenerStackCallback provisionListenerStackCallback = new ProvisionListenerStackCallback(bindingMock, list);
            Object object2 = new Object();
            //Act Statement(s)
            target.injectAndNotify(object, key, provisionListenerStackCallback, object2, false);
            //Assert statement(s)
            verify(encounterMock).getMembersInjectors();
            verify(encounterMock).getInjectionListeners();
            internalFlags.verify(() -> InternalFlags.isBytecodeGenEnabled(), atLeast(1));
            verify(injectorMock).enterContext();
            verify(internalContextMock).close();
            verify(target).injectMembers(object, internalContextMock, false);
            verify(target).notifyListeners(object);
        }
    }

    //Sapient generated method id: ${fa3af382-bd24-32c5-83f0-d731e8b2cbd0}, hash: 8439A8F22A2C4470ECFFCD86411565A7
    @Test()
    public void notifyListenersWhenLocalInjectionListenersIsNull() throws InternalProvisionException {
        /* Branches:
         * (localInjectionListeners == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<InternalFlags> internalFlags = mockStatic(InternalFlags.class)) {
            ImmutableSet immutableSet = ImmutableSet.of();
            doReturn(immutableSet).when(encounterMock).getMembersInjectors();
            ImmutableSet immutableSet2 = ImmutableSet.of();
            doReturn(immutableSet2).when(encounterMock).getInjectionListeners();
            internalFlags.when(() -> InternalFlags.isBytecodeGenEnabled()).thenReturn(false);
            TypeLiteral typeLiteral = TypeLiteral.get(Object.class);
            ImmutableList immutableList = ImmutableList.of();
            MembersInjectorImpl target = new MembersInjectorImpl(injectorMock, typeLiteral, encounterMock, immutableList);
            Object object = new Object();
            //Act Statement(s)
            target.notifyListeners(object);
            //Assert statement(s)
            verify(encounterMock).getMembersInjectors();
            verify(encounterMock).getInjectionListeners();
            internalFlags.verify(() -> InternalFlags.isBytecodeGenEnabled(), atLeast(1));
        }
    }

    //Sapient generated method id: ${2526ae95-a234-3fcc-8f66-7447b0376220}, hash: 56B903D4E51369DC56AFBC93FE7D01CC
    @Test()
    public void injectMembers1WhenLocalUsersMembersInjectorsIsNull() throws InternalProvisionException {
        /* Branches:
         * (localMembersInjectors != null) : false
         * (!toolableOnly) : true
         * (localUsersMembersInjectors != null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<InternalFlags> internalFlags = mockStatic(InternalFlags.class)) {
            ImmutableSet immutableSet = ImmutableSet.of();
            doReturn(immutableSet).when(encounterMock).getMembersInjectors();
            ImmutableSet immutableSet2 = ImmutableSet.of();
            doReturn(immutableSet2).when(encounterMock).getInjectionListeners();
            internalFlags.when(() -> InternalFlags.isBytecodeGenEnabled()).thenReturn(false);
            TypeLiteral typeLiteral = TypeLiteral.get(Object.class);
            ImmutableList immutableList = ImmutableList.of();
            MembersInjectorImpl target = new MembersInjectorImpl(injectorMock, typeLiteral, encounterMock, immutableList);
            Object object = new Object();
            //Act Statement(s)
            target.injectMembers(object, internalContextMock, false);
            //Assert statement(s)
            verify(encounterMock).getMembersInjectors();
            verify(encounterMock).getInjectionListeners();
            internalFlags.verify(() -> InternalFlags.isBytecodeGenEnabled(), atLeast(1));
        }
    }

    //Sapient generated method id: ${363d3698-f34c-39ad-914f-376a19498023}, hash: 6D69F8A88BA23A0D93EBFC2BFE15E76E
    @Test()
    public void toStringTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<InternalFlags> internalFlags = mockStatic(InternalFlags.class)) {
            ImmutableSet immutableSet = ImmutableSet.of();
            doReturn(immutableSet).when(encounterMock).getMembersInjectors();
            ImmutableSet immutableSet2 = ImmutableSet.of();
            doReturn(immutableSet2).when(encounterMock).getInjectionListeners();
            internalFlags.when(() -> InternalFlags.isBytecodeGenEnabled()).thenReturn(false);
            TypeLiteral typeLiteral = TypeLiteral.get(Object.class);
            ImmutableList immutableList = ImmutableList.of();
            MembersInjectorImpl target = new MembersInjectorImpl(injectorMock, typeLiteral, encounterMock, immutableList);
            //Act Statement(s)
            String result = target.toString();
            //Assert statement(s)
            assertThat(result, equalTo("MembersInjector<java.lang.Object>"));
            verify(encounterMock).getMembersInjectors();
            verify(encounterMock).getInjectionListeners();
            internalFlags.verify(() -> InternalFlags.isBytecodeGenEnabled(), atLeast(1));
        }
    }

    //Sapient generated method id: ${aee50ccf-5d5d-386c-a34e-73c77304b09a}, hash: 75D099B01BEA87A2E930ED085C062477
    @Test()
    public void getInjectionPointsWhenLocalMemberInjectorsIsNull() {
        /* Branches:
         * (localMemberInjectors != null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<InternalFlags> internalFlags = mockStatic(InternalFlags.class)) {
            ImmutableSet immutableSet = ImmutableSet.of();
            doReturn(immutableSet).when(encounterMock).getMembersInjectors();
            ImmutableSet immutableSet2 = ImmutableSet.of();
            doReturn(immutableSet2).when(encounterMock).getInjectionListeners();
            internalFlags.when(() -> InternalFlags.isBytecodeGenEnabled()).thenReturn(false);
            TypeLiteral typeLiteral = TypeLiteral.get(Object.class);
            ImmutableList immutableList = ImmutableList.of();
            MembersInjectorImpl target = new MembersInjectorImpl(injectorMock, typeLiteral, encounterMock, immutableList);
            //Act Statement(s)
            ImmutableSet<InjectionPoint> result = target.getInjectionPoints();
            ImmutableSet<InjectionPoint> injectionPointSet = ImmutableSet.of();
            //Assert statement(s)
            assertThat(result, equalTo(injectionPointSet));
            verify(encounterMock).getMembersInjectors();
            verify(encounterMock).getInjectionListeners();
            internalFlags.verify(() -> InternalFlags.isBytecodeGenEnabled(), atLeast(1));
        }
    }

    //Sapient generated method id: ${1489d144-8430-3c9e-8b7b-2aa73f66ee8f}, hash: 425E301D8083FF5B8F564CB2DE92DD9D
    @Test()
    public void getAddedAspectsWhenAddedAspectsIsNull() {
        /* Branches:
         * (addedAspects == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<InternalFlags> internalFlags = mockStatic(InternalFlags.class)) {
            ImmutableSet immutableSet = ImmutableSet.of();
            doReturn(immutableSet).when(encounterMock).getMembersInjectors();
            ImmutableSet immutableSet2 = ImmutableSet.of();
            doReturn(immutableSet2).when(encounterMock).getInjectionListeners();
            internalFlags.when(() -> InternalFlags.isBytecodeGenEnabled()).thenReturn(false);
            TypeLiteral typeLiteral = TypeLiteral.get(Object.class);
            ImmutableList immutableList = ImmutableList.of();
            MembersInjectorImpl target = new MembersInjectorImpl(injectorMock, typeLiteral, encounterMock, immutableList);
            //Act Statement(s)
            ImmutableList<MethodAspect> result = target.getAddedAspects();
            ImmutableList<MethodAspect> methodAspectList = ImmutableList.of();
            //Assert statement(s)
            assertThat(result, equalTo(methodAspectList));
            verify(encounterMock).getMembersInjectors();
            verify(encounterMock).getInjectionListeners();
            internalFlags.verify(() -> InternalFlags.isBytecodeGenEnabled(), atLeast(1));
        }
    }

    //Sapient generated method id: ${f8a354c5-d8ad-333c-a76e-beb8c03f29a4}, hash: B414CD6D49548369E11B91B3BB7C762B
    @Ignore()
    @Test()
    public void getAddedAspectsWhenAddedAspectsIsNotNull() {
        /* Branches:
         * (addedAspects == null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ImmutableSet immutableSet = ImmutableSet.of();
        doReturn(immutableSet).when(encounterMock).getMembersInjectors();
        ImmutableSet immutableSet2 = ImmutableSet.of();
        doReturn(immutableSet2).when(encounterMock).getInjectionListeners();
        ImmutableList immutableList = ImmutableList.of();
        ImmutableList immutableList2 = ImmutableList.of();
        doReturn(immutableList, immutableList2).when(encounterMock).getAspects();
        ImmutableList immutableList3 = ImmutableList.of();
        MembersInjectorImpl target = new MembersInjectorImpl(injectorMock, typeLiteralMock, encounterMock, immutableList3);
        //Act Statement(s)
        ImmutableList<MethodAspect> result = target.getAddedAspects();
        //Assert statement(s)
        assertThat(result, equalTo(immutableList2));
        verify(encounterMock).getMembersInjectors();
        verify(encounterMock).getInjectionListeners();
        verify(encounterMock, times(2)).getAspects();
    }
}

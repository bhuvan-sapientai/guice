package com.google.inject.internal;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.lang.reflect.Method;

import com.google.inject.spi.Message;
import com.google.inject.TypeLiteral;
import org.aopalliance.intercept.MethodInterceptor;
import com.google.common.collect.ImmutableList;
import com.google.inject.Provider;
import com.google.inject.matcher.Matcher;
import org.mockito.MockedStatic;
import com.google.inject.MembersInjector;
import com.google.common.collect.ImmutableSet;
import com.google.inject.spi.InjectionListener;
import com.google.inject.Key;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;

import org.junit.Ignore;

public class EncounterImplSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Errors errorsMock = mock(Errors.class, "errors");

    private final Lookups lookupsMock = mock(Lookups.class, "lookups");

    private final Errors errorsMock2 = mock(Errors.class);

    private final Key<Object> keyMock = mock(Key.class);

    private final MembersInjector membersInjectorMock = mock(MembersInjector.class);

    private final Provider providerMock = mock(Provider.class);

    private final TypeLiteral<Object> typeLiteralMock = mock(TypeLiteral.class);

    //Sapient generated method id: ${eccf638a-404d-3731-9e6b-cb170120260a}, hash: 712BFE814C84E8E5EE3E8AD79B32E40C
    @Test()
    public void invalidateTest() {
        //Arrange Statement(s)
        EncounterImpl target = new EncounterImpl(errorsMock, lookupsMock);
        //Act Statement(s)
        target.invalidate();
    }

    //Sapient generated method id: ${2b6bdbdc-2607-37cb-9a63-afd5acb00fcd}, hash: B0380456AD969236A5F08943700974E9
    @Test()
    public void getAspectsWhenAspectsIsNull() {
        /* Branches:
         * (aspects == null) : true
         */
        //Arrange Statement(s)
        EncounterImpl target = new EncounterImpl(errorsMock, lookupsMock);
        //Act Statement(s)
        ImmutableList<MethodAspect> result = target.getAspects();
        ImmutableList<MethodAspect> methodAspectList = ImmutableList.of();
        //Assert statement(s)
        assertThat(result, equalTo(methodAspectList));
    }

    //Sapient generated method id: ${3fd03d42-eb25-3f01-a21a-464c63def12a}, hash: 1C724500F5855B4B5C864FD6CA4E6439
    @Test()
    public void bindInterceptorWhenAspectsIsNull() {
        /* Branches:
         * (aspects == null) : true
         */
        //Arrange Statement(s)
        EncounterImpl target = new EncounterImpl(errorsMock, lookupsMock);
        Matcher<Method> matcherMock = mock(Matcher.class);
        MethodInterceptor[] methodInterceptorArray = new MethodInterceptor[]{};
        //Act Statement(s)
        target.bindInterceptor(matcherMock, methodInterceptorArray);
    }

    //Sapient generated method id: ${56aa55a6-bccd-368f-881c-9f4415689d56}, hash: E9BB61444D73D906F8B1E7A5BCA5CED7
    @Test()
    public void getMembersInjectorsWhenMembersInjectorsIsNull() {
        /* Branches:
         * (membersInjectors == null) : true
         */
        //Arrange Statement(s)
        EncounterImpl target = new EncounterImpl(errorsMock, lookupsMock);
        //Act Statement(s)
        ImmutableSet<MembersInjector<? super Object>> result = target.getMembersInjectors();
        ImmutableSet<MembersInjector<Object>> anySet = ImmutableSet.of();
        //Assert statement(s)
        assertThat(result, equalTo(anySet));
    }

    //Sapient generated method id: ${fba865c3-e455-3045-9132-7751b80f4df9}, hash: CBBE559425F22A6CEAA5582595CC1EBF
    @Test()
    public void getInjectionListenersWhenInjectionListenersIsNull() {
        /* Branches:
         * (injectionListeners == null) : true
         */
        //Arrange Statement(s)
        EncounterImpl target = new EncounterImpl(errorsMock, lookupsMock);
        //Act Statement(s)
        ImmutableSet<InjectionListener<? super Object>> result = target.getInjectionListeners();
        ImmutableSet<InjectionListener<Object>> anySet = ImmutableSet.of();
        //Assert statement(s)
        assertThat(result, equalTo(anySet));
    }

    //Sapient generated method id: ${b243d82f-2ae2-3e90-8ba1-747cd6b813e0}, hash: 27E6B5B5844B68C62AAF4344A6B4E48E
    @Test()
    public void registerWhenMembersInjectorsIsNull() {
        /* Branches:
         * (membersInjectors == null) : true
         */
        //Arrange Statement(s)
        EncounterImpl target = new EncounterImpl(errorsMock, lookupsMock);
        MembersInjector<Object> membersInjectorMock = mock(MembersInjector.class);
        //Act Statement(s)
        target.register(membersInjectorMock);
    }

    //Sapient generated method id: ${5a174cfd-a48d-3acd-98ee-6f4f0544845a}, hash: 74C2F08BE006A910D9BABA3F7B0C356D
    @Test()
    public void register1WhenInjectionListenersIsNull() {
        /* Branches:
         * (injectionListeners == null) : true
         */
        //Arrange Statement(s)
        EncounterImpl target = new EncounterImpl(errorsMock, lookupsMock);
        InjectionListener<Object> injectionListenerMock = mock(InjectionListener.class);
        //Act Statement(s)
        target.register(injectionListenerMock);
    }

    //Sapient generated method id: ${0424c1f8-4658-391d-a761-1b84ac4030a5}, hash: 1DE230BD79E23AD962925898B26A9A91
    @Test()
    public void addErrorTest() {
        //Arrange Statement(s)
        EncounterImpl target = new EncounterImpl(errorsMock, lookupsMock);
        Object[] objectArray = new Object[]{};
        doReturn(errorsMock2).when(errorsMock).addMessage("message1", objectArray);
        //Act Statement(s)
        target.addError("message1", objectArray);
        //Assert statement(s)
        verify(errorsMock).addMessage("message1", objectArray);
    }

    //Sapient generated method id: ${17072fbe-d3b0-3a28-af22-079d30bb2a15}, hash: 7A6F68CAAE9EE4257FD90ED7EE3011D6
    @Test()
    public void addError1Test() {
        //Arrange Statement(s)
        EncounterImpl target = new EncounterImpl(errorsMock, lookupsMock);
        Throwable throwable = new Throwable("message1");
        Object[] objectArray = new Object[]{"message1"};
        doReturn(errorsMock2).when(errorsMock).errorInUserCode(throwable, "An exception was caught and reported. Message: %s", objectArray);
        //Act Statement(s)
        target.addError(throwable);
        //Assert statement(s)
        verify(errorsMock).errorInUserCode(throwable, "An exception was caught and reported. Message: %s", objectArray);
    }

    //Sapient generated method id: ${bbf673d2-9163-3c59-8833-4613ee56338c}, hash: FC1F2017112D58F2264AC991C237B6E0
    @Test()
    public void addError2Test() {
        //Arrange Statement(s)
        EncounterImpl target = new EncounterImpl(errorsMock, lookupsMock);
        Message messageMock = mock(Message.class);
        doReturn(errorsMock2).when(errorsMock).addMessage(messageMock);
        //Act Statement(s)
        target.addError(messageMock);
        //Assert statement(s)
        verify(errorsMock).addMessage(messageMock);
    }

    //Sapient generated method id: ${00dff819-cb70-3ea6-9be9-223a26306dab}, hash: 577F76762E5D86148C9EE8ADB0B1992B
    @Ignore()
    @Test()
    public void getProviderTest() {
        //Arrange Statement(s)
        EncounterImpl target = new EncounterImpl(errorsMock, lookupsMock);
        doReturn(providerMock).when(lookupsMock).getProvider(keyMock);
        //Act Statement(s)
        Provider result = target.getProvider(keyMock);
        //Assert statement(s)
        assertThat(result, equalTo(providerMock));
        verify(lookupsMock).getProvider(keyMock);
    }

    //Sapient generated method id: ${ef1a5a18-4e46-38c5-83e6-d50629c70946}, hash: 67DBBC552CF916E3E61A4217A08177F5
    @Ignore()
    @Test()
    public void getProvider1Test() {
        //Arrange Statement(s)
        try (MockedStatic<Key> key = mockStatic(Key.class)) {
            key.when(() -> Key.get(Object.class)).thenReturn(keyMock);
            EncounterImpl target = new EncounterImpl(errorsMock, lookupsMock);
            doReturn(providerMock).when(lookupsMock).getProvider(keyMock);
            //Act Statement(s)
            Provider result = target.getProvider(Object.class);
            //Assert statement(s)
            assertThat(result, equalTo(providerMock));
            key.verify(() -> Key.get(Object.class), atLeast(1));
            verify(lookupsMock).getProvider(keyMock);
        }
    }

    //Sapient generated method id: ${3219d138-fa9b-3e28-9ed3-ede6bfdd8d4c}, hash: ED6191041D80FB8E2466F4D8FC7F84F6
    @Ignore()
    @Test()
    public void getMembersInjectorTest() {
        //Arrange Statement(s)
        EncounterImpl target = new EncounterImpl(errorsMock, lookupsMock);
        doReturn(membersInjectorMock).when(lookupsMock).getMembersInjector(typeLiteralMock);
        //Act Statement(s)
        MembersInjector result = target.getMembersInjector(typeLiteralMock);
        //Assert statement(s)
        assertThat(result, equalTo(membersInjectorMock));
        verify(lookupsMock).getMembersInjector(typeLiteralMock);
    }

    //Sapient generated method id: ${09e74519-f326-3be7-b6a0-6bb8d1c0884c}, hash: B8ACEB301D812EEB01AEA5EE08B4DEA3
    @Ignore()
    @Test()
    public void getMembersInjector1Test() {
        //Arrange Statement(s)
        try (MockedStatic<TypeLiteral> typeLiteral = mockStatic(TypeLiteral.class)) {
            typeLiteral.when(() -> TypeLiteral.get(Object.class)).thenReturn(typeLiteralMock);
            EncounterImpl target = new EncounterImpl(errorsMock, lookupsMock);
            doReturn(membersInjectorMock).when(lookupsMock).getMembersInjector(typeLiteralMock);
            //Act Statement(s)
            MembersInjector result = target.getMembersInjector(Object.class);
            //Assert statement(s)
            assertThat(result, equalTo(membersInjectorMock));
            typeLiteral.verify(() -> TypeLiteral.get(Object.class), atLeast(1));
            verify(lookupsMock).getMembersInjector(typeLiteralMock);
        }
    }
}

package com.google.inject.internal;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.util.List;
import java.lang.reflect.Field;

import com.google.inject.TypeLiteral;
import com.google.common.collect.ImmutableList;

import java.util.Set;

import com.google.inject.spi.TypeListenerBinding;

import java.util.HashSet;
import java.util.ArrayList;

import com.google.common.collect.ImmutableListMultimap;

import java.lang.reflect.Constructor;

import com.google.inject.spi.InjectionPoint;

import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

import org.junit.Ignore;

public class MembersInjectorStoreSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Constructor constructorMock = mock(Constructor.class);

    private final Errors errorsMock = mock(Errors.class);

    private final InjectorImpl injectorImplMock = mock(InjectorImpl.class);

    private final TypeLiteral typeLiteralMock = mock(TypeLiteral.class);

    //Sapient generated method id: ${ec957826-ce9c-3b4b-8d98-835ad499544c}, hash: 1407EB7E148294A37F1540C1AD37FB0E
    @Ignore()
    @Test()
    public void hasTypeListenersWhenTypeListenerBindingsNotIsEmpty() {
        /* Branches:
         * (!typeListenerBindings.isEmpty()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        List<TypeListenerBinding> typeListenerBindingList = new ArrayList<>();
        MembersInjectorStore target = new MembersInjectorStore(injectorImplMock, typeListenerBindingList);
        //Act Statement(s)
        boolean result = target.hasTypeListeners();
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
    }

    //Sapient generated method id: ${baf0e040-1854-363d-954d-ded9ac095d04}, hash: 106E507FAD9C6A6C5A97B029B327A7FF
    @Test()
    public void hasTypeListenersWhenTypeListenerBindingsIsEmpty() {
        /* Branches:
         * (!typeListenerBindings.isEmpty()) : false
         */
        //Arrange Statement(s)
        List<TypeListenerBinding> typeListenerBindingList = new ArrayList<>();
        MembersInjectorStore target = new MembersInjectorStore(injectorImplMock, typeListenerBindingList);
        //Act Statement(s)
        boolean result = target.hasTypeListeners();
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${9c25887d-767d-38e9-b5ae-c2e4012c49be}, hash: 35A21B6049B8FFF1AC2B0BBFD9AB49DE
    @Test()
    public void getTest() throws ErrorsException {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: cache
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        List<TypeListenerBinding> typeListenerBindingList = new ArrayList<>();
        MembersInjectorStore target = new MembersInjectorStore(injectorImplMock, typeListenerBindingList);
        TypeLiteral typeLiteral = TypeLiteral.get(Object.class);
        Errors errors = new Errors();
        //Act Statement(s)
        MembersInjectorImpl result = target.get(typeLiteral, errors);
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${1d9c5a4c-401b-3ecf-ba2f-e0ff82472747}, hash: EBDDCD79DB350C1B660B195140A04871
    @Ignore()
    @Test()
    public void removeWhenCacheRemoveType() {
        /* Branches:
         * (cache.remove(type)) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: cache
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        InjectorImpl injectorImplMock = mock(InjectorImpl.class, "InjectorImpl");
        List<TypeListenerBinding> typeListenerBindingList = new ArrayList<>();
        MembersInjectorStore target = new MembersInjectorStore(injectorImplMock, typeListenerBindingList);
        TypeLiteral typeLiteral = TypeLiteral.get(Object.class);
        //Act Statement(s)
        boolean result = target.remove(typeLiteral);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
    }

    //Sapient generated method id: ${7ded3a81-c3ba-3152-97d3-c6eabe56cf69}, hash: 80AE2510EE205854A5B3C6A9E43B5B5C
    @Test()
    public void removeWhenCacheNotRemoveType() {
        /* Branches:
         * (cache.remove(type)) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: cache
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        InjectorImpl injectorImplMock = mock(InjectorImpl.class, "InjectorImpl");
        List<TypeListenerBinding> typeListenerBindingList = new ArrayList<>();
        MembersInjectorStore target = new MembersInjectorStore(injectorImplMock, typeListenerBindingList);
        TypeLiteral typeLiteral = TypeLiteral.get(Object.class);
        //Act Statement(s)
        boolean result = target.remove(typeLiteral);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${b347dea7-805e-32d6-8d69-7424f2e6eed1}, hash: 1B4E88CF22BD62D02CB464172B4A4778
    @Ignore()
    @Test()
    public void getInjectorsWhenInjectionPointGetMemberInstanceOfField() throws ErrorsException {
        /* Branches:
         * (for-each(injectionPoints)) : true
         * (injectionPoint.isOptional()) : true
         * (injectionPoint.getMember() instanceof Field) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        InjectionPoint injectionPointMock = mock(InjectionPoint.class);
        doReturn(true).when(injectionPointMock).isOptional();
        Field fieldMock = mock(Field.class);
        doReturn(fieldMock).when(injectionPointMock).getMember();
        List<TypeListenerBinding> typeListenerBindingList = new ArrayList<>();
        MembersInjectorStore target = new MembersInjectorStore(injectorImplMock, typeListenerBindingList);
        Set<InjectionPoint> injectionPointSet = new HashSet<>();
        injectionPointSet.add(injectionPointMock);
        //Act Statement(s)
        ImmutableList<SingleMemberInjector> result = target.getInjectors(injectionPointSet, errorsMock);
        ImmutableList immutableList = ImmutableList.of();
        //Assert statement(s)
        assertThat(result, equalTo(immutableList));
        verify(injectionPointMock).isOptional();
        verify(injectionPointMock).getMember();
    }

    //Sapient generated method id: ${31a57cce-4483-30d4-9278-3e24e7e41dbe}, hash: 48E545C98D6A340AF45B7DD835E9C40C
    @Ignore()
    @Test()
    public void getInjectorsWhenInjectionPointNotIsOptionalAndInjectionPointGetMemberNotInstanceOfField() throws ErrorsException {
        /* Branches:
         * (for-each(injectionPoints)) : true
         * (injectionPoint.isOptional()) : false
         * (injectionPoint.getMember() instanceof Field) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: injectionPoint
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        InjectionPoint injectionPoint = InjectionPoint.forConstructor(constructorMock, typeLiteralMock);
        Errors errors = errorsMock.withSource(injectionPoint);
        doReturn(errors).when(errorsMock).withSource((InjectionPoint) any());
        List<TypeListenerBinding> typeListenerBindingList = new ArrayList<>();
        MembersInjectorStore target = new MembersInjectorStore(injectorImplMock, typeListenerBindingList);
        Set<InjectionPoint> injectionPointSet = new HashSet<>();
        injectionPointSet.add(injectionPoint);
        //Act Statement(s)
        ImmutableList<SingleMemberInjector> result = target.getInjectors(injectionPointSet, errorsMock);
        ImmutableList immutableList = ImmutableList.of();
        //Assert statement(s)
        assertThat(result, equalTo(immutableList));
        verify(errorsMock).withSource((InjectionPoint) any());
    }

    //Sapient generated method id: ${ea47e7b4-8229-3dde-ae0c-f6f7ef8bf8e3}, hash: 10BAEB16C70B86F6F1AA6920236C43AC
    @Ignore()
    @Test()
    public void getInjectorsWhenCaughtErrorsException() throws ErrorsException {
        /* Branches:
         * (for-each(injectionPoints)) : true
         * (injectionPoint.isOptional()) : true
         * (injectionPoint.getMember() instanceof Field) : true
         * (catch-exception (ErrorsException)) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: injectionPoint
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        List<TypeListenerBinding> typeListenerBindingList = new ArrayList<>();
        MembersInjectorStore target = new MembersInjectorStore(injectorImplMock, typeListenerBindingList);
        InjectionPoint injectionPoint = InjectionPoint.forConstructor(constructorMock, typeLiteralMock);
        Set<InjectionPoint> injectionPointSet = new HashSet<>();
        injectionPointSet.add(injectionPoint);
        Errors errors = new Errors();
        //Act Statement(s)
        ImmutableList<SingleMemberInjector> result = target.getInjectors(injectionPointSet, errors);
        ImmutableList immutableList = ImmutableList.of();
        //Assert statement(s)
        assertThat(result, equalTo(immutableList));
    }

    //Sapient generated method id: ${e32eaa49-e2bd-31d7-99a5-2d88bf1919f8}, hash: 8F6C2F01C39287E5499D850BEC9CACC3
    @Ignore()
    @Test()
    public void getInjectorsWhenInjectionPointGetMemberInstanceOfFieldAndCaughtErrorsException() throws ErrorsException {
        /* Branches:
         * (for-each(injectionPoints)) : true
         * (injectionPoint.isOptional()) : false
         * (injectionPoint.getMember() instanceof Field) : true
         * (catch-exception (ErrorsException)) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: injectionPoint
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        InjectionPoint injectionPoint = InjectionPoint.forConstructor(constructorMock, typeLiteralMock);
        Errors errors = errorsMock.withSource(injectionPoint);
        doReturn(errors).when(errorsMock).withSource((InjectionPoint) any());
        List<TypeListenerBinding> typeListenerBindingList = new ArrayList<>();
        MembersInjectorStore target = new MembersInjectorStore(injectorImplMock, typeListenerBindingList);
        Set<InjectionPoint> injectionPointSet = new HashSet<>();
        injectionPointSet.add(injectionPoint);
        //Act Statement(s)
        ImmutableList<SingleMemberInjector> result = target.getInjectors(injectionPointSet, errorsMock);
        ImmutableList immutableList = ImmutableList.of();
        //Assert statement(s)
        assertThat(result, equalTo(immutableList));
        verify(errorsMock).withSource((InjectionPoint) any());
    }

    //Sapient generated method id: ${b10e9b8d-65b1-386d-9175-08d34346db5c}, hash: C043DF102880F70DE8BEE3BCBE2ACB93
    @Test()
    public void getAllInjectionPointsTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: cache
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        List<TypeListenerBinding> typeListenerBindingList = new ArrayList<>();
        MembersInjectorStore target = new MembersInjectorStore(injectorImplMock, typeListenerBindingList);
        //Act Statement(s)
        ImmutableListMultimap<TypeLiteral<?>, InjectionPoint> result = target.getAllInjectionPoints();
        ImmutableListMultimap immutableListMultimap = ImmutableListMultimap.builder().build();
        //Assert statement(s)
        assertThat(result, equalTo(immutableListMultimap));
    }
}

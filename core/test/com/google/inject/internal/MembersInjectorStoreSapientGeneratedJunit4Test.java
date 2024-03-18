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

import java.lang.reflect.Member;
import java.util.HashSet;
import java.util.ArrayList;

import com.google.common.collect.ImmutableListMultimap;
import com.google.inject.spi.InjectionPoint;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

import org.junit.Ignore;

public class MembersInjectorStoreSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Field fieldMock = mock(Field.class);

    private final InjectionPoint injectionPointMock = mock(InjectionPoint.class);

    private final InjectorImpl injectorImplMock = mock(InjectorImpl.class);

    private final TypeListenerBinding typeListenerBindingMock = mock(TypeListenerBinding.class);

    //Sapient generated method id: ${ec957826-ce9c-3b4b-8d98-835ad499544c}, hash: 8DC85857AE55D5C6F2AC904EF5948418
    @Test()
    public void hasTypeListenersWhenTypeListenerBindingsNotIsEmpty() {
        /* Branches:
         * (!typeListenerBindings.isEmpty()) : true
         */
        //Arrange Statement(s)
        InjectorImpl injectorImplMock = mock(InjectorImpl.class, "valid_injector_value");
        TypeListenerBinding typeListenerBindingMock = mock(TypeListenerBinding.class, "valid_type_listener_bindings_value");
        List<TypeListenerBinding> typeListenerBindingList = new ArrayList<>();
        typeListenerBindingList.add(typeListenerBindingMock);
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

    //Sapient generated method id: ${9c25887d-767d-38e9-b5ae-c2e4012c49be}, hash: 6ECBD10AD90F346C0E9806BBDB7F6047
    @Ignore()
    @Test()
    public void getTest() throws ErrorsException {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        List<TypeListenerBinding> typeListenerBindingList = new ArrayList<>();
        typeListenerBindingList.add(typeListenerBindingMock);
        MembersInjectorStore target = new MembersInjectorStore(injectorImplMock, typeListenerBindingList);
        TypeLiteral typeLiteral = TypeLiteral.get(Object.class);
        Errors errors = new Errors();
        //Act Statement(s)
        MembersInjectorImpl result = target.get(typeLiteral, errors);
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${1d9c5a4c-401b-3ecf-ba2f-e0ff82472747}, hash: D0DE62ABE13A6069139AD07CBB81C284
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
        typeListenerBindingList.add(typeListenerBindingMock);
        MembersInjectorStore target = new MembersInjectorStore(injectorImplMock, typeListenerBindingList);
        TypeLiteral typeLiteral = TypeLiteral.get(Object.class);
        //Act Statement(s)
        boolean result = target.remove(typeLiteral);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
    }

    //Sapient generated method id: ${7ded3a81-c3ba-3152-97d3-c6eabe56cf69}, hash: F938F98BFADCAC864136DE16459909DF
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
        typeListenerBindingList.add(typeListenerBindingMock);
        MembersInjectorStore target = new MembersInjectorStore(injectorImplMock, typeListenerBindingList);
        TypeLiteral typeLiteral = TypeLiteral.get(Object.class);
        //Act Statement(s)
        boolean result = target.remove(typeLiteral);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${b347dea7-805e-32d6-8d69-7424f2e6eed1}, hash: 7435C821BD61EA09D328E8E0C9C2C46D
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
        doReturn(true).when(injectionPointMock).isOptional();
        doReturn(fieldMock).when(injectionPointMock).getMember();
        List<TypeListenerBinding> typeListenerBindingList = new ArrayList<>();
        MembersInjectorStore target = new MembersInjectorStore(injectorImplMock, typeListenerBindingList);
        Set<InjectionPoint> injectionPointSet = new HashSet<>();
        injectionPointSet.add(injectionPointMock);
        Errors errors = new Errors();
        //Act Statement(s)
        ImmutableList<SingleMemberInjector> result = target.getInjectors(injectionPointSet, errors);
        ImmutableList immutableList = ImmutableList.of();
        //Assert statement(s)
        assertThat(result, equalTo(immutableList));
        verify(injectionPointMock).isOptional();
        verify(injectionPointMock).getMember();
    }

    //Sapient generated method id: ${31a57cce-4483-30d4-9278-3e24e7e41dbe}, hash: 501072303475DD0E37D05A7044227B56
    @Ignore()
    @Test()
    public void getInjectorsWhenInjectionPointNotIsOptionalAndInjectionPointGetMemberNotInstanceOfField() throws ErrorsException {
        /* Branches:
         * (for-each(injectionPoints)) : true
         * (injectionPoint.isOptional()) : false
         * (injectionPoint.getMember() instanceof Field) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn(false).when(injectionPointMock).isOptional();
        Member memberMock = mock(Member.class);
        doReturn(memberMock).when(injectionPointMock).getMember();
        List<TypeListenerBinding> typeListenerBindingList = new ArrayList<>();
        MembersInjectorStore target = new MembersInjectorStore(injectorImplMock, typeListenerBindingList);
        Set<InjectionPoint> injectionPointSet = new HashSet<>();
        injectionPointSet.add(injectionPointMock);
        Errors errors = new Errors();
        //Act Statement(s)
        ImmutableList<SingleMemberInjector> result = target.getInjectors(injectionPointSet, errors);
        ImmutableList immutableList = ImmutableList.of();
        //Assert statement(s)
        assertThat(result, equalTo(immutableList));
        verify(injectionPointMock).isOptional();
        verify(injectionPointMock).getMember();
    }

    //Sapient generated method id: ${ea47e7b4-8229-3dde-ae0c-f6f7ef8bf8e3}, hash: CBEE910FC3079435B54628DD3C2EF1F5
    @Ignore()
    @Test()
    public void getInjectorsWhenCaughtErrorsException() throws ErrorsException {
        /* Branches:
         * (for-each(injectionPoints)) : true
         * (injectionPoint.isOptional()) : true
         * (injectionPoint.getMember() instanceof Field) : true
         * (catch-exception (ErrorsException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn(true).when(injectionPointMock).isOptional();
        doReturn(fieldMock).when(injectionPointMock).getMember();
        List<TypeListenerBinding> typeListenerBindingList = new ArrayList<>();
        typeListenerBindingList.add(typeListenerBindingMock);
        MembersInjectorStore target = new MembersInjectorStore(injectorImplMock, typeListenerBindingList);
        Set<InjectionPoint> injectionPointSet = new HashSet<>();
        injectionPointSet.add(injectionPointMock);
        Errors errors = new Errors();
        //Act Statement(s)
        ImmutableList<SingleMemberInjector> result = target.getInjectors(injectionPointSet, errors);
        ImmutableList immutableList = ImmutableList.of();
        //Assert statement(s)
        assertThat(result, equalTo(immutableList));
        verify(injectionPointMock).isOptional();
        verify(injectionPointMock).getMember();
    }

    //Sapient generated method id: ${e32eaa49-e2bd-31d7-99a5-2d88bf1919f8}, hash: DB182D727E223286B32C219C600ABC68
    @Ignore()
    @Test()
    public void getInjectorsWhenInjectionPointGetMemberInstanceOfFieldAndCaughtErrorsException() throws ErrorsException {
        /* Branches:
         * (for-each(injectionPoints)) : true
         * (injectionPoint.isOptional()) : false
         * (injectionPoint.getMember() instanceof Field) : true
         * (catch-exception (ErrorsException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn(false).when(injectionPointMock).isOptional();
        doReturn(fieldMock).when(injectionPointMock).getMember();
        List<TypeListenerBinding> typeListenerBindingList = new ArrayList<>();
        MembersInjectorStore target = new MembersInjectorStore(injectorImplMock, typeListenerBindingList);
        Set<InjectionPoint> injectionPointSet = new HashSet<>();
        injectionPointSet.add(injectionPointMock);
        Errors errors = new Errors();
        //Act Statement(s)
        ImmutableList<SingleMemberInjector> result = target.getInjectors(injectionPointSet, errors);
        ImmutableList immutableList = ImmutableList.of();
        //Assert statement(s)
        assertThat(result, equalTo(immutableList));
        verify(injectionPointMock).isOptional();
        verify(injectionPointMock).getMember();
    }

    //Sapient generated method id: ${b10e9b8d-65b1-386d-9175-08d34346db5c}, hash: 4261C80312C91E5A22F22ED86CA715C2
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
        typeListenerBindingList.add(typeListenerBindingMock);
        MembersInjectorStore target = new MembersInjectorStore(injectorImplMock, typeListenerBindingList);
        //Act Statement(s)
        ImmutableListMultimap<TypeLiteral<?>, InjectionPoint> result = target.getAllInjectionPoints();
        ImmutableListMultimap immutableListMultimap = ImmutableListMultimap.builder().build();
        //Assert statement(s)
        assertThat(result, equalTo(immutableListMultimap));
    }
}

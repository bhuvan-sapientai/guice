package com.google.inject.internal;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.util.List;

import com.google.inject.binder.ConstantBindingBuilder;

import java.lang.annotation.Annotation;

import com.google.inject.spi.Element;
import com.google.inject.Binder;

import java.util.ArrayList;

import com.google.inject.Key;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;

import org.junit.Ignore;

public class ConstantBindingBuilderImplSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Binder binderMock = mock(Binder.class, "binder");

    private final BindingImpl<Object> bindingImplMock = mock(BindingImpl.class);

    private final Enum enumMock = mock(Enum.class);

    private final Key<Object> keyMock = mock(Key.class);

    private final Key keyMock2 = mock(Key.class);

    private final Key<Object> keyMock3 = mock(Key.class);

    private final Scoping scopingMock = mock(Scoping.class);

    //Sapient generated method id: ${fba982c0-cd9f-393d-9f7a-c290cdb8b7b3}, hash: 02C1D83C62964A597C2BA77E4C0C62DF
    @Ignore()
    @Test()
    public void annotatedWithTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Scoping scoping = Scoping.UNSCOPED;
        UntargettedBindingImpl untargettedBindingImpl = new UntargettedBindingImpl(object, keyMock, scoping);
        List<Element> elementList = new ArrayList<>();
        elementList.add(untargettedBindingImpl);
        ConstantBindingBuilderImpl target = new ConstantBindingBuilderImpl(binderMock, elementList, object);
        //Act Statement(s)
        ConstantBindingBuilder result = target.annotatedWith(Annotation.class);
        //Assert statement(s)
        assertThat(result, equalTo(target));
    }

    //Sapient generated method id: ${cd6f4bf5-9179-3a0f-b567-d99c9eb94b6f}, hash: 3C3A5BF4BD566DFCE638E629B28B3F4E
    @Ignore()
    @Test()
    public void annotatedWith1Test() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Scoping scoping = Scoping.UNSCOPED;
        UntargettedBindingImpl untargettedBindingImpl = new UntargettedBindingImpl(object, keyMock, scoping);
        List<Element> elementList = new ArrayList<>();
        elementList.add(untargettedBindingImpl);
        ConstantBindingBuilderImpl target = new ConstantBindingBuilderImpl(binderMock, elementList, object);
        Annotation annotationMock = mock(Annotation.class);
        //Act Statement(s)
        ConstantBindingBuilder result = target.annotatedWith(annotationMock);
        //Assert statement(s)
        assertThat(result, equalTo(target));
    }

    //Sapient generated method id: ${7ed4ad84-b0d7-3a5c-8205-487ab7a7fe65}, hash: D63A6A0911F188DAA9346E937D5BBF48
    @Ignore()
    @Test()
    public void toWhenKeyTypeIsSet() {
        /* Branches:
         * (keyTypeIsSet()) : true  #  inside toConstant method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Scoping scoping = Scoping.UNSCOPED;
        UntargettedBindingImpl untargettedBindingImpl = new UntargettedBindingImpl(object, keyMock, scoping);
        List<Element> elementList = new ArrayList<>();
        elementList.add(untargettedBindingImpl);
        ConstantBindingBuilderImpl target = spy(new ConstantBindingBuilderImpl(binderMock, elementList, object));
        doReturn(true).when(target).keyTypeIsSet();
        Object[] objectArray = new Object[]{};
        doNothing().when(binderMock).addError("Constant value is set more than once.", objectArray);
        //Act Statement(s)
        target.to("value1");
        //Assert statement(s)
        verify(target).keyTypeIsSet();
        verify(binderMock).addError("Constant value is set more than once.", objectArray);
    }

    //Sapient generated method id: ${a0319a7a-421e-3260-8c8a-a40dd9770f2d}, hash: A1EC950CD87A9C0C35F98EA29BB6660F
    @Ignore()
    @Test()
    public void toWhenInstanceAsTIsNull() {
        /* Branches:
         * (keyTypeIsSet()) : false  #  inside toConstant method
         * (instanceAsT == null) : true  #  inside toConstant method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Scoping scoping = Scoping.UNSCOPED;
        UntargettedBindingImpl untargettedBindingImpl = new UntargettedBindingImpl(object, keyMock, scoping);
        List<Element> elementList = new ArrayList<>();
        elementList.add(untargettedBindingImpl);
        ConstantBindingBuilderImpl target = spy(new ConstantBindingBuilderImpl(binderMock, elementList, object));
        doReturn(false).when(target).keyTypeIsSet();
        doReturn(bindingImplMock).when(target).getBinding();
        doReturn(keyMock2).when(bindingImplMock).getKey();
        doReturn(keyMock3).when(keyMock2).ofType(String.class);
        Object object2 = new Object();
        doReturn(object2).when(bindingImplMock).getSource();
        doReturn(scopingMock).when(bindingImplMock).getScoping();
        Object[] objectArray = new Object[]{};
        doNothing().when(binderMock).addError("Binding to null instances is not allowed. Use toProvider(Providers.of(null)) if this is your intended behaviour.", objectArray);
        //Act Statement(s)
        target.to((String) null);
        //Assert statement(s)
        verify(target).keyTypeIsSet();
        verify(target).getBinding();
        verify(bindingImplMock).getKey();
        verify(keyMock2).ofType(String.class);
        verify(bindingImplMock).getSource();
        verify(bindingImplMock).getScoping();
        verify(binderMock).addError("Binding to null instances is not allowed. Use toProvider(Providers.of(null)) if this is your intended behaviour.", objectArray);
    }

    //Sapient generated method id: ${77a073f9-8b41-330b-b69f-11decf133960}, hash: 75D8ECB488220D730C6A5FAF0F965E60
    @Ignore()
    @Test()
    public void to1WhenKeyTypeIsSet() {
        /* Branches:
         * (keyTypeIsSet()) : true  #  inside toConstant method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Scoping scoping = Scoping.UNSCOPED;
        UntargettedBindingImpl untargettedBindingImpl = new UntargettedBindingImpl(object, keyMock, scoping);
        List<Element> elementList = new ArrayList<>();
        elementList.add(untargettedBindingImpl);
        ConstantBindingBuilderImpl target = spy(new ConstantBindingBuilderImpl(binderMock, elementList, object));
        doReturn(true).when(target).keyTypeIsSet();
        Object[] objectArray = new Object[]{};
        doNothing().when(binderMock).addError("Constant value is set more than once.", objectArray);
        //Act Statement(s)
        target.to(1);
        //Assert statement(s)
        verify(target).keyTypeIsSet();
        verify(binderMock).addError("Constant value is set more than once.", objectArray);
    }

    //Sapient generated method id: ${51f8614e-49a6-33ca-9081-d95a4f736d31}, hash: CA666539D425F6DE3E6B13CC590AD565
    @Ignore()
    @Test()
    public void to1WhenInstanceAsTIsNull() {
        /* Branches:
         * (keyTypeIsSet()) : false  #  inside toConstant method
         * (instanceAsT == null) : true  #  inside toConstant method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Scoping scoping = Scoping.UNSCOPED;
        UntargettedBindingImpl untargettedBindingImpl = new UntargettedBindingImpl(object, keyMock, scoping);
        List<Element> elementList = new ArrayList<>();
        elementList.add(untargettedBindingImpl);
        ConstantBindingBuilderImpl target = spy(new ConstantBindingBuilderImpl(binderMock, elementList, object));
        doReturn(false).when(target).keyTypeIsSet();
        doReturn(bindingImplMock).when(target).getBinding();
        doReturn(keyMock2).when(bindingImplMock).getKey();
        doReturn(keyMock3).when(keyMock2).ofType(Integer.class);
        Object object2 = new Object();
        doReturn(object2).when(bindingImplMock).getSource();
        doReturn(scopingMock).when(bindingImplMock).getScoping();
        Object[] objectArray = new Object[]{};
        doNothing().when(binderMock).addError("Binding to null instances is not allowed. Use toProvider(Providers.of(null)) if this is your intended behaviour.", objectArray);
        //Act Statement(s)
        target.to(1);
        //Assert statement(s)
        verify(target).keyTypeIsSet();
        verify(target).getBinding();
        verify(bindingImplMock).getKey();
        verify(keyMock2).ofType(Integer.class);
        verify(bindingImplMock).getSource();
        verify(bindingImplMock).getScoping();
        verify(binderMock).addError("Binding to null instances is not allowed. Use toProvider(Providers.of(null)) if this is your intended behaviour.", objectArray);
    }

    //Sapient generated method id: ${5f619745-e2b2-3b1b-8514-73f3b1b3dc1e}, hash: A71ADD61742E2620F720B5B70B48EC7D
    @Ignore()
    @Test()
    public void to2WhenKeyTypeIsSet() {
        /* Branches:
         * (keyTypeIsSet()) : true  #  inside toConstant method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Scoping scoping = Scoping.UNSCOPED;
        UntargettedBindingImpl untargettedBindingImpl = new UntargettedBindingImpl(object, keyMock, scoping);
        List<Element> elementList = new ArrayList<>();
        elementList.add(untargettedBindingImpl);
        ConstantBindingBuilderImpl target = spy(new ConstantBindingBuilderImpl(binderMock, elementList, object));
        doReturn(true).when(target).keyTypeIsSet();
        Object[] objectArray = new Object[]{};
        doNothing().when(binderMock).addError("Constant value is set more than once.", objectArray);
        //Act Statement(s)
        target.to(1L);
        //Assert statement(s)
        verify(target).keyTypeIsSet();
        verify(binderMock).addError("Constant value is set more than once.", objectArray);
    }

    //Sapient generated method id: ${1f66c2bf-f2c0-38d2-8a5b-bbeedf90c697}, hash: 112CBC8D51E8085BA04441480741CE88
    @Ignore()
    @Test()
    public void to2WhenInstanceAsTIsNull() {
        /* Branches:
         * (keyTypeIsSet()) : false  #  inside toConstant method
         * (instanceAsT == null) : true  #  inside toConstant method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Scoping scoping = Scoping.UNSCOPED;
        UntargettedBindingImpl untargettedBindingImpl = new UntargettedBindingImpl(object, keyMock, scoping);
        List<Element> elementList = new ArrayList<>();
        elementList.add(untargettedBindingImpl);
        ConstantBindingBuilderImpl target = spy(new ConstantBindingBuilderImpl(binderMock, elementList, object));
        doReturn(false).when(target).keyTypeIsSet();
        doReturn(bindingImplMock).when(target).getBinding();
        doReturn(keyMock2).when(bindingImplMock).getKey();
        doReturn(keyMock3).when(keyMock2).ofType(Long.class);
        Object object2 = new Object();
        doReturn(object2).when(bindingImplMock).getSource();
        doReturn(scopingMock).when(bindingImplMock).getScoping();
        Object[] objectArray = new Object[]{};
        doNothing().when(binderMock).addError("Binding to null instances is not allowed. Use toProvider(Providers.of(null)) if this is your intended behaviour.", objectArray);
        //Act Statement(s)
        target.to(1L);
        //Assert statement(s)
        verify(target).keyTypeIsSet();
        verify(target).getBinding();
        verify(bindingImplMock).getKey();
        verify(keyMock2).ofType(Long.class);
        verify(bindingImplMock).getSource();
        verify(bindingImplMock).getScoping();
        verify(binderMock).addError("Binding to null instances is not allowed. Use toProvider(Providers.of(null)) if this is your intended behaviour.", objectArray);
    }

    //Sapient generated method id: ${81562361-9c2d-377c-827c-6aeb8d0537e5}, hash: 5B1F5D0E2B2F43F9FAEA5D03432EB547
    @Ignore()
    @Test()
    public void to3WhenKeyTypeIsSet() {
        /* Branches:
         * (keyTypeIsSet()) : true  #  inside toConstant method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Scoping scoping = Scoping.UNSCOPED;
        UntargettedBindingImpl untargettedBindingImpl = new UntargettedBindingImpl(object, keyMock, scoping);
        List<Element> elementList = new ArrayList<>();
        elementList.add(untargettedBindingImpl);
        ConstantBindingBuilderImpl target = spy(new ConstantBindingBuilderImpl(binderMock, elementList, object));
        doReturn(true).when(target).keyTypeIsSet();
        Object[] objectArray = new Object[]{};
        doNothing().when(binderMock).addError("Constant value is set more than once.", objectArray);
        //Act Statement(s)
        target.to(false);
        //Assert statement(s)
        verify(target).keyTypeIsSet();
        verify(binderMock).addError("Constant value is set more than once.", objectArray);
    }

    //Sapient generated method id: ${359c7d51-8821-3932-bcad-1e008633fb34}, hash: B3826381B9578CF47231BF5354F5F2BA
    @Ignore()
    @Test()
    public void to3WhenInstanceAsTIsNull() {
        /* Branches:
         * (keyTypeIsSet()) : false  #  inside toConstant method
         * (instanceAsT == null) : true  #  inside toConstant method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Element elementMock = mock(Element.class);
        Object object = new Object();
        Scoping scoping = Scoping.UNSCOPED;
        UntargettedBindingImpl untargettedBindingImpl = new UntargettedBindingImpl(object, keyMock, scoping);
        List<Element> elementList = new ArrayList<>();
        elementList.add(elementMock);
        elementList.add(untargettedBindingImpl);
        ConstantBindingBuilderImpl target = spy(new ConstantBindingBuilderImpl(binderMock, elementList, object));
        doReturn(false).when(target).keyTypeIsSet();
        doReturn(bindingImplMock).when(target).getBinding();
        doReturn(keyMock2).when(bindingImplMock).getKey();
        doReturn(keyMock3).when(keyMock2).ofType(Boolean.class);
        Object object2 = new Object();
        doReturn(object2).when(bindingImplMock).getSource();
        doReturn(scopingMock).when(bindingImplMock).getScoping();
        Object[] objectArray = new Object[]{};
        doNothing().when(binderMock).addError("Binding to null instances is not allowed. Use toProvider(Providers.of(null)) if this is your intended behaviour.", objectArray);
        //Act Statement(s)
        target.to(false);
        //Assert statement(s)
        verify(target).keyTypeIsSet();
        verify(target).getBinding();
        verify(bindingImplMock).getKey();
        verify(keyMock2).ofType(Boolean.class);
        verify(bindingImplMock).getSource();
        verify(bindingImplMock).getScoping();
        verify(binderMock).addError("Binding to null instances is not allowed. Use toProvider(Providers.of(null)) if this is your intended behaviour.", objectArray);
    }

    //Sapient generated method id: ${6ce95c69-87ba-3f33-ac7e-dd20a7f845f7}, hash: 525479CF3E6E61DF6BE3065877EF1DF1
    @Ignore()
    @Test()
    public void to4WhenKeyTypeIsSet() {
        /* Branches:
         * (keyTypeIsSet()) : true  #  inside toConstant method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Scoping scoping = Scoping.UNSCOPED;
        UntargettedBindingImpl untargettedBindingImpl = new UntargettedBindingImpl(object, keyMock, scoping);
        List<Element> elementList = new ArrayList<>();
        elementList.add(untargettedBindingImpl);
        ConstantBindingBuilderImpl target = spy(new ConstantBindingBuilderImpl(binderMock, elementList, object));
        doReturn(true).when(target).keyTypeIsSet();
        Object[] objectArray = new Object[]{};
        doNothing().when(binderMock).addError("Constant value is set more than once.", objectArray);
        //Act Statement(s)
        target.to(Double.parseDouble("1.0"));
        //Assert statement(s)
        verify(target).keyTypeIsSet();
        verify(binderMock).addError("Constant value is set more than once.", objectArray);
    }

    //Sapient generated method id: ${677a92e6-5f11-3eaf-b7ce-2a996b19fb85}, hash: 037AE4EBBB340EBD490AC37FAA25DD6D
    @Ignore()
    @Test()
    public void to4WhenInstanceAsTIsNull() {
        /* Branches:
         * (keyTypeIsSet()) : false  #  inside toConstant method
         * (instanceAsT == null) : true  #  inside toConstant method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Scoping scoping = Scoping.UNSCOPED;
        UntargettedBindingImpl untargettedBindingImpl = new UntargettedBindingImpl(object, keyMock, scoping);
        List<Element> elementList = new ArrayList<>();
        elementList.add(untargettedBindingImpl);
        ConstantBindingBuilderImpl target = spy(new ConstantBindingBuilderImpl(binderMock, elementList, object));
        doReturn(false).when(target).keyTypeIsSet();
        doReturn(bindingImplMock).when(target).getBinding();
        doReturn(keyMock2).when(bindingImplMock).getKey();
        doReturn(keyMock3).when(keyMock2).ofType(Double.class);
        Object object2 = new Object();
        doReturn(object2).when(bindingImplMock).getSource();
        doReturn(scopingMock).when(bindingImplMock).getScoping();
        Object[] objectArray = new Object[]{};
        doNothing().when(binderMock).addError("Binding to null instances is not allowed. Use toProvider(Providers.of(null)) if this is your intended behaviour.", objectArray);
        //Act Statement(s)
        target.to(Double.parseDouble("1.0"));
        //Assert statement(s)
        verify(target).keyTypeIsSet();
        verify(target).getBinding();
        verify(bindingImplMock).getKey();
        verify(keyMock2).ofType(Double.class);
        verify(bindingImplMock).getSource();
        verify(bindingImplMock).getScoping();
        verify(binderMock).addError("Binding to null instances is not allowed. Use toProvider(Providers.of(null)) if this is your intended behaviour.", objectArray);
    }

    //Sapient generated method id: ${00d5a915-8965-37ed-be57-1546c8947a25}, hash: 9AC6521BF63B52A17E2B2135DDB39725
    @Ignore()
    @Test()
    public void to5WhenKeyTypeIsSet() {
        /* Branches:
         * (keyTypeIsSet()) : true  #  inside toConstant method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Scoping scoping = Scoping.UNSCOPED;
        UntargettedBindingImpl untargettedBindingImpl = new UntargettedBindingImpl(object, keyMock, scoping);
        List<Element> elementList = new ArrayList<>();
        elementList.add(untargettedBindingImpl);
        ConstantBindingBuilderImpl target = spy(new ConstantBindingBuilderImpl(binderMock, elementList, object));
        doReturn(true).when(target).keyTypeIsSet();
        Object[] objectArray = new Object[]{};
        doNothing().when(binderMock).addError("Constant value is set more than once.", objectArray);
        //Act Statement(s)
        target.to(Float.parseFloat("1.0"));
        //Assert statement(s)
        verify(target).keyTypeIsSet();
        verify(binderMock).addError("Constant value is set more than once.", objectArray);
    }

    //Sapient generated method id: ${be6f2b93-5b49-3c00-bc8a-7f8742c25a02}, hash: DC1866CEF7DFE5DE052E0F265E23ED6E
    @Ignore()
    @Test()
    public void to5WhenInstanceAsTIsNull() {
        /* Branches:
         * (keyTypeIsSet()) : false  #  inside toConstant method
         * (instanceAsT == null) : true  #  inside toConstant method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Scoping scoping = Scoping.UNSCOPED;
        UntargettedBindingImpl untargettedBindingImpl = new UntargettedBindingImpl(object, keyMock, scoping);
        List<Element> elementList = new ArrayList<>();
        elementList.add(untargettedBindingImpl);
        ConstantBindingBuilderImpl target = spy(new ConstantBindingBuilderImpl(binderMock, elementList, object));
        doReturn(false).when(target).keyTypeIsSet();
        doReturn(bindingImplMock).when(target).getBinding();
        doReturn(keyMock2).when(bindingImplMock).getKey();
        doReturn(keyMock3).when(keyMock2).ofType(Float.class);
        Object object2 = new Object();
        doReturn(object2).when(bindingImplMock).getSource();
        doReturn(scopingMock).when(bindingImplMock).getScoping();
        Object[] objectArray = new Object[]{};
        doNothing().when(binderMock).addError("Binding to null instances is not allowed. Use toProvider(Providers.of(null)) if this is your intended behaviour.", objectArray);
        //Act Statement(s)
        target.to(Float.parseFloat("1.0"));
        //Assert statement(s)
        verify(target).keyTypeIsSet();
        verify(target).getBinding();
        verify(bindingImplMock).getKey();
        verify(keyMock2).ofType(Float.class);
        verify(bindingImplMock).getSource();
        verify(bindingImplMock).getScoping();
        verify(binderMock).addError("Binding to null instances is not allowed. Use toProvider(Providers.of(null)) if this is your intended behaviour.", objectArray);
    }

    //Sapient generated method id: ${4ae27ad2-c976-3925-8ff5-46a6d3c98e47}, hash: 6C3D4547DF3A6F9B8761EFB0069D0358
    @Ignore()
    @Test()
    public void to6WhenKeyTypeIsSet() {
        /* Branches:
         * (keyTypeIsSet()) : true  #  inside toConstant method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Scoping scoping = Scoping.UNSCOPED;
        UntargettedBindingImpl untargettedBindingImpl = new UntargettedBindingImpl(object, keyMock, scoping);
        List<Element> elementList = new ArrayList<>();
        elementList.add(untargettedBindingImpl);
        ConstantBindingBuilderImpl target = spy(new ConstantBindingBuilderImpl(binderMock, elementList, object));
        doReturn(true).when(target).keyTypeIsSet();
        Object[] objectArray = new Object[]{};
        doNothing().when(binderMock).addError("Constant value is set more than once.", objectArray);
        //Act Statement(s)
        target.to((short) 1);
        //Assert statement(s)
        verify(target).keyTypeIsSet();
        verify(binderMock).addError("Constant value is set more than once.", objectArray);
    }

    //Sapient generated method id: ${c7a7dc5e-5583-3b6c-a831-3473bd59231d}, hash: A4A7CC33F0940208265DB397E230BE79
    @Ignore()
    @Test()
    public void to6WhenInstanceAsTIsNull() {
        /* Branches:
         * (keyTypeIsSet()) : false  #  inside toConstant method
         * (instanceAsT == null) : true  #  inside toConstant method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Scoping scoping = Scoping.UNSCOPED;
        UntargettedBindingImpl untargettedBindingImpl = new UntargettedBindingImpl(object, keyMock, scoping);
        List<Element> elementList = new ArrayList<>();
        elementList.add(untargettedBindingImpl);
        ConstantBindingBuilderImpl target = spy(new ConstantBindingBuilderImpl(binderMock, elementList, object));
        doReturn(false).when(target).keyTypeIsSet();
        doReturn(bindingImplMock).when(target).getBinding();
        doReturn(keyMock2).when(bindingImplMock).getKey();
        doReturn(keyMock3).when(keyMock2).ofType(Short.class);
        Object object2 = new Object();
        doReturn(object2).when(bindingImplMock).getSource();
        doReturn(scopingMock).when(bindingImplMock).getScoping();
        Object[] objectArray = new Object[]{};
        doNothing().when(binderMock).addError("Binding to null instances is not allowed. Use toProvider(Providers.of(null)) if this is your intended behaviour.", objectArray);
        //Act Statement(s)
        target.to((short) 1);
        //Assert statement(s)
        verify(target).keyTypeIsSet();
        verify(target).getBinding();
        verify(bindingImplMock).getKey();
        verify(keyMock2).ofType(Short.class);
        verify(bindingImplMock).getSource();
        verify(bindingImplMock).getScoping();
        verify(binderMock).addError("Binding to null instances is not allowed. Use toProvider(Providers.of(null)) if this is your intended behaviour.", objectArray);
    }

    //Sapient generated method id: ${706fcd75-713c-3329-bcb2-216c75693b7a}, hash: 24E2CF40546E4FE5B8BC87254AF448A8
    @Ignore()
    @Test()
    public void to7WhenKeyTypeIsSet() {
        /* Branches:
         * (keyTypeIsSet()) : true  #  inside toConstant method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Scoping scoping = Scoping.UNSCOPED;
        UntargettedBindingImpl untargettedBindingImpl = new UntargettedBindingImpl(object, keyMock, scoping);
        List<Element> elementList = new ArrayList<>();
        elementList.add(untargettedBindingImpl);
        ConstantBindingBuilderImpl target = spy(new ConstantBindingBuilderImpl(binderMock, elementList, object));
        doReturn(true).when(target).keyTypeIsSet();
        Object[] objectArray = new Object[]{};
        doNothing().when(binderMock).addError("Constant value is set more than once.", objectArray);
        //Act Statement(s)
        target.to('A');
        //Assert statement(s)
        verify(target).keyTypeIsSet();
        verify(binderMock).addError("Constant value is set more than once.", objectArray);
    }

    //Sapient generated method id: ${49cad698-3232-3dfd-bf1a-ac72778719fe}, hash: A45DD8BE86C13F91BF7A9A72D5948DE7
    @Ignore()
    @Test()
    public void to7WhenInstanceAsTIsNull() {
        /* Branches:
         * (keyTypeIsSet()) : false  #  inside toConstant method
         * (instanceAsT == null) : true  #  inside toConstant method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Scoping scoping = Scoping.UNSCOPED;
        UntargettedBindingImpl untargettedBindingImpl = new UntargettedBindingImpl(object, keyMock, scoping);
        List<Element> elementList = new ArrayList<>();
        elementList.add(untargettedBindingImpl);
        ConstantBindingBuilderImpl target = spy(new ConstantBindingBuilderImpl(binderMock, elementList, object));
        doReturn(false).when(target).keyTypeIsSet();
        doReturn(bindingImplMock).when(target).getBinding();
        doReturn(keyMock2).when(bindingImplMock).getKey();
        doReturn(keyMock3).when(keyMock2).ofType(Character.class);
        Object object2 = new Object();
        doReturn(object2).when(bindingImplMock).getSource();
        doReturn(scopingMock).when(bindingImplMock).getScoping();
        Object[] objectArray = new Object[]{};
        doNothing().when(binderMock).addError("Binding to null instances is not allowed. Use toProvider(Providers.of(null)) if this is your intended behaviour.", objectArray);
        //Act Statement(s)
        target.to('A');
        //Assert statement(s)
        verify(target).keyTypeIsSet();
        verify(target).getBinding();
        verify(bindingImplMock).getKey();
        verify(keyMock2).ofType(Character.class);
        verify(bindingImplMock).getSource();
        verify(bindingImplMock).getScoping();
        verify(binderMock).addError("Binding to null instances is not allowed. Use toProvider(Providers.of(null)) if this is your intended behaviour.", objectArray);
    }

    //Sapient generated method id: ${66de58e6-f8cf-32cd-8895-b4794e85bbfc}, hash: 97C96FA9CB84EED355EC015CFA6FEEEB
    @Ignore()
    @Test()
    public void to8WhenKeyTypeIsSet() {
        /* Branches:
         * (keyTypeIsSet()) : true  #  inside toConstant method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Scoping scoping = Scoping.UNSCOPED;
        UntargettedBindingImpl untargettedBindingImpl = new UntargettedBindingImpl(object, keyMock, scoping);
        List<Element> elementList = new ArrayList<>();
        elementList.add(untargettedBindingImpl);
        ConstantBindingBuilderImpl target = spy(new ConstantBindingBuilderImpl(binderMock, elementList, object));
        doReturn(true).when(target).keyTypeIsSet();
        Object[] objectArray = new Object[]{};
        doNothing().when(binderMock).addError("Constant value is set more than once.", objectArray);
        //Act Statement(s)
        target.to((byte) 1);
        //Assert statement(s)
        verify(target).keyTypeIsSet();
        verify(binderMock).addError("Constant value is set more than once.", objectArray);
    }

    //Sapient generated method id: ${db0e5199-9bcd-3a6a-839b-80a3811bb89b}, hash: 8E7476FDE0FB7ED2EDDB10C039436D60
    @Ignore()
    @Test()
    public void to8WhenInstanceAsTIsNull() {
        /* Branches:
         * (keyTypeIsSet()) : false  #  inside toConstant method
         * (instanceAsT == null) : true  #  inside toConstant method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Scoping scoping = Scoping.UNSCOPED;
        UntargettedBindingImpl untargettedBindingImpl = new UntargettedBindingImpl(object, keyMock, scoping);
        List<Element> elementList = new ArrayList<>();
        elementList.add(untargettedBindingImpl);
        ConstantBindingBuilderImpl target = spy(new ConstantBindingBuilderImpl(binderMock, elementList, object));
        doReturn(false).when(target).keyTypeIsSet();
        doReturn(bindingImplMock).when(target).getBinding();
        doReturn(keyMock2).when(bindingImplMock).getKey();
        doReturn(keyMock3).when(keyMock2).ofType(Byte.class);
        Object object2 = new Object();
        doReturn(object2).when(bindingImplMock).getSource();
        doReturn(scopingMock).when(bindingImplMock).getScoping();
        Object[] objectArray = new Object[]{};
        doNothing().when(binderMock).addError("Binding to null instances is not allowed. Use toProvider(Providers.of(null)) if this is your intended behaviour.", objectArray);
        //Act Statement(s)
        target.to((byte) 1);
        //Assert statement(s)
        verify(target).keyTypeIsSet();
        verify(target).getBinding();
        verify(bindingImplMock).getKey();
        verify(keyMock2).ofType(Byte.class);
        verify(bindingImplMock).getSource();
        verify(bindingImplMock).getScoping();
        verify(binderMock).addError("Binding to null instances is not allowed. Use toProvider(Providers.of(null)) if this is your intended behaviour.", objectArray);
    }

    //Sapient generated method id: ${f6b57440-babf-3c1f-a4c5-68777251f01d}, hash: DB2D311636E3B4D0150301CEF4299054
    @Ignore()
    @Test()
    public void to9WhenKeyTypeIsSet() {
        /* Branches:
         * (keyTypeIsSet()) : true  #  inside toConstant method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Scoping scoping = Scoping.UNSCOPED;
        UntargettedBindingImpl untargettedBindingImpl = new UntargettedBindingImpl(object, keyMock, scoping);
        List<Element> elementList = new ArrayList<>();
        elementList.add(untargettedBindingImpl);
        ConstantBindingBuilderImpl target = spy(new ConstantBindingBuilderImpl(binderMock, elementList, object));
        doReturn(true).when(target).keyTypeIsSet();
        Object[] objectArray = new Object[]{};
        doNothing().when(binderMock).addError("Constant value is set more than once.", objectArray);
        //Act Statement(s)
        target.to(Object.class);
        //Assert statement(s)
        verify(target).keyTypeIsSet();
        verify(binderMock).addError("Constant value is set more than once.", objectArray);
    }

    //Sapient generated method id: ${5cf59733-762b-3f44-9ff2-d8f4d73011d3}, hash: 736F987DA979D5623EF84D6A700F23FA
    @Ignore()
    @Test()
    public void to9WhenInstanceAsTIsNull() {
        /* Branches:
         * (keyTypeIsSet()) : false  #  inside toConstant method
         * (instanceAsT == null) : true  #  inside toConstant method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Scoping scoping = Scoping.UNSCOPED;
        UntargettedBindingImpl untargettedBindingImpl = new UntargettedBindingImpl(object, keyMock, scoping);
        List<Element> elementList = new ArrayList<>();
        elementList.add(untargettedBindingImpl);
        ConstantBindingBuilderImpl target = spy(new ConstantBindingBuilderImpl(binderMock, elementList, object));
        doReturn(false).when(target).keyTypeIsSet();
        doReturn(bindingImplMock).when(target).getBinding();
        doReturn(keyMock2).when(bindingImplMock).getKey();
        doReturn(keyMock3).when(keyMock2).ofType(Class.class);
        Object object2 = new Object();
        doReturn(object2).when(bindingImplMock).getSource();
        doReturn(scopingMock).when(bindingImplMock).getScoping();
        Object[] objectArray = new Object[]{};
        doNothing().when(binderMock).addError("Binding to null instances is not allowed. Use toProvider(Providers.of(null)) if this is your intended behaviour.", objectArray);
        Class<?> _class = null;
        //Act Statement(s)
        target.to(_class);
        //Assert statement(s)
        verify(target).keyTypeIsSet();
        verify(target).getBinding();
        verify(bindingImplMock).getKey();
        verify(keyMock2).ofType(Class.class);
        verify(bindingImplMock).getSource();
        verify(bindingImplMock).getScoping();
        verify(binderMock).addError("Binding to null instances is not allowed. Use toProvider(Providers.of(null)) if this is your intended behaviour.", objectArray);
    }

    //Sapient generated method id: ${57fd61e1-b7c0-3e49-86b8-94a9495d80e3}, hash: FF03367FF1EE93F29A64162BBCF94D91
    @Ignore()
    @Test()
    public void to10WhenKeyTypeIsSet() {
        /* Branches:
         * (keyTypeIsSet()) : true  #  inside toConstant method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Scoping scoping = Scoping.UNSCOPED;
        UntargettedBindingImpl untargettedBindingImpl = new UntargettedBindingImpl(object, keyMock, scoping);
        List<Element> elementList = new ArrayList<>();
        elementList.add(untargettedBindingImpl);
        ConstantBindingBuilderImpl target = spy(new ConstantBindingBuilderImpl(binderMock, elementList, object));
        doReturn(true).when(target).keyTypeIsSet();
        Object[] objectArray = new Object[]{};
        doNothing().when(binderMock).addError("Constant value is set more than once.", objectArray);
        //Act Statement(s)
        target.to(enumMock);
        //Assert statement(s)
        verify(target).keyTypeIsSet();
        verify(binderMock).addError("Constant value is set more than once.", objectArray);
    }

    //Sapient generated method id: ${cf948cd7-c739-3a8c-9300-b395ce337e78}, hash: 5B35472A830A13A8BD1BE50E64129FCD
    @Ignore()
    @Test()
    public void to10WhenInstanceAsTIsNotNull() {
        /* Branches:
         * (keyTypeIsSet()) : false  #  inside toConstant method
         * (instanceAsT == null) : false  #  inside toConstant method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Scoping scoping = Scoping.UNSCOPED;
        UntargettedBindingImpl untargettedBindingImpl = new UntargettedBindingImpl(object, keyMock, scoping);
        List<Element> elementList = new ArrayList<>();
        elementList.add(untargettedBindingImpl);
        ConstantBindingBuilderImpl target = spy(new ConstantBindingBuilderImpl(binderMock, elementList, object));
        doReturn(false).when(target).keyTypeIsSet();
        doReturn(bindingImplMock).when(target).getBinding();
        doReturn(keyMock2).when(bindingImplMock).getKey();
        doReturn(keyMock3).when(keyMock2).ofType(Object.class);
        Object object2 = new Object();
        doReturn(object2).when(bindingImplMock).getSource();
        doReturn(scopingMock).when(bindingImplMock).getScoping();
        //Act Statement(s)
        target.to(enumMock);
        //Assert statement(s)
        verify(target).keyTypeIsSet();
        verify(target).getBinding();
        verify(bindingImplMock).getKey();
        verify(keyMock2).ofType(Object.class);
        verify(bindingImplMock).getSource();
        verify(bindingImplMock).getScoping();
    }

    //Sapient generated method id: ${363d3698-f34c-39ad-914f-376a19498023}, hash: 3951C804C9D9E0E0A3291DA5D30A1CF1
    @Test()
    public void toStringTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Scoping scoping = Scoping.UNSCOPED;
        UntargettedBindingImpl untargettedBindingImpl = new UntargettedBindingImpl(object, keyMock, scoping);
        List<Element> elementList = new ArrayList<>();
        elementList.add(untargettedBindingImpl);
        ConstantBindingBuilderImpl target = new ConstantBindingBuilderImpl(binderMock, elementList, object);
        //Act Statement(s)
        String result = target.toString();
        //Assert statement(s)
        assertThat(result, equalTo("ConstantBindingBuilder"));
    }
}

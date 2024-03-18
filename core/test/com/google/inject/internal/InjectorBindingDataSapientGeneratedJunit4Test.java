package com.google.inject.internal;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import com.google.inject.spi.InjectionRequest;
import com.google.inject.spi.ScopeBinding;
import com.google.inject.spi.InterceptorBinding;
import com.google.inject.matcher.Matcher;

import java.util.Map;

import com.google.inject.spi.ModuleAnnotatedMethodScannerBinding;
import com.google.inject.spi.TypeConverter;

import java.util.Optional;
import java.util.ArrayList;

import com.google.inject.Key;
import com.google.inject.spi.ProviderLookup;
import com.google.inject.spi.ModuleAnnotatedMethodScanner;
import com.google.inject.spi.MembersInjectorLookup;

import java.lang.annotation.Annotation;

import com.google.inject.TypeLiteral;
import com.google.common.collect.ImmutableList;
import com.google.inject.spi.TypeListenerBinding;
import com.google.common.collect.ImmutableMap;
import com.google.inject.spi.ProvisionListenerBinding;

import java.util.Collection;

import com.google.inject.spi.TypeConverterBinding;
import com.google.inject.Scope;
import com.google.inject.spi.StaticInjectionRequest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

import org.junit.Ignore;

public class InjectorBindingDataSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final InjectorBindingData injectorBindingDataMock = mock(InjectorBindingData.class);

    private final TypeLiteral typeLiteralMock = mock(TypeLiteral.class);

    //Sapient generated method id: ${0dd6d71c-a8b3-368d-a183-30405cb94cf8}, hash: 2D3B6BB331AF1D291A65761C2033192E
    @Ignore()
    @Test()
    public void parentTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        InjectorBindingData target = new InjectorBindingData((Optional) null);
        //Act Statement(s)
        Optional<InjectorBindingData> result = target.parent();
        Optional<InjectorBindingData> injectorBindingDataOptional = Optional.of(injectorBindingDataMock);
        //Assert statement(s)
        assertThat(result, equalTo(injectorBindingDataOptional));
    }

    //Sapient generated method id: ${e1c8601b-bab7-3c30-933b-cbdc9b3c4d76}, hash: AF31D3BA2C91EDFB270B1F3DE5877A98
    @Ignore()
    @Test()
    public void getExplicitBindingWhenParentIsPresent() {
        /* Branches:
         * (binding == null) : true
         * (parent.isPresent()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        BindingImpl bindingImplMock = mock(BindingImpl.class);
        Key<Object> keyMock = mock(Key.class);
        doReturn(bindingImplMock).when(injectorBindingDataMock).getExplicitBinding(keyMock);
        InjectorBindingData target = new InjectorBindingData((Optional) null);
        //Act Statement(s)
        BindingImpl result = target.getExplicitBinding(keyMock);
        //Assert statement(s)
        assertThat(result, equalTo(bindingImplMock));
        verify(injectorBindingDataMock).getExplicitBinding(keyMock);
    }

    //Sapient generated method id: ${5ddc1a43-7470-3514-b8e5-736bca0ffc56}, hash: B0F4BF70B9204709C86FCE58909A0C5B
    @Ignore()
    @Test()
    public void getExplicitBindingWhenParentNotIsPresent() {
        /* Branches:
         * (binding == null) : true
         * (parent.isPresent()) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        InjectorBindingData target = new InjectorBindingData((Optional) null);
        Key key = Key.get(Object.class);
        //Act Statement(s)
        BindingImpl result = target.getExplicitBinding(key);
        //Assert statement(s)
        assertThat(result, is(nullValue()));
    }

    //Sapient generated method id: ${c555a4c5-28f4-326b-b252-a1786d8c446b}, hash: BD96D5C20EF841B3D1EBFEAE2B14F91C
    @Test()
    public void putBindingTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        InjectorBindingData target = new InjectorBindingData((Optional) null);
        Key key = Key.get(Object.class);
        BindingImpl bindingImplMock = mock(BindingImpl.class, "some_binding_value");
        //Act Statement(s)
        target.putBinding(key, bindingImplMock);
    }

    //Sapient generated method id: ${f5907951-e4fd-34fd-bdcc-a01b48ca6717}, hash: 6331947BF035C42C30B551CE4BA096DD
    @Test()
    public void putProviderLookupTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        InjectorBindingData target = new InjectorBindingData((Optional) null);
        Object object = new Object();
        Key keyMock = mock(Key.class);
        ProviderLookup providerLookup = new ProviderLookup(object, keyMock);
        //Act Statement(s)
        target.putProviderLookup(providerLookup);
    }

    //Sapient generated method id: ${a0d04416-4e1f-332e-ad58-1664eb954ab8}, hash: B2EDC2F704A8306DB816732F447FEDCF
    @Test()
    public void putStaticInjectionRequestTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        InjectorBindingData target = new InjectorBindingData((Optional) null);
        StaticInjectionRequest staticInjectionRequestMock = mock(StaticInjectionRequest.class);
        //Act Statement(s)
        target.putStaticInjectionRequest(staticInjectionRequestMock);
    }

    //Sapient generated method id: ${331679fd-4b21-389e-9449-5c72be9c543c}, hash: FF8682D51F6554C29BBFB9CF6479A35D
    @Test()
    public void putInjectionRequestTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        InjectorBindingData target = new InjectorBindingData((Optional) null);
        Object object = new Object();
        Object object2 = new Object();
        InjectionRequest injectionRequest = new InjectionRequest(object, typeLiteralMock, object2);
        //Act Statement(s)
        target.putInjectionRequest(injectionRequest);
    }

    //Sapient generated method id: ${8038f01e-13d2-3df6-8f09-094a7e567c81}, hash: F94E93681DD8BAB8D9E7EE4DE6EA57FC
    @Test()
    public void putMembersInjectorLookupTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        InjectorBindingData target = new InjectorBindingData((Optional) null);
        Object object = new Object();
        MembersInjectorLookup membersInjectorLookup = new MembersInjectorLookup(object, typeLiteralMock);
        //Act Statement(s)
        target.putMembersInjectorLookup(membersInjectorLookup);
    }

    //Sapient generated method id: ${a64b043e-8277-3b45-9fdc-cfc0749a2a7a}, hash: 2339C7520602D5266F2E6499B9384FA5
    @Ignore()
    @Test()
    public void getScopeBindingWhenParentIsPresent() {
        /* Branches:
         * (scopeBinding == null) : true
         * (parent.isPresent()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ScopeBinding scopeBindingMock = mock(ScopeBinding.class);
        doReturn(scopeBindingMock).when(injectorBindingDataMock).getScopeBinding(Annotation.class);
        InjectorBindingData target = new InjectorBindingData((Optional) null);
        //Act Statement(s)
        ScopeBinding result = target.getScopeBinding(Annotation.class);
        //Assert statement(s)
        assertThat(result, equalTo(scopeBindingMock));
        verify(injectorBindingDataMock).getScopeBinding(Annotation.class);
    }

    //Sapient generated method id: ${4e763f7a-f489-30f6-bf5a-467e09093123}, hash: D0B9139778D8353E50652ABF3BBCFE2E
    @Ignore()
    @Test()
    public void getScopeBindingWhenParentNotIsPresent() {
        /* Branches:
         * (scopeBinding == null) : true
         * (parent.isPresent()) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        InjectorBindingData target = new InjectorBindingData((Optional) null);
        //Act Statement(s)
        ScopeBinding result = target.getScopeBinding(Annotation.class);
        //Assert statement(s)
        assertThat(result, is(nullValue()));
    }

    //Sapient generated method id: ${4cf42688-151e-312f-9b88-01bf2793b3f5}, hash: D0284CBF810043119D9ADFDE4C02EB9E
    @Test()
    public void putScopeBindingTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        InjectorBindingData target = new InjectorBindingData((Optional) null);
        ScopeBinding scopeBindingMock = mock(ScopeBinding.class, "SINGLETON");
        //Act Statement(s)
        target.putScopeBinding(Annotation.class, scopeBindingMock);
    }

    //Sapient generated method id: ${53094912-a0bc-3d1f-80b3-642d7c26c1b4}, hash: 0EC13579C186F4C1B5CC50075B23A6C6
    @Test()
    public void getScopeBindingsThisLevelTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        InjectorBindingData target = new InjectorBindingData((Optional) null);
        //Act Statement(s)
        Collection<ScopeBinding> result = target.getScopeBindingsThisLevel();
        //Assert statement(s)
        assertThat(result.size(), equalTo(0));
    }

    //Sapient generated method id: ${70e69b9c-d454-3378-91e5-1581521a301f}, hash: C60FB0BEABF19AEC1A081074E8AC4DCF
    @Test()
    public void getConvertersThisLevelTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        InjectorBindingData target = new InjectorBindingData((Optional) null);
        //Act Statement(s)
        Iterable<TypeConverterBinding> result = target.getConvertersThisLevel();
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${7ab52e49-ddb2-3d9b-b71d-5a9bc26fc21b}, hash: 5E204B4CE8E39695B5892C6D6A846A07
    @Test()
    public void addConverterTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        InjectorBindingData target = new InjectorBindingData((Optional) null);
        Object object = new Object();
        Matcher matcherMock = mock(Matcher.class);
        TypeConverter typeConverterMock = mock(TypeConverter.class);
        TypeConverterBinding typeConverterBinding = new TypeConverterBinding(object, matcherMock, typeConverterMock);
        //Act Statement(s)
        target.addConverter(typeConverterBinding);
    }

    //Sapient generated method id: ${af1213df-2288-3258-bb60-8b85441e17db}, hash: CC3744A1FDD92A428D852E0D0AB8C46C
    @Ignore()
    @Test()
    public void getConverterWhenMatchingConverterIsNull() {
        /* Branches:
         * (b != null) : true
         * (for-each(b.getConvertersThisLevel())) : true
         * (converter.getTypeMatcher().matches(type)) : true
         * (matchingConverter != null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        InjectorBindingData target = new InjectorBindingData((Optional) null);
        Errors errorsMock = mock(Errors.class);
        Object object = new Object();
        //Act Statement(s)
        TypeConverterBinding result = target.getConverter("stringValue1", typeLiteralMock, errorsMock, object);
        //Assert statement(s)
        //TODO: Please implement equals method in TypeConverterBinding for verification of the entire object or you need to adjust respective assertion statements
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${937a7c96-6005-34e3-8c57-fe28269aba9e}, hash: 93306924DE9EC006A3F82C59362DCB00
    @Test()
    public void addInterceptorBindingTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        InjectorBindingData target = new InjectorBindingData((Optional) null);
        InterceptorBinding interceptorBindingMock = mock(InterceptorBinding.class, "some_value");
        //Act Statement(s)
        target.addInterceptorBinding(interceptorBindingMock);
    }

    //Sapient generated method id: ${f91aaa92-5ba7-3ebd-980e-aa14ffcfd3f8}, hash: ADE235D37866A1FBCA79814E56873770
    @Ignore()
    @Test()
    public void getInterceptorBindingsWhenParentIsPresent() {
        /* Branches:
         * (parent.isPresent()) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: object of type ImmutableList.Builder
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ImmutableList immutableList = ImmutableList.of();
        doReturn(immutableList).when(injectorBindingDataMock).getInterceptorBindings();
        InjectorBindingData target = new InjectorBindingData((Optional) null);
        //Act Statement(s)
        ImmutableList<InterceptorBinding> result = target.getInterceptorBindings();
        ImmutableList.Builder immutableListBuilder = new ImmutableList.Builder();
        ImmutableList.Builder builder = immutableListBuilder.addAll(immutableList);
        ArrayList<InterceptorBinding> interceptorBindingList = new ArrayList<>();
        ImmutableList.Builder builder2 = builder.addAll(interceptorBindingList);
        ImmutableList<InterceptorBinding> interceptorBindingList2 = builder2.build();
        //Assert statement(s)
        assertThat(result, equalTo(interceptorBindingList2));
        verify(injectorBindingDataMock).getInterceptorBindings();
    }

    //Sapient generated method id: ${ce8943a9-3209-399e-addd-a6e1a92a149c}, hash: 132C813DCAC076310F83C2081F0ACA15
    @Ignore()
    @Test()
    public void getInterceptorBindingsWhenParentNotIsPresent() {
        /* Branches:
         * (parent.isPresent()) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        InjectorBindingData target = new InjectorBindingData((Optional) null);
        //Act Statement(s)
        ImmutableList<InterceptorBinding> result = target.getInterceptorBindings();
        ArrayList<InterceptorBinding> interceptorBindingList2 = new ArrayList<>();
        ImmutableList<InterceptorBinding> interceptorBindingList = ImmutableList.copyOf(interceptorBindingList2);
        //Assert statement(s)
        assertThat(result, equalTo(interceptorBindingList));
    }

    //Sapient generated method id: ${1ac2bf03-35b4-348e-8f0e-09374eb9f3b9}, hash: 8D2013AEC671AF21A8B0915BC8B050E8
    @Test()
    public void getInterceptorBindingsThisLevelTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        InjectorBindingData target = new InjectorBindingData((Optional) null);
        //Act Statement(s)
        ImmutableList<InterceptorBinding> result = target.getInterceptorBindingsThisLevel();
        ArrayList<InterceptorBinding> interceptorBindingList2 = new ArrayList<>();
        ImmutableList<InterceptorBinding> interceptorBindingList = ImmutableList.copyOf(interceptorBindingList2);
        //Assert statement(s)
        assertThat(result, equalTo(interceptorBindingList));
    }

    //Sapient generated method id: ${0c2d3851-66c3-3c91-9249-0c64c68a01e0}, hash: 36803F08DEE2CA9383A1572B37FCDF30
    @Test()
    public void addTypeListenerTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        InjectorBindingData target = new InjectorBindingData((Optional) null);
        TypeListenerBinding typeListenerBindingMock = mock(TypeListenerBinding.class, "valid_value");
        //Act Statement(s)
        target.addTypeListener(typeListenerBindingMock);
    }

    //Sapient generated method id: ${cdf9065f-cda7-31de-b061-993485fe83c2}, hash: 72988D6EF187C775BF30A3DA919F0D34
    @Ignore()
    @Test()
    public void getTypeListenerBindingsWhenParentIsPresent() {
        /* Branches:
         * (parent.isPresent()) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: object of type ImmutableList.Builder
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ImmutableList immutableList = ImmutableList.of();
        doReturn(immutableList).when(injectorBindingDataMock).getTypeListenerBindings();
        InjectorBindingData target = new InjectorBindingData((Optional) null);
        //Act Statement(s)
        ImmutableList<TypeListenerBinding> result = target.getTypeListenerBindings();
        ImmutableList.Builder immutableListBuilder = new ImmutableList.Builder();
        ImmutableList.Builder builder = immutableListBuilder.addAll(immutableList);
        ArrayList<TypeListenerBinding> typeListenerBindingList = new ArrayList<>();
        ImmutableList.Builder builder2 = builder.addAll(typeListenerBindingList);
        ImmutableList<TypeListenerBinding> typeListenerBindingList2 = builder2.build();
        //Assert statement(s)
        assertThat(result, equalTo(typeListenerBindingList2));
        verify(injectorBindingDataMock).getTypeListenerBindings();
    }

    //Sapient generated method id: ${ff95db41-e88a-3349-9708-47aaa313eab6}, hash: AFE09E05BC979A512E12DFB1BA70032F
    @Ignore()
    @Test()
    public void getTypeListenerBindingsWhenParentNotIsPresent() {
        /* Branches:
         * (parent.isPresent()) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        InjectorBindingData target = new InjectorBindingData((Optional) null);
        //Act Statement(s)
        ImmutableList<TypeListenerBinding> result = target.getTypeListenerBindings();
        ArrayList<TypeListenerBinding> typeListenerBindingList2 = new ArrayList<>();
        ImmutableList<TypeListenerBinding> typeListenerBindingList = ImmutableList.copyOf(typeListenerBindingList2);
        //Assert statement(s)
        assertThat(result, equalTo(typeListenerBindingList));
    }

    //Sapient generated method id: ${7bea7a7f-5a7d-3fe6-91ad-f0842b2408c2}, hash: F78919450BB28AE9030154ABD3B897BD
    @Test()
    public void getTypeListenerBindingsThisLevelTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        InjectorBindingData target = new InjectorBindingData((Optional) null);
        //Act Statement(s)
        ImmutableList<TypeListenerBinding> result = target.getTypeListenerBindingsThisLevel();
        ArrayList<TypeListenerBinding> typeListenerBindingList2 = new ArrayList<>();
        ImmutableList<TypeListenerBinding> typeListenerBindingList = ImmutableList.copyOf(typeListenerBindingList2);
        //Assert statement(s)
        assertThat(result, equalTo(typeListenerBindingList));
    }

    //Sapient generated method id: ${abc92e5b-da89-38b0-8342-561e2c3d2827}, hash: 57164AAF7BEB96ECB36E8667CE58ABCD
    @Test()
    public void addProvisionListenerTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        InjectorBindingData target = new InjectorBindingData((Optional) null);
        ProvisionListenerBinding provisionListenerBindingMock = mock(ProvisionListenerBinding.class, "valid_value");
        //Act Statement(s)
        target.addProvisionListener(provisionListenerBindingMock);
    }

    //Sapient generated method id: ${24126168-b0e6-3d5b-bcb0-980044d81961}, hash: DEE1DC57F747FB415295AEFD050987F6
    @Ignore()
    @Test()
    public void getProvisionListenerBindingsWhenParentIsPresent() {
        /* Branches:
         * (parent.isPresent()) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: object of type ImmutableList.Builder
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ImmutableList immutableList = ImmutableList.of();
        doReturn(immutableList).when(injectorBindingDataMock).getProvisionListenerBindings();
        InjectorBindingData target = new InjectorBindingData((Optional) null);
        //Act Statement(s)
        ImmutableList<ProvisionListenerBinding> result = target.getProvisionListenerBindings();
        ImmutableList.Builder immutableListBuilder = new ImmutableList.Builder();
        ImmutableList.Builder builder = immutableListBuilder.addAll(immutableList);
        ArrayList<ProvisionListenerBinding> provisionListenerBindingList = new ArrayList<>();
        ImmutableList.Builder builder2 = builder.addAll(provisionListenerBindingList);
        ImmutableList<ProvisionListenerBinding> provisionListenerBindingList2 = builder2.build();
        //Assert statement(s)
        assertThat(result, equalTo(provisionListenerBindingList2));
        verify(injectorBindingDataMock).getProvisionListenerBindings();
    }

    //Sapient generated method id: ${a3f2014e-ee10-3e10-ac6d-e778afb81272}, hash: E97625F13F2136CA99BA017EED53713C
    @Ignore()
    @Test()
    public void getProvisionListenerBindingsWhenParentNotIsPresent() {
        /* Branches:
         * (parent.isPresent()) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        InjectorBindingData target = new InjectorBindingData((Optional) null);
        //Act Statement(s)
        ImmutableList<ProvisionListenerBinding> result = target.getProvisionListenerBindings();
        ArrayList<ProvisionListenerBinding> provisionListenerBindingList2 = new ArrayList<>();
        ImmutableList<ProvisionListenerBinding> provisionListenerBindingList = ImmutableList.copyOf(provisionListenerBindingList2);
        //Assert statement(s)
        assertThat(result, equalTo(provisionListenerBindingList));
    }

    //Sapient generated method id: ${6117389d-4cb5-327f-9b7a-9a99820a298a}, hash: CB9ED3DE815FE3F7E9B14683AC30EA39
    @Test()
    public void getProvisionListenerBindingsThisLevelTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        InjectorBindingData target = new InjectorBindingData((Optional) null);
        //Act Statement(s)
        ImmutableList<ProvisionListenerBinding> result = target.getProvisionListenerBindingsThisLevel();
        ArrayList<ProvisionListenerBinding> provisionListenerBindingList2 = new ArrayList<>();
        ImmutableList<ProvisionListenerBinding> provisionListenerBindingList = ImmutableList.copyOf(provisionListenerBindingList2);
        //Assert statement(s)
        assertThat(result, equalTo(provisionListenerBindingList));
    }

    //Sapient generated method id: ${46cd84de-4e80-3097-bf47-cfdd1756b1f6}, hash: 375E538ED23BD5E93D49601F87DB204F
    @Test()
    public void addScannerTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        InjectorBindingData target = new InjectorBindingData((Optional) null);
        Object object = new Object();
        ModuleAnnotatedMethodScanner moduleAnnotatedMethodScannerMock = mock(ModuleAnnotatedMethodScanner.class);
        ModuleAnnotatedMethodScannerBinding moduleAnnotatedMethodScannerBinding = new ModuleAnnotatedMethodScannerBinding(object, moduleAnnotatedMethodScannerMock);
        //Act Statement(s)
        target.addScanner(moduleAnnotatedMethodScannerBinding);
    }

    //Sapient generated method id: ${8ce94cf0-284b-3c1d-8ec6-a354c24c8d5a}, hash: F4C63382EDC291D4479918516942202C
    @Ignore()
    @Test()
    public void getScannerBindingsWhenParentIsPresent() {
        /* Branches:
         * (parent.isPresent()) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: object of type ImmutableList.Builder
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ImmutableList immutableList = ImmutableList.of();
        doReturn(immutableList).when(injectorBindingDataMock).getScannerBindings();
        InjectorBindingData target = new InjectorBindingData((Optional) null);
        //Act Statement(s)
        ImmutableList<ModuleAnnotatedMethodScannerBinding> result = target.getScannerBindings();
        ImmutableList.Builder immutableListBuilder = new ImmutableList.Builder();
        ImmutableList.Builder builder = immutableListBuilder.addAll(immutableList);
        ArrayList<ModuleAnnotatedMethodScannerBinding> moduleAnnotatedMethodScannerBindingList = new ArrayList<>();
        ImmutableList.Builder builder2 = builder.addAll(moduleAnnotatedMethodScannerBindingList);
        ImmutableList<ModuleAnnotatedMethodScannerBinding> moduleAnnotatedMethodScannerBindingList2 = builder2.build();
        //Assert statement(s)
        assertThat(result, equalTo(moduleAnnotatedMethodScannerBindingList2));
        verify(injectorBindingDataMock).getScannerBindings();
    }

    //Sapient generated method id: ${1cc0b493-f94b-3b35-807a-d6acb1b60206}, hash: 74A6353DBA2D5C012C1508884901E47A
    @Ignore()
    @Test()
    public void getScannerBindingsWhenParentNotIsPresent() {
        /* Branches:
         * (parent.isPresent()) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        InjectorBindingData target = new InjectorBindingData((Optional) null);
        //Act Statement(s)
        ImmutableList<ModuleAnnotatedMethodScannerBinding> result = target.getScannerBindings();
        ArrayList<ModuleAnnotatedMethodScannerBinding> moduleAnnotatedMethodScannerBindingList2 = new ArrayList<>();
        ImmutableList<ModuleAnnotatedMethodScannerBinding> moduleAnnotatedMethodScannerBindingList = ImmutableList.copyOf(moduleAnnotatedMethodScannerBindingList2);
        //Assert statement(s)
        assertThat(result, equalTo(moduleAnnotatedMethodScannerBindingList));
    }

    //Sapient generated method id: ${3b0e1129-5016-3289-9e98-66c62101b7f3}, hash: 563431CBBBCA5753740227BC5F2345E4
    @Test()
    public void getScannerBindingsThisLevelTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        InjectorBindingData target = new InjectorBindingData((Optional) null);
        //Act Statement(s)
        ImmutableList<ModuleAnnotatedMethodScannerBinding> result = target.getScannerBindingsThisLevel();
        ArrayList<ModuleAnnotatedMethodScannerBinding> moduleAnnotatedMethodScannerBindingList2 = new ArrayList<>();
        ImmutableList<ModuleAnnotatedMethodScannerBinding> moduleAnnotatedMethodScannerBindingList = ImmutableList.copyOf(moduleAnnotatedMethodScannerBindingList2);
        //Assert statement(s)
        assertThat(result, equalTo(moduleAnnotatedMethodScannerBindingList));
    }

    //Sapient generated method id: ${84b38e6b-2d41-3c25-a2ff-94db54bb572c}, hash: 1820D0ABD0DC15950DCD40506CD08C91
    @Test()
    public void getScopesWhenScopesEntrySetIsEmpty() {
        /* Branches:
         * (for-each(scopes.entrySet())) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        InjectorBindingData target = new InjectorBindingData((Optional) null);
        //Act Statement(s)
        Map<Class<? extends Annotation>, Scope> result = target.getScopes();
        ImmutableMap immutableMap = ImmutableMap.of();
        //Assert statement(s)
        assertThat(result, equalTo(immutableMap));
    }

    //Sapient generated method id: ${ea89b4a4-5b0b-3d78-af1c-14624be8c3f6}, hash: 4B9698C3FF2313ADA62E392AA491BE77
    @Test()
    public void indexBindingsByTypeWhenGetExplicitBindingsThisLevelValuesIsNotEmpty() {
        /* Branches:
         * (for-each(getExplicitBindingsThisLevel().values())) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: indexedExplicitBindings
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        InjectorBindingData target = new InjectorBindingData((Optional) null);
        //Act Statement(s)
        target.indexBindingsByType();
    }
}

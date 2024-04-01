package com.google.inject.internal;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.List;
import java.lang.reflect.Member;
import java.util.HashSet;

import com.google.inject.internal.util.Classes;

import java.util.Map;

import com.google.common.collect.ImmutableSet;
import com.google.inject.Key;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import com.google.inject.spi.Elements;
import com.google.inject.TypeLiteral;
import org.aopalliance.intercept.MethodInterceptor;
import com.google.inject.binder.LinkedBindingBuilder;

import java.util.Set;

import com.google.common.collect.ImmutableMap;
import com.google.inject.spi.BindingTargetVisitor;

import java.lang.annotation.Annotation;

import com.google.inject.spi.Dependency;
import org.mockito.MockedStatic;
import com.google.inject.Binder;
import com.google.inject.binder.ScopedBindingBuilder;
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
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

import org.junit.Ignore;

public class ConstructorBindingImplSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Constructor constructorMock = mock(Constructor.class);

    private final Constructor constructorMock2 = mock(Constructor.class);

    private final Constructor constructorMock3 = mock(Constructor.class);

    private final Errors errorsMock = mock(Errors.class);

    private final Errors errorsMock2 = mock(Errors.class);

    private final Errors errorsMock3 = mock(Errors.class);

    private final Errors errorsMock4 = mock(Errors.class);

    private final Errors errorsMock5 = mock(Errors.class);

    private final InjectionPoint injectionPointMock = mock(InjectionPoint.class);

    private final InjectorImpl injectorImplMock = mock(InjectorImpl.class);

    private final InternalFactory<java.lang.Object> internalFactoryMock = mock(InternalFactory.class);

    private final Key<java.lang.Object> keyMock = mock(Key.class);

    private final KotlinSupportInterface kotlinSupportInterfaceMock = mock(KotlinSupportInterface.class);

    private final Member memberMock = mock(Member.class);

    private final Scoping scopingMock = mock(Scoping.class);

    private final Scoping scopingMock2 = mock(Scoping.class);

    private final Scoping scopingMock3 = mock(Scoping.class);

    private final TypeLiteral typeLiteralMock = mock(TypeLiteral.class);

    private final TypeLiteral typeLiteralMock2 = mock(TypeLiteral.class);

    private final TypeLiteral typeLiteralMock3 = mock(TypeLiteral.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${a829f733-5ad7-37e6-975c-7d54c0917922}, hash: 632A1B62C64E2C6BAAF0FB525C10D441
    @Ignore()
    @Test()
    public void createWhenCaughtConfigurationExceptionThrowsErrorsException() throws ErrorsException {
        /* Branches:
         * (constructorInjector == null) : true
         * (Modifier.isAbstract(rawType.getModifiers())) : true
         * (Classes.isInnerClass(rawType)) : true
         * (KotlinSupport.getInstance().isLocalClass(rawType)) : true
         * (constructorInjector == null) : true
         * (catch-exception (ConfigurationException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Classes> classes = mockStatic(Classes.class)) {
            classes.when(() -> Classes.isInnerClass(java.lang.Object.class)).thenReturn(false);
            thrown.expect(ErrorsException.class);
            Key key = Key.get(java.lang.Object.class);
            InjectionPoint injectionPoint = null;
            java.lang.Object object = new java.lang.Object();
            Errors errors = new Errors();
            //Act Statement(s)
            ConstructorBindingImpl.create(injectorImplMock, key, injectionPoint, object, scopingMock, errors, false, false);
            //Assert statement(s)
            classes.verify(() -> Classes.isInnerClass(java.lang.Object.class), atLeast(1));
        }
    }

    //Sapient generated method id: ${883bf247-b8b8-303f-9316-1bfc0d968e53}, hash: 9147D4742617414BE27E1F9CCBA1EFE2
    @Test()
    public void createWhenScopeAnnotationIsNotNull() throws ErrorsException {
        //TODO: Please change the modifier of the below class from private to public to isolate the test case scenario.
        //Act Statement(s)
        //Assert statement(s)
        //doReturn(typeLiteralMock).when(keyMock).getTypeLiteral();
        //doReturn(Object.class).when(typeLiteralMock).getRawType();
        //doReturn(false).when(scopingMock).isExplicitlyScoped();
        //doReturn(0).when(errorsMock).size();
        //doReturn(errorsMock2).when(errorsMock).missingImplementationWithHint(keyMock, injectorImplMock);
        //doReturn(errorsMock3).when(errorsMock).cannotInjectInnerClass(java.lang.Object.class);
        //doReturn(errorsMock4).when(errorsMock).cannotInjectLocalClass(java.lang.Object.class);
        //doNothing().when(errorsMock).throwIfNewErrors(0);
        //doReturn(errorsMock5).when(errorsMock).withSource(java.lang.Object.class);
        //classes.when(() -> Classes.isInnerClass(java.lang.Object.class)).thenReturn(false);
        //kotlinSupport.when(() -> KotlinSupport.getInstance()).thenReturn(kotlinSupportInterfaceMock);
        //doReturn(false).when(kotlinSupportInterfaceMock).isLocalClass(java.lang.Object.class);
        //injectionPoint.when(() -> InjectionPoint.forConstructorOf(typeLiteralMock, false)).thenReturn(injectionPointMock);
        //doReturn(memberMock).when(injectionPointMock).getMember();
        //annotations.when(() -> Annotations.findScopeAnnotation(errorsMock, java.lang.Object.class)).thenReturn(Annotation.class);
        //scoping.when(() -> Scoping.forAnnotation(java.lang.annotation.Annotation.class)).thenReturn(scopingMock2);
        //scoping.when(() -> Scoping.makeInjectable(scopingMock2, injectorImplMock, errorsMock5)).thenReturn(scopingMock3);
        //java.lang.Object object = new java.lang.Object();
        //scoping.when(() -> Scoping.scope(eq(keyMock), eq(injectorImplMock), (InternalFactory) any(), eq(object), eq(scopingMock3))).thenReturn(internalFactoryMock);
        //InjectionPoint injectionPoint2 = null;
        //ConstructorBindingImpl result = ConstructorBindingImpl.create(injectorImplMock, keyMock, injectionPoint2, object, scopingMock, errorsMock, false, false);
        //assertThat(result, is(notNullValue()));
        //verify(keyMock, times(2)).getTypeLiteral();
        //verify(typeLiteralMock).getRawType();
        //verify(scopingMock).isExplicitlyScoped();
        //verify(errorsMock).size();
        //verify(errorsMock).missingImplementationWithHint(keyMock, injectorImplMock);
        //verify(errorsMock).cannotInjectInnerClass(java.lang.Object.class);
        //verify(errorsMock).cannotInjectLocalClass(java.lang.Object.class);
        //verify(errorsMock, times(2)).throwIfNewErrors(0);
        //verify(errorsMock).withSource(java.lang.Object.class);
        //classes.verify(() -> Classes.isInnerClass(java.lang.Object.class), atLeast(1));
        //kotlinSupport.verify(() -> KotlinSupport.getInstance(), atLeast(1));
        //verify(kotlinSupportInterfaceMock).isLocalClass(java.lang.Object.class);
        //injectionPoint.verify(() -> InjectionPoint.forConstructorOf(typeLiteralMock, false), atLeast(1));
        //verify(injectionPointMock).getMember();
        //annotations.verify(() -> Annotations.findScopeAnnotation(errorsMock, java.lang.Object.class), atLeast(1));
        //scoping.verify(() -> Scoping.forAnnotation(java.lang.annotation.Annotation.class), atLeast(1));
        //scoping.verify(() -> Scoping.makeInjectable(scopingMock2, injectorImplMock, errorsMock5), atLeast(1));
        //scoping.verify(() -> Scoping.scope(eq(keyMock), eq(injectorImplMock), (InternalFactory) any(), eq(object), eq(scopingMock3)));
    }

    //Sapient generated method id: ${83303ea8-3f9a-3027-bbb3-0c96f4d8f5ea}, hash: F77437CA187BE59CEA24FF44BB84EA18
    @Test()
    public void createWhenConstructorInjectorIsNotNullAndScopingNotIsExplicitlyScopedAndScopeAnnotationIsNotNull() throws ErrorsException {
        //TODO: Please change the modifier of the below class from private to public to isolate the test case scenario.
        //Act Statement(s)
        //Assert statement(s)
        /* Branches:
         * (constructorInjector == null) : false
         * (Modifier.isAbstract(rawType.getModifiers())) : true
         * (Classes.isInnerClass(rawType)) : true
         * (KotlinSupport.getInstance().isLocalClass(rawType)) : true
         * (constructorInjector == null) : false
         * (!scoping.isExplicitlyScoped()) : true
         * (scopeAnnotation != null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //InjectionPoint constructorInjectorMock = mock(InjectionPoint.class);
        //doReturn(typeLiteralMock).when(constructorInjectorMock).getDeclaringType();
        //doReturn(Object.class).when(typeLiteralMock).getRawType();
        //doReturn(memberMock).when(constructorInjectorMock).getMember();
        //doReturn(false).when(scopingMock).isExplicitlyScoped();
        //doReturn(0).when(errorsMock).size();
        //doReturn(errorsMock2).when(errorsMock).missingImplementationWithHint(keyMock, injectorImplMock);
        //doReturn(errorsMock3).when(errorsMock).cannotInjectInnerClass(java.lang.Object.class);
        //doReturn(errorsMock4).when(errorsMock).cannotInjectLocalClass(java.lang.Object.class);
        //doNothing().when(errorsMock).throwIfNewErrors(0);
        //doReturn(errorsMock5).when(errorsMock).withSource(java.lang.Object.class);
        //classes.when(() -> Classes.isInnerClass(java.lang.Object.class)).thenReturn(false);
        //kotlinSupport.when(() -> KotlinSupport.getInstance()).thenReturn(kotlinSupportInterfaceMock);
        //doReturn(false).when(kotlinSupportInterfaceMock).isLocalClass(java.lang.Object.class);
        //annotations.when(() -> Annotations.findScopeAnnotation(errorsMock, java.lang.Object.class)).thenReturn(Annotation.class);
        //scoping.when(() -> Scoping.forAnnotation(java.lang.annotation.Annotation.class)).thenReturn(scopingMock2);
        //scoping.when(() -> Scoping.makeInjectable(scopingMock2, injectorImplMock, errorsMock5)).thenReturn(scopingMock3);
        //java.lang.Object object = new java.lang.Object();
        //scoping.when(() -> Scoping.scope(eq(keyMock), eq(injectorImplMock), (InternalFactory) any(), eq(object), eq(scopingMock3))).thenReturn(internalFactoryMock);
        //ConstructorBindingImpl result = ConstructorBindingImpl.create(injectorImplMock, keyMock, constructorInjectorMock, object, scopingMock, errorsMock, false, false);
        //assertThat(result, is(notNullValue()));
        //verify(constructorInjectorMock).getDeclaringType();
        //verify(typeLiteralMock).getRawType();
        //verify(constructorInjectorMock).getMember();
        //verify(scopingMock).isExplicitlyScoped();
        //verify(errorsMock).size();
        //verify(errorsMock).missingImplementationWithHint(keyMock, injectorImplMock);
        //verify(errorsMock).cannotInjectInnerClass(java.lang.Object.class);
        //verify(errorsMock).cannotInjectLocalClass(java.lang.Object.class);
        //verify(errorsMock, times(2)).throwIfNewErrors(0);
        //verify(errorsMock).withSource(java.lang.Object.class);
        //classes.verify(() -> Classes.isInnerClass(java.lang.Object.class), atLeast(1));
        //kotlinSupport.verify(() -> KotlinSupport.getInstance(), atLeast(1));
        //verify(kotlinSupportInterfaceMock).isLocalClass(java.lang.Object.class);
        //annotations.verify(() -> Annotations.findScopeAnnotation(errorsMock, java.lang.Object.class), atLeast(1));
        //scoping.verify(() -> Scoping.forAnnotation(java.lang.annotation.Annotation.class), atLeast(1));
        //scoping.verify(() -> Scoping.makeInjectable(scopingMock2, injectorImplMock, errorsMock5), atLeast(1));
        //scoping.verify(() -> Scoping.scope(eq(keyMock), eq(injectorImplMock), (InternalFactory) any(), eq(object), eq(scopingMock3)));
    }

    //Sapient generated method id: ${64ad769f-e9e5-3c08-812f-d421f34c10cd}, hash: 4B9F5E9FABE6AB004A607FFA465CA105
    @Ignore()
    @Test()
    public void initializeThrowsNullPointerException() throws ErrorsException {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class com.google.inject.internal.ConstructorInjector
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Key key = Key.get(java.lang.Object.class);
        java.lang.Object object = new java.lang.Object();
        InjectionPoint injectionPoint = InjectionPoint.forConstructor(constructorMock, typeLiteralMock);
        InjectionPoint injectionPoint2 = InjectionPoint.forConstructor(constructorMock2, typeLiteralMock2);
        Set<InjectionPoint> injectionPointSet = new HashSet<>();
        injectionPointSet.add(injectionPoint2);
        ConstructorBindingImpl target = new ConstructorBindingImpl(key, object, scopingMock, injectionPoint, injectionPointSet);
        Errors errors = new Errors();
        //Act Statement(s)
        target.initialize(injectorImplMock, errors);
    }

    //Sapient generated method id: ${a4925b3a-a0f0-3350-8231-9f2173b4e49f}, hash: B9538D0750E873A6CC305EECF46F84CA
    @Ignore()
    @Test()
    public void isInitializedWhenFactoryConstructorInjectorIsNotNull() {
        /* Branches:
         * (factory.constructorInjector != null) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class com.google.inject.internal.ConstructorInjector
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Key key = Key.get(java.lang.Object.class);
        java.lang.Object object = new java.lang.Object();
        InjectionPoint injectionPoint = InjectionPoint.forConstructor(constructorMock, typeLiteralMock);
        InjectionPoint injectionPoint2 = InjectionPoint.forConstructor(constructorMock2, typeLiteralMock2);
        Set<InjectionPoint> injectionPointSet = new HashSet<>();
        injectionPointSet.add(injectionPoint2);
        ConstructorBindingImpl target = new ConstructorBindingImpl(key, object, scopingMock, injectionPoint, injectionPointSet);
        //Act Statement(s)
        boolean result = target.isInitialized();
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
    }

    //Sapient generated method id: ${21d707fb-6b19-330e-ac7e-15d2734b4e82}, hash: 743F6A83ADD8E23C0AC73D051390CE03
    @Ignore()
    @Test()
    public void isInitializedWhenFactoryConstructorInjectorIsNull() {
        /* Branches:
         * (factory.constructorInjector != null) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class com.google.inject.internal.ConstructorInjector
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Key key = Key.get(java.lang.Object.class);
        java.lang.Object object = new java.lang.Object();
        InjectionPoint injectionPoint = InjectionPoint.forConstructor(constructorMock, typeLiteralMock);
        InjectionPoint injectionPoint2 = InjectionPoint.forConstructor(constructorMock2, typeLiteralMock2);
        Set<InjectionPoint> injectionPointSet = new HashSet<>();
        injectionPointSet.add(injectionPoint2);
        ConstructorBindingImpl target = new ConstructorBindingImpl(key, object, scopingMock, injectionPoint, injectionPointSet);
        //Act Statement(s)
        boolean result = target.isInitialized();
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${0948abb4-4334-3350-ace9-9b137179c578}, hash: B5C26D1D376790250F47F70CF613DF3C
    @Ignore()
    @Test()
    public void getInternalConstructorWhenFactoryConstructorInjectorIsNotNull() {
        /* Branches:
         * (factory.constructorInjector != null) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class com.google.inject.internal.ConstructorInjector
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Key key = Key.get(java.lang.Object.class);
        java.lang.Object object = new java.lang.Object();
        InjectionPoint injectionPoint = InjectionPoint.forConstructor(constructorMock, typeLiteralMock);
        InjectionPoint injectionPoint2 = InjectionPoint.forConstructor(constructorMock2, typeLiteralMock2);
        Set<InjectionPoint> injectionPointSet = new HashSet<>();
        injectionPointSet.add(injectionPoint2);
        ConstructorBindingImpl target = new ConstructorBindingImpl(key, object, scopingMock, injectionPoint, injectionPointSet);
        //Act Statement(s)
        InjectionPoint result = target.getInternalConstructor();
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${c22dbf39-96fc-3704-a343-093b34ddcb9f}, hash: 7F09BFC4AD7CEB509F2D29A8DB68C185
    @Ignore()
    @Test()
    public void getInternalConstructorWhenFactoryConstructorInjectorIsNull() {
        /* Branches:
         * (factory.constructorInjector != null) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class com.google.inject.internal.ConstructorInjector
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Key key = Key.get(java.lang.Object.class);
        java.lang.Object object = new java.lang.Object();
        InjectionPoint injectionPoint = InjectionPoint.forConstructor(constructorMock, typeLiteralMock);
        InjectionPoint injectionPoint2 = InjectionPoint.forConstructor(constructorMock2, typeLiteralMock2);
        Set<InjectionPoint> injectionPointSet = new HashSet<>();
        injectionPointSet.add(injectionPoint2);
        ConstructorBindingImpl target = new ConstructorBindingImpl(key, object, scopingMock, injectionPoint, injectionPointSet);
        //Act Statement(s)
        InjectionPoint result = target.getInternalConstructor();
        //Assert statement(s)
        assertThat(result, equalTo(injectionPoint));
    }

    //Sapient generated method id: ${e986ddd1-7ddd-303a-ab76-f91ed0663d29}, hash: 5BF17DDDA0E1B7989538D8E921833FEE
    @Ignore()
    @Test()
    public void getInternalDependenciesWhenFactoryConstructorInjectorIsNull() {
        /* Branches:
         * (factory.constructorInjector == null) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class com.google.inject.internal.ConstructorInjector
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Dependency> dependency = mockStatic(Dependency.class);
             MockedStatic<InjectionPoint> injectionPoint = mockStatic(InjectionPoint.class)) {
            InjectionPoint injectionPoint2 = InjectionPoint.forConstructor(constructorMock, typeLiteralMock);
            Set<InjectionPoint> injectionPointSet = new HashSet<>();
            injectionPointSet.add(injectionPoint2);
            injectionPoint.when(() -> InjectionPoint.forInstanceMethodsAndFields((TypeLiteral) any())).thenReturn(injectionPointSet);
            Set<Dependency<?>> anySet = new HashSet<>();
            ImmutableSet immutableSet = ImmutableSet.builder().build();
            dependency.when(() -> Dependency.forInjectionPoints(immutableSet)).thenReturn(anySet);
            Key key = Key.get(java.lang.Object.class);
            java.lang.Object object = new java.lang.Object();
            InjectionPoint injectionPoint3 = InjectionPoint.forConstructor(constructorMock2, typeLiteralMock2);
            InjectionPoint injectionPoint4 = InjectionPoint.forConstructor(constructorMock3, typeLiteralMock3);
            Set<InjectionPoint> injectionPointSet2 = new HashSet<>();
            injectionPointSet2.add(injectionPoint4);
            ConstructorBindingImpl target = new ConstructorBindingImpl(key, object, scopingMock, injectionPoint3, injectionPointSet2);
            //Act Statement(s)
            Set<Dependency<?>> result = target.getInternalDependencies();
            //Assert statement(s)
            assertThat(result, equalTo(anySet));
            injectionPoint.verify(() -> InjectionPoint.forInstanceMethodsAndFields((TypeLiteral) any()));
            dependency.verify(() -> Dependency.forInjectionPoints(immutableSet), atLeast(1));
        }
    }

    //Sapient generated method id: ${b7b513b9-8ed3-3289-96a2-9a0ff9e2691e}, hash: E1FADE6BC7C7144A1A98EA74B154DB04
    @Ignore()
    @Test()
    public void getInternalDependenciesWhenFactoryConstructorInjectorIsNotNull() {
        /* Branches:
         * (factory.constructorInjector == null) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class com.google.inject.internal.ConstructorInjector
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Dependency> dependency = mockStatic(Dependency.class)) {
            Set<Dependency<?>> anySet = new HashSet<>();
            ImmutableSet immutableSet = ImmutableSet.builder().build();
            dependency.when(() -> Dependency.forInjectionPoints(immutableSet)).thenReturn(anySet);
            Key key = Key.get(java.lang.Object.class);
            java.lang.Object object = new java.lang.Object();
            InjectionPoint injectionPoint = InjectionPoint.forConstructor(constructorMock, typeLiteralMock);
            InjectionPoint injectionPoint2 = InjectionPoint.forConstructor(constructorMock2, typeLiteralMock2);
            Set<InjectionPoint> injectionPointSet = new HashSet<>();
            injectionPointSet.add(injectionPoint2);
            ConstructorBindingImpl target = spy(new ConstructorBindingImpl(key, object, scopingMock, injectionPoint, injectionPointSet));
            doReturn(injectionPointMock).when(target).getConstructor();
            Set<InjectionPoint> injectionPointSet2 = new HashSet<>();
            doReturn(injectionPointSet2).when(target).getInjectableMembers();
            //Act Statement(s)
            Set<Dependency<?>> result = target.getInternalDependencies();
            //Assert statement(s)
            assertThat(result, equalTo(anySet));
            dependency.verify(() -> Dependency.forInjectionPoints(immutableSet), atLeast(1));
            verify(target).getConstructor();
            verify(target).getInjectableMembers();
        }
    }

    //Sapient generated method id: ${12dd5c10-d98c-3d91-abe2-eb3b12f8440a}, hash: 93028AABE208F626396AD44E3E12D8F4
    @Ignore()
    @Test()
    public void getInternalDependenciesWhenCaughtConfigurationException() {
        /* Branches:
         * (factory.constructorInjector == null) : true
         * (catch-exception (ConfigurationException)) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class com.google.inject.internal.ConstructorInjector
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Dependency> dependency = mockStatic(Dependency.class);
             MockedStatic<InjectionPoint> injectionPoint = mockStatic(InjectionPoint.class)) {
            InjectionPoint injectionPoint2 = InjectionPoint.forConstructor(constructorMock, typeLiteralMock);
            Set<InjectionPoint> injectionPointSet = new HashSet<>();
            injectionPointSet.add(injectionPoint2);
            injectionPoint.when(() -> InjectionPoint.forInstanceMethodsAndFields((TypeLiteral) any())).thenReturn(injectionPointSet);
            Set<Dependency<?>> anySet = new HashSet<>();
            ImmutableSet immutableSet = ImmutableSet.builder().build();
            dependency.when(() -> Dependency.forInjectionPoints(immutableSet)).thenReturn(anySet);
            Key key = Key.get(java.lang.Object.class);
            java.lang.Object object = new java.lang.Object();
            InjectionPoint injectionPoint3 = InjectionPoint.forConstructor(constructorMock2, typeLiteralMock2);
            InjectionPoint injectionPoint4 = InjectionPoint.forConstructor(constructorMock3, typeLiteralMock3);
            Set<InjectionPoint> injectionPointSet2 = new HashSet<>();
            injectionPointSet2.add(injectionPoint4);
            ConstructorBindingImpl target = new ConstructorBindingImpl(key, object, scopingMock, injectionPoint3, injectionPointSet2);
            //Act Statement(s)
            Set<Dependency<?>> result = target.getInternalDependencies();
            //Assert statement(s)
            assertThat(result, equalTo(anySet));
            injectionPoint.verify(() -> InjectionPoint.forInstanceMethodsAndFields((TypeLiteral) any()));
            dependency.verify(() -> Dependency.forInjectionPoints(immutableSet), atLeast(1));
        }
    }

    //Sapient generated method id: ${c20943f4-4fc1-387b-a811-ec334043f01b}, hash: BA557B8B096FFA9C4AD5F612D7889485
    @Ignore()
    @Test()
    public void acceptTargetVisitorWhenFactoryConstructorInjectorIsNotNull() {
        /* Branches:
         * (factory.constructorInjector != null) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class com.google.inject.internal.ConstructorInjector
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Key key = Key.get(java.lang.Object.class);
        java.lang.Object object = new java.lang.Object();
        InjectionPoint injectionPoint = InjectionPoint.forConstructor(constructorMock, typeLiteralMock);
        InjectionPoint injectionPoint2 = InjectionPoint.forConstructor(constructorMock2, typeLiteralMock2);
        Set<InjectionPoint> injectionPointSet = new HashSet<>();
        injectionPointSet.add(injectionPoint2);
        ConstructorBindingImpl target = new ConstructorBindingImpl(key, object, scopingMock, injectionPoint, injectionPointSet);
        BindingTargetVisitor<java.lang.Object, java.lang.Object> visitorMock = mock(BindingTargetVisitor.class);
        java.lang.Object object2 = new java.lang.Object();
        doReturn(object2).when(visitorMock).visit(target);
        //Act Statement(s)
        java.lang.Object result = target.acceptTargetVisitor(visitorMock);
        //Assert statement(s)
        assertThat(result, equalTo(object2));
        verify(visitorMock).visit(target);
    }

    //Sapient generated method id: ${05cc7660-ba9d-301d-b73c-bcceee3f47fc}, hash: FD6F80B973B32C04C428EA778AF710BA
    @Ignore()
    @Test()
    public void acceptTargetVisitorWhenFactoryConstructorInjectorIsNullThrowsIllegalStateException() {
        /* Branches:
         * (factory.constructorInjector != null) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class com.google.inject.internal.ConstructorInjector
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Key key = Key.get(java.lang.Object.class);
        java.lang.Object object = new java.lang.Object();
        InjectionPoint injectionPoint = InjectionPoint.forConstructor(constructorMock, typeLiteralMock);
        InjectionPoint injectionPoint2 = InjectionPoint.forConstructor(constructorMock2, typeLiteralMock2);
        Set<InjectionPoint> injectionPointSet = new HashSet<>();
        injectionPointSet.add(injectionPoint2);
        ConstructorBindingImpl target = new ConstructorBindingImpl(key, object, scopingMock, injectionPoint, injectionPointSet);
        thrown.expect(IllegalStateException.class);
        BindingTargetVisitor<java.lang.Object, java.lang.Object> bindingTargetVisitorMock = mock(BindingTargetVisitor.class);
        //Act Statement(s)
        target.acceptTargetVisitor(bindingTargetVisitorMock);
    }

    //Sapient generated method id: ${c7e488ab-5395-3fed-972d-99a97a363f4b}, hash: 285B45F15AA79111B2B8B898591E1F15
    @Ignore()
    @Test()
    public void getConstructorWhenFactoryConstructorInjectorIsNotNull() {
        /* Branches:
         * (factory.constructorInjector != null) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class com.google.inject.internal.ConstructorInjector
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Key key = Key.get(java.lang.Object.class);
        java.lang.Object object = new java.lang.Object();
        InjectionPoint injectionPoint = InjectionPoint.forConstructor(constructorMock, typeLiteralMock);
        InjectionPoint injectionPoint2 = InjectionPoint.forConstructor(constructorMock2, typeLiteralMock2);
        Set<InjectionPoint> injectionPointSet = new HashSet<>();
        injectionPointSet.add(injectionPoint2);
        ConstructorBindingImpl target = new ConstructorBindingImpl(key, object, scopingMock, injectionPoint, injectionPointSet);
        //Act Statement(s)
        InjectionPoint result = target.getConstructor();
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${1a226733-6ca7-308c-bf22-32002859aafa}, hash: 5E5FB61C8E12C6710BC0596E4698A64A
    @Ignore()
    @Test()
    public void getConstructorWhenFactoryConstructorInjectorIsNullThrowsIllegalStateException() {
        /* Branches:
         * (factory.constructorInjector != null) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class com.google.inject.internal.ConstructorInjector
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Key key = Key.get(java.lang.Object.class);
        java.lang.Object object = new java.lang.Object();
        InjectionPoint injectionPoint = InjectionPoint.forConstructor(constructorMock, typeLiteralMock);
        InjectionPoint injectionPoint2 = InjectionPoint.forConstructor(constructorMock2, typeLiteralMock2);
        Set<InjectionPoint> injectionPointSet = new HashSet<>();
        injectionPointSet.add(injectionPoint2);
        ConstructorBindingImpl target = new ConstructorBindingImpl(key, object, scopingMock, injectionPoint, injectionPointSet);
        thrown.expect(IllegalStateException.class);
        //Act Statement(s)
        target.getConstructor();
    }

    //Sapient generated method id: ${fdcbc929-583c-3917-b38b-28f2ce6a91da}, hash: 3B4FE8D90CCC6C5F86CFB11FFDB2475F
    @Ignore()
    @Test()
    public void getInjectableMembersWhenFactoryConstructorInjectorIsNotNull() {
        /* Branches:
         * (factory.constructorInjector != null) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class com.google.inject.internal.ConstructorInjector
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Key key = Key.get(java.lang.Object.class);
        java.lang.Object object = new java.lang.Object();
        InjectionPoint injectionPoint = InjectionPoint.forConstructor(constructorMock, typeLiteralMock);
        InjectionPoint injectionPoint2 = InjectionPoint.forConstructor(constructorMock2, typeLiteralMock2);
        Set<InjectionPoint> injectionPointSet = new HashSet<>();
        injectionPointSet.add(injectionPoint2);
        ConstructorBindingImpl target = new ConstructorBindingImpl(key, object, scopingMock, injectionPoint, injectionPointSet);
        //Act Statement(s)
        Set<InjectionPoint> result = target.getInjectableMembers();
        ImmutableSet immutableSet = ImmutableSet.of();
        //Assert statement(s)
        assertThat(result, equalTo(immutableSet));
    }

    //Sapient generated method id: ${13813246-ab19-3c69-bfeb-faa711537311}, hash: 6812A6080005A16BBDAE9E84FD5C4F02
    @Ignore()
    @Test()
    public void getInjectableMembersWhenFactoryConstructorInjectorIsNullThrowsIllegalStateException() {
        /* Branches:
         * (factory.constructorInjector != null) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class com.google.inject.internal.ConstructorInjector
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Key key = Key.get(java.lang.Object.class);
        java.lang.Object object = new java.lang.Object();
        InjectionPoint injectionPoint = InjectionPoint.forConstructor(constructorMock, typeLiteralMock);
        InjectionPoint injectionPoint2 = InjectionPoint.forConstructor(constructorMock2, typeLiteralMock2);
        Set<InjectionPoint> injectionPointSet = new HashSet<>();
        injectionPointSet.add(injectionPoint2);
        ConstructorBindingImpl target = new ConstructorBindingImpl(key, object, scopingMock, injectionPoint, injectionPointSet);
        thrown.expect(IllegalStateException.class);
        //Act Statement(s)
        target.getInjectableMembers();
    }

    //Sapient generated method id: ${261f205f-b8ac-3e98-b23c-f96964059cf8}, hash: 6C41AD09B0F20669C9BB3417E82C60F6
    @Ignore()
    @Test()
    public void getMethodInterceptorsWhenFactoryConstructorInjectorIsNotNull() {
        /* Branches:
         * (factory.constructorInjector != null) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class com.google.inject.internal.ConstructorInjector
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Key key = Key.get(java.lang.Object.class);
        java.lang.Object object = new java.lang.Object();
        InjectionPoint injectionPoint = InjectionPoint.forConstructor(constructorMock, typeLiteralMock);
        InjectionPoint injectionPoint2 = InjectionPoint.forConstructor(constructorMock2, typeLiteralMock2);
        Set<InjectionPoint> injectionPointSet = new HashSet<>();
        injectionPointSet.add(injectionPoint2);
        ConstructorBindingImpl target = new ConstructorBindingImpl(key, object, scopingMock, injectionPoint, injectionPointSet);
        //Act Statement(s)
        Map<Method, List<MethodInterceptor>> result = target.getMethodInterceptors();
        ImmutableMap immutableMap = ImmutableMap.of();
        //Assert statement(s)
        assertThat(result, equalTo(immutableMap));
    }

    //Sapient generated method id: ${bed93d39-621b-30b2-b52c-c8a790999428}, hash: 70C340AF0ABEBDC5E105CAEDCE016726
    @Ignore()
    @Test()
    public void getMethodInterceptorsWhenFactoryConstructorInjectorIsNullThrowsIllegalStateException() {
        /* Branches:
         * (factory.constructorInjector != null) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class com.google.inject.internal.ConstructorInjector
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Key key = Key.get(java.lang.Object.class);
        java.lang.Object object = new java.lang.Object();
        InjectionPoint injectionPoint = InjectionPoint.forConstructor(constructorMock, typeLiteralMock);
        InjectionPoint injectionPoint2 = InjectionPoint.forConstructor(constructorMock2, typeLiteralMock2);
        Set<InjectionPoint> injectionPointSet = new HashSet<>();
        injectionPointSet.add(injectionPoint2);
        ConstructorBindingImpl target = new ConstructorBindingImpl(key, object, scopingMock, injectionPoint, injectionPointSet);
        thrown.expect(IllegalStateException.class);
        //Act Statement(s)
        target.getMethodInterceptors();
    }

    //Sapient generated method id: ${903fef97-987f-323e-a528-d02591a6bcb2}, hash: EBA24D7BCBB0E52DE650658B83114241
    @Ignore()
    @Test()
    public void getDependenciesTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: object of type ImmutableSet.Builder
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Dependency> dependency = mockStatic(Dependency.class)) {
            Set<Dependency<?>> anySet = new HashSet<>();
            dependency.when(() -> Dependency.forInjectionPoints((Set) any())).thenReturn(anySet);
            Key key = Key.get(java.lang.Object.class);
            java.lang.Object object = new java.lang.Object();
            InjectionPoint injectionPoint = InjectionPoint.forConstructor(constructorMock, typeLiteralMock);
            InjectionPoint injectionPoint2 = InjectionPoint.forConstructor(constructorMock2, typeLiteralMock2);
            Set<InjectionPoint> injectionPointSet = new HashSet<>();
            injectionPointSet.add(injectionPoint2);
            ConstructorBindingImpl target = spy(new ConstructorBindingImpl(key, object, scopingMock, injectionPoint, injectionPointSet));
            doReturn(injectionPointMock).when(target).getConstructor();
            Set<InjectionPoint> injectionPointSet2 = new HashSet<>();
            doReturn(injectionPointSet2).when(target).getInjectableMembers();
            //Act Statement(s)
            Set<Dependency<?>> result = target.getDependencies();
            //Assert statement(s)
            assertThat(result, equalTo(anySet));
            dependency.verify(() -> Dependency.forInjectionPoints((Set) any()));
            verify(target).getConstructor();
            verify(target).getInjectableMembers();
        }
    }

    //Sapient generated method id: ${da0d3db3-e38a-36e1-8dd5-ef2abf7e3a21}, hash: 86B3CC9C8E11B1FDFC8CCC0D281C43BB
    @Ignore()
    @Test()
    public void withScopingTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class com.google.inject.internal.ConstructorInjector
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Key key = Key.get(java.lang.Object.class);
        java.lang.Object object = new java.lang.Object();
        InjectionPoint injectionPoint = InjectionPoint.forConstructor(constructorMock, typeLiteralMock);
        InjectionPoint injectionPoint2 = InjectionPoint.forConstructor(constructorMock2, typeLiteralMock2);
        Set<InjectionPoint> injectionPointSet = new HashSet<>();
        injectionPointSet.add(injectionPoint2);
        ConstructorBindingImpl target = spy(new ConstructorBindingImpl(key, object, scopingMock, injectionPoint, injectionPointSet));
        doReturn(keyMock).when(target).getKey();
        java.lang.Object object2 = new java.lang.Object();
        doReturn(object2).when(target).getSource();
        //Act Statement(s)
        BindingImpl result = target.withScoping(scopingMock2);
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
        verify(target).getKey();
        verify(target).getSource();
    }

    //Sapient generated method id: ${43ae4532-e963-39a9-b37c-2a93c33a9ff0}, hash: D45EEF9741B2F431517467AB47F6009F
    @Ignore()
    @Test()
    public void withKeyTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class com.google.inject.internal.ConstructorInjector
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Key key = Key.get(java.lang.Object.class);
        java.lang.Object object = new java.lang.Object();
        InjectionPoint injectionPoint = InjectionPoint.forConstructor(constructorMock, typeLiteralMock);
        InjectionPoint injectionPoint2 = InjectionPoint.forConstructor(constructorMock2, typeLiteralMock2);
        Set<InjectionPoint> injectionPointSet = new HashSet<>();
        injectionPointSet.add(injectionPoint2);
        ConstructorBindingImpl target = spy(new ConstructorBindingImpl(key, object, scopingMock, injectionPoint, injectionPointSet));
        java.lang.Object object2 = new java.lang.Object();
        doReturn(object2).when(target).getSource();
        Key key2 = Key.get(java.lang.Object.class);
        //Act Statement(s)
        BindingImpl result = target.withKey(key2);
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
        verify(target).getSource();
    }

    //Sapient generated method id: ${0f0a622f-1e3b-3dc0-a3ae-a6ceb63c4e13}, hash: 816360CC160715AD2891A3DA8F41D27F
    @Ignore()
    @Test()
    public void applyToTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class com.google.inject.internal.ConstructorInjector
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ScopedBindingBuilder scopedBindingBuilderMock = mock(ScopedBindingBuilder.class);
        Binder binderMock = mock(Binder.class);
        Binder binderMock2 = mock(Binder.class);
        LinkedBindingBuilder linkedBindingBuilderMock = mock(LinkedBindingBuilder.class);
        Key keyMock = mock(Key.class);
        InjectionPoint injectionPointMock2 = mock(InjectionPoint.class);
        try (MockedStatic<Elements> elements = mockStatic(Elements.class)) {
            doNothing().when(scopingMock).applyTo(scopedBindingBuilderMock);
            GuiceInternal guiceInternal = GuiceInternal.GUICE_INTERNAL;
            java.lang.Object object = new java.lang.Object();
            elements.when(() -> Elements.withTrustedSource(guiceInternal, binderMock2, object)).thenReturn(binderMock);
            doReturn(linkedBindingBuilderMock).when(binderMock).bind(keyMock);
            doReturn(scopedBindingBuilderMock).when(linkedBindingBuilderMock).toConstructor(constructorMock, typeLiteralMock);
            Key key = Key.get(java.lang.Object.class);
            java.lang.Object object2 = new java.lang.Object();
            InjectionPoint injectionPoint = InjectionPoint.forConstructor(constructorMock2, typeLiteralMock2);
            InjectionPoint injectionPoint2 = InjectionPoint.forConstructor(constructorMock3, typeLiteralMock3);
            Set<InjectionPoint> injectionPointSet = new HashSet<>();
            injectionPointSet.add(injectionPoint2);
            ConstructorBindingImpl target = spy(new ConstructorBindingImpl(key, object2, scopingMock, injectionPoint, injectionPointSet));
            doReturn(typeLiteralMock).when(injectionPointMock).getDeclaringType();
            doReturn(object).when(target).getSource();
            doReturn(keyMock).when(target).getKey();
            doReturn(injectionPointMock, injectionPointMock2).when(target).getConstructor();
            doReturn(constructorMock).when(injectionPointMock2).getMember();
            //Act Statement(s)
            target.applyTo(binderMock2);
            //Assert statement(s)
            verify(scopingMock).applyTo(scopedBindingBuilderMock);
            elements.verify(() -> Elements.withTrustedSource(guiceInternal, binderMock2, object), atLeast(1));
            verify(binderMock).bind(keyMock);
            verify(linkedBindingBuilderMock).toConstructor(constructorMock, typeLiteralMock);
            verify(target, times(2)).getConstructor();
            verify(injectionPointMock).getDeclaringType();
            verify(target).getSource();
            verify(target).getKey();
            verify(injectionPointMock2).getMember();
        }
    }

    //Sapient generated method id: ${363d3698-f34c-39ad-914f-376a19498023}, hash: 3451B6EF9B7922F7D7A6349F2BC755A8
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
        Key key = Key.get(java.lang.Object.class);
        java.lang.Object object = new java.lang.Object();
        InjectionPoint injectionPoint = InjectionPoint.forConstructor(constructorMock, typeLiteralMock);
        InjectionPoint injectionPoint2 = InjectionPoint.forConstructor(constructorMock2, typeLiteralMock2);
        Set<InjectionPoint> injectionPointSet = new HashSet<>();
        injectionPointSet.add(injectionPoint2);
        ConstructorBindingImpl target = spy(new ConstructorBindingImpl(key, object, scopingMock, injectionPoint, injectionPointSet));
        Key keyMock = mock(Key.class);
        doReturn(keyMock).when(target).getKey();
        java.lang.Object object2 = new java.lang.Object();
        doReturn(object2).when(target).getSource();
        //Act Statement(s)
        String result = target.toString();
        //Assert statement(s)
        assertThat(result, equalTo("result1"));
        verify(target).getKey();
        verify(target).getSource();
    }
}

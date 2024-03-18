package com.google.inject.internal;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import com.google.inject.TypeLiteral;

import java.util.Set;
import java.util.HashSet;

import org.mockito.MockedStatic;
import com.google.inject.Binding;

import java.lang.reflect.Constructor;

import com.google.inject.spi.InjectionPoint;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.is;

public class InitializerSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Constructor constructorMock = mock(Constructor.class);

    private final Errors errorsMock = mock(Errors.class);

    private final InjectorImpl injectorImplMock = mock(InjectorImpl.class);

    private final TypeLiteral<Object> typeLiteralMock = mock(TypeLiteral.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${ab30205e-2777-32dc-978f-6449de394ce1}, hash: 2948B3CBF86AD032DDA828D814B388F5
    @Test()
    public void requestInjectionWhenBindingIsNotNullThrowsNullPointerException() {
        /* Branches:
         * (branch expression (line 85)) : false
         * (binding == null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Initializer target = new Initializer();
        thrown.expect(NullPointerException.class);
        Object object = new Object();
        Binding<Object> bindingMock = mock(Binding.class);
        Object object2 = new Object();
        Set<InjectionPoint> injectionPointSet = new HashSet<>();
        //Act Statement(s)
        target.requestInjection(injectorImplMock, typeLiteralMock, object, bindingMock, object2, injectionPointSet, errorsMock);
    }

    //Sapient generated method id: ${90b7eb34-185b-3b88-b415-aaca2c4331b8}, hash: 8E8F04AF2367A57AF71AF529C7EA178F
    @Test()
    public void requestInjectionWhenInstanceIsNull() {
        /* Branches:
         * (branch expression (line 85)) : false
         * (binding == null) : true
         * (instance == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Initializable<Object> initializableMock = mock(Initializable.class);
        InjectorImpl injectorImplMock = mock(InjectorImpl.class, "InjectorImpl");
        TypeLiteral typeLiteral2Mock = mock(TypeLiteral.class);
        try (MockedStatic<Initializables> initializables = mockStatic(Initializables.class)) {
            initializables.when(() -> Initializables.of((Object) null)).thenReturn(initializableMock);
            Initializer target = new Initializer();
            TypeLiteral typeLiteral = TypeLiteral.get(Object.class);
            //TODO: Needs initialization with real value
            Object object = null;
            Binding<Object> binding = null;
            Object object2 = new Object();
            InjectionPoint injectionPoint = InjectionPoint.forConstructor(constructorMock, typeLiteral2Mock);
            Set<InjectionPoint> injectionPointSet = new HashSet<>();
            injectionPointSet.add(injectionPoint);
            Errors errors = new Errors();
            //Act Statement(s)
            Initializable result = target.requestInjection(injectorImplMock, typeLiteral, object, binding, object2, injectionPointSet, errors);
            //Assert statement(s)
            assertThat(result, equalTo(initializableMock));
            initializables.verify(() -> Initializables.of((Object) null), atLeast(1));
        }
    }

    //Sapient generated method id: ${b3ac69e6-4b10-3b9f-a131-633d6a24e2da}, hash: 8A5D28BAD889FAC7BDFD5A0EF46A698A
    @Test()
    public void requestInjectionWhenInjectionPointsIsEmptyThrowsNullPointerException() {
        /* Branches:
         * (branch expression (line 85)) : false
         * (binding == null) : true
         * (instance == null) : false
         * (injectionPoints.isEmpty()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Initializer target = new Initializer();
        thrown.expect(NullPointerException.class);
        Object object = new Object();
        Binding<Object> binding = null;
        Object object2 = new Object();
        Set<InjectionPoint> injectionPointSet = new HashSet<>();
        //Act Statement(s)
        target.requestInjection(injectorImplMock, typeLiteralMock, object, binding, object2, injectionPointSet, errorsMock);
    }

    //Sapient generated method id: ${a5e00651-7133-3d12-9d66-da4c2b57cbc9}, hash: 156EBA8B3F022D86FD3C4FF7E5DEC61B
    @Test()
    public void requestInjectionWhenCachedTypeNotEqualsType() {
        /* Branches:
         * (branch expression (line 85)) : false
         * (binding == null) : true
         * (instance == null) : false
         * (injectionPoints.isEmpty()) : false
         * (type == null) : true
         * (initializablesCache.containsKey(instance)) : true
         * (!cached.type.equals(type)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TypeLiteral<Object> typeLiteralMock = mock(TypeLiteral.class, "Errors");
        TypeLiteral typeLiteral3Mock = mock(TypeLiteral.class);
        try (MockedStatic<TypeLiteral> typeLiteral = mockStatic(TypeLiteral.class)) {
            typeLiteral.when(() -> TypeLiteral.get(Object.class)).thenReturn(typeLiteralMock);
            Initializer target = new Initializer();
            TypeLiteral<Object> typeLiteral2 = null;
            Object object = new Object();
            Binding<Object> binding = null;
            Object object2 = new Object();
            InjectionPoint injectionPoint = InjectionPoint.forConstructor(constructorMock, typeLiteral3Mock);
            Set<InjectionPoint> injectionPointSet = new HashSet<>();
            injectionPointSet.add(injectionPoint);
            Errors errors = new Errors();
            //Act Statement(s)
            Initializable result = target.requestInjection(injectorImplMock, typeLiteral2, object, binding, object2, injectionPointSet, errors);
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            typeLiteral.verify(() -> TypeLiteral.get(Object.class), atLeast(1));
        }
    }

    //Sapient generated method id: ${80066bde-37a5-3d89-a164-e2401395f5a8}, hash: 8883EB893BCFCF18C8222C92D1DE8AEE
    @Test()
    public void requestInjectionWhenBindingIsNull() {
        /* Branches:
         * (branch expression (line 85)) : false
         * (binding == null) : true
         * (instance == null) : false
         * (injectionPoints.isEmpty()) : false
         * (type == null) : true
         * (initializablesCache.containsKey(instance)) : false
         * (binding == null) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: cycleDetectingLockFactory
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TypeLiteral typeLiteralMock = mock(TypeLiteral.class);
        InjectionPoint injectionPointMock = mock(InjectionPoint.class);
        try (MockedStatic<TypeLiteral> typeLiteral = mockStatic(TypeLiteral.class)) {
            typeLiteral.when(() -> TypeLiteral.get(Object.class)).thenReturn(typeLiteralMock);
            Initializer target = new Initializer();
            TypeLiteral<Object> typeLiteral2 = null;
            Object object = new Object();
            Binding<Object> binding = null;
            Object object2 = new Object();
            Set<InjectionPoint> injectionPointSet = new HashSet<>();
            injectionPointSet.add(injectionPointMock);
            //Act Statement(s)
            Initializable result = target.requestInjection(injectorImplMock, typeLiteral2, object, binding, object2, injectionPointSet, errorsMock);
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            typeLiteral.verify(() -> TypeLiteral.get(Object.class), atLeast(1));
        }
    }

    //Sapient generated method id: ${bfa89122-cff1-3139-aecb-79d0e8defb60}, hash: 97A15DED4C9D8F0DCFE9BBAFDE7EBE2E
    @Test()
    public void validateOustandingInjectionsWhenPendingInjectionsIsEmpty() throws ErrorsException {
        /* Branches:
         * (for-each(pendingInjections)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Initializer target = new Initializer();
        Errors errors = new Errors();
        //Act Statement(s)
        target.validateOustandingInjections(errors);
    }

    //Sapient generated method id: ${34d230f3-496f-31f3-a793-438603aa6a48}, hash: E4ABC16834D099699C588D6434CA0444
    @Test()
    public void injectAllThrowsIllegalStateException() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Initializer target = new Initializer();
        thrown.expect(IllegalStateException.class);
        Errors errors = new Errors();
        //Act Statement(s)
        target.injectAll(errors);
    }
}

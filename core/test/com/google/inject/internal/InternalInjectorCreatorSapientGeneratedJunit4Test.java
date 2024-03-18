package com.google.inject.internal;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import com.google.inject.Injector;

import java.util.Map;
import java.util.HashMap;

import com.google.inject.Binding;
import com.google.inject.Stage;
import com.google.inject.Key;
import com.google.inject.spi.Dependency;
import org.mockito.MockedStatic;

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

public class InternalInjectorCreatorSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Dependency dependencyMock = mock(Dependency.class);

    private final Errors errorsMock = mock(Errors.class);

    private final InjectorBindingData injectorBindingDataMock = mock(InjectorBindingData.class);

    private final InjectorImpl injectorImplMock = mock(InjectorImpl.class);

    private final InjectorJitBindingData injectorJitBindingDataMock = mock(InjectorJitBindingData.class);

    private final InjectorJitBindingData injectorJitBindingDataMock2 = mock(InjectorJitBindingData.class);

    private final InjectorImpl injectorMock = mock(InjectorImpl.class);

    private final InternalContext internalContextMock = mock(InternalContext.class);

    private final Key keyMock = mock(Key.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${c7f2ef04-ddef-3755-9cfc-a1f03d41dda8}, hash: 7917ECE036C54A25869E5E26FD5D8673
    @Test()
    public void stageTest() {
        //Arrange Statement(s)
        InternalInjectorCreator target = new InternalInjectorCreator();
        //Act Statement(s)
        InternalInjectorCreator result = target.stage(Stage.PRODUCTION);
        //Assert statement(s)
        assertThat(result, equalTo(target));
    }

    //Sapient generated method id: ${cd5c5194-410b-3902-b8d0-b48a5c9b4b79}, hash: FF78629C7EC6DBB2D1B2E4D6E035E8D0
    @Ignore()
    @Test()
    public void parentInjectorTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: shellBuilder
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        InternalInjectorCreator target = new InternalInjectorCreator();
        //Act Statement(s)
        InternalInjectorCreator result = target.parentInjector(injectorImplMock);
        //Assert statement(s)
        assertThat(result, equalTo(target));
    }

    //Sapient generated method id: ${4b930eb5-afd0-3a9e-828f-1b6f883b6cbf}, hash: 5328C166432E515495ABF8486EEDFA9B
    @Ignore()
    @Test()
    public void addModulesTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: shellBuilder
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        InternalInjectorCreator target = new InternalInjectorCreator();
        Iterable iterableMock = mock(Iterable.class);
        //Act Statement(s)
        InternalInjectorCreator result = target.addModules(iterableMock);
        //Assert statement(s)
        assertThat(result, equalTo(target));
    }

    //Sapient generated method id: ${daf14d5a-2199-3faa-a44b-37dad2c86f55}, hash: A56C77A80E74306EB777ABA035929A9B
    @Ignore()
    @Test()
    public void buildWhenShellsIsNotEmptyThrowsNullPointerException() {
        /* Branches:
         * (shellBuilder == null) : false
         * (for-each(shells)) : true  #  inside initializeStatically method
         * (for-each(shells)) : true  #  inside initializeStatically method
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: shellBuilder
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        InternalInjectorCreator target = new InternalInjectorCreator();
        thrown.expect(NullPointerException.class);
        //Act Statement(s)
        target.build();
    }

    //Sapient generated method id: ${1a40b68e-f4d4-362d-976f-24149d0938e4}, hash: AEF5EF759A8620D470F29878CF1B8BB8
    @Ignore()
    @Test()
    public void buildWhenShellGetElementsNotIsEmptyThrowsAssertionError() {
        /* Branches:
         * (shellBuilder == null) : false
         * (for-each(shells)) : true  #  inside initializeStatically method
         * (for-each(shells)) : false  #  inside initializeStatically method
         * (for-each(shells)) : true  #  inside initializeStatically method
         * (!shell.getElements().isEmpty()) : true  #  inside initializeStatically method
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: shellBuilder
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        InternalInjectorCreator target = new InternalInjectorCreator();
        thrown.expect(AssertionError.class);
        //Act Statement(s)
        target.build();
    }

    //Sapient generated method id: ${24768d35-ac00-3ea5-8929-d9371fa7faac}, hash: C744BDF39C5637DE01A1DAEC97277728
    @Ignore()
    @Test()
    public void buildWhenShellBuilderGetStageNotEqualsStageTOOL() throws InternalProvisionException {
        /* Branches:
         * (shellBuilder == null) : false
         * (for-each(shells)) : false  #  inside initializeStatically method
         * (for-each(shells)) : false  #  inside initializeStatically method
         * (for-each(shells)) : false  #  inside initializeStatically method
         * (shellBuilder.getStage() != Stage.TOOL) : false  #  inside injectDynamically method
         * (shellBuilder.getStage() == Stage.TOOL) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: shellBuilder
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        InternalInjectorCreator target = new InternalInjectorCreator();
        //Act Statement(s)
        Injector result = target.build();
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${63f72657-c64d-3f6a-b68a-5c0cb532579c}, hash: 9E12B311E38A6A145811938D13BB183F
    @Ignore()
    @Test()
    public void buildWhenShellsIsNotEmptyAndShellBuilderGetStageEqualsStageTOOL() throws InternalProvisionException {
        /* Branches:
         * (shellBuilder == null) : false
         * (for-each(shells)) : true  #  inside initializeStatically method
         * (for-each(shells)) : false  #  inside initializeStatically method
         * (for-each(shells)) : true  #  inside initializeStatically method
         * (!shell.getElements().isEmpty()) : false  #  inside initializeStatically method
         * (shellBuilder.getStage() != Stage.TOOL) : true  #  inside injectDynamically method
         * (for-each(shells)) : true  #  inside injectDynamically method
         * (shellBuilder.getStage() == Stage.TOOL) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: shellBuilder
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        InternalInjectorCreator target = spy(new InternalInjectorCreator());
        doNothing().when(target).loadEagerSingletons(eq(injectorImplMock), eq(Stage.TOOL), (Errors) any());
        //Act Statement(s)
        Injector result = target.build();
        //Assert statement(s)
        //TODO: Please implement equals method in ToolStageInjector for verification of the entire object or you need to adjust respective assertion statements
        assertThat(result, is(notNullValue()));
        verify(target).loadEagerSingletons(eq(injectorImplMock), eq(Stage.TOOL), (Errors) any());
    }

    //Sapient generated method id: ${2083be90-3ee3-3b11-af29-8f978e0014fd}, hash: CEC7DF4012390703D0D1D91BAE141339
    @Ignore()
    @Test()
    public void loadEagerSingletonsWhenIsEagerSingletonInjectorBindingStage() throws InternalProvisionException {
        /* Branches:
         * (for-each(candidateBindings)) : true
         * (binding.getScoping().isEagerSingleton(stage)) : true  #  inside isEagerSingleton method
         * (isEagerSingleton(injector, binding, stage)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Dependency> dependency = mockStatic(Dependency.class)) {
            doReturn(injectorBindingDataMock).when(injectorMock).getBindingData();
            Map<Key<?>, Binding<?>> anyMap = new HashMap<>();
            doReturn(anyMap).when(injectorBindingDataMock).getExplicitBindingsThisLevel();
            Object object = new Object();
            doReturn(object).when(injectorJitBindingDataMock).lock();
            doReturn(injectorJitBindingDataMock, injectorJitBindingDataMock2).when(injectorMock).getJitBindingData();
            Map<Key<?>, BindingImpl<?>> anyMap2 = new HashMap<>();
            doReturn(anyMap2).when(injectorJitBindingDataMock2).getJitBindings();
            doReturn(internalContextMock).when(injectorMock).enterContext();
            doNothing().when(internalContextMock).close();
            dependency.when(() -> Dependency.get(keyMock)).thenReturn(dependencyMock);
            InternalInjectorCreator target = new InternalInjectorCreator();
            //Act Statement(s)
            target.loadEagerSingletons(injectorMock, Stage.TOOL, errorsMock);
            //Assert statement(s)
            verify(injectorMock).getBindingData();
            verify(injectorBindingDataMock).getExplicitBindingsThisLevel();
            verify(injectorMock, times(2)).getJitBindingData();
            verify(injectorJitBindingDataMock).lock();
            verify(injectorJitBindingDataMock2).getJitBindings();
            verify(injectorMock).enterContext();
            verify(internalContextMock).close();
            dependency.verify(() -> Dependency.get(keyMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${eaac45c6-b12f-33dd-b990-26d182d472e8}, hash: 98BAAB1D03DC16638B777D81BB06A812
    @Ignore()
    @Test()
    public void loadEagerSingletonsWhenCaughtInternalProvisionException() throws InternalProvisionException {
        /* Branches:
         * (for-each(candidateBindings)) : true
         * (binding.getScoping().isEagerSingleton(stage)) : true  #  inside isEagerSingleton method
         * (isEagerSingleton(injector, binding, stage)) : true
         * (catch-exception (InternalProvisionException)) : true
         */
        //Arrange Statement(s)
        Errors errorsMock2 = mock(Errors.class);
        Errors errorsMock3 = mock(Errors.class);
        InternalProvisionException internalProvisionExceptionMock = mock(InternalProvisionException.class);
        try (MockedStatic<Dependency> dependency = mockStatic(Dependency.class)) {
            doReturn(injectorBindingDataMock).when(injectorMock).getBindingData();
            Map<Key<?>, Binding<?>> anyMap = new HashMap<>();
            doReturn(anyMap).when(injectorBindingDataMock).getExplicitBindingsThisLevel();
            Object object = new Object();
            doReturn(object).when(injectorJitBindingDataMock).lock();
            doReturn(injectorJitBindingDataMock, injectorJitBindingDataMock2).when(injectorMock).getJitBindingData();
            Map<Key<?>, BindingImpl<?>> anyMap2 = new HashMap<>();
            doReturn(anyMap2).when(injectorJitBindingDataMock2).getJitBindings();
            doReturn(internalContextMock).when(injectorMock).enterContext();
            doNothing().when(internalContextMock).close();
            doReturn(errorsMock2).when(errorsMock).withSource(dependencyMock);
            doReturn(errorsMock3).when(errorsMock2).merge(internalProvisionExceptionMock);
            dependency.when(() -> Dependency.get(keyMock)).thenReturn(dependencyMock);
            InternalInjectorCreator target = new InternalInjectorCreator();
            //Act Statement(s)
            target.loadEagerSingletons(injectorMock, Stage.TOOL, errorsMock);
            //Assert statement(s)
            verify(injectorMock).getBindingData();
            verify(injectorBindingDataMock).getExplicitBindingsThisLevel();
            verify(injectorMock, times(2)).getJitBindingData();
            verify(injectorJitBindingDataMock).lock();
            verify(injectorJitBindingDataMock2).getJitBindings();
            verify(injectorMock).enterContext();
            verify(internalContextMock).close();
            verify(errorsMock).withSource(dependencyMock);
            verify(errorsMock2).merge(internalProvisionExceptionMock);
            dependency.verify(() -> Dependency.get(keyMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${c1b60a60-673a-3761-a3df-e821c1eb484a}, hash: D508B7D097B7FFFD93E817A3D15A161A
    @Test()
    public void loadEagerSingletonsWhenIsEagerSingletonNotInjectorBindingStage() throws InternalProvisionException {
        /* Branches:
         * (for-each(candidateBindings)) : true
         * (binding.getScoping().isEagerSingleton(stage)) : false  #  inside isEagerSingleton method
         * (binding instanceof LinkedBindingImpl) : false  #  inside isEagerSingleton method
         * (isEagerSingleton(injector, binding, stage)) : false
         */
        //Arrange Statement(s)
        doReturn(injectorBindingDataMock).when(injectorMock).getBindingData();
        Map<Key<?>, Binding<?>> anyMap = new HashMap<>();
        doReturn(anyMap).when(injectorBindingDataMock).getExplicitBindingsThisLevel();
        Object object = new Object();
        doReturn(object).when(injectorJitBindingDataMock).lock();
        doReturn(injectorJitBindingDataMock, injectorJitBindingDataMock2).when(injectorMock).getJitBindingData();
        Map<Key<?>, BindingImpl<?>> anyMap2 = new HashMap<>();
        doReturn(anyMap2).when(injectorJitBindingDataMock2).getJitBindings();
        doReturn(internalContextMock).when(injectorMock).enterContext();
        doNothing().when(internalContextMock).close();
        InternalInjectorCreator target = new InternalInjectorCreator();
        //Act Statement(s)
        target.loadEagerSingletons(injectorMock, Stage.TOOL, errorsMock);
        //Assert statement(s)
        verify(injectorMock).getBindingData();
        verify(injectorBindingDataMock).getExplicitBindingsThisLevel();
        verify(injectorMock, times(2)).getJitBindingData();
        verify(injectorJitBindingDataMock).lock();
        verify(injectorJitBindingDataMock2).getJitBindings();
        verify(injectorMock).enterContext();
        verify(internalContextMock).close();
    }
}

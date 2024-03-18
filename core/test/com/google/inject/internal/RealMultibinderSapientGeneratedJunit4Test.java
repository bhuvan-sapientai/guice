package com.google.inject.internal;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import com.google.inject.spi.Element;
import com.google.inject.Injector;
import com.google.inject.Module;
import com.google.inject.Key;

import java.lang.reflect.WildcardType;

import org.mockito.stubbing.Answer;
import com.google.inject.TypeLiteral;

import java.lang.reflect.ParameterizedType;

import com.google.inject.binder.LinkedBindingBuilder;

import java.util.Set;

import com.google.inject.Provider;

import java.lang.reflect.Type;
import java.util.Collection;

import org.mockito.MockedStatic;
import com.google.inject.Binder;
import com.google.inject.binder.ScopedBindingBuilder;
import com.google.inject.util.Types;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

import org.junit.Ignore;

public class RealMultibinderSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Binder binderMock = mock(Binder.class, "binder");

    private final Binder binderMock2 = mock(Binder.class, "Binder");

    private final Element elementMock = mock(Element.class);

    private final TypeLiteral<Object> elementTypeMock = mock(TypeLiteral.class);

    private final Injector injectorMock = mock(Injector.class);

    private final Key<Object> keyMock = mock(Key.class);

    private final LinkedBindingBuilder linkedBindingBuilderMock = mock(LinkedBindingBuilder.class);

    private final ParameterizedType parameterizedTypeMock = mock(ParameterizedType.class);

    private final ParameterizedType parameterizedTypeMock2 = mock(ParameterizedType.class);

    private final TypeLiteral<Set<Object>> typeLiteralMock = mock(TypeLiteral.class);

    private final Type typeMock = mock(Type.class);

    //Sapient generated method id: ${aad37094-035e-3bb5-9198-cebee6897fcb}, hash: F5AA3CB0B72AFE264D2ADB94DF74C5ED
    @Ignore()
    @Test()
    public void newRealSetBinderTest() {
        //Arrange Statement(s)
        Binder binderMock2 = mock(Binder.class);
        Binder binderMock3 = mock(Binder.class);
        try (MockedStatic<Errors> errors = mockStatic(Errors.class)) {
            doNothing().when(binderMock2).install((Module) any());
            errors.when(() -> Errors.checkNotNull(binderMock2, "binder")).thenReturn(binderMock3);
            Key key = Key.get(Object.class);
            //Act Statement(s)
            RealMultibinder result = RealMultibinder.newRealSetBinder(binderMock2, key);
            RealMultibinder<Object> realMultibinder = new RealMultibinder<>(binderMock2, key);
            //Assert statement(s)
            assertThat(result, equalTo(realMultibinder));
            verify(binderMock2).install((Module) any());
            errors.verify(() -> Errors.checkNotNull(binderMock2, "binder"), atLeast(1));
        }
    }

    //Sapient generated method id: ${1a55bfd1-a800-3a32-bada-69469b6ce117}, hash: 24E6C6E1C3D289A9F677FF37F3F610A5
    @Test()
    public void setOfTest() {
        //Arrange Statement(s)
        try (MockedStatic<TypeLiteral> typeLiteral = mockStatic(TypeLiteral.class);
             MockedStatic<Types> types = mockStatic(Types.class)) {
            doReturn(typeMock).when(elementTypeMock).getType();
            types.when(() -> Types.setOf(typeMock)).thenReturn(parameterizedTypeMock);
            typeLiteral.when(() -> TypeLiteral.get(parameterizedTypeMock)).thenReturn(typeLiteralMock);
            //Act Statement(s)
            TypeLiteral<Set<Object>> result = RealMultibinder.setOf(elementTypeMock);
            //Assert statement(s)
            assertThat(result, equalTo(typeLiteralMock));
            verify(elementTypeMock).getType();
            types.verify(() -> Types.setOf(typeMock), atLeast(1));
            typeLiteral.verify(() -> TypeLiteral.get(parameterizedTypeMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${c06c39a0-88e5-3293-b683-63b5fbea7e49}, hash: 839967CD2D7F589A2C019260C938E5B0
    @Test()
    public void collectionOfProvidersOfTest() {
        //Arrange Statement(s)
        TypeLiteral<Collection<Provider<Object>>> typeLiteralMock = mock(TypeLiteral.class);
        try (MockedStatic<TypeLiteral> typeLiteral = mockStatic(TypeLiteral.class);
             MockedStatic<Types> types = mockStatic(Types.class)) {
            doReturn(typeMock).when(elementTypeMock).getType();
            types.when(() -> Types.providerOf(typeMock)).thenReturn(parameterizedTypeMock);
            types.when(() -> Types.collectionOf(parameterizedTypeMock)).thenReturn(parameterizedTypeMock2);
            typeLiteral.when(() -> TypeLiteral.get(parameterizedTypeMock2)).thenReturn(typeLiteralMock);
            //Act Statement(s)
            TypeLiteral<Collection<Provider<Object>>> result = RealMultibinder.collectionOfProvidersOf(elementTypeMock);
            //Assert statement(s)
            assertThat(result, equalTo(typeLiteralMock));
            verify(elementTypeMock).getType();
            types.verify(() -> Types.providerOf(typeMock), atLeast(1));
            types.verify(() -> Types.collectionOf(parameterizedTypeMock), atLeast(1));
            typeLiteral.verify(() -> TypeLiteral.get(parameterizedTypeMock2), atLeast(1));
        }
    }

    //Sapient generated method id: ${f0e74cb6-b55f-3b5c-9a78-79cf17a3690c}, hash: 07DDDBF8E7891AC709DB79AFC4FA852D
    @Test()
    public void collectionOfJakartaProvidersOfTest() {
        //Arrange Statement(s)
        TypeLiteral<Collection<jakarta.inject.Provider<Object>>> typeLiteralMock = mock(TypeLiteral.class);
        try (MockedStatic<TypeLiteral> typeLiteral = mockStatic(TypeLiteral.class);
             MockedStatic<Types> types = mockStatic(Types.class)) {
            doReturn(typeMock).when(elementTypeMock).getType();
            Type[] typeArray = new Type[]{typeMock};
            types.when(() -> Types.newParameterizedType(jakarta.inject.Provider.class, typeArray)).thenReturn(parameterizedTypeMock);
            types.when(() -> Types.collectionOf(parameterizedTypeMock)).thenReturn(parameterizedTypeMock2);
            typeLiteral.when(() -> TypeLiteral.get(parameterizedTypeMock2)).thenReturn(typeLiteralMock);
            //Act Statement(s)
            TypeLiteral<Collection<jakarta.inject.Provider<Object>>> result = RealMultibinder.collectionOfJakartaProvidersOf(elementTypeMock);
            //Assert statement(s)
            assertThat(result, equalTo(typeLiteralMock));
            verify(elementTypeMock).getType();
            types.verify(() -> Types.newParameterizedType(jakarta.inject.Provider.class, typeArray), atLeast(1));
            types.verify(() -> Types.collectionOf(parameterizedTypeMock), atLeast(1));
            typeLiteral.verify(() -> TypeLiteral.get(parameterizedTypeMock2), atLeast(1));
        }
    }

    //Sapient generated method id: ${dce9273f-224e-35b6-b539-10afb7a3e84a}, hash: 0FBDB87953CB86F7E15D9C4A2691CA8F
    @Test()
    public void setOfExtendsOfTest() {
        //Arrange Statement(s)
        WildcardType wildcardTypeMock = mock(WildcardType.class);
        try (MockedStatic<TypeLiteral> typeLiteral = mockStatic(TypeLiteral.class);
             MockedStatic<Types> types = mockStatic(Types.class)) {
            doReturn(typeMock).when(elementTypeMock).getType();
            types.when(() -> Types.subtypeOf(typeMock)).thenReturn(wildcardTypeMock);
            types.when(() -> Types.setOf(wildcardTypeMock)).thenReturn(parameterizedTypeMock);
            typeLiteral.when(() -> TypeLiteral.get(parameterizedTypeMock)).thenReturn(typeLiteralMock);
            //Act Statement(s)
            TypeLiteral<Set<? extends Object>> result = RealMultibinder.setOfExtendsOf(elementTypeMock);
            //Assert statement(s)
            assertThat(result, equalTo(typeLiteralMock));
            verify(elementTypeMock).getType();
            types.verify(() -> Types.subtypeOf(typeMock), atLeast(1));
            types.verify(() -> Types.setOf(wildcardTypeMock), atLeast(1));
            typeLiteral.verify(() -> TypeLiteral.get(parameterizedTypeMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${b38b3436-f7f6-31d8-b86c-04723d5c511e}, hash: 4A77AF024DBEF0DC7CC78D0B0BEAADC6
    @Ignore()
    @Test()
    public void configureWhenBindingSelectionNotIsInitialized() {
        /* Branches:
         * (!bindingSelection.isInitialized()) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: bindingSelection
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Key<Set<Object>> keyMock = mock(Key.class);
        ScopedBindingBuilder scopedBindingBuilderMock = mock(ScopedBindingBuilder.class);
        LinkedBindingBuilder linkedBindingBuilderMock2 = mock(LinkedBindingBuilder.class);
        Key<Set<Object>> keyMock2 = mock(Key.class);
        ScopedBindingBuilder scopedBindingBuilderMock2 = mock(ScopedBindingBuilder.class);
        Key<Set<Object>> keyMock3 = mock(Key.class);
        LinkedBindingBuilder linkedBindingBuilderMock3 = mock(LinkedBindingBuilder.class);
        Key<Collection<Provider<Object>>> keyMock4 = mock(Key.class);
        ScopedBindingBuilder scopedBindingBuilderMock3 = mock(ScopedBindingBuilder.class, "ScopedBindingBuilder");
        LinkedBindingBuilder linkedBindingBuilderMock4 = mock(LinkedBindingBuilder.class);
        Key<Collection<jakarta.inject.Provider<Object>>> keyMock5 = mock(Key.class);
        ScopedBindingBuilder scopedBindingBuilderMock4 = mock(ScopedBindingBuilder.class, "ScopedBindingBuilder");
        Key<Collection<Provider<Object>>> keyMock6 = mock(Key.class);
        Binder binderMock3 = mock(Binder.class, "Binder");
        try (MockedStatic<Errors> errors = mockStatic(Errors.class)) {
            doReturn(linkedBindingBuilderMock).when(binderMock2).bind(keyMock);
            doReturn(scopedBindingBuilderMock).when(linkedBindingBuilderMock).toProvider((Provider) any());
            doReturn(linkedBindingBuilderMock2).when(binderMock2).bind(keyMock2);
            doReturn(scopedBindingBuilderMock2).when(linkedBindingBuilderMock2).to(keyMock3);
            doReturn(linkedBindingBuilderMock3).when(binderMock2).bind(keyMock4);
            doReturn(scopedBindingBuilderMock3).when(linkedBindingBuilderMock3).toProvider((Provider) any());
            doReturn(linkedBindingBuilderMock4).when(binderMock2).bind(keyMock5);
            doReturn(scopedBindingBuilderMock4).when(linkedBindingBuilderMock4).to(keyMock6);
            errors.when(() -> Errors.checkNotNull(binderMock3, "binder")).thenReturn(binderMock);
            Object[] objectArray = new Object[]{};
            errors.when(() -> Errors.checkConfiguration(false, "Multibinder was already initialized", objectArray)).thenAnswer((Answer<Void>) invocation -> null);
            Key key = Key.get(Object.class);
            RealMultibinder<Object> target = new RealMultibinder(binderMock3, key);
            //Act Statement(s)
            target.configure(binderMock2);
            //Assert statement(s)
            verify(binderMock2).bind(keyMock);
            verify(linkedBindingBuilderMock).toProvider((Provider) any());
            verify(binderMock2).bind(keyMock2);
            verify(linkedBindingBuilderMock2).to(keyMock3);
            verify(binderMock2).bind(keyMock4);
            verify(linkedBindingBuilderMock3).toProvider((Provider) any());
            verify(binderMock2).bind(keyMock5);
            verify(linkedBindingBuilderMock4).to(keyMock6);
            errors.verify(() -> Errors.checkNotNull(binderMock3, "binder"), atLeast(1));
            errors.verify(() -> Errors.checkConfiguration(false, "Multibinder was already initialized", objectArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${c0580e94-5ea0-3661-aaa4-0795dc7e2aef}, hash: 8751233D633F65B210501C2B6D1D2263
    @Ignore()
    @Test()
    public void permitDuplicatesTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: bindingSelection
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Binder binderMock2 = mock(Binder.class);
        try (MockedStatic<Errors> errors = mockStatic(Errors.class)) {
            errors.when(() -> Errors.checkNotNull(binderMock2, "binder")).thenReturn(binderMock);
            Key key = Key.get(Object.class);
            RealMultibinder<Object> target = new RealMultibinder(binderMock2, key);
            doNothing().when(binderMock).install((Module) any());
            //Act Statement(s)
            target.permitDuplicates();
            //Assert statement(s)
            errors.verify(() -> Errors.checkNotNull(binderMock2, "binder"), atLeast(1));
            verify(binderMock).install((Module) any());
        }
    }

    //Sapient generated method id: ${b7aac5b6-36d1-3f30-aa07-de4995c74be1}, hash: 3CCC2E36196E00A49D7C4739A495E908
    @Ignore()
    @Test()
    public void getKeyForNewItemWhenBindingSelectionNotIsInitialized() {
        /* Branches:
         * (!bindingSelection.isInitialized()) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: bindingSelection
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Binder binderMock2 = mock(Binder.class);
        Key keyMock = mock(Key.class, "Key");
        TypeLiteral typeLiteralMock = mock(TypeLiteral.class);
        try (MockedStatic<Key> key = mockStatic(Key.class);
             MockedStatic<Errors> errors = mockStatic(Errors.class)) {
            errors.when(() -> Errors.checkNotNull(binderMock2, "binder")).thenReturn(binderMock);
            Object[] objectArray = new Object[]{};
            errors.when(() -> Errors.checkConfiguration(false, "Multibinder was already initialized", objectArray)).thenAnswer((Answer<Void>) invocation -> null);
            key.when(() -> Key.get(eq(typeLiteralMock), (RealElement) any())).thenReturn(keyMock);
            Key key2 = Key.get(Object.class);
            RealMultibinder<Object> target = new RealMultibinder(binderMock2, key2);
            //Act Statement(s)
            Key result = target.getKeyForNewItem();
            //Assert statement(s)
            assertThat(result, equalTo(keyMock));
            errors.verify(() -> Errors.checkNotNull(binderMock2, "binder"), atLeast(1));
            errors.verify(() -> Errors.checkConfiguration(false, "Multibinder was already initialized", objectArray), atLeast(1));
            key.verify(() -> Key.get(eq(typeLiteralMock), (RealElement) any()));
        }
    }

    //Sapient generated method id: ${ec2f3da5-eede-3d4b-9493-a710102288c9}, hash: CFC50F35084255B25304C3A20E957806
    @Ignore()
    @Test()
    public void addBindingTest() {
        //Arrange Statement(s)
        Key keyMock = mock(Key.class);
        try (MockedStatic<Errors> errors = mockStatic(Errors.class)) {
            errors.when(() -> Errors.checkNotNull(binderMock2, "binder")).thenReturn(binderMock);
            Key key = Key.get(Object.class);
            RealMultibinder<Object> target = spy(new RealMultibinder(binderMock2, key));
            doReturn(keyMock).when(target).getKeyForNewItem();
            doReturn(linkedBindingBuilderMock).when(binderMock).bind(keyMock);
            //Act Statement(s)
            LinkedBindingBuilder result = target.addBinding();
            //Assert statement(s)
            assertThat(result, equalTo(linkedBindingBuilderMock));
            errors.verify(() -> Errors.checkNotNull(binderMock2, "binder"), atLeast(1));
            verify(target).getKeyForNewItem();
            verify(binderMock).bind(keyMock);
        }
    }

    //Sapient generated method id: ${d5875a62-a277-31f3-9a2d-8e236da0de62}, hash: F1CA1838419DDCDCE24FC46603873DAD
    @Test()
    public void getSetKeyTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: bindingSelection
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Binder binderMock2 = mock(Binder.class);
        try (MockedStatic<Errors> errors = mockStatic(Errors.class)) {
            errors.when(() -> Errors.checkNotNull(binderMock2, "binder")).thenReturn(binderMock);
            Key key = Key.get(Object.class);
            RealMultibinder<Object> target = new RealMultibinder(binderMock2, key);
            //Act Statement(s)
            Key<Set<Object>> result = target.getSetKey();
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            errors.verify(() -> Errors.checkNotNull(binderMock2, "binder"), atLeast(1));
        }
    }

    //Sapient generated method id: ${f69a5a56-fd4d-3383-aa05-fee65f83b13d}, hash: 2E14A513ADA81D22777E7DDE4C08AAA5
    @Test()
    public void getElementTypeLiteralTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: bindingSelection
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Binder binderMock2 = mock(Binder.class);
        try (MockedStatic<Errors> errors = mockStatic(Errors.class)) {
            errors.when(() -> Errors.checkNotNull(binderMock2, "binder")).thenReturn(binderMock);
            Key key = Key.get(Object.class);
            RealMultibinder<Object> target = new RealMultibinder(binderMock2, key);
            //Act Statement(s)
            TypeLiteral result = target.getElementTypeLiteral();
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            errors.verify(() -> Errors.checkNotNull(binderMock2, "binder"), atLeast(1));
        }
    }

    //Sapient generated method id: ${10a9984f-859a-356a-a178-71befe5e22d2}, hash: 80C39557EEE9BC01C32FFA55E8CF0601
    @Ignore()
    @Test()
    public void getSetNameTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: bindingSelection
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Binder binderMock2 = mock(Binder.class);
        try (MockedStatic<Errors> errors = mockStatic(Errors.class)) {
            errors.when(() -> Errors.checkNotNull(binderMock2, "binder")).thenReturn(binderMock);
            RealMultibinder<Object> target = new RealMultibinder(binderMock2, keyMock);
            //Act Statement(s)
            String result = target.getSetName();
            //Assert statement(s)
            assertThat(result, equalTo("result1"));
            errors.verify(() -> Errors.checkNotNull(binderMock2, "binder"), atLeast(1));
        }
    }

    //Sapient generated method id: ${f6b75df0-a164-3ee9-a1d1-dd9ec1da1f26}, hash: 941089B25E6DE420DA4DC8D902DCDBCE
    @Ignore()
    @Test()
    public void permitsDuplicatesWhenBindingSelectionPermitsDuplicatesInjector() {
        /* Branches:
         * (bindingSelection.permitsDuplicates(injector)) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: bindingSelection
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Binder binderMock2 = mock(Binder.class);
        try (MockedStatic<Errors> errors = mockStatic(Errors.class)) {
            errors.when(() -> Errors.checkNotNull(binderMock2, "binder")).thenReturn(binderMock);
            Key key = Key.get(Object.class);
            RealMultibinder<Object> target = new RealMultibinder(binderMock2, key);
            //Act Statement(s)
            boolean result = target.permitsDuplicates(injectorMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            errors.verify(() -> Errors.checkNotNull(binderMock2, "binder"), atLeast(1));
        }
    }

    //Sapient generated method id: ${cc61e5e5-f913-31fe-a327-e684f7164911}, hash: 6C72D13781A2802F848816B9C0AE362F
    @Test()
    public void permitsDuplicatesWhenBindingSelectionNotPermitsDuplicatesInjector() {
        /* Branches:
         * (bindingSelection.permitsDuplicates(injector)) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: bindingSelection
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Binder binderMock2 = mock(Binder.class);
        try (MockedStatic<Errors> errors = mockStatic(Errors.class)) {
            errors.when(() -> Errors.checkNotNull(binderMock2, "binder")).thenReturn(binderMock);
            Key key = Key.get(Object.class);
            RealMultibinder<Object> target = new RealMultibinder(binderMock2, key);
            //Act Statement(s)
            boolean result = target.permitsDuplicates(injectorMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            errors.verify(() -> Errors.checkNotNull(binderMock2, "binder"), atLeast(1));
        }
    }

    //Sapient generated method id: ${05ba5dc7-b93e-389b-b71d-e0c4c09ef280}, hash: E9967DBA2914E4946229E230D2EDA277
    @Ignore()
    @Test()
    public void containsElementWhenBindingSelectionContainsElementElement() {
        /* Branches:
         * (bindingSelection.containsElement(element)) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: bindingSelection
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Binder binderMock2 = mock(Binder.class);
        try (MockedStatic<Errors> errors = mockStatic(Errors.class)) {
            errors.when(() -> Errors.checkNotNull(binderMock2, "binder")).thenReturn(binderMock);
            RealMultibinder<Object> target = new RealMultibinder(binderMock2, keyMock);
            //Act Statement(s)
            boolean result = target.containsElement(elementMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            errors.verify(() -> Errors.checkNotNull(binderMock2, "binder"), atLeast(1));
        }
    }

    //Sapient generated method id: ${782ccd95-8d63-3961-8571-9efaa3923f3b}, hash: C19CF92FEF00558123920FC0717153F0
    @Ignore()
    @Test()
    public void containsElementWhenBindingSelectionNotContainsElementElement() {
        /* Branches:
         * (bindingSelection.containsElement(element)) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: bindingSelection
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Binder binderMock2 = mock(Binder.class);
        try (MockedStatic<Errors> errors = mockStatic(Errors.class)) {
            errors.when(() -> Errors.checkNotNull(binderMock2, "binder")).thenReturn(binderMock);
            RealMultibinder<Object> target = new RealMultibinder(binderMock2, keyMock);
            //Act Statement(s)
            boolean result = target.containsElement(elementMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            errors.verify(() -> Errors.checkNotNull(binderMock2, "binder"), atLeast(1));
        }
    }
}

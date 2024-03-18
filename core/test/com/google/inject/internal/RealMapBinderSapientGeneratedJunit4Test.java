package com.google.inject.internal;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.util.Map;

import com.google.inject.Module;
import com.google.inject.Key;
import org.mockito.stubbing.Answer;

import java.lang.annotation.Annotation;

import com.google.inject.TypeLiteral;

import java.lang.reflect.ParameterizedType;

import com.google.inject.binder.LinkedBindingBuilder;

import java.lang.reflect.Type;

import com.google.inject.Provider;

import java.util.Set;
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
import static org.mockito.Mockito.times;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

import org.junit.Ignore;

public class RealMapBinderSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final RealMultibinder<Map.Entry<Object, Provider<Object>>> entrySetBinderMock = mock(RealMultibinder.class, "entrySetBinder");

    private final Binder binderMock = mock(Binder.class, "binder");

    private final Annotation annotationMock = mock(Annotation.class);

    private final Key<Map<Object, Object>> keyMock = mock(Key.class);

    private final Key keyMock2 = mock(Key.class);

    private final TypeLiteral<Object> keyTypeMock = mock(TypeLiteral.class);

    private final LinkedBindingBuilder linkedBindingBuilderMock = mock(LinkedBindingBuilder.class);

    private final ParameterizedType parameterizedTypeMock = mock(ParameterizedType.class);

    private final ParameterizedType parameterizedTypeMock2 = mock(ParameterizedType.class);

    private final ParameterizedType parameterizedTypeMock3 = mock(ParameterizedType.class);

    private final TypeLiteral<Map<Object, Object>> typeLiteralMock = mock(TypeLiteral.class);

    private final TypeLiteral<Map.Entry<Object, Provider<Object>>> typeLiteralMock2 = mock(TypeLiteral.class);

    private final Type typeMock = mock(Type.class);

    private final Type typeMock2 = mock(Type.class);

    private final Type typeMock3 = mock(Type.class);

    private final Type typeMock4 = mock(Type.class);

    private final TypeLiteral<Object> valueTypeMock = mock(TypeLiteral.class);

    //Sapient generated method id: ${796759fb-d20e-34dc-b1e6-d7da586001fd}, hash: 34B713B18BAD0C79B973EA87671C5CF9
    @Test()
    public void newMapRealBinderTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //Binder binderMock2 = mock(Binder.class, "Binder");
        //TypeLiteral<Map.Entry<Object, Provider<Object>>> typeLiteralMock2 = mock(TypeLiteral.class, "Key");
        //Key keyMock2 = mock(Key.class, "Key");
        //RealMultibinder<Map.Entry<Object, Provider<Object>>> realMultibinderMock = mock(RealMultibinder.class, "RealMultibinder");
        /*try (MockedStatic<RealMultibinder> realMultibinder = mockStatic(RealMultibinder.class);
    MockedStatic<Key> key = mockStatic(Key.class);
    MockedStatic<TypeLiteral> typeLiteral = mockStatic(TypeLiteral.class);
    MockedStatic<Types> types = mockStatic(Types.class)) {
    doNothing().when(binderMock2).install((Module) any());
    Type type = new Type();
    types.when(() -> Types.mapOf(type, typeMock)).thenReturn(parameterizedTypeMock);
    typeLiteral.when(() -> TypeLiteral.get(parameterizedTypeMock)).thenReturn(typeLiteralMock);
    key.when(() -> Key.get(typeLiteralMock)).thenReturn(keyMock);
    Type type2 = new Type();
    types.when(() -> Types.providerOf(type2)).thenReturn(parameterizedTypeMock2);
    Type[] typeArray = new Type[] { null, parameterizedTypeMock2 };
    types.when(() -> Types.newParameterizedTypeWithOwner(Map.class, Map.Entry.class, typeArray)).thenReturn(parameterizedTypeMock3);
    typeLiteral.when(() -> TypeLiteral.get(parameterizedTypeMock3)).thenReturn(typeLiteralMock2);
    key.when(() -> Key.get(typeLiteralMock2)).thenReturn(keyMock2);
    realMultibinder.when(() -> RealMultibinder.newRealSetBinder(binderMock2, keyMock2)).thenReturn(realMultibinderMock);
    TypeLiteral typeLiteral2 = TypeLiteral.get(Object.class);
    TypeLiteral typeLiteral3 = TypeLiteral.get(Object.class);
    //Act Statement(s)
    RealMapBinder<Object, Object> result = RealMapBinder.newMapRealBinder(binderMock2, typeLiteral2, typeLiteral3);
    //Assert statement(s)
    assertThat(result, is(notNullValue()));
    verify(binderMock2).install((Module) any());
    types.verify(() -> Types.mapOf(type, typeMock), atLeast(1));
    typeLiteral.verify(() -> TypeLiteral.get(parameterizedTypeMock), atLeast(1));
    key.verify(() -> Key.get(typeLiteralMock), atLeast(1));
    types.verify(() -> Types.providerOf(type2), atLeast(1));
    types.verify(() -> Types.newParameterizedTypeWithOwner(Map.class, Map.Entry.class, typeArray), atLeast(1));
    typeLiteral.verify(() -> TypeLiteral.get(parameterizedTypeMock3), atLeast(1));
    key.verify(() -> Key.get(typeLiteralMock2), atLeast(1));
    realMultibinder.verify(() -> RealMultibinder.newRealSetBinder(binderMock2, keyMock2), atLeast(1));
}*/
    }

    //Sapient generated method id: ${0fe6e443-77cf-3560-b737-248cbfabd66f}, hash: 773E5C2BDA7889E0759BDD88C9E23625
    @Test()
    public void newRealMapBinderTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TypeLiteral<Map.Entry<Object, Provider<Object>>> typeLiteralMock2 = mock(TypeLiteral.class, "Key");
        //Key keyMock2 = mock(Key.class, "Key");
        /*try (MockedStatic<RealMultibinder> realMultibinder = mockStatic(RealMultibinder.class);
    MockedStatic<Key> key = mockStatic(Key.class);
    MockedStatic<TypeLiteral> typeLiteral = mockStatic(TypeLiteral.class);
    MockedStatic<Types> types = mockStatic(Types.class)) {
    doNothing().when(binderMock).install((Module) any());
    Type type = new Type();
    types.when(() -> Types.mapOf(type, typeMock)).thenReturn(parameterizedTypeMock);
    typeLiteral.when(() -> TypeLiteral.get(parameterizedTypeMock)).thenReturn(typeLiteralMock);
    key.when(() -> Key.get(typeLiteralMock, annotationMock)).thenReturn(keyMock);
    Type type2 = new Type();
    types.when(() -> Types.providerOf(type2)).thenReturn(parameterizedTypeMock2);
    Type[] typeArray = new Type[] { null, parameterizedTypeMock2 };
    types.when(() -> Types.newParameterizedTypeWithOwner(Map.class, Map.Entry.class, typeArray)).thenReturn(parameterizedTypeMock3);
    typeLiteral.when(() -> TypeLiteral.get(parameterizedTypeMock3)).thenReturn(typeLiteralMock2);
    key.when(() -> Key.get(typeLiteralMock2, annotationMock)).thenReturn(keyMock2);
    realMultibinder.when(() -> RealMultibinder.newRealSetBinder(binderMock, keyMock2)).thenReturn(entrySetBinderMock);
    TypeLiteral typeLiteral2 = TypeLiteral.get(Object.class);
    TypeLiteral typeLiteral3 = TypeLiteral.get(Object.class);
    //Act Statement(s)
    RealMapBinder<Object, Object> result = RealMapBinder.newRealMapBinder(binderMock, typeLiteral2, typeLiteral3, annotationMock);
    //Assert statement(s)
    assertThat(result, is(notNullValue()));
    verify(binderMock).install((Module) any());
    types.verify(() -> Types.mapOf(type, typeMock), atLeast(1));
    typeLiteral.verify(() -> TypeLiteral.get(parameterizedTypeMock), atLeast(1));
    key.verify(() -> Key.get(typeLiteralMock, annotationMock), atLeast(1));
    types.verify(() -> Types.providerOf(type2), atLeast(1));
    types.verify(() -> Types.newParameterizedTypeWithOwner(Map.class, Map.Entry.class, typeArray), atLeast(1));
    typeLiteral.verify(() -> TypeLiteral.get(parameterizedTypeMock3), atLeast(1));
    key.verify(() -> Key.get(typeLiteralMock2, annotationMock), atLeast(1));
    realMultibinder.verify(() -> RealMultibinder.newRealSetBinder(binderMock, keyMock2), atLeast(1));
}*/
    }

    //Sapient generated method id: ${650a27d5-15e9-3268-96e2-268c4a91f182}, hash: AF07320D6F1E02067A097E1D18C56DDB
    @Test()
    public void newRealMapBinder1Test() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        /*try (MockedStatic<RealMultibinder> realMultibinder = mockStatic(RealMultibinder.class);
    MockedStatic<Key> key = mockStatic(Key.class);
    MockedStatic<TypeLiteral> typeLiteral = mockStatic(TypeLiteral.class);
    MockedStatic<Types> types = mockStatic(Types.class)) {
    doNothing().when(binderMock).install((Module) any());
    Type type = new Type();
    types.when(() -> Types.mapOf(type, typeMock)).thenReturn(parameterizedTypeMock);
    typeLiteral.when(() -> TypeLiteral.get(parameterizedTypeMock)).thenReturn(typeLiteralMock);
    key.when(() -> Key.get(typeLiteralMock, Annotation.class)).thenReturn(keyMock);
    Type type2 = new Type();
    types.when(() -> Types.providerOf(type2)).thenReturn(parameterizedTypeMock2);
    Type[] typeArray = new Type[] { null, parameterizedTypeMock2 };
    types.when(() -> Types.newParameterizedTypeWithOwner(Map.class, Map.Entry.class, typeArray)).thenReturn(parameterizedTypeMock3);
    typeLiteral.when(() -> TypeLiteral.get(parameterizedTypeMock3)).thenReturn(typeLiteralMock2);
    key.when(() -> Key.get(typeLiteralMock2, Annotation.class)).thenReturn(keyMock2);
    realMultibinder.when(() -> RealMultibinder.newRealSetBinder(binderMock, keyMock2)).thenReturn(entrySetBinderMock);
    TypeLiteral typeLiteral2 = TypeLiteral.get(Object.class);
    TypeLiteral typeLiteral3 = TypeLiteral.get(Object.class);
    //Act Statement(s)
    RealMapBinder<Object, Object> result = RealMapBinder.newRealMapBinder(binderMock, typeLiteral2, typeLiteral3, Annotation.class);
    //Assert statement(s)
    assertThat(result, is(notNullValue()));
    verify(binderMock).install((Module) any());
    types.verify(() -> Types.mapOf(type, typeMock), atLeast(1));
    typeLiteral.verify(() -> TypeLiteral.get(parameterizedTypeMock), atLeast(1));
    key.verify(() -> Key.get(typeLiteralMock, Annotation.class), atLeast(1));
    types.verify(() -> Types.providerOf(type2), atLeast(1));
    types.verify(() -> Types.newParameterizedTypeWithOwner(Map.class, Map.Entry.class, typeArray), atLeast(1));
    typeLiteral.verify(() -> TypeLiteral.get(parameterizedTypeMock3), atLeast(1));
    key.verify(() -> Key.get(typeLiteralMock2, Annotation.class), atLeast(1));
    realMultibinder.verify(() -> RealMultibinder.newRealSetBinder(binderMock, keyMock2), atLeast(1));
}*/
    }

    //Sapient generated method id: ${fdc5ff0e-48f6-3ffc-bd15-6aa54a16a841}, hash: 8E036588613EEA138A9345BF50AC2CC2
    @Ignore()
    @Test()
    public void mapOfTest() {
        //Arrange Statement(s)
        try (MockedStatic<TypeLiteral> typeLiteral = mockStatic(TypeLiteral.class);
             MockedStatic<Types> types = mockStatic(Types.class)) {
            doReturn(typeMock).when(keyTypeMock).getType();
            doReturn(typeMock2).when(valueTypeMock).getType();
            types.when(() -> Types.mapOf(typeMock, typeMock2)).thenReturn(parameterizedTypeMock);
            typeLiteral.when(() -> TypeLiteral.get(parameterizedTypeMock)).thenReturn(typeLiteralMock);
            //Act Statement(s)
            TypeLiteral<Map<Object, Object>> result = RealMapBinder.mapOf(keyTypeMock, valueTypeMock);
            //Assert statement(s)
            assertThat(result, equalTo(typeLiteralMock));
            verify(keyTypeMock).getType();
            verify(valueTypeMock).getType();
            types.verify(() -> Types.mapOf(typeMock, typeMock2), atLeast(1));
            typeLiteral.verify(() -> TypeLiteral.get(parameterizedTypeMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${08025ccf-2d90-38d6-b251-0d982eca9bc1}, hash: 12682A9FAC604D2D3E179EF7C3D3D079
    @Ignore()
    @Test()
    public void mapOfProviderOfTest() {
        //Arrange Statement(s)
        TypeLiteral<Map<Object, Provider<Object>>> typeLiteralMock = mock(TypeLiteral.class);
        try (MockedStatic<TypeLiteral> typeLiteral = mockStatic(TypeLiteral.class);
             MockedStatic<Types> types = mockStatic(Types.class)) {
            doReturn(typeMock).when(keyTypeMock).getType();
            doReturn(typeMock2).when(valueTypeMock).getType();
            types.when(() -> Types.providerOf(typeMock2)).thenReturn(parameterizedTypeMock);
            types.when(() -> Types.mapOf(typeMock, parameterizedTypeMock)).thenReturn(parameterizedTypeMock2);
            typeLiteral.when(() -> TypeLiteral.get(parameterizedTypeMock2)).thenReturn(typeLiteralMock);
            //Act Statement(s)
            TypeLiteral<Map<Object, Provider<Object>>> result = RealMapBinder.mapOfProviderOf(keyTypeMock, valueTypeMock);
            //Assert statement(s)
            assertThat(result, equalTo(typeLiteralMock));
            verify(keyTypeMock).getType();
            verify(valueTypeMock).getType();
            types.verify(() -> Types.providerOf(typeMock2), atLeast(1));
            types.verify(() -> Types.mapOf(typeMock, parameterizedTypeMock), atLeast(1));
            typeLiteral.verify(() -> TypeLiteral.get(parameterizedTypeMock2), atLeast(1));
        }
    }

    //Sapient generated method id: ${8128c444-d0a8-3ab9-8549-675c0e32af8a}, hash: 37564610C36C03C320A0FA88762E2F18
    @Ignore()
    @Test()
    public void mapOfJakartaProviderOfTest() {
        //Arrange Statement(s)
        TypeLiteral<Map<Object, jakarta.inject.Provider<Object>>> typeLiteralMock = mock(TypeLiteral.class);
        try (MockedStatic<TypeLiteral> typeLiteral = mockStatic(TypeLiteral.class);
             MockedStatic<Types> types = mockStatic(Types.class)) {
            doReturn(typeMock).when(keyTypeMock).getType();
            doReturn(typeMock2).when(valueTypeMock).getType();
            Type[] typeArray = new Type[]{typeMock2};
            types.when(() -> Types.newParameterizedType(jakarta.inject.Provider.class, typeArray)).thenReturn(parameterizedTypeMock);
            types.when(() -> Types.mapOf(typeMock, parameterizedTypeMock)).thenReturn(parameterizedTypeMock2);
            typeLiteral.when(() -> TypeLiteral.get(parameterizedTypeMock2)).thenReturn(typeLiteralMock);
            //Act Statement(s)
            TypeLiteral<Map<Object, jakarta.inject.Provider<Object>>> result = RealMapBinder.mapOfJakartaProviderOf(keyTypeMock, valueTypeMock);
            //Assert statement(s)
            assertThat(result, equalTo(typeLiteralMock));
            verify(keyTypeMock).getType();
            verify(valueTypeMock).getType();
            types.verify(() -> Types.newParameterizedType(jakarta.inject.Provider.class, typeArray), atLeast(1));
            types.verify(() -> Types.mapOf(typeMock, parameterizedTypeMock), atLeast(1));
            typeLiteral.verify(() -> TypeLiteral.get(parameterizedTypeMock2), atLeast(1));
        }
    }

    //Sapient generated method id: ${524d07a7-d2ec-323f-8d42-369c3651fb60}, hash: 9FB28A6C9688348C54B4B13455E814AA
    @Ignore()
    @Test()
    public void mapOfSetOfProviderOfTest() {
        //Arrange Statement(s)
        TypeLiteral<Map<Object, Set<Provider<Object>>>> typeLiteralMock = mock(TypeLiteral.class);
        try (MockedStatic<TypeLiteral> typeLiteral = mockStatic(TypeLiteral.class);
             MockedStatic<Types> types = mockStatic(Types.class)) {
            doReturn(typeMock).when(keyTypeMock).getType();
            doReturn(typeMock2).when(valueTypeMock).getType();
            types.when(() -> Types.providerOf(typeMock2)).thenReturn(parameterizedTypeMock);
            types.when(() -> Types.setOf(parameterizedTypeMock)).thenReturn(parameterizedTypeMock2);
            types.when(() -> Types.mapOf(typeMock, parameterizedTypeMock2)).thenReturn(parameterizedTypeMock3);
            typeLiteral.when(() -> TypeLiteral.get(parameterizedTypeMock3)).thenReturn(typeLiteralMock);
            //Act Statement(s)
            TypeLiteral<Map<Object, Set<Provider<Object>>>> result = RealMapBinder.mapOfSetOfProviderOf(keyTypeMock, valueTypeMock);
            //Assert statement(s)
            assertThat(result, equalTo(typeLiteralMock));
            verify(keyTypeMock).getType();
            verify(valueTypeMock).getType();
            types.verify(() -> Types.providerOf(typeMock2), atLeast(1));
            types.verify(() -> Types.setOf(parameterizedTypeMock), atLeast(1));
            types.verify(() -> Types.mapOf(typeMock, parameterizedTypeMock2), atLeast(1));
            typeLiteral.verify(() -> TypeLiteral.get(parameterizedTypeMock3), atLeast(1));
        }
    }

    //Sapient generated method id: ${a9c9eb8e-e5ef-3593-a7b1-32012afe401c}, hash: DB0CC4ED2B871557FB44774F84FC08CA
    @Ignore()
    @Test()
    public void mapOfSetOfJakartaProviderOfTest() {
        //Arrange Statement(s)
        TypeLiteral<Map<Object, Set<jakarta.inject.Provider<Object>>>> typeLiteralMock = mock(TypeLiteral.class);
        try (MockedStatic<TypeLiteral> typeLiteral = mockStatic(TypeLiteral.class);
             MockedStatic<Types> types = mockStatic(Types.class)) {
            doReturn(typeMock).when(keyTypeMock).getType();
            doReturn(typeMock2).when(valueTypeMock).getType();
            types.when(() -> Types.jakartaProviderOf(typeMock2)).thenReturn(typeMock3);
            types.when(() -> Types.setOf(typeMock3)).thenReturn(parameterizedTypeMock);
            types.when(() -> Types.mapOf(typeMock, parameterizedTypeMock)).thenReturn(parameterizedTypeMock2);
            typeLiteral.when(() -> TypeLiteral.get(parameterizedTypeMock2)).thenReturn(typeLiteralMock);
            //Act Statement(s)
            TypeLiteral<Map<Object, Set<jakarta.inject.Provider<Object>>>> result = RealMapBinder.mapOfSetOfJakartaProviderOf(keyTypeMock, valueTypeMock);
            //Assert statement(s)
            assertThat(result, equalTo(typeLiteralMock));
            verify(keyTypeMock).getType();
            verify(valueTypeMock).getType();
            types.verify(() -> Types.jakartaProviderOf(typeMock2), atLeast(1));
            types.verify(() -> Types.setOf(typeMock3), atLeast(1));
            types.verify(() -> Types.mapOf(typeMock, parameterizedTypeMock), atLeast(1));
            typeLiteral.verify(() -> TypeLiteral.get(parameterizedTypeMock2), atLeast(1));
        }
    }

    //Sapient generated method id: ${53a38e1d-ee70-3ddd-b14f-cdf95396c3da}, hash: 6C627FFBDCA5ADDBC3B2F55D274C637C
    @Ignore()
    @Test()
    public void mapOfCollectionOfProviderOfTest() {
        //Arrange Statement(s)
        TypeLiteral<Map<Object, Collection<Provider<Object>>>> typeLiteralMock = mock(TypeLiteral.class);
        try (MockedStatic<TypeLiteral> typeLiteral = mockStatic(TypeLiteral.class);
             MockedStatic<Types> types = mockStatic(Types.class)) {
            doReturn(typeMock).when(keyTypeMock).getType();
            doReturn(typeMock2).when(valueTypeMock).getType();
            types.when(() -> Types.providerOf(typeMock2)).thenReturn(parameterizedTypeMock);
            types.when(() -> Types.collectionOf(parameterizedTypeMock)).thenReturn(parameterizedTypeMock2);
            types.when(() -> Types.mapOf(typeMock, parameterizedTypeMock2)).thenReturn(parameterizedTypeMock3);
            typeLiteral.when(() -> TypeLiteral.get(parameterizedTypeMock3)).thenReturn(typeLiteralMock);
            //Act Statement(s)
            TypeLiteral<Map<Object, Collection<Provider<Object>>>> result = RealMapBinder.mapOfCollectionOfProviderOf(keyTypeMock, valueTypeMock);
            //Assert statement(s)
            assertThat(result, equalTo(typeLiteralMock));
            verify(keyTypeMock).getType();
            verify(valueTypeMock).getType();
            types.verify(() -> Types.providerOf(typeMock2), atLeast(1));
            types.verify(() -> Types.collectionOf(parameterizedTypeMock), atLeast(1));
            types.verify(() -> Types.mapOf(typeMock, parameterizedTypeMock2), atLeast(1));
            typeLiteral.verify(() -> TypeLiteral.get(parameterizedTypeMock3), atLeast(1));
        }
    }

    //Sapient generated method id: ${7dbc6040-d922-387f-ad6b-64514f151b50}, hash: 55733E6A598D4AD1F5982BA8B6C4F11C
    @Ignore()
    @Test()
    public void mapOfCollectionOfJakartaProviderOfTest() {
        //Arrange Statement(s)
        TypeLiteral<Map<Object, Collection<jakarta.inject.Provider<Object>>>> typeLiteralMock = mock(TypeLiteral.class);
        try (MockedStatic<TypeLiteral> typeLiteral = mockStatic(TypeLiteral.class);
             MockedStatic<Types> types = mockStatic(Types.class)) {
            doReturn(typeMock).when(keyTypeMock).getType();
            doReturn(typeMock2).when(valueTypeMock).getType();
            types.when(() -> Types.jakartaProviderOf(typeMock2)).thenReturn(typeMock3);
            types.when(() -> Types.collectionOf(typeMock3)).thenReturn(parameterizedTypeMock);
            types.when(() -> Types.mapOf(typeMock, parameterizedTypeMock)).thenReturn(parameterizedTypeMock2);
            typeLiteral.when(() -> TypeLiteral.get(parameterizedTypeMock2)).thenReturn(typeLiteralMock);
            //Act Statement(s)
            TypeLiteral<Map<Object, Collection<jakarta.inject.Provider<Object>>>> result = RealMapBinder.mapOfCollectionOfJakartaProviderOf(keyTypeMock, valueTypeMock);
            //Assert statement(s)
            assertThat(result, equalTo(typeLiteralMock));
            verify(keyTypeMock).getType();
            verify(valueTypeMock).getType();
            types.verify(() -> Types.jakartaProviderOf(typeMock2), atLeast(1));
            types.verify(() -> Types.collectionOf(typeMock3), atLeast(1));
            types.verify(() -> Types.mapOf(typeMock, parameterizedTypeMock), atLeast(1));
            typeLiteral.verify(() -> TypeLiteral.get(parameterizedTypeMock2), atLeast(1));
        }
    }

    //Sapient generated method id: ${2281b405-c006-309c-83c9-bf9a422765a4}, hash: 708193B6809B255006C6BE7C4C64B4EA
    @Ignore()
    @Test()
    public void entryOfProviderOfTest() {
        //Arrange Statement(s)
        TypeLiteral<Map.Entry<Object, Provider<Object>>> typeLiteralMock = mock(TypeLiteral.class);
        try (MockedStatic<TypeLiteral> typeLiteral = mockStatic(TypeLiteral.class);
             MockedStatic<Types> types = mockStatic(Types.class)) {
            doReturn(typeMock).when(keyTypeMock).getType();
            doReturn(typeMock2).when(valueTypeMock).getType();
            types.when(() -> Types.providerOf(typeMock2)).thenReturn(parameterizedTypeMock);
            Type[] typeArray = new Type[]{typeMock, parameterizedTypeMock};
            types.when(() -> Types.newParameterizedTypeWithOwner(Map.class, Map.Entry.class, typeArray)).thenReturn(parameterizedTypeMock2);
            typeLiteral.when(() -> TypeLiteral.get(parameterizedTypeMock2)).thenReturn(typeLiteralMock);
            //Act Statement(s)
            TypeLiteral<Map.Entry<Object, Provider<Object>>> result = RealMapBinder.entryOfProviderOf(keyTypeMock, valueTypeMock);
            //Assert statement(s)
            assertThat(result, equalTo(typeLiteralMock));
            verify(keyTypeMock).getType();
            verify(valueTypeMock).getType();
            types.verify(() -> Types.providerOf(typeMock2), atLeast(1));
            types.verify(() -> Types.newParameterizedTypeWithOwner(Map.class, Map.Entry.class, typeArray), atLeast(1));
            typeLiteral.verify(() -> TypeLiteral.get(parameterizedTypeMock2), atLeast(1));
        }
    }

    //Sapient generated method id: ${c46de4c8-d556-3da2-80f2-a9acd50b74cd}, hash: 74B4C0F08915A6CB9A34E7A6005D2274
    @Ignore()
    @Test()
    public void entryOfJakartaProviderOfTest() {
        //Arrange Statement(s)
        TypeLiteral<Map.Entry<Object, Provider<Object>>> typeLiteralMock = mock(TypeLiteral.class);
        try (MockedStatic<TypeLiteral> typeLiteral = mockStatic(TypeLiteral.class);
             MockedStatic<Types> types = mockStatic(Types.class)) {
            doReturn(typeMock).when(keyTypeMock).getType();
            doReturn(typeMock2).when(valueTypeMock).getType();
            types.when(() -> Types.jakartaProviderOf(typeMock2)).thenReturn(typeMock3);
            Type[] typeArray = new Type[]{typeMock, typeMock3};
            types.when(() -> Types.newParameterizedTypeWithOwner(Map.class, Map.Entry.class, typeArray)).thenReturn(parameterizedTypeMock);
            typeLiteral.when(() -> TypeLiteral.get(parameterizedTypeMock)).thenReturn(typeLiteralMock);
            //Act Statement(s)
            TypeLiteral<Map.Entry<Object, Provider<Object>>> result = RealMapBinder.entryOfJakartaProviderOf(keyTypeMock, valueTypeMock);
            //Assert statement(s)
            assertThat(result, equalTo(typeLiteralMock));
            verify(keyTypeMock).getType();
            verify(valueTypeMock).getType();
            types.verify(() -> Types.jakartaProviderOf(typeMock2), atLeast(1));
            types.verify(() -> Types.newParameterizedTypeWithOwner(Map.class, Map.Entry.class, typeArray), atLeast(1));
            typeLiteral.verify(() -> TypeLiteral.get(parameterizedTypeMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${8d0e0726-d768-35b6-bd5a-4147e9393122}, hash: 1B20394AD547C31583BE7928043D8813
    @Ignore()
    @Test()
    public void setOfEntryOfJakartaProviderOfTest() {
        //Arrange Statement(s)
        TypeLiteral<Map.Entry<Object, Provider<Object>>> typeLiteralMock = mock(TypeLiteral.class);
        TypeLiteral<Set<Map.Entry<Object, jakarta.inject.Provider<Object>>>> typeLiteralMock2 = mock(TypeLiteral.class);
        try (MockedStatic<TypeLiteral> typeLiteral = mockStatic(TypeLiteral.class);
             MockedStatic<Types> types = mockStatic(Types.class)) {
            doReturn(typeMock).when(keyTypeMock).getType();
            doReturn(typeMock2).when(valueTypeMock).getType();
            types.when(() -> Types.jakartaProviderOf(typeMock2)).thenReturn(typeMock3);
            Type[] typeArray = new Type[]{typeMock, typeMock3};
            types.when(() -> Types.newParameterizedTypeWithOwner(Map.class, Map.Entry.class, typeArray)).thenReturn(parameterizedTypeMock);
            typeLiteral.when(() -> TypeLiteral.get(parameterizedTypeMock)).thenReturn(typeLiteralMock);
            doReturn(typeMock4).when(typeLiteralMock).getType();
            types.when(() -> Types.setOf(typeMock4)).thenReturn(parameterizedTypeMock2);
            typeLiteral.when(() -> TypeLiteral.get(parameterizedTypeMock2)).thenReturn(typeLiteralMock2);
            //Act Statement(s)
            TypeLiteral<Set<Map.Entry<Object, jakarta.inject.Provider<Object>>>> result = RealMapBinder.setOfEntryOfJakartaProviderOf(keyTypeMock, valueTypeMock);
            //Assert statement(s)
            assertThat(result, equalTo(typeLiteralMock2));
            verify(keyTypeMock).getType();
            verify(valueTypeMock).getType();
            types.verify(() -> Types.jakartaProviderOf(typeMock2), atLeast(1));
            types.verify(() -> Types.newParameterizedTypeWithOwner(Map.class, Map.Entry.class, typeArray), atLeast(1));
            typeLiteral.verify(() -> TypeLiteral.get(parameterizedTypeMock), atLeast(1));
            verify(typeLiteralMock).getType();
            types.verify(() -> Types.setOf(typeMock4), atLeast(1));
            typeLiteral.verify(() -> TypeLiteral.get(parameterizedTypeMock2), atLeast(1));
        }
    }

    //Sapient generated method id: ${18e8f246-8d80-3691-bc7a-a16855b30936}, hash: 8DB8DAC548AEF07169B8CDE0AE9A919C
    @Test()
    public void newRealMapBinder2Test() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: valueTypeAndAnnotation
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TypeLiteral<Map.Entry<Object, Provider<Object>>> typeLiteralMock2 = mock(TypeLiteral.class, "TypeLiteral");
        //Key keyMock = mock(Key.class, "Key");
        /*try (MockedStatic<RealMultibinder> realMultibinder = mockStatic(RealMultibinder.class);
    MockedStatic<TypeLiteral> typeLiteral = mockStatic(TypeLiteral.class);
    MockedStatic<Types> types = mockStatic(Types.class)) {
    doNothing().when(binderMock).install((Module) any());
    doReturn(typeMock, typeMock2).when(valueTypeMock).getType();
    Type type = new Type();
    types.when(() -> Types.mapOf(type, typeMock)).thenReturn(parameterizedTypeMock);
    typeLiteral.when(() -> TypeLiteral.get(parameterizedTypeMock)).thenReturn(typeLiteralMock);
    types.when(() -> Types.providerOf(typeMock2)).thenReturn(parameterizedTypeMock2);
    Type[] typeArray = new Type[] { null, parameterizedTypeMock2 };
    types.when(() -> Types.newParameterizedTypeWithOwner(Map.class, Map.Entry.class, typeArray)).thenReturn(parameterizedTypeMock3);
    typeLiteral.when(() -> TypeLiteral.get(parameterizedTypeMock3)).thenReturn(typeLiteralMock2);
    realMultibinder.when(() -> RealMultibinder.newRealSetBinder(binderMock, keyMock)).thenReturn(entrySetBinderMock);
    TypeLiteral typeLiteral2 = TypeLiteral.get(Object.class);
    Key key = Key.get(Object.class);
    //Act Statement(s)
    RealMapBinder<Object, Object> result = RealMapBinder.newRealMapBinder(binderMock, typeLiteral2, key);
    //Assert statement(s)
    assertThat(result, is(notNullValue()));
    verify(binderMock).install((Module) any());
    verify(valueTypeMock, atLeast(2)).getType();
    types.verify(() -> Types.mapOf(type, typeMock), atLeast(1));
    typeLiteral.verify(() -> TypeLiteral.get(parameterizedTypeMock), atLeast(1));
    types.verify(() -> Types.providerOf(typeMock2), atLeast(1));
    types.verify(() -> Types.newParameterizedTypeWithOwner(Map.class, Map.Entry.class, typeArray), atLeast(1));
    typeLiteral.verify(() -> TypeLiteral.get(parameterizedTypeMock3), atLeast(1));
    realMultibinder.verify(() -> RealMultibinder.newRealSetBinder(binderMock, keyMock), atLeast(1));
}*/
    }

    //Sapient generated method id: ${5b90abef-e49e-3f6b-9210-2833a28f8945}, hash: 2EB17D9A794F6D3018787914C28B0EFD
    @Test()
    public void permitDuplicatesWhenBindingSelectionNotIsInitialized() {
    }

    //Sapient generated method id: ${e37cef47-11a1-345a-8ade-9680b8876c7a}, hash: 15BB460F74F44ED7806DB360A5DD9098
    @Test()
    public void getKeyForNewValueWhenBindingSelectionNotIsInitialized() {
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
        TypeLiteral<Map.Entry<Object, Provider<Object>>> typeLiteralMock2 = mock(TypeLiteral.class, "TypeLiteral");
        Object objectMock = mock(Object.class, "Object");
        Key<Object> keyMock3 = mock(Key.class, "TypeLiteral");
        TypeLiteral typeLiteralMock3 = mock(TypeLiteral.class);
    }

    //Sapient generated method id: ${ec2f3da5-eede-3d4b-9493-a710102288c9}, hash: E3C03924B49888350C5E131FD69D2DA7
    @Test()
    public void addBindingTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Key keyMock = mock(Key.class);
        Key<Map<Object, Object>> keyMock2 = mock(Key.class);
        Key keyMock3 = mock(Key.class);
    }

    //Sapient generated method id: ${b38b3436-f7f6-31d8-b86c-04723d5c511e}, hash: DFEAAECB2322FC71897C1A72B2EA446C
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
        Binder binderMock2 = mock(Binder.class);
        Key<Map<Object, Provider<Object>>> keyMock = mock(Key.class);
        ScopedBindingBuilder scopedBindingBuilderMock = mock(ScopedBindingBuilder.class);
        LinkedBindingBuilder linkedBindingBuilderMock2 = mock(LinkedBindingBuilder.class);
        Key<Map<Object, jakarta.inject.Provider<Object>>> keyMock2 = mock(Key.class);
        ScopedBindingBuilder scopedBindingBuilderMock2 = mock(ScopedBindingBuilder.class);
        Key<Map<Object, Provider<Object>>> keyMock3 = mock(Key.class);
        LinkedBindingBuilder linkedBindingBuilderMock3 = mock(LinkedBindingBuilder.class);
        Key<Map<Object, Object>> keyMock4 = mock(Key.class);
        ScopedBindingBuilder scopedBindingBuilderMock3 = mock(ScopedBindingBuilder.class);
        LinkedBindingBuilder linkedBindingBuilderMock4 = mock(LinkedBindingBuilder.class);
        Key<Map<Object, Object>> keyMock5 = mock(Key.class);
        ScopedBindingBuilder scopedBindingBuilderMock4 = mock(ScopedBindingBuilder.class);
        Key<Map<Object, Object>> keyMock6 = mock(Key.class);
        LinkedBindingBuilder linkedBindingBuilderMock5 = mock(LinkedBindingBuilder.class);
        Key<Set<Map.Entry<Object, jakarta.inject.Provider<Object>>>> keyMock7 = mock(Key.class);
        ScopedBindingBuilder scopedBindingBuilderMock5 = mock(ScopedBindingBuilder.class);
        Key<Set<Object>> keyMock8 = mock(Key.class);
        Key<Map<Object, Object>> keyMock9 = mock(Key.class);
        Key keyMock10 = mock(Key.class);
    }
}

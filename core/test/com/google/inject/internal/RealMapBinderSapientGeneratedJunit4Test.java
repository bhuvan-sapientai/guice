package com.google.inject.internal;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.lang.annotation.Annotation;

import com.google.inject.TypeLiteral;

import java.lang.reflect.ParameterizedType;
import java.util.Map;
import java.lang.reflect.Type;

import com.google.inject.Provider;

import java.util.Set;
import java.util.Collection;

import com.google.inject.Module;
import org.mockito.MockedStatic;
import com.google.inject.Binder;
import com.google.inject.Key;
import com.google.inject.util.Types;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
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

    private final Binder binderMock = mock(Binder.class);

    private final Key<Map<Object, Object>> keyMock = mock(Key.class);

    private final Key keyMock2 = mock(Key.class);

    private final TypeLiteral<Object> keyTypeMock = mock(TypeLiteral.class);

    private final ParameterizedType parameterizedTypeMock = mock(ParameterizedType.class);

    private final ParameterizedType parameterizedTypeMock2 = mock(ParameterizedType.class);

    private final ParameterizedType parameterizedTypeMock3 = mock(ParameterizedType.class);

    private final RealMultibinder<Map.Entry<Object, Provider<Object>>> realMultibinderMock = mock(RealMultibinder.class);

    private final TypeLiteral<Map.Entry<Object, Provider<Object>>> typeLiteralMock = mock(TypeLiteral.class);

    private final Type typeMock = mock(Type.class);

    private final Type typeMock2 = mock(Type.class);

    private final Type typeMock3 = mock(Type.class);

    private final TypeLiteral<Object> valueTypeMock = mock(TypeLiteral.class);

    //Sapient generated method id: ${796759fb-d20e-34dc-b1e6-d7da586001fd}, hash: B0BA320BC06E945E07B56A2C29DFA251
    @Test()
    public void newMapRealBinderTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //Binder binderMock = mock(Binder.class, "Binder");
        //Key keyMock = mock(Key.class);
        /*try (MockedStatic<RealMultibinder> realMultibinder = mockStatic(RealMultibinder.class);
    MockedStatic<Key> key = mockStatic(Key.class, CALLS_REAL_METHODS);
    MockedStatic<TypeLiteral> typeLiteral = mockStatic(TypeLiteral.class);
    MockedStatic<Types> types = mockStatic(Types.class, CALLS_REAL_METHODS)) {
    doNothing().when(binderMock).install((Module) any());
    ParameterizedType parameterizedType = Types.mapOf(java.lang.Object, java.lang.Object);
    TypeLiteral<Map<Object, Object>> typeLiteral3 = TypeLiteral.get(parameterizedType);
    typeLiteral.when(() -> TypeLiteral.get((ParameterizedType) any())).thenReturn(typeLiteral3);
    ParameterizedType parameterizedType2 = Types.providerOf(java.lang.Object);
    Type[] typeArray = new Type[] { null, parameterizedType2 };
    types.when(() -> Types.newParameterizedTypeWithOwner(Map.class, Map.Entry.class, typeArray)).thenReturn(parameterizedTypeMock);
    typeLiteral.when(() -> TypeLiteral.get(parameterizedTypeMock)).thenReturn(typeLiteralMock);
    key.when(() -> Key.get(typeLiteralMock)).thenReturn(keyMock);
    realMultibinder.when(() -> RealMultibinder.newRealSetBinder(binderMock, keyMock)).thenReturn(realMultibinderMock);
    TypeLiteral typeLiteral4 = TypeLiteral.get(Object.class);
    TypeLiteral typeLiteral5 = TypeLiteral.get(Object.class);
    //Act Statement(s)
    RealMapBinder<Object, Object> result = RealMapBinder.newMapRealBinder(binderMock, typeLiteral4, typeLiteral5);
    //Assert statement(s)
    assertThat(result, is(notNullValue()));
    verify(binderMock, atLeast(1)).install((Module) any());
    typeLiteral.verify(() -> TypeLiteral.get((ParameterizedType) any()), atLeast(1));
    types.verify(() -> Types.newParameterizedTypeWithOwner(Map.class, Map.Entry.class, typeArray), atLeast(1));
    typeLiteral.verify(() -> TypeLiteral.get(parameterizedTypeMock), atLeast(1));
    key.verify(() -> Key.get(typeLiteralMock), atLeast(1));
    realMultibinder.verify(() -> RealMultibinder.newRealSetBinder(binderMock, keyMock), atLeast(1));
}*/
    }

    //Sapient generated method id: ${0fe6e443-77cf-3560-b737-248cbfabd66f}, hash: 300E47A7D8B58C0C732BF937D0A62748
    @Test()
    public void newRealMapBinderTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //Annotation annotationMock = mock(Annotation.class);
        /*try (MockedStatic<RealMultibinder> realMultibinder = mockStatic(RealMultibinder.class);
    MockedStatic<Key> key = mockStatic(Key.class);
    MockedStatic<TypeLiteral> typeLiteral = mockStatic(TypeLiteral.class);
    MockedStatic<Types> types = mockStatic(Types.class, CALLS_REAL_METHODS)) {
    doNothing().when(binderMock).install((Module) any());
    ParameterizedType parameterizedType = Types.mapOf(java.lang.Object, java.lang.Object);
    TypeLiteral<Map<Object, Object>> typeLiteral3 = TypeLiteral.get(parameterizedType);
    typeLiteral.when(() -> TypeLiteral.get((ParameterizedType) any())).thenReturn(typeLiteral3);
    key.when(() -> Key.get((TypeLiteral) any(), eq(annotationMock))).thenReturn(keyMock);
    ParameterizedType parameterizedType2 = Types.providerOf(java.lang.Object);
    Type[] typeArray = new Type[] { null, parameterizedType2 };
    types.when(() -> Types.newParameterizedTypeWithOwner(Map.class, Map.Entry.class, typeArray)).thenReturn(parameterizedTypeMock);
    typeLiteral.when(() -> TypeLiteral.get(parameterizedTypeMock)).thenReturn(typeLiteralMock);
    key.when(() -> Key.get(typeLiteralMock, annotationMock)).thenReturn(keyMock2);
    realMultibinder.when(() -> RealMultibinder.newRealSetBinder(binderMock, keyMock2)).thenReturn(realMultibinderMock);
    TypeLiteral typeLiteral4 = TypeLiteral.get(Object.class);
    TypeLiteral typeLiteral5 = TypeLiteral.get(Object.class);
    //Act Statement(s)
    RealMapBinder<Object, Object> result = RealMapBinder.newRealMapBinder(binderMock, typeLiteral4, typeLiteral5, annotationMock);
    //Assert statement(s)
    assertThat(result, is(notNullValue()));
    verify(binderMock, atLeast(1)).install((Module) any());
    typeLiteral.verify(() -> TypeLiteral.get((ParameterizedType) any()), atLeast(1));
    key.verify(() -> Key.get((TypeLiteral) any(), eq(annotationMock)), atLeast(1));
    types.verify(() -> Types.newParameterizedTypeWithOwner(Map.class, Map.Entry.class, typeArray), atLeast(1));
    typeLiteral.verify(() -> TypeLiteral.get(parameterizedTypeMock), atLeast(1));
    key.verify(() -> Key.get(typeLiteralMock, annotationMock), atLeast(1));
    realMultibinder.verify(() -> RealMultibinder.newRealSetBinder(binderMock, keyMock2), atLeast(1));
}*/
    }

    //Sapient generated method id: ${650a27d5-15e9-3268-96e2-268c4a91f182}, hash: F1D0CDFD0C23039C84CFAD58C2E56FA3
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
    MockedStatic<Types> types = mockStatic(Types.class, CALLS_REAL_METHODS)) {
    doNothing().when(binderMock).install((Module) any());
    ParameterizedType parameterizedType = Types.mapOf(java.lang.Object, java.lang.Object);
    TypeLiteral<Map<Object, Object>> typeLiteral3 = TypeLiteral.get(parameterizedType);
    typeLiteral.when(() -> TypeLiteral.get((ParameterizedType) any())).thenReturn(typeLiteral3);
    key.when(() -> Key.get((TypeLiteral) any(), eq(Annotation.class))).thenReturn(keyMock);
    ParameterizedType parameterizedType2 = Types.providerOf(java.lang.Object);
    Type[] typeArray = new Type[] { null, parameterizedType2 };
    types.when(() -> Types.newParameterizedTypeWithOwner(Map.class, Map.Entry.class, typeArray)).thenReturn(parameterizedTypeMock);
    typeLiteral.when(() -> TypeLiteral.get(parameterizedTypeMock)).thenReturn(typeLiteralMock);
    key.when(() -> Key.get(typeLiteralMock, Annotation.class)).thenReturn(keyMock2);
    realMultibinder.when(() -> RealMultibinder.newRealSetBinder(binderMock, keyMock2)).thenReturn(realMultibinderMock);
    TypeLiteral typeLiteral4 = TypeLiteral.get(Object.class);
    TypeLiteral typeLiteral5 = TypeLiteral.get(Object.class);
    //Act Statement(s)
    RealMapBinder<Object, Object> result = RealMapBinder.newRealMapBinder(binderMock, typeLiteral4, typeLiteral5, Annotation.class);
    //Assert statement(s)
    assertThat(result, is(notNullValue()));
    verify(binderMock, atLeast(1)).install((Module) any());
    typeLiteral.verify(() -> TypeLiteral.get((ParameterizedType) any()), atLeast(1));
    key.verify(() -> Key.get((TypeLiteral) any(), eq(Annotation.class)), atLeast(1));
    types.verify(() -> Types.newParameterizedTypeWithOwner(Map.class, Map.Entry.class, typeArray), atLeast(1));
    typeLiteral.verify(() -> TypeLiteral.get(parameterizedTypeMock), atLeast(1));
    key.verify(() -> Key.get(typeLiteralMock, Annotation.class), atLeast(1));
    realMultibinder.verify(() -> RealMultibinder.newRealSetBinder(binderMock, keyMock2), atLeast(1));
}*/
    }

    //Sapient generated method id: ${fdc5ff0e-48f6-3ffc-bd15-6aa54a16a841}, hash: 79721135066580B96AAB29C15D5CC9EC
    @Ignore()
    @Test()
    public void mapOfTest() {
        //Arrange Statement(s)
        TypeLiteral<Map<Object, Object>> typeLiteralMock = mock(TypeLiteral.class);
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

    //Sapient generated method id: ${2281b405-c006-309c-83c9-bf9a422765a4}, hash: EE7BF8BB6D06581F4A49AB8C85067748
    @Ignore()
    @Test()
    public void entryOfProviderOfTest() {
        //Arrange Statement(s)
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

    //Sapient generated method id: ${c46de4c8-d556-3da2-80f2-a9acd50b74cd}, hash: 9C210A68A7A7736EBCEF39FCF526EE86
    @Ignore()
    @Test()
    public void entryOfJakartaProviderOfTest() {
        //Arrange Statement(s)
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

    //Sapient generated method id: ${8d0e0726-d768-35b6-bd5a-4147e9393122}, hash: C7396879127AC44549198ABC257E5958
    @Ignore()
    @Test()
    public void setOfEntryOfJakartaProviderOfTest() {
        //Arrange Statement(s)
        Type typeMock4 = mock(Type.class);
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

    //Sapient generated method id: ${18e8f246-8d80-3691-bc7a-a16855b30936}, hash: AFBF7511A4691F353CA8D234148D9AD1
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
        //Binder binderMock = mock(Binder.class, "Binder");
        /*try (MockedStatic<RealMultibinder> realMultibinder = mockStatic(RealMultibinder.class);
    MockedStatic<TypeLiteral> typeLiteral = mockStatic(TypeLiteral.class);
    MockedStatic<Types> types = mockStatic(Types.class, CALLS_REAL_METHODS)) {
    doNothing().when(binderMock).install((Module) any());
    ParameterizedType parameterizedType = Types.mapOf(java.lang.Object, java.lang.Object);
    TypeLiteral<Map<Object, Object>> typeLiteral3 = TypeLiteral.get(parameterizedType);
    typeLiteral.when(() -> TypeLiteral.get((ParameterizedType) any())).thenReturn(typeLiteral3);
    ParameterizedType parameterizedType2 = Types.providerOf(java.lang.Object);
    Type[] typeArray = new Type[] { null, parameterizedType2 };
    types.when(() -> Types.newParameterizedTypeWithOwner(Map.class, Map.Entry.class, typeArray)).thenReturn(parameterizedTypeMock);
    typeLiteral.when(() -> TypeLiteral.get(parameterizedTypeMock)).thenReturn(typeLiteralMock);
    realMultibinder.when(() -> RealMultibinder.newRealSetBinder(eq(binderMock), (Key) any())).thenReturn(realMultibinderMock);
    TypeLiteral typeLiteral4 = TypeLiteral.get(Object.class);
    Key key = Key.get(Object.class);
    //Act Statement(s)
    RealMapBinder<Object, Object> result = RealMapBinder.newRealMapBinder(binderMock, typeLiteral4, key);
    //Assert statement(s)
    assertThat(result, is(notNullValue()));
    verify(binderMock, atLeast(1)).install((Module) any());
    typeLiteral.verify(() -> TypeLiteral.get((ParameterizedType) any()), atLeast(1));
    types.verify(() -> Types.newParameterizedTypeWithOwner(Map.class, Map.Entry.class, typeArray), atLeast(1));
    typeLiteral.verify(() -> TypeLiteral.get(parameterizedTypeMock), atLeast(1));
    realMultibinder.verify(() -> RealMultibinder.newRealSetBinder(eq(binderMock), (Key) any()), atLeast(1));
}*/
    }
}

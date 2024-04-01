package com.google.inject.internal;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.lang.reflect.GenericArrayType;

import jakarta.inject.Provider;

import java.util.NoSuchElementException;

import com.google.inject.Key;

import java.lang.reflect.WildcardType;

import com.google.inject.TypeLiteral;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.Type;
import java.lang.reflect.GenericDeclaration;

import com.google.inject.ConfigurationException;
import org.mockito.MockedStatic;
import com.google.inject.util.Types;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.hamcrest.Matchers.is;

import org.junit.Ignore;

public class MoreTypesSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final GenericArrayType genericArrayTypeMock = mock(GenericArrayType.class);

    private final Key<Object> keyMock = mock(Key.class);

    private final ParameterizedType parameterizedTypeMock = mock(ParameterizedType.class);

    private final TypeLiteral<Object> typeLiteralMock = mock(TypeLiteral.class);

    private final TypeLiteral<Object> typeLiteralMock2 = mock(TypeLiteral.class);

    private final Type typeMock = mock(Type.class);

    private final Type typeMock2 = mock(Type.class);

    private final Type typeMock3 = mock(Type.class);

    private final Type typeMock4 = mock(Type.class);

    private final TypeVariable typeVariableMock = mock(TypeVariable.class);

    private final TypeVariable typeVariableMock2 = mock(TypeVariable.class);

    private final WildcardType wildcardTypeMock = mock(WildcardType.class);

    private final WildcardType wildcardTypeMock2 = mock(WildcardType.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${895a9f06-e2a1-3283-a50d-73b1a2018137}, hash: C4A560E204444E193210C9E0CAF8C538
    @Test()
    public void canonicalizeKeyWhenKeyGetClassEqualsKey() {
        /* Branches:
         * (key.getClass() == Key.class) : true
         */
        //Act Statement(s)
        Key result = MoreTypes.canonicalizeKey(keyMock);
        //Assert statement(s)
        assertThat(result, equalTo(keyMock));
    }

    //Sapient generated method id: ${c4fb7458-de19-386f-a952-113cfff35be5}, hash: A11F6625EDD0ADEF2118E6E429E14CBB
    @Ignore()
    @Test()
    public void canonicalizeKeyWhenKeyGetClassNotEqualsKey() {
        /* Branches:
         * (key.getClass() == Key.class) : false
         */
        //Arrange Statement(s)
        TypeLiteral typeLiteralMock = mock(TypeLiteral.class);
        doReturn(typeLiteralMock).when(keyMock).getTypeLiteral();
        Key keyMock2 = mock(Key.class);
        doReturn(keyMock2).when(keyMock).ofType(typeLiteralMock);
        //Act Statement(s)
        Key result = MoreTypes.canonicalizeKey(keyMock);
        //Assert statement(s)
        assertThat(result, equalTo(keyMock2));
        verify(keyMock).getTypeLiteral();
        verify(keyMock).ofType(typeLiteralMock);
    }

    //Sapient generated method id: ${40bb8a1d-0b07-322e-b1d5-cc98d3976e3c}, hash: 1D665CD9CA5EFC3C87E68D7A08487F46
    @Ignore()
    @Test()
    public void canonicalizeForKeyWhenPInstanceOfParameterizedTypeImpl() {
        /* Branches:
         * (type instanceof Class) : true  #  inside isFullySpecified method
         * (!isFullySpecified(type)) : false
         * (typeLiteral.getRawType() == jakarta.inject.Provider.class) : true
         * (p instanceof ParameterizedTypeImpl) : true  #  inside getSharedTypeArguments method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<TypeLiteral> typeLiteral = mockStatic(TypeLiteral.class);
             MockedStatic<Types> types = mockStatic(Types.class)) {
            doReturn(Object.class).when(typeLiteralMock).getType();
            doReturn(Provider.class).when(typeLiteralMock).getRawType();
            types.when(() -> Types.providerOf(typeMock)).thenReturn(parameterizedTypeMock);
            typeLiteral.when(() -> TypeLiteral.get(parameterizedTypeMock)).thenReturn(typeLiteralMock2);
            //Act Statement(s)
            TypeLiteral result = MoreTypes.canonicalizeForKey(typeLiteralMock);
            //Assert statement(s)
            assertThat(result, equalTo(typeLiteralMock2));
            verify(typeLiteralMock).getType();
            verify(typeLiteralMock).getRawType();
            types.verify(() -> Types.providerOf(typeMock), atLeast(1));
            typeLiteral.verify(() -> TypeLiteral.get(parameterizedTypeMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${aec71286-3e6f-30a2-beea-47f05721860c}, hash: C6F7CB06BA5B0AAA18EA1A22157773C7
    @Ignore()
    @Test()
    public void canonicalizeForKeyWhenPNotInstanceOfParameterizedTypeImpl() {
        /* Branches:
         * (type instanceof Class) : true  #  inside isFullySpecified method
         * (!isFullySpecified(type)) : false
         * (typeLiteral.getRawType() == jakarta.inject.Provider.class) : true
         * (p instanceof ParameterizedTypeImpl) : false  #  inside getSharedTypeArguments method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<TypeLiteral> typeLiteral = mockStatic(TypeLiteral.class);
             MockedStatic<Types> types = mockStatic(Types.class)) {
            doReturn(Object.class).when(typeLiteralMock).getType();
            doReturn(Provider.class).when(typeLiteralMock).getRawType();
            types.when(() -> Types.providerOf(typeMock)).thenReturn(parameterizedTypeMock);
            typeLiteral.when(() -> TypeLiteral.get(parameterizedTypeMock)).thenReturn(typeLiteralMock2);
            //Act Statement(s)
            TypeLiteral result = MoreTypes.canonicalizeForKey(typeLiteralMock);
            //Assert statement(s)
            assertThat(result, equalTo(typeLiteralMock2));
            verify(typeLiteralMock).getType();
            verify(typeLiteralMock).getRawType();
            types.verify(() -> Types.providerOf(typeMock), atLeast(1));
            typeLiteral.verify(() -> TypeLiteral.get(parameterizedTypeMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${e0cff9dc-a4ac-3ea7-92bf-e5fce385ecfc}, hash: E8B08C130422AAFBC37BCBCD09B0223A
    @Test()
    public void canonicalizeForKeyWhenWrappedPrimitivesIsNotNull() {
        /* Branches:
         * (type instanceof Class) : true  #  inside isFullySpecified method
         * (!isFullySpecified(type)) : false
         * (typeLiteral.getRawType() == jakarta.inject.Provider.class) : false
         * (wrappedPrimitives != null) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: PRIMITIVE_TO_WRAPPER
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn(Object.class).when(typeLiteralMock).getType();
        doReturn(java.lang.Object.class).when(typeLiteralMock).getRawType();
        //Act Statement(s)
        TypeLiteral result = MoreTypes.canonicalizeForKey(typeLiteralMock);
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
        verify(typeLiteralMock).getType();
        verify(typeLiteralMock).getRawType();
    }

    //Sapient generated method id: ${4e080db3-0bf7-36e1-99ee-4be2c78146aa}, hash: A03877ABE4633F36F318D7BBC2D8BBD3
    @Test()
    public void canonicalizeForKeyWhenIsFullySpecifiedNotTypeThrowsConfigurationException() {
        /* Branches:
         * (type instanceof Class) : false  #  inside isFullySpecified method
         * (type instanceof CompositeType) : false  #  inside isFullySpecified method
         * (type instanceof TypeVariable) : true  #  inside isFullySpecified method
         * (!isFullySpecified(type)) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: object of type Errors, errors
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn(typeVariableMock).when(typeLiteralMock).getType();
        thrown.expect(ConfigurationException.class);
        //Act Statement(s)
        MoreTypes.canonicalizeForKey(typeLiteralMock);
        //Assert statement(s)
        verify(typeLiteralMock).getType();
    }

    //Sapient generated method id: ${760f86bb-4402-39b6-8869-72a0a9c3c827}, hash: 69C3B844E36D5A60F3D17616E5550CC8
    @Test()
    public void canonicalizeForKeyWhenTypeLiteralGetClassEqualsTypeLiteral() {
        /* Branches:
         * (type instanceof Class) : true  #  inside isFullySpecified method
         * (!isFullySpecified(type)) : false
         * (typeLiteral.getRawType() == jakarta.inject.Provider.class) : false
         * (wrappedPrimitives != null) : false
         * (typeLiteral.getClass() == TypeLiteral.class) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: PRIMITIVE_TO_WRAPPER
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn(Object.class).when(typeLiteralMock).getType();
        doReturn(java.lang.Object.class).when(typeLiteralMock).getRawType();
        //Act Statement(s)
        TypeLiteral result = MoreTypes.canonicalizeForKey(typeLiteralMock);
        //Assert statement(s)
        assertThat(result, equalTo(typeLiteralMock));
        verify(typeLiteralMock, atLeast(1)).getType();
        verify(typeLiteralMock, atLeast(1)).getRawType();
    }

    //Sapient generated method id: ${1f094994-f6d5-3191-a56b-fa91747c908b}, hash: 9B82F6145E29363863637BD556DEFFAF
    @Ignore()
    @Test()
    public void canonicalizeForKeyWhenCanonicalizeTypeNotIsFullySpecifiedAndIsFullySpecifiedNotTypeThrowsConfigurationException() {
        /* Branches:
         * (type instanceof Class) : false  #  inside isFullySpecified method
         * (type instanceof CompositeType) : false  #  inside isFullySpecified method
         * (type instanceof TypeVariable) : false  #  inside isFullySpecified method
         * (((CompositeType) canonicalize(type)).isFullySpecified()) : false  #  inside isFullySpecified method
         * (!isFullySpecified(type)) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: object of type Errors, errors
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<MoreTypes> moreTypes = mockStatic(MoreTypes.class, CALLS_REAL_METHODS)) {
            doReturn(typeMock).when(typeLiteralMock).getType();
            moreTypes.when(() -> MoreTypes.canonicalize(typeMock)).thenReturn(typeMock2);
            thrown.expect(ConfigurationException.class);
            //Act Statement(s)
            MoreTypes.canonicalizeForKey(typeLiteralMock);
            //Assert statement(s)
            verify(typeLiteralMock, atLeast(1)).getType();
            moreTypes.verify(() -> MoreTypes.canonicalize(typeMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${92e0bb61-ddc2-3006-9ed2-4e616ecd0867}, hash: BEC5D1D20D05028218D509F1099006E5
    @Ignore()
    @Test()
    public void canonicalizeForKeyWhenWrappedPrimitivesIsNullAndTypeLiteralGetClassNotEqualsTypeLiteral() {
        /* Branches:
         * (type instanceof Class) : false  #  inside isFullySpecified method
         * (type instanceof CompositeType) : false  #  inside isFullySpecified method
         * (type instanceof TypeVariable) : false  #  inside isFullySpecified method
         * (((CompositeType) canonicalize(type)).isFullySpecified()) : true  #  inside isFullySpecified method
         * (!isFullySpecified(type)) : false
         * (typeLiteral.getRawType() == jakarta.inject.Provider.class) : false
         * (wrappedPrimitives != null) : false
         * (typeLiteral.getClass() == TypeLiteral.class) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: PRIMITIVE_TO_WRAPPER
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<TypeLiteral> typeLiteral = mockStatic(TypeLiteral.class);
             MockedStatic<MoreTypes> moreTypes = mockStatic(MoreTypes.class, CALLS_REAL_METHODS)) {
            doReturn(java.lang.Object.class).when(typeLiteralMock).getRawType();
            doReturn(typeMock, typeMock2).when(typeLiteralMock).getType();
            moreTypes.when(() -> MoreTypes.canonicalize(typeMock)).thenReturn(typeMock3);
            typeLiteral.when(() -> TypeLiteral.get(typeMock2)).thenReturn(typeLiteralMock2);
            //Act Statement(s)
            TypeLiteral result = MoreTypes.canonicalizeForKey(typeLiteralMock);
            //Assert statement(s)
            assertThat(result, equalTo(typeLiteralMock2));
            verify(typeLiteralMock, times(2)).getType();
            verify(typeLiteralMock, atLeast(1)).getRawType();
            moreTypes.verify(() -> MoreTypes.canonicalize(typeMock), atLeast(1));
            typeLiteral.verify(() -> TypeLiteral.get(typeMock2), atLeast(1));
        }
    }

    //Sapient generated method id: ${afdaa15b-5888-33ab-a077-b1238b1b5e0c}, hash: 749C7B1930F111718B56898FE210737A
    @Ignore()
    @Test()
    public void canonicalizeWhenCIsArray() {
        /* Branches:
         * (type instanceof Class) : true
         * (c.isArray()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        Type result = MoreTypes.canonicalize(Object.class);
        MoreTypes.GenericArrayTypeImpl moreTypesGenericArrayTypeImpl = new MoreTypes.GenericArrayTypeImpl(typeMock);
        //Assert statement(s)
        assertThat(result, equalTo(moreTypesGenericArrayTypeImpl));
    }

    //Sapient generated method id: ${ee671726-f708-380c-b282-e93a6543ba7a}, hash: FE29446537308DAB044743FA4C7DED4B
    @Test()
    public void canonicalizeWhenCNotIsArray() {
        /* Branches:
         * (type instanceof Class) : true
         * (c.isArray()) : false
         */
        //Act Statement(s)
        Type result = MoreTypes.canonicalize(Object.class);
        //Assert statement(s)
        assertThat(result, equalTo(Object.class));
    }

    //Sapient generated method id: ${88aaaf44-0039-3860-818f-c82d034a5483}, hash: 9C4CE37C46F24DBC557305A897C65B5D
    @Ignore()
    @Test()
    public void canonicalizeWhenPInstanceOfParameterizedTypeImpl() {
        /* Branches:
         * (type instanceof Class) : false
         * (type instanceof CompositeType) : false
         * (type instanceof ParameterizedType) : true
         * (p instanceof ParameterizedTypeImpl) : true  #  inside getSharedTypeArguments method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Type[] typeArray = new Type[]{};
        MoreTypes.ParameterizedTypeImpl moreTypesParameterizedTypeImpl = new MoreTypes.ParameterizedTypeImpl(typeMock, typeMock2, typeArray);
        //Act Statement(s)
        Type result = MoreTypes.canonicalize(moreTypesParameterizedTypeImpl);
        MoreTypes.ParameterizedTypeImpl moreTypesParameterizedTypeImpl2 = new MoreTypes.ParameterizedTypeImpl(typeMock3, typeMock4, typeArray);
        //Assert statement(s)
        assertThat(result, equalTo(moreTypesParameterizedTypeImpl2));
    }

    //Sapient generated method id: ${118d1dc9-2f5b-3232-8085-8470720c3125}, hash: 8200C0FBC1E4BF90BF895238A751E4CD
    @Ignore()
    @Test()
    public void canonicalizeWhenPNotInstanceOfParameterizedTypeImpl() {
        /* Branches:
         * (type instanceof Class) : false
         * (type instanceof CompositeType) : false
         * (type instanceof ParameterizedType) : true
         * (p instanceof ParameterizedTypeImpl) : false  #  inside getSharedTypeArguments method
         */
        //Arrange Statement(s)
        ParameterizedType pMock = mock(ParameterizedType.class);
        doReturn(typeMock).when(pMock).getOwnerType();
        doReturn(typeMock2).when(pMock).getRawType();
        Type[] typeArray = new Type[]{};
        doReturn(typeArray).when(pMock).getActualTypeArguments();
        //Act Statement(s)
        Type result = MoreTypes.canonicalize(pMock);
        MoreTypes.ParameterizedTypeImpl moreTypesParameterizedTypeImpl = new MoreTypes.ParameterizedTypeImpl(typeMock, typeMock2, typeArray);
        //Assert statement(s)
        assertThat(result, equalTo(moreTypesParameterizedTypeImpl));
        verify(pMock).getOwnerType();
        verify(pMock).getRawType();
        verify(pMock).getActualTypeArguments();
    }

    //Sapient generated method id: ${40142f12-b2d2-37c0-b6eb-e91debefb359}, hash: 1A96E76118E8C92C4EF76DA0EBBE645F
    @Test()
    public void canonicalizeWhenTypeInstanceOfGenericArrayType() {
        /* Branches:
         * (type instanceof Class) : false
         * (type instanceof CompositeType) : false
         * (type instanceof ParameterizedType) : false
         * (type instanceof GenericArrayType) : true
         */
        //Arrange Statement(s)
        GenericArrayType gMock = mock(GenericArrayType.class);
        doReturn(typeMock).when(gMock).getGenericComponentType();
        //Act Statement(s)
        Type result = MoreTypes.canonicalize(gMock);
        MoreTypes.GenericArrayTypeImpl moreTypesGenericArrayTypeImpl = new MoreTypes.GenericArrayTypeImpl(typeMock);
        //Assert statement(s)
        assertThat(result, equalTo(moreTypesGenericArrayTypeImpl));
        verify(gMock).getGenericComponentType();
    }

    //Sapient generated method id: ${d2a198e5-3d91-3cf6-9d9b-b73ded0e3885}, hash: 34298C83E10DA79C40D4CC3F46A08D5A
    @Ignore()
    @Test()
    public void canonicalizeWhenTypeInstanceOfWildcardType() {
        /* Branches:
         * (type instanceof Class) : false
         * (type instanceof CompositeType) : false
         * (type instanceof ParameterizedType) : false
         * (type instanceof GenericArrayType) : false
         * (type instanceof WildcardType) : true
         */
        //Arrange Statement(s)
        WildcardType wMock = mock(WildcardType.class, "WildcardType");
        doReturn(null).when(wMock).getUpperBounds();
        doReturn(null).when(wMock).getLowerBounds();
        //Act Statement(s)
        Type result = MoreTypes.canonicalize(wMock);
        MoreTypes.WildcardTypeImpl moreTypesWildcardTypeImpl = new MoreTypes.WildcardTypeImpl((Type[]) null, (Type[]) null);
        //Assert statement(s)
        assertThat(result, equalTo(moreTypesWildcardTypeImpl));
        verify(wMock).getUpperBounds();
        verify(wMock).getLowerBounds();
    }

    //Sapient generated method id: ${704cb858-48df-3aab-aa21-30583d6a39d2}, hash: 3874A5E12E03E65E9D2071844D7A7FB4
    @Test()
    public void canonicalizeWhenTypeNotInstanceOfWildcardType() {
        /* Branches:
         * (type instanceof Class) : false
         * (type instanceof CompositeType) : false
         * (type instanceof ParameterizedType) : false
         * (type instanceof GenericArrayType) : false
         * (type instanceof WildcardType) : false
         */
        //Act Statement(s)
        Type result = MoreTypes.canonicalize(typeMock);
        //Assert statement(s)
        assertThat(result, equalTo(typeMock));
    }

    //Sapient generated method id: ${5f2cb5c8-aa82-386d-8daf-f2165e713e4d}, hash: 5E96F375F412B2DBE7DF6838FA2032F9
    @Test()
    public void getRawTypeWhenTypeInstanceOfClass_() {
        /* Branches:
         * (type instanceof Class<?>) : true
         */
        //Act Statement(s)
        Class<?> result = MoreTypes.getRawType(Object.class);
        //Assert statement(s)
        assertThat(result, equalTo(Object.class));
    }

    //Sapient generated method id: ${f1e32f7d-473a-3ff8-a0ed-dadd62ef24b4}, hash: EC1E68AEA1D5409DDA78A7544A13D6A0
    @Ignore()
    @Test()
    public void getRawTypeWhenTypeInstanceOfParameterizedType() {
        /* Branches:
         * (type instanceof Class<?>) : false
         * (type instanceof ParameterizedType) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn(Object.class).when(parameterizedTypeMock).getRawType();
        //Act Statement(s)
        Class<?> result = MoreTypes.getRawType(parameterizedTypeMock);
        //Assert statement(s)
        assertThat(result, equalTo(Object.class));
        verify(parameterizedTypeMock).getRawType();
    }

    //Sapient generated method id: ${e3bff9fb-e243-318f-94b2-d9c79129bda1}, hash: 87340129FB18C2378BA221DBF6EE0B25
    @Ignore()
    @Test()
    public void getRawTypeWhenTypeInstanceOfGenericArrayType() {
        /* Branches:
         * (type instanceof Class<?>) : false
         * (type instanceof ParameterizedType) : false
         * (type instanceof GenericArrayType) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn(typeMock).when(genericArrayTypeMock).getGenericComponentType();
        //Act Statement(s)
        Class<?> result = MoreTypes.getRawType(genericArrayTypeMock);
        //Assert statement(s)
        assertThat(result, equalTo(Object.class));
        verify(genericArrayTypeMock).getGenericComponentType();
    }

    //Sapient generated method id: ${78416f03-00b2-30cd-ba19-7375c31e92ae}, hash: 30E156F97129B56A74426A553E7F48CE
    @Test()
    public void getRawTypeWhenTypeInstanceOfWildcardType() {
        /* Branches:
         * (type instanceof Class<?>) : false
         * (type instanceof ParameterizedType) : false
         * (type instanceof GenericArrayType) : false
         * (type instanceof TypeVariable) : false
         * (type instanceof WildcardType) : true
         */
        //Act Statement(s)
        Class<?> result = MoreTypes.getRawType(wildcardTypeMock);
        //Assert statement(s)
        assertThat(result, equalTo(Object.class));
    }

    //Sapient generated method id: ${b4379aed-1a8c-39bb-b2b8-87bd12339a1a}, hash: 85BFDD5E70241F5A46DC1CE5C5E27E39
    @Ignore()
    @Test()
    public void getRawTypeWhenTypeNotInstanceOfWildcardTypeThrowsIllegalArgumentException() {
        /* Branches:
         * (type instanceof Class<?>) : false
         * (type instanceof ParameterizedType) : false
         * (type instanceof GenericArrayType) : false
         * (type instanceof TypeVariable) : false
         * (type instanceof WildcardType) : false
         */
        //Arrange Statement(s)
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <getRawType_type1> is of type java.lang.reflect.Type");
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage(illegalArgumentException.getMessage());
        Type typeMock = mock(Type.class, "getRawType_type1");
        //Act Statement(s)
        MoreTypes.getRawType(typeMock);
    }

    //Sapient generated method id: ${9f2e86ee-506c-3cf7-94b9-05bc33f8d9c5}, hash: 31C41DAFAC63C41C8789B2BEC9353B27
    @Test()
    public void equalsWhenAEqualsB() {
        /* Branches:
         * (a == b) : true
         */
        //Act Statement(s)
        boolean result = MoreTypes.equals(typeMock, typeMock);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
    }

    //Sapient generated method id: ${909d89d7-0b62-38ac-b38e-43293f3273bc}, hash: 6F0EE59E5883234C186902BED7794963
    @Test()
    public void equalsWhenAInstanceOfClassAndAEqualsB() {
        /* Branches:
         * (a == b) : false
         * (a instanceof Class) : true
         * (a.equals(b)) : true
         */
        //Act Statement(s)
        boolean result = MoreTypes.equals(Object.class, Object.class);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
    }

    //Sapient generated method id: ${507549dc-abfb-31c6-a1f4-693809abaf19}, hash: FBDF440ACD05C7C9F96178795A5B6BBE
    @Test()
    public void equalsWhenANotEqualsB() {
        /* Branches:
         * (a == b) : false
         * (a instanceof Class) : true
         * (a.equals(b)) : false
         */
        //Act Statement(s)
        boolean result = MoreTypes.equals(Object.class, typeMock);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${04d9018c-8285-3e9f-a13a-7e7d589b65cb}, hash: AD12DDC5210E77C3B45BD9025825E54C
    @Test()
    public void equalsWhenBNotInstanceOfParameterizedType() {
        /* Branches:
         * (a == b) : false
         * (a instanceof Class) : false
         * (a instanceof ParameterizedType) : true
         * (!(b instanceof ParameterizedType)) : true
         */
        //Act Statement(s)
        boolean result = MoreTypes.equals(parameterizedTypeMock, typeMock);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${4e32643e-838d-38f5-abeb-89d6ef0127d8}, hash: 02E0CEC64483EE6E88443FC3FF983705
    @Test()
    public void equalsWhenBNotInstanceOfGenericArrayType() {
        /* Branches:
         * (a == b) : false
         * (a instanceof Class) : false
         * (a instanceof ParameterizedType) : false
         * (a instanceof GenericArrayType) : true
         * (!(b instanceof GenericArrayType)) : true
         */
        //Act Statement(s)
        boolean result = MoreTypes.equals(genericArrayTypeMock, typeMock);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${73a96bdc-1330-3d85-b6ef-924eae8b43de}, hash: 1BA534BEA366BF38693EBED60CB45D2A
    @Ignore()
    @Test()
    public void equalsWhenBInstanceOfGenericArrayType() {
        /* Branches:
         * (a == b) : false
         * (a instanceof Class) : false
         * (a instanceof ParameterizedType) : false
         * (a instanceof GenericArrayType) : true
         * (!(b instanceof GenericArrayType)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        GenericArrayType genericArrayTypeMock2 = mock(GenericArrayType.class);
        //Act Statement(s)
        boolean result = MoreTypes.equals(genericArrayTypeMock, genericArrayTypeMock2);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${89f65493-1152-324f-9e88-2f84d9eaf228}, hash: 9D1BE1362F05199B38C40181E5339ACF
    @Test()
    public void equalsWhenBNotInstanceOfWildcardType() {
        /* Branches:
         * (a == b) : false
         * (a instanceof Class) : false
         * (a instanceof ParameterizedType) : false
         * (a instanceof GenericArrayType) : false
         * (a instanceof WildcardType) : true
         * (!(b instanceof WildcardType)) : true
         */
        //Act Statement(s)
        boolean result = MoreTypes.equals(wildcardTypeMock, typeMock);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${4a484956-1020-3c98-b0c3-735978e7bded}, hash: 9D91E3CE8E65C1C4C8589BBFD139B431
    @Test()
    public void equalsWhenANotInstanceOfTypeVariable() {
        /* Branches:
         * (a == b) : false
         * (a instanceof Class) : false
         * (a instanceof ParameterizedType) : false
         * (a instanceof GenericArrayType) : false
         * (a instanceof WildcardType) : false
         * (a instanceof TypeVariable) : false
         */
        //Act Statement(s)
        boolean result = MoreTypes.equals(typeMock, typeMock2);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${a5b59391-e6d1-3286-87c9-0343e2b9b0e1}, hash: 5BC6BCC6BD4FDAD75678E5E0C9580498
    @Test()
    public void equalsWhenBNotInstanceOfTypeVariable() {
        /* Branches:
         * (a == b) : false
         * (a instanceof Class) : false
         * (a instanceof ParameterizedType) : false
         * (a instanceof GenericArrayType) : false
         * (a instanceof WildcardType) : false
         * (a instanceof TypeVariable) : true
         * (!(b instanceof TypeVariable)) : true
         */
        //Act Statement(s)
        boolean result = MoreTypes.equals(typeVariableMock, typeMock);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${ab750419-a6b7-36c5-a05c-10e82e78b360}, hash: 8507C42DDC81B8887A57E10522C7B16B
    @Ignore()
    @Test()
    public void equalsWhenArraysEqualsGetSharedTypeArgumentsPaGetSharedTypeArgumentsPb() {
        /* Branches:
         * (a == b) : false
         * (a instanceof Class) : false
         * (a instanceof ParameterizedType) : true
         * (!(b instanceof ParameterizedType)) : false
         * (Objects.equal(pa.getOwnerType(), pb.getOwnerType())) : true
         * (pa.getRawType().equals(pb.getRawType())) : true
         * (p instanceof ParameterizedTypeImpl) : true  #  inside getSharedTypeArguments method
         * (Arrays.equals(getSharedTypeArguments(pa), getSharedTypeArguments(pb))) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Type[] typeArray = new Type[]{};
        MoreTypes.ParameterizedTypeImpl moreTypesParameterizedTypeImpl = new MoreTypes.ParameterizedTypeImpl(typeMock, typeMock2, typeArray);
        Type[] typeArray2 = new Type[]{};
        MoreTypes.ParameterizedTypeImpl moreTypesParameterizedTypeImpl2 = new MoreTypes.ParameterizedTypeImpl(typeMock3, typeMock2, typeArray2);
        //Act Statement(s)
        boolean result = MoreTypes.equals(moreTypesParameterizedTypeImpl, moreTypesParameterizedTypeImpl2);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
    }

    //Sapient generated method id: ${b969e69d-c955-3181-8a07-ba73d204e611}, hash: 22EAC1A4EDBCC069FB9A45F8FF504CAF
    @Ignore()
    @Test()
    public void equalsWhenPNotInstanceOfParameterizedTypeImplAndArraysNotEqualsGetSharedTypeArgumentsPaGetSharedTypeArgumentsPb() {
        /* Branches:
         * (a == b) : false
         * (a instanceof Class) : false
         * (a instanceof ParameterizedType) : true
         * (!(b instanceof ParameterizedType)) : false
         * (Objects.equal(pa.getOwnerType(), pb.getOwnerType())) : true
         * (pa.getRawType().equals(pb.getRawType())) : true
         * (p instanceof ParameterizedTypeImpl) : false  #  inside getSharedTypeArguments method
         * (Arrays.equals(getSharedTypeArguments(pa), getSharedTypeArguments(pb))) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ParameterizedType parameterizedTypeMock2 = mock(ParameterizedType.class);
        //Act Statement(s)
        boolean result = MoreTypes.equals(parameterizedTypeMock, parameterizedTypeMock2);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${b3576554-0b50-3e3b-b762-f734c627bb61}, hash: E9E1369B47A91F64E6B307E37B254159
    @Ignore()
    @Test()
    public void equalsWhenArraysEqualsWaGetLowerBoundsWbGetLowerBounds() {
        /* Branches:
         * (a == b) : false
         * (a instanceof Class) : false
         * (a instanceof ParameterizedType) : false
         * (a instanceof GenericArrayType) : false
         * (a instanceof WildcardType) : true
         * (!(b instanceof WildcardType)) : false
         * (Arrays.equals(wa.getUpperBounds(), wb.getUpperBounds())) : true
         * (Arrays.equals(wa.getLowerBounds(), wb.getLowerBounds())) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        boolean result = MoreTypes.equals(wildcardTypeMock, wildcardTypeMock2);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
    }

    //Sapient generated method id: ${d84e06fe-5824-3199-b21c-5521925f86ab}, hash: 9E8AA3C4BD93BAC0E0FBB1597DF22968
    @Ignore()
    @Test()
    public void equalsWhenArraysNotEqualsWaGetLowerBoundsWbGetLowerBounds() {
        /* Branches:
         * (a == b) : false
         * (a instanceof Class) : false
         * (a instanceof ParameterizedType) : false
         * (a instanceof GenericArrayType) : false
         * (a instanceof WildcardType) : true
         * (!(b instanceof WildcardType)) : false
         * (Arrays.equals(wa.getUpperBounds(), wb.getUpperBounds())) : true
         * (Arrays.equals(wa.getLowerBounds(), wb.getLowerBounds())) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        boolean result = MoreTypes.equals(wildcardTypeMock, wildcardTypeMock2);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${4782268d-7320-3b50-b10c-048acea0af37}, hash: BB3E613775A4F3E0832C98C60D68644E
    @Ignore()
    @Test()
    public void equalsWhenVaGetNameEqualsVbGetName() {
        /* Branches:
         * (a == b) : false
         * (a instanceof Class) : false
         * (a instanceof ParameterizedType) : false
         * (a instanceof GenericArrayType) : false
         * (a instanceof WildcardType) : false
         * (a instanceof TypeVariable) : true
         * (!(b instanceof TypeVariable)) : false
         * (va.getGenericDeclaration().equals(vb.getGenericDeclaration())) : true
         * (va.getName().equals(vb.getName())) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        boolean result = MoreTypes.equals(typeVariableMock, typeVariableMock2);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
    }

    //Sapient generated method id: ${e0cc2bbb-94ea-3e09-93ce-f87bc66b6944}, hash: 9A62CE0789128292D0B11F07C3560241
    @Ignore()
    @Test()
    public void equalsWhenVaGetNameNotEqualsVbGetName() {
        /* Branches:
         * (a == b) : false
         * (a instanceof Class) : false
         * (a instanceof ParameterizedType) : false
         * (a instanceof GenericArrayType) : false
         * (a instanceof WildcardType) : false
         * (a instanceof TypeVariable) : true
         * (!(b instanceof TypeVariable)) : false
         * (va.getGenericDeclaration().equals(vb.getGenericDeclaration())) : true
         * (va.getName().equals(vb.getName())) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        boolean result = MoreTypes.equals(typeVariableMock, typeVariableMock2);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${8dd0d4eb-e3b4-3526-9723-2936f369e4f0}, hash: 9D42F2D7E235CEA09FC952A53C0017EA
    @Test()
    public void typeToStringWhenTypeInstanceOfClass() {
        /* Branches:
         * (type instanceof Class) : true
         */
        //Act Statement(s)
        String result = MoreTypes.typeToString(Object.class);
        //Assert statement(s)
        assertThat(result, equalTo("java.lang.Object"));
    }

    //Sapient generated method id: ${ec4f6d89-3723-3057-bd23-52fa4313fb81}, hash: 7321B30EF23FF4F02A8038F278DFFE63
    @Test()
    public void typeToStringWhenTypeNotInstanceOfClass() {
        /* Branches:
         * (type instanceof Class) : false
         */
        //Arrange Statement(s)
        Type typeMock = mock(Type.class, "typeToString_type1");
        //Act Statement(s)
        String result = MoreTypes.typeToString(typeMock);
        //Assert statement(s)
        assertThat(result, equalTo("typeToString_type1"));
    }

    //Sapient generated method id: ${0536290a-15de-3178-94c9-2a17debd8295}, hash: 9C9CD02725505DD12A9C29911D6ED08E
    @Test()
    public void getGenericSupertypeWhenToResolveEqualsRawType() {
        /* Branches:
         * (toResolve == rawType) : true
         */
        //Act Statement(s)
        Type result = MoreTypes.getGenericSupertype(typeMock, Object.class, Object.class);
        //Assert statement(s)
        assertThat(result, equalTo(typeMock));
    }

    //Sapient generated method id: ${fbf35bcb-4216-37d0-9c14-f92e8aee7007}, hash: 8F3333D7929EF2A6D042D80FECFC1FDE
    @Test()
    public void getGenericSupertypeWhenIIndexOfInterfacesEqualsToResolve() {
        /* Branches:
         * (toResolve == rawType) : false
         * (toResolve.isInterface()) : true
         * (i < length) : true
         * (interfaces[i] == toResolve) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        Type result = MoreTypes.getGenericSupertype(typeMock, Object.class, Object.class);
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${9097c156-a369-38a1-bef1-87e7b11f8e6f}, hash: 3B57409160C85DE632FB69DA75010EFB
    @Test()
    public void getGenericSupertypeWhenToResolveIsAssignableFromIIndexOfInterfaces() {
        /* Branches:
         * (toResolve == rawType) : false
         * (toResolve.isInterface()) : true
         * (i < length) : true
         * (interfaces[i] == toResolve) : false
         * (toResolve.isAssignableFrom(interfaces[i])) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        Type result = MoreTypes.getGenericSupertype(typeMock, Object.class, Object.class);
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${4c8bbeb7-8280-3435-bc1c-5f1e78c9e6f5}, hash: 0F9AE6E66805B21033E5DD2DDA551781
    @Test()
    public void getGenericSupertypeWhenRawTypeNotEqualsObjectAndRawSupertypeEqualsToResolve() {
        /* Branches:
         * (toResolve == rawType) : false
         * (toResolve.isInterface()) : true
         * (i < length) : true
         * (interfaces[i] == toResolve) : false
         * (toResolve.isAssignableFrom(interfaces[i])) : false
         * (!rawType.isInterface()) : true
         * (rawType != Object.class) : true
         * (rawSupertype == toResolve) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        Type result = MoreTypes.getGenericSupertype(typeMock, Object.class, Object.class);
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${697e0b97-c680-3926-91cb-154c7314a729}, hash: 1A71A3AB3099AC2D4A869437E356A163
    @Ignore()
    @Test()
    public void getGenericSupertypeWhenToResolveNotIsAssignableFromRawSupertype() {
        /* Branches:
         * (toResolve == rawType) : false
         * (toResolve.isInterface()) : true
         * (i < length) : true
         * (interfaces[i] == toResolve) : false
         * (toResolve.isAssignableFrom(interfaces[i])) : false
         * (!rawType.isInterface()) : true
         * (rawType != Object.class) : true
         * (rawSupertype == toResolve) : false
         * (toResolve.isAssignableFrom(rawSupertype)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        Type result = MoreTypes.getGenericSupertype(typeMock, Object.class, Object.class);
        //Assert statement(s)
        assertThat(result, equalTo(Object.class));
    }

    //Sapient generated method id: ${b8717013-08a3-3939-ac7f-2553ca9b0dbd}, hash: 9F4925B9F939EE9510F1FFAAE80E35EC
    @Ignore()
    @Test()
    public void resolveTypeVariableWhenGenericDeclarationNotInstanceOfClassAndDeclaredByRawIsNull() {
        /* Branches:
         * (genericDeclaration instanceof Class) : false  #  inside declaringClassOf method
         * (declaredByRaw == null) : true
         */
        //Arrange Statement(s)
        GenericDeclaration genericDeclarationMock = mock(GenericDeclaration.class);
        doReturn(genericDeclarationMock).when(typeVariableMock).getGenericDeclaration();
        //Act Statement(s)
        Type result = MoreTypes.resolveTypeVariable(typeMock, Object.class, typeVariableMock);
        //Assert statement(s)
        assertThat(result, equalTo(typeVariableMock));
        verify(typeVariableMock, atLeast(1)).getGenericDeclaration();
    }

    //Sapient generated method id: ${f9d68972-b726-33c0-be41-0201f46d4de8}, hash: 13E0B2E3DFB3F556A1015C7B01F2594B
    @Ignore()
    @Test()
    public void resolveTypeVariableWhenDeclaredByNotInstanceOfParameterizedType() {
        /* Branches:
         * (genericDeclaration instanceof Class) : true  #  inside declaringClassOf method
         * (declaredByRaw == null) : false
         * (declaredBy instanceof ParameterizedType) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<MoreTypes> moreTypes = mockStatic(MoreTypes.class, CALLS_REAL_METHODS)) {
            moreTypes.when(() -> MoreTypes.getGenericSupertype(typeMock2, Object.class, Object.class)).thenReturn(typeMock);
            //Act Statement(s)
            Type result = MoreTypes.resolveTypeVariable(typeMock2, Object.class, typeVariableMock);
            //Assert statement(s)
            assertThat(result, equalTo(typeVariableMock));
            moreTypes.verify(() -> MoreTypes.getGenericSupertype(typeMock2, Object.class, Object.class), atLeast(1));
        }
    }

    //Sapient generated method id: ${0c2eb1c0-f108-3e22-8cb2-9710c7e4f654}, hash: 2663E3EBEF3512482521754D6F0AD721
    @Ignore()
    @Test()
    public void resolveTypeVariableWhenToFindNotEqualsIIndexOfArrayThrowsNoSuchElementException() {
        /* Branches:
         * (genericDeclaration instanceof Class) : true  #  inside declaringClassOf method
         * (declaredByRaw == null) : false
         * (declaredBy instanceof ParameterizedType) : true
         * (i < array.length) : true  #  inside indexOf method
         * (toFind.equals(array[i])) : false  #  inside indexOf method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<MoreTypes> moreTypes = mockStatic(MoreTypes.class, CALLS_REAL_METHODS)) {
            doReturn(Object.class).when(typeVariableMock).getGenericDeclaration();
            moreTypes.when(() -> MoreTypes.getGenericSupertype(typeMock, Class.class, Object.class)).thenReturn(parameterizedTypeMock);
            thrown.expect(NoSuchElementException.class);
            //Act Statement(s)
            MoreTypes.resolveTypeVariable(typeMock, Class.class, typeVariableMock);
            //Assert statement(s)
            verify(typeVariableMock, atLeast(1)).getGenericDeclaration();
            moreTypes.verify(() -> MoreTypes.getGenericSupertype(typeMock, Class.class, Object.class), atLeast(1));
        }
    }

    //Sapient generated method id: ${b0da1cc4-aa69-302b-acd8-32905eda57f5}, hash: 3FAE4A8F55B5547764AFA03195D5B6F3
    @Ignore()
    @Test()
    public void resolveTypeVariableWhenPInstanceOfParameterizedTypeImpl() {
        /* Branches:
         * (genericDeclaration instanceof Class) : true  #  inside declaringClassOf method
         * (declaredByRaw == null) : false
         * (declaredBy instanceof ParameterizedType) : true
         * (i < array.length) : true  #  inside indexOf method
         * (toFind.equals(array[i])) : true  #  inside indexOf method
         * (p instanceof ParameterizedTypeImpl) : true  #  inside getSharedTypeArguments method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<MoreTypes> moreTypes = mockStatic(MoreTypes.class, CALLS_REAL_METHODS)) {
            doReturn(Object.class).when(typeVariableMock).getGenericDeclaration();
            Type[] typeArray = new Type[]{typeMock3};
            MoreTypes.ParameterizedTypeImpl moreTypesParameterizedTypeImpl = new MoreTypes.ParameterizedTypeImpl(typeMock, typeMock2, typeArray);
            moreTypes.when(() -> MoreTypes.getGenericSupertype(typeMock4, Object.class, Object.class)).thenReturn(moreTypesParameterizedTypeImpl);
            //Act Statement(s)
            Type result = MoreTypes.resolveTypeVariable(typeMock4, Object.class, typeVariableMock);
            //Assert statement(s)
            assertThat(result, equalTo(typeMock3));
            verify(typeVariableMock, atLeast(1)).getGenericDeclaration();
            moreTypes.verify(() -> MoreTypes.getGenericSupertype(typeMock4, Object.class, Object.class), atLeast(1));
        }
    }

    //Sapient generated method id: ${0c6547be-f516-3062-b42e-4d9aed879900}, hash: C4C7628A6F4437F5CCE48B42C6224975
    @Ignore()
    @Test()
    public void resolveTypeVariableWhenPNotInstanceOfParameterizedTypeImpl() {
        /* Branches:
         * (genericDeclaration instanceof Class) : true  #  inside declaringClassOf method
         * (declaredByRaw == null) : false
         * (declaredBy instanceof ParameterizedType) : true
         * (i < array.length) : true  #  inside indexOf method
         * (toFind.equals(array[i])) : true  #  inside indexOf method
         * (p instanceof ParameterizedTypeImpl) : false  #  inside getSharedTypeArguments method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<MoreTypes> moreTypes = mockStatic(MoreTypes.class, CALLS_REAL_METHODS)) {
            doReturn(Object.class).when(typeVariableMock).getGenericDeclaration();
            moreTypes.when(() -> MoreTypes.getGenericSupertype(typeMock, Object.class, Object.class)).thenReturn(parameterizedTypeMock);
            //Act Statement(s)
            Type result = MoreTypes.resolveTypeVariable(typeMock, Object.class, typeVariableMock);
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            verify(typeVariableMock, atLeast(1)).getGenericDeclaration();
            moreTypes.verify(() -> MoreTypes.getGenericSupertype(typeMock, Object.class, Object.class), atLeast(1));
        }
    }
}

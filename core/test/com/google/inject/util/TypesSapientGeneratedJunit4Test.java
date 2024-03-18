package com.google.inject.util;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.util.List;
import java.lang.reflect.GenericArrayType;

import com.google.inject.internal.MoreTypes;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Set;

import jakarta.inject.Provider;

import java.util.Map;
import java.util.Collection;

import org.mockito.MockedStatic;

import java.lang.reflect.WildcardType;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;

public class TypesSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final ParameterizedType parameterizedTypeMock = mock(ParameterizedType.class);

    private final Type typeMock = mock(Type.class);

    private final Type typeMock2 = mock(Type.class);

    //Sapient generated method id: ${5d4d37b7-b4e9-3f8e-a89f-8e2b763273c2}, hash: E15ADC81AD4D68FDCC8515A2D43DCD78
    @Test()
    public void newParameterizedTypeTest() {
        //Arrange Statement(s)
        try (MockedStatic<Types> types = mockStatic(Types.class, CALLS_REAL_METHODS)) {
            Type[] typeArray = new Type[]{};
            types.when(() -> Types.newParameterizedTypeWithOwner((Type) null, typeMock, typeArray)).thenReturn(parameterizedTypeMock);
            //Act Statement(s)
            ParameterizedType result = Types.newParameterizedType(typeMock, typeArray);
            //Assert statement(s)
            assertThat(result, equalTo(parameterizedTypeMock));
            types.verify(() -> Types.newParameterizedTypeWithOwner((Type) null, typeMock, typeArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${ffb7bb1e-1e2c-3f06-ae40-a70fd761b442}, hash: 9A0DFD6267338D0FB645AD9F5DB7FF2B
    @Test()
    public void newParameterizedTypeWithOwnerTest() {
        //Arrange Statement(s)
        Type[] typeArray = new Type[]{};
        //Act Statement(s)
        ParameterizedType result = Types.newParameterizedTypeWithOwner(typeMock, typeMock2, typeArray);
        MoreTypes.ParameterizedTypeImpl moreTypesParameterizedTypeImpl = new MoreTypes.ParameterizedTypeImpl(typeMock, typeMock2, typeArray);
        //Assert statement(s)
        assertThat(result, equalTo(moreTypesParameterizedTypeImpl));
    }

    //Sapient generated method id: ${aabf15eb-75f9-35c8-83bc-83a62cccba76}, hash: 7FA4B161FCB6960A0F8B1BA3C188AA4E
    @Test()
    public void arrayOfTest() {
        //Act Statement(s)
        GenericArrayType result = Types.arrayOf(typeMock);
        MoreTypes.GenericArrayTypeImpl moreTypesGenericArrayTypeImpl = new MoreTypes.GenericArrayTypeImpl(typeMock);
        //Assert statement(s)
        assertThat(result, equalTo(moreTypesGenericArrayTypeImpl));
    }

    //Sapient generated method id: ${d1858bc2-3a6d-38fe-922f-470abda84147}, hash: A12CA4AD0D08711B8BAE634AC2A5A96B
    @Test()
    public void subtypeOfTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class com.google.inject.internal.MoreTypes$WildcardTypeImpl
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        WildcardType result = Types.subtypeOf(typeMock);
        Type[] typeArray = new Type[]{typeMock};
        Type[] typeArray2 = new Type[]{};
        MoreTypes.WildcardTypeImpl moreTypesWildcardTypeImpl = new MoreTypes.WildcardTypeImpl(typeArray, typeArray2);
        //Assert statement(s)
        assertThat(result, equalTo(moreTypesWildcardTypeImpl));
    }

    //Sapient generated method id: ${7252b470-5805-39a3-bbdb-219abe123c5d}, hash: CD61593EDD77743A59994D13F0A17018
    @Test()
    public void supertypeOfTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class com.google.inject.internal.MoreTypes$WildcardTypeImpl
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        WildcardType result = Types.supertypeOf(typeMock);
        Type[] typeArray = new Type[]{Object.class};
        Type[] typeArray2 = new Type[]{typeMock};
        MoreTypes.WildcardTypeImpl moreTypesWildcardTypeImpl = new MoreTypes.WildcardTypeImpl(typeArray, typeArray2);
        //Assert statement(s)
        assertThat(result, equalTo(moreTypesWildcardTypeImpl));
    }

    //Sapient generated method id: ${b1301ccd-db54-3f04-ba3b-023b16f93ee8}, hash: 636076E81365AD7CA36F9D5FE8AAA5B3
    @Test()
    public void listOfTest() {
        //Arrange Statement(s)
        try (MockedStatic<Types> types = mockStatic(Types.class, CALLS_REAL_METHODS)) {
            Type[] typeArray = new Type[]{typeMock};
            types.when(() -> Types.newParameterizedType(List.class, typeArray)).thenReturn(parameterizedTypeMock);
            //Act Statement(s)
            ParameterizedType result = Types.listOf(typeMock);
            //Assert statement(s)
            assertThat(result, equalTo(parameterizedTypeMock));
            types.verify(() -> Types.newParameterizedType(List.class, typeArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${d87494c1-6b91-3c1a-87b4-6cbb88bdc6cf}, hash: 6CDA299549F52036EB42DFB72AA854AC
    @Test()
    public void collectionOfTest() {
        //Arrange Statement(s)
        try (MockedStatic<Types> types = mockStatic(Types.class, CALLS_REAL_METHODS)) {
            Type[] typeArray = new Type[]{typeMock};
            types.when(() -> Types.newParameterizedType(Collection.class, typeArray)).thenReturn(parameterizedTypeMock);
            //Act Statement(s)
            ParameterizedType result = Types.collectionOf(typeMock);
            //Assert statement(s)
            assertThat(result, equalTo(parameterizedTypeMock));
            types.verify(() -> Types.newParameterizedType(Collection.class, typeArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${1a55bfd1-a800-3a32-bada-69469b6ce117}, hash: A76E66C5D725465839CB9D28A4356792
    @Test()
    public void setOfTest() {
        //Arrange Statement(s)
        try (MockedStatic<Types> types = mockStatic(Types.class, CALLS_REAL_METHODS)) {
            Type[] typeArray = new Type[]{typeMock};
            types.when(() -> Types.newParameterizedType(Set.class, typeArray)).thenReturn(parameterizedTypeMock);
            //Act Statement(s)
            ParameterizedType result = Types.setOf(typeMock);
            //Assert statement(s)
            assertThat(result, equalTo(parameterizedTypeMock));
            types.verify(() -> Types.newParameterizedType(Set.class, typeArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${fdc5ff0e-48f6-3ffc-bd15-6aa54a16a841}, hash: 4BCCD8D87398151141A35D74E538D595
    @Test()
    public void mapOfTest() {
        //Arrange Statement(s)
        try (MockedStatic<Types> types = mockStatic(Types.class, CALLS_REAL_METHODS)) {
            Type[] typeArray = new Type[]{typeMock, typeMock2};
            types.when(() -> Types.newParameterizedType(Map.class, typeArray)).thenReturn(parameterizedTypeMock);
            //Act Statement(s)
            ParameterizedType result = Types.mapOf(typeMock, typeMock2);
            //Assert statement(s)
            assertThat(result, equalTo(parameterizedTypeMock));
            types.verify(() -> Types.newParameterizedType(Map.class, typeArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${24448291-5152-346d-90ec-82fe216db063}, hash: BB32C4F254AE5CFA1FFD032F724FBAB4
    @Test()
    public void providerOfTest() {
        //Arrange Statement(s)
        try (MockedStatic<Types> types = mockStatic(Types.class, CALLS_REAL_METHODS)) {
            Type[] typeArray = new Type[]{typeMock};
            types.when(() -> Types.newParameterizedType(com.google.inject.Provider.class, typeArray)).thenReturn(parameterizedTypeMock);
            //Act Statement(s)
            ParameterizedType result = Types.providerOf(typeMock);
            //Assert statement(s)
            assertThat(result, equalTo(parameterizedTypeMock));
            types.verify(() -> Types.newParameterizedType(com.google.inject.Provider.class, typeArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${ddffdfba-e20d-3e32-aeff-de6fb28df4be}, hash: CBB41FBAA3B954CE69FE9E5EB37410DA
    @Test()
    public void jakartaProviderOfTest() {
        //Arrange Statement(s)
        try (MockedStatic<Types> types = mockStatic(Types.class, CALLS_REAL_METHODS)) {
            Type[] typeArray = new Type[]{typeMock};
            types.when(() -> Types.newParameterizedType(Provider.class, typeArray)).thenReturn(parameterizedTypeMock);
            //Act Statement(s)
            Type result = Types.jakartaProviderOf(typeMock);
            //Assert statement(s)
            assertThat(result, equalTo(parameterizedTypeMock));
            types.verify(() -> Types.newParameterizedType(Provider.class, typeArray), atLeast(1));
        }
    }
}

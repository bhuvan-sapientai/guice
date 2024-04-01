package com.google.inject;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.List;

import com.google.inject.internal.MoreTypes;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Member;
import java.lang.reflect.WildcardType;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.TypeVariable;

import com.google.common.collect.ImmutableList;

import java.lang.reflect.Type;

import org.mockito.MockedStatic;
import com.google.inject.util.Types;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;

import org.junit.Ignore;

public class TypeLiteralSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Constructor constructorMock = mock(Constructor.class);

    private final GenericArrayType genericArrayTypeMock = mock(GenericArrayType.class);

    private final Member memberMock = mock(Member.class, "someMethod");

    private final Method methodMock = mock(Method.class);

    private final ParameterizedType parameterizedTypeMock = mock(ParameterizedType.class);

    private final ParameterizedType parameterizedTypeMock2 = mock(ParameterizedType.class);

    private final TypeLiteral typeLiteralMock = mock(TypeLiteral.class);

    private final Type typeMock = mock(Type.class);

    private final Type typeMock2 = mock(Type.class);

    private final Type typeMock3 = mock(Type.class);

    private final Type typeMock4 = mock(Type.class);

    private final Type typeMock5 = mock(Type.class);

    private final Type typeMock6 = mock(Type.class);

    private final TypeVariable typeVariableMock = mock(TypeVariable.class);

    private final WildcardType wildcardTypeMock = mock(WildcardType.class);

    private final WildcardType wildcardTypeMock2 = mock(WildcardType.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${af109a74-6dcd-3cca-a56f-0d56ef6e7202}, hash: 3B6F77FF2C4D8FD79BCABEF64FF17BEA
    @Ignore()
    @Test()
    public void getSuperclassTypeParameterWhenSuperclassInstanceOfClassThrowsRuntimeException() {
        /* Branches:
         * (superclass instanceof Class) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        RuntimeException runtimeException = new RuntimeException("Missing type parameter.");
        thrown.expect(RuntimeException.class);
        thrown.expectMessage(runtimeException.getMessage());
        //Act Statement(s)
        TypeLiteral.getSuperclassTypeParameter(Object.class);
    }

    //Sapient generated method id: ${762d35b4-9af5-3c21-8667-ae86e3879034}, hash: 05C929626BD71F5100949D0C6EEE5187
    @Test()
    public void getSuperclassTypeParameterWhenSuperclassNotInstanceOfClass() {
        /* Branches:
         * (superclass instanceof Class) : false
         */
        //Arrange Statement(s)
        thrown.expect(NullPointerException.class);
        //Act Statement(s)
        TypeLiteral.getSuperclassTypeParameter(Object.class);
    }

    //Sapient generated method id: ${2ad6e06a-4bbc-38c4-957e-cba284a867b7}, hash: C4412BE5F0F6BD70222604DEC8D89D3C
    @Ignore()
    @Test()
    public void fromSuperclassTypeParameterTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<MoreTypes> moreTypes = mockStatic(MoreTypes.class);
             MockedStatic<TypeLiteral> typeLiteral = mockStatic(TypeLiteral.class, CALLS_REAL_METHODS)) {
            typeLiteral.when(() -> TypeLiteral.getSuperclassTypeParameter(String.class)).thenReturn(typeMock);
            moreTypes.when(() -> MoreTypes.canonicalize(typeMock3)).thenReturn(typeMock2);
            moreTypes.when(() -> MoreTypes.getRawType(typeMock2)).thenReturn(Object.class);
            //Act Statement(s)
            TypeLiteral result = TypeLiteral.fromSuperclassTypeParameter(String.class);
            TypeLiteral typeLiteral2 = new TypeLiteral(typeMock);
            //Assert statement(s)
            assertThat(result, equalTo(typeLiteral2));
            typeLiteral.verify(() -> TypeLiteral.getSuperclassTypeParameter(String.class), atLeast(1));
            moreTypes.verify(() -> MoreTypes.canonicalize(typeMock3), atLeast(1));
            moreTypes.verify(() -> MoreTypes.getRawType(typeMock2), atLeast(1));
        }
    }

    //Sapient generated method id: ${ded42b2a-da93-3687-a951-9adb44b48dec}, hash: 2BD37B3E1F5E3B3615AF834D2115E4F6
    @Ignore()
    @Test()
    public void providerTypeTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TypeLiteral<Provider<Object>> typeLiteralMock = mock(TypeLiteral.class);
        try (MockedStatic<TypeLiteral> typeLiteral = mockStatic(TypeLiteral.class);
             MockedStatic<Types> types = mockStatic(Types.class);
             MockedStatic<MoreTypes> moreTypes = mockStatic(MoreTypes.class)) {
            moreTypes.when(() -> MoreTypes.canonicalize(typeMock2)).thenReturn(typeMock);
            moreTypes.when(() -> MoreTypes.getRawType(typeMock)).thenReturn(Object.class);
            types.when(() -> Types.providerOf(typeMock)).thenReturn(parameterizedTypeMock);
            typeLiteral.when(() -> TypeLiteral.get(parameterizedTypeMock)).thenReturn(typeLiteralMock);
            TypeLiteral<Object> target = new TypeLiteral(typeMock3);
            //Act Statement(s)
            TypeLiteral<Provider<Object>> result = target.providerType();
            //Assert statement(s)
            assertThat(result, equalTo(typeLiteralMock));
            moreTypes.verify(() -> MoreTypes.canonicalize(typeMock2), atLeast(1));
            moreTypes.verify(() -> MoreTypes.getRawType(typeMock), atLeast(1));
            types.verify(() -> Types.providerOf(typeMock), atLeast(1));
            typeLiteral.verify(() -> TypeLiteral.get(parameterizedTypeMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${363d3698-f34c-39ad-914f-376a19498023}, hash: 1C5647B3C12AEA58BB8DBD435EE2C155
    @Ignore()
    @Test()
    public void toStringTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<MoreTypes> moreTypes = mockStatic(MoreTypes.class)) {
            moreTypes.when(() -> MoreTypes.canonicalize(typeMock2)).thenReturn(typeMock);
            moreTypes.when(() -> MoreTypes.getRawType(typeMock)).thenReturn(Object.class);
            moreTypes.when(() -> MoreTypes.typeToString(typeMock)).thenReturn("return_of_typeToString1");
            TypeLiteral<Object> target = new TypeLiteral(typeMock3);
            //Act Statement(s)
            String result = target.toString();
            //Assert statement(s)
            assertThat(result, equalTo("return_of_typeToString1"));
            moreTypes.verify(() -> MoreTypes.canonicalize(typeMock2), atLeast(1));
            moreTypes.verify(() -> MoreTypes.getRawType(typeMock), atLeast(1));
            moreTypes.verify(() -> MoreTypes.typeToString(typeMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${9c25887d-767d-38e9-b5ae-c2e4012c49be}, hash: 777C2B812B2DBDC610CFA971FF3AC5D1
    @Ignore()
    @Test()
    public void getTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<MoreTypes> moreTypes = mockStatic(MoreTypes.class)) {
            moreTypes.when(() -> MoreTypes.canonicalize(typeMock2)).thenReturn(typeMock);
            moreTypes.when(() -> MoreTypes.getRawType(typeMock)).thenReturn(Object.class);
            //Act Statement(s)
            TypeLiteral result = TypeLiteral.get(typeMock3);
            TypeLiteral typeLiteral = new TypeLiteral(typeMock3);
            //Assert statement(s)
            assertThat(result, equalTo(typeLiteral));
            moreTypes.verify(() -> MoreTypes.canonicalize(typeMock2), atLeast(1));
            moreTypes.verify(() -> MoreTypes.getRawType(typeMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${fa77ec73-5d5e-3732-b683-af7decc28622}, hash: E433CE64F426B1578A6E1A04F17B7E24
    @Ignore()
    @Test()
    public void get1Test() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<MoreTypes> moreTypes = mockStatic(MoreTypes.class)) {
            moreTypes.when(() -> MoreTypes.canonicalize(typeMock2)).thenReturn(typeMock);
            moreTypes.when(() -> MoreTypes.getRawType(typeMock)).thenReturn(Object.class);
            //Act Statement(s)
            TypeLiteral result = TypeLiteral.get(Object.class);
            TypeLiteral typeLiteral = new TypeLiteral(Object.class);
            //Assert statement(s)
            assertThat(result, equalTo(typeLiteral));
            moreTypes.verify(() -> MoreTypes.canonicalize(typeMock2), atLeast(1));
            moreTypes.verify(() -> MoreTypes.getRawType(typeMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${a24c8b4b-62d2-3cb0-bb4e-7167d7fe67c9}, hash: 98DBC90F6FABF9A6ABC7D0F1F597A5DC
    @Ignore()
    @Test()
    public void resolveTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<TypeLiteral> typeLiteral = mockStatic(TypeLiteral.class);
             MockedStatic<MoreTypes> moreTypes = mockStatic(MoreTypes.class)) {
            moreTypes.when(() -> MoreTypes.canonicalize(typeMock2)).thenReturn(typeMock);
            moreTypes.when(() -> MoreTypes.getRawType(typeMock)).thenReturn(Object.class);
            typeLiteral.when(() -> TypeLiteral.get(typeMock3)).thenReturn(typeLiteralMock);
            TypeLiteral<Object> target = spy(new TypeLiteral(typeMock4));
            doReturn(typeMock3).when(target).resolveType(typeMock5);
            //Act Statement(s)
            TypeLiteral result = target.resolve(typeMock5);
            //Assert statement(s)
            assertThat(result, equalTo(typeLiteralMock));
            moreTypes.verify(() -> MoreTypes.canonicalize(typeMock2), atLeast(1));
            moreTypes.verify(() -> MoreTypes.getRawType(typeMock), atLeast(1));
            typeLiteral.verify(() -> TypeLiteral.get(typeMock3), atLeast(1));
            verify(target).resolveType(typeMock5);
        }
    }

    //Sapient generated method id: ${ec5097c1-c8af-370c-9191-a143404d676b}, hash: D0D41242E61C5ADE2ED734188BAB97EF
    @Ignore()
    @Test()
    public void resolveTypeWhenToResolveEqualsOriginal() {
        /* Branches:
         * (toResolve instanceof TypeVariable) : true
         * (toResolve == original) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<MoreTypes> moreTypes = mockStatic(MoreTypes.class)) {
            moreTypes.when(() -> MoreTypes.canonicalize(typeMock2)).thenReturn(typeMock);
            moreTypes.when(() -> MoreTypes.getRawType(typeMock)).thenReturn(Object.class);
            moreTypes.when(() -> MoreTypes.resolveTypeVariable(typeMock, Object.class, typeVariableMock)).thenReturn(typeVariableMock);
            TypeLiteral<Object> target = new TypeLiteral(typeMock3);
            //Act Statement(s)
            Type result = target.resolveType(typeVariableMock);
            //Assert statement(s)
            assertThat(result, equalTo(typeVariableMock));
            moreTypes.verify(() -> MoreTypes.canonicalize(typeMock2), atLeast(1));
            moreTypes.verify(() -> MoreTypes.getRawType(typeMock), atLeast(1));
            moreTypes.verify(() -> MoreTypes.resolveTypeVariable(typeMock, Object.class, typeVariableMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${8c6b1a2b-cc44-3bc4-b577-a5c1aace6673}, hash: FA6C07E0459658FE0CCB56FF902F0F53
    @Ignore()
    @Test()
    public void resolveTypeWhenToResolveInstanceOfGenericArrayTypeAndComponentTypeEqualsNewComponentType() {
        /* Branches:
         * (toResolve instanceof TypeVariable) : true
         * (toResolve == original) : false
         * (toResolve instanceof GenericArrayType) : true
         * (componentType == newComponentType) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<MoreTypes> moreTypes = mockStatic(MoreTypes.class)) {
            moreTypes.when(() -> MoreTypes.canonicalize(typeMock2)).thenReturn(typeMock);
            moreTypes.when(() -> MoreTypes.getRawType(typeMock)).thenReturn(Object.class);
            moreTypes.when(() -> MoreTypes.resolveTypeVariable(typeMock, Object.class, typeVariableMock)).thenReturn(genericArrayTypeMock);
            TypeLiteral<Object> target = new TypeLiteral(typeMock3);
            //Act Statement(s)
            Type result = target.resolveType(typeVariableMock);
            //Assert statement(s)
            assertThat(result, equalTo(genericArrayTypeMock));
            moreTypes.verify(() -> MoreTypes.canonicalize(typeMock2), atLeast(1));
            moreTypes.verify(() -> MoreTypes.getRawType(typeMock), atLeast(1));
            moreTypes.verify(() -> MoreTypes.resolveTypeVariable(typeMock, Object.class, typeVariableMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${6151b342-82ca-3a95-9a06-f015e0df2392}, hash: 033C88D2A4777C43CCE8F1E6BD9E3D78
    @Ignore()
    @Test()
    public void resolveTypeWhenToResolveInstanceOfGenericArrayTypeAndComponentTypeNotEqualsNewComponentType() {
        /* Branches:
         * (toResolve instanceof TypeVariable) : true
         * (toResolve == original) : false
         * (toResolve instanceof GenericArrayType) : true
         * (componentType == newComponentType) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        GenericArrayType genericArrayTypeMock2 = mock(GenericArrayType.class);
        try (MockedStatic<Types> types = mockStatic(Types.class);
             MockedStatic<MoreTypes> moreTypes = mockStatic(MoreTypes.class)) {
            moreTypes.when(() -> MoreTypes.canonicalize(typeMock2)).thenReturn(typeMock);
            moreTypes.when(() -> MoreTypes.getRawType(typeMock)).thenReturn(Object.class);
            moreTypes.when(() -> MoreTypes.resolveTypeVariable(typeMock, Object.class, typeVariableMock)).thenReturn(genericArrayTypeMock);
            types.when(() -> Types.arrayOf(typeMock3)).thenReturn(genericArrayTypeMock2);
            TypeLiteral<Object> target = new TypeLiteral(typeMock4);
            //Act Statement(s)
            Type result = target.resolveType(typeVariableMock);
            //Assert statement(s)
            assertThat(result, equalTo(genericArrayTypeMock2));
            moreTypes.verify(() -> MoreTypes.canonicalize(typeMock2), atLeast(1));
            moreTypes.verify(() -> MoreTypes.getRawType(typeMock), atLeast(1));
            moreTypes.verify(() -> MoreTypes.resolveTypeVariable(typeMock, Object.class, typeVariableMock), atLeast(1));
            types.verify(() -> Types.arrayOf(typeMock3), atLeast(1));
        }
    }

    //Sapient generated method id: ${6c951ebd-5462-3d5d-a211-a7dcb196a44e}, hash: 654529F9BCB4317A67A88A056002E9EC
    @Ignore()
    @Test()
    public void resolveTypeWhenToResolveNotInstanceOfParameterizedTypeAndToResolveNotInstanceOfWildcardType() {
        /* Branches:
         * (toResolve instanceof TypeVariable) : true
         * (toResolve == original) : false
         * (toResolve instanceof GenericArrayType) : false
         * (toResolve instanceof ParameterizedType) : false
         * (toResolve instanceof WildcardType) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<MoreTypes> moreTypes = mockStatic(MoreTypes.class)) {
            moreTypes.when(() -> MoreTypes.canonicalize(typeMock2)).thenReturn(typeMock);
            moreTypes.when(() -> MoreTypes.getRawType(typeMock)).thenReturn(Object.class);
            moreTypes.when(() -> MoreTypes.resolveTypeVariable(typeMock, Object.class, typeVariableMock)).thenReturn(typeMock3);
            TypeLiteral<Object> target = new TypeLiteral(typeMock4);
            //Act Statement(s)
            Type result = target.resolveType(typeVariableMock);
            //Assert statement(s)
            assertThat(result, equalTo(typeMock3));
            moreTypes.verify(() -> MoreTypes.canonicalize(typeMock2), atLeast(1));
            moreTypes.verify(() -> MoreTypes.getRawType(typeMock), atLeast(1));
            moreTypes.verify(() -> MoreTypes.resolveTypeVariable(typeMock, Object.class, typeVariableMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${ae11b10f-0b6e-34ca-abc1-442386e555c7}, hash: 5E6C6911743FC6CF6B6DCD64429221D6
    @Ignore()
    @Test()
    public void resolveTypeWhenOriginalLowerBoundLengthEquals1AndLowerBoundNotEquals0IndexOfOriginalLowerBound() {
        /* Branches:
         * (toResolve instanceof TypeVariable) : true
         * (toResolve == original) : false
         * (toResolve instanceof GenericArrayType) : false
         * (toResolve instanceof ParameterizedType) : false
         * (toResolve instanceof WildcardType) : true
         * (originalLowerBound.length == 1) : true
         * (lowerBound != originalLowerBound[0]) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Types> types = mockStatic(Types.class);
             MockedStatic<MoreTypes> moreTypes = mockStatic(MoreTypes.class)) {
            moreTypes.when(() -> MoreTypes.canonicalize(typeMock2)).thenReturn(typeMock);
            moreTypes.when(() -> MoreTypes.getRawType(typeMock)).thenReturn(Object.class);
            moreTypes.when(() -> MoreTypes.resolveTypeVariable(typeMock, Object.class, typeVariableMock)).thenReturn(wildcardTypeMock);
            types.when(() -> Types.supertypeOf(typeMock3)).thenReturn(wildcardTypeMock2);
            TypeLiteral<Object> target = new TypeLiteral(typeMock4);
            //Act Statement(s)
            Type result = target.resolveType(typeVariableMock);
            //Assert statement(s)
            assertThat(result, equalTo(wildcardTypeMock2));
            moreTypes.verify(() -> MoreTypes.canonicalize(typeMock2), atLeast(1));
            moreTypes.verify(() -> MoreTypes.getRawType(typeMock), atLeast(1));
            moreTypes.verify(() -> MoreTypes.resolveTypeVariable(typeMock, Object.class, typeVariableMock), atLeast(1));
            types.verify(() -> Types.supertypeOf(typeMock3), atLeast(1));
        }
    }

    //Sapient generated method id: ${063ee648-3e33-34b1-b86a-49f3917deaba}, hash: 74A20204366C76ED5CD7FFC15CAFAAF3
    @Ignore()
    @Test()
    public void resolveTypeWhenOriginalLowerBoundLengthEquals1AndLowerBoundEquals0IndexOfOriginalLowerBound() {
        /* Branches:
         * (toResolve instanceof TypeVariable) : true
         * (toResolve == original) : false
         * (toResolve instanceof GenericArrayType) : false
         * (toResolve instanceof ParameterizedType) : false
         * (toResolve instanceof WildcardType) : true
         * (originalLowerBound.length == 1) : true
         * (lowerBound != originalLowerBound[0]) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<MoreTypes> moreTypes = mockStatic(MoreTypes.class)) {
            moreTypes.when(() -> MoreTypes.canonicalize(typeMock2)).thenReturn(typeMock);
            moreTypes.when(() -> MoreTypes.getRawType(typeMock)).thenReturn(Object.class);
            moreTypes.when(() -> MoreTypes.resolveTypeVariable(typeMock, Object.class, typeVariableMock)).thenReturn(wildcardTypeMock);
            TypeLiteral<Object> target = new TypeLiteral(typeMock3);
            //Act Statement(s)
            Type result = target.resolveType(typeVariableMock);
            //Assert statement(s)
            assertThat(result, equalTo(wildcardTypeMock));
            moreTypes.verify(() -> MoreTypes.canonicalize(typeMock2), atLeast(1));
            moreTypes.verify(() -> MoreTypes.getRawType(typeMock), atLeast(1));
            moreTypes.verify(() -> MoreTypes.resolveTypeVariable(typeMock, Object.class, typeVariableMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${310ce930-2f04-374a-bdd3-ca787a9a5fbe}, hash: B57F9ED6DD8D2A51E2630EAE66ADACE7
    @Ignore()
    @Test()
    public void resolveTypeWhenResolvedTypeArgumentEqualsTIndexOfArgsAndNotChanged() {
        /* Branches:
         * (toResolve instanceof TypeVariable) : true
         * (toResolve == original) : false
         * (toResolve instanceof GenericArrayType) : false
         * (toResolve instanceof ParameterizedType) : true
         * (newOwnerType != ownerType) : false
         * (t < length) : true
         * (resolvedTypeArgument != args[t]) : false
         * (changed) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<MoreTypes> moreTypes = mockStatic(MoreTypes.class)) {
            moreTypes.when(() -> MoreTypes.canonicalize(typeMock2)).thenReturn(typeMock);
            moreTypes.when(() -> MoreTypes.getRawType(typeMock)).thenReturn(Object.class);
            moreTypes.when(() -> MoreTypes.resolveTypeVariable(typeMock, Object.class, typeVariableMock)).thenReturn(parameterizedTypeMock);
            TypeLiteral<Object> target = new TypeLiteral(typeMock3);
            //Act Statement(s)
            Type result = target.resolveType(typeVariableMock);
            //Assert statement(s)
            assertThat(result, equalTo(parameterizedTypeMock));
            moreTypes.verify(() -> MoreTypes.canonicalize(typeMock2), atLeast(1));
            moreTypes.verify(() -> MoreTypes.getRawType(typeMock), atLeast(1));
            moreTypes.verify(() -> MoreTypes.resolveTypeVariable(typeMock, Object.class, typeVariableMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${e1b5414f-3063-3709-b555-0e1b12896f03}, hash: 0983E85B4C6BBDAA5C9D88090494DC6F
    @Ignore()
    @Test()
    public void resolveTypeWhenOriginalUpperBoundLengthEquals1AndUpperBoundNotEquals0IndexOfOriginalUpperBound() {
        /* Branches:
         * (toResolve instanceof TypeVariable) : true
         * (toResolve == original) : false
         * (toResolve instanceof GenericArrayType) : false
         * (toResolve instanceof ParameterizedType) : false
         * (toResolve instanceof WildcardType) : true
         * (originalLowerBound.length == 1) : false
         * (originalUpperBound.length == 1) : true
         * (upperBound != originalUpperBound[0]) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Types> types = mockStatic(Types.class);
             MockedStatic<MoreTypes> moreTypes = mockStatic(MoreTypes.class)) {
            moreTypes.when(() -> MoreTypes.canonicalize(typeMock2)).thenReturn(typeMock);
            moreTypes.when(() -> MoreTypes.getRawType(typeMock)).thenReturn(Object.class);
            moreTypes.when(() -> MoreTypes.resolveTypeVariable(typeMock, Object.class, typeVariableMock)).thenReturn(wildcardTypeMock);
            types.when(() -> Types.subtypeOf(typeMock3)).thenReturn(wildcardTypeMock2);
            TypeLiteral<Object> target = new TypeLiteral(typeMock4);
            //Act Statement(s)
            Type result = target.resolveType(typeVariableMock);
            //Assert statement(s)
            assertThat(result, equalTo(wildcardTypeMock2));
            moreTypes.verify(() -> MoreTypes.canonicalize(typeMock2), atLeast(1));
            moreTypes.verify(() -> MoreTypes.getRawType(typeMock), atLeast(1));
            moreTypes.verify(() -> MoreTypes.resolveTypeVariable(typeMock, Object.class, typeVariableMock), atLeast(1));
            types.verify(() -> Types.subtypeOf(typeMock3), atLeast(1));
        }
    }

    //Sapient generated method id: ${efed5dff-7b16-3df7-b923-0470a0c12b6a}, hash: 377A1536CC74F31983B7D97F80753EB5
    @Ignore()
    @Test()
    public void resolveTypeWhenResolvedTypeArgumentNotEqualsTIndexOfArgsAndChangedAndChanged() {
        /* Branches:
         * (toResolve instanceof TypeVariable) : true
         * (toResolve == original) : false
         * (toResolve instanceof GenericArrayType) : false
         * (toResolve instanceof ParameterizedType) : true
         * (newOwnerType != ownerType) : true
         * (t < length) : true
         * (resolvedTypeArgument != args[t]) : true
         * (!changed) : false
         * (changed) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Types> types = mockStatic(Types.class);
             MockedStatic<MoreTypes> moreTypes = mockStatic(MoreTypes.class)) {
            moreTypes.when(() -> MoreTypes.canonicalize(typeMock2)).thenReturn(typeMock);
            moreTypes.when(() -> MoreTypes.getRawType(typeMock)).thenReturn(Object.class);
            moreTypes.when(() -> MoreTypes.resolveTypeVariable(typeMock, Object.class, typeVariableMock)).thenReturn(parameterizedTypeMock);
            Type[] typeArray = new Type[]{typeMock5};
            types.when(() -> Types.newParameterizedTypeWithOwner(typeMock3, typeMock4, typeArray)).thenReturn(parameterizedTypeMock2);
            TypeLiteral<Object> target = new TypeLiteral(typeMock6);
            //Act Statement(s)
            Type result = target.resolveType(typeVariableMock);
            //Assert statement(s)
            assertThat(result, equalTo(parameterizedTypeMock2));
            moreTypes.verify(() -> MoreTypes.canonicalize(typeMock2), atLeast(1));
            moreTypes.verify(() -> MoreTypes.getRawType(typeMock), atLeast(1));
            moreTypes.verify(() -> MoreTypes.resolveTypeVariable(typeMock, Object.class, typeVariableMock), atLeast(1));
            types.verify(() -> Types.newParameterizedTypeWithOwner(typeMock3, typeMock4, typeArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${521ec351-05aa-3d28-9037-893a39dee838}, hash: 45516ED36FB0F93216ECDF7B3AD511F5
    @Ignore()
    @Test()
    public void resolveTypeWhenResolvedTypeArgumentNotEqualsTIndexOfArgsAndNotChangedAndChanged() {
        /* Branches:
         * (toResolve instanceof TypeVariable) : true
         * (toResolve == original) : false
         * (toResolve instanceof GenericArrayType) : false
         * (toResolve instanceof ParameterizedType) : true
         * (newOwnerType != ownerType) : false
         * (t < length) : true
         * (resolvedTypeArgument != args[t]) : true
         * (!changed) : true
         * (changed) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Types> types = mockStatic(Types.class);
             MockedStatic<MoreTypes> moreTypes = mockStatic(MoreTypes.class)) {
            moreTypes.when(() -> MoreTypes.canonicalize(typeMock2)).thenReturn(typeMock);
            moreTypes.when(() -> MoreTypes.getRawType(typeMock)).thenReturn(Object.class);
            moreTypes.when(() -> MoreTypes.resolveTypeVariable(typeMock, Object.class, typeVariableMock)).thenReturn(parameterizedTypeMock);
            Type[] typeArray = new Type[]{typeMock5};
            types.when(() -> Types.newParameterizedTypeWithOwner(typeMock3, typeMock4, typeArray)).thenReturn(parameterizedTypeMock2);
            TypeLiteral<Object> target = new TypeLiteral(typeMock6);
            //Act Statement(s)
            Type result = target.resolveType(typeVariableMock);
            //Assert statement(s)
            assertThat(result, equalTo(parameterizedTypeMock2));
            moreTypes.verify(() -> MoreTypes.canonicalize(typeMock2), atLeast(1));
            moreTypes.verify(() -> MoreTypes.getRawType(typeMock), atLeast(1));
            moreTypes.verify(() -> MoreTypes.resolveTypeVariable(typeMock, Object.class, typeVariableMock), atLeast(1));
            types.verify(() -> Types.newParameterizedTypeWithOwner(typeMock3, typeMock4, typeArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${702d1546-400e-32e7-a98f-3730ef0e5d4f}, hash: 652D96011BFF74A1A6CFCBEEEB4C1D62
    @Ignore()
    @Test()
    public void getSupertypeTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<MoreTypes> moreTypes = mockStatic(MoreTypes.class)) {
            moreTypes.when(() -> MoreTypes.canonicalize(typeMock2)).thenReturn(typeMock);
            moreTypes.when(() -> MoreTypes.getRawType(typeMock)).thenReturn(java.lang.Object.class);
            moreTypes.when(() -> MoreTypes.getGenericSupertype(typeMock, Object.class, Object.class)).thenReturn(typeMock3);
            TypeLiteral<Object> target = spy(new TypeLiteral(typeMock4));
            doReturn(typeLiteralMock).when(target).resolve(typeMock3);
            //Act Statement(s)
            TypeLiteral result = target.getSupertype(Object.class);
            //Assert statement(s)
            assertThat(result, equalTo(typeLiteralMock));
            moreTypes.verify(() -> MoreTypes.canonicalize(typeMock2), atLeast(1));
            moreTypes.verify(() -> MoreTypes.getRawType(typeMock), atLeast(1));
            moreTypes.verify(() -> MoreTypes.getGenericSupertype(typeMock, Object.class, Object.class), atLeast(1));
            verify(target).resolve(typeMock3);
        }
    }

    //Sapient generated method id: ${b770dd24-2a41-33ed-8c8a-87c36a5ff7ef}, hash: F3E0605E2627AB1B2D752D4A67021F18
    @Ignore()
    @Test()
    public void getFieldTypeTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Field fieldMock = mock(Field.class);
        try (MockedStatic<MoreTypes> moreTypes = mockStatic(MoreTypes.class)) {
            doReturn(Object.class).when(fieldMock).getDeclaringClass();
            doReturn(typeMock).when(fieldMock).getGenericType();
            moreTypes.when(() -> MoreTypes.canonicalize(typeMock3)).thenReturn(typeMock2);
            moreTypes.when(() -> MoreTypes.getRawType(typeMock2)).thenReturn(java.lang.Object.class);
            TypeLiteral<Object> target = spy(new TypeLiteral(typeMock4));
            doReturn(typeLiteralMock).when(target).resolve(typeMock);
            //Act Statement(s)
            TypeLiteral result = target.getFieldType(fieldMock);
            //Assert statement(s)
            assertThat(result, equalTo(typeLiteralMock));
            verify(fieldMock).getDeclaringClass();
            verify(fieldMock).getGenericType();
            moreTypes.verify(() -> MoreTypes.canonicalize(typeMock3), atLeast(1));
            moreTypes.verify(() -> MoreTypes.getRawType(typeMock2), atLeast(1));
            verify(target).resolve(typeMock);
        }
    }

    //Sapient generated method id: ${bd68c43e-2041-3ed5-b323-6758e8a66907}, hash: 573E780ECE1DA9B18B56312CBC70B78C
    @Ignore()
    @Test()
    public void getParameterTypesWhenTLessThanTypesLength() {
        /* Branches:
         * (methodOrConstructor instanceof Method) : true
         * (t < types.length) : true  #  inside resolveAll method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<MoreTypes> moreTypes = mockStatic(MoreTypes.class)) {
            moreTypes.when(() -> MoreTypes.canonicalize(typeMock2)).thenReturn(typeMock);
            moreTypes.when(() -> MoreTypes.getRawType(typeMock)).thenReturn(java.lang.Object.class);
            TypeLiteral<Object> target = spy(new TypeLiteral(typeMock3));
            doReturn(typeLiteralMock).when(target).resolve(typeMock4);
            //Act Statement(s)
            List<TypeLiteral<?>> result = target.getParameterTypes(methodMock);
            ImmutableList immutableList = ImmutableList.of();
            //Assert statement(s)
            assertThat(result, equalTo(immutableList));
            moreTypes.verify(() -> MoreTypes.canonicalize(typeMock2), atLeast(1));
            moreTypes.verify(() -> MoreTypes.getRawType(typeMock), atLeast(1));
            verify(target).resolve(typeMock4);
        }
    }

    //Sapient generated method id: ${b28e132f-8a4c-3a07-af17-096362c20a30}, hash: 4BC45650B5C5451136800F4D7E0F005D
    @Ignore()
    @Test()
    public void getParameterTypesWhenMethodOrConstructorNotInstanceOfConstructorThrowsIllegalArgumentException() {
        /* Branches:
         * (methodOrConstructor instanceof Method) : false
         * (methodOrConstructor instanceof Constructor) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Type typeMock3 = mock(Type.class, "someType");
        try (MockedStatic<MoreTypes> moreTypes = mockStatic(MoreTypes.class)) {
            moreTypes.when(() -> MoreTypes.canonicalize(typeMock2)).thenReturn(typeMock);
            moreTypes.when(() -> MoreTypes.getRawType(typeMock)).thenReturn(Object.class);
            TypeLiteral<Object> target = new TypeLiteral(typeMock3);
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Not a method or a constructor: someMethod");
            thrown.expect(IllegalArgumentException.class);
            thrown.expectMessage(illegalArgumentException.getMessage());
            //Act Statement(s)
            target.getParameterTypes(memberMock);
            //Assert statement(s)
            moreTypes.verify(() -> MoreTypes.canonicalize(typeMock2), atLeast(1));
            moreTypes.verify(() -> MoreTypes.getRawType(typeMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${c956e273-60da-30a4-92b9-55a229befee1}, hash: EA83E9B51F51FE8E0EE7B0035D8F0EB7
    @Ignore()
    @Test()
    public void getParameterTypesWhenMethodOrConstructorInstanceOfConstructorAndTNotLessThanTypesLength() {
        /* Branches:
         * (methodOrConstructor instanceof Method) : false
         * (methodOrConstructor instanceof Constructor) : true
         * (t < types.length) : false  #  inside resolveAll method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<MoreTypes> moreTypes = mockStatic(MoreTypes.class)) {
            moreTypes.when(() -> MoreTypes.canonicalize(typeMock2)).thenReturn(typeMock);
            moreTypes.when(() -> MoreTypes.getRawType(typeMock)).thenReturn(java.lang.Object.class);
            TypeLiteral<Object> target = new TypeLiteral(typeMock3);
            //Act Statement(s)
            List<TypeLiteral<?>> result = target.getParameterTypes(constructorMock);
            ImmutableList immutableList = ImmutableList.of();
            //Assert statement(s)
            assertThat(result, equalTo(immutableList));
            moreTypes.verify(() -> MoreTypes.canonicalize(typeMock2), atLeast(1));
            moreTypes.verify(() -> MoreTypes.getRawType(typeMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${425aad57-54e0-3063-94a0-a6f98495d2f8}, hash: 1D754C801AF11C80AA098B66AEC194D0
    @Ignore()
    @Test()
    public void getExceptionTypesWhenTLessThanTypesLength() {
        /* Branches:
         * (methodOrConstructor instanceof Method) : true
         * (t < types.length) : true  #  inside resolveAll method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<MoreTypes> moreTypes = mockStatic(MoreTypes.class)) {
            moreTypes.when(() -> MoreTypes.canonicalize(typeMock2)).thenReturn(typeMock);
            moreTypes.when(() -> MoreTypes.getRawType(typeMock)).thenReturn(java.lang.Object.class);
            TypeLiteral<Object> target = spy(new TypeLiteral(typeMock3));
            doReturn(typeLiteralMock).when(target).resolve(typeMock4);
            //Act Statement(s)
            List<TypeLiteral<?>> result = target.getExceptionTypes(methodMock);
            ImmutableList immutableList = ImmutableList.of();
            //Assert statement(s)
            assertThat(result, equalTo(immutableList));
            moreTypes.verify(() -> MoreTypes.canonicalize(typeMock2), atLeast(1));
            moreTypes.verify(() -> MoreTypes.getRawType(typeMock), atLeast(1));
            verify(target).resolve(typeMock4);
        }
    }

    //Sapient generated method id: ${930f8b5c-3fc7-3f82-99fe-6ef2cc1e480e}, hash: 8FB46D4CDA6E9A0BB440367761BE933B
    @Ignore()
    @Test()
    public void getExceptionTypesWhenMethodOrConstructorNotInstanceOfConstructorThrowsIllegalArgumentException() {
        /* Branches:
         * (methodOrConstructor instanceof Method) : false
         * (methodOrConstructor instanceof Constructor) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Type typeMock3 = mock(Type.class, "someType");
        try (MockedStatic<MoreTypes> moreTypes = mockStatic(MoreTypes.class)) {
            moreTypes.when(() -> MoreTypes.canonicalize(typeMock2)).thenReturn(typeMock);
            moreTypes.when(() -> MoreTypes.getRawType(typeMock)).thenReturn(Object.class);
            TypeLiteral<Object> target = new TypeLiteral(typeMock3);
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Not a method or a constructor: someMethod");
            thrown.expect(IllegalArgumentException.class);
            thrown.expectMessage(illegalArgumentException.getMessage());
            //Act Statement(s)
            target.getExceptionTypes(memberMock);
            //Assert statement(s)
            moreTypes.verify(() -> MoreTypes.canonicalize(typeMock2), atLeast(1));
            moreTypes.verify(() -> MoreTypes.getRawType(typeMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${fa656101-9e11-3a00-af80-05fb7517413d}, hash: 9DD61543BA3B08B63BB5A1E0D0EE36CD
    @Ignore()
    @Test()
    public void getExceptionTypesWhenMethodOrConstructorInstanceOfConstructorAndTNotLessThanTypesLength() {
        /* Branches:
         * (methodOrConstructor instanceof Method) : false
         * (methodOrConstructor instanceof Constructor) : true
         * (t < types.length) : false  #  inside resolveAll method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<MoreTypes> moreTypes = mockStatic(MoreTypes.class)) {
            moreTypes.when(() -> MoreTypes.canonicalize(typeMock2)).thenReturn(typeMock);
            moreTypes.when(() -> MoreTypes.getRawType(typeMock)).thenReturn(java.lang.Object.class);
            TypeLiteral<Object> target = new TypeLiteral(typeMock3);
            //Act Statement(s)
            List<TypeLiteral<?>> result = target.getExceptionTypes(constructorMock);
            ImmutableList immutableList = ImmutableList.of();
            //Assert statement(s)
            assertThat(result, equalTo(immutableList));
            moreTypes.verify(() -> MoreTypes.canonicalize(typeMock2), atLeast(1));
            moreTypes.verify(() -> MoreTypes.getRawType(typeMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${3c7ba5a6-8718-317d-864b-8c1a1dff12ec}, hash: 54B564AAEB37EB38AFF2B22DAAFAA553
    @Ignore()
    @Test()
    public void getReturnTypeTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Method methodMock = mock(Method.class, "someMethod");
        Type typeMock3 = mock(Type.class, "someType");
        try (MockedStatic<MoreTypes> moreTypes = mockStatic(MoreTypes.class)) {
            doReturn(null).when(methodMock).getDeclaringClass();
            moreTypes.when(() -> MoreTypes.canonicalize(typeMock2)).thenReturn(typeMock);
            moreTypes.when(() -> MoreTypes.getRawType(typeMock)).thenReturn(java.lang.Object.class);
            TypeLiteral<Object> target = new TypeLiteral(typeMock3);
            thrown.expect(NullPointerException.class);
            //Act Statement(s)
            target.getReturnType(methodMock);
            //Assert statement(s)
            verify(methodMock).getDeclaringClass();
            moreTypes.verify(() -> MoreTypes.canonicalize(typeMock2), atLeast(1));
            moreTypes.verify(() -> MoreTypes.getRawType(typeMock), atLeast(1));
        }
    }
}

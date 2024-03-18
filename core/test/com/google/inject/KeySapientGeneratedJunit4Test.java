package com.google.inject;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import com.google.inject.internal.MoreTypes;

import java.lang.reflect.Type;
import java.lang.annotation.Annotation;

import com.google.inject.internal.Annotations;
import org.mockito.MockedStatic;

import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

public class KeySapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final TypeLiteral<Object> typeLiteralMock = mock(TypeLiteral.class, "typeLiteral");

    private final java.lang.annotation.Annotation annotationMock = mock(java.lang.annotation.Annotation.class);

    private final java.lang.annotation.Annotation annotationMock2 = mock(java.lang.annotation.Annotation.class);

    private final Key.AnnotationStrategy keyAnnotationStrategyMock = mock(Key.AnnotationStrategy.class);

    private final TypeLiteral typeLiteralMock2 = mock(TypeLiteral.class);

    private final TypeLiteral typeLiteralMock3 = mock(TypeLiteral.class);

    private final TypeLiteral<Object> typeLiteralMock4 = mock(TypeLiteral.class);

    private final Type typeMock = mock(Type.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${6fadf434-8607-384d-aeed-8056cc110d14}, hash: 631C26231511499A80E0FF8BE075864A
    @Test()
    public void getAnnotationTypeTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        /*try (MockedStatic<MoreTypes> moreTypes = mockStatic(MoreTypes.class);
    MockedStatic<TypeLiteral> typeLiteral = mockStatic(TypeLiteral.class);
    MockedStatic<Annotations> annotations = mockStatic(Annotations.class)) {
    annotations.when(() -> Annotations.canonicalizeIfNamed(java.lang.annotation.Annotation.class)).thenReturn(Annotation.class);
    annotations.when(() -> Annotations.isAllDefaultMethods(java.lang.annotation.Annotation.class)).thenReturn(true);
    annotations.when(() -> Annotations.generateAnnotation(java.lang.annotation.Annotation.class)).thenReturn(annotationMock);
    annotations.when(() -> Annotations.isRetainedAtRuntime(Object.class)).thenReturn(false);
    annotations.when(() -> Annotations.isBindingAnnotation(Object.class)).thenReturn(false);
    annotations.when(() -> Annotations.isMarker(Object.class)).thenReturn(true);
    typeLiteral.when(() -> TypeLiteral.fromSuperclassTypeParameter(Key.class)).thenReturn(typeLiteralMock2);
    moreTypes.when(() -> MoreTypes.canonicalizeForKey(typeLiteralMock2)).thenReturn(typeLiteralMock);
    Key<Object> target = new Key(java.lang.annotation.Annotation.class);
    //Act Statement(s)
    Class<? extends java.lang.annotation.Annotation> result = target.getAnnotationType();
    //Assert statement(s)
    assertThat(result, equalTo(Object.class));
    annotations.verify(() -> Annotations.canonicalizeIfNamed(java.lang.annotation.Annotation.class), atLeast(1));
    annotations.verify(() -> Annotations.isAllDefaultMethods(java.lang.annotation.Annotation.class), atLeast(1));
    annotations.verify(() -> Annotations.generateAnnotation(java.lang.annotation.Annotation.class), atLeast(1));
    annotations.verify(() -> Annotations.isRetainedAtRuntime(Object.class), atLeast(1));
    annotations.verify(() -> Annotations.isBindingAnnotation(Object.class), atLeast(1));
    annotations.verify(() -> Annotations.isMarker(Object.class), atLeast(1));
    typeLiteral.verify(() -> TypeLiteral.fromSuperclassTypeParameter(Key.class), atLeast(1));
    moreTypes.verify(() -> MoreTypes.canonicalizeForKey(typeLiteralMock2), atLeast(1));
}*/
    }

    //Sapient generated method id: ${43f6554e-3df6-3d8d-8e42-81c52fff7a95}, hash: 925FFFF4187B8C712ED307EDAE1AA7C3
    @Test()
    public void getAnnotationTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        /*try (MockedStatic<MoreTypes> moreTypes = mockStatic(MoreTypes.class);
    MockedStatic<TypeLiteral> typeLiteral = mockStatic(TypeLiteral.class);
    MockedStatic<Annotations> annotations = mockStatic(Annotations.class)) {
    annotations.when(() -> Annotations.canonicalizeIfNamed(java.lang.annotation.Annotation.class)).thenReturn(Annotation.class);
    annotations.when(() -> Annotations.isAllDefaultMethods(java.lang.annotation.Annotation.class)).thenReturn(true);
    annotations.when(() -> Annotations.generateAnnotation(java.lang.annotation.Annotation.class)).thenReturn(annotationMock);
    annotations.when(() -> Annotations.isRetainedAtRuntime(Object.class)).thenReturn(false);
    annotations.when(() -> Annotations.isBindingAnnotation(Object.class)).thenReturn(false);
    annotations.when(() -> Annotations.isMarker(Object.class)).thenReturn(true);
    typeLiteral.when(() -> TypeLiteral.fromSuperclassTypeParameter(Key.class)).thenReturn(typeLiteralMock2);
    moreTypes.when(() -> MoreTypes.canonicalizeForKey(typeLiteralMock2)).thenReturn(typeLiteralMock);
    Key<Object> target = new Key(java.lang.annotation.Annotation.class);
    //Act Statement(s)
    java.lang.annotation.Annotation result = target.getAnnotation();
    //Assert statement(s)
    assertThat(result, equalTo(annotationMock));
    annotations.verify(() -> Annotations.canonicalizeIfNamed(java.lang.annotation.Annotation.class), atLeast(1));
    annotations.verify(() -> Annotations.isAllDefaultMethods(java.lang.annotation.Annotation.class), atLeast(1));
    annotations.verify(() -> Annotations.generateAnnotation(java.lang.annotation.Annotation.class), atLeast(1));
    annotations.verify(() -> Annotations.isRetainedAtRuntime(Object.class), atLeast(1));
    annotations.verify(() -> Annotations.isBindingAnnotation(Object.class), atLeast(1));
    annotations.verify(() -> Annotations.isMarker(Object.class), atLeast(1));
    typeLiteral.verify(() -> TypeLiteral.fromSuperclassTypeParameter(Key.class), atLeast(1));
    moreTypes.verify(() -> MoreTypes.canonicalizeForKey(typeLiteralMock2), atLeast(1));
}*/
    }

    //Sapient generated method id: ${202ff0d9-7143-3926-9759-0e06cfe023de}, hash: 8A40EFA2D731A3307383327D25C9CEBC
    @Test()
    public void hasAnnotationTypeWhenAnnotationStrategyGetAnnotationTypeIsNotNull() {
        /* Branches:
         * (annotationStrategy.getAnnotationType() != null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        /*try (MockedStatic<MoreTypes> moreTypes = mockStatic(MoreTypes.class);
    MockedStatic<TypeLiteral> typeLiteral = mockStatic(TypeLiteral.class);
    MockedStatic<Annotations> annotations = mockStatic(Annotations.class)) {
    annotations.when(() -> Annotations.canonicalizeIfNamed(java.lang.annotation.Annotation.class)).thenReturn(Annotation.class);
    annotations.when(() -> Annotations.isAllDefaultMethods(java.lang.annotation.Annotation.class)).thenReturn(true);
    annotations.when(() -> Annotations.generateAnnotation(java.lang.annotation.Annotation.class)).thenReturn(annotationMock);
    annotations.when(() -> Annotations.isRetainedAtRuntime(Object.class)).thenReturn(false);
    annotations.when(() -> Annotations.isBindingAnnotation(Object.class)).thenReturn(false);
    annotations.when(() -> Annotations.isMarker(Object.class)).thenReturn(true);
    typeLiteral.when(() -> TypeLiteral.fromSuperclassTypeParameter(Key.class)).thenReturn(typeLiteralMock2);
    moreTypes.when(() -> MoreTypes.canonicalizeForKey(typeLiteralMock2)).thenReturn(typeLiteralMock);
    Key<Object> target = new Key(java.lang.annotation.Annotation.class);
    //Act Statement(s)
    boolean result = target.hasAnnotationType();
    //Assert statement(s)
    assertThat(result, equalTo(Boolean.TRUE));
    annotations.verify(() -> Annotations.canonicalizeIfNamed(java.lang.annotation.Annotation.class), atLeast(1));
    annotations.verify(() -> Annotations.isAllDefaultMethods(java.lang.annotation.Annotation.class), atLeast(1));
    annotations.verify(() -> Annotations.generateAnnotation(java.lang.annotation.Annotation.class), atLeast(1));
    annotations.verify(() -> Annotations.isRetainedAtRuntime(Object.class), atLeast(1));
    annotations.verify(() -> Annotations.isBindingAnnotation(Object.class), atLeast(1));
    annotations.verify(() -> Annotations.isMarker(Object.class), atLeast(1));
    typeLiteral.verify(() -> TypeLiteral.fromSuperclassTypeParameter(Key.class), atLeast(1));
    moreTypes.verify(() -> MoreTypes.canonicalizeForKey(typeLiteralMock2), atLeast(1));
}*/
    }

    //Sapient generated method id: ${08dbdb7a-9273-3eb3-91aa-771495059ee5}, hash: 9F4B67F49D1E3F17A64962DAF0FE5313
    @Test()
    public void hasAnnotationTypeWhenAnnotationStrategyGetAnnotationTypeIsNull() {
        /* Branches:
         * (annotationStrategy.getAnnotationType() != null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<MoreTypes> moreTypes = mockStatic(MoreTypes.class);
             MockedStatic<TypeLiteral> typeLiteral = mockStatic(TypeLiteral.class);
             MockedStatic<Annotations> annotations = mockStatic(Annotations.class)) {
            annotations.when(() -> Annotations.canonicalizeIfNamed(java.lang.annotation.Annotation.class)).thenReturn(Annotation.class);
            annotations.when(() -> Annotations.isAllDefaultMethods(java.lang.annotation.Annotation.class)).thenReturn(true);
            annotations.when(() -> Annotations.generateAnnotation(java.lang.annotation.Annotation.class)).thenReturn(annotationMock);
            annotations.when(() -> Annotations.isRetainedAtRuntime((Class) null)).thenReturn(false);
            annotations.when(() -> Annotations.isBindingAnnotation((Class) null)).thenReturn(false);
            annotations.when(() -> Annotations.isMarker((Class) null)).thenReturn(true);
            typeLiteral.when(() -> TypeLiteral.fromSuperclassTypeParameter(Key.class)).thenReturn(typeLiteralMock2);
            moreTypes.when(() -> MoreTypes.canonicalizeForKey(typeLiteralMock2)).thenReturn(typeLiteralMock);
            Key<Object> target = new Key(java.lang.annotation.Annotation.class);
            //Act Statement(s)
            boolean result = target.hasAnnotationType();
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            annotations.verify(() -> Annotations.canonicalizeIfNamed(java.lang.annotation.Annotation.class), atLeast(1));
            annotations.verify(() -> Annotations.isAllDefaultMethods(java.lang.annotation.Annotation.class), atLeast(1));
            annotations.verify(() -> Annotations.generateAnnotation(java.lang.annotation.Annotation.class), atLeast(1));
            annotations.verify(() -> Annotations.isRetainedAtRuntime((Class) null), atLeast(1));
            annotations.verify(() -> Annotations.isBindingAnnotation((Class) null), atLeast(1));
            annotations.verify(() -> Annotations.isMarker((Class) null), atLeast(1));
            typeLiteral.verify(() -> TypeLiteral.fromSuperclassTypeParameter(Key.class), atLeast(1));
            moreTypes.verify(() -> MoreTypes.canonicalizeForKey(typeLiteralMock2), atLeast(1));
        }
    }

    //Sapient generated method id: ${c7209d98-c463-363a-859b-88e8c92dfd8d}, hash: 427E209C23FB269A6589BE484CC24827
    @Test()
    public void getAnnotationNameWhenAnnotationIsNotNull() {
        /* Branches:
         * (annotation != null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //java.lang.annotation.Annotation annotationMock = mock(java.lang.annotation.Annotation.class, "strategyFor_annotation1");
        /*try (MockedStatic<MoreTypes> moreTypes = mockStatic(MoreTypes.class);
    MockedStatic<TypeLiteral> typeLiteral = mockStatic(TypeLiteral.class);
    MockedStatic<Annotations> annotations = mockStatic(Annotations.class)) {
    annotations.when(() -> Annotations.canonicalizeIfNamed(java.lang.annotation.Annotation.class)).thenReturn(Annotation.class);
    annotations.when(() -> Annotations.isAllDefaultMethods(java.lang.annotation.Annotation.class)).thenReturn(true);
    annotations.when(() -> Annotations.generateAnnotation(java.lang.annotation.Annotation.class)).thenReturn(annotationMock);
    annotations.when(() -> Annotations.isRetainedAtRuntime(Object.class)).thenReturn(false);
    annotations.when(() -> Annotations.isBindingAnnotation(Object.class)).thenReturn(false);
    annotations.when(() -> Annotations.isMarker(Object.class)).thenReturn(true);
    typeLiteral.when(() -> TypeLiteral.fromSuperclassTypeParameter(Key.class)).thenReturn(typeLiteralMock2);
    moreTypes.when(() -> MoreTypes.canonicalizeForKey(typeLiteralMock2)).thenReturn(typeLiteralMock);
    Key<Object> target = new Key(java.lang.annotation.Annotation.class);
    //Act Statement(s)
    String result = target.getAnnotationName();
    //Assert statement(s)
    assertThat(result, equalTo("strategyFor_annotation1"));
    annotations.verify(() -> Annotations.canonicalizeIfNamed(java.lang.annotation.Annotation.class), atLeast(1));
    annotations.verify(() -> Annotations.isAllDefaultMethods(java.lang.annotation.Annotation.class), atLeast(1));
    annotations.verify(() -> Annotations.generateAnnotation(java.lang.annotation.Annotation.class), atLeast(1));
    annotations.verify(() -> Annotations.isRetainedAtRuntime(Object.class), atLeast(1));
    annotations.verify(() -> Annotations.isBindingAnnotation(Object.class), atLeast(1));
    annotations.verify(() -> Annotations.isMarker(Object.class), atLeast(1));
    typeLiteral.verify(() -> TypeLiteral.fromSuperclassTypeParameter(Key.class), atLeast(1));
    moreTypes.verify(() -> MoreTypes.canonicalizeForKey(typeLiteralMock2), atLeast(1));
}*/
    }

    //Sapient generated method id: ${434c70a5-580c-379c-9de0-183c862214f0}, hash: C93AE829AD47A25F47D5865C8220D48C
    @Test()
    public void getAnnotationNameWhenAnnotationIsNull() {
        /* Branches:
         * (annotation != null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        /*try (MockedStatic<MoreTypes> moreTypes = mockStatic(MoreTypes.class);
    MockedStatic<TypeLiteral> typeLiteral = mockStatic(TypeLiteral.class);
    MockedStatic<Annotations> annotations = mockStatic(Annotations.class)) {
    annotations.when(() -> Annotations.canonicalizeIfNamed(java.lang.annotation.Annotation.class)).thenReturn(Annotation.class);
    annotations.when(() -> Annotations.isAllDefaultMethods(java.lang.annotation.Annotation.class)).thenReturn(true);
    //TODO: Needs to return real value
    annotations.when(() -> Annotations.generateAnnotation(java.lang.annotation.Annotation.class)).thenReturn(null);
    annotations.when(() -> Annotations.isRetainedAtRuntime(Object.class)).thenReturn(false);
    annotations.when(() -> Annotations.isBindingAnnotation(Object.class)).thenReturn(false);
    annotations.when(() -> Annotations.isMarker(Object.class)).thenReturn(true);
    typeLiteral.when(() -> TypeLiteral.fromSuperclassTypeParameter(Key.class)).thenReturn(typeLiteralMock2);
    moreTypes.when(() -> MoreTypes.canonicalizeForKey(typeLiteralMock2)).thenReturn(typeLiteralMock);
    Key<Object> target = new Key(java.lang.annotation.Annotation.class);
    //Act Statement(s)
    String result = target.getAnnotationName();
    //Assert statement(s)
    assertThat(result, equalTo("java.lang.Object"));
    annotations.verify(() -> Annotations.canonicalizeIfNamed(java.lang.annotation.Annotation.class), atLeast(1));
    annotations.verify(() -> Annotations.isAllDefaultMethods(java.lang.annotation.Annotation.class), atLeast(1));
    annotations.verify(() -> Annotations.generateAnnotation(java.lang.annotation.Annotation.class), atLeast(1));
    annotations.verify(() -> Annotations.isRetainedAtRuntime(Object.class), atLeast(1));
    annotations.verify(() -> Annotations.isBindingAnnotation(Object.class), atLeast(1));
    annotations.verify(() -> Annotations.isMarker(Object.class), atLeast(1));
    typeLiteral.verify(() -> TypeLiteral.fromSuperclassTypeParameter(Key.class), atLeast(1));
    moreTypes.verify(() -> MoreTypes.canonicalizeForKey(typeLiteralMock2), atLeast(1));
}*/
    }

    //Sapient generated method id: ${ad7b65a6-9e61-3f41-909b-f73338704358}, hash: E84F1F26982D9F03E3D66EBC64820728
    @Test()
    public void getRawTypeTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        /*try (MockedStatic<MoreTypes> moreTypes = mockStatic(MoreTypes.class);
    MockedStatic<TypeLiteral> typeLiteral = mockStatic(TypeLiteral.class);
    MockedStatic<Annotations> annotations = mockStatic(Annotations.class)) {
    annotations.when(() -> Annotations.canonicalizeIfNamed(java.lang.annotation.Annotation.class)).thenReturn(Annotation.class);
    annotations.when(() -> Annotations.isAllDefaultMethods(java.lang.annotation.Annotation.class)).thenReturn(true);
    annotations.when(() -> Annotations.generateAnnotation(java.lang.annotation.Annotation.class)).thenReturn(annotationMock);
    annotations.when(() -> Annotations.isRetainedAtRuntime(Object.class)).thenReturn(false);
    annotations.when(() -> Annotations.isBindingAnnotation(Object.class)).thenReturn(false);
    annotations.when(() -> Annotations.isMarker(Object.class)).thenReturn(true);
    typeLiteral.when(() -> TypeLiteral.fromSuperclassTypeParameter(Key.class)).thenReturn(typeLiteralMock2);
    moreTypes.when(() -> MoreTypes.canonicalizeForKey(typeLiteralMock2)).thenReturn(typeLiteralMock);
    Key<Object> target = new Key(java.lang.annotation.Annotation.class);
    doReturn(java.lang.Object.class).when(typeLiteralMock).getRawType();
    //Act Statement(s)
    Class result = target.getRawType();
    //Assert statement(s)
    assertThat(result, equalTo(Object.class));
    annotations.verify(() -> Annotations.canonicalizeIfNamed(java.lang.annotation.Annotation.class), atLeast(1));
    annotations.verify(() -> Annotations.isAllDefaultMethods(java.lang.annotation.Annotation.class), atLeast(1));
    annotations.verify(() -> Annotations.generateAnnotation(java.lang.annotation.Annotation.class), atLeast(1));
    annotations.verify(() -> Annotations.isRetainedAtRuntime(Object.class), atLeast(1));
    annotations.verify(() -> Annotations.isBindingAnnotation(Object.class), atLeast(1));
    annotations.verify(() -> Annotations.isMarker(Object.class), atLeast(1));
    typeLiteral.verify(() -> TypeLiteral.fromSuperclassTypeParameter(Key.class), atLeast(1));
    moreTypes.verify(() -> MoreTypes.canonicalizeForKey(typeLiteralMock2), atLeast(1));
    verify(typeLiteralMock).getRawType();
}*/
    }

    //Sapient generated method id: ${f0fafb4a-d90f-3f2b-8cfd-114229eca8ea}, hash: 93CBB14B5DEB7C5A7F7AC4CDA60100CF
    @Test()
    public void providerKeyTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TypeLiteral<Provider<Object>> typeLiteralMock3 = mock(TypeLiteral.class);
        //Key<Provider<Object>> keyMock = mock(Key.class);
        /*try (MockedStatic<MoreTypes> moreTypes = mockStatic(MoreTypes.class);
    MockedStatic<TypeLiteral> typeLiteral = mockStatic(TypeLiteral.class);
    MockedStatic<Annotations> annotations = mockStatic(Annotations.class)) {
    annotations.when(() -> Annotations.canonicalizeIfNamed(java.lang.annotation.Annotation.class)).thenReturn(Annotation.class);
    annotations.when(() -> Annotations.isAllDefaultMethods(java.lang.annotation.Annotation.class)).thenReturn(true);
    annotations.when(() -> Annotations.generateAnnotation(java.lang.annotation.Annotation.class)).thenReturn(annotationMock);
    annotations.when(() -> Annotations.isRetainedAtRuntime(Object.class)).thenReturn(false);
    annotations.when(() -> Annotations.isBindingAnnotation(Object.class)).thenReturn(false);
    annotations.when(() -> Annotations.isMarker(Object.class)).thenReturn(true);
    typeLiteral.when(() -> TypeLiteral.fromSuperclassTypeParameter(Key.class)).thenReturn(typeLiteralMock2);
    moreTypes.when(() -> MoreTypes.canonicalizeForKey(typeLiteralMock2)).thenReturn(typeLiteralMock);
    Key<Object> target = spy(new Key(java.lang.annotation.Annotation.class));
    doReturn(typeLiteralMock3).when(typeLiteralMock).providerType();
    doReturn(keyMock).when(target).ofType(typeLiteralMock3);
    //Act Statement(s)
    Key<Provider<Object>> result = target.providerKey();
    //Assert statement(s)
    assertThat(result, equalTo(keyMock));
    annotations.verify(() -> Annotations.canonicalizeIfNamed(java.lang.annotation.Annotation.class), atLeast(1));
    annotations.verify(() -> Annotations.isAllDefaultMethods(java.lang.annotation.Annotation.class), atLeast(1));
    annotations.verify(() -> Annotations.generateAnnotation(java.lang.annotation.Annotation.class), atLeast(1));
    annotations.verify(() -> Annotations.isRetainedAtRuntime(Object.class), atLeast(1));
    annotations.verify(() -> Annotations.isBindingAnnotation(Object.class), atLeast(1));
    annotations.verify(() -> Annotations.isMarker(Object.class), atLeast(1));
    typeLiteral.verify(() -> TypeLiteral.fromSuperclassTypeParameter(Key.class), atLeast(1));
    moreTypes.verify(() -> MoreTypes.canonicalizeForKey(typeLiteralMock2), atLeast(1));
    verify(typeLiteralMock).providerType();
    verify(target).ofType(typeLiteralMock3);
}*/
    }

    //Sapient generated method id: ${a466e02d-296c-3ead-915f-328423c3c33c}, hash: F35E434588C30C9F0AB342BAE703EEAB
    @Test()
    public void toStringWhenLocalIsNull() {
        /* Branches:
         * (local == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<MoreTypes> moreTypes = mockStatic(MoreTypes.class);
             MockedStatic<TypeLiteral> typeLiteral = mockStatic(TypeLiteral.class);
             MockedStatic<Annotations> annotations = mockStatic(Annotations.class)) {
            annotations.when(() -> Annotations.canonicalizeIfNamed(java.lang.annotation.Annotation.class)).thenReturn(Annotation.class);
            annotations.when(() -> Annotations.isAllDefaultMethods(java.lang.annotation.Annotation.class)).thenReturn(true);
            annotations.when(() -> Annotations.generateAnnotation(java.lang.annotation.Annotation.class)).thenReturn(annotationMock);
            annotations.when(() -> Annotations.isRetainedAtRuntime(Object.class)).thenReturn(false);
            annotations.when(() -> Annotations.isBindingAnnotation(Object.class)).thenReturn(false);
            annotations.when(() -> Annotations.isMarker(Object.class)).thenReturn(true);
            typeLiteral.when(() -> TypeLiteral.fromSuperclassTypeParameter(Key.class)).thenReturn(typeLiteralMock2);
            moreTypes.when(() -> MoreTypes.canonicalizeForKey(typeLiteralMock2)).thenReturn(typeLiteralMock);
            Key<Object> target = new Key(java.lang.annotation.Annotation.class);
            //Act Statement(s)
            String result = target.toString();
            //Assert statement(s)
            assertThat(result, equalTo("Key[type=<init>_typeLiteral2, annotation=]"));
            annotations.verify(() -> Annotations.canonicalizeIfNamed(java.lang.annotation.Annotation.class), atLeast(1));
            annotations.verify(() -> Annotations.isAllDefaultMethods(java.lang.annotation.Annotation.class), atLeast(1));
            annotations.verify(() -> Annotations.generateAnnotation(java.lang.annotation.Annotation.class), atLeast(1));
            annotations.verify(() -> Annotations.isRetainedAtRuntime(Object.class), atLeast(1));
            annotations.verify(() -> Annotations.isBindingAnnotation(Object.class), atLeast(1));
            annotations.verify(() -> Annotations.isMarker(Object.class), atLeast(1));
            typeLiteral.verify(() -> TypeLiteral.fromSuperclassTypeParameter(Key.class), atLeast(1));
            moreTypes.verify(() -> MoreTypes.canonicalizeForKey(typeLiteralMock2), atLeast(1));
        }
    }

    //Sapient generated method id: ${fa77ec73-5d5e-3732-b683-af7decc28622}, hash: C00AAD592951777D00CB2730A41B1E4D
    @Test()
    public void get1Test() {

        //Act Statement(s)
        Key result = Key.get(Object.class);

        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${f91f2aed-7f5a-319b-98be-57aee8abb063}, hash: 93E645A062382963E930285BA38BDB0C
    @Test()
    public void get2Test() {
        //Arrange Statement(s)
        TypeLiteral typeLiteralMock2 = mock(TypeLiteral.class, "TypeLiteral");
        try (MockedStatic<MoreTypes> moreTypes = mockStatic(MoreTypes.class);
             MockedStatic<TypeLiteral> typeLiteral = mockStatic(TypeLiteral.class);
             MockedStatic<Key> key = mockStatic(Key.class, CALLS_REAL_METHODS)) {
            key.when(() -> Key.strategyFor(java.lang.annotation.Annotation.class)).thenReturn(keyAnnotationStrategyMock);
            typeLiteral.when(() -> TypeLiteral.get(Object.class)).thenReturn(typeLiteralMock2);
            moreTypes.when(() -> MoreTypes.canonicalizeForKey(typeLiteralMock2)).thenReturn(typeLiteralMock);
            //Act Statement(s)
            Key result = Key.get(Object.class, java.lang.annotation.Annotation.class);
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            key.verify(() -> Key.strategyFor(java.lang.annotation.Annotation.class), atLeast(1));
            typeLiteral.verify(() -> TypeLiteral.get(Object.class), atLeast(1));
            moreTypes.verify(() -> MoreTypes.canonicalizeForKey(typeLiteralMock2), atLeast(1));
        }
    }

    //Sapient generated method id: ${56b94b6a-fcdd-30bc-99fe-466780af1a26}, hash: 18BC66E6FE19A4754F669F2F260E0849
    @Test()
    public void get3Test() {
        //Arrange Statement(s)
        TypeLiteral typeLiteralMock2 = mock(TypeLiteral.class, "TypeLiteral");
        try (MockedStatic<MoreTypes> moreTypes = mockStatic(MoreTypes.class);
             MockedStatic<TypeLiteral> typeLiteral = mockStatic(TypeLiteral.class);
             MockedStatic<Key> key = mockStatic(Key.class, CALLS_REAL_METHODS)) {
            key.when(() -> Key.strategyFor(annotationMock)).thenReturn(keyAnnotationStrategyMock);
            typeLiteral.when(() -> TypeLiteral.get(Object.class)).thenReturn(typeLiteralMock2);
            moreTypes.when(() -> MoreTypes.canonicalizeForKey(typeLiteralMock2)).thenReturn(typeLiteralMock);
            //Act Statement(s)
            Key result = Key.get(Object.class, annotationMock);
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            key.verify(() -> Key.strategyFor(annotationMock), atLeast(1));
            typeLiteral.verify(() -> TypeLiteral.get(Object.class), atLeast(1));
            moreTypes.verify(() -> MoreTypes.canonicalizeForKey(typeLiteralMock2), atLeast(1));
        }
    }

    //Sapient generated method id: ${ec3fd035-36cb-3c58-8ede-bcbba024507f}, hash: 3C7D5A1B7FD2A51222F18A9380F628EF
    @Test()
    public void get4Test() {
        //Arrange Statement(s)
        TypeLiteral typeLiteralMock2 = mock(TypeLiteral.class, "TypeLiteral");
        Type typeMock = mock(Type.class, "Type");
        try (MockedStatic<MoreTypes> moreTypes = mockStatic(MoreTypes.class);
             MockedStatic<TypeLiteral> typeLiteral = mockStatic(TypeLiteral.class)) {
            typeLiteral.when(() -> TypeLiteral.get(typeMock)).thenReturn(typeLiteralMock2);
            moreTypes.when(() -> MoreTypes.canonicalizeForKey(typeLiteralMock2)).thenReturn(typeLiteralMock);
            //Act Statement(s)
            Key result = Key.get(typeMock);
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            typeLiteral.verify(() -> TypeLiteral.get(typeMock), atLeast(1));
            moreTypes.verify(() -> MoreTypes.canonicalizeForKey(typeLiteralMock2), atLeast(1));
        }
    }

    //Sapient generated method id: ${6fd3c204-af77-3e78-af16-d0fda738a9f3}, hash: 904E899741BEFE5C0E0D0C1CBED704A3
    @Test()
    public void get5Test() {
        //Arrange Statement(s)
        TypeLiteral typeLiteralMock2 = mock(TypeLiteral.class, "TypeLiteral");
        try (MockedStatic<MoreTypes> moreTypes = mockStatic(MoreTypes.class);
             MockedStatic<TypeLiteral> typeLiteral = mockStatic(TypeLiteral.class);
             MockedStatic<Key> key = mockStatic(Key.class, CALLS_REAL_METHODS)) {
            key.when(() -> Key.strategyFor(java.lang.annotation.Annotation.class)).thenReturn(keyAnnotationStrategyMock);
            typeLiteral.when(() -> TypeLiteral.get(typeMock)).thenReturn(typeLiteralMock2);
            moreTypes.when(() -> MoreTypes.canonicalizeForKey(typeLiteralMock2)).thenReturn(typeLiteralMock);
            //Act Statement(s)
            Key result = Key.get(typeMock, java.lang.annotation.Annotation.class);
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            key.verify(() -> Key.strategyFor(java.lang.annotation.Annotation.class), atLeast(1));
            typeLiteral.verify(() -> TypeLiteral.get(typeMock), atLeast(1));
            moreTypes.verify(() -> MoreTypes.canonicalizeForKey(typeLiteralMock2), atLeast(1));
        }
    }

    //Sapient generated method id: ${3003cb3f-6681-34d2-acfb-4044be836880}, hash: 41BDB1E545461955291768E444282E21
    @Test()
    public void get6Test() {
        //Arrange Statement(s)
        TypeLiteral typeLiteralMock2 = mock(TypeLiteral.class, "TypeLiteral");
        Type typeMock = mock(Type.class, "TypeLiteral");
        try (MockedStatic<MoreTypes> moreTypes = mockStatic(MoreTypes.class);
             MockedStatic<TypeLiteral> typeLiteral = mockStatic(TypeLiteral.class);
             MockedStatic<Key> key = mockStatic(Key.class, CALLS_REAL_METHODS)) {
            key.when(() -> Key.strategyFor(annotationMock)).thenReturn(keyAnnotationStrategyMock);
            typeLiteral.when(() -> TypeLiteral.get(typeMock)).thenReturn(typeLiteralMock2);
            moreTypes.when(() -> MoreTypes.canonicalizeForKey(typeLiteralMock2)).thenReturn(typeLiteralMock);
            //Act Statement(s)
            Key result = Key.get(typeMock, annotationMock);
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            key.verify(() -> Key.strategyFor(annotationMock), atLeast(1));
            typeLiteral.verify(() -> TypeLiteral.get(typeMock), atLeast(1));
            moreTypes.verify(() -> MoreTypes.canonicalizeForKey(typeLiteralMock2), atLeast(1));
        }
    }

    //Sapient generated method id: ${25562848-72a5-3a4e-81b7-64e060432e6b}, hash: A79A2385EFCAB1B9D21641BEBE11146B
    @Test()
    public void get7Test() {
        //Arrange Statement(s)
        TypeLiteral<Object> typeLiteralMock2 = mock(TypeLiteral.class);
        try (MockedStatic<MoreTypes> moreTypes = mockStatic(MoreTypes.class)) {
            moreTypes.when(() -> MoreTypes.canonicalizeForKey((TypeLiteral) any())).thenReturn(typeLiteralMock2);
            TypeLiteral typeLiteral = TypeLiteral.get(Object.class);
            //Act Statement(s)
            Key result = Key.get(typeLiteral);
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            moreTypes.verify(() -> MoreTypes.canonicalizeForKey((TypeLiteral) any()));
        }
    }

    //Sapient generated method id: ${ea0070b1-aefb-36ab-983d-ee757e4fda7f}, hash: 64E35C1CDFA0921FED56754237501832
    @Test()
    public void get8Test() {
        //Arrange Statement(s)
        TypeLiteral<Object> typeLiteralMock2 = mock(TypeLiteral.class);
        try (MockedStatic<MoreTypes> moreTypes = mockStatic(MoreTypes.class);
             MockedStatic<Key> key = mockStatic(Key.class, CALLS_REAL_METHODS)) {
            key.when(() -> Key.strategyFor(java.lang.annotation.Annotation.class)).thenReturn(keyAnnotationStrategyMock);
            moreTypes.when(() -> MoreTypes.canonicalizeForKey((TypeLiteral) any())).thenReturn(typeLiteralMock2);
            TypeLiteral typeLiteral = TypeLiteral.get(Object.class);
            //Act Statement(s)
            Key result = Key.get(typeLiteral, java.lang.annotation.Annotation.class);
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            key.verify(() -> Key.strategyFor(java.lang.annotation.Annotation.class), atLeast(1));
            moreTypes.verify(() -> MoreTypes.canonicalizeForKey((TypeLiteral) any()), atLeast(1));
        }
    }

    //Sapient generated method id: ${68d4729f-9ead-3032-afed-5afe57f90859}, hash: AF9E06DE9D1343AD33EEDB990C0ADE59
    @Test()
    public void get9Test() {
        //Arrange Statement(s)
        java.lang.annotation.Annotation annotationMock = mock(java.lang.annotation.Annotation.class, "Annotation");
        TypeLiteral<Object> typeLiteralMock2 = mock(TypeLiteral.class);
        try (MockedStatic<MoreTypes> moreTypes = mockStatic(MoreTypes.class);
             MockedStatic<Key> key = mockStatic(Key.class, CALLS_REAL_METHODS)) {
            key.when(() -> Key.strategyFor(annotationMock)).thenReturn(keyAnnotationStrategyMock);
            moreTypes.when(() -> MoreTypes.canonicalizeForKey((TypeLiteral) any())).thenReturn(typeLiteralMock2);
            TypeLiteral typeLiteral = TypeLiteral.get(Object.class);
            //Act Statement(s)
            Key result = Key.get(typeLiteral, annotationMock);
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            key.verify(() -> Key.strategyFor(annotationMock), atLeast(1));
            moreTypes.verify(() -> MoreTypes.canonicalizeForKey((TypeLiteral) any()), atLeast(1));
        }
    }

    //Sapient generated method id: ${ceb9cf37-7f00-3ca7-b685-a9ca14960925}, hash: 273C17594F41F12CBFEA038905D2B2E9
    @Test()
    public void ofTypeTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<MoreTypes> moreTypes = mockStatic(MoreTypes.class);
             MockedStatic<TypeLiteral> typeLiteral = mockStatic(TypeLiteral.class);
             MockedStatic<Annotations> annotations = mockStatic(Annotations.class)) {
            annotations.when(() -> Annotations.canonicalizeIfNamed(java.lang.annotation.Annotation.class)).thenReturn(Annotation.class);
            annotations.when(() -> Annotations.isAllDefaultMethods(java.lang.annotation.Annotation.class)).thenReturn(true);
            annotations.when(() -> Annotations.generateAnnotation(java.lang.annotation.Annotation.class)).thenReturn(annotationMock);
            annotations.when(() -> Annotations.isRetainedAtRuntime(Object.class)).thenReturn(false);
            annotations.when(() -> Annotations.isBindingAnnotation(Object.class)).thenReturn(false);
            annotations.when(() -> Annotations.isMarker(Object.class)).thenReturn(true);
            typeLiteral.when(() -> TypeLiteral.fromSuperclassTypeParameter(Key.class)).thenReturn(typeLiteralMock2);
            moreTypes.when(() -> MoreTypes.canonicalizeForKey(typeLiteralMock2)).thenReturn(typeLiteralMock);
            typeLiteral.when(() -> TypeLiteral.get(Object.class)).thenReturn(typeLiteralMock3);
            moreTypes.when(() -> MoreTypes.canonicalizeForKey(typeLiteralMock3)).thenReturn(typeLiteralMock4);
            Key<Object> target = new Key(java.lang.annotation.Annotation.class);
            //Act Statement(s)
            Key result = target.ofType(Object.class);
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            annotations.verify(() -> Annotations.canonicalizeIfNamed(java.lang.annotation.Annotation.class), atLeast(1));
            annotations.verify(() -> Annotations.isAllDefaultMethods(java.lang.annotation.Annotation.class), atLeast(1));
            annotations.verify(() -> Annotations.generateAnnotation(java.lang.annotation.Annotation.class), atLeast(1));
            annotations.verify(() -> Annotations.isRetainedAtRuntime(Object.class), atLeast(1));
            annotations.verify(() -> Annotations.isBindingAnnotation(Object.class), atLeast(1));
            annotations.verify(() -> Annotations.isMarker(Object.class), atLeast(1));
            typeLiteral.verify(() -> TypeLiteral.fromSuperclassTypeParameter(Key.class), atLeast(1));
            moreTypes.verify(() -> MoreTypes.canonicalizeForKey(typeLiteralMock2), atLeast(1));
            typeLiteral.verify(() -> TypeLiteral.get(Object.class), atLeast(1));
            moreTypes.verify(() -> MoreTypes.canonicalizeForKey(typeLiteralMock3), atLeast(1));
        }
    }

    //Sapient generated method id: ${762641de-aaec-3817-bb92-0ecf43bef015}, hash: 98151938C1F2396BBCC8F606149B847E
    @Test()
    public void ofType1Test() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<MoreTypes> moreTypes = mockStatic(MoreTypes.class);
             MockedStatic<TypeLiteral> typeLiteral = mockStatic(TypeLiteral.class);
             MockedStatic<Annotations> annotations = mockStatic(Annotations.class)) {
            annotations.when(() -> Annotations.canonicalizeIfNamed(java.lang.annotation.Annotation.class)).thenReturn(Annotation.class);
            annotations.when(() -> Annotations.isAllDefaultMethods(java.lang.annotation.Annotation.class)).thenReturn(true);
            annotations.when(() -> Annotations.generateAnnotation(java.lang.annotation.Annotation.class)).thenReturn(annotationMock);
            annotations.when(() -> Annotations.isRetainedAtRuntime(Object.class)).thenReturn(false);
            annotations.when(() -> Annotations.isBindingAnnotation(Object.class)).thenReturn(false);
            annotations.when(() -> Annotations.isMarker(Object.class)).thenReturn(true);
            typeLiteral.when(() -> TypeLiteral.fromSuperclassTypeParameter(Key.class)).thenReturn(typeLiteralMock2);
            moreTypes.when(() -> MoreTypes.canonicalizeForKey(typeLiteralMock2)).thenReturn(typeLiteralMock);
            typeLiteral.when(() -> TypeLiteral.get(typeMock)).thenReturn(typeLiteralMock3);
            moreTypes.when(() -> MoreTypes.canonicalizeForKey(typeLiteralMock3)).thenReturn(typeLiteralMock4);
            Key<Object> target = new Key(java.lang.annotation.Annotation.class);
            //Act Statement(s)
            Key result = target.ofType(typeMock);
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            annotations.verify(() -> Annotations.canonicalizeIfNamed(java.lang.annotation.Annotation.class), atLeast(1));
            annotations.verify(() -> Annotations.isAllDefaultMethods(java.lang.annotation.Annotation.class), atLeast(1));
            annotations.verify(() -> Annotations.generateAnnotation(java.lang.annotation.Annotation.class), atLeast(1));
            annotations.verify(() -> Annotations.isRetainedAtRuntime(Object.class), atLeast(1));
            annotations.verify(() -> Annotations.isBindingAnnotation(Object.class), atLeast(1));
            annotations.verify(() -> Annotations.isMarker(Object.class), atLeast(1));
            typeLiteral.verify(() -> TypeLiteral.fromSuperclassTypeParameter(Key.class), atLeast(1));
            moreTypes.verify(() -> MoreTypes.canonicalizeForKey(typeLiteralMock2), atLeast(1));
            typeLiteral.verify(() -> TypeLiteral.get(typeMock), atLeast(1));
            moreTypes.verify(() -> MoreTypes.canonicalizeForKey(typeLiteralMock3), atLeast(1));
        }
    }

    //Sapient generated method id: ${fcfd9b71-e930-30a1-a25d-a0c2e12d03a4}, hash: 641721D5E4EC0BD9AFC8C240A05997C9
    @Test()
    public void ofType2Test() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TypeLiteral<Object> typeLiteralMock3 = mock(TypeLiteral.class);
        try (MockedStatic<MoreTypes> moreTypes = mockStatic(MoreTypes.class);
             MockedStatic<TypeLiteral> typeLiteral = mockStatic(TypeLiteral.class);
             MockedStatic<Annotations> annotations = mockStatic(Annotations.class)) {
            annotations.when(() -> Annotations.canonicalizeIfNamed(java.lang.annotation.Annotation.class)).thenReturn(Annotation.class);
            annotations.when(() -> Annotations.isAllDefaultMethods(java.lang.annotation.Annotation.class)).thenReturn(true);
            annotations.when(() -> Annotations.generateAnnotation(java.lang.annotation.Annotation.class)).thenReturn(annotationMock);
            annotations.when(() -> Annotations.isRetainedAtRuntime(Object.class)).thenReturn(false);
            annotations.when(() -> Annotations.isBindingAnnotation(Object.class)).thenReturn(false);
            annotations.when(() -> Annotations.isMarker(Object.class)).thenReturn(true);
            typeLiteral.when(() -> TypeLiteral.fromSuperclassTypeParameter(Key.class)).thenReturn(typeLiteralMock2);
            moreTypes.when(() -> MoreTypes.canonicalizeForKey(typeLiteralMock2)).thenReturn(typeLiteralMock);
            moreTypes.when(() -> MoreTypes.canonicalizeForKey(typeLiteralMock4)).thenReturn(typeLiteralMock3);
            Key<Object> target = new Key(java.lang.annotation.Annotation.class);
            //Act Statement(s)
            Key result = target.ofType(typeLiteralMock4);
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            annotations.verify(() -> Annotations.canonicalizeIfNamed(java.lang.annotation.Annotation.class), atLeast(1));
            annotations.verify(() -> Annotations.isAllDefaultMethods(java.lang.annotation.Annotation.class), atLeast(1));
            annotations.verify(() -> Annotations.generateAnnotation(java.lang.annotation.Annotation.class), atLeast(1));
            annotations.verify(() -> Annotations.isRetainedAtRuntime(Object.class), atLeast(1));
            annotations.verify(() -> Annotations.isBindingAnnotation(Object.class), atLeast(1));
            annotations.verify(() -> Annotations.isMarker(Object.class), atLeast(1));
            typeLiteral.verify(() -> TypeLiteral.fromSuperclassTypeParameter(Key.class), atLeast(1));
            moreTypes.verify(() -> MoreTypes.canonicalizeForKey(typeLiteralMock2), atLeast(1));
            moreTypes.verify(() -> MoreTypes.canonicalizeForKey(typeLiteralMock4), atLeast(1));
        }
    }

    //Sapient generated method id: ${e3489a42-4524-3908-acad-349fa78a9ed1}, hash: 246E6D1A8B1518C32E5955D3ABEA51DA
    @Test()
    public void withAnnotationTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TypeLiteral<Object> typeLiteralMock3 = mock(TypeLiteral.class);
        try (MockedStatic<MoreTypes> moreTypes = mockStatic(MoreTypes.class);
             MockedStatic<Key> key = mockStatic(Key.class, CALLS_REAL_METHODS);
             MockedStatic<TypeLiteral> typeLiteral = mockStatic(TypeLiteral.class);
             MockedStatic<Annotations> annotations = mockStatic(Annotations.class)) {
            annotations.when(() -> Annotations.canonicalizeIfNamed(java.lang.annotation.Annotation.class)).thenReturn(Annotation.class);
            annotations.when(() -> Annotations.isAllDefaultMethods(java.lang.annotation.Annotation.class)).thenReturn(true);
            annotations.when(() -> Annotations.generateAnnotation(java.lang.annotation.Annotation.class)).thenReturn(annotationMock);
            annotations.when(() -> Annotations.isRetainedAtRuntime(Object.class)).thenReturn(false);
            annotations.when(() -> Annotations.isBindingAnnotation(Object.class)).thenReturn(false);
            annotations.when(() -> Annotations.isMarker(Object.class)).thenReturn(true);
            typeLiteral.when(() -> TypeLiteral.fromSuperclassTypeParameter(Key.class)).thenReturn(typeLiteralMock2);
            moreTypes.when(() -> MoreTypes.canonicalizeForKey(typeLiteralMock2)).thenReturn(typeLiteralMock);
            key.when(() -> Key.strategyFor(java.lang.annotation.Annotation.class)).thenReturn(keyAnnotationStrategyMock);
            moreTypes.when(() -> MoreTypes.canonicalizeForKey(typeLiteralMock)).thenReturn(typeLiteralMock3);
            Key<Object> target = new Key(java.lang.annotation.Annotation.class);
            //Act Statement(s)
            Key result = target.withAnnotation(java.lang.annotation.Annotation.class);
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            annotations.verify(() -> Annotations.canonicalizeIfNamed(java.lang.annotation.Annotation.class), atLeast(1));
            annotations.verify(() -> Annotations.isAllDefaultMethods(java.lang.annotation.Annotation.class), atLeast(1));
            annotations.verify(() -> Annotations.generateAnnotation(java.lang.annotation.Annotation.class), atLeast(1));
            annotations.verify(() -> Annotations.isRetainedAtRuntime(Object.class), atLeast(1));
            annotations.verify(() -> Annotations.isBindingAnnotation(Object.class), atLeast(1));
            annotations.verify(() -> Annotations.isMarker(Object.class), atLeast(1));
            typeLiteral.verify(() -> TypeLiteral.fromSuperclassTypeParameter(Key.class), atLeast(1));
            moreTypes.verify(() -> MoreTypes.canonicalizeForKey(typeLiteralMock2), atLeast(1));
            key.verify(() -> Key.strategyFor(java.lang.annotation.Annotation.class), atLeast(1));
            moreTypes.verify(() -> MoreTypes.canonicalizeForKey(typeLiteralMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${c500d4e1-5aab-3206-87d6-1c4daf84913a}, hash: EEF3771CBDFE34231846FA17C6A32F16
    @Test()
    public void withAnnotation1Test() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TypeLiteral<Object> typeLiteralMock3 = mock(TypeLiteral.class);
        try (MockedStatic<MoreTypes> moreTypes = mockStatic(MoreTypes.class);
             MockedStatic<Key> key = mockStatic(Key.class, CALLS_REAL_METHODS);
             MockedStatic<TypeLiteral> typeLiteral = mockStatic(TypeLiteral.class);
             MockedStatic<Annotations> annotations = mockStatic(Annotations.class)) {
            annotations.when(() -> Annotations.canonicalizeIfNamed(java.lang.annotation.Annotation.class)).thenReturn(Annotation.class);
            annotations.when(() -> Annotations.isAllDefaultMethods(java.lang.annotation.Annotation.class)).thenReturn(true);
            annotations.when(() -> Annotations.generateAnnotation(java.lang.annotation.Annotation.class)).thenReturn(annotationMock);
            annotations.when(() -> Annotations.isRetainedAtRuntime(Object.class)).thenReturn(false);
            annotations.when(() -> Annotations.isBindingAnnotation(Object.class)).thenReturn(false);
            annotations.when(() -> Annotations.isMarker(Object.class)).thenReturn(true);
            typeLiteral.when(() -> TypeLiteral.fromSuperclassTypeParameter(Key.class)).thenReturn(typeLiteralMock2);
            moreTypes.when(() -> MoreTypes.canonicalizeForKey(typeLiteralMock2)).thenReturn(typeLiteralMock);
            key.when(() -> Key.strategyFor(annotationMock2)).thenReturn(keyAnnotationStrategyMock);
            moreTypes.when(() -> MoreTypes.canonicalizeForKey(typeLiteralMock)).thenReturn(typeLiteralMock3);
            Key<Object> target = new Key(java.lang.annotation.Annotation.class);
            //Act Statement(s)
            Key result = target.withAnnotation(annotationMock2);
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            annotations.verify(() -> Annotations.canonicalizeIfNamed(java.lang.annotation.Annotation.class), atLeast(1));
            annotations.verify(() -> Annotations.isAllDefaultMethods(java.lang.annotation.Annotation.class), atLeast(1));
            annotations.verify(() -> Annotations.generateAnnotation(java.lang.annotation.Annotation.class), atLeast(1));
            annotations.verify(() -> Annotations.isRetainedAtRuntime(Object.class), atLeast(1));
            annotations.verify(() -> Annotations.isBindingAnnotation(Object.class), atLeast(1));
            annotations.verify(() -> Annotations.isMarker(Object.class), atLeast(1));
            typeLiteral.verify(() -> TypeLiteral.fromSuperclassTypeParameter(Key.class), atLeast(1));
            moreTypes.verify(() -> MoreTypes.canonicalizeForKey(typeLiteralMock2), atLeast(1));
            key.verify(() -> Key.strategyFor(annotationMock2), atLeast(1));
            moreTypes.verify(() -> MoreTypes.canonicalizeForKey(typeLiteralMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${2713e8ae-4ee9-39f9-b7f5-961dd3bbd1a1}, hash: 7EC7E8E7465677EE6DF5BBB378C60DCE
    @Test()
    public void hasAttributesWhenAnnotationStrategyHasAttributes() {
        /* Branches:
         * (annotationStrategy.hasAttributes()) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: annotationStrategy
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<MoreTypes> moreTypes = mockStatic(MoreTypes.class);
             MockedStatic<TypeLiteral> typeLiteral = mockStatic(TypeLiteral.class);
             MockedStatic<Annotations> annotations = mockStatic(Annotations.class)) {
            annotations.when(() -> Annotations.canonicalizeIfNamed(java.lang.annotation.Annotation.class)).thenReturn(Annotation.class);
            annotations.when(() -> Annotations.isAllDefaultMethods(java.lang.annotation.Annotation.class)).thenReturn(true);
            annotations.when(() -> Annotations.generateAnnotation(java.lang.annotation.Annotation.class)).thenReturn(annotationMock);
            annotations.when(() -> Annotations.isRetainedAtRuntime(Object.class)).thenReturn(false);
            annotations.when(() -> Annotations.isBindingAnnotation(Object.class)).thenReturn(false);
            annotations.when(() -> Annotations.isMarker(Object.class)).thenReturn(true);
            typeLiteral.when(() -> TypeLiteral.fromSuperclassTypeParameter(Key.class)).thenReturn(typeLiteralMock2);
            moreTypes.when(() -> MoreTypes.canonicalizeForKey(typeLiteralMock2)).thenReturn(typeLiteralMock);
            Key<Object> target = new Key(java.lang.annotation.Annotation.class);
            //Act Statement(s)
            boolean result = target.hasAttributes();
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            annotations.verify(() -> Annotations.canonicalizeIfNamed(java.lang.annotation.Annotation.class), atLeast(1));
            annotations.verify(() -> Annotations.isAllDefaultMethods(java.lang.annotation.Annotation.class), atLeast(1));
            annotations.verify(() -> Annotations.generateAnnotation(java.lang.annotation.Annotation.class), atLeast(1));
            annotations.verify(() -> Annotations.isRetainedAtRuntime(Object.class), atLeast(1));
            annotations.verify(() -> Annotations.isBindingAnnotation(Object.class), atLeast(1));
            annotations.verify(() -> Annotations.isMarker(Object.class), atLeast(1));
            typeLiteral.verify(() -> TypeLiteral.fromSuperclassTypeParameter(Key.class), atLeast(1));
            moreTypes.verify(() -> MoreTypes.canonicalizeForKey(typeLiteralMock2), atLeast(1));
        }
    }

    //Sapient generated method id: ${90d15bc4-b8f4-330c-b07b-d4dd216e7963}, hash: CF26110761DBD93653E9BBCCB47EE6FC
    @Test()
    public void hasAttributesWhenAnnotationStrategyNotHasAttributes() {
        /* Branches:
         * (annotationStrategy.hasAttributes()) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: annotationStrategy
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<MoreTypes> moreTypes = mockStatic(MoreTypes.class);
             MockedStatic<TypeLiteral> typeLiteral = mockStatic(TypeLiteral.class);
             MockedStatic<Annotations> annotations = mockStatic(Annotations.class)) {
            annotations.when(() -> Annotations.canonicalizeIfNamed(java.lang.annotation.Annotation.class)).thenReturn(Annotation.class);
            annotations.when(() -> Annotations.isAllDefaultMethods(java.lang.annotation.Annotation.class)).thenReturn(true);
            annotations.when(() -> Annotations.generateAnnotation(java.lang.annotation.Annotation.class)).thenReturn(annotationMock);
            annotations.when(() -> Annotations.isRetainedAtRuntime(Object.class)).thenReturn(false);
            annotations.when(() -> Annotations.isBindingAnnotation(Object.class)).thenReturn(false);
            annotations.when(() -> Annotations.isMarker(Object.class)).thenReturn(true);
            typeLiteral.when(() -> TypeLiteral.fromSuperclassTypeParameter(Key.class)).thenReturn(typeLiteralMock2);
            moreTypes.when(() -> MoreTypes.canonicalizeForKey(typeLiteralMock2)).thenReturn(typeLiteralMock);
            Key<Object> target = new Key(java.lang.annotation.Annotation.class);
            //Act Statement(s)
            boolean result = target.hasAttributes();
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            annotations.verify(() -> Annotations.canonicalizeIfNamed(java.lang.annotation.Annotation.class), atLeast(1));
            annotations.verify(() -> Annotations.isAllDefaultMethods(java.lang.annotation.Annotation.class), atLeast(1));
            annotations.verify(() -> Annotations.generateAnnotation(java.lang.annotation.Annotation.class), atLeast(1));
            annotations.verify(() -> Annotations.isRetainedAtRuntime(Object.class), atLeast(1));
            annotations.verify(() -> Annotations.isBindingAnnotation(Object.class), atLeast(1));
            annotations.verify(() -> Annotations.isMarker(Object.class), atLeast(1));
            typeLiteral.verify(() -> TypeLiteral.fromSuperclassTypeParameter(Key.class), atLeast(1));
            moreTypes.verify(() -> MoreTypes.canonicalizeForKey(typeLiteralMock2), atLeast(1));
        }
    }

    //Sapient generated method id: ${8920d1e3-4e0e-3b7a-ab9f-e8422e304c7e}, hash: 0E023BB4113AF45E652DE1B154B12349
    @Test()
    public void withoutAttributesTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: annotationStrategy
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TypeLiteral<Object> typeLiteralMock3 = mock(TypeLiteral.class);
        try (MockedStatic<MoreTypes> moreTypes = mockStatic(MoreTypes.class);
             MockedStatic<TypeLiteral> typeLiteral = mockStatic(TypeLiteral.class);
             MockedStatic<Annotations> annotations = mockStatic(Annotations.class)) {
            annotations.when(() -> Annotations.canonicalizeIfNamed(java.lang.annotation.Annotation.class)).thenReturn(Annotation.class);
            annotations.when(() -> Annotations.isAllDefaultMethods(java.lang.annotation.Annotation.class)).thenReturn(true);
            annotations.when(() -> Annotations.generateAnnotation(java.lang.annotation.Annotation.class)).thenReturn(annotationMock);
            annotations.when(() -> Annotations.isRetainedAtRuntime(Object.class)).thenReturn(false);
            annotations.when(() -> Annotations.isBindingAnnotation(Object.class)).thenReturn(false);
            annotations.when(() -> Annotations.isMarker(Object.class)).thenReturn(true);
            typeLiteral.when(() -> TypeLiteral.fromSuperclassTypeParameter(Key.class)).thenReturn(typeLiteralMock2);
            moreTypes.when(() -> MoreTypes.canonicalizeForKey(typeLiteralMock2)).thenReturn(typeLiteralMock);
            moreTypes.when(() -> MoreTypes.canonicalizeForKey(typeLiteralMock)).thenReturn(typeLiteralMock3);
            Key<Object> target = new Key(java.lang.annotation.Annotation.class);
            //Act Statement(s)
            Key result = target.withoutAttributes();
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            annotations.verify(() -> Annotations.canonicalizeIfNamed(java.lang.annotation.Annotation.class), atLeast(1));
            annotations.verify(() -> Annotations.isAllDefaultMethods(java.lang.annotation.Annotation.class), atLeast(1));
            annotations.verify(() -> Annotations.generateAnnotation(java.lang.annotation.Annotation.class), atLeast(1));
            annotations.verify(() -> Annotations.isRetainedAtRuntime(Object.class), atLeast(1));
            annotations.verify(() -> Annotations.isBindingAnnotation(Object.class), atLeast(1));
            annotations.verify(() -> Annotations.isMarker(Object.class), atLeast(1));
            typeLiteral.verify(() -> TypeLiteral.fromSuperclassTypeParameter(Key.class), atLeast(1));
            moreTypes.verify(() -> MoreTypes.canonicalizeForKey(typeLiteralMock2), atLeast(1));
            moreTypes.verify(() -> MoreTypes.canonicalizeForKey(typeLiteralMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${63257d8a-5117-3244-b4cd-5efa77bdb1e5}, hash: 667EECA9914245A17F8E96453A4205B6
    @Test()
    public void strategyForWhenAnnotationsIsMarkerAnnotationType() {
        /* Branches:
         * (Annotations.isMarker(annotationType)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Annotations> annotations = mockStatic(Annotations.class)) {
            annotations.when(() -> Annotations.isRetainedAtRuntime(Object.class)).thenReturn(false);
            annotations.when(() -> Annotations.isBindingAnnotation(Object.class)).thenReturn(false);
            annotations.when(() -> Annotations.isMarker(Object.class)).thenReturn(true);
            //Act Statement(s)
            Key.AnnotationStrategy result = Key.strategyFor(annotationMock);
            Key.AnnotationTypeStrategy keyAnnotationTypeStrategy = new Key.AnnotationTypeStrategy(Object.class, annotationMock);
            //Assert statement(s)
            assertThat(result, equalTo(keyAnnotationTypeStrategy));
            annotations.verify(() -> Annotations.isRetainedAtRuntime(Object.class), atLeast(1));
            annotations.verify(() -> Annotations.isBindingAnnotation(Object.class), atLeast(1));
            annotations.verify(() -> Annotations.isMarker(Object.class), atLeast(1));
        }
    }

    //Sapient generated method id: ${4b7fc612-7efa-3d2a-ac4f-c202e3bf491c}, hash: 76A9781ACBBA2CB3FED18D58EE97DE93
    @Test()
    public void strategyForWhenAnnotationsNotIsMarkerAnnotationType() {
        /* Branches:
         * (Annotations.isMarker(annotationType)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Annotations> annotations = mockStatic(Annotations.class)) {
            annotations.when(() -> Annotations.isRetainedAtRuntime(Object.class)).thenReturn(false);
            annotations.when(() -> Annotations.isBindingAnnotation(Object.class)).thenReturn(false);
            annotations.when(() -> Annotations.isMarker(Object.class)).thenReturn(false);
            annotations.when(() -> Annotations.canonicalizeIfNamed(annotationMock2)).thenReturn(annotationMock);
            //Act Statement(s)
            Key.AnnotationStrategy result = Key.strategyFor(annotationMock2);
            Key.AnnotationInstanceStrategy keyAnnotationInstanceStrategy = new Key.AnnotationInstanceStrategy(annotationMock);
            //Assert statement(s)
            assertThat(result, equalTo(keyAnnotationInstanceStrategy));
            annotations.verify(() -> Annotations.isRetainedAtRuntime(Object.class), atLeast(1));
            annotations.verify(() -> Annotations.isBindingAnnotation(Object.class), atLeast(1));
            annotations.verify(() -> Annotations.isMarker(Object.class), atLeast(1));
            annotations.verify(() -> Annotations.canonicalizeIfNamed(annotationMock2), atLeast(1));
        }
    }

    //Sapient generated method id: ${10aaaf03-e943-3407-acfc-d79d0f889cae}, hash: 435AC8436769A9DE1D651979B10DED96
    @Test()
    public void strategyFor1WhenIsAllDefaultMethodsAnnotationType() {
        /* Branches:
         * (isAllDefaultMethods(annotationType)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Key> key = mockStatic(Key.class, CALLS_REAL_METHODS);
             MockedStatic<Annotations> annotations = mockStatic(Annotations.class)) {
            annotations.when(() -> Annotations.canonicalizeIfNamed(java.lang.annotation.Annotation.class)).thenReturn(Annotation.class);
            annotations.when(() -> Annotations.isAllDefaultMethods(java.lang.annotation.Annotation.class)).thenReturn(true);
            annotations.when(() -> Annotations.generateAnnotation(java.lang.annotation.Annotation.class)).thenReturn(annotationMock);
            key.when(() -> Key.strategyFor(annotationMock)).thenReturn(keyAnnotationStrategyMock);
            //Act Statement(s)
            Key.AnnotationStrategy result = Key.strategyFor(java.lang.annotation.Annotation.class);
            //Assert statement(s)
            assertThat(result, equalTo(keyAnnotationStrategyMock));
            annotations.verify(() -> Annotations.canonicalizeIfNamed(java.lang.annotation.Annotation.class), atLeast(1));
            annotations.verify(() -> Annotations.isAllDefaultMethods(java.lang.annotation.Annotation.class), atLeast(1));
            annotations.verify(() -> Annotations.generateAnnotation(java.lang.annotation.Annotation.class), atLeast(1));
            key.verify(() -> Key.strategyFor(annotationMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${24ae2672-12b1-3871-9c9a-fd8985e88ddd}, hash: D67F2297906F9E3A9FA04516A2212EC0
    @Test()
    public void strategyFor1WhenIsAllDefaultMethodsNotAnnotationType() {
        /* Branches:
         * (isAllDefaultMethods(annotationType)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Annotations> annotations = mockStatic(Annotations.class)) {
            annotations.when(() -> Annotations.canonicalizeIfNamed(java.lang.annotation.Annotation.class)).thenReturn(Object.class);
            annotations.when(() -> Annotations.isAllDefaultMethods(Object.class)).thenReturn(false);
            annotations.when(() -> Annotations.isRetainedAtRuntime(Object.class)).thenReturn(false);
            thrown.expect(IllegalArgumentException.class);
            //Act Statement(s)
            Key.strategyFor(java.lang.annotation.Annotation.class);
            //Assert statement(s)
            annotations.verify(() -> Annotations.canonicalizeIfNamed(java.lang.annotation.Annotation.class), atLeast(1));
            annotations.verify(() -> Annotations.isAllDefaultMethods(Object.class), atLeast(1));
            annotations.verify(() -> Annotations.isRetainedAtRuntime(Object.class), atLeast(1));
        }
    }
}
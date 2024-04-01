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

import org.junit.Ignore;

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

    //Sapient generated method id: ${6fadf434-8607-384d-aeed-8056cc110d14}, hash: 5E766CF7D4A6B9352DD3E4393391B203
    @Ignore()
    @Test()
    public void getAnnotationTypeTest() {
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
            annotations.when(() -> Annotations.isRetainedAtRuntime(java.lang.annotation.Annotation.class)).thenReturn(false);
            annotations.when(() -> Annotations.isBindingAnnotation(java.lang.annotation.Annotation.class)).thenReturn(false);
            annotations.when(() -> Annotations.isMarker(java.lang.annotation.Annotation.class)).thenReturn(true);
            typeLiteral.when(() -> TypeLiteral.fromSuperclassTypeParameter(Key.class)).thenReturn(typeLiteralMock2);
            moreTypes.when(() -> MoreTypes.canonicalizeForKey(typeLiteralMock2)).thenReturn(typeLiteralMock);
            Key<Object> target = new Key(java.lang.annotation.Annotation.class);
            //Act Statement(s)
            Class<? extends java.lang.annotation.Annotation> result = target.getAnnotationType();
            //Assert statement(s)
            assertThat(result, equalTo(java.lang.annotation.Annotation.class));
            annotations.verify(() -> Annotations.canonicalizeIfNamed(java.lang.annotation.Annotation.class), atLeast(1));
            annotations.verify(() -> Annotations.isAllDefaultMethods(java.lang.annotation.Annotation.class), atLeast(1));
            annotations.verify(() -> Annotations.generateAnnotation(java.lang.annotation.Annotation.class), atLeast(1));
            annotations.verify(() -> Annotations.isRetainedAtRuntime(java.lang.annotation.Annotation.class), atLeast(1));
            annotations.verify(() -> Annotations.isBindingAnnotation(java.lang.annotation.Annotation.class), atLeast(1));
            annotations.verify(() -> Annotations.isMarker(java.lang.annotation.Annotation.class), atLeast(1));
            typeLiteral.verify(() -> TypeLiteral.fromSuperclassTypeParameter(Key.class), atLeast(1));
            moreTypes.verify(() -> MoreTypes.canonicalizeForKey(typeLiteralMock2), atLeast(1));
        }
    }

    //Sapient generated method id: ${43f6554e-3df6-3d8d-8e42-81c52fff7a95}, hash: AD14D466E95514A06E8ECCCF1E3A718F
    @Ignore()
    @Test()
    public void getAnnotationTest() {
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
            annotations.when(() -> Annotations.isRetainedAtRuntime(java.lang.annotation.Annotation.class)).thenReturn(false);
            annotations.when(() -> Annotations.isBindingAnnotation(java.lang.annotation.Annotation.class)).thenReturn(false);
            annotations.when(() -> Annotations.isMarker(java.lang.annotation.Annotation.class)).thenReturn(true);
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
            annotations.verify(() -> Annotations.isRetainedAtRuntime(java.lang.annotation.Annotation.class), atLeast(1));
            annotations.verify(() -> Annotations.isBindingAnnotation(java.lang.annotation.Annotation.class), atLeast(1));
            annotations.verify(() -> Annotations.isMarker(java.lang.annotation.Annotation.class), atLeast(1));
            typeLiteral.verify(() -> TypeLiteral.fromSuperclassTypeParameter(Key.class), atLeast(1));
            moreTypes.verify(() -> MoreTypes.canonicalizeForKey(typeLiteralMock2), atLeast(1));
        }
    }

    //Sapient generated method id: ${202ff0d9-7143-3926-9759-0e06cfe023de}, hash: 297FBA499E217552DE05B1769C10E6AC
    @Ignore()
    @Test()
    public void hasAnnotationTypeWhenAnnotationStrategyGetAnnotationTypeIsNotNull() {
        /* Branches:
         * (annotationStrategy.getAnnotationType() != null) : true
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
            annotations.when(() -> Annotations.isRetainedAtRuntime(java.lang.annotation.Annotation.class)).thenReturn(false);
            annotations.when(() -> Annotations.isBindingAnnotation(java.lang.annotation.Annotation.class)).thenReturn(false);
            annotations.when(() -> Annotations.isMarker(java.lang.annotation.Annotation.class)).thenReturn(true);
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
            annotations.verify(() -> Annotations.isRetainedAtRuntime(java.lang.annotation.Annotation.class), atLeast(1));
            annotations.verify(() -> Annotations.isBindingAnnotation(java.lang.annotation.Annotation.class), atLeast(1));
            annotations.verify(() -> Annotations.isMarker(java.lang.annotation.Annotation.class), atLeast(1));
            typeLiteral.verify(() -> TypeLiteral.fromSuperclassTypeParameter(Key.class), atLeast(1));
            moreTypes.verify(() -> MoreTypes.canonicalizeForKey(typeLiteralMock2), atLeast(1));
        }
    }

    //Sapient generated method id: ${08dbdb7a-9273-3eb3-91aa-771495059ee5}, hash: 9F4B67F49D1E3F17A64962DAF0FE5313
    @Ignore()
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

    //Sapient generated method id: ${c7209d98-c463-363a-859b-88e8c92dfd8d}, hash: 6928286B7F0A1B4B776A0CEDFE5F3D7E
    @Ignore()
    @Test()
    public void getAnnotationNameWhenAnnotationIsNotNull() {
        /* Branches:
         * (annotation != null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        java.lang.annotation.Annotation annotationMock = mock(java.lang.annotation.Annotation.class, "strategyFor_annotation1");
        try (MockedStatic<MoreTypes> moreTypes = mockStatic(MoreTypes.class);
             MockedStatic<TypeLiteral> typeLiteral = mockStatic(TypeLiteral.class);
             MockedStatic<Annotations> annotations = mockStatic(Annotations.class)) {
            annotations.when(() -> Annotations.canonicalizeIfNamed(java.lang.annotation.Annotation.class)).thenReturn(Annotation.class);
            annotations.when(() -> Annotations.isAllDefaultMethods(java.lang.annotation.Annotation.class)).thenReturn(true);
            annotations.when(() -> Annotations.generateAnnotation(java.lang.annotation.Annotation.class)).thenReturn(annotationMock);
            annotations.when(() -> Annotations.isRetainedAtRuntime(java.lang.annotation.Annotation.class)).thenReturn(false);
            annotations.when(() -> Annotations.isBindingAnnotation(java.lang.annotation.Annotation.class)).thenReturn(false);
            annotations.when(() -> Annotations.isMarker(java.lang.annotation.Annotation.class)).thenReturn(true);
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
            annotations.verify(() -> Annotations.isRetainedAtRuntime(java.lang.annotation.Annotation.class), atLeast(1));
            annotations.verify(() -> Annotations.isBindingAnnotation(java.lang.annotation.Annotation.class), atLeast(1));
            annotations.verify(() -> Annotations.isMarker(java.lang.annotation.Annotation.class), atLeast(1));
            typeLiteral.verify(() -> TypeLiteral.fromSuperclassTypeParameter(Key.class), atLeast(1));
            moreTypes.verify(() -> MoreTypes.canonicalizeForKey(typeLiteralMock2), atLeast(1));
        }
    }

    //Sapient generated method id: ${434c70a5-580c-379c-9de0-183c862214f0}, hash: 2C2CFCB4B3001354EEB729CFEF0DD463
    @Ignore()
    @Test()
    public void getAnnotationNameWhenAnnotationIsNull() {
        /* Branches:
         * (annotation != null) : false
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
            //TODO: Needs to return real value
            annotations.when(() -> Annotations.generateAnnotation(java.lang.annotation.Annotation.class)).thenReturn(null);
            annotations.when(() -> Annotations.isRetainedAtRuntime(java.lang.annotation.Annotation.class)).thenReturn(false);
            annotations.when(() -> Annotations.isBindingAnnotation(java.lang.annotation.Annotation.class)).thenReturn(false);
            annotations.when(() -> Annotations.isMarker(java.lang.annotation.Annotation.class)).thenReturn(true);
            typeLiteral.when(() -> TypeLiteral.fromSuperclassTypeParameter(Key.class)).thenReturn(typeLiteralMock2);
            moreTypes.when(() -> MoreTypes.canonicalizeForKey(typeLiteralMock2)).thenReturn(typeLiteralMock);
            Key<Object> target = new Key(java.lang.annotation.Annotation.class);
            //Act Statement(s)
            String result = target.getAnnotationName();
            //Assert statement(s)
            assertThat(result, equalTo("java.lang.annotation.Annotation"));
            annotations.verify(() -> Annotations.canonicalizeIfNamed(java.lang.annotation.Annotation.class), atLeast(1));
            annotations.verify(() -> Annotations.isAllDefaultMethods(java.lang.annotation.Annotation.class), atLeast(1));
            annotations.verify(() -> Annotations.generateAnnotation(java.lang.annotation.Annotation.class), atLeast(1));
            annotations.verify(() -> Annotations.isRetainedAtRuntime(java.lang.annotation.Annotation.class), atLeast(1));
            annotations.verify(() -> Annotations.isBindingAnnotation(java.lang.annotation.Annotation.class), atLeast(1));
            annotations.verify(() -> Annotations.isMarker(java.lang.annotation.Annotation.class), atLeast(1));
            typeLiteral.verify(() -> TypeLiteral.fromSuperclassTypeParameter(Key.class), atLeast(1));
            moreTypes.verify(() -> MoreTypes.canonicalizeForKey(typeLiteralMock2), atLeast(1));
        }
    }

    //Sapient generated method id: ${ad7b65a6-9e61-3f41-909b-f73338704358}, hash: 7F522E30A86B2B43479A033D0B0FC732
    @Ignore()
    @Test()
    public void getRawTypeTest() {
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
            annotations.when(() -> Annotations.isRetainedAtRuntime(java.lang.annotation.Annotation.class)).thenReturn(false);
            annotations.when(() -> Annotations.isBindingAnnotation(java.lang.annotation.Annotation.class)).thenReturn(false);
            annotations.when(() -> Annotations.isMarker(java.lang.annotation.Annotation.class)).thenReturn(true);
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
            annotations.verify(() -> Annotations.isRetainedAtRuntime(java.lang.annotation.Annotation.class), atLeast(1));
            annotations.verify(() -> Annotations.isBindingAnnotation(java.lang.annotation.Annotation.class), atLeast(1));
            annotations.verify(() -> Annotations.isMarker(java.lang.annotation.Annotation.class), atLeast(1));
            typeLiteral.verify(() -> TypeLiteral.fromSuperclassTypeParameter(Key.class), atLeast(1));
            moreTypes.verify(() -> MoreTypes.canonicalizeForKey(typeLiteralMock2), atLeast(1));
            verify(typeLiteralMock).getRawType();
        }
    }

    //Sapient generated method id: ${f0fafb4a-d90f-3f2b-8cfd-114229eca8ea}, hash: 3AFAD4885884009EDD9A38D29918981F
    @Ignore()
    @Test()
    public void providerKeyTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TypeLiteral<Provider<Object>> typeLiteralMock3 = mock(TypeLiteral.class);
        Key<Provider<Object>> keyMock = mock(Key.class);
        try (MockedStatic<MoreTypes> moreTypes = mockStatic(MoreTypes.class);
             MockedStatic<TypeLiteral> typeLiteral = mockStatic(TypeLiteral.class);
             MockedStatic<Annotations> annotations = mockStatic(Annotations.class)) {
            annotations.when(() -> Annotations.canonicalizeIfNamed(java.lang.annotation.Annotation.class)).thenReturn(Annotation.class);
            annotations.when(() -> Annotations.isAllDefaultMethods(java.lang.annotation.Annotation.class)).thenReturn(true);
            annotations.when(() -> Annotations.generateAnnotation(java.lang.annotation.Annotation.class)).thenReturn(annotationMock);
            annotations.when(() -> Annotations.isRetainedAtRuntime(java.lang.annotation.Annotation.class)).thenReturn(false);
            annotations.when(() -> Annotations.isBindingAnnotation(java.lang.annotation.Annotation.class)).thenReturn(false);
            annotations.when(() -> Annotations.isMarker(java.lang.annotation.Annotation.class)).thenReturn(true);
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
            annotations.verify(() -> Annotations.isRetainedAtRuntime(java.lang.annotation.Annotation.class), atLeast(1));
            annotations.verify(() -> Annotations.isBindingAnnotation(java.lang.annotation.Annotation.class), atLeast(1));
            annotations.verify(() -> Annotations.isMarker(java.lang.annotation.Annotation.class), atLeast(1));
            typeLiteral.verify(() -> TypeLiteral.fromSuperclassTypeParameter(Key.class), atLeast(1));
            moreTypes.verify(() -> MoreTypes.canonicalizeForKey(typeLiteralMock2), atLeast(1));
            verify(typeLiteralMock).providerType();
            verify(target).ofType(typeLiteralMock3);
        }
    }

    //Sapient generated method id: ${a466e02d-296c-3ead-915f-328423c3c33c}, hash: 3AC660EB10CFC28462EB99A9B3C4A68C
    @Ignore()
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
            annotations.when(() -> Annotations.isRetainedAtRuntime(java.lang.annotation.Annotation.class)).thenReturn(false);
            annotations.when(() -> Annotations.isBindingAnnotation(java.lang.annotation.Annotation.class)).thenReturn(false);
            annotations.when(() -> Annotations.isMarker(java.lang.annotation.Annotation.class)).thenReturn(true);
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
            annotations.verify(() -> Annotations.isRetainedAtRuntime(java.lang.annotation.Annotation.class), atLeast(1));
            annotations.verify(() -> Annotations.isBindingAnnotation(java.lang.annotation.Annotation.class), atLeast(1));
            annotations.verify(() -> Annotations.isMarker(java.lang.annotation.Annotation.class), atLeast(1));
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

    //Sapient generated method id: ${f91f2aed-7f5a-319b-98be-57aee8abb063}, hash: 186688C8B1D2D0D90DAADAB4D840BDCB
    @Ignore()
    @Test()
    public void get2Test() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
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

    //Sapient generated method id: ${56b94b6a-fcdd-30bc-99fe-466780af1a26}, hash: B3A0C499112D1791A4929BA58C3C482E
    @Ignore()
    @Test()
    public void get3Test() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
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

    //Sapient generated method id: ${ec3fd035-36cb-3c58-8ede-bcbba024507f}, hash: C829F0A8AA37B2E752B4A0C8E37E6B0B
    @Test()
    public void get4Test() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
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

    //Sapient generated method id: ${6fd3c204-af77-3e78-af16-d0fda738a9f3}, hash: 11991D87F4C623D8CF7A2F0A55EC9AA6
    @Test()
    public void get5Test() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
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

    //Sapient generated method id: ${3003cb3f-6681-34d2-acfb-4044be836880}, hash: 2F71745F3525C7EA22835AF1F0075618
    @Test()
    public void get6Test() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
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

    //Sapient generated method id: ${25562848-72a5-3a4e-81b7-64e060432e6b}, hash: 37FA4BF9BE6D6B1D4FC157394BB357C0
    @Test()
    public void get7Test() {
        //Arrange Statement(s)
        TypeLiteral typeLiteral = TypeLiteral.get(Object.class);
        //Act Statement(s)
        Key result = Key.get(typeLiteral);
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${ea0070b1-aefb-36ab-983d-ee757e4fda7f}, hash: 1B20335ED2D93B5D33AC28AACFD8F07D
    @Test()
    public void get8Test() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Key> key = mockStatic(Key.class, CALLS_REAL_METHODS)) {
            key.when(() -> Key.strategyFor(java.lang.annotation.Annotation.class)).thenReturn(keyAnnotationStrategyMock);
            TypeLiteral typeLiteral = TypeLiteral.get(Object.class);
            //Act Statement(s)
            Key result = Key.get(typeLiteral, java.lang.annotation.Annotation.class);
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            key.verify(() -> Key.strategyFor(java.lang.annotation.Annotation.class), atLeast(1));
        }
    }

    //Sapient generated method id: ${68d4729f-9ead-3032-afed-5afe57f90859}, hash: DD27930DF2B875790AAE083BFBB02004
    @Test()
    public void get9Test() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        java.lang.annotation.Annotation annotationMock = mock(java.lang.annotation.Annotation.class, "Annotation");
        try (MockedStatic<Key> key = mockStatic(Key.class, CALLS_REAL_METHODS)) {
            key.when(() -> Key.strategyFor(annotationMock)).thenReturn(keyAnnotationStrategyMock);
            TypeLiteral typeLiteral = TypeLiteral.get(Object.class);
            //Act Statement(s)
            Key result = Key.get(typeLiteral, annotationMock);
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            key.verify(() -> Key.strategyFor(annotationMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${ceb9cf37-7f00-3ca7-b685-a9ca14960925}, hash: 7EDF9B17BC73CDB5142875135DD9AB37
    @Ignore()
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
            annotations.when(() -> Annotations.isRetainedAtRuntime(java.lang.annotation.Annotation.class)).thenReturn(false);
            annotations.when(() -> Annotations.isBindingAnnotation(java.lang.annotation.Annotation.class)).thenReturn(false);
            annotations.when(() -> Annotations.isMarker(java.lang.annotation.Annotation.class)).thenReturn(true);
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
            annotations.verify(() -> Annotations.isRetainedAtRuntime(java.lang.annotation.Annotation.class), atLeast(1));
            annotations.verify(() -> Annotations.isBindingAnnotation(java.lang.annotation.Annotation.class), atLeast(1));
            annotations.verify(() -> Annotations.isMarker(java.lang.annotation.Annotation.class), atLeast(1));
            typeLiteral.verify(() -> TypeLiteral.fromSuperclassTypeParameter(Key.class), atLeast(1));
            moreTypes.verify(() -> MoreTypes.canonicalizeForKey(typeLiteralMock2), atLeast(1));
            typeLiteral.verify(() -> TypeLiteral.get(Object.class), atLeast(1));
            moreTypes.verify(() -> MoreTypes.canonicalizeForKey(typeLiteralMock3), atLeast(1));
        }
    }

    //Sapient generated method id: ${762641de-aaec-3817-bb92-0ecf43bef015}, hash: A343D0CD63F46B4C0C3AB44EBC9E4A75
    @Ignore()
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
            annotations.when(() -> Annotations.isRetainedAtRuntime(java.lang.annotation.Annotation.class)).thenReturn(false);
            annotations.when(() -> Annotations.isBindingAnnotation(java.lang.annotation.Annotation.class)).thenReturn(false);
            annotations.when(() -> Annotations.isMarker(java.lang.annotation.Annotation.class)).thenReturn(true);
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
            annotations.verify(() -> Annotations.isRetainedAtRuntime(java.lang.annotation.Annotation.class), atLeast(1));
            annotations.verify(() -> Annotations.isBindingAnnotation(java.lang.annotation.Annotation.class), atLeast(1));
            annotations.verify(() -> Annotations.isMarker(java.lang.annotation.Annotation.class), atLeast(1));
            typeLiteral.verify(() -> TypeLiteral.fromSuperclassTypeParameter(Key.class), atLeast(1));
            moreTypes.verify(() -> MoreTypes.canonicalizeForKey(typeLiteralMock2), atLeast(1));
            typeLiteral.verify(() -> TypeLiteral.get(typeMock), atLeast(1));
            moreTypes.verify(() -> MoreTypes.canonicalizeForKey(typeLiteralMock3), atLeast(1));
        }
    }

    //Sapient generated method id: ${fcfd9b71-e930-30a1-a25d-a0c2e12d03a4}, hash: 7368D2A935042C3A82BD170EABB7A648
    @Ignore()
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
            annotations.when(() -> Annotations.isRetainedAtRuntime(java.lang.annotation.Annotation.class)).thenReturn(false);
            annotations.when(() -> Annotations.isBindingAnnotation(java.lang.annotation.Annotation.class)).thenReturn(false);
            annotations.when(() -> Annotations.isMarker(java.lang.annotation.Annotation.class)).thenReturn(true);
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
            annotations.verify(() -> Annotations.isRetainedAtRuntime(java.lang.annotation.Annotation.class), atLeast(1));
            annotations.verify(() -> Annotations.isBindingAnnotation(java.lang.annotation.Annotation.class), atLeast(1));
            annotations.verify(() -> Annotations.isMarker(java.lang.annotation.Annotation.class), atLeast(1));
            typeLiteral.verify(() -> TypeLiteral.fromSuperclassTypeParameter(Key.class), atLeast(1));
            moreTypes.verify(() -> MoreTypes.canonicalizeForKey(typeLiteralMock2), atLeast(1));
            moreTypes.verify(() -> MoreTypes.canonicalizeForKey(typeLiteralMock4), atLeast(1));
        }
    }

    //Sapient generated method id: ${e3489a42-4524-3908-acad-349fa78a9ed1}, hash: D865388F6DF5DE129B0D31AF0ED237A4
    @Ignore()
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
            annotations.when(() -> Annotations.isRetainedAtRuntime(java.lang.annotation.Annotation.class)).thenReturn(false);
            annotations.when(() -> Annotations.isBindingAnnotation(java.lang.annotation.Annotation.class)).thenReturn(false);
            annotations.when(() -> Annotations.isMarker(java.lang.annotation.Annotation.class)).thenReturn(true);
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
            annotations.verify(() -> Annotations.isRetainedAtRuntime(java.lang.annotation.Annotation.class), atLeast(1));
            annotations.verify(() -> Annotations.isBindingAnnotation(java.lang.annotation.Annotation.class), atLeast(1));
            annotations.verify(() -> Annotations.isMarker(java.lang.annotation.Annotation.class), atLeast(1));
            typeLiteral.verify(() -> TypeLiteral.fromSuperclassTypeParameter(Key.class), atLeast(1));
            moreTypes.verify(() -> MoreTypes.canonicalizeForKey(typeLiteralMock2), atLeast(1));
            key.verify(() -> Key.strategyFor(java.lang.annotation.Annotation.class), atLeast(1));
            moreTypes.verify(() -> MoreTypes.canonicalizeForKey(typeLiteralMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${c500d4e1-5aab-3206-87d6-1c4daf84913a}, hash: ED8CFD3237850BE24673F9CEADB3D437
    @Ignore()
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
            annotations.when(() -> Annotations.isRetainedAtRuntime(java.lang.annotation.Annotation.class)).thenReturn(false);
            annotations.when(() -> Annotations.isBindingAnnotation(java.lang.annotation.Annotation.class)).thenReturn(false);
            annotations.when(() -> Annotations.isMarker(java.lang.annotation.Annotation.class)).thenReturn(true);
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
            annotations.verify(() -> Annotations.isRetainedAtRuntime(java.lang.annotation.Annotation.class), atLeast(1));
            annotations.verify(() -> Annotations.isBindingAnnotation(java.lang.annotation.Annotation.class), atLeast(1));
            annotations.verify(() -> Annotations.isMarker(java.lang.annotation.Annotation.class), atLeast(1));
            typeLiteral.verify(() -> TypeLiteral.fromSuperclassTypeParameter(Key.class), atLeast(1));
            moreTypes.verify(() -> MoreTypes.canonicalizeForKey(typeLiteralMock2), atLeast(1));
            key.verify(() -> Key.strategyFor(annotationMock2), atLeast(1));
            moreTypes.verify(() -> MoreTypes.canonicalizeForKey(typeLiteralMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${2713e8ae-4ee9-39f9-b7f5-961dd3bbd1a1}, hash: 37222969EFB8B73A27271A8E3C01C216
    @Ignore()
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
            annotations.when(() -> Annotations.isRetainedAtRuntime(java.lang.annotation.Annotation.class)).thenReturn(false);
            annotations.when(() -> Annotations.isBindingAnnotation(java.lang.annotation.Annotation.class)).thenReturn(false);
            annotations.when(() -> Annotations.isMarker(java.lang.annotation.Annotation.class)).thenReturn(true);
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
            annotations.verify(() -> Annotations.isRetainedAtRuntime(java.lang.annotation.Annotation.class), atLeast(1));
            annotations.verify(() -> Annotations.isBindingAnnotation(java.lang.annotation.Annotation.class), atLeast(1));
            annotations.verify(() -> Annotations.isMarker(java.lang.annotation.Annotation.class), atLeast(1));
            typeLiteral.verify(() -> TypeLiteral.fromSuperclassTypeParameter(Key.class), atLeast(1));
            moreTypes.verify(() -> MoreTypes.canonicalizeForKey(typeLiteralMock2), atLeast(1));
        }
    }

    //Sapient generated method id: ${90d15bc4-b8f4-330c-b07b-d4dd216e7963}, hash: F031632712CCF98D265534C58039D81E
    @Ignore()
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
            annotations.when(() -> Annotations.isRetainedAtRuntime(java.lang.annotation.Annotation.class)).thenReturn(false);
            annotations.when(() -> Annotations.isBindingAnnotation(java.lang.annotation.Annotation.class)).thenReturn(false);
            annotations.when(() -> Annotations.isMarker(java.lang.annotation.Annotation.class)).thenReturn(true);
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
            annotations.verify(() -> Annotations.isRetainedAtRuntime(java.lang.annotation.Annotation.class), atLeast(1));
            annotations.verify(() -> Annotations.isBindingAnnotation(java.lang.annotation.Annotation.class), atLeast(1));
            annotations.verify(() -> Annotations.isMarker(java.lang.annotation.Annotation.class), atLeast(1));
            typeLiteral.verify(() -> TypeLiteral.fromSuperclassTypeParameter(Key.class), atLeast(1));
            moreTypes.verify(() -> MoreTypes.canonicalizeForKey(typeLiteralMock2), atLeast(1));
        }
    }

    //Sapient generated method id: ${8920d1e3-4e0e-3b7a-ab9f-e8422e304c7e}, hash: 09CD08B7E57E11D85B960D620CC25E19
    @Ignore()
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
            annotations.when(() -> Annotations.isRetainedAtRuntime(java.lang.annotation.Annotation.class)).thenReturn(false);
            annotations.when(() -> Annotations.isBindingAnnotation(java.lang.annotation.Annotation.class)).thenReturn(false);
            annotations.when(() -> Annotations.isMarker(java.lang.annotation.Annotation.class)).thenReturn(true);
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
            annotations.verify(() -> Annotations.isRetainedAtRuntime(java.lang.annotation.Annotation.class), atLeast(1));
            annotations.verify(() -> Annotations.isBindingAnnotation(java.lang.annotation.Annotation.class), atLeast(1));
            annotations.verify(() -> Annotations.isMarker(java.lang.annotation.Annotation.class), atLeast(1));
            typeLiteral.verify(() -> TypeLiteral.fromSuperclassTypeParameter(Key.class), atLeast(1));
            moreTypes.verify(() -> MoreTypes.canonicalizeForKey(typeLiteralMock2), atLeast(1));
            moreTypes.verify(() -> MoreTypes.canonicalizeForKey(typeLiteralMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${63257d8a-5117-3244-b4cd-5efa77bdb1e5}, hash: 6E0B7A06FDEA7BF770E10310F870F2FF
    @Ignore()
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
            annotations.when(() -> Annotations.isRetainedAtRuntime(java.lang.annotation.Annotation.class)).thenReturn(false);
            annotations.when(() -> Annotations.isBindingAnnotation(java.lang.annotation.Annotation.class)).thenReturn(false);
            annotations.when(() -> Annotations.isMarker(java.lang.annotation.Annotation.class)).thenReturn(true);
            //Act Statement(s)
            Key.AnnotationStrategy result = Key.strategyFor(annotationMock);
            Key.AnnotationTypeStrategy keyAnnotationTypeStrategy = new Key.AnnotationTypeStrategy(java.lang.annotation.Annotation.class, annotationMock);
            //Assert statement(s)
            assertThat(result, equalTo(keyAnnotationTypeStrategy));
            annotations.verify(() -> Annotations.isRetainedAtRuntime(java.lang.annotation.Annotation.class), atLeast(1));
            annotations.verify(() -> Annotations.isBindingAnnotation(java.lang.annotation.Annotation.class), atLeast(1));
            annotations.verify(() -> Annotations.isMarker(java.lang.annotation.Annotation.class), atLeast(1));
        }
    }

    //Sapient generated method id: ${4b7fc612-7efa-3d2a-ac4f-c202e3bf491c}, hash: FF804B85D47B5F09F75282644EFA5934
    @Ignore()
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
            annotations.when(() -> Annotations.isRetainedAtRuntime(java.lang.annotation.Annotation.class)).thenReturn(false);
            annotations.when(() -> Annotations.isBindingAnnotation(java.lang.annotation.Annotation.class)).thenReturn(false);
            annotations.when(() -> Annotations.isMarker(java.lang.annotation.Annotation.class)).thenReturn(false);
            annotations.when(() -> Annotations.canonicalizeIfNamed(annotationMock2)).thenReturn(annotationMock);
            //Act Statement(s)
            Key.AnnotationStrategy result = Key.strategyFor(annotationMock2);
            Key.AnnotationInstanceStrategy keyAnnotationInstanceStrategy = new Key.AnnotationInstanceStrategy(annotationMock);
            //Assert statement(s)
            assertThat(result, equalTo(keyAnnotationInstanceStrategy));
            annotations.verify(() -> Annotations.isRetainedAtRuntime(java.lang.annotation.Annotation.class), atLeast(1));
            annotations.verify(() -> Annotations.isBindingAnnotation(java.lang.annotation.Annotation.class), atLeast(1));
            annotations.verify(() -> Annotations.isMarker(java.lang.annotation.Annotation.class), atLeast(1));
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

    //Sapient generated method id: ${24ae2672-12b1-3871-9c9a-fd8985e88ddd}, hash: 5333D9FE5C67E2AB9FE40DAEB673765B
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
            annotations.when(() -> Annotations.canonicalizeIfNamed(java.lang.annotation.Annotation.class)).thenReturn(java.lang.annotation.Annotation.class);
            annotations.when(() -> Annotations.isAllDefaultMethods(java.lang.annotation.Annotation.class)).thenReturn(false);
            annotations.when(() -> Annotations.isRetainedAtRuntime(java.lang.annotation.Annotation.class)).thenReturn(false);
            thrown.expect(IllegalArgumentException.class);
            //Act Statement(s)
            Key.strategyFor(java.lang.annotation.Annotation.class);
            //Assert statement(s)
            annotations.verify(() -> Annotations.canonicalizeIfNamed(java.lang.annotation.Annotation.class), atLeast(1));
            annotations.verify(() -> Annotations.isAllDefaultMethods(java.lang.annotation.Annotation.class), atLeast(1));
            annotations.verify(() -> Annotations.isRetainedAtRuntime(java.lang.annotation.Annotation.class), atLeast(1));
        }
    }
}

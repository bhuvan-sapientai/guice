package com.google.inject.spi;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import com.google.inject.internal.ErrorsException;
import org.junit.rules.ExpectedException;

import java.util.List;

import com.google.inject.internal.KotlinSupportInterface;
import com.google.inject.internal.MoreTypes;
import com.google.inject.internal.KotlinSupport;

import java.lang.reflect.Member;
import java.lang.reflect.AnnotatedType;
import java.util.HashSet;

import com.google.inject.internal.util.Classes;
import com.google.inject.internal.Nullability;
import com.google.inject.internal.Annotations;

import java.lang.reflect.AnnotatedElement;
import java.util.ArrayList;

import com.google.common.collect.ImmutableSet;
import com.google.inject.Key;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.annotation.Annotation;

import com.google.inject.internal.DeclaredMembers;
import com.google.inject.TypeLiteral;

import java.lang.reflect.Field;

import com.google.common.collect.ImmutableList;
import com.google.inject.internal.Errors;

import java.lang.reflect.Type;
import java.util.Set;
import java.util.function.Predicate;

import jakarta.inject.Inject;
import com.google.inject.ConfigurationException;
import org.mockito.MockedStatic;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

import org.junit.Ignore;

public class InjectionPointSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final AnnotatedType annotatedTypeMock = mock(AnnotatedType.class);

    private final Annotation annotationMock = mock(Annotation.class);

    private final Annotation annotationMock2 = mock(Annotation.class);

    private final Annotation annotationMock3 = mock(Annotation.class);

    private final Constructor constructorMock = mock(Constructor.class);

    private final TypeLiteral currentMock = mock(TypeLiteral.class);

    private final Field fieldMock = mock(Field.class);

    private final Field fieldMock2 = mock(Field.class);

    private final InjectionPoint injectionPointMock = mock(InjectionPoint.class);

    private final Key<Object> keyMock = mock(Key.class);

    private final KotlinSupportInterface kotlinSupportInterfaceMock = mock(KotlinSupportInterface.class);

    private final KotlinSupportInterface kotlinSupportInterfaceMock2 = mock(KotlinSupportInterface.class);

    private final AnnotatedElement memberMock = mock(AnnotatedElement.class);

    private final Method methodMock = mock(Method.class);

    private final Method methodMock2 = mock(Method.class);

    private final Method methodMock3 = mock(Method.class);

    private final Predicate predicateMock = mock(Predicate.class);

    private final TypeLiteral typeLiteralMock = mock(TypeLiteral.class);

    private final TypeLiteral typeMock = mock(TypeLiteral.class);

    private final Type typeMock2 = mock(Type.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${903fef97-987f-323e-a528-d02591a6bcb2}, hash: DB05D0E6E28BC15D5D136A8F044D0953
    @Ignore()
    @Test()
    public void getDependenciesTest() throws ErrorsException {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Nullability> nullability = mockStatic(Nullability.class);
             MockedStatic<Annotations> annotations = mockStatic(Annotations.class);
             MockedStatic<KotlinSupport> kotlinSupport = mockStatic(KotlinSupport.class)) {
            AnnotatedType[] annotatedTypeArray = new AnnotatedType[]{annotatedTypeMock};
            doReturn(annotatedTypeArray).when(methodMock).getAnnotatedParameterTypes();
            Annotation[] annotationArray2 = new Annotation[]{};
            Annotation[][] annotationArray = new Annotation[][]{annotationArray2};
            doReturn(annotationArray).when(methodMock).getParameterAnnotations();
            kotlinSupport.when(() -> KotlinSupport.getInstance()).thenReturn(kotlinSupportInterfaceMock);
            doReturn(predicateMock).when(kotlinSupportInterfaceMock).getIsParameterKotlinNullablePredicate(methodMock);
            annotations.when(() -> Annotations.getKey((TypeLiteral) any(), eq(methodMock), eq(annotationArray2), (Errors) any())).thenReturn(keyMock);
            nullability.when(() -> Nullability.hasNullableAnnotation(annotationArray2)).thenReturn(false);
            Annotation[] annotationArray3 = new Annotation[]{};
            nullability.when(() -> Nullability.hasNullableAnnotation(annotationArray3)).thenReturn(false);
            TypeLiteral typeLiteral = TypeLiteral.get(Object.class);
            InjectionPoint target = new InjectionPoint(typeLiteral, methodMock, false);
            //Act Statement(s)
            List<Dependency<?>> result = target.getDependencies();
            ImmutableList immutableList = ImmutableList.of();
            //Assert statement(s)
            assertThat(result, equalTo(immutableList));
            verify(methodMock).getAnnotatedParameterTypes();
            verify(methodMock).getParameterAnnotations();
            kotlinSupport.verify(() -> KotlinSupport.getInstance(), atLeast(1));
            verify(kotlinSupportInterfaceMock).getIsParameterKotlinNullablePredicate(methodMock);
            annotations.verify(() -> Annotations.getKey((TypeLiteral) any(), eq(methodMock), eq(annotationArray2), (Errors) any()));
            nullability.verify(() -> Nullability.hasNullableAnnotation(annotationArray2), atLeast(1));
            nullability.verify(() -> Nullability.hasNullableAnnotation(annotationArray3), atLeast(1));
        }
    }

    //Sapient generated method id: ${c2d01f9c-8b7f-3f38-b503-4a78ccaec352}, hash: B3F8E4DD383FDC802DF67E421D384AD6
    @Ignore()
    @Test()
    public void isToolableWhenMemberIsAnnotationPresentToolable() throws ErrorsException {
        /* Branches:
         * (((AnnotatedElement) member).isAnnotationPresent(Toolable.class)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Nullability> nullability = mockStatic(Nullability.class);
             MockedStatic<Annotations> annotations = mockStatic(Annotations.class);
             MockedStatic<KotlinSupport> kotlinSupport = mockStatic(KotlinSupport.class)) {
            List<TypeLiteral<?>> anyList = new ArrayList<>();
            anyList.add(typeLiteralMock);
            doReturn(anyList).when(typeMock).getParameterTypes(methodMock);
            kotlinSupport.when(() -> KotlinSupport.getInstance()).thenReturn(kotlinSupportInterfaceMock);
            Predicate<Integer> predicate = kotlinSupportInterfaceMock.getIsParameterKotlinNullablePredicate(methodMock);
            doReturn(predicate).when(kotlinSupportInterfaceMock).getIsParameterKotlinNullablePredicate(methodMock);
            Annotation[] annotationArray = new Annotation[]{};
            annotations.when(() -> Annotations.getKey(eq(typeLiteralMock), eq(methodMock), eq(annotationArray), (Errors) any())).thenReturn(keyMock);
            nullability.when(() -> Nullability.hasNullableAnnotation(annotationArray)).thenReturn(false);
            Annotation[] annotationArray2 = new Annotation[]{};
            nullability.when(() -> Nullability.hasNullableAnnotation(annotationArray2)).thenReturn(false);
            InjectionPoint target = new InjectionPoint(typeMock, methodMock, false);
            //Act Statement(s)
            boolean result = target.isToolable();
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            verify(typeMock).getParameterTypes(methodMock);
            kotlinSupport.verify(() -> KotlinSupport.getInstance(), atLeast(1));
            verify(kotlinSupportInterfaceMock).getIsParameterKotlinNullablePredicate(methodMock);
            annotations.verify(() -> Annotations.getKey(eq(typeLiteralMock), eq(methodMock), eq(annotationArray), (Errors) any()));
            nullability.verify(() -> Nullability.hasNullableAnnotation(annotationArray), atLeast(1));
            nullability.verify(() -> Nullability.hasNullableAnnotation(annotationArray2), atLeast(1));
        }
    }

    //Sapient generated method id: ${483432dc-b4bc-3466-aecc-537354b6a1ec}, hash: 469C1F0084D15D73535E20F9929FEB8A
    @Ignore()
    @Test()
    public void isToolableWhenMemberNotIsAnnotationPresentToolable() throws ErrorsException {
        /* Branches:
         * (((AnnotatedElement) member).isAnnotationPresent(Toolable.class)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Nullability> nullability = mockStatic(Nullability.class);
             MockedStatic<Annotations> annotations = mockStatic(Annotations.class);
             MockedStatic<KotlinSupport> kotlinSupport = mockStatic(KotlinSupport.class)) {
            List<TypeLiteral<?>> anyList = new ArrayList<>();
            anyList.add(typeLiteralMock);
            doReturn(anyList).when(typeMock).getParameterTypes(methodMock);
            kotlinSupport.when(() -> KotlinSupport.getInstance()).thenReturn(kotlinSupportInterfaceMock);
            Predicate<Integer> predicate = kotlinSupportInterfaceMock.getIsParameterKotlinNullablePredicate(methodMock);
            doReturn(predicate).when(kotlinSupportInterfaceMock).getIsParameterKotlinNullablePredicate(methodMock);
            Annotation[] annotationArray = new Annotation[]{};
            annotations.when(() -> Annotations.getKey(eq(typeLiteralMock), eq(methodMock), eq(annotationArray), (Errors) any())).thenReturn(keyMock);
            nullability.when(() -> Nullability.hasNullableAnnotation(annotationArray)).thenReturn(false);
            Annotation[] annotationArray2 = new Annotation[]{};
            nullability.when(() -> Nullability.hasNullableAnnotation(annotationArray2)).thenReturn(false);
            InjectionPoint target = new InjectionPoint(typeMock, methodMock, false);
            //Act Statement(s)
            boolean result = target.isToolable();
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            verify(typeMock).getParameterTypes(methodMock);
            kotlinSupport.verify(() -> KotlinSupport.getInstance(), atLeast(1));
            verify(kotlinSupportInterfaceMock).getIsParameterKotlinNullablePredicate(methodMock);
            annotations.verify(() -> Annotations.getKey(eq(typeLiteralMock), eq(methodMock), eq(annotationArray), (Errors) any()));
            nullability.verify(() -> Nullability.hasNullableAnnotation(annotationArray), atLeast(1));
            nullability.verify(() -> Nullability.hasNullableAnnotation(annotationArray2), atLeast(1));
        }
    }

    //Sapient generated method id: ${363d3698-f34c-39ad-914f-376a19498023}, hash: 37B9AFB3A06517AC90AE71221A5AA8F1
    @Ignore()
    @Test()
    public void toStringTest() throws ErrorsException {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Method methodMock = mock(Method.class, "String");
        try (MockedStatic<Classes> classes = mockStatic(Classes.class);
             MockedStatic<Nullability> nullability = mockStatic(Nullability.class);
             MockedStatic<Annotations> annotations = mockStatic(Annotations.class);
             MockedStatic<KotlinSupport> kotlinSupport = mockStatic(KotlinSupport.class)) {
            doReturn(null).when(methodMock).getAnnotatedParameterTypes();
            doReturn(null).when(methodMock).getParameterAnnotations();
            kotlinSupport.when(() -> KotlinSupport.getInstance()).thenReturn(kotlinSupportInterfaceMock);
            doReturn(predicateMock).when(kotlinSupportInterfaceMock).getIsParameterKotlinNullablePredicate(methodMock);
            Annotation[] annotationArray = new Annotation[]{};
            annotations.when(() -> Annotations.getKey((TypeLiteral) any(), eq(methodMock), eq(annotationArray), (Errors) any())).thenReturn(keyMock);
            nullability.when(() -> Nullability.hasNullableAnnotation(annotationArray)).thenReturn(false);
            Annotation[] annotationArray2 = new Annotation[]{};
            nullability.when(() -> Nullability.hasNullableAnnotation(annotationArray2)).thenReturn(false);
            classes.when(() -> Classes.toString(methodMock)).thenReturn("return_of_toString1");
            TypeLiteral typeLiteral = TypeLiteral.get(Object.class);
            InjectionPoint target = new InjectionPoint(typeLiteral, methodMock, false);
            //Act Statement(s)
            String result = target.toString();
            //Assert statement(s)
            assertThat(result, equalTo("return_of_toString1"));
            verify(methodMock).getAnnotatedParameterTypes();
            verify(methodMock).getParameterAnnotations();
            kotlinSupport.verify(() -> KotlinSupport.getInstance(), atLeast(1));
            verify(kotlinSupportInterfaceMock).getIsParameterKotlinNullablePredicate(methodMock);
            annotations.verify(() -> Annotations.getKey((TypeLiteral) any(), eq(methodMock), eq(annotationArray), (Errors) any()));
            nullability.verify(() -> Nullability.hasNullableAnnotation(annotationArray), atLeast(1));
            nullability.verify(() -> Nullability.hasNullableAnnotation(annotationArray2), atLeast(1));
            classes.verify(() -> Classes.toString(methodMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${169d487e-08f6-32da-afb1-d2befbaa712a}, hash: C51C047C70CD549F16D15A758326DA0A
    @Ignore()
    @Test()
    public void forConstructorWhenIsParameterKotlinNullableTestIndex() throws ErrorsException {
        /* Branches:
         * (for-each(type.getParameterTypes(member))) : true  #  inside forMember method
         * (Nullability.hasNullableAnnotation(parameterAnnotations)) : false  #  inside forMember method
         * (Nullability.hasNullableAnnotation(typeAnnotations)) : false  #  inside forMember method
         * (isParameterKotlinNullable.test(index)) : true  #  inside forMember method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Nullability> nullability = mockStatic(Nullability.class);
             MockedStatic<Annotations> annotations = mockStatic(Annotations.class);
             MockedStatic<KotlinSupport> kotlinSupport = mockStatic(KotlinSupport.class);
             MockedStatic<TypeLiteral> typeLiteral = mockStatic(TypeLiteral.class)) {
            doReturn(Object.class).when(constructorMock).getDeclaringClass();
            AnnotatedType[] annotatedTypeArray = new AnnotatedType[]{annotatedTypeMock};
            doReturn(annotatedTypeArray).when(constructorMock).getAnnotatedParameterTypes();
            Annotation[] annotationArray2 = new Annotation[]{};
            Annotation[][] annotationArray = new Annotation[][]{annotationArray2};
            doReturn(annotationArray).when(constructorMock).getParameterAnnotations();
            typeLiteral.when(() -> TypeLiteral.get(Object.class)).thenReturn(typeLiteralMock);
            TypeLiteral typeLiteral2 = TypeLiteral.get(Object.class);
            List<TypeLiteral<?>> anyList = new ArrayList<>();
            anyList.add(typeLiteral2);
            doReturn(anyList).when(typeLiteralMock).getParameterTypes(constructorMock);
            doNothing().when(kotlinSupportInterfaceMock).checkConstructorParameterAnnotations(eq(constructorMock), (Errors) any());
            kotlinSupport.when(() -> KotlinSupport.getInstance()).thenReturn(kotlinSupportInterfaceMock).thenReturn(kotlinSupportInterfaceMock2);
            doReturn(predicateMock).when(kotlinSupportInterfaceMock2).getIsParameterKotlinNullablePredicate(constructorMock);
            annotations.when(() -> Annotations.getKey((TypeLiteral) any(), eq(constructorMock), eq(annotationArray2), (Errors) any())).thenReturn(keyMock);
            nullability.when(() -> Nullability.hasNullableAnnotation(annotationArray2)).thenReturn(false);
            Annotation[] annotationArray3 = new Annotation[]{};
            nullability.when(() -> Nullability.hasNullableAnnotation(annotationArray3)).thenReturn(false);
            //Act Statement(s)
            InjectionPoint result = InjectionPoint.forConstructor(constructorMock);
            InjectionPoint injectionPoint = new InjectionPoint(typeLiteralMock, constructorMock);
            //Assert statement(s)
            assertThat(result, equalTo(injectionPoint));
            verify(constructorMock, atLeast(1)).getDeclaringClass();
            verify(constructorMock, atLeast(1)).getAnnotatedParameterTypes();
            verify(constructorMock, atLeast(1)).getParameterAnnotations();
            typeLiteral.verify(() -> TypeLiteral.get(Object.class), atLeast(1));
            verify(typeLiteralMock, atLeast(1)).getParameterTypes(constructorMock);
            kotlinSupport.verify(() -> KotlinSupport.getInstance(), atLeast(2));
            verify(kotlinSupportInterfaceMock).checkConstructorParameterAnnotations(eq(constructorMock), (Errors) any());
            verify(kotlinSupportInterfaceMock2).getIsParameterKotlinNullablePredicate(constructorMock);
            annotations.verify(() -> Annotations.getKey((TypeLiteral) any(), eq(constructorMock), eq(annotationArray2), (Errors) any()));
            nullability.verify(() -> Nullability.hasNullableAnnotation(annotationArray2), atLeast(1));
            nullability.verify(() -> Nullability.hasNullableAnnotation(annotationArray3), atLeast(1));
        }
    }

    //Sapient generated method id: ${d5d1d185-63e4-3f9b-9789-6a47db27cdd7}, hash: 8DBF65BE46CEF2EAD15B18D22D5F7855
    @Ignore()
    @Test()
    public void forConstructorWhenIsParameterKotlinNullableNotTestIndex() throws ErrorsException {
        /* Branches:
         * (for-each(type.getParameterTypes(member))) : true  #  inside forMember method
         * (Nullability.hasNullableAnnotation(parameterAnnotations)) : false  #  inside forMember method
         * (Nullability.hasNullableAnnotation(typeAnnotations)) : false  #  inside forMember method
         * (isParameterKotlinNullable.test(index)) : false  #  inside forMember method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TypeLiteral typeLiteral2Mock = mock(TypeLiteral.class);
        try (MockedStatic<Nullability> nullability = mockStatic(Nullability.class);
             MockedStatic<Annotations> annotations = mockStatic(Annotations.class);
             MockedStatic<KotlinSupport> kotlinSupport = mockStatic(KotlinSupport.class);
             MockedStatic<TypeLiteral> typeLiteral = mockStatic(TypeLiteral.class)) {
            typeLiteral.when(() -> TypeLiteral.get(Object.class)).thenReturn(typeLiteralMock);
            List<TypeLiteral<?>> anyList = new ArrayList<>();
            anyList.add(typeLiteral2Mock);
            doReturn(anyList).when(typeLiteralMock).getParameterTypes(constructorMock);
            doNothing().when(kotlinSupportInterfaceMock).checkConstructorParameterAnnotations(eq(constructorMock), (Errors) any());
            kotlinSupport.when(() -> KotlinSupport.getInstance()).thenReturn(kotlinSupportInterfaceMock).thenReturn(kotlinSupportInterfaceMock2);
            Predicate<Integer> predicate = kotlinSupportInterfaceMock2.getIsParameterKotlinNullablePredicate(constructorMock);
            doReturn(predicate).when(kotlinSupportInterfaceMock2).getIsParameterKotlinNullablePredicate(constructorMock);
            Annotation[] annotationArray = new Annotation[]{};
            annotations.when(() -> Annotations.getKey(eq(typeLiteral2Mock), eq(constructorMock), eq(annotationArray), (Errors) any())).thenReturn(keyMock);
            nullability.when(() -> Nullability.hasNullableAnnotation(annotationArray)).thenReturn(false);
            Annotation[] annotationArray2 = new Annotation[]{};
            nullability.when(() -> Nullability.hasNullableAnnotation(annotationArray2)).thenReturn(false);
            //Act Statement(s)
            InjectionPoint result = InjectionPoint.forConstructor(constructorMock);
            InjectionPoint injectionPoint = new InjectionPoint(typeLiteralMock, constructorMock);
            //Assert statement(s)
            assertThat(result, equalTo(injectionPoint));
            typeLiteral.verify(() -> TypeLiteral.get(Object.class), atLeast(1));
            verify(typeLiteralMock, atLeast(1)).getParameterTypes(constructorMock);
            kotlinSupport.verify(() -> KotlinSupport.getInstance(), atLeast(2));
            verify(kotlinSupportInterfaceMock).checkConstructorParameterAnnotations(eq(constructorMock), (Errors) any());
            verify(kotlinSupportInterfaceMock2).getIsParameterKotlinNullablePredicate(constructorMock);
            annotations.verify(() -> Annotations.getKey(eq(typeLiteral2Mock), eq(constructorMock), eq(annotationArray), (Errors) any()));
            nullability.verify(() -> Nullability.hasNullableAnnotation(annotationArray), atLeast(1));
            nullability.verify(() -> Nullability.hasNullableAnnotation(annotationArray2), atLeast(1));
        }
    }

    //Sapient generated method id: ${eb776061-af16-3918-8a8d-cbb2c419a72c}, hash: C172889A0E6C6AA0009679044C5504EF
    @Ignore()
    @Test()
    public void forConstructorWhenCaughtConfigurationException() throws ErrorsException {
        /* Branches:
         * (for-each(type.getParameterTypes(member))) : true  #  inside forMember method
         * (Nullability.hasNullableAnnotation(parameterAnnotations)) : false  #  inside forMember method
         * (Nullability.hasNullableAnnotation(typeAnnotations)) : false  #  inside forMember method
         * (isParameterKotlinNullable.test(index)) : true  #  inside forMember method
         * (catch-exception (ConfigurationException)) : true  #  inside forMember method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Nullability> nullability = mockStatic(Nullability.class);
             MockedStatic<Annotations> annotations = mockStatic(Annotations.class);
             MockedStatic<KotlinSupport> kotlinSupport = mockStatic(KotlinSupport.class);
             MockedStatic<TypeLiteral> typeLiteral = mockStatic(TypeLiteral.class)) {
            doReturn(Object.class).when(constructorMock).getDeclaringClass();
            AnnotatedType[] annotatedTypeArray = new AnnotatedType[]{annotatedTypeMock};
            doReturn(annotatedTypeArray).when(constructorMock).getAnnotatedParameterTypes();
            Annotation[] annotationArray2 = new Annotation[]{};
            Annotation[][] annotationArray = new Annotation[][]{annotationArray2};
            doReturn(annotationArray).when(constructorMock).getParameterAnnotations();
            typeLiteral.when(() -> TypeLiteral.get(Object.class)).thenReturn(typeLiteralMock);
            TypeLiteral typeLiteral2 = TypeLiteral.get(Object.class);
            List<TypeLiteral<?>> anyList = new ArrayList<>();
            anyList.add(typeLiteral2);
            doReturn(anyList).when(typeLiteralMock).getParameterTypes(constructorMock);
            doNothing().when(kotlinSupportInterfaceMock).checkConstructorParameterAnnotations(eq(constructorMock), (Errors) any());
            kotlinSupport.when(() -> KotlinSupport.getInstance()).thenReturn(kotlinSupportInterfaceMock).thenReturn(kotlinSupportInterfaceMock2);
            doReturn(predicateMock).when(kotlinSupportInterfaceMock2).getIsParameterKotlinNullablePredicate(constructorMock);
            annotations.when(() -> Annotations.getKey((TypeLiteral) any(), eq(constructorMock), eq(annotationArray2), (Errors) any())).thenReturn(keyMock);
            nullability.when(() -> Nullability.hasNullableAnnotation(annotationArray2)).thenReturn(false);
            Annotation[] annotationArray3 = new Annotation[]{};
            nullability.when(() -> Nullability.hasNullableAnnotation(annotationArray3)).thenReturn(false);
            //Act Statement(s)
            InjectionPoint result = InjectionPoint.forConstructor(constructorMock);
            InjectionPoint injectionPoint = new InjectionPoint(typeLiteralMock, constructorMock);
            //Assert statement(s)
            assertThat(result, equalTo(injectionPoint));
            verify(constructorMock, atLeast(1)).getDeclaringClass();
            verify(constructorMock, atLeast(1)).getAnnotatedParameterTypes();
            verify(constructorMock, atLeast(1)).getParameterAnnotations();
            typeLiteral.verify(() -> TypeLiteral.get(Object.class), atLeast(1));
            verify(typeLiteralMock, atLeast(1)).getParameterTypes(constructorMock);
            kotlinSupport.verify(() -> KotlinSupport.getInstance(), atLeast(2));
            verify(kotlinSupportInterfaceMock).checkConstructorParameterAnnotations(eq(constructorMock), (Errors) any());
            verify(kotlinSupportInterfaceMock2).getIsParameterKotlinNullablePredicate(constructorMock);
            annotations.verify(() -> Annotations.getKey((TypeLiteral) any(), eq(constructorMock), eq(annotationArray2), (Errors) any()));
            nullability.verify(() -> Nullability.hasNullableAnnotation(annotationArray2), atLeast(1));
            nullability.verify(() -> Nullability.hasNullableAnnotation(annotationArray3), atLeast(1));
        }
    }

    //Sapient generated method id: ${17bf4f5a-6619-3ada-927a-083cb7171c84}, hash: 0F1A75E997E8F233BCCC8694CB78DA25
    @Ignore()
    @Test()
    public void forConstructorWhenCaughtErrorsException() throws ErrorsException {
        /* Branches:
         * (for-each(type.getParameterTypes(member))) : true  #  inside forMember method
         * (Nullability.hasNullableAnnotation(parameterAnnotations)) : false  #  inside forMember method
         * (Nullability.hasNullableAnnotation(typeAnnotations)) : false  #  inside forMember method
         * (isParameterKotlinNullable.test(index)) : true  #  inside forMember method
         * (catch-exception (ErrorsException)) : true  #  inside forMember method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Nullability> nullability = mockStatic(Nullability.class);
             MockedStatic<Annotations> annotations = mockStatic(Annotations.class);
             MockedStatic<KotlinSupport> kotlinSupport = mockStatic(KotlinSupport.class);
             MockedStatic<TypeLiteral> typeLiteral = mockStatic(TypeLiteral.class)) {
            doReturn(Object.class).when(constructorMock).getDeclaringClass();
            AnnotatedType[] annotatedTypeArray = new AnnotatedType[]{annotatedTypeMock};
            doReturn(annotatedTypeArray).when(constructorMock).getAnnotatedParameterTypes();
            Annotation[] annotationArray2 = new Annotation[]{};
            Annotation[][] annotationArray = new Annotation[][]{annotationArray2};
            doReturn(annotationArray).when(constructorMock).getParameterAnnotations();
            typeLiteral.when(() -> TypeLiteral.get(Object.class)).thenReturn(typeLiteralMock);
            TypeLiteral typeLiteral2 = TypeLiteral.get(Object.class);
            List<TypeLiteral<?>> anyList = new ArrayList<>();
            anyList.add(typeLiteral2);
            doReturn(anyList).when(typeLiteralMock).getParameterTypes(constructorMock);
            doNothing().when(kotlinSupportInterfaceMock).checkConstructorParameterAnnotations(eq(constructorMock), (Errors) any());
            kotlinSupport.when(() -> KotlinSupport.getInstance()).thenReturn(kotlinSupportInterfaceMock).thenReturn(kotlinSupportInterfaceMock2);
            doReturn(predicateMock).when(kotlinSupportInterfaceMock2).getIsParameterKotlinNullablePredicate(constructorMock);
            annotations.when(() -> Annotations.getKey((TypeLiteral) any(), eq(constructorMock), eq(annotationArray2), (Errors) any())).thenReturn(keyMock);
            nullability.when(() -> Nullability.hasNullableAnnotation(annotationArray2)).thenReturn(false);
            Annotation[] annotationArray3 = new Annotation[]{};
            nullability.when(() -> Nullability.hasNullableAnnotation(annotationArray3)).thenReturn(false);
            //Act Statement(s)
            InjectionPoint result = InjectionPoint.forConstructor(constructorMock);
            InjectionPoint injectionPoint = new InjectionPoint(typeLiteralMock, constructorMock);
            //Assert statement(s)
            assertThat(result, equalTo(injectionPoint));
            verify(constructorMock, atLeast(1)).getDeclaringClass();
            verify(constructorMock, atLeast(1)).getAnnotatedParameterTypes();
            verify(constructorMock, atLeast(1)).getParameterAnnotations();
            typeLiteral.verify(() -> TypeLiteral.get(Object.class), atLeast(1));
            verify(typeLiteralMock, atLeast(1)).getParameterTypes(constructorMock);
            kotlinSupport.verify(() -> KotlinSupport.getInstance(), atLeast(2));
            verify(kotlinSupportInterfaceMock).checkConstructorParameterAnnotations(eq(constructorMock), (Errors) any());
            verify(kotlinSupportInterfaceMock2).getIsParameterKotlinNullablePredicate(constructorMock);
            annotations.verify(() -> Annotations.getKey((TypeLiteral) any(), eq(constructorMock), eq(annotationArray2), (Errors) any()));
            nullability.verify(() -> Nullability.hasNullableAnnotation(annotationArray2), atLeast(1));
            nullability.verify(() -> Nullability.hasNullableAnnotation(annotationArray3), atLeast(1));
        }
    }

    //Sapient generated method id: ${4a54f13d-5a15-3a63-8d4d-c2176080da7b}, hash: F797031ACC798345DA0A71863841046F
    @Ignore()
    @Test()
    public void forConstructor1WhenIsParameterKotlinNullableTestIndex() throws ErrorsException {
        /* Branches:
         * (type.getRawType() != constructor.getDeclaringClass()) : true
         * (for-each(type.getParameterTypes(member))) : true  #  inside forMember method
         * (Nullability.hasNullableAnnotation(parameterAnnotations)) : false  #  inside forMember method
         * (Nullability.hasNullableAnnotation(typeAnnotations)) : false  #  inside forMember method
         * (isParameterKotlinNullable.test(index)) : true  #  inside forMember method
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: object of type Errors
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Nullability> nullability = mockStatic(Nullability.class);
             MockedStatic<Annotations> annotations = mockStatic(Annotations.class);
             MockedStatic<KotlinSupport> kotlinSupport = mockStatic(KotlinSupport.class)) {
            doReturn(Object.class).when(constructorMock).getDeclaringClass();
            AnnotatedType[] annotatedTypeArray = new AnnotatedType[]{annotatedTypeMock};
            doReturn(annotatedTypeArray).when(constructorMock).getAnnotatedParameterTypes();
            Annotation[] annotationArray2 = new Annotation[]{};
            Annotation[][] annotationArray = new Annotation[][]{annotationArray2};
            doReturn(annotationArray).when(constructorMock).getParameterAnnotations();
            doNothing().when(kotlinSupportInterfaceMock).checkConstructorParameterAnnotations(eq(constructorMock), (Errors) any());
            kotlinSupport.when(() -> KotlinSupport.getInstance()).thenReturn(kotlinSupportInterfaceMock).thenReturn(kotlinSupportInterfaceMock2);
            doReturn(predicateMock).when(kotlinSupportInterfaceMock2).getIsParameterKotlinNullablePredicate(constructorMock);
            annotations.when(() -> Annotations.getKey((TypeLiteral) any(), eq(constructorMock), eq(annotationArray2), (Errors) any())).thenReturn(keyMock);
            nullability.when(() -> Nullability.hasNullableAnnotation(annotationArray2)).thenReturn(false);
            Annotation[] annotationArray3 = new Annotation[]{};
            nullability.when(() -> Nullability.hasNullableAnnotation(annotationArray3)).thenReturn(false);
            TypeLiteral typeLiteral = TypeLiteral.get(Object.class);
            //Act Statement(s)
            InjectionPoint result = InjectionPoint.forConstructor(constructorMock, typeLiteral);
            InjectionPoint injectionPoint = new InjectionPoint(typeLiteral, constructorMock);
            //Assert statement(s)
            assertThat(result, equalTo(injectionPoint));
            verify(constructorMock, atLeast(1)).getDeclaringClass();
            verify(constructorMock, atLeast(1)).getAnnotatedParameterTypes();
            verify(constructorMock, atLeast(1)).getParameterAnnotations();
            kotlinSupport.verify(() -> KotlinSupport.getInstance(), atLeast(2));
            verify(kotlinSupportInterfaceMock).checkConstructorParameterAnnotations(eq(constructorMock), (Errors) any());
            verify(kotlinSupportInterfaceMock2).getIsParameterKotlinNullablePredicate(constructorMock);
            annotations.verify(() -> Annotations.getKey((TypeLiteral) any(), eq(constructorMock), eq(annotationArray2), (Errors) any()));
            nullability.verify(() -> Nullability.hasNullableAnnotation(annotationArray2), atLeast(1));
            nullability.verify(() -> Nullability.hasNullableAnnotation(annotationArray3), atLeast(1));
        }
    }

    //Sapient generated method id: ${9b01874c-8994-3913-b2e7-f945346b9b3b}, hash: 405D0F8247AD126DFAA5C693E2BA9E80
    @Ignore()
    @Test()
    public void forConstructor1WhenIsParameterKotlinNullableNotTestIndex() throws ErrorsException {
        /* Branches:
         * (type.getRawType() != constructor.getDeclaringClass()) : true
         * (for-each(type.getParameterTypes(member))) : true  #  inside forMember method
         * (Nullability.hasNullableAnnotation(parameterAnnotations)) : false  #  inside forMember method
         * (Nullability.hasNullableAnnotation(typeAnnotations)) : false  #  inside forMember method
         * (isParameterKotlinNullable.test(index)) : false  #  inside forMember method
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: object of type Errors
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TypeLiteral<Object> typeMock = mock(TypeLiteral.class);
        try (MockedStatic<Nullability> nullability = mockStatic(Nullability.class);
             MockedStatic<Annotations> annotations = mockStatic(Annotations.class);
             MockedStatic<KotlinSupport> kotlinSupport = mockStatic(KotlinSupport.class)) {
            doReturn(java.lang.Object.class).when(typeMock).getRawType();
            List<TypeLiteral<?>> anyList = new ArrayList<>();
            anyList.add(typeLiteralMock);
            doReturn(anyList).when(typeMock).getParameterTypes(constructorMock);
            doNothing().when(kotlinSupportInterfaceMock).checkConstructorParameterAnnotations(eq(constructorMock), (Errors) any());
            kotlinSupport.when(() -> KotlinSupport.getInstance()).thenReturn(kotlinSupportInterfaceMock).thenReturn(kotlinSupportInterfaceMock2);
            Predicate<Integer> predicate = kotlinSupportInterfaceMock2.getIsParameterKotlinNullablePredicate(constructorMock);
            doReturn(predicate).when(kotlinSupportInterfaceMock2).getIsParameterKotlinNullablePredicate(constructorMock);
            Annotation[] annotationArray = new Annotation[]{};
            annotations.when(() -> Annotations.getKey(eq(typeLiteralMock), eq(constructorMock), eq(annotationArray), (Errors) any())).thenReturn(keyMock);
            nullability.when(() -> Nullability.hasNullableAnnotation(annotationArray)).thenReturn(false);
            Annotation[] annotationArray2 = new Annotation[]{};
            nullability.when(() -> Nullability.hasNullableAnnotation(annotationArray2)).thenReturn(false);
            //Act Statement(s)
            InjectionPoint result = InjectionPoint.forConstructor(constructorMock, typeMock);
            InjectionPoint injectionPoint = new InjectionPoint(typeMock, constructorMock);
            //Assert statement(s)
            assertThat(result, equalTo(injectionPoint));
            verify(typeMock, atLeast(1)).getRawType();
            verify(typeMock, atLeast(1)).getParameterTypes(constructorMock);
            kotlinSupport.verify(() -> KotlinSupport.getInstance(), atLeast(2));
            verify(kotlinSupportInterfaceMock).checkConstructorParameterAnnotations(eq(constructorMock), (Errors) any());
            verify(kotlinSupportInterfaceMock2).getIsParameterKotlinNullablePredicate(constructorMock);
            annotations.verify(() -> Annotations.getKey(eq(typeLiteralMock), eq(constructorMock), eq(annotationArray), (Errors) any()));
            nullability.verify(() -> Nullability.hasNullableAnnotation(annotationArray), atLeast(1));
            nullability.verify(() -> Nullability.hasNullableAnnotation(annotationArray2), atLeast(1));
        }
    }

    //Sapient generated method id: ${6996458b-3f04-3bcf-b695-51afee4d334f}, hash: 44981E9B04EE9FDD24C0DA9ECAFE19CC
    @Ignore()
    @Test()
    public void forConstructor1WhenCaughtConfigurationException() throws ErrorsException {
        /* Branches:
         * (type.getRawType() != constructor.getDeclaringClass()) : true
         * (for-each(type.getParameterTypes(member))) : true  #  inside forMember method
         * (Nullability.hasNullableAnnotation(parameterAnnotations)) : false  #  inside forMember method
         * (Nullability.hasNullableAnnotation(typeAnnotations)) : false  #  inside forMember method
         * (isParameterKotlinNullable.test(index)) : true  #  inside forMember method
         * (catch-exception (ConfigurationException)) : true  #  inside forMember method
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: object of type Errors
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Nullability> nullability = mockStatic(Nullability.class);
             MockedStatic<Annotations> annotations = mockStatic(Annotations.class);
             MockedStatic<KotlinSupport> kotlinSupport = mockStatic(KotlinSupport.class)) {
            doReturn(Object.class).when(constructorMock).getDeclaringClass();
            AnnotatedType[] annotatedTypeArray = new AnnotatedType[]{annotatedTypeMock};
            doReturn(annotatedTypeArray).when(constructorMock).getAnnotatedParameterTypes();
            Annotation[] annotationArray2 = new Annotation[]{};
            Annotation[][] annotationArray = new Annotation[][]{annotationArray2};
            doReturn(annotationArray).when(constructorMock).getParameterAnnotations();
            doNothing().when(kotlinSupportInterfaceMock).checkConstructorParameterAnnotations(eq(constructorMock), (Errors) any());
            kotlinSupport.when(() -> KotlinSupport.getInstance()).thenReturn(kotlinSupportInterfaceMock).thenReturn(kotlinSupportInterfaceMock2);
            doReturn(predicateMock).when(kotlinSupportInterfaceMock2).getIsParameterKotlinNullablePredicate(constructorMock);
            annotations.when(() -> Annotations.getKey((TypeLiteral) any(), eq(constructorMock), eq(annotationArray2), (Errors) any())).thenReturn(keyMock);
            nullability.when(() -> Nullability.hasNullableAnnotation(annotationArray2)).thenReturn(false);
            Annotation[] annotationArray3 = new Annotation[]{};
            nullability.when(() -> Nullability.hasNullableAnnotation(annotationArray3)).thenReturn(false);
            TypeLiteral typeLiteral = TypeLiteral.get(Object.class);
            //Act Statement(s)
            InjectionPoint result = InjectionPoint.forConstructor(constructorMock, typeLiteral);
            InjectionPoint injectionPoint = new InjectionPoint(typeLiteral, constructorMock);
            //Assert statement(s)
            assertThat(result, equalTo(injectionPoint));
            verify(constructorMock, atLeast(1)).getDeclaringClass();
            verify(constructorMock, atLeast(1)).getAnnotatedParameterTypes();
            verify(constructorMock, atLeast(1)).getParameterAnnotations();
            kotlinSupport.verify(() -> KotlinSupport.getInstance(), atLeast(2));
            verify(kotlinSupportInterfaceMock).checkConstructorParameterAnnotations(eq(constructorMock), (Errors) any());
            verify(kotlinSupportInterfaceMock2).getIsParameterKotlinNullablePredicate(constructorMock);
            annotations.verify(() -> Annotations.getKey((TypeLiteral) any(), eq(constructorMock), eq(annotationArray2), (Errors) any()));
            nullability.verify(() -> Nullability.hasNullableAnnotation(annotationArray2), atLeast(1));
            nullability.verify(() -> Nullability.hasNullableAnnotation(annotationArray3), atLeast(1));
        }
    }

    //Sapient generated method id: ${51ed6573-fa63-3b4e-af00-6fcd3ba465f5}, hash: 593960CD398A25ED5A8A0654A8617E5B
    @Test()
    public void forConstructorOfTest() throws NoSuchFieldException, ErrorsException, NoSuchMethodException {
        //Arrange Statement(s)
        try (MockedStatic<InjectionPoint> injectionPoint = mockStatic(InjectionPoint.class, CALLS_REAL_METHODS)) {
            injectionPoint.when(() -> InjectionPoint.forConstructorOf(typeLiteralMock, false)).thenReturn(injectionPointMock);
            //Act Statement(s)
            InjectionPoint result = InjectionPoint.forConstructorOf(typeLiteralMock);
            //Assert statement(s)
            assertThat(result, equalTo(injectionPointMock));
            injectionPoint.verify(() -> InjectionPoint.forConstructorOf(typeLiteralMock, false), atLeast(1));
        }
    }

    //Sapient generated method id: ${74ee2d03-297b-397f-87c1-27039f9f485f}, hash: 4B99BAF49B1B4FFDF6CFE24E7EBEEADF
    @Ignore()
    @Test()
    public void forConstructorOf1WhenModifierIsPrivateNoArgConstructorGetModifiersAndModifierNotIsPrivateRaThrowsConfigurationException() {
        /* Branches:
         * (branch expression (line 305)) : true
         * (branch expression (line 306)) : true
         * (atInjectConstructors.size() > 1) : true
         * (atInjectRequired) : true
         * (injectableConstructor == null) : true
         * (injectableConstructor != null) : false
         * (Modifier.isPrivate(noArgConstructor.getModifiers())) : true
         * (!Modifier.isPrivate(rawType.getModifiers())) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: errors
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<MoreTypes> moreTypes = mockStatic(MoreTypes.class)) {
            doReturn(typeMock2).when(typeMock).getType();
            moreTypes.when(() -> MoreTypes.getRawType(typeMock2)).thenReturn(Object.class);
            thrown.expect(ConfigurationException.class);
            //Act Statement(s)
            InjectionPoint.forConstructorOf(typeMock, false);
            //Assert statement(s)
            verify(typeMock).getType();
            moreTypes.verify(() -> MoreTypes.getRawType(typeMock2), atLeast(1));
        }
    }

    //Sapient generated method id: ${c269c104-d53e-3347-b1bb-df88fee35666}, hash: AD7E96347548D255E9C2E492885E4FA4
    @Ignore()
    @Test()
    public void forConstructorOf1WhenNotAtInjectRequiredAndInjectableConstructorIsNotNullAndTypeGetParameterTypesMemberIsEmpty() throws NoSuchFieldException, ErrorsException, NoSuchMethodException {
        /* Branches:
         * (branch expression (line 305)) : true
         * (branch expression (line 306)) : true
         * (atInjectConstructors.size() > 1) : false
         * (injectableConstructor != null) : true
         * (misplacedBindingAnnotation == null) : false  #  inside checkForMisplacedBindingAnnotations method
         * (member instanceof Method) : false  #  inside checkForMisplacedBindingAnnotations method
         * (atInjectRequired) : false
         * (injectableConstructor != null) : true
         * (for-each(type.getParameterTypes(member))) : false  #  inside forMember method
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: errors
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<KotlinSupport> kotlinSupport = mockStatic(KotlinSupport.class);
             MockedStatic<Annotations> annotations = mockStatic(Annotations.class);
             MockedStatic<MoreTypes> moreTypes = mockStatic(MoreTypes.class)) {
            doReturn(typeMock2).when(typeMock).getType();
            List<TypeLiteral<?>> anyList = new ArrayList<>();
            doReturn(anyList).when(typeMock).getParameterTypes(constructorMock);
            moreTypes.when(() -> MoreTypes.getRawType(typeMock2)).thenReturn(Object.class);
            Annotation[] annotationArray = new Annotation[]{};
            annotations.when(() -> Annotations.findBindingAnnotation((Errors) any(), eq(constructorMock), eq(annotationArray))).thenReturn(annotationMock);
            doNothing().when(kotlinSupportInterfaceMock).checkConstructorParameterAnnotations(eq(constructorMock), (Errors) any());
            kotlinSupport.when(() -> KotlinSupport.getInstance()).thenReturn(kotlinSupportInterfaceMock).thenReturn(kotlinSupportInterfaceMock2);
            Predicate<Integer> predicate = kotlinSupportInterfaceMock2.getIsParameterKotlinNullablePredicate(constructorMock);
            doReturn(predicate).when(kotlinSupportInterfaceMock2).getIsParameterKotlinNullablePredicate(constructorMock);
            //Act Statement(s)
            InjectionPoint result = InjectionPoint.forConstructorOf(typeMock, false);
            InjectionPoint injectionPoint = new InjectionPoint(typeMock, constructorMock);
            //Assert statement(s)
            assertThat(result, equalTo(injectionPoint));
            verify(typeMock, atLeast(1)).getType();
            verify(typeMock, atLeast(1)).getParameterTypes(constructorMock);
            moreTypes.verify(() -> MoreTypes.getRawType(typeMock2), atLeast(1));
            annotations.verify(() -> Annotations.findBindingAnnotation((Errors) any(), eq(constructorMock), eq(annotationArray)));
            kotlinSupport.verify(() -> KotlinSupport.getInstance(), atLeast(2));
            verify(kotlinSupportInterfaceMock).checkConstructorParameterAnnotations(eq(constructorMock), (Errors) any());
            verify(kotlinSupportInterfaceMock2).getIsParameterKotlinNullablePredicate(constructorMock);
        }
    }

    //Sapient generated method id: ${fb99bd95-7373-3ccd-a5ff-164ca5e7a35f}, hash: B1E6077103822AD6E1280FFED13F9C32
    @Ignore()
    @Test()
    public void forConstructorOf1WhenMisplacedBindingAnnotationIsNotNullAndMemberNotInstanceOfMethodAndTypeGetParameterTypesMemberIsEmp() throws NoSuchFieldException, ErrorsException, NoSuchMethodException {
        /* Branches:
         * (branch expression (line 305)) : false
         * (atInjectConstructors.size() > 1) : false
         * (injectableConstructor != null) : false
         * (atInjectRequired) : false
         * (injectableConstructor != null) : false
         * (Modifier.isPrivate(noArgConstructor.getModifiers())) : false
         * (misplacedBindingAnnotation == null) : false  #  inside checkForMisplacedBindingAnnotations method
         * (member instanceof Method) : false  #  inside checkForMisplacedBindingAnnotations method
         * (for-each(type.getParameterTypes(member))) : false  #  inside forMember method
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: errors
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<KotlinSupport> kotlinSupport = mockStatic(KotlinSupport.class);
             MockedStatic<Annotations> annotations = mockStatic(Annotations.class);
             MockedStatic<MoreTypes> moreTypes = mockStatic(MoreTypes.class)) {
            doReturn(typeMock2).when(typeMock).getType();
            List<TypeLiteral<?>> anyList = new ArrayList<>();
            doReturn(anyList).when(typeMock).getParameterTypes(constructorMock);
            moreTypes.when(() -> MoreTypes.getRawType(typeMock2)).thenReturn(Object.class);
            Annotation[] annotationArray = new Annotation[]{};
            annotations.when(() -> Annotations.findBindingAnnotation((Errors) any(), eq(constructorMock), eq(annotationArray))).thenReturn(annotationMock);
            doNothing().when(kotlinSupportInterfaceMock).checkConstructorParameterAnnotations(eq(constructorMock), (Errors) any());
            kotlinSupport.when(() -> KotlinSupport.getInstance()).thenReturn(kotlinSupportInterfaceMock).thenReturn(kotlinSupportInterfaceMock2);
            Predicate<Integer> predicate = kotlinSupportInterfaceMock2.getIsParameterKotlinNullablePredicate(constructorMock);
            doReturn(predicate).when(kotlinSupportInterfaceMock2).getIsParameterKotlinNullablePredicate(constructorMock);
            //Act Statement(s)
            InjectionPoint result = InjectionPoint.forConstructorOf(typeMock, false);
            InjectionPoint injectionPoint = new InjectionPoint(typeMock, constructorMock);
            //Assert statement(s)
            assertThat(result, equalTo(injectionPoint));
            verify(typeMock, atLeast(1)).getType();
            verify(typeMock, atLeast(1)).getParameterTypes(constructorMock);
            moreTypes.verify(() -> MoreTypes.getRawType(typeMock2), atLeast(1));
            annotations.verify(() -> Annotations.findBindingAnnotation((Errors) any(), eq(constructorMock), eq(annotationArray)));
            kotlinSupport.verify(() -> KotlinSupport.getInstance(), atLeast(2));
            verify(kotlinSupportInterfaceMock).checkConstructorParameterAnnotations(eq(constructorMock), (Errors) any());
            verify(kotlinSupportInterfaceMock2).getIsParameterKotlinNullablePredicate(constructorMock);
        }
    }

    //Sapient generated method id: ${d817c906-1fb6-3814-a66f-5af550228a91}, hash: F5D91EB76550DAD9A6B494E4C401725A
    @Ignore()
    @Test()
    public void forConstructorOf1WhenMemberNotInstanceOfMethodAndTypeGetParameterTypesMemberIsEmpty5() throws NoSuchFieldException, ErrorsException, NoSuchMethodException {
        /* Branches:
         * (branch expression (line 305)) : true
         * (branch expression (line 306)) : false
         * (atInjectConstructors.size() > 1) : false
         * (injectableConstructor != null) : false
         * (atInjectRequired) : false
         * (injectableConstructor != null) : false
         * (Modifier.isPrivate(noArgConstructor.getModifiers())) : false
         * (misplacedBindingAnnotation == null) : false  #  inside checkForMisplacedBindingAnnotations method
         * (member instanceof Method) : false  #  inside checkForMisplacedBindingAnnotations method
         * (for-each(type.getParameterTypes(member))) : false  #  inside forMember method
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: errors
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<KotlinSupport> kotlinSupport = mockStatic(KotlinSupport.class);
             MockedStatic<Annotations> annotations = mockStatic(Annotations.class);
             MockedStatic<MoreTypes> moreTypes = mockStatic(MoreTypes.class)) {
            doReturn(typeMock2).when(typeMock).getType();
            List<TypeLiteral<?>> anyList = new ArrayList<>();
            doReturn(anyList).when(typeMock).getParameterTypes(constructorMock);
            moreTypes.when(() -> MoreTypes.getRawType(typeMock2)).thenReturn(Object.class);
            Annotation[] annotationArray = new Annotation[]{};
            annotations.when(() -> Annotations.findBindingAnnotation((Errors) any(), eq(constructorMock), eq(annotationArray))).thenReturn(annotationMock);
            doNothing().when(kotlinSupportInterfaceMock).checkConstructorParameterAnnotations(eq(constructorMock), (Errors) any());
            kotlinSupport.when(() -> KotlinSupport.getInstance()).thenReturn(kotlinSupportInterfaceMock).thenReturn(kotlinSupportInterfaceMock2);
            Predicate<Integer> predicate = kotlinSupportInterfaceMock2.getIsParameterKotlinNullablePredicate(constructorMock);
            doReturn(predicate).when(kotlinSupportInterfaceMock2).getIsParameterKotlinNullablePredicate(constructorMock);
            //Act Statement(s)
            InjectionPoint result = InjectionPoint.forConstructorOf(typeMock, false);
            InjectionPoint injectionPoint = new InjectionPoint(typeMock, constructorMock);
            //Assert statement(s)
            assertThat(result, equalTo(injectionPoint));
            verify(typeMock, atLeast(1)).getType();
            verify(typeMock, atLeast(1)).getParameterTypes(constructorMock);
            moreTypes.verify(() -> MoreTypes.getRawType(typeMock2), atLeast(1));
            annotations.verify(() -> Annotations.findBindingAnnotation((Errors) any(), eq(constructorMock), eq(annotationArray)));
            kotlinSupport.verify(() -> KotlinSupport.getInstance(), atLeast(2));
            verify(kotlinSupportInterfaceMock).checkConstructorParameterAnnotations(eq(constructorMock), (Errors) any());
            verify(kotlinSupportInterfaceMock2).getIsParameterKotlinNullablePredicate(constructorMock);
        }
    }

    //Sapient generated method id: ${f68ed3d2-0d17-3daa-8b82-5b9ddad1a12f}, hash: FDB7081A9FCE61544679929F4EDEDA1B
    @Test()
    public void forConstructorOf1WhenTypeGetParameterTypesMemberIsEmptyAndCaughtNoSuchMethodExceptionThrowsConfigurationException() throws SecurityException, NoSuchMethodException {
        /* Branches:
         * (branch expression (line 305)) : false
         * (atInjectConstructors.size() > 1) : false
         * (injectableConstructor != null) : false
         * (atInjectRequired) : false
         * (injectableConstructor != null) : false
         * (Modifier.isPrivate(noArgConstructor.getModifiers())) : false
         * (misplacedBindingAnnotation == null) : false  #  inside checkForMisplacedBindingAnnotations method
         * (member instanceof Method) : false  #  inside checkForMisplacedBindingAnnotations method
         * (for-each(type.getParameterTypes(member))) : false  #  inside forMember method
         * (catch-exception (NoSuchMethodException)) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: errors
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        /*try (MockedStatic<KotlinSupport> kotlinSupport = mockStatic(KotlinSupport.class);
    MockedStatic<Annotations> annotations = mockStatic(Annotations.class);
    MockedStatic<MoreTypes> moreTypes = mockStatic(MoreTypes.class)) {
    doReturn(typeMock2).when(typeMock).getType();
    List<TypeLiteral<?>> anyList = new ArrayList<>();
    doReturn(anyList).when(typeMock).getParameterTypes((Member) any());
    moreTypes.when(() -> MoreTypes.getRawType(typeMock2)).thenReturn(Object.class);
    Annotation annotation = annotationArray[0];
    Annotation[] annotationArray = new Annotation[] { annotation };
    annotations.when(() -> Annotations.findBindingAnnotation((Errors) any(), (Member) any(), eq(annotationArray))).thenReturn(annotationMock);
    doNothing().when(kotlinSupportInterfaceMock).checkConstructorParameterAnnotations((Constructor) any(), (Errors) any());
    KotlinSupportInterface kotlinSupportInterface = KotlinSupport.getInstance();
    kotlinSupport.when(() -> KotlinSupport.getInstance()).thenReturn(kotlinSupportInterfaceMock).thenReturn(kotlinSupportInterface);
    thrown.expect(ConfigurationException.class);
    //Act Statement(s)
    InjectionPoint.forConstructorOf(typeMock, false);
    //Assert statement(s)
    verify(typeMock).getType();
    verify(typeMock).getParameterTypes((Member) any());
    moreTypes.verify(() -> MoreTypes.getRawType(typeMock2), atLeast(1));
    annotations.verify(() -> Annotations.findBindingAnnotation((Errors) any(), (Member) any(), eq(annotationArray)));
    kotlinSupport.verify(() -> KotlinSupport.getInstance(), atLeast(2));
    verify(kotlinSupportInterfaceMock).checkConstructorParameterAnnotations((Constructor) any(), (Errors) any());
}*/
    }

    //Sapient generated method id: ${52298a51-bf99-3511-9373-7bb35a10fa02}, hash: 85036C0CBAF924FFE6968269C390B2C8
    @Ignore()
    @Test()
    public void forConstructorOf1WhenMisplacedBindingAnnotationIsNullAndTypeGetParameterTypesMemberIsEmptyAThrowsConfigurationException() throws SecurityException, NoSuchMethodException {
        /* Branches:
         * (branch expression (line 305)) : true
         * (branch expression (line 306)) : true
         * (atInjectConstructors.size() > 1) : true
         * (atInjectRequired) : true
         * (injectableConstructor == null) : true
         * (injectableConstructor != null) : false
         * (Modifier.isPrivate(noArgConstructor.getModifiers())) : true
         * (!Modifier.isPrivate(rawType.getModifiers())) : false
         * (misplacedBindingAnnotation == null) : true  #  inside checkForMisplacedBindingAnnotations method
         * (for-each(type.getParameterTypes(member))) : false  #  inside forMember method
         * (catch-exception (NoSuchMethodException)) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: errors
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<KotlinSupport> kotlinSupport = mockStatic(KotlinSupport.class);
             MockedStatic<Annotations> annotations = mockStatic(Annotations.class);
             MockedStatic<MoreTypes> moreTypes = mockStatic(MoreTypes.class)) {
            doReturn(typeMock2).when(typeMock).getType();
            List<TypeLiteral<?>> anyList = new ArrayList<>();
            doReturn(anyList).when(typeMock).getParameterTypes(constructorMock);
            moreTypes.when(() -> MoreTypes.getRawType(typeMock2)).thenReturn(Object.class);
            Annotation[] annotationArray = new Annotation[]{};
            annotations.when(() -> Annotations.findBindingAnnotation((Errors) any(), eq(constructorMock), eq(annotationArray))).thenReturn(null);
            doNothing().when(kotlinSupportInterfaceMock).checkConstructorParameterAnnotations(eq(constructorMock), (Errors) any());
            kotlinSupport.when(() -> KotlinSupport.getInstance()).thenReturn(kotlinSupportInterfaceMock).thenReturn(kotlinSupportInterfaceMock2);
            Predicate<Integer> predicate = kotlinSupportInterfaceMock2.getIsParameterKotlinNullablePredicate(constructorMock);
            doReturn(predicate).when(kotlinSupportInterfaceMock2).getIsParameterKotlinNullablePredicate(constructorMock);
            thrown.expect(ConfigurationException.class);
            //Act Statement(s)
            InjectionPoint.forConstructorOf(typeMock, false);
            //Assert statement(s)
            verify(typeMock).getType();
            verify(typeMock).getParameterTypes(constructorMock);
            moreTypes.verify(() -> MoreTypes.getRawType(typeMock2), atLeast(1));
            annotations.verify(() -> Annotations.findBindingAnnotation((Errors) any(), eq(constructorMock), eq(annotationArray)));
            kotlinSupport.verify(() -> KotlinSupport.getInstance(), atLeast(2));
            verify(kotlinSupportInterfaceMock).checkConstructorParameterAnnotations(eq(constructorMock), (Errors) any());
            verify(kotlinSupportInterfaceMock2).getIsParameterKotlinNullablePredicate(constructorMock);
        }
    }

    //Sapient generated method id: ${14fb54a8-126d-33a1-a71b-2972fc4e3291}, hash: 52C9C1DE574C2A6021DAB8374B02B97C
    @Test()
    public void forConstructorOf1WhenTypeGetParameterTypesMemberIsEmptyAndCaughtNoSuchMethodException4ThrowsConfigurationException() throws SecurityException, NoSuchMethodException {
        /* Branches:
         * (branch expression (line 305)) : true
         * (branch expression (line 306)) : false
         * (atInjectConstructors.size() > 1) : false
         * (injectableConstructor != null) : false
         * (atInjectRequired) : false
         * (injectableConstructor != null) : false
         * (Modifier.isPrivate(noArgConstructor.getModifiers())) : false
         * (misplacedBindingAnnotation == null) : false  #  inside checkForMisplacedBindingAnnotations method
         * (member instanceof Method) : false  #  inside checkForMisplacedBindingAnnotations method
         * (for-each(type.getParameterTypes(member))) : false  #  inside forMember method
         * (catch-exception (NoSuchMethodException)) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: errors
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        /*try (MockedStatic<KotlinSupport> kotlinSupport = mockStatic(KotlinSupport.class);
    MockedStatic<Annotations> annotations = mockStatic(Annotations.class);
    MockedStatic<MoreTypes> moreTypes = mockStatic(MoreTypes.class)) {
    doReturn(typeMock2).when(typeMock).getType();
    List<TypeLiteral<?>> anyList = new ArrayList<>();
    doReturn(anyList).when(typeMock).getParameterTypes((Member) any());
    moreTypes.when(() -> MoreTypes.getRawType(typeMock2)).thenReturn(Object.class);
    Annotation annotation = annotationArray[0];
    Annotation[] annotationArray = new Annotation[] { annotation };
    annotations.when(() -> Annotations.findBindingAnnotation((Errors) any(), (Member) any(), eq(annotationArray))).thenReturn(annotationMock);
    doNothing().when(kotlinSupportInterfaceMock).checkConstructorParameterAnnotations((Constructor) any(), (Errors) any());
    KotlinSupportInterface kotlinSupportInterface = KotlinSupport.getInstance();
    kotlinSupport.when(() -> KotlinSupport.getInstance()).thenReturn(kotlinSupportInterfaceMock).thenReturn(kotlinSupportInterface);
    thrown.expect(ConfigurationException.class);
    //Act Statement(s)
    InjectionPoint.forConstructorOf(typeMock, false);
    //Assert statement(s)
    verify(typeMock).getType();
    verify(typeMock).getParameterTypes((Member) any());
    moreTypes.verify(() -> MoreTypes.getRawType(typeMock2), atLeast(1));
    annotations.verify(() -> Annotations.findBindingAnnotation((Errors) any(), (Member) any(), eq(annotationArray)));
    kotlinSupport.verify(() -> KotlinSupport.getInstance(), atLeast(2));
    verify(kotlinSupportInterfaceMock).checkConstructorParameterAnnotations((Constructor) any(), (Errors) any());
}*/
    }

    //Sapient generated method id: ${22fc0292-4376-3a24-b446-140a36275356}, hash: 0E2AC87031875EE4BB5E055A2A46A873
    @Ignore()
    @Test()
    public void forConstructorOf1WhenIsParameterKotlinNullableTestIndex() throws ErrorsException, NoSuchFieldException, NoSuchMethodException {
        /* Branches:
         * (branch expression (line 305)) : true
         * (branch expression (line 306)) : true
         * (atInjectConstructors.size() > 1) : false
         * (injectableConstructor != null) : true
         * (misplacedBindingAnnotation == null) : true  #  inside checkForMisplacedBindingAnnotations method
         * (atInjectRequired) : true
         * (injectableConstructor == null) : false
         * (injectableConstructor != null) : true
         * (for-each(type.getParameterTypes(member))) : true  #  inside forMember method
         * (Nullability.hasNullableAnnotation(parameterAnnotations)) : false  #  inside forMember method
         * (Nullability.hasNullableAnnotation(typeAnnotations)) : false  #  inside forMember method
         * (isParameterKotlinNullable.test(index)) : true  #  inside forMember method
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: errors
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Nullability> nullability = mockStatic(Nullability.class);
             MockedStatic<Annotations> annotations = mockStatic(Annotations.class);
             MockedStatic<KotlinSupport> kotlinSupport = mockStatic(KotlinSupport.class);
             MockedStatic<MoreTypes> moreTypes = mockStatic(MoreTypes.class)) {
            doReturn(typeMock2).when(typeMock).getType();
            List<TypeLiteral<?>> anyList = new ArrayList<>();
            anyList.add(typeLiteralMock);
            doReturn(anyList).when(typeMock).getParameterTypes(constructorMock);
            moreTypes.when(() -> MoreTypes.getRawType(typeMock2)).thenReturn(Object.class);
            Annotation[] annotationArray = new Annotation[]{};
            annotations.when(() -> Annotations.findBindingAnnotation((Errors) any(), eq(constructorMock), eq(annotationArray))).thenReturn(null);
            doNothing().when(kotlinSupportInterfaceMock).checkConstructorParameterAnnotations(eq(constructorMock), (Errors) any());
            kotlinSupport.when(() -> KotlinSupport.getInstance()).thenReturn(kotlinSupportInterfaceMock).thenReturn(kotlinSupportInterfaceMock2);
            Predicate<Integer> predicate = kotlinSupportInterfaceMock2.getIsParameterKotlinNullablePredicate(constructorMock);
            doReturn(predicate).when(kotlinSupportInterfaceMock2).getIsParameterKotlinNullablePredicate(constructorMock);
            Annotation[] annotationArray2 = new Annotation[]{};
            annotations.when(() -> Annotations.getKey(eq(typeLiteralMock), eq(constructorMock), eq(annotationArray2), (Errors) any())).thenReturn(keyMock);
            nullability.when(() -> Nullability.hasNullableAnnotation(annotationArray2)).thenReturn(false);
            Annotation[] annotationArray3 = new Annotation[]{};
            nullability.when(() -> Nullability.hasNullableAnnotation(annotationArray3)).thenReturn(false);
            //Act Statement(s)
            InjectionPoint result = InjectionPoint.forConstructorOf(typeMock, true);
            InjectionPoint injectionPoint = new InjectionPoint(typeMock, constructorMock);
            //Assert statement(s)
            assertThat(result, equalTo(injectionPoint));
            verify(typeMock, atLeast(1)).getType();
            verify(typeMock, atLeast(1)).getParameterTypes(constructorMock);
            moreTypes.verify(() -> MoreTypes.getRawType(typeMock2), atLeast(1));
            annotations.verify(() -> Annotations.findBindingAnnotation((Errors) any(), eq(constructorMock), eq(annotationArray)));
            kotlinSupport.verify(() -> KotlinSupport.getInstance(), atLeast(2));
            verify(kotlinSupportInterfaceMock).checkConstructorParameterAnnotations(eq(constructorMock), (Errors) any());
            verify(kotlinSupportInterfaceMock2).getIsParameterKotlinNullablePredicate(constructorMock);
            annotations.verify(() -> Annotations.getKey(eq(typeLiteralMock), eq(constructorMock), eq(annotationArray2), (Errors) any()));
            nullability.verify(() -> Nullability.hasNullableAnnotation(annotationArray2), atLeast(1));
            nullability.verify(() -> Nullability.hasNullableAnnotation(annotationArray3), atLeast(1));
        }
    }

    //Sapient generated method id: ${0f8ad4e2-5a5b-33ad-8919-21957aa70d91}, hash: D0092C89219A4170A2B2C259F3A71AC7
    @Ignore()
    @Test()
    public void forConstructorOf1WhenIsParameterKotlinNullableNotTestIndex() throws ErrorsException, NoSuchFieldException, NoSuchMethodException {
        /* Branches:
         * (branch expression (line 305)) : true
         * (branch expression (line 306)) : true
         * (atInjectConstructors.size() > 1) : false
         * (injectableConstructor != null) : true
         * (misplacedBindingAnnotation == null) : true  #  inside checkForMisplacedBindingAnnotations method
         * (atInjectRequired) : true
         * (injectableConstructor == null) : false
         * (injectableConstructor != null) : true
         * (for-each(type.getParameterTypes(member))) : true  #  inside forMember method
         * (Nullability.hasNullableAnnotation(parameterAnnotations)) : false  #  inside forMember method
         * (Nullability.hasNullableAnnotation(typeAnnotations)) : false  #  inside forMember method
         * (isParameterKotlinNullable.test(index)) : false  #  inside forMember method
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: errors
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Nullability> nullability = mockStatic(Nullability.class);
             MockedStatic<Annotations> annotations = mockStatic(Annotations.class);
             MockedStatic<KotlinSupport> kotlinSupport = mockStatic(KotlinSupport.class);
             MockedStatic<MoreTypes> moreTypes = mockStatic(MoreTypes.class)) {
            doReturn(typeMock2).when(typeMock).getType();
            List<TypeLiteral<?>> anyList = new ArrayList<>();
            anyList.add(typeLiteralMock);
            doReturn(anyList).when(typeMock).getParameterTypes(constructorMock);
            moreTypes.when(() -> MoreTypes.getRawType(typeMock2)).thenReturn(Object.class);
            Annotation[] annotationArray = new Annotation[]{};
            annotations.when(() -> Annotations.findBindingAnnotation((Errors) any(), eq(constructorMock), eq(annotationArray))).thenReturn(null);
            doNothing().when(kotlinSupportInterfaceMock).checkConstructorParameterAnnotations(eq(constructorMock), (Errors) any());
            kotlinSupport.when(() -> KotlinSupport.getInstance()).thenReturn(kotlinSupportInterfaceMock).thenReturn(kotlinSupportInterfaceMock2);
            Predicate<Integer> predicate = kotlinSupportInterfaceMock2.getIsParameterKotlinNullablePredicate(constructorMock);
            doReturn(predicate).when(kotlinSupportInterfaceMock2).getIsParameterKotlinNullablePredicate(constructorMock);
            Annotation[] annotationArray2 = new Annotation[]{};
            annotations.when(() -> Annotations.getKey(eq(typeLiteralMock), eq(constructorMock), eq(annotationArray2), (Errors) any())).thenReturn(keyMock);
            nullability.when(() -> Nullability.hasNullableAnnotation(annotationArray2)).thenReturn(false);
            Annotation[] annotationArray3 = new Annotation[]{};
            nullability.when(() -> Nullability.hasNullableAnnotation(annotationArray3)).thenReturn(false);
            //Act Statement(s)
            InjectionPoint result = InjectionPoint.forConstructorOf(typeMock, true);
            InjectionPoint injectionPoint = new InjectionPoint(typeMock, constructorMock);
            //Assert statement(s)
            assertThat(result, equalTo(injectionPoint));
            verify(typeMock, atLeast(1)).getType();
            verify(typeMock, atLeast(1)).getParameterTypes(constructorMock);
            moreTypes.verify(() -> MoreTypes.getRawType(typeMock2), atLeast(1));
            annotations.verify(() -> Annotations.findBindingAnnotation((Errors) any(), eq(constructorMock), eq(annotationArray)));
            kotlinSupport.verify(() -> KotlinSupport.getInstance(), atLeast(2));
            verify(kotlinSupportInterfaceMock).checkConstructorParameterAnnotations(eq(constructorMock), (Errors) any());
            verify(kotlinSupportInterfaceMock2).getIsParameterKotlinNullablePredicate(constructorMock);
            annotations.verify(() -> Annotations.getKey(eq(typeLiteralMock), eq(constructorMock), eq(annotationArray2), (Errors) any()));
            nullability.verify(() -> Nullability.hasNullableAnnotation(annotationArray2), atLeast(1));
            nullability.verify(() -> Nullability.hasNullableAnnotation(annotationArray3), atLeast(1));
        }
    }

    //Sapient generated method id: ${e89a4ceb-5e0b-304b-afe6-130ed52e0981}, hash: 8771CB546C3440D2CEECB74B3C155CB6
    @Test()
    public void forConstructorOf1WhenTypeGetParameterTypesMemberIsEmptyAndCaughtNoSuchMethodException5ThrowsConfigurationException() throws SecurityException, NoSuchMethodException {
        /* Branches:
         * (branch expression (line 305)) : true
         * (branch expression (line 306)) : true
         * (atInjectConstructors.size() > 1) : false
         * (injectableConstructor != null) : false
         * (atInjectRequired) : true
         * (injectableConstructor == null) : true
         * (injectableConstructor != null) : false
         * (Modifier.isPrivate(noArgConstructor.getModifiers())) : false
         * (misplacedBindingAnnotation == null) : false  #  inside checkForMisplacedBindingAnnotations method
         * (member instanceof Method) : false  #  inside checkForMisplacedBindingAnnotations method
         * (for-each(type.getParameterTypes(member))) : false  #  inside forMember method
         * (catch-exception (NoSuchMethodException)) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: errors
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        /*try (MockedStatic<KotlinSupport> kotlinSupport = mockStatic(KotlinSupport.class);
    MockedStatic<Annotations> annotations = mockStatic(Annotations.class);
    MockedStatic<MoreTypes> moreTypes = mockStatic(MoreTypes.class)) {
    doReturn(typeMock2).when(typeMock).getType();
    List<TypeLiteral<?>> anyList = new ArrayList<>();
    doReturn(anyList).when(typeMock).getParameterTypes((Member) any());
    moreTypes.when(() -> MoreTypes.getRawType(typeMock2)).thenReturn(Object.class);
    Annotation annotation = annotationArray[0];
    Annotation[] annotationArray = new Annotation[] { annotation };
    annotations.when(() -> Annotations.findBindingAnnotation((Errors) any(), (Member) any(), eq(annotationArray))).thenReturn(annotationMock);
    doNothing().when(kotlinSupportInterfaceMock).checkConstructorParameterAnnotations((Constructor) any(), (Errors) any());
    KotlinSupportInterface kotlinSupportInterface = KotlinSupport.getInstance();
    kotlinSupport.when(() -> KotlinSupport.getInstance()).thenReturn(kotlinSupportInterfaceMock).thenReturn(kotlinSupportInterface);
    thrown.expect(ConfigurationException.class);
    //Act Statement(s)
    InjectionPoint.forConstructorOf(typeMock, false);
    //Assert statement(s)
    verify(typeMock).getType();
    verify(typeMock).getParameterTypes((Member) any());
    moreTypes.verify(() -> MoreTypes.getRawType(typeMock2), atLeast(1));
    annotations.verify(() -> Annotations.findBindingAnnotation((Errors) any(), (Member) any(), eq(annotationArray)));
    kotlinSupport.verify(() -> KotlinSupport.getInstance(), atLeast(2));
    verify(kotlinSupportInterfaceMock).checkConstructorParameterAnnotations((Constructor) any(), (Errors) any());
}*/
    }

    //Sapient generated method id: ${998836ee-96c7-3f3d-859e-277b6a86ac0e}, hash: 1E24577C6CC714D2A7CEA3E51390D911
    @Ignore()
    @Test()
    public void forConstructorOf1WhenNullabilityNotHasNullableAnnotationTypeAnnotationsAndIsParameterKotlinNullableTestIndex() throws ErrorsException, NoSuchFieldException, NoSuchMethodException {
        /* Branches:
         * (branch expression (line 305)) : true
         * (branch expression (line 306)) : true
         * (atInjectConstructors.size() > 1) : true
         * (atInjectRequired) : true
         * (injectableConstructor == null) : true
         * (injectableConstructor != null) : false
         * (Modifier.isPrivate(noArgConstructor.getModifiers())) : true
         * (!Modifier.isPrivate(rawType.getModifiers())) : false
         * (misplacedBindingAnnotation == null) : true  #  inside checkForMisplacedBindingAnnotations method
         * (for-each(type.getParameterTypes(member))) : true  #  inside forMember method
         * (Nullability.hasNullableAnnotation(parameterAnnotations)) : false  #  inside forMember method
         * (Nullability.hasNullableAnnotation(typeAnnotations)) : false  #  inside forMember method
         * (isParameterKotlinNullable.test(index)) : true  #  inside forMember method
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: errors
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Nullability> nullability = mockStatic(Nullability.class);
             MockedStatic<Annotations> annotations = mockStatic(Annotations.class);
             MockedStatic<KotlinSupport> kotlinSupport = mockStatic(KotlinSupport.class);
             MockedStatic<MoreTypes> moreTypes = mockStatic(MoreTypes.class)) {
            doReturn(typeMock2).when(typeMock).getType();
            List<TypeLiteral<?>> anyList = new ArrayList<>();
            doReturn(anyList).when(typeMock).getParameterTypes(constructorMock);
            moreTypes.when(() -> MoreTypes.getRawType(typeMock2)).thenReturn(Object.class);
            Annotation[] annotationArray = new Annotation[]{};
            annotations.when(() -> Annotations.findBindingAnnotation((Errors) any(), eq(constructorMock), eq(annotationArray))).thenReturn(null);
            doNothing().when(kotlinSupportInterfaceMock).checkConstructorParameterAnnotations(eq(constructorMock), (Errors) any());
            kotlinSupport.when(() -> KotlinSupport.getInstance()).thenReturn(kotlinSupportInterfaceMock).thenReturn(kotlinSupportInterfaceMock2);
            Predicate<Integer> predicate = kotlinSupportInterfaceMock2.getIsParameterKotlinNullablePredicate(constructorMock);
            doReturn(predicate).when(kotlinSupportInterfaceMock2).getIsParameterKotlinNullablePredicate(constructorMock);
            Annotation[] annotationArray2 = new Annotation[]{};
            annotations.when(() -> Annotations.getKey(eq(typeLiteralMock), eq(constructorMock), eq(annotationArray2), (Errors) any())).thenReturn(keyMock);
            nullability.when(() -> Nullability.hasNullableAnnotation(annotationArray2)).thenReturn(false);
            Annotation[] annotationArray3 = new Annotation[]{};
            nullability.when(() -> Nullability.hasNullableAnnotation(annotationArray3)).thenReturn(false);
            //Act Statement(s)
            InjectionPoint result = InjectionPoint.forConstructorOf(typeMock, false);
            InjectionPoint injectionPoint = new InjectionPoint(typeMock, constructorMock);
            //Assert statement(s)
            assertThat(result, equalTo(injectionPoint));
            verify(typeMock, atLeast(1)).getType();
            verify(typeMock, atLeast(1)).getParameterTypes(constructorMock);
            moreTypes.verify(() -> MoreTypes.getRawType(typeMock2), atLeast(1));
            annotations.verify(() -> Annotations.findBindingAnnotation((Errors) any(), eq(constructorMock), eq(annotationArray)));
            kotlinSupport.verify(() -> KotlinSupport.getInstance(), atLeast(2));
            verify(kotlinSupportInterfaceMock).checkConstructorParameterAnnotations(eq(constructorMock), (Errors) any());
            verify(kotlinSupportInterfaceMock2).getIsParameterKotlinNullablePredicate(constructorMock);
            annotations.verify(() -> Annotations.getKey(eq(typeLiteralMock), eq(constructorMock), eq(annotationArray2), (Errors) any()));
            nullability.verify(() -> Nullability.hasNullableAnnotation(annotationArray2), atLeast(1));
            nullability.verify(() -> Nullability.hasNullableAnnotation(annotationArray3), atLeast(1));
        }
    }

    //Sapient generated method id: ${82535ab3-0a55-3145-a02c-59883ce08302}, hash: FF977B0CE58E6DA3FC42130E40B1929B
    @Ignore()
    @Test()
    public void forConstructorOf1WhenNullabilityNotHasNullableAnnotationTypeAnnotationsAndIsParameterKotlinNullableNotTestIndex() throws ErrorsException, NoSuchFieldException, NoSuchMethodException {
        /* Branches:
         * (branch expression (line 305)) : true
         * (branch expression (line 306)) : true
         * (atInjectConstructors.size() > 1) : true
         * (atInjectRequired) : true
         * (injectableConstructor == null) : true
         * (injectableConstructor != null) : false
         * (Modifier.isPrivate(noArgConstructor.getModifiers())) : true
         * (!Modifier.isPrivate(rawType.getModifiers())) : false
         * (misplacedBindingAnnotation == null) : true  #  inside checkForMisplacedBindingAnnotations method
         * (for-each(type.getParameterTypes(member))) : true  #  inside forMember method
         * (Nullability.hasNullableAnnotation(parameterAnnotations)) : false  #  inside forMember method
         * (Nullability.hasNullableAnnotation(typeAnnotations)) : false  #  inside forMember method
         * (isParameterKotlinNullable.test(index)) : false  #  inside forMember method
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: errors
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Nullability> nullability = mockStatic(Nullability.class);
             MockedStatic<Annotations> annotations = mockStatic(Annotations.class);
             MockedStatic<KotlinSupport> kotlinSupport = mockStatic(KotlinSupport.class);
             MockedStatic<MoreTypes> moreTypes = mockStatic(MoreTypes.class)) {
            doReturn(typeMock2).when(typeMock).getType();
            List<TypeLiteral<?>> anyList = new ArrayList<>();
            doReturn(anyList).when(typeMock).getParameterTypes(constructorMock);
            moreTypes.when(() -> MoreTypes.getRawType(typeMock2)).thenReturn(Object.class);
            Annotation[] annotationArray = new Annotation[]{};
            annotations.when(() -> Annotations.findBindingAnnotation((Errors) any(), eq(constructorMock), eq(annotationArray))).thenReturn(null);
            doNothing().when(kotlinSupportInterfaceMock).checkConstructorParameterAnnotations(eq(constructorMock), (Errors) any());
            kotlinSupport.when(() -> KotlinSupport.getInstance()).thenReturn(kotlinSupportInterfaceMock).thenReturn(kotlinSupportInterfaceMock2);
            Predicate<Integer> predicate = kotlinSupportInterfaceMock2.getIsParameterKotlinNullablePredicate(constructorMock);
            doReturn(predicate).when(kotlinSupportInterfaceMock2).getIsParameterKotlinNullablePredicate(constructorMock);
            Annotation[] annotationArray2 = new Annotation[]{};
            annotations.when(() -> Annotations.getKey(eq(typeLiteralMock), eq(constructorMock), eq(annotationArray2), (Errors) any())).thenReturn(keyMock);
            nullability.when(() -> Nullability.hasNullableAnnotation(annotationArray2)).thenReturn(false);
            Annotation[] annotationArray3 = new Annotation[]{};
            nullability.when(() -> Nullability.hasNullableAnnotation(annotationArray3)).thenReturn(false);
            //Act Statement(s)
            InjectionPoint result = InjectionPoint.forConstructorOf(typeMock, false);
            InjectionPoint injectionPoint = new InjectionPoint(typeMock, constructorMock);
            //Assert statement(s)
            assertThat(result, equalTo(injectionPoint));
            verify(typeMock, atLeast(1)).getType();
            verify(typeMock, atLeast(1)).getParameterTypes(constructorMock);
            moreTypes.verify(() -> MoreTypes.getRawType(typeMock2), atLeast(1));
            annotations.verify(() -> Annotations.findBindingAnnotation((Errors) any(), eq(constructorMock), eq(annotationArray)));
            kotlinSupport.verify(() -> KotlinSupport.getInstance(), atLeast(2));
            verify(kotlinSupportInterfaceMock).checkConstructorParameterAnnotations(eq(constructorMock), (Errors) any());
            verify(kotlinSupportInterfaceMock2).getIsParameterKotlinNullablePredicate(constructorMock);
            annotations.verify(() -> Annotations.getKey(eq(typeLiteralMock), eq(constructorMock), eq(annotationArray2), (Errors) any()));
            nullability.verify(() -> Nullability.hasNullableAnnotation(annotationArray2), atLeast(1));
            nullability.verify(() -> Nullability.hasNullableAnnotation(annotationArray3), atLeast(1));
        }
    }

    //Sapient generated method id: ${1c94e7cc-474e-3d3c-b295-71f86ed563ab}, hash: 88A43D627BF099F3F23E4E1DD3929311
    @Test()
    public void forConstructorOf2Test() throws NoSuchFieldException, ErrorsException, NoSuchMethodException {
        //Arrange Statement(s)
        try (MockedStatic<InjectionPoint> injectionPoint = mockStatic(InjectionPoint.class, CALLS_REAL_METHODS);
             MockedStatic<TypeLiteral> typeLiteral = mockStatic(TypeLiteral.class)) {
            typeLiteral.when(() -> TypeLiteral.get(Object.class)).thenReturn(typeLiteralMock);
            injectionPoint.when(() -> InjectionPoint.forConstructorOf(typeLiteralMock)).thenReturn(injectionPointMock);
            //Act Statement(s)
            InjectionPoint result = InjectionPoint.forConstructorOf(Object.class);
            //Assert statement(s)
            assertThat(result, equalTo(injectionPointMock));
            typeLiteral.verify(() -> TypeLiteral.get(Object.class), atLeast(1));
            injectionPoint.verify(() -> InjectionPoint.forConstructorOf(typeLiteralMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${9de4cf37-7ed7-3776-bf81-fddd2478656e}, hash: 59C064EEF879C9218C4A9DF50441B4F6
    @Ignore()
    @Test()
    public void forMethodWhenIsParameterKotlinNullableTestIndex() throws ErrorsException {
        /* Branches:
         * (for-each(type.getParameterTypes(member))) : true  #  inside forMember method
         * (Nullability.hasNullableAnnotation(parameterAnnotations)) : false  #  inside forMember method
         * (Nullability.hasNullableAnnotation(typeAnnotations)) : false  #  inside forMember method
         * (isParameterKotlinNullable.test(index)) : true  #  inside forMember method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Method methodMock = mock(Method.class, "forMethod");
        try (MockedStatic<Nullability> nullability = mockStatic(Nullability.class);
             MockedStatic<Annotations> annotations = mockStatic(Annotations.class);
             MockedStatic<KotlinSupport> kotlinSupport = mockStatic(KotlinSupport.class)) {
            doReturn(null).when(methodMock).getAnnotatedParameterTypes();
            doReturn(null).when(methodMock).getParameterAnnotations();
            kotlinSupport.when(() -> KotlinSupport.getInstance()).thenReturn(kotlinSupportInterfaceMock);
            doReturn(predicateMock).when(kotlinSupportInterfaceMock).getIsParameterKotlinNullablePredicate(methodMock);
            Annotation[] annotationArray = new Annotation[]{};
            annotations.when(() -> Annotations.getKey((TypeLiteral) any(), eq(methodMock), eq(annotationArray), (Errors) any())).thenReturn(keyMock);
            nullability.when(() -> Nullability.hasNullableAnnotation(annotationArray)).thenReturn(false);
            Annotation[] annotationArray2 = new Annotation[]{};
            nullability.when(() -> Nullability.hasNullableAnnotation(annotationArray2)).thenReturn(false);
            TypeLiteral typeLiteral = TypeLiteral.get(Object.class);
            //Act Statement(s)
            InjectionPoint result = InjectionPoint.forMethod(methodMock, typeLiteral);
            InjectionPoint injectionPoint = new InjectionPoint(typeLiteral, methodMock, false);
            //Assert statement(s)
            assertThat(result, equalTo(injectionPoint));
            verify(methodMock, atLeast(1)).getAnnotatedParameterTypes();
            verify(methodMock, atLeast(1)).getParameterAnnotations();
            kotlinSupport.verify(() -> KotlinSupport.getInstance(), atLeast(1));
            verify(kotlinSupportInterfaceMock).getIsParameterKotlinNullablePredicate(methodMock);
            annotations.verify(() -> Annotations.getKey((TypeLiteral) any(), eq(methodMock), eq(annotationArray), (Errors) any()));
            nullability.verify(() -> Nullability.hasNullableAnnotation(annotationArray), atLeast(1));
            nullability.verify(() -> Nullability.hasNullableAnnotation(annotationArray2), atLeast(1));
        }
    }

    //Sapient generated method id: ${a6f8a75d-9497-3a89-a428-c5a11a5f7e9c}, hash: 449DFEDA0FD3241CC25FD7466387E34A
    @Ignore()
    @Test()
    public void forMethodWhenIsParameterKotlinNullableNotTestIndex() throws ErrorsException {
        /* Branches:
         * (for-each(type.getParameterTypes(member))) : true  #  inside forMember method
         * (Nullability.hasNullableAnnotation(parameterAnnotations)) : false  #  inside forMember method
         * (Nullability.hasNullableAnnotation(typeAnnotations)) : false  #  inside forMember method
         * (isParameterKotlinNullable.test(index)) : false  #  inside forMember method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TypeLiteral<Object> typeMock = mock(TypeLiteral.class);
        try (MockedStatic<Nullability> nullability = mockStatic(Nullability.class);
             MockedStatic<Annotations> annotations = mockStatic(Annotations.class);
             MockedStatic<KotlinSupport> kotlinSupport = mockStatic(KotlinSupport.class)) {
            List<TypeLiteral<?>> anyList = new ArrayList<>();
            anyList.add(typeLiteralMock);
            doReturn(anyList).when(typeMock).getParameterTypes(methodMock);
            kotlinSupport.when(() -> KotlinSupport.getInstance()).thenReturn(kotlinSupportInterfaceMock);
            Predicate<Integer> predicate = kotlinSupportInterfaceMock.getIsParameterKotlinNullablePredicate(methodMock);
            doReturn(predicate).when(kotlinSupportInterfaceMock).getIsParameterKotlinNullablePredicate(methodMock);
            Annotation[] annotationArray = new Annotation[]{};
            annotations.when(() -> Annotations.getKey(eq(typeLiteralMock), eq(methodMock), eq(annotationArray), (Errors) any())).thenReturn(keyMock);
            nullability.when(() -> Nullability.hasNullableAnnotation(annotationArray)).thenReturn(false);
            Annotation[] annotationArray2 = new Annotation[]{};
            nullability.when(() -> Nullability.hasNullableAnnotation(annotationArray2)).thenReturn(false);
            //Act Statement(s)
            InjectionPoint result = InjectionPoint.forMethod(methodMock, typeMock);
            InjectionPoint injectionPoint = new InjectionPoint(typeMock, methodMock, false);
            //Assert statement(s)
            assertThat(result, equalTo(injectionPoint));
            verify(typeMock, atLeast(1)).getParameterTypes(methodMock);
            kotlinSupport.verify(() -> KotlinSupport.getInstance(), atLeast(1));
            verify(kotlinSupportInterfaceMock).getIsParameterKotlinNullablePredicate(methodMock);
            annotations.verify(() -> Annotations.getKey(eq(typeLiteralMock), eq(methodMock), eq(annotationArray), (Errors) any()));
            nullability.verify(() -> Nullability.hasNullableAnnotation(annotationArray), atLeast(1));
            nullability.verify(() -> Nullability.hasNullableAnnotation(annotationArray2), atLeast(1));
        }
    }

    //Sapient generated method id: ${881e8007-480e-3f6b-9cc3-534cefeef418}, hash: EDFAA74A65D42C798C811FCB35600D6D
    @Ignore()
    @Test()
    public void forMethodWhenCaughtConfigurationException() throws ErrorsException {
        /* Branches:
         * (for-each(type.getParameterTypes(member))) : true  #  inside forMember method
         * (Nullability.hasNullableAnnotation(parameterAnnotations)) : false  #  inside forMember method
         * (Nullability.hasNullableAnnotation(typeAnnotations)) : false  #  inside forMember method
         * (isParameterKotlinNullable.test(index)) : true  #  inside forMember method
         * (catch-exception (ConfigurationException)) : true  #  inside forMember method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Method methodMock = mock(Method.class, "forMethod");
        try (MockedStatic<Nullability> nullability = mockStatic(Nullability.class);
             MockedStatic<Annotations> annotations = mockStatic(Annotations.class);
             MockedStatic<KotlinSupport> kotlinSupport = mockStatic(KotlinSupport.class)) {
            doReturn(null).when(methodMock).getAnnotatedParameterTypes();
            doReturn(null).when(methodMock).getParameterAnnotations();
            kotlinSupport.when(() -> KotlinSupport.getInstance()).thenReturn(kotlinSupportInterfaceMock);
            doReturn(predicateMock).when(kotlinSupportInterfaceMock).getIsParameterKotlinNullablePredicate(methodMock);
            Annotation[] annotationArray = new Annotation[]{};
            annotations.when(() -> Annotations.getKey((TypeLiteral) any(), eq(methodMock), eq(annotationArray), (Errors) any())).thenReturn(keyMock);
            nullability.when(() -> Nullability.hasNullableAnnotation(annotationArray)).thenReturn(false);
            Annotation[] annotationArray2 = new Annotation[]{};
            nullability.when(() -> Nullability.hasNullableAnnotation(annotationArray2)).thenReturn(false);
            TypeLiteral typeLiteral = TypeLiteral.get(Object.class);
            //Act Statement(s)
            InjectionPoint result = InjectionPoint.forMethod(methodMock, typeLiteral);
            InjectionPoint injectionPoint = new InjectionPoint(typeLiteral, methodMock, false);
            //Assert statement(s)
            assertThat(result, equalTo(injectionPoint));
            verify(methodMock, atLeast(1)).getAnnotatedParameterTypes();
            verify(methodMock, atLeast(1)).getParameterAnnotations();
            kotlinSupport.verify(() -> KotlinSupport.getInstance(), atLeast(1));
            verify(kotlinSupportInterfaceMock).getIsParameterKotlinNullablePredicate(methodMock);
            annotations.verify(() -> Annotations.getKey((TypeLiteral) any(), eq(methodMock), eq(annotationArray), (Errors) any()));
            nullability.verify(() -> Nullability.hasNullableAnnotation(annotationArray), atLeast(1));
            nullability.verify(() -> Nullability.hasNullableAnnotation(annotationArray2), atLeast(1));
        }
    }

    //Sapient generated method id: ${8928e2a5-a484-33e7-8899-bb211dd6accd}, hash: EC2A045241268F792D659F4A50739341
    @Ignore()
    @Test()
    public void forMethodWhenCaughtErrorsException() throws ErrorsException {
        /* Branches:
         * (for-each(type.getParameterTypes(member))) : true  #  inside forMember method
         * (Nullability.hasNullableAnnotation(parameterAnnotations)) : false  #  inside forMember method
         * (Nullability.hasNullableAnnotation(typeAnnotations)) : false  #  inside forMember method
         * (isParameterKotlinNullable.test(index)) : true  #  inside forMember method
         * (catch-exception (ErrorsException)) : true  #  inside forMember method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Method methodMock = mock(Method.class, "forMethod");
        try (MockedStatic<Nullability> nullability = mockStatic(Nullability.class);
             MockedStatic<Annotations> annotations = mockStatic(Annotations.class);
             MockedStatic<KotlinSupport> kotlinSupport = mockStatic(KotlinSupport.class)) {
            doReturn(null).when(methodMock).getAnnotatedParameterTypes();
            doReturn(null).when(methodMock).getParameterAnnotations();
            kotlinSupport.when(() -> KotlinSupport.getInstance()).thenReturn(kotlinSupportInterfaceMock);
            doReturn(predicateMock).when(kotlinSupportInterfaceMock).getIsParameterKotlinNullablePredicate(methodMock);
            Annotation[] annotationArray = new Annotation[]{};
            annotations.when(() -> Annotations.getKey((TypeLiteral) any(), eq(methodMock), eq(annotationArray), (Errors) any())).thenReturn(keyMock);
            nullability.when(() -> Nullability.hasNullableAnnotation(annotationArray)).thenReturn(false);
            Annotation[] annotationArray2 = new Annotation[]{};
            nullability.when(() -> Nullability.hasNullableAnnotation(annotationArray2)).thenReturn(false);
            TypeLiteral typeLiteral = TypeLiteral.get(Object.class);
            //Act Statement(s)
            InjectionPoint result = InjectionPoint.forMethod(methodMock, typeLiteral);
            InjectionPoint injectionPoint = new InjectionPoint(typeLiteral, methodMock, false);
            //Assert statement(s)
            assertThat(result, equalTo(injectionPoint));
            verify(methodMock, atLeast(1)).getAnnotatedParameterTypes();
            verify(methodMock, atLeast(1)).getParameterAnnotations();
            kotlinSupport.verify(() -> KotlinSupport.getInstance(), atLeast(1));
            verify(kotlinSupportInterfaceMock).getIsParameterKotlinNullablePredicate(methodMock);
            annotations.verify(() -> Annotations.getKey((TypeLiteral) any(), eq(methodMock), eq(annotationArray), (Errors) any()));
            nullability.verify(() -> Nullability.hasNullableAnnotation(annotationArray), atLeast(1));
            nullability.verify(() -> Nullability.hasNullableAnnotation(annotationArray2), atLeast(1));
        }
    }

    //Sapient generated method id: ${3bcf42e7-c3f0-3adf-87ef-51db2477f46f}, hash: 05C9F3DB5C99183399CB567E75D38C5E
    @Ignore()
    @Test()
    public void forStaticMethodsAndFieldsWhenErrorsNotHasErrors() throws NoSuchFieldException {
        /* Branches:
         * (type.getRawType().isInterface()) : true
         * (errors.hasErrors()) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: errors
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn(java.lang.Object.class).when(typeMock).getRawType();
        //Act Statement(s)
        Set<InjectionPoint> result = InjectionPoint.forStaticMethodsAndFields(typeMock);
        //Assert statement(s)
        assertThat(result, is(nullValue()));
        verify(typeMock, times(2)).getRawType();
    }

    //Sapient generated method id: ${2349e260-fdf1-3005-9891-d6e84808cadb}, hash: 6471182A087BBBBDFCA3C7EA8C24C3A2
    @Ignore()
    @Test()
    public void forStaticMethodsAndFieldsWhenInjectableMembersNotIsEmptyAndImIsNullAndErrorsNotHasErrors6() throws NoSuchFieldException {
        /* Branches:
         * (type.getRawType().isInterface()) : false
         * (current.getRawType() != Object.class) : true  #  inside hierarchyFor method
         * (i >= 0) : true  #  inside getInjectionPoints method
         * (overrideIndex != null) : false  #  inside getInjectionPoints method
         * (for-each(getDeclaredFields(current))) : true  #  inside getInjectionPoints method
         * (Modifier.isStatic(field.getModifiers()) == statics) : true  #  inside getInjectionPoints method
         * (atInject != null) : true  #  inside getInjectionPoints method
         * (injectableField.specInject) : false  #  inside getInjectionPoints method
         * (for-each(getDeclaredMethods(current))) : true  #  inside getInjectionPoints method
         * (Modifier.isStatic(method.getModifiers()) == statics) : true  #  inside isEligibleForInjection method
         * (!method.isBridge()) : true  #  inside isEligibleForInjection method
         * (!method.isSynthetic()) : false  #  inside isEligibleForInjection method
         * (isEligibleForInjection(method, statics)) : false  #  inside getInjectionPoints method
         * (injectableMembers.isEmpty()) : false  #  inside getInjectionPoints method
         * (im != null) : false  #  inside getInjectionPoints method
         * (errors.hasErrors()) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<DeclaredMembers> declaredMembers = mockStatic(DeclaredMembers.class);
             MockedStatic<InjectionPoint> injectionPoint = mockStatic(InjectionPoint.class, CALLS_REAL_METHODS)) {
            doReturn(java.lang.Object.class).when(typeMock).getRawType();
            doReturn(typeLiteralMock).when(typeMock).getSupertype(Object.class);
            doReturn(java.lang.Object.class).when(typeLiteralMock).getRawType();
            Field[] fieldArray = new Field[]{};
            declaredMembers.when(() -> DeclaredMembers.getDeclaredFields(Object.class)).thenReturn(fieldArray);
            injectionPoint.when(() -> InjectionPoint.getAtInject(fieldMock)).thenReturn(annotationMock);
            Method[] methodArray = new Method[]{};
            declaredMembers.when(() -> DeclaredMembers.getDeclaredMethods(Object.class)).thenReturn(methodArray);
            //Act Statement(s)
            Set<InjectionPoint> result = InjectionPoint.forStaticMethodsAndFields(typeMock);
            ImmutableSet injectionPointSet = ImmutableSet.builder().build();
            //Assert statement(s)
            assertThat(result, equalTo(injectionPointSet));
            verify(typeMock, times(5)).getRawType();
            verify(typeMock, atLeast(1)).getSupertype(Object.class);
            verify(typeLiteralMock, atLeast(1)).getRawType();
            declaredMembers.verify(() -> DeclaredMembers.getDeclaredFields(Object.class), atLeast(1));
            injectionPoint.verify(() -> InjectionPoint.getAtInject(fieldMock), atLeast(1));
            declaredMembers.verify(() -> DeclaredMembers.getDeclaredMethods(Object.class), atLeast(1));
        }
    }

    //Sapient generated method id: ${2336a4f4-52e4-3be8-a42c-fa7bba979664}, hash: 0C83CFF6FBE523B325BF4A4D4B66DD49
    @Ignore()
    @Test()
    public void forStaticMethodsAndFieldsWhenOverrideIndexIsNullAndInjectableMembersIsEmptyAndErrorsNotHasErrors() throws NoSuchFieldException {
        /* Branches:
         * (type.getRawType().isInterface()) : false
         * (current.getRawType() != Object.class) : true  #  inside hierarchyFor method
         * (i >= 0) : true  #  inside getInjectionPoints method
         * (overrideIndex != null) : false  #  inside getInjectionPoints method
         * (for-each(getDeclaredFields(current))) : true  #  inside getInjectionPoints method
         * (Modifier.isStatic(field.getModifiers()) == statics) : true  #  inside getInjectionPoints method
         * (atInject != null) : true  #  inside getInjectionPoints method
         * (injectableField.specInject) : false  #  inside getInjectionPoints method
         * (for-each(getDeclaredMethods(current))) : true  #  inside getInjectionPoints method
         * (Modifier.isStatic(method.getModifiers()) == statics) : true  #  inside isEligibleForInjection method
         * (!method.isBridge()) : true  #  inside isEligibleForInjection method
         * (!method.isSynthetic()) : true  #  inside isEligibleForInjection method
         * (isEligibleForInjection(method, statics)) : true  #  inside getInjectionPoints method
         * (atInject != null) : false  #  inside getInjectionPoints method
         * (overrideIndex != null) : false  #  inside getInjectionPoints method
         * (injectableMembers.isEmpty()) : true  #  inside getInjectionPoints method
         * (errors.hasErrors()) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<InjectionPoint> injectionPoint = mockStatic(InjectionPoint.class, CALLS_REAL_METHODS);
             MockedStatic<DeclaredMembers> declaredMembers = mockStatic(DeclaredMembers.class)) {
            doReturn(java.lang.Object.class).when(typeMock).getRawType();
            doReturn(typeLiteralMock).when(typeMock).getSupertype(Object.class);
            doReturn(java.lang.Object.class).when(typeLiteralMock).getRawType();
            Field[] fieldArray = new Field[]{};
            declaredMembers.when(() -> DeclaredMembers.getDeclaredFields(Object.class)).thenReturn(fieldArray);
            injectionPoint.when(() -> InjectionPoint.getAtInject(fieldMock)).thenReturn(annotationMock);
            Method[] methodArray = new Method[]{};
            declaredMembers.when(() -> DeclaredMembers.getDeclaredMethods(Object.class)).thenReturn(methodArray);
            injectionPoint.when(() -> InjectionPoint.getAtInject(methodMock)).thenReturn(null);
            //Act Statement(s)
            Set<InjectionPoint> result = InjectionPoint.forStaticMethodsAndFields(typeMock);
            //Assert statement(s)
            assertThat(result.size(), equalTo(0));
            verify(typeMock, times(5)).getRawType();
            verify(typeMock, atLeast(1)).getSupertype(Object.class);
            verify(typeLiteralMock, atLeast(1)).getRawType();
            declaredMembers.verify(() -> DeclaredMembers.getDeclaredFields(Object.class), atLeast(1));
            injectionPoint.verify(() -> InjectionPoint.getAtInject(fieldMock), atLeast(1));
            declaredMembers.verify(() -> DeclaredMembers.getDeclaredMethods(Object.class), atLeast(1));
            injectionPoint.verify(() -> InjectionPoint.getAtInject(methodMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${a23fe56f-3efe-32da-8b3e-c30845b4b281}, hash: EAEB306AF558C6C330DE4A8387DF21F7
    @Ignore()
    @Test()
    public void forStaticMethodsAndFieldsWhenStaticsAndInjectableMembersIsEmptyAndErrorsNotHasErrors() throws NoSuchFieldException {
        /* Branches:
         * (type.getRawType().isInterface()) : false
         * (current.getRawType() != Object.class) : true  #  inside hierarchyFor method
         * (i >= 0) : true  #  inside getInjectionPoints method
         * (overrideIndex != null) : false  #  inside getInjectionPoints method
         * (for-each(getDeclaredFields(current))) : true  #  inside getInjectionPoints method
         * (Modifier.isStatic(field.getModifiers()) == statics) : true  #  inside getInjectionPoints method
         * (atInject != null) : true  #  inside getInjectionPoints method
         * (injectableField.specInject) : false  #  inside getInjectionPoints method
         * (for-each(getDeclaredMethods(current))) : true  #  inside getInjectionPoints method
         * (Modifier.isStatic(method.getModifiers()) == statics) : true  #  inside isEligibleForInjection method
         * (!method.isBridge()) : true  #  inside isEligibleForInjection method
         * (!method.isSynthetic()) : true  #  inside isEligibleForInjection method
         * (isEligibleForInjection(method, statics)) : true  #  inside getInjectionPoints method
         * (atInject != null) : true  #  inside getInjectionPoints method
         * (misplacedBindingAnnotation == null) : true  #  inside checkForMisplacedBindingAnnotations method
         * (checkForMisplacedBindingAnnotations(method, errors)) : false  #  inside getInjectionPoints method
         * (injectableMethod.specInject) : false  #  inside isValidMethod method
         * (!isValidMethod(injectableMethod, errors)) : false  #  inside getInjectionPoints method
         * (statics) : true  #  inside getInjectionPoints method
         * (injectableMembers.isEmpty()) : true  #  inside getInjectionPoints method
         * (errors.hasErrors()) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Annotations> annotations = mockStatic(Annotations.class);
             MockedStatic<InjectionPoint> injectionPoint = mockStatic(InjectionPoint.class, CALLS_REAL_METHODS);
             MockedStatic<DeclaredMembers> declaredMembers = mockStatic(DeclaredMembers.class)) {
            doReturn(java.lang.Object.class).when(typeMock).getRawType();
            doReturn(typeLiteralMock).when(typeMock).getSupertype(Object.class);
            doReturn(java.lang.Object.class).when(typeLiteralMock).getRawType();
            Field[] fieldArray = new Field[]{fieldMock};
            declaredMembers.when(() -> DeclaredMembers.getDeclaredFields(Object.class)).thenReturn(fieldArray);
            injectionPoint.when(() -> InjectionPoint.getAtInject(fieldMock2)).thenReturn(annotationMock);
            Method[] methodArray = new Method[]{methodMock};
            declaredMembers.when(() -> DeclaredMembers.getDeclaredMethods(Object.class)).thenReturn(methodArray);
            injectionPoint.when(() -> InjectionPoint.getAtInject(methodMock2)).thenReturn(annotationMock2);
            Annotation[] annotationArray = new Annotation[]{};
            annotations.when(() -> Annotations.findBindingAnnotation((Errors) any(), eq(methodMock3), eq(annotationArray))).thenReturn(null);
            //Act Statement(s)
            Set<InjectionPoint> result = InjectionPoint.forStaticMethodsAndFields(typeMock);
            //Assert statement(s)
            assertThat(result.size(), equalTo(0));
            verify(typeMock, times(5)).getRawType();
            verify(typeMock, atLeast(1)).getSupertype(Object.class);
            verify(typeLiteralMock, atLeast(1)).getRawType();
            declaredMembers.verify(() -> DeclaredMembers.getDeclaredFields(Object.class), atLeast(1));
            injectionPoint.verify(() -> InjectionPoint.getAtInject(fieldMock2), atLeast(1));
            declaredMembers.verify(() -> DeclaredMembers.getDeclaredMethods(Object.class), atLeast(1));
            injectionPoint.verify(() -> InjectionPoint.getAtInject(methodMock2), atLeast(1));
            annotations.verify(() -> Annotations.findBindingAnnotation((Errors) any(), eq(methodMock3), eq(annotationArray)), atLeast(1));
        }
    }

    //Sapient generated method id: ${456fb92e-ec0d-3627-9fb5-b0db320989dc}, hash: 1F9709B92FFBFB9E2882B8A5F6B4E809
    @Ignore()
    @Test()
    public void forStaticMethodsAndFieldsWhenCheckForMisplacedBindingAnnotationsMethodErrorsAndOverrideIndexIsNullAndInjectableMembersN() throws NoSuchFieldException {
        /* Branches:
         * (type.getRawType().isInterface()) : false
         * (current.getRawType() != Object.class) : true  #  inside hierarchyFor method
         * (i >= 0) : true  #  inside getInjectionPoints method
         * (overrideIndex != null) : false  #  inside getInjectionPoints method
         * (for-each(getDeclaredFields(current))) : true  #  inside getInjectionPoints method
         * (Modifier.isStatic(field.getModifiers()) == statics) : true  #  inside getInjectionPoints method
         * (atInject != null) : true  #  inside getInjectionPoints method
         * (injectableField.specInject) : false  #  inside getInjectionPoints method
         * (for-each(getDeclaredMethods(current))) : true  #  inside getInjectionPoints method
         * (Modifier.isStatic(method.getModifiers()) == statics) : true  #  inside isEligibleForInjection method
         * (!method.isBridge()) : true  #  inside isEligibleForInjection method
         * (!method.isSynthetic()) : true  #  inside isEligibleForInjection method
         * (isEligibleForInjection(method, statics)) : true  #  inside getInjectionPoints method
         * (atInject != null) : true  #  inside getInjectionPoints method
         * (misplacedBindingAnnotation == null) : false  #  inside checkForMisplacedBindingAnnotations method
         * (member instanceof Method) : true  #  inside checkForMisplacedBindingAnnotations method
         * (member.getDeclaringClass().getDeclaredField(member.getName()) != null) : false  #  inside checkForMisplacedBindingAnnotations method
         * (checkForMisplacedBindingAnnotations(method, errors)) : true  #  inside getInjectionPoints method
         * (overrideIndex != null) : false  #  inside getInjectionPoints method
         * (injectableMembers.isEmpty()) : false  #  inside getInjectionPoints method
         * (im != null) : false  #  inside getInjectionPoints method
         * (errors.hasErrors()) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Annotations> annotations = mockStatic(Annotations.class);
             MockedStatic<InjectionPoint> injectionPoint = mockStatic(InjectionPoint.class, CALLS_REAL_METHODS);
             MockedStatic<DeclaredMembers> declaredMembers = mockStatic(DeclaredMembers.class)) {
            doReturn(java.lang.Object.class).when(typeMock).getRawType();
            doReturn(typeLiteralMock).when(typeMock).getSupertype(Object.class);
            doReturn(java.lang.Object.class).when(typeLiteralMock).getRawType();
            Field[] fieldArray = new Field[]{};
            declaredMembers.when(() -> DeclaredMembers.getDeclaredFields(Object.class)).thenReturn(fieldArray);
            injectionPoint.when(() -> InjectionPoint.getAtInject(fieldMock)).thenReturn(annotationMock);
            Method[] methodArray = new Method[]{};
            declaredMembers.when(() -> DeclaredMembers.getDeclaredMethods(Object.class)).thenReturn(methodArray);
            injectionPoint.when(() -> InjectionPoint.getAtInject(methodMock)).thenReturn(annotationMock2);
            Annotation[] annotationArray = new Annotation[]{};
            annotations.when(() -> Annotations.findBindingAnnotation((Errors) any(), eq(methodMock), eq(annotationArray))).thenReturn(annotationMock3);
            //Act Statement(s)
            Set<InjectionPoint> result = InjectionPoint.forStaticMethodsAndFields(typeMock);
            ImmutableSet injectionPointSet = ImmutableSet.builder().build();
            //Assert statement(s)
            assertThat(result, equalTo(injectionPointSet));
            verify(typeMock, times(5)).getRawType();
            verify(typeMock, atLeast(1)).getSupertype(Object.class);
            verify(typeLiteralMock, atLeast(1)).getRawType();
            declaredMembers.verify(() -> DeclaredMembers.getDeclaredFields(Object.class), atLeast(1));
            injectionPoint.verify(() -> InjectionPoint.getAtInject(fieldMock), atLeast(1));
            declaredMembers.verify(() -> DeclaredMembers.getDeclaredMethods(Object.class), atLeast(1));
            injectionPoint.verify(() -> InjectionPoint.getAtInject(methodMock), atLeast(1));
            annotations.verify(() -> Annotations.findBindingAnnotation((Errors) any(), eq(methodMock), eq(annotationArray)), atLeast(1));
        }
    }

    //Sapient generated method id: ${6a4ddf94-1854-3f2f-93fd-ceca76d8af92}, hash: B99BAB31C9E77FCEFD1C5CBA0BAEF330
    @Ignore()
    @Test()
    public void forStaticMethodsAndFieldsWhenIsValidMethodInjectableMethodErrorsAndStaticsAndInjectableMembersNotIsEmptyAndImIsNullAndE() throws NoSuchFieldException {
        /* Branches:
         * (type.getRawType().isInterface()) : false
         * (current.getRawType() != Object.class) : true  #  inside hierarchyFor method
         * (i >= 0) : true  #  inside getInjectionPoints method
         * (overrideIndex != null) : false  #  inside getInjectionPoints method
         * (for-each(getDeclaredFields(current))) : true  #  inside getInjectionPoints method
         * (Modifier.isStatic(field.getModifiers()) == statics) : true  #  inside getInjectionPoints method
         * (atInject != null) : true  #  inside getInjectionPoints method
         * (injectableField.specInject) : false  #  inside getInjectionPoints method
         * (for-each(getDeclaredMethods(current))) : true  #  inside getInjectionPoints method
         * (Modifier.isStatic(method.getModifiers()) == statics) : true  #  inside isEligibleForInjection method
         * (!method.isBridge()) : true  #  inside isEligibleForInjection method
         * (!method.isSynthetic()) : true  #  inside isEligibleForInjection method
         * (isEligibleForInjection(method, statics)) : true  #  inside getInjectionPoints method
         * (atInject != null) : true  #  inside getInjectionPoints method
         * (misplacedBindingAnnotation == null) : false  #  inside checkForMisplacedBindingAnnotations method
         * (member instanceof Method) : true  #  inside checkForMisplacedBindingAnnotations method
         * (member.getDeclaringClass().getDeclaredField(member.getName()) != null) : true  #  inside checkForMisplacedBindingAnnotations method
         * (checkForMisplacedBindingAnnotations(method, errors)) : false  #  inside getInjectionPoints method
         * (injectableMethod.specInject) : false  #  inside isValidMethod method
         * (!isValidMethod(injectableMethod, errors)) : false  #  inside getInjectionPoints method
         * (statics) : true  #  inside getInjectionPoints method
         * (injectableMembers.isEmpty()) : false  #  inside getInjectionPoints method
         * (im != null) : false  #  inside getInjectionPoints method
         * (errors.hasErrors()) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Annotations> annotations = mockStatic(Annotations.class);
             MockedStatic<InjectionPoint> injectionPoint = mockStatic(InjectionPoint.class, CALLS_REAL_METHODS);
             MockedStatic<DeclaredMembers> declaredMembers = mockStatic(DeclaredMembers.class)) {
            doReturn(java.lang.Object.class).when(typeMock).getRawType();
            doReturn(typeLiteralMock).when(typeMock).getSupertype(Object.class);
            doReturn(java.lang.Object.class).when(typeLiteralMock).getRawType();
            Field[] fieldArray = new Field[]{};
            declaredMembers.when(() -> DeclaredMembers.getDeclaredFields(Object.class)).thenReturn(fieldArray);
            injectionPoint.when(() -> InjectionPoint.getAtInject(fieldMock)).thenReturn(annotationMock);
            Method[] methodArray = new Method[]{};
            declaredMembers.when(() -> DeclaredMembers.getDeclaredMethods(Object.class)).thenReturn(methodArray);
            injectionPoint.when(() -> InjectionPoint.getAtInject(methodMock)).thenReturn(annotationMock2);
            Annotation[] annotationArray = new Annotation[]{};
            annotations.when(() -> Annotations.findBindingAnnotation((Errors) any(), eq(methodMock), eq(annotationArray))).thenReturn(annotationMock3);
            //Act Statement(s)
            Set<InjectionPoint> result = InjectionPoint.forStaticMethodsAndFields(typeMock);
            ImmutableSet injectionPointSet = ImmutableSet.builder().build();
            //Assert statement(s)
            assertThat(result, equalTo(injectionPointSet));
            verify(typeMock, times(5)).getRawType();
            verify(typeMock, atLeast(1)).getSupertype(Object.class);
            verify(typeLiteralMock, atLeast(1)).getRawType();
            declaredMembers.verify(() -> DeclaredMembers.getDeclaredFields(Object.class), atLeast(1));
            injectionPoint.verify(() -> InjectionPoint.getAtInject(fieldMock), atLeast(1));
            declaredMembers.verify(() -> DeclaredMembers.getDeclaredMethods(Object.class), atLeast(1));
            injectionPoint.verify(() -> InjectionPoint.getAtInject(methodMock), atLeast(1));
            annotations.verify(() -> Annotations.findBindingAnnotation((Errors) any(), eq(methodMock), eq(annotationArray)), atLeast(1));
        }
    }

    //Sapient generated method id: ${e8fe3a55-3e15-376b-86e5-6461dd2f0a3d}, hash: 7C5264B2FA38C1BBF3B51A305444336A
    @Test()
    public void forStaticMethodsAndFields1Test() throws NoSuchFieldException {
        //Arrange Statement(s)
        try (MockedStatic<InjectionPoint> injectionPoint = mockStatic(InjectionPoint.class, CALLS_REAL_METHODS);
             MockedStatic<TypeLiteral> typeLiteral = mockStatic(TypeLiteral.class)) {
            typeLiteral.when(() -> TypeLiteral.get(Object.class)).thenReturn(typeLiteralMock);
            Set<InjectionPoint> injectionPointSet = new HashSet<>();
            injectionPoint.when(() -> InjectionPoint.forStaticMethodsAndFields(typeLiteralMock)).thenReturn(injectionPointSet);
            //Act Statement(s)
            Set<InjectionPoint> result = InjectionPoint.forStaticMethodsAndFields(Object.class);
            //Assert statement(s)
            assertThat(result, equalTo(injectionPointSet));
            typeLiteral.verify(() -> TypeLiteral.get(Object.class), atLeast(1));
            injectionPoint.verify(() -> InjectionPoint.forStaticMethodsAndFields(typeLiteralMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${8f52b0a1-ead0-3bbd-bd64-2169b74e834d}, hash: 3974523B82994BB4347F2CE62888C751
    @Ignore()
    @Test()
    public void forInstanceMethodsAndFieldsWhenInjectableMembersNotIsEmptyAndImIsNullAndErrorsNotHasErrors6() throws NoSuchFieldException {
        /* Branches:
         * (current.getRawType() != Object.class) : true  #  inside hierarchyFor method
         * (i >= 0) : true  #  inside getInjectionPoints method
         * (overrideIndex != null) : false  #  inside getInjectionPoints method
         * (for-each(getDeclaredFields(current))) : true  #  inside getInjectionPoints method
         * (Modifier.isStatic(field.getModifiers()) == statics) : true  #  inside getInjectionPoints method
         * (atInject != null) : true  #  inside getInjectionPoints method
         * (injectableField.specInject) : false  #  inside getInjectionPoints method
         * (for-each(getDeclaredMethods(current))) : true  #  inside getInjectionPoints method
         * (Modifier.isStatic(method.getModifiers()) == statics) : true  #  inside isEligibleForInjection method
         * (!method.isBridge()) : true  #  inside isEligibleForInjection method
         * (!method.isSynthetic()) : false  #  inside isEligibleForInjection method
         * (isEligibleForInjection(method, statics)) : false  #  inside getInjectionPoints method
         * (injectableMembers.isEmpty()) : false  #  inside getInjectionPoints method
         * (im != null) : false  #  inside getInjectionPoints method
         * (errors.hasErrors()) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<DeclaredMembers> declaredMembers = mockStatic(DeclaredMembers.class);
             MockedStatic<InjectionPoint> injectionPoint = mockStatic(InjectionPoint.class, CALLS_REAL_METHODS)) {
            doReturn(java.lang.Object.class).when(currentMock).getRawType();
            doReturn(typeLiteralMock).when(currentMock).getSupertype(Object.class);
            doReturn(java.lang.Object.class).when(typeLiteralMock).getRawType();
            Field[] fieldArray = new Field[]{fieldMock};
            declaredMembers.when(() -> DeclaredMembers.getDeclaredFields(Object.class)).thenReturn(fieldArray);
            injectionPoint.when(() -> InjectionPoint.getAtInject(fieldMock)).thenReturn(annotationMock);
            Method[] methodArray = new Method[]{methodMock};
            declaredMembers.when(() -> DeclaredMembers.getDeclaredMethods(Object.class)).thenReturn(methodArray);
            //Act Statement(s)
            Set<InjectionPoint> result = InjectionPoint.forInstanceMethodsAndFields(currentMock);
            ImmutableSet injectionPointSet = ImmutableSet.builder().build();
            //Assert statement(s)
            assertThat(result, equalTo(injectionPointSet));
            verify(currentMock, times(4)).getRawType();
            verify(currentMock, atLeast(1)).getSupertype(Object.class);
            verify(typeLiteralMock, atLeast(1)).getRawType();
            declaredMembers.verify(() -> DeclaredMembers.getDeclaredFields(Object.class), atLeast(1));
            injectionPoint.verify(() -> InjectionPoint.getAtInject(fieldMock), atLeast(1));
            declaredMembers.verify(() -> DeclaredMembers.getDeclaredMethods(Object.class), atLeast(1));
        }
    }

    //Sapient generated method id: ${e904fa09-92cf-31fe-bf86-b70b2cd615b6}, hash: 3029DAC99A515159E4214477D2BF694C
    @Ignore()
    @Test()
    public void forInstanceMethodsAndFieldsWhenOverrideIndexIsNullAndInjectableMembersIsEmptyAndErrorsNotHasErrors() throws NoSuchFieldException {
        /* Branches:
         * (current.getRawType() != Object.class) : true  #  inside hierarchyFor method
         * (i >= 0) : true  #  inside getInjectionPoints method
         * (overrideIndex != null) : false  #  inside getInjectionPoints method
         * (for-each(getDeclaredFields(current))) : true  #  inside getInjectionPoints method
         * (Modifier.isStatic(field.getModifiers()) == statics) : true  #  inside getInjectionPoints method
         * (atInject != null) : true  #  inside getInjectionPoints method
         * (injectableField.specInject) : false  #  inside getInjectionPoints method
         * (for-each(getDeclaredMethods(current))) : true  #  inside getInjectionPoints method
         * (Modifier.isStatic(method.getModifiers()) == statics) : true  #  inside isEligibleForInjection method
         * (!method.isBridge()) : true  #  inside isEligibleForInjection method
         * (!method.isSynthetic()) : true  #  inside isEligibleForInjection method
         * (isEligibleForInjection(method, statics)) : true  #  inside getInjectionPoints method
         * (atInject != null) : false  #  inside getInjectionPoints method
         * (overrideIndex != null) : false  #  inside getInjectionPoints method
         * (injectableMembers.isEmpty()) : true  #  inside getInjectionPoints method
         * (errors.hasErrors()) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<InjectionPoint> injectionPoint = mockStatic(InjectionPoint.class, CALLS_REAL_METHODS);
             MockedStatic<DeclaredMembers> declaredMembers = mockStatic(DeclaredMembers.class)) {
            doReturn(java.lang.Object.class).when(currentMock).getRawType();
            doReturn(typeLiteralMock).when(currentMock).getSupertype(Object.class);
            doReturn(java.lang.Object.class).when(typeLiteralMock).getRawType();
            Field[] fieldArray = new Field[]{fieldMock};
            declaredMembers.when(() -> DeclaredMembers.getDeclaredFields(Object.class)).thenReturn(fieldArray);
            injectionPoint.when(() -> InjectionPoint.getAtInject(fieldMock)).thenReturn(annotationMock);
            Method[] methodArray = new Method[]{methodMock};
            declaredMembers.when(() -> DeclaredMembers.getDeclaredMethods(Object.class)).thenReturn(methodArray);
            injectionPoint.when(() -> InjectionPoint.getAtInject(methodMock)).thenReturn(null);
            //Act Statement(s)
            Set<InjectionPoint> result = InjectionPoint.forInstanceMethodsAndFields(currentMock);
            //Assert statement(s)
            assertThat(result.size(), equalTo(0));
            verify(currentMock, times(4)).getRawType();
            verify(currentMock, atLeast(1)).getSupertype(Object.class);
            verify(typeLiteralMock, atLeast(1)).getRawType();
            declaredMembers.verify(() -> DeclaredMembers.getDeclaredFields(Object.class), atLeast(1));
            injectionPoint.verify(() -> InjectionPoint.getAtInject(fieldMock), atLeast(1));
            declaredMembers.verify(() -> DeclaredMembers.getDeclaredMethods(Object.class), atLeast(1));
            injectionPoint.verify(() -> InjectionPoint.getAtInject(methodMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${cf58bf14-2391-33f5-ba41-4287ee0874a2}, hash: FA446555C509A6E560B4623AE9E31877
    @Ignore()
    @Test()
    public void forInstanceMethodsAndFieldsWhenNotStaticsAndOverrideIndexIsNullAndInjectableMembersIsEmptyAndErrorsNotHasErrors() throws NoSuchFieldException {
        /* Branches:
         * (current.getRawType() != Object.class) : true  #  inside hierarchyFor method
         * (i >= 0) : true  #  inside getInjectionPoints method
         * (overrideIndex != null) : false  #  inside getInjectionPoints method
         * (for-each(getDeclaredFields(current))) : true  #  inside getInjectionPoints method
         * (Modifier.isStatic(field.getModifiers()) == statics) : true  #  inside getInjectionPoints method
         * (atInject != null) : true  #  inside getInjectionPoints method
         * (injectableField.specInject) : false  #  inside getInjectionPoints method
         * (for-each(getDeclaredMethods(current))) : true  #  inside getInjectionPoints method
         * (Modifier.isStatic(method.getModifiers()) == statics) : true  #  inside isEligibleForInjection method
         * (!method.isBridge()) : true  #  inside isEligibleForInjection method
         * (!method.isSynthetic()) : true  #  inside isEligibleForInjection method
         * (isEligibleForInjection(method, statics)) : true  #  inside getInjectionPoints method
         * (atInject != null) : true  #  inside getInjectionPoints method
         * (misplacedBindingAnnotation == null) : true  #  inside checkForMisplacedBindingAnnotations method
         * (checkForMisplacedBindingAnnotations(method, errors)) : false  #  inside getInjectionPoints method
         * (injectableMethod.specInject) : false  #  inside isValidMethod method
         * (!isValidMethod(injectableMethod, errors)) : false  #  inside getInjectionPoints method
         * (statics) : false  #  inside getInjectionPoints method
         * (overrideIndex == null) : true  #  inside getInjectionPoints method
         * (injectableMembers.isEmpty()) : true  #  inside getInjectionPoints method
         * (errors.hasErrors()) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Annotations> annotations = mockStatic(Annotations.class);
             MockedStatic<InjectionPoint> injectionPoint = mockStatic(InjectionPoint.class, CALLS_REAL_METHODS);
             MockedStatic<DeclaredMembers> declaredMembers = mockStatic(DeclaredMembers.class)) {
            doReturn(java.lang.Object.class).when(currentMock).getRawType();
            doReturn(typeLiteralMock).when(currentMock).getSupertype(Object.class);
            doReturn(java.lang.Object.class).when(typeLiteralMock).getRawType();
            Field[] fieldArray = new Field[]{fieldMock};
            declaredMembers.when(() -> DeclaredMembers.getDeclaredFields(Object.class)).thenReturn(fieldArray);
            injectionPoint.when(() -> InjectionPoint.getAtInject(fieldMock2)).thenReturn(annotationMock);
            Method[] methodArray = new Method[]{methodMock};
            declaredMembers.when(() -> DeclaredMembers.getDeclaredMethods(Object.class)).thenReturn(methodArray);
            injectionPoint.when(() -> InjectionPoint.getAtInject(methodMock2)).thenReturn(annotationMock2);
            Annotation[] annotationArray = new Annotation[]{};
            annotations.when(() -> Annotations.findBindingAnnotation((Errors) any(), eq(methodMock3), eq(annotationArray))).thenReturn(null);
            //Act Statement(s)
            Set<InjectionPoint> result = InjectionPoint.forInstanceMethodsAndFields(currentMock);
            //Assert statement(s)
            assertThat(result.size(), equalTo(0));
            verify(currentMock, times(4)).getRawType();
            verify(currentMock, atLeast(1)).getSupertype(Object.class);
            verify(typeLiteralMock, atLeast(1)).getRawType();
            declaredMembers.verify(() -> DeclaredMembers.getDeclaredFields(Object.class), atLeast(1));
            injectionPoint.verify(() -> InjectionPoint.getAtInject(fieldMock2), atLeast(1));
            declaredMembers.verify(() -> DeclaredMembers.getDeclaredMethods(Object.class), atLeast(1));
            injectionPoint.verify(() -> InjectionPoint.getAtInject(methodMock2), atLeast(1));
            annotations.verify(() -> Annotations.findBindingAnnotation((Errors) any(), eq(methodMock3), eq(annotationArray)), atLeast(1));
        }
    }

    //Sapient generated method id: ${626f5f04-1858-3550-96fe-9cbb6e22a474}, hash: 5FB531E5F107D9D20169C52E9450B50D
    @Ignore()
    @Test()
    public void forInstanceMethodsAndFieldsWhenCheckForMisplacedBindingAnnotationsMethodErrorsAndOverrideIndexIsNullAndInjectableMember() throws NoSuchFieldException {
        /* Branches:
         * (current.getRawType() != Object.class) : true  #  inside hierarchyFor method
         * (i >= 0) : true  #  inside getInjectionPoints method
         * (overrideIndex != null) : false  #  inside getInjectionPoints method
         * (for-each(getDeclaredFields(current))) : true  #  inside getInjectionPoints method
         * (Modifier.isStatic(field.getModifiers()) == statics) : true  #  inside getInjectionPoints method
         * (atInject != null) : true  #  inside getInjectionPoints method
         * (injectableField.specInject) : false  #  inside getInjectionPoints method
         * (for-each(getDeclaredMethods(current))) : true  #  inside getInjectionPoints method
         * (Modifier.isStatic(method.getModifiers()) == statics) : true  #  inside isEligibleForInjection method
         * (!method.isBridge()) : true  #  inside isEligibleForInjection method
         * (!method.isSynthetic()) : true  #  inside isEligibleForInjection method
         * (isEligibleForInjection(method, statics)) : true  #  inside getInjectionPoints method
         * (atInject != null) : true  #  inside getInjectionPoints method
         * (misplacedBindingAnnotation == null) : false  #  inside checkForMisplacedBindingAnnotations method
         * (member instanceof Method) : true  #  inside checkForMisplacedBindingAnnotations method
         * (member.getDeclaringClass().getDeclaredField(member.getName()) != null) : false  #  inside checkForMisplacedBindingAnnotations method
         * (checkForMisplacedBindingAnnotations(method, errors)) : true  #  inside getInjectionPoints method
         * (overrideIndex != null) : false  #  inside getInjectionPoints method
         * (injectableMembers.isEmpty()) : false  #  inside getInjectionPoints method
         * (im != null) : false  #  inside getInjectionPoints method
         * (errors.hasErrors()) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Annotations> annotations = mockStatic(Annotations.class);
             MockedStatic<InjectionPoint> injectionPoint = mockStatic(InjectionPoint.class, CALLS_REAL_METHODS);
             MockedStatic<DeclaredMembers> declaredMembers = mockStatic(DeclaredMembers.class)) {
            doReturn(java.lang.Object.class).when(currentMock).getRawType();
            doReturn(typeLiteralMock).when(currentMock).getSupertype(Object.class);
            doReturn(java.lang.Object.class).when(typeLiteralMock).getRawType();
            Field[] fieldArray = new Field[]{fieldMock};
            declaredMembers.when(() -> DeclaredMembers.getDeclaredFields(Object.class)).thenReturn(fieldArray);
            injectionPoint.when(() -> InjectionPoint.getAtInject(fieldMock)).thenReturn(annotationMock);
            Method[] methodArray = new Method[]{methodMock};
            declaredMembers.when(() -> DeclaredMembers.getDeclaredMethods(Object.class)).thenReturn(methodArray);
            injectionPoint.when(() -> InjectionPoint.getAtInject(methodMock)).thenReturn(annotationMock2);
            Annotation[] annotationArray = new Annotation[]{};
            annotations.when(() -> Annotations.findBindingAnnotation((Errors) any(), eq(methodMock), eq(annotationArray))).thenReturn(annotationMock3);
            //Act Statement(s)
            Set<InjectionPoint> result = InjectionPoint.forInstanceMethodsAndFields(currentMock);
            ImmutableSet injectionPointSet = ImmutableSet.builder().build();
            //Assert statement(s)
            assertThat(result, equalTo(injectionPointSet));
            verify(currentMock, times(4)).getRawType();
            verify(currentMock, atLeast(1)).getSupertype(Object.class);
            verify(typeLiteralMock, atLeast(1)).getRawType();
            declaredMembers.verify(() -> DeclaredMembers.getDeclaredFields(Object.class), atLeast(1));
            injectionPoint.verify(() -> InjectionPoint.getAtInject(fieldMock), atLeast(1));
            declaredMembers.verify(() -> DeclaredMembers.getDeclaredMethods(Object.class), atLeast(1));
            injectionPoint.verify(() -> InjectionPoint.getAtInject(methodMock), atLeast(1));
            annotations.verify(() -> Annotations.findBindingAnnotation((Errors) any(), eq(methodMock), eq(annotationArray)), atLeast(1));
        }
    }

    //Sapient generated method id: ${cd27896a-4d42-397f-a4c2-81eca650158e}, hash: EE14D3431FE29044BE8E693F64FBA974
    @Ignore()
    @Test()
    public void forInstanceMethodsAndFieldsWhenOverrideIndexIsNullAndInjectableMembersNotIsEmptyAndImIsNullAndErrorsNotHasErrors2() throws NoSuchFieldException {
        /* Branches:
         * (current.getRawType() != Object.class) : true  #  inside hierarchyFor method
         * (i >= 0) : true  #  inside getInjectionPoints method
         * (overrideIndex != null) : false  #  inside getInjectionPoints method
         * (for-each(getDeclaredFields(current))) : true  #  inside getInjectionPoints method
         * (Modifier.isStatic(field.getModifiers()) == statics) : true  #  inside getInjectionPoints method
         * (atInject != null) : true  #  inside getInjectionPoints method
         * (injectableField.specInject) : false  #  inside getInjectionPoints method
         * (for-each(getDeclaredMethods(current))) : true  #  inside getInjectionPoints method
         * (Modifier.isStatic(method.getModifiers()) == statics) : true  #  inside isEligibleForInjection method
         * (!method.isBridge()) : true  #  inside isEligibleForInjection method
         * (!method.isSynthetic()) : true  #  inside isEligibleForInjection method
         * (isEligibleForInjection(method, statics)) : true  #  inside getInjectionPoints method
         * (atInject != null) : true  #  inside getInjectionPoints method
         * (misplacedBindingAnnotation == null) : false  #  inside checkForMisplacedBindingAnnotations method
         * (member instanceof Method) : true  #  inside checkForMisplacedBindingAnnotations method
         * (member.getDeclaringClass().getDeclaredField(member.getName()) != null) : true  #  inside checkForMisplacedBindingAnnotations method
         * (checkForMisplacedBindingAnnotations(method, errors)) : false  #  inside getInjectionPoints method
         * (injectableMethod.specInject) : false  #  inside isValidMethod method
         * (!isValidMethod(injectableMethod, errors)) : false  #  inside getInjectionPoints method
         * (statics) : false  #  inside getInjectionPoints method
         * (overrideIndex == null) : true  #  inside getInjectionPoints method
         * (injectableMembers.isEmpty()) : false  #  inside getInjectionPoints method
         * (im != null) : false  #  inside getInjectionPoints method
         * (errors.hasErrors()) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Annotations> annotations = mockStatic(Annotations.class);
             MockedStatic<InjectionPoint> injectionPoint = mockStatic(InjectionPoint.class, CALLS_REAL_METHODS);
             MockedStatic<DeclaredMembers> declaredMembers = mockStatic(DeclaredMembers.class)) {
            doReturn(java.lang.Object.class).when(currentMock).getRawType();
            doReturn(typeLiteralMock).when(currentMock).getSupertype(Object.class);
            doReturn(java.lang.Object.class).when(typeLiteralMock).getRawType();
            Field[] fieldArray = new Field[]{fieldMock};
            declaredMembers.when(() -> DeclaredMembers.getDeclaredFields(Object.class)).thenReturn(fieldArray);
            injectionPoint.when(() -> InjectionPoint.getAtInject(fieldMock)).thenReturn(annotationMock);
            Method[] methodArray = new Method[]{methodMock};
            declaredMembers.when(() -> DeclaredMembers.getDeclaredMethods(Object.class)).thenReturn(methodArray);
            injectionPoint.when(() -> InjectionPoint.getAtInject(methodMock)).thenReturn(annotationMock2);
            Annotation[] annotationArray = new Annotation[]{};
            annotations.when(() -> Annotations.findBindingAnnotation((Errors) any(), eq(methodMock), eq(annotationArray))).thenReturn(annotationMock3);
            //Act Statement(s)
            Set<InjectionPoint> result = InjectionPoint.forInstanceMethodsAndFields(currentMock);
            ImmutableSet injectionPointSet = ImmutableSet.builder().build();
            //Assert statement(s)
            assertThat(result, equalTo(injectionPointSet));
            verify(currentMock, times(4)).getRawType();
            verify(currentMock, atLeast(1)).getSupertype(Object.class);
            verify(typeLiteralMock, atLeast(1)).getRawType();
            declaredMembers.verify(() -> DeclaredMembers.getDeclaredFields(Object.class), atLeast(1));
            injectionPoint.verify(() -> InjectionPoint.getAtInject(fieldMock), atLeast(1));
            declaredMembers.verify(() -> DeclaredMembers.getDeclaredMethods(Object.class), atLeast(1));
            injectionPoint.verify(() -> InjectionPoint.getAtInject(methodMock), atLeast(1));
            annotations.verify(() -> Annotations.findBindingAnnotation((Errors) any(), eq(methodMock), eq(annotationArray)), atLeast(1));
        }
    }

    //Sapient generated method id: ${b93af09e-5869-36f6-91e5-2ca1464244db}, hash: DCA117514A68AA6642BE51467407C0EB
    @Test()
    public void forInstanceMethodsAndFields1Test() throws NoSuchFieldException {
        //Arrange Statement(s)
        try (MockedStatic<InjectionPoint> injectionPoint = mockStatic(InjectionPoint.class, CALLS_REAL_METHODS);
             MockedStatic<TypeLiteral> typeLiteral = mockStatic(TypeLiteral.class)) {
            typeLiteral.when(() -> TypeLiteral.get(Object.class)).thenReturn(typeLiteralMock);
            Set<InjectionPoint> injectionPointSet = new HashSet<>();
            injectionPoint.when(() -> InjectionPoint.forInstanceMethodsAndFields(typeLiteralMock)).thenReturn(injectionPointSet);
            //Act Statement(s)
            Set<InjectionPoint> result = InjectionPoint.forInstanceMethodsAndFields(Object.class);
            //Assert statement(s)
            assertThat(result, equalTo(injectionPointSet));
            typeLiteral.verify(() -> TypeLiteral.get(Object.class), atLeast(1));
            injectionPoint.verify(() -> InjectionPoint.forInstanceMethodsAndFields(typeLiteralMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${808e40bd-1442-37bb-a889-d6f965098df0}, hash: 8E8E30698AE1E5BDA1B51312B54CCB74
    @Ignore()
    @Test()
    public void getAtInjectWhenAIsNull() {
        /* Branches:
         * (a == null) : true
         */
        //Arrange Statement(s)
        doReturn(null).when(memberMock).getAnnotation(Inject.class);
        doReturn(annotationMock).when(memberMock).getAnnotation(com.google.inject.Inject.class);
        //Act Statement(s)
        Annotation result = InjectionPoint.getAtInject(memberMock);
        //Assert statement(s)
        assertThat(result, equalTo(annotationMock));
        verify(memberMock).getAnnotation(Inject.class);
        verify(memberMock).getAnnotation(com.google.inject.Inject.class);
    }

    //Sapient generated method id: ${eea66e04-e62c-3268-a509-d93f6759e97a}, hash: 5F5FBF87516270DB014B239826ACAD03
    @Ignore()
    @Test()
    public void getAtInjectWhenAIsNotNull() {
        /* Branches:
         * (a == null) : false
         */
        //Arrange Statement(s)
        doReturn(annotationMock).when(memberMock).getAnnotation(Inject.class);
        //Act Statement(s)
        Annotation result = InjectionPoint.getAtInject(memberMock);
        //Assert statement(s)
        assertThat(result, equalTo(annotationMock));
        verify(memberMock).getAnnotation(Inject.class);
    }

    //Sapient generated method id: ${64515037-37e2-374c-99e9-c4e20850d500}, hash: C63CE8F2B0BC62D77A4611802EE2160C
    @Ignore()
    @Test()
    public void getAnnotationsWhenKotlinAnnotationsLengthEquals0() {
        /* Branches:
         * (kotlinAnnotations.length == 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<KotlinSupport> kotlinSupport = mockStatic(KotlinSupport.class)) {
            kotlinSupport.when(() -> KotlinSupport.getInstance()).thenReturn(kotlinSupportInterfaceMock);
            Annotation[] annotationArray = new Annotation[]{};
            doReturn(annotationArray).when(kotlinSupportInterfaceMock).getAnnotations(fieldMock);
            //Act Statement(s)
            Annotation[] result = InjectionPoint.getAnnotations(fieldMock);
            //Assert statement(s)
            assertThat(result.length, equalTo(0));
            kotlinSupport.verify(() -> KotlinSupport.getInstance(), atLeast(1));
            verify(kotlinSupportInterfaceMock).getAnnotations(fieldMock);
        }
    }

    //Sapient generated method id: ${af8c6de8-b84a-3514-be67-901ef255db78}, hash: 193558F9CAAFB72DCB138D36AB549456
    @Ignore()
    @Test()
    public void getAnnotationsWhenKotlinAnnotationsLengthNotEquals0() {
        /* Branches:
         * (kotlinAnnotations.length == 0) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        Annotation[] result = InjectionPoint.getAnnotations(fieldMock);
        //Assert statement(s)
        assertThat(result.length, equalTo(0));
    }
}

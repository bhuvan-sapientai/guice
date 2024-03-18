package com.google.inject.internal;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;

import org.junit.rules.ExpectedException;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

import com.google.inject.TypeLiteral;
import org.mockito.MockedStatic;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.hamcrest.Matchers.is;

public class ProvidesMethodScannerSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Annotation annotationMock = mock(Annotation.class);

    private final Method methodMock = mock(Method.class);

    private final TypeLiteral<Annotation> typeLiteralMock = mock(TypeLiteral.class);

    private final TypeLiteral typeLiteralMock2 = mock(TypeLiteral.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${49a66237-2750-3d76-b03b-97da570211b0}, hash: 5321CCBD260A3773CCF47DDE12D8C2EF
    @Test()
    public void typeAndValueOfMapKeyWhenMapKeyAnnotationAnnotationTypeGetAnnotationMapKeyNotUnwrapValue() throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        //TODO: Please change the modifier of the below class from private to public to isolate the test case scenario.
        //Assert statement(s)
        /* Branches:
         * (!mapKeyAnnotation.annotationType().getAnnotation(MapKey.class).unwrapValue()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //Annotation mapKeyAnnotationMock = mock(Annotation.class);
        //doReturn(java.lang.annotation.Annotation.class).when(mapKeyAnnotationMock).annotationType();
        //typeLiteral.when(() -> TypeLiteral.get(Annotation.class)).thenReturn(typeLiteralMock);
        ////Act Statement(s)ProvidesMethodScanner.TypeAndValue<?> result = ProvidesMethodScanner.typeAndValueOfMapKey(mapKeyAnnotationMock);
        //assertThat(result, is(notNullValue()));
        //verify(mapKeyAnnotationMock, times(2)).annotationType();
        //typeLiteral.verify(() -> TypeLiteral.get(Annotation.class), atLeast(1));
    }

    //Sapient generated method id: ${32895bb0-78bf-3029-9212-780d30f2b612}, hash: 3D5974D67E29CEB35EEE88F727F6A33B
    @Test()
    public void typeAndValueOfMapKeyWhenMapKeyAnnotationAnnotationTypeGetAnnotationMapKeyUnwrapValue() throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        //TODO: Please change the modifier of the below class from private to public to isolate the test case scenario.
        //Assert statement(s)
        //typeLiteral.when(() -> TypeLiteral.get(Annotation.class)).thenReturn(typeLiteralMock);
        //doReturn(typeLiteralMock2).when(typeLiteralMock).getReturnType(methodMock);
        ////Act Statement(s)ProvidesMethodScanner.TypeAndValue<?> result = ProvidesMethodScanner.typeAndValueOfMapKey(annotationMock);
        //assertThat(result, is(notNullValue()));
        //typeLiteral.verify(() -> TypeLiteral.get(Annotation.class), atLeast(1));
        //verify(typeLiteralMock).getReturnType(methodMock);
    }

    //Sapient generated method id: ${1e2cf167-be2a-3031-b538-9a22c8d35be6}, hash: 247F1712DDB6C7F7164397EAC7EDF94A
    @Test()
    public void typeAndValueOfMapKeyWhenCaughtNoSuchMethodExceptionThrowsIllegalStateException() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        //TODO: Please change the modifier of the below class from private to public to isolate the test case scenario.
        //Assert statement(s)
        //typeLiteral.when(() -> TypeLiteral.get(Annotation.class)).thenReturn(typeLiteralMock);
        //doReturn(typeLiteralMock2).when(typeLiteralMock).getReturnType(methodMock);
        //Object object = new Object();
        //Object[] objectArray = new Object[] {};
        //doReturn(object).when(methodMock).invoke(annotationMock, objectArray);
        //thrown.expect(IllegalStateException.class);
        //thrown.expectCause(is(instanceOf(NoSuchMethodException.class)));
        ////Act Statement(s)ProvidesMethodScanner.typeAndValueOfMapKey(annotationMock);
        //typeLiteral.verify(() -> TypeLiteral.get(Annotation.class), atLeast(1));
        //verify(typeLiteralMock).getReturnType(methodMock);
        //verify(methodMock).invoke(annotationMock, objectArray);
    }

    //Sapient generated method id: ${5a67c878-be1c-3676-939f-1ac8f23d6463}, hash: CD8DB81B23D16E43940AD4C0BFA249A1
    @Test()
    public void typeAndValueOfMapKeyWhenCaughtSecurityExceptionThrowsIllegalStateException() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        //TODO: Please change the modifier of the below class from private to public to isolate the test case scenario.
        //Assert statement(s)
        //typeLiteral.when(() -> TypeLiteral.get(Annotation.class)).thenReturn(typeLiteralMock);
        //doReturn(typeLiteralMock2).when(typeLiteralMock).getReturnType(methodMock);
        //Object object = new Object();
        //Object[] objectArray = new Object[] {};
        //doReturn(object).when(methodMock).invoke(annotationMock, objectArray);
        //thrown.expect(IllegalStateException.class);
        //thrown.expectCause(is(instanceOf(SecurityException.class)));
        ////Act Statement(s)ProvidesMethodScanner.typeAndValueOfMapKey(annotationMock);
        //typeLiteral.verify(() -> TypeLiteral.get(Annotation.class), atLeast(1));
        //verify(typeLiteralMock).getReturnType(methodMock);
        //verify(methodMock).invoke(annotationMock, objectArray);
    }

    //Sapient generated method id: ${e27eded8-a800-34c8-a1fc-59189fd3a87f}, hash: CCF692300B2619AC96787BDE72BFB1B3
    @Test()
    public void typeAndValueOfMapKeyWhenCaughtIllegalAccessExceptionThrowsIllegalStateException() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        //TODO: Please change the modifier of the below class from private to public to isolate the test case scenario.
        //Assert statement(s)
        //typeLiteral.when(() -> TypeLiteral.get(Annotation.class)).thenReturn(typeLiteralMock);
        //doReturn(typeLiteralMock2).when(typeLiteralMock).getReturnType(methodMock);
        //Object object = new Object();
        //Object[] objectArray = new Object[] {};
        //doReturn(object).when(methodMock).invoke(annotationMock, objectArray);
        //thrown.expect(IllegalStateException.class);
        //thrown.expectCause(is(instanceOf(IllegalAccessException.class)));
        ////Act Statement(s)ProvidesMethodScanner.typeAndValueOfMapKey(annotationMock);
        //typeLiteral.verify(() -> TypeLiteral.get(Annotation.class), atLeast(1));
        //verify(typeLiteralMock).getReturnType(methodMock);
        //verify(methodMock).invoke(annotationMock, objectArray);
    }

    //Sapient generated method id: ${b45226f3-1bc2-3c47-863f-cb8273bf9091}, hash: F0EB2211A9D60ABFA5B092E88AC4FD4F
    @Test()
    public void typeAndValueOfMapKeyWhenCaughtInvocationTargetExceptionThrowsIllegalStateException() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        //TODO: Please change the modifier of the below class from private to public to isolate the test case scenario.
        //Assert statement(s)
        //typeLiteral.when(() -> TypeLiteral.get(Annotation.class)).thenReturn(typeLiteralMock);
        //doReturn(typeLiteralMock2).when(typeLiteralMock).getReturnType(methodMock);
        //Object object = new Object();
        //Object[] objectArray = new Object[] {};
        //doReturn(object).when(methodMock).invoke(annotationMock, objectArray);
        //thrown.expect(IllegalStateException.class);
        //thrown.expectCause(is(instanceOf(InvocationTargetException.class)));
        ////Act Statement(s)ProvidesMethodScanner.typeAndValueOfMapKey(annotationMock);
        //typeLiteral.verify(() -> TypeLiteral.get(Annotation.class), atLeast(1));
        //verify(typeLiteralMock).getReturnType(methodMock);
        //verify(methodMock).invoke(annotationMock, objectArray);
    }
}

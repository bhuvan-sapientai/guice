package com.google.inject.internal;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.lang.annotation.Annotation;

import com.google.inject.TypeLiteral;
import com.google.inject.name.Names;
import jakarta.inject.Named;

import java.lang.reflect.Member;

import com.google.inject.internal.util.Classes;

import java.lang.annotation.RetentionPolicy;

import org.mockito.MockedStatic;
import com.google.inject.Key;

import java.lang.annotation.Retention;

import static org.mockito.Mockito.doNothing;
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

public class AnnotationsSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Annotation annotationMock = mock(Annotation.class);

    private final Errors errorsMock = mock(Errors.class);

    private final Key keyMock = mock(Key.class);

    private final Member memberMock = mock(Member.class);

    private final TypeLiteral typeLiteralMock = mock(TypeLiteral.class);

    //Sapient generated method id: ${e735ff98-6d27-32e8-94e7-41519c9832dc}, hash: 0E0170A95018F9196EB9BAFED4F5750D
    @Ignore()
    @Test()
    public void isMarkerWhenAnnotationTypeGetDeclaredMethodsLengthEquals0() {
        /* Branches:
         * (annotationType.getDeclaredMethods().length == 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        boolean result = Annotations.isMarker(Annotation.class);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
    }

    //Sapient generated method id: ${42b79aa8-9fa1-3a51-b6fe-7eeb713c19ec}, hash: 2001E9CAFFEC707C4001CF8E64EE26F9
    @Test()
    public void isMarkerWhenAnnotationTypeGetDeclaredMethodsLengthNotEquals0() {
        /* Branches:
         * (annotationType.getDeclaredMethods().length == 0) : false
         */
        //Act Statement(s)
        //boolean result = Annotations.isMarker(RetentionPolicy.class);
        //Assert statement(s)
        //assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${0ec37445-1e44-36cc-9b44-67afd6ca6e8f}, hash: D470564946ABE4EC7FCEBA754AD18ACD
    @Test()
    public void isAllDefaultMethodsWhenAnnotationTypeGetDeclaredMethodsIsEmpty() {
        /* Branches:
         * (for-each(annotationType.getDeclaredMethods())) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        boolean result = Annotations.isAllDefaultMethods(Annotation.class);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${f097c33e-cff2-3ee9-b704-833f30964f47}, hash: E51E871985177642B6C096A86FA461B7
    @Test()
    public void isAllDefaultMethodsWhenMGetDefaultValueIsNull() {
        /* Branches:
         * (for-each(annotationType.getDeclaredMethods())) : true
         * (m.getDefaultValue() == null) : true
         */
        //Act Statement(s)
        //boolean result = Annotations.isAllDefaultMethods(RetentionPolicy.class);
        //Assert statement(s)
        //assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${f651f649-b81c-3686-8ff9-e1fef7b374bb}, hash: 69FB7570B0DBDB9ECDCEFAF7A2D27642
    @Ignore()
    @Test()
    public void isAllDefaultMethodsWhenMGetDefaultValueIsNotNull() {
        /* Branches:
         * (for-each(annotationType.getDeclaredMethods())) : true
         * (m.getDefaultValue() == null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        boolean result = Annotations.isAllDefaultMethods(Annotation.class);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
    }

    //Sapient generated method id: ${e641ce5c-cb94-3d8f-9577-10769f6b708e}, hash: 9E7C15FB9FB25AD7802614436C707C78
    @Ignore()
    @Test()
    public void generateAnnotationTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: cache
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Annotations> annotations = mockStatic(Annotations.class, CALLS_REAL_METHODS)) {
            annotations.when(() -> Annotations.isAllDefaultMethods(Annotation.class)).thenReturn(true);
            //Act Statement(s)
            Annotation result = Annotations.generateAnnotation(Annotation.class);
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            annotations.verify(() -> Annotations.isAllDefaultMethods(Annotation.class), atLeast(1));
        }
    }

    //Sapient generated method id: ${2d216f6d-312e-3458-939f-b32a20b5587f}, hash: 0CFCB05AA1D8930F0F0057D1A2DDAB27
    @Test()
    public void isRetainedAtRuntimeWhenRetentionValueEqualsRetentionPolicyRUNTIME() {
        /* Branches:
         * (retention != null) : true
         * (retention.value() == RetentionPolicy.RUNTIME) : true
         */
        //Act Statement(s)
        boolean result = Annotations.isRetainedAtRuntime(Retention.class);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
    }

    //Sapient generated method id: ${6f6a8093-301c-3a6f-88d8-34864eb652a0}, hash: 81F2D4A2656E8D7E1407ADE537037A61
    @Test()
    public void isRetainedAtRuntimeWhenRetentionValueNotEqualsRetentionPolicyRUNTIME() {
        /* Branches:
         * (retention != null) : true
         * (retention.value() == RetentionPolicy.RUNTIME) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        boolean result = Annotations.isRetainedAtRuntime(Annotation.class);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${ed3a5fce-b01f-3031-9071-c5fe24ffcf9f}, hash: BC78B3850A8694D5BF92EB25CD2E6048
    @Test()
    public void findScopeAnnotationTest() {
        //Arrange Statement(s)
        try (MockedStatic<Annotations> annotations = mockStatic(Annotations.class, CALLS_REAL_METHODS)) {
            Annotation[] annotationArray = new Annotation[]{};
            annotations.when(() -> Annotations.findScopeAnnotation(errorsMock, annotationArray)).thenReturn(java.lang.annotation.Annotation.class);
            //Act Statement(s)
            Class<? extends Annotation> result = Annotations.findScopeAnnotation(errorsMock, Object.class);
            //Assert statement(s)
            assertThat(result, equalTo(Annotation.class));
            annotations.verify(() -> Annotations.findScopeAnnotation(errorsMock, annotationArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${1727e29e-e859-3dac-a6bb-bd848970d0c2}, hash: EB16B73BBB213407497AA5B7AE10F307
    @Ignore()
    @Test()
    public void findScopeAnnotation1WhenFoundIsNull() {
        /* Branches:
         * (for-each(annotations)) : true
         * (isScopeAnnotation(annotationType)) : true
         * (found != null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Annotations> annotations = mockStatic(Annotations.class, CALLS_REAL_METHODS)) {
            annotations.when(() -> Annotations.isScopeAnnotation(Annotation.class)).thenReturn(true);
            Errors errors = new Errors();
            Annotation[] annotationArray = new Annotation[]{annotationMock};
            //Act Statement(s)
            Class<? extends Annotation> result = Annotations.findScopeAnnotation(errors, annotationArray);
            //Assert statement(s)
            assertThat(result, equalTo(Annotation.class));
            annotations.verify(() -> Annotations.isScopeAnnotation(Annotation.class), atLeast(1));
        }
    }

    //Sapient generated method id: ${4620605f-f4d6-376f-8b79-7d7b1a220edc}, hash: 27201048080D551DEAD4ED8EA9519DBD
    @Test()
    public void containsComponentAnnotationWhenAnnotationAnnotationTypeGetSimpleNameEqualsComponent() {
        /* Branches:
         * (for-each(annotations)) : true
         * (annotation.annotationType().getSimpleName().equals("Component")) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //Annotation annotationMock = mock(Annotation.class, "Component");
        //Annotation[][] annotationArray3 = new Annotation[][] { annotationMock };
        //Annotation[] annotationArray2 = new Annotation[] { annotationArray3 };
        //Annotation[] annotationArray = new Annotation[] { annotationArray2 };
        //Act Statement(s)
        //boolean result = Annotations.containsComponentAnnotation(annotationArray);
        //Assert statement(s)
        //assertThat(result, equalTo(Boolean.TRUE));
    }

    //Sapient generated method id: ${3cfe0419-612f-3044-b9a1-08ecd45f22bb}, hash: 071000A57AAE109B3029144C941B1608
    @Ignore()
    @Test()
    public void containsComponentAnnotationWhenAnnotationAnnotationTypeGetSimpleNameNotEqualsComponent() {
        /* Branches:
         * (for-each(annotations)) : true
         * (annotation.annotationType().getSimpleName().equals("Component")) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Annotation[] annotationArray = new Annotation[]{annotationMock};
        //Act Statement(s)
        boolean result = Annotations.containsComponentAnnotation(annotationArray);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${03ffabc5-ab48-307b-8179-aabcb98f2c50}, hash: BE2EDB83B18B53E9D1785B518BC43FB5
    @Test()
    public void memberValueStringWhenANNOTATION_TO_STRING_CONFIGQuote() {
        /* Branches:
         * (ANNOTATION_TO_STRING_CONFIG.quote) : true
         */
        //Act Statement(s)
        String result = Annotations.memberValueString("A");
        //Assert statement(s)
        assertThat(result, equalTo("\"A\""));
    }

    //Sapient generated method id: ${74cea17b-006e-3b17-b0f6-f0450eb2da90}, hash: E478E71F7CD199B2314E3202F6F341BF
    @Ignore()
    @Test()
    public void memberValueStringWhenANNOTATION_TO_STRING_CONFIGNotQuote() {
        /* Branches:
         * (ANNOTATION_TO_STRING_CONFIG.quote) : false
         */
        //Act Statement(s)
        String result = Annotations.memberValueString("value1");
        //Assert statement(s)
        assertThat(result, equalTo("value1"));
    }

    //Sapient generated method id: ${dd236579-11d5-3f0b-80a4-e8ed664993ce}, hash: 7341DD04C38B2A3A1BE65CBC0FE9C839
    @Ignore()
    @Test()
    public void memberValueString1WhenValueInstanceOfString() {
        /* Branches:
         * (includeMemberName) : true
         * (quote) : true
         * (value instanceof String) : true
         */
        //Act Statement(s)
        String result = Annotations.memberValueString("A", (Object) "B");
        //Assert statement(s)
        assertThat(result, equalTo("A=\"B\""));
    }

    //Sapient generated method id: ${6123c96f-f6be-365a-8417-f892f34a1fb6}, hash: 4C517989B1CAF00A00CFE68B51D5BB36
    @Ignore()
    @Test()
    public void memberValueString1WhenValueNotInstanceOfString() {
        /* Branches:
         * (includeMemberName) : true
         * (quote) : true
         * (value instanceof String) : false
         */
        //Arrange Statement(s)
        Object objectMock = mock(Object.class, "memberValueString_object1");
        //Act Statement(s)
        String result = Annotations.memberValueString("A", objectMock);
        //Assert statement(s)
        assertThat(result, equalTo("A=memberValueString_object1"));
    }

    //Sapient generated method id: ${6df746c4-94ba-39d5-aeda-4262a31388fa}, hash: 5A37CEBA0C7A26EBB7D5E9E6CA80D616
    @Ignore()
    @Test()
    public void annotationInstanceClassStringWhenAnnGetDeclaringClassIsNotNull() {
        /* Branches:
         * (ANNOTATION_TO_STRING_CONFIG.dollarSeparator) : false
         * (ann.getDeclaringClass() == null) : false  #  inside dotSeparatedParentOrPackage method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        String result = Annotations.annotationInstanceClassString(Annotation.class, false);
        //Assert statement(s)
        assertThat(result, equalTo("@B.Annotation"));
    }

    //Sapient generated method id: ${63723c0a-c7a2-3986-bb3a-1f6c47e25db3}, hash: 2D3A16760A21438CADD3CE27CF70DF25
    @Ignore()
    @Test()
    public void annotationInstanceClassStringWhenAnnGetPackageIsNull() {
        /* Branches:
         * (ANNOTATION_TO_STRING_CONFIG.dollarSeparator) : true
         * (includePackage) : false
         * (ann.getPackage() == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        String result = Annotations.annotationInstanceClassString(Annotation.class, false);
        //Assert statement(s)
        assertThat(result, equalTo("@java.lang.annotation.Annotation"));
    }

    //Sapient generated method id: ${e4973fbc-107d-323a-9597-b1a39a14fe7d}, hash: EF63F430E5474DA186B764588F277AC1
    @Test()
    public void annotationInstanceClassStringWhenAnnGetPackageIsNotNull() {
        /* Branches:
         * (ANNOTATION_TO_STRING_CONFIG.dollarSeparator) : true
         * (includePackage) : false
         * (ann.getPackage() == null) : false
         */
        //Act Statement(s)
        String result = Annotations.annotationInstanceClassString(Annotation.class, false);
        //Assert statement(s)
        assertThat(result, equalTo("@Annotation"));
    }

    //Sapient generated method id: ${084d26d5-f710-3d8d-a953-46a58a289b4b}, hash: AC0FFACD3F527EF18828A541C42A0CF5
    @Test()
    public void annotationInstanceClassStringWhenAnnGetDeclaringClassIsNullAndIncludePackage() {
        /* Branches:
         * (ANNOTATION_TO_STRING_CONFIG.dollarSeparator) : false
         * (ann.getDeclaringClass() == null) : true  #  inside dotSeparatedParentOrPackage method
         * (includePackage) : true  #  inside dotSeparatedParentOrPackage method
         */
        //Act Statement(s)
        //String result = Annotations.annotationInstanceClassString(RetentionPolicy.class, true);
        //Assert statement(s)
        //assertThat(result, equalTo("@java.lang.annotation.RetentionPolicy"));
    }

    //Sapient generated method id: ${d4885230-0da8-3ef4-a84d-72cccadfdfc5}, hash: C89EC703C71BE0EA57B7918F99507C86
    @Test()
    public void annotationInstanceClassStringWhenNotIncludePackage() {
        /* Branches:
         * (ANNOTATION_TO_STRING_CONFIG.dollarSeparator) : false
         * (ann.getDeclaringClass() == null) : true  #  inside dotSeparatedParentOrPackage method
         * (includePackage) : false  #  inside dotSeparatedParentOrPackage method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        String result = Annotations.annotationInstanceClassString(Annotation.class, false);
        //Assert statement(s)
        assertThat(result, equalTo("@Annotation"));
    }

    //Sapient generated method id: ${a2ca0214-1b59-35d5-b3da-70b242da43dc}, hash: 5F931FEA2B7930E69FF19A37D14311C5
    @Ignore()
    @Test()
    public void isScopeAnnotationWhenScopeCheckerHasAnnotationsAnnotationType() {
        /* Branches:
         * (scopeChecker.hasAnnotations(annotationType)) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: scopeChecker
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        boolean result = Annotations.isScopeAnnotation(Annotation.class);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
    }

    //Sapient generated method id: ${1db97273-cae2-3fe3-a344-1a6c1b01eb59}, hash: F328E190B9EF0513BCBBDEA0FA598F52
    @Test()
    public void isScopeAnnotationWhenScopeCheckerNotHasAnnotationsAnnotationType() {
        /* Branches:
         * (scopeChecker.hasAnnotations(annotationType)) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: scopeChecker
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        boolean result = Annotations.isScopeAnnotation(Annotation.class);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${cc0b3f2c-7a55-3df7-8ea3-8ab0756e4f0f}, hash: F148EFAE126803F7F262F9C43569BDBF
    @Test()
    public void checkForMisplacedScopeAnnotationsWhenClassesIsConcreteType() {
        /* Branches:
         * (Classes.isConcrete(type)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Classes> classes = mockStatic(Classes.class)) {
            classes.when(() -> Classes.isConcrete(Object.class)).thenReturn(true);
            Object object = new Object();
            //Act Statement(s)
            Annotations.checkForMisplacedScopeAnnotations(Object.class, object, errorsMock);
            //Assert statement(s)
            classes.verify(() -> Classes.isConcrete(Object.class), atLeast(1));
        }
    }

    //Sapient generated method id: ${40b648a9-9700-3ef5-ba6a-6980079a9296}, hash: F461284949AC581002412E25F2352ACF
    @Ignore()
    @Test()
    public void checkForMisplacedScopeAnnotationsWhenContainsComponentAnnotationNotTypeGetAnnotations() {
        /* Branches:
         * (Classes.isConcrete(type)) : false
         * (scopeAnnotation != null) : true
         * (!containsComponentAnnotation(type.getAnnotations())) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: object of type Errors
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Annotations> annotations = mockStatic(Annotations.class, CALLS_REAL_METHODS);
             MockedStatic<Classes> classes = mockStatic(Classes.class)) {
            Errors errors = errorsMock.withSource(Object.class);
            doReturn(errors).when(errorsMock).withSource(Object.class);
            classes.when(() -> Classes.isConcrete(Object.class)).thenReturn(false);
            annotations.when(() -> Annotations.findScopeAnnotation(errorsMock, Object.class)).thenReturn(java.lang.annotation.Annotation.class);
            Annotation[] annotationArray = new Annotation[]{};
            annotations.when(() -> Annotations.containsComponentAnnotation(annotationArray)).thenReturn(false);
            Object object = new Object();
            //Act Statement(s)
            Annotations.checkForMisplacedScopeAnnotations(Object.class, object, errorsMock);
            //Assert statement(s)
            verify(errorsMock, atLeast(1)).withSource(Object.class);
            classes.verify(() -> Classes.isConcrete(Object.class), atLeast(1));
            annotations.verify(() -> Annotations.findScopeAnnotation(errorsMock, Object.class), atLeast(1));
            annotations.verify(() -> Annotations.containsComponentAnnotation(annotationArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${d1b29a2f-0141-338a-9e93-0596dfe63f81}, hash: 2C644129C9C955B2C5420486EC621395
    @Test()
    public void getKeyWhenFoundIsNull() throws ErrorsException {
        /* Branches:
         * (found == null) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Key> key = mockStatic(Key.class);
             MockedStatic<Annotations> annotations = mockStatic(Annotations.class, CALLS_REAL_METHODS)) {
            doReturn(0).when(errorsMock).size();
            doNothing().when(errorsMock).throwIfNewErrors(0);
            Annotation[] annotationArray = new Annotation[]{};
            annotations.when(() -> Annotations.findBindingAnnotation(errorsMock, memberMock, annotationArray)).thenReturn(null);
            key.when(() -> Key.get(typeLiteralMock)).thenReturn(keyMock);
            //Act Statement(s)
            Key<?> result = Annotations.getKey(typeLiteralMock, memberMock, annotationArray, errorsMock);
            //Assert statement(s)
            assertThat(result, equalTo(keyMock));
            verify(errorsMock, atLeast(1)).size();
            verify(errorsMock, atLeast(1)).throwIfNewErrors(0);
            annotations.verify(() -> Annotations.findBindingAnnotation(errorsMock, memberMock, annotationArray), atLeast(1));
            key.verify(() -> Key.get(typeLiteralMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${5b19a1cc-1964-3f6b-8563-159276ce4027}, hash: D886B153FD53B3838BBB4CA46D4C9694
    @Test()
    public void getKeyWhenFoundIsNotNull() throws ErrorsException {
        /* Branches:
         * (found == null) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Key> key = mockStatic(Key.class);
             MockedStatic<Annotations> annotations = mockStatic(Annotations.class, CALLS_REAL_METHODS)) {
            doReturn(0).when(errorsMock).size();
            doNothing().when(errorsMock).throwIfNewErrors(0);
            Annotation[] annotationArray = new Annotation[]{};
            annotations.when(() -> Annotations.findBindingAnnotation(errorsMock, memberMock, annotationArray)).thenReturn(annotationMock);
            key.when(() -> Key.get(typeLiteralMock, annotationMock)).thenReturn(keyMock);
            //Act Statement(s)
            Key<?> result = Annotations.getKey(typeLiteralMock, memberMock, annotationArray, errorsMock);
            //Assert statement(s)
            assertThat(result, equalTo(keyMock));
            verify(errorsMock, atLeast(1)).size();
            verify(errorsMock, atLeast(1)).throwIfNewErrors(0);
            annotations.verify(() -> Annotations.findBindingAnnotation(errorsMock, memberMock, annotationArray), atLeast(1));
            key.verify(() -> Key.get(typeLiteralMock, annotationMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${7b58186e-4624-3df8-9fd5-8eb858f2c6c8}, hash: 9FF01C6BD11B7A2477E803AD4A66745E
    @Ignore()
    @Test()
    public void findBindingAnnotationWhenFoundIsNull() {
        /* Branches:
         * (for-each(annotations)) : true
         * (isBindingAnnotation(annotationType)) : true
         * (found != null) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Annotations> annotations = mockStatic(Annotations.class, CALLS_REAL_METHODS)) {
            annotations.when(() -> Annotations.isBindingAnnotation(Annotation.class)).thenReturn(true);
            Annotation[] annotationArray = new Annotation[]{annotationMock};
            //Act Statement(s)
            Annotation result = Annotations.findBindingAnnotation(errorsMock, memberMock, annotationArray);
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            annotations.verify(() -> Annotations.isBindingAnnotation(Annotation.class), atLeast(1));
        }
    }

    //Sapient generated method id: ${932f13a0-38b8-3ccd-9458-8a9d2819214e}, hash: 4AEC42AC10B807A2DDF1641FD8443659
    @Ignore()
    @Test()
    public void isBindingAnnotationWhenBindingAnnotationCheckerHasAnnotationsAnnotationType() {
        /* Branches:
         * (bindingAnnotationChecker.hasAnnotations(annotationType)) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: bindingAnnotationChecker
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        boolean result = Annotations.isBindingAnnotation(Annotation.class);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
    }

    //Sapient generated method id: ${92a60654-f28a-312f-9ad7-0e3d8284b7b4}, hash: CEDB885812CA725D75C7D8D3F3805241
    @Test()
    public void isBindingAnnotationWhenBindingAnnotationCheckerNotHasAnnotationsAnnotationType() {
        /* Branches:
         * (bindingAnnotationChecker.hasAnnotations(annotationType)) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: bindingAnnotationChecker
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        boolean result = Annotations.isBindingAnnotation(Annotation.class);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${99eba8ed-d3e1-3e65-b1b5-d8553f7885d5}, hash: 990F7DAB1585EA84954C0D2B88CAAB08
    @Ignore()
    @Test()
    public void canonicalizeIfNamedWhenAnnotationInstanceOfJakartaInjectNamed() {
        /* Branches:
         * (annotation instanceof jakarta.inject.Named) : true
         */
        //Arrange Statement(s)
        Named namedMock = mock(Named.class);
        com.google.inject.name.Named namedMock2 = mock(com.google.inject.name.Named.class);
        try (MockedStatic<Names> names = mockStatic(Names.class)) {
            doReturn("return_of_value1").when(namedMock).value();
            names.when(() -> Names.named("return_of_value1")).thenReturn(namedMock2);
            //Act Statement(s)
            Annotation result = Annotations.canonicalizeIfNamed((Annotation) namedMock);
            //Assert statement(s)
            assertThat(result, equalTo(namedMock2));
            verify(namedMock).value();
            names.verify(() -> Names.named("return_of_value1"), atLeast(1));
        }
    }

    //Sapient generated method id: ${51182ace-fe1f-3396-9ef0-1abc6095c33c}, hash: A9E2C30528301C083B7EF05B8A187A91
    @Test()
    public void canonicalizeIfNamedWhenAnnotationNotInstanceOfJakartaInjectNamed() {
        /* Branches:
         * (annotation instanceof jakarta.inject.Named) : false
         */
        //Act Statement(s)
        Annotation result = Annotations.canonicalizeIfNamed(annotationMock);
        //Assert statement(s)
        assertThat(result, equalTo(annotationMock));
    }

    //Sapient generated method id: ${20e078e7-592a-3f72-9934-95bec157c37c}, hash: AA51BF796203A7097A398F1EC8C7C167
    @Test()
    public void canonicalizeIfNamed1WhenAnnotationTypeEqualsJakartaInjectNamed() {
        /* Branches:
         * (annotationType == jakarta.inject.Named.class) : true
         */
        //Act Statement(s)
        Class<? extends Annotation> result = Annotations.canonicalizeIfNamed(Named.class);
        //Assert statement(s)
        assertThat(result, equalTo(com.google.inject.name.Named.class));
    }

    //Sapient generated method id: ${6b2ced9b-4714-38b6-9488-81ebdf636365}, hash: 35ADE68102FC8B44F2FB7919F0AAEAAC
    @Test()
    public void canonicalizeIfNamed1WhenAnnotationTypeNotEqualsJakartaInjectNamed() {
        /* Branches:
         * (annotationType == jakarta.inject.Named.class) : false
         */
        //Act Statement(s)
        Class<? extends Annotation> result = Annotations.canonicalizeIfNamed(Annotation.class);
        //Assert statement(s)
        assertThat(result, equalTo(Annotation.class));
    }

    //Sapient generated method id: ${928d9c92-7fb7-3f65-a86e-78ac7b7dc8de}, hash: 19602A34C9AE2500DD75F8898455A314
    @Test()
    public void nameOfWhenIsMarkerNotAnnotationType() {
        /* Branches:
         * (annotation != null) : true
         * (!isMarker(annotationType)) : true
         */
        //Arrange Statement(s)
        Annotation annotationMock2 = mock(Annotation.class, "nameOf_annotation2");
        try (MockedStatic<Annotations> annotations = mockStatic(Annotations.class, CALLS_REAL_METHODS)) {
            doReturn(java.lang.annotation.Annotation.class).when(keyMock).getAnnotationType();
            doReturn(annotationMock, annotationMock2).when(keyMock).getAnnotation();
            annotations.when(() -> Annotations.isMarker(Annotation.class)).thenReturn(false);
            //Act Statement(s)
            String result = Annotations.nameOf(keyMock);
            //Assert statement(s)
            assertThat(result, equalTo("nameOf_annotation2"));
            verify(keyMock, times(2)).getAnnotation();
            verify(keyMock, atLeast(1)).getAnnotationType();
            annotations.verify(() -> Annotations.isMarker(Annotation.class), atLeast(1));
        }
    }

    //Sapient generated method id: ${b14e4cdb-6cdf-3e93-a731-c432eba499ac}, hash: 7CAF5DDF2A37D2C10CA664DEB0B3553A
    @Test()
    public void nameOfWhenIsMarkerAnnotationTypeAndKeyGetAnnotationTypeIsNotNull() {
        /* Branches:
         * (annotation != null) : true
         * (!isMarker(annotationType)) : false
         * (key.getAnnotationType() != null) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Annotations> annotations = mockStatic(Annotations.class, CALLS_REAL_METHODS)) {
            doReturn(annotationMock).when(keyMock).getAnnotation();
            doReturn(java.lang.annotation.Annotation.class, java.lang.annotation.Annotation.class, Annotation.class).when(keyMock).getAnnotationType();
            annotations.when(() -> Annotations.isMarker(Annotation.class)).thenReturn(true);
            //Act Statement(s)
            String result = Annotations.nameOf(keyMock);
            //Assert statement(s)
            assertThat(result, equalTo("@java.lang.annotation.Annotation"));
            verify(keyMock, atLeast(1)).getAnnotation();
            verify(keyMock, times(3)).getAnnotationType();
            annotations.verify(() -> Annotations.isMarker(Annotation.class), atLeast(1));
        }
    }

    //Sapient generated method id: ${bf18e85d-b24a-3b97-95b8-14d83c651a9d}, hash: A2520210F32C1C453875F57DC6BF546B
    @Test()
    public void nameOfWhenIsMarkerAnnotationTypeAndKeyGetAnnotationTypeIsNull() {
        /* Branches:
         * (annotation != null) : true
         * (!isMarker(annotationType)) : false
         * (key.getAnnotationType() != null) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Annotations> annotations = mockStatic(Annotations.class, CALLS_REAL_METHODS)) {
            Class _class = null;
            doReturn(annotationMock).when(keyMock).getAnnotation();
            doReturn(java.lang.annotation.Annotation.class, _class).when(keyMock).getAnnotationType();
            annotations.when(() -> Annotations.isMarker(Annotation.class)).thenReturn(true);
            //Act Statement(s)
            String result = Annotations.nameOf(keyMock);
            //Assert statement(s)
            assertThat(result, equalTo(""));
            verify(keyMock, atLeast(1)).getAnnotation();
            verify(keyMock, times(2)).getAnnotationType();
            annotations.verify(() -> Annotations.isMarker(Annotation.class), atLeast(1));
        }
    }
}

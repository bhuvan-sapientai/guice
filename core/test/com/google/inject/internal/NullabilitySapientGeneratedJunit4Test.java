package com.google.inject.internal;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.lang.annotation.Annotation;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.mock;

import org.junit.Ignore;

public class NullabilitySapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    //Sapient generated method id: ${ec9051cc-4717-33f5-a500-d1ccc8ec52ed}, hash: 8A12C2525B8C57334FFECD58E5A2D572
    @Test()
    public void hasNullableAnnotationWhenNullableEqualsTypeGetSimpleName() {
        /* Branches:
         * (for-each(annotations)) : true
         * ("Nullable".equals(type.getSimpleName())) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //Annotation annotationMock = mock(Annotation.class, "Nullable");
        //Annotation[][] annotationArray3 = new Annotation[][] { annotationMock };
        //Annotation annotationMock2 = mock(Annotation.class, "Nullable");
        //Annotation[][] annotationArray4 = new Annotation[][] { annotationMock2 };
        //Annotation[] annotationArray2 = new Annotation[] { annotationArray3, annotationArray4 };
        //Annotation[] annotationArray = new Annotation[] { annotationArray2 };
        //Act Statement(s)
        //boolean result = Nullability.hasNullableAnnotation(annotationArray);
        //Assert statement(s)
        //assertThat(result, equalTo(Boolean.TRUE));
    }

    //Sapient generated method id: ${9bd57a5e-1f56-34e5-847e-089401d45965}, hash: 17F113A8C3E363709C1C7D9AE25AC1BA
    @Ignore()
    @Test()
    public void hasNullableAnnotationWhenNullableNotEqualsTypeGetSimpleName() {
        /* Branches:
         * (for-each(annotations)) : true
         * ("Nullable".equals(type.getSimpleName())) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Annotation annotationMock = mock(Annotation.class);
        Annotation[] annotationArray = new Annotation[]{annotationMock};
        //Act Statement(s)
        boolean result = Nullability.hasNullableAnnotation(annotationArray);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }
}

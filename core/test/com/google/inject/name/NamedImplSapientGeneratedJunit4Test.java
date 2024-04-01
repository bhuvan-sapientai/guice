package com.google.inject.name;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.lang.annotation.Annotation;

import com.google.inject.internal.Annotations;
import org.mockito.MockedStatic;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

import org.junit.Ignore;

public class NamedImplSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    //Sapient generated method id: ${52f8c495-dd1f-3640-b180-04a7f65fff2e}, hash: 917978C801212C4B7D13F0E41F60CB39
    @Ignore()
    @Test()
    public void valueTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        NamedImpl target = new NamedImpl("<value>");
        //Act Statement(s)
        String result = target.value();
        //Assert statement(s)
        assertThat(result, equalTo("result1"));
    }

    //Sapient generated method id: ${363d3698-f34c-39ad-914f-376a19498023}, hash: 11B301B76CD9DD95D3A4C47B7028B858
    @Ignore()
    @Test()
    public void toStringTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Annotations> annotations = mockStatic(Annotations.class)) {
            annotations.when(() -> Annotations.memberValueString("value", "value1")).thenReturn("\"B\"");
            NamedImpl target = new NamedImpl("<value>");
            //Act Statement(s)
            String result = target.toString();
            //Assert statement(s)
            assertThat(result, equalTo("@com.google.inject.name.Named(\"B\")"));
            annotations.verify(() -> Annotations.memberValueString("value", "value1"), atLeast(1));
        }
    }

    //Sapient generated method id: ${b18e5504-3106-34bd-b29a-326bddd61945}, hash: 21C4E912002F73F1F0449C3D7670A07E
    @Test()
    public void annotationTypeTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        NamedImpl target = new NamedImpl("<value>");
        //Act Statement(s)
        Class<? extends Annotation> result = target.annotationType();
        //Assert statement(s)
        assertThat(result, equalTo(Named.class));
    }
}

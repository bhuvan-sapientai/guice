package com.google.inject.spi;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.util.List;
import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;

public class ElementSourceSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final ModuleSource moduleSourceMock = mock(ModuleSource.class, "moduleSource");

    //Sapient generated method id: ${3e8e1edd-55d3-3471-83ec-0547e30ca275}, hash: AD56669F2965DD1E42BB15197F485A3C
    @Test()
    public void getModuleClassNamesTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ElementSource elementSourceMock = mock(ElementSource.class, "exampleOriginalSource");
        Object object = new Object();
        ModuleAnnotatedMethodScanner moduleAnnotatedMethodScannerMock = mock(ModuleAnnotatedMethodScanner.class, "exampleScanner");
        ElementSource target = new ElementSource(elementSourceMock, true, object, moduleSourceMock, moduleAnnotatedMethodScannerMock);
        List<String> stringList = new ArrayList<>();
        doReturn(stringList).when(moduleSourceMock).getModuleClassNames();
        //Act Statement(s)
        List<String> result = target.getModuleClassNames();
        //Assert statement(s)
        assertThat(result, equalTo(stringList));
        verify(moduleSourceMock).getModuleClassNames();
    }

    //Sapient generated method id: ${363d3698-f34c-39ad-914f-376a19498023}, hash: EB55F4089D63AACE369A80A8BC8731D0
    @Test()
    public void toStringTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ElementSource elementSourceMock = mock(ElementSource.class);
        Object object = new Object();
        ModuleAnnotatedMethodScanner moduleAnnotatedMethodScannerMock = mock(ModuleAnnotatedMethodScanner.class);
        ElementSource target = spy(new ElementSource(elementSourceMock, false, object, moduleSourceMock, moduleAnnotatedMethodScannerMock));
        Object objectMock = mock(Object.class, "toString_object1");
        doReturn(objectMock).when(target).getDeclaringSource();
        //Act Statement(s)
        String result = target.toString();
        //Assert statement(s)
        assertThat(result, equalTo("toString_object1"));
        verify(target).getDeclaringSource();
    }
}

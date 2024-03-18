package com.google.inject.spi;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.lang.annotation.Annotation;

import com.google.inject.internal.Errors;

import java.util.Set;
import java.util.HashSet;

import org.mockito.MockedStatic;
import com.google.inject.Binder;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;

import org.junit.Ignore;

public class ModuleAnnotatedMethodScannerBindingSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final ModuleAnnotatedMethodScanner scannerMock = mock(ModuleAnnotatedMethodScanner.class, "<init>_moduleAnnotatedMethodScanner2");

    private final ModuleAnnotatedMethodScanner moduleAnnotatedMethodScannerMock = mock(ModuleAnnotatedMethodScanner.class);

    //Sapient generated method id: ${85010207-16d2-3170-b836-208737cec5b9}, hash: FEE0A95CD30EDF1E756833F32C35B314
    @Ignore()
    @Test()
    public void acceptVisitorTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        ModuleAnnotatedMethodScanner moduleAnnotatedMethodScannerMock = mock(ModuleAnnotatedMethodScanner.class, "ModuleAnnotatedMethodScanner");
        ModuleAnnotatedMethodScannerBinding target = new ModuleAnnotatedMethodScannerBinding(object, moduleAnnotatedMethodScannerMock);
        ElementVisitor<Object> visitorMock = mock(ElementVisitor.class, "Object");
        Object object2 = new Object();
        doReturn(object2).when(visitorMock).visit(target);
        //Act Statement(s)
        Object result = target.acceptVisitor(visitorMock);
        //Assert statement(s)
        assertThat(result, equalTo(object2));
        verify(visitorMock).visit(target);
    }

    //Sapient generated method id: ${0f0a622f-1e3b-3dc0-a3ae-a6ceb63c4e13}, hash: C3EBB461D9DFF079D88E0DC273D5703D
    @Ignore()
    @Test()
    public void applyToTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Binder binderMock = mock(Binder.class);
        Binder binderMock2 = mock(Binder.class);
        Object object = new Object();
        doReturn(binderMock2).when(binderMock).withSource(object);
        doNothing().when(binderMock2).scanModulesForAnnotatedMethods(scannerMock);
        Object object2 = new Object();
        ModuleAnnotatedMethodScannerBinding target = new ModuleAnnotatedMethodScannerBinding(object2, moduleAnnotatedMethodScannerMock);
        //Act Statement(s)
        target.applyTo(binderMock);
        //Assert statement(s)
        verify(binderMock).withSource(object);
        verify(binderMock2).scanModulesForAnnotatedMethods(scannerMock);
    }

    //Sapient generated method id: ${363d3698-f34c-39ad-914f-376a19498023}, hash: C684C67E608B2C6BAA3E76564936D4DD
    @Ignore()
    @Test()
    public void toStringTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object objectMock = mock(Object.class, "toString_object1");
        try (MockedStatic<Errors> errors = mockStatic(Errors.class)) {
            Object object = new Object();
            errors.when(() -> Errors.convert(object)).thenReturn(objectMock);
            Object object2 = new Object();
            ModuleAnnotatedMethodScannerBinding target = new ModuleAnnotatedMethodScannerBinding(object2, moduleAnnotatedMethodScannerMock);
            Set<Class<Annotation>> anySet = new HashSet<>();
            doReturn(anySet).when(scannerMock).annotationClasses();
            //Act Statement(s)
            String result = target.toString();
            //Assert statement(s)
            assertThat(result, equalTo("<init>_moduleAnnotatedMethodScanner2 which scans for [] (bound at )"));
            errors.verify(() -> Errors.convert(object), atLeast(1));
            verify(scannerMock).annotationClasses();
        }
    }
}

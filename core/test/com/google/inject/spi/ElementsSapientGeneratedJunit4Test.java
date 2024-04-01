package com.google.inject.spi;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.util.List;

import com.google.inject.internal.GuiceInternal;
import com.google.inject.Module;
import org.mockito.MockedStatic;
import com.google.inject.Binder;

import java.util.ArrayList;

import com.google.inject.Stage;

import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.anyList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

import org.junit.Ignore;

public class ElementsSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final GuiceInternal guiceInternalMock = mock(GuiceInternal.class);

    //Sapient generated method id: ${6c68186f-e5a6-36f6-b857-e9f9e0e0cf94}, hash: 96C7FC65E241A9AC26FE6AD55808A9E2
    @Test()
    public void getElementsTest() {
        //Arrange Statement(s)
        try (MockedStatic<Elements> elements = mockStatic(Elements.class, CALLS_REAL_METHODS)) {
            List<Element> elementList = new ArrayList<>();
            elements.when(() -> Elements.getElements(eq(Stage.DEVELOPMENT), anyList())).thenReturn(elementList);
            Module[] moduleArray = new Module[]{};
            //Act Statement(s)
            List<Element> result = Elements.getElements(moduleArray);
            //Assert statement(s)
            assertThat(result, equalTo(elementList));
            elements.verify(() -> Elements.getElements(eq(Stage.DEVELOPMENT), anyList()), atLeast(1));
        }
    }

    //Sapient generated method id: ${658c0deb-a4f6-3094-8006-b74ad20e7635}, hash: 4CCAB1B679DADEF5C30BE1BF57684E3D
    @Test()
    public void getElements1Test() {
        //Arrange Statement(s)
        try (MockedStatic<Elements> elements = mockStatic(Elements.class, CALLS_REAL_METHODS)) {
            List<Element> elementList = new ArrayList<>();
            elements.when(() -> Elements.getElements(eq(Stage.TOOL), anyList())).thenReturn(elementList);
            Module[] moduleArray = new Module[]{};
            //Act Statement(s)
            List<Element> result = Elements.getElements(Stage.TOOL, moduleArray);
            //Assert statement(s)
            assertThat(result, equalTo(elementList));
            elements.verify(() -> Elements.getElements(eq(Stage.TOOL), anyList()), atLeast(1));
        }
    }

    //Sapient generated method id: ${08df3e6b-96f3-307d-aa51-0703be59dc55}, hash: 5ACB34236B2624E07806F46BD2924810
    @Test()
    public void getElements2Test() {
        //Arrange Statement(s)
        try (MockedStatic<Elements> elements = mockStatic(Elements.class, CALLS_REAL_METHODS)) {
            List<Element> elementList = new ArrayList<>();
            elements.when(() -> Elements.getElements(eq(Stage.DEVELOPMENT), (Iterable) any())).thenReturn(elementList);
            Iterable<Module> iterable = new ArrayList<>();
            //Act Statement(s)
            List<Element> result = Elements.getElements(iterable);
            //Assert statement(s)
            assertThat(result, equalTo(elementList));
            elements.verify(() -> Elements.getElements(eq(Stage.DEVELOPMENT), (Iterable) any()), atLeast(1));
        }
    }

    //Sapient generated method id: ${c990c499-761c-3eb2-a696-cf279b327584}, hash: E389DEEC97FDBE05B4378334FD8DA1CB
    @Ignore()
    @Test()
    public void getElements3WhenBinderPrivateBindersForScanningIsNotEmpty() {
        /* Branches:
         * (for-each(modules)) : true
         * (for-each(binder.privateBindersForScanning)) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: binder
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Module moduleMock = mock(Module.class);
        Iterable<Module> iterable = new ArrayList<>(List.of(moduleMock));
        //Act Statement(s)
        List<Element> result = Elements.getElements(Stage.TOOL, iterable);
        //Assert statement(s)
        assertThat(result.size(), equalTo(0));
    }

    //Sapient generated method id: ${48483d0e-3cb3-3271-809f-30788a5afced}, hash: 18ED79F561E88B965DE8355C9351C2B6
    @Test()
    public void withTrustedSourceWhenBinderInstanceOfRecordingBinder() {
        /* Branches:
         * (binder instanceof RecordingBinder) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //TODO: Please change the modifier of the below class from private to public to isolate the test case scenario.
        //Elements.RecordingBinder elementsRecordingBinderMock = mock(Elements.RecordingBinder.class);
        //Object object = new Object();
        //Act Statement(s)
        //Binder result = Elements.withTrustedSource(guiceInternalMock, elementsRecordingBinderMock, object);
        //Assert statement(s)
        //assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${6e4f2b22-175b-3401-94a6-2cffa5811b72}, hash: CDC306E6DE24C1779A106D216B682B58
    @Ignore()
    @Test()
    public void withTrustedSourceWhenBinderNotInstanceOfRecordingBinder() {
        /* Branches:
         * (binder instanceof RecordingBinder) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Binder binderMock = mock(Binder.class);
        Binder binderMock2 = mock(Binder.class);
        Object object = new Object();
        doReturn(binderMock2).when(binderMock).withSource(object);
        //Act Statement(s)
        Binder result = Elements.withTrustedSource(guiceInternalMock, binderMock, object);
        //Assert statement(s)
        assertThat(result, equalTo(binderMock2));
        verify(binderMock).withSource(object);
    }

    //Sapient generated method id: ${a288d51f-b12e-3796-b615-bd43fb869077}, hash: 72ECB1AE7EE57FFD468E3EDBFD922C80
    @Test()
    public void getModuleTest() {
        //Arrange Statement(s)
        Iterable<Element> iterable = new ArrayList<>();
        //Act Statement(s)
        Module result = Elements.getModule(iterable);
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${c6ca169b-0b1a-3bc6-ac23-92033bccb44d}, hash: D1A1D9819FA82E57EB6E8C15F49041C8
    @Test()
    public void getInstanceVisitorTest() {
        //Act Statement(s)
        BindingTargetVisitor<Object, Object> result = Elements.getInstanceVisitor();
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }
}

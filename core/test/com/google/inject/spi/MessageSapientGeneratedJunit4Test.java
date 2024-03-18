package com.google.inject.spi;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.util.List;

import com.google.inject.internal.ErrorId;
import com.google.inject.internal.Errors;
import org.mockito.MockedStatic;
import com.google.inject.Binder;

import java.util.ArrayList;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

import org.junit.Ignore;

public class MessageSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    //Sapient generated method id: ${2449aecb-bd82-3a8e-90d9-a2d65e31ac54}, hash: A17E8144DE206354C6EE4A622DA2B239
    @Test()
    public void getSourceWhenSourcesIsEmpty() {
        /* Branches:
         * (sources.isEmpty()) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: errorDetail
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        List<Object> objectList = new ArrayList<>();
        Throwable throwable = new Throwable();
        Message target = new Message(ErrorId.AMBIGUOUS_TYPE_CONVERSION, objectList, "message1", throwable);
        //Act Statement(s)
        String result = target.getSource();
        //Assert statement(s)
        assertThat(result, equalTo("[unknown source]"));
    }

    //Sapient generated method id: ${017c2066-463d-300c-ab13-b0516dd1e05e}, hash: CA2D9D4F90CAAF245F9351AE5F4CC932
    @Ignore()
    @Test()
    public void getSourceWhenSourcesNotIsEmpty() {
        /* Branches:
         * (sources.isEmpty()) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: errorDetail
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object objectMock = mock(Object.class, "getSource_object2");
        try (MockedStatic<Errors> errors = mockStatic(Errors.class)) {
            Object object = new Object();
            errors.when(() -> Errors.convert(object)).thenReturn(objectMock);
            List<Object> objectList = new ArrayList<>();
            Throwable throwable = new Throwable();
            Message target = new Message(ErrorId.AMBIGUOUS_TYPE_CONVERSION, objectList, "message1", throwable);
            //Act Statement(s)
            String result = target.getSource();
            //Assert statement(s)
            assertThat(result, equalTo("getSource_object2"));
            errors.verify(() -> Errors.convert(object), atLeast(1));
        }
    }

    //Sapient generated method id: ${4f362284-7196-37e5-93c8-2c44cd2b99a2}, hash: F2DDAC9D5DBFC24ADD916026168B8348
    @Test()
    public void getSourcesTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: errorDetail
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        List<Object> objectList = new ArrayList<>();
        Throwable throwable = new Throwable();
        Message target = new Message(ErrorId.AMBIGUOUS_TYPE_CONVERSION, objectList, "message1", throwable);
        //Act Statement(s)
        List<Object> result = target.getSources();
        //Assert statement(s)
        assertThat(result.size(), equalTo(0));
    }

    //Sapient generated method id: ${a52bed3f-53de-303b-8128-55ffe95a8205}, hash: B22A5E41967BF11F697B0AA8F27ECF53
    @Test()
    public void getMessageTest() {
        //Arrange Statement(s)
        List<Object> objectList = new ArrayList<>();
        Throwable throwable = new Throwable();
        Message target = new Message(ErrorId.AMBIGUOUS_TYPE_CONVERSION, objectList, "message1", throwable);
        //Act Statement(s)
        String result = target.getMessage();
        //Assert statement(s)
        assertThat(result, equalTo("message1"));
    }

    //Sapient generated method id: ${85010207-16d2-3170-b836-208737cec5b9}, hash: F556E398BD534FE56C0ACD8259FB1E19
    @Ignore()
    @Test()
    public void acceptVisitorTest() {
        //Arrange Statement(s)
        List<Object> objectList = new ArrayList<>();
        Throwable throwable = new Throwable();
        Message target = new Message(ErrorId.AMBIGUOUS_TYPE_CONVERSION, objectList, "message1", throwable);
        ElementVisitor<Object> visitorMock = mock(ElementVisitor.class);
        Object object = new Object();
        doReturn(object).when(visitorMock).visit(target);
        //Act Statement(s)
        Object result = target.acceptVisitor(visitorMock);
        //Assert statement(s)
        assertThat(result, equalTo(object));
        verify(visitorMock).visit(target);
    }

    //Sapient generated method id: ${7f28548e-8841-38ac-a747-570cc887b6f7}, hash: F49CE43056DD40462F505D933D8767D3
    @Test()
    public void getCauseTest() {
        //Arrange Statement(s)
        List<Object> objectList = new ArrayList<>();
        Throwable throwable = new Throwable();
        Message target = new Message(ErrorId.AMBIGUOUS_TYPE_CONVERSION, objectList, "message1", throwable);
        //Act Statement(s)
        Throwable result = target.getCause();
        //Assert statement(s)
        assertThat(result, equalTo(throwable));
    }

    //Sapient generated method id: ${363d3698-f34c-39ad-914f-376a19498023}, hash: 67AF15E90E714C66F46D0094776D52FB
    @Test()
    public void toStringTest() {
        //Arrange Statement(s)
        List<Object> objectList = new ArrayList<>();
        Throwable throwable = new Throwable();
        Message target = new Message(ErrorId.AMBIGUOUS_TYPE_CONVERSION, objectList, "message1", throwable);
        //Act Statement(s)
        String result = target.toString();
        //Assert statement(s)
        assertThat(result, equalTo("message1"));
    }

    //Sapient generated method id: ${0f0a622f-1e3b-3dc0-a3ae-a6ceb63c4e13}, hash: 966CDD3C7C608872DCAD3DB7489F8099
    @Ignore()
    @Test()
    public void applyToTest() {
        //Arrange Statement(s)
        Binder binderMock = mock(Binder.class);
        Binder binderMock2 = mock(Binder.class);
        doReturn(binderMock2).when(binderMock).withSource("return_of_getSource1");
        List<Object> objectList = new ArrayList<>();
        Throwable throwable = new Throwable();
        Message target = spy(new Message(ErrorId.AMBIGUOUS_TYPE_CONVERSION, objectList, "message1", throwable));
        doReturn("return_of_getSource1").when(target).getSource();
        doNothing().when(binderMock2).addError(target);
        //Act Statement(s)
        target.applyTo(binderMock);
        //Assert statement(s)
        verify(binderMock).withSource("return_of_getSource1");
        verify(target).getSource();
        verify(binderMock2).addError(target);
    }

    //Sapient generated method id: ${de87f11d-cec6-32fd-81fc-d4535e0a77d5}, hash: EB6E797CF4182DCB6C92DBB65680A4F3
    @Test()
    public void withSourceTest() {
        //Arrange Statement(s)
        List<Object> objectList = new ArrayList<>();
        Throwable throwable = new Throwable();
        Message target = new Message(ErrorId.AMBIGUOUS_TYPE_CONVERSION, objectList, "message1", throwable);
        List<Object> objectList2 = new ArrayList<>();
        //Act Statement(s)
        Message result = target.withSource(objectList2);
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }
}

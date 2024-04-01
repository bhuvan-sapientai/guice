package com.google.inject.spi;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import com.google.inject.TypeLiteral;
import com.google.inject.internal.Errors;
import com.google.inject.matcher.Matcher;
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

public class TypeConverterBindingSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Matcher<TypeLiteral<?>> matcherMock = mock(Matcher.class);

    private final TypeConverter typeConverterMock = mock(TypeConverter.class);

    //Sapient generated method id: ${85010207-16d2-3170-b836-208737cec5b9}, hash: 32CEA5C8003990F4C0AB06D96C9EAD10
    @Ignore()
    @Test()
    public void acceptVisitorTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Matcher<TypeLiteral<?>> matcherMock = mock(Matcher.class, "typeMatcher_value");
        TypeConverter typeConverterMock = mock(TypeConverter.class, "typeConverter_value");
        TypeConverterBinding target = new TypeConverterBinding(object, matcherMock, typeConverterMock);
        ElementVisitor<Object> visitorMock = mock(ElementVisitor.class, "visitor_value");
        Object object2 = new Object();
        doReturn(object2).when(visitorMock).visit(target);
        //Act Statement(s)
        Object result = target.acceptVisitor(visitorMock);
        //Assert statement(s)
        assertThat(result, equalTo(object2));
        verify(visitorMock).visit(target);
    }

    //Sapient generated method id: ${0f0a622f-1e3b-3dc0-a3ae-a6ceb63c4e13}, hash: 392EE66DB1F4360F93706390CE7E6510
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
        doNothing().when(binderMock2).convertToTypes(matcherMock, typeConverterMock);
        Object object2 = new Object();
        Matcher<TypeLiteral<?>> matcherMock2 = mock(Matcher.class);
        TypeConverter typeConverterMock2 = mock(TypeConverter.class);
        TypeConverterBinding target = new TypeConverterBinding(object2, matcherMock2, typeConverterMock2);
        //Act Statement(s)
        target.applyTo(binderMock);
        //Assert statement(s)
        verify(binderMock).withSource(object);
        verify(binderMock2).convertToTypes(matcherMock, typeConverterMock);
    }

    //Sapient generated method id: ${363d3698-f34c-39ad-914f-376a19498023}, hash: 8B539BD0007D141854049708332C06D2
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
            TypeConverterBinding target = new TypeConverterBinding(object2, matcherMock, typeConverterMock);
            //Act Statement(s)
            String result = target.toString();
            //Assert statement(s)
            assertThat(result, equalTo("<init>_typeConverter2 which matches <init>_matcher2 (bound at toString_object1)"));
            errors.verify(() -> Errors.convert(object), atLeast(1));
        }
    }
}

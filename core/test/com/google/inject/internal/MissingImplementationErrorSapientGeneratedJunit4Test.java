package com.google.inject.internal;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.util.List;

import org.mockito.stubbing.Answer;
import com.google.common.collect.ImmutableList;
import com.google.inject.spi.ErrorDetail;
import com.google.inject.Injector;

import java.util.Formatter;

import org.mockito.MockedStatic;

import java.util.ArrayList;

import com.google.inject.Key;

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

public class MissingImplementationErrorSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Injector injectorMock = mock(Injector.class);

    private final Key<Object> keyMock = mock(Key.class);

    private final Object objectMock = mock(Object.class, "<init>_object1");

    //Sapient generated method id: ${5cf7a7a3-1927-3617-9526-12eedc8d70c2}, hash: 8A2BB5F55A70DE3CEE3458EF5D1214B6
    @Ignore()
    @Test()
    public void isMergeableWhenOtherErrorKeyEqualsThisKey() {
        /* Branches:
         * (otherError instanceof MissingImplementationError) : true
         * (((MissingImplementationError) otherError).key.equals(this.key)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Injector injectorMock = mock(Injector.class, "someValue");
        MissingImplementationError missingImplementationErrorMock = mock(MissingImplementationError.class, "someValue");
        try (MockedStatic<Messages> messages = mockStatic(Messages.class);
             MockedStatic<MissingImplementationErrorHints> missingImplementationErrorHints = mockStatic(MissingImplementationErrorHints.class)) {
            ImmutableList immutableList = ImmutableList.of();
            missingImplementationErrorHints.when(() -> MissingImplementationErrorHints.getSuggestions((Key) any(), eq(injectorMock))).thenReturn(immutableList);
            messages.when(() -> Messages.convert((Key) any())).thenReturn(objectMock);
            Key key = Key.get(Object.class);
            Object object = new Object();
            List<Object> objectList = new ArrayList<>();
            objectList.add(object);
            MissingImplementationError target = new MissingImplementationError(key, injectorMock, objectList);
            //Act Statement(s)
            boolean result = target.isMergeable(missingImplementationErrorMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.TRUE));
            missingImplementationErrorHints.verify(() -> MissingImplementationErrorHints.getSuggestions((Key) any(), eq(injectorMock)));
            messages.verify(() -> Messages.convert((Key) any()));
        }
    }

    //Sapient generated method id: ${5e0b8b28-67f9-3b81-870a-5353004f07bc}, hash: 5C73446F548B24ACE0C63CC44CF4A217
    @Ignore()
    @Test()
    public void isMergeableWhenOtherErrorKeyNotEqualsThisKey() {
        /* Branches:
         * (otherError instanceof MissingImplementationError) : true
         * (((MissingImplementationError) otherError).key.equals(this.key)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        MissingImplementationError missingImplementationErrorMock = mock(MissingImplementationError.class);
        try (MockedStatic<Messages> messages = mockStatic(Messages.class);
             MockedStatic<MissingImplementationErrorHints> missingImplementationErrorHints = mockStatic(MissingImplementationErrorHints.class)) {
            ImmutableList immutableList = ImmutableList.of();
            missingImplementationErrorHints.when(() -> MissingImplementationErrorHints.getSuggestions(keyMock, injectorMock)).thenReturn(immutableList);
            messages.when(() -> Messages.convert(keyMock)).thenReturn(objectMock);
            List<Object> objectList = new ArrayList<>();
            MissingImplementationError target = new MissingImplementationError(keyMock, injectorMock, objectList);
            //Act Statement(s)
            boolean result = target.isMergeable(missingImplementationErrorMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            missingImplementationErrorHints.verify(() -> MissingImplementationErrorHints.getSuggestions(keyMock, injectorMock), atLeast(1));
            messages.verify(() -> Messages.convert(keyMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${324fb1e7-101b-32d7-88f7-05bc29d263ac}, hash: 3326B3CA1A1C8C7D63F429436A78A007
    @Ignore()
    @Test()
    public void formatDetailWhenFilteredSourcesListIsNotEmpty() {
        /* Branches:
         * (!suggestions.isEmpty()) : true
         * (!sources.isEmpty()) : true  #  inside lambda$formatDetail$2 method
         * (!filteredSourcesList.isEmpty()) : true
         * (for-each(filteredSourcesList)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ErrorDetail errorDetailMock = mock(ErrorDetail.class);
        try (MockedStatic<ErrorFormatter> errorFormatter = mockStatic(ErrorFormatter.class);
             MockedStatic<Messages> messages = mockStatic(Messages.class, CALLS_REAL_METHODS);
             MockedStatic<MissingImplementationErrorHints> missingImplementationErrorHints = mockStatic(MissingImplementationErrorHints.class)) {
            ImmutableList<Object> objectList = ImmutableList.of();
            doReturn(objectList).when(errorDetailMock).getSources();
            ImmutableList immutableList = ImmutableList.of();
            missingImplementationErrorHints.when(() -> MissingImplementationErrorHints.getSuggestions(keyMock, injectorMock)).thenReturn(immutableList);
            messages.when(() -> Messages.convert(keyMock)).thenReturn(objectMock);
            Formatter formatter = new Formatter();
            errorFormatter.when(() -> ErrorFormatter.formatSources(eq(1), anyList(), eq(formatter))).thenAnswer((Answer<Void>) invocation -> null);
            List<Object> objectList2 = new ArrayList<>();
            MissingImplementationError target = new MissingImplementationError(keyMock, injectorMock, objectList2);
            List<ErrorDetail<?>> anyList = new ArrayList<>();
            anyList.add(errorDetailMock);
            //Act Statement(s)
            target.formatDetail(anyList, formatter);
            //Assert statement(s)
            verify(errorDetailMock, atLeast(1)).getSources();
            missingImplementationErrorHints.verify(() -> MissingImplementationErrorHints.getSuggestions(keyMock, injectorMock), atLeast(1));
            messages.verify(() -> Messages.convert(keyMock), atLeast(1));
            errorFormatter.verify(() -> ErrorFormatter.formatSources(eq(1), anyList(), eq(formatter)), atLeast(1));
        }
    }

    //Sapient generated method id: ${22e7c14b-c2f8-3631-b7c2-fa54895cb8e5}, hash: 781ACAD74B571E7B82DA160F8E708A51
    @Ignore()
    @Test()
    public void withSources1Test() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object objectMock2 = mock(Object.class, "<init>_object2");
        try (MockedStatic<Messages> messages = mockStatic(Messages.class);
             MockedStatic<MissingImplementationErrorHints> missingImplementationErrorHints = mockStatic(MissingImplementationErrorHints.class)) {
            ImmutableList immutableList = ImmutableList.of();
            missingImplementationErrorHints.when(() -> MissingImplementationErrorHints.getSuggestions((Key) any(), eq(injectorMock))).thenReturn(immutableList);
            messages.when(() -> Messages.convert((Key) any())).thenReturn(objectMock).thenReturn(objectMock2);
            Key key = Key.get(Object.class);
            List<Object> objectList = new ArrayList<>();
            MissingImplementationError target = new MissingImplementationError(key, injectorMock, objectList);
            List<Object> objectList2 = new ArrayList<>();
            //Act Statement(s)
            MissingImplementationError result = target.withSources(objectList2);
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            missingImplementationErrorHints.verify(() -> MissingImplementationErrorHints.getSuggestions((Key) any(), eq(injectorMock)));
            messages.verify(() -> Messages.convert((Key) any()), atLeast(2));
        }
    }
}

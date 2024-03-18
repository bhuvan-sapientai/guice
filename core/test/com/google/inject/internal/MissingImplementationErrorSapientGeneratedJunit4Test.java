package com.google.inject.internal;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.util.List;

import org.mockito.stubbing.Answer;
import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableList;
import com.google.inject.spi.ErrorDetail;
import com.google.inject.Injector;

import java.util.stream.Stream;
import java.util.Formatter;

import org.mockito.MockedStatic;

import java.util.ArrayList;

import com.google.inject.Key;

import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
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

    private final Supplier suggestionsSupplierMock = mock(Supplier.class, "suggestionsSupplier");

    private final ImmutableList immutableListMock = mock(ImmutableList.class, "ImmutableList");

    private final Injector injectorMock = mock(Injector.class);

    private final Object objectMock = mock(Object.class, "Object");

    //Sapient generated method id: ${5cf7a7a3-1927-3617-9526-12eedc8d70c2}, hash: DFAB9E61F9B795DCA246A3FAB6142D14
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
            missingImplementationErrorHints.when(() -> MissingImplementationErrorHints.getSuggestions((Key) any(), eq(injectorMock))).thenReturn(immutableListMock);
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

    //Sapient generated method id: ${5e0b8b28-67f9-3b81-870a-5353004f07bc}, hash: 114C04366199C85141859DE1E8FD7468
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
        Key<Object> keyMock = mock(Key.class);
        Object objectMock = mock(Object.class, "<init>_object1");
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

    //Sapient generated method id: ${324fb1e7-101b-32d7-88f7-05bc29d263ac}, hash: 63226BCFF71E30D2CAEC8B0F7F5FEDE4
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
        Formatter rec$Mock = mock(Formatter.class);
        Injector injectorMock = mock(Injector.class, "null");
        ImmutableList immutableListMock2 = mock(ImmutableList.class);
        try (MockedStatic<ErrorFormatter> errorFormatter = mockStatic(ErrorFormatter.class);
             MockedStatic<Messages> messages = mockStatic(Messages.class);
             MockedStatic<MissingImplementationErrorHints> missingImplementationErrorHints = mockStatic(MissingImplementationErrorHints.class)) {
            Object[] objectArray = new Object[]{};
            Formatter formatter = rec$Mock.format("format1", objectArray);
            doReturn(formatter).when(rec$Mock).format("format1", objectArray);
            String[] stringArray = new String[]{"String"};
            Formatter formatter2 = rec$Mock.format("\n%s\n", stringArray);
            doReturn(formatter2).when(rec$Mock).format("\n%s\n", stringArray);
            missingImplementationErrorHints.when(() -> MissingImplementationErrorHints.getSuggestions((Key) any(), eq(injectorMock))).thenReturn(immutableListMock);
            messages.when(() -> Messages.convert((Key) any())).thenReturn(objectMock);
            messages.when(() -> Messages.bold("Requested by:")).thenReturn("String");
            errorFormatter.when(() -> ErrorFormatter.formatSources(eq(1), anyList(), eq(rec$Mock))).thenAnswer((Answer<Void>) invocation -> null);
            Key key = Key.get(Object.class);
            List<Object> objectList = new ArrayList<>();
            MissingImplementationError target = spy(new MissingImplementationError(key, injectorMock, objectList));
            ImmutableList immutableList = (ImmutableList) ImmutableList.of();
            doReturn(immutableList).when(suggestionsSupplierMock).get();
            doReturn(immutableListMock2).when(target).getSources();
            Stream<Object> stream = Stream.empty();
            doReturn(stream).when(immutableListMock2).stream();
            List<ErrorDetail<?>> anyList = new ArrayList<>();
            //Act Statement(s)
            target.formatDetail(anyList, rec$Mock);
            //Assert statement(s)
            verify(rec$Mock).format("format1", objectArray);
            verify(rec$Mock).format("\n%s\n", stringArray);
            missingImplementationErrorHints.verify(() -> MissingImplementationErrorHints.getSuggestions((Key) any(), eq(injectorMock)));
            messages.verify(() -> Messages.convert((Key) any()));
            messages.verify(() -> Messages.bold("Requested by:"), atLeast(1));
            errorFormatter.verify(() -> ErrorFormatter.formatSources(eq(1), anyList(), eq(rec$Mock)));
            verify(suggestionsSupplierMock).get();
            verify(target).getSources();
            verify(immutableListMock2).stream();
        }
    }

    //Sapient generated method id: ${22e7c14b-c2f8-3631-b7c2-fa54895cb8e5}, hash: 6355D7B4B2E93C3E56B68B37845EB235
    @Ignore()
    @Test()
    public void withSources1Test() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ImmutableList immutableListMock = mock(ImmutableList.class);
        Object objectMock = mock(Object.class, "<init>_object1");
        Object objectMock2 = mock(Object.class, "<init>_object2");
        try (MockedStatic<Messages> messages = mockStatic(Messages.class);
             MockedStatic<MissingImplementationErrorHints> missingImplementationErrorHints = mockStatic(MissingImplementationErrorHints.class)) {
            missingImplementationErrorHints.when(() -> MissingImplementationErrorHints.getSuggestions((Key) any(), eq(injectorMock))).thenReturn(immutableListMock);
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

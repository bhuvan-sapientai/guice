package com.google.inject.internal;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.List;

import org.mockito.stubbing.Answer;

import java.lang.annotation.Annotation;

import com.google.inject.spi.ErrorDetail;

import java.util.Formatter;

import org.mockito.MockedStatic;

import java.util.ArrayList;

import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.anyList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;

public class ScopeNotFoundErrorSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final ErrorDetail errorDetailMock = mock(ErrorDetail.class);

    private final Object objectMock = mock(Object.class, "<init>_object1");

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${74d95059-b1ab-37f7-8e6b-dd9ca118c0fb}, hash: CC69F894C2791A654DA3ED0E77FBB77F
    @Test()
    public void isMergeableWhenOtherInstanceOfScopeNotFoundErrorThrowsNullPointerException() {
        /* Branches:
         * (other instanceof ScopeNotFoundError) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ScopeNotFoundError scopeNotFoundErrorMock = mock(ScopeNotFoundError.class);
        try (MockedStatic<Messages> messages = mockStatic(Messages.class)) {
            messages.when(() -> Messages.convert(Annotation.class)).thenReturn(objectMock);
            List<Object> objectList = new ArrayList<>();
            ScopeNotFoundError target = new ScopeNotFoundError(Annotation.class, objectList);
            thrown.expect(NullPointerException.class);
            //Act Statement(s)
            target.isMergeable(scopeNotFoundErrorMock);
            //Assert statement(s)
            messages.verify(() -> Messages.convert(Annotation.class), atLeast(1));
        }
    }

    //Sapient generated method id: ${74779650-b10e-3436-8f78-002ca29915b9}, hash: 167DBA16FAFE8E4A53A2E06D6127B18E
    @Test()
    public void isMergeableWhenOtherNotInstanceOfScopeNotFoundError() {
        /* Branches:
         * (other instanceof ScopeNotFoundError) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Messages> messages = mockStatic(Messages.class)) {
            messages.when(() -> Messages.convert(Annotation.class)).thenReturn(objectMock);
            List<Object> objectList = new ArrayList<>();
            ScopeNotFoundError target = new ScopeNotFoundError(Annotation.class, objectList);
            //Act Statement(s)
            boolean result = target.isMergeable(errorDetailMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            messages.verify(() -> Messages.convert(Annotation.class), atLeast(1));
        }
    }

    //Sapient generated method id: ${ea72b295-ddff-3632-9f9a-1b7a1870be65}, hash: A11A72EFB2BBE02C5D60D3F25BF68072
    @Test()
    public void formatDetailWhenSourcesSetIsNotEmpty() {
        /* Branches:
         * (for-each(sourcesSet)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ErrorFormatter> errorFormatter = mockStatic(ErrorFormatter.class);
             MockedStatic<Messages> messages = mockStatic(Messages.class)) {
            List<Object> objectList = new ArrayList<>();
            doReturn(objectList).when(errorDetailMock).getSources();
            messages.when(() -> Messages.convert(Annotation.class)).thenReturn(objectMock);
            Formatter formatter = new Formatter();
            errorFormatter.when(() -> ErrorFormatter.formatSources(eq(1), anyList(), eq(formatter))).thenAnswer((Answer<Void>) invocation -> null);
            errorFormatter.when(() -> ErrorFormatter.formatSources(eq(2), anyList(), eq(formatter))).thenAnswer((Answer<Void>) invocation -> null);
            List<Object> objectList2 = new ArrayList<>();
            ScopeNotFoundError target = new ScopeNotFoundError(Annotation.class, objectList2);
            List<ErrorDetail<?>> anyList = new ArrayList<>();
            anyList.add(errorDetailMock);
            //Act Statement(s)
            target.formatDetail(anyList, formatter);
            //Assert statement(s)
            verify(errorDetailMock).getSources();
            messages.verify(() -> Messages.convert(Annotation.class), atLeast(1));
            errorFormatter.verify(() -> ErrorFormatter.formatSources(eq(1), anyList(), eq(formatter)));
            errorFormatter.verify(() -> ErrorFormatter.formatSources(eq(2), anyList(), eq(formatter)));
        }
    }

    //Sapient generated method id: ${22e7c14b-c2f8-3631-b7c2-fa54895cb8e5}, hash: 5B1C89D0256879A7901644952A8EBDCA
    @Test()
    public void withSources1Test() {
        //Arrange Statement(s)
        Object objectMock2 = mock(Object.class, "<init>_object2");
        try (MockedStatic<Messages> messages = mockStatic(Messages.class)) {
            messages.when(() -> Messages.convert(Annotation.class)).thenReturn(objectMock).thenReturn(objectMock2);
            List<Object> objectList = new ArrayList<>();
            ScopeNotFoundError target = new ScopeNotFoundError(Annotation.class, objectList);
            List<Object> objectList2 = new ArrayList<>();
            //Act Statement(s)
            ScopeNotFoundError result = target.withSources(objectList2);
            ScopeNotFoundError scopeNotFoundError = new ScopeNotFoundError(Annotation.class, objectList2);
            //Assert statement(s)
            assertThat(result, equalTo(scopeNotFoundError));
            messages.verify(() -> Messages.convert(Annotation.class), atLeast(2));
        }
    }
}

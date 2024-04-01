package com.google.inject.internal;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.List;

import com.google.inject.spi.ErrorDetail;

import java.util.Formatter;

import org.mockito.MockedStatic;
import com.google.inject.Binding;

import java.util.ArrayList;

import com.google.inject.Key;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;

public class BindingAlreadySetErrorSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Binding<?> originalMock = mock(Binding.class, "original");

    private final Binding<?> bindingMock = mock(Binding.class, "binding");

    private final BindingAlreadySetError bindingAlreadySetErrorMock = mock(BindingAlreadySetError.class);

    private final Key keyMock = mock(Key.class);

    private final Object objectMock = mock(Object.class, "<init>_object1");

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${7a8f5d12-a425-3be7-bfd4-9cf6d30adbf4}, hash: AD3110325D9BABC22D83A9D2D2D3D5E9
    @Test()
    public void isMergeableWhenOtherErrorInstanceOfBindingAlreadySetErrorThrowsNullPointerException() {
        /* Branches:
         * (otherError instanceof BindingAlreadySetError) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Messages> messages = mockStatic(Messages.class)) {
            doReturn(keyMock).when(bindingMock).getKey();
            messages.when(() -> Messages.convert(keyMock)).thenReturn(objectMock);
            List<Object> objectList = new ArrayList<>();
            BindingAlreadySetError target = new BindingAlreadySetError(bindingMock, originalMock, objectList);
            thrown.expect(NullPointerException.class);
            //Act Statement(s)
            target.isMergeable(bindingAlreadySetErrorMock);
            //Assert statement(s)
            verify(bindingMock).getKey();
            messages.verify(() -> Messages.convert(keyMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${6b526506-7b6c-3811-a5f2-52da77773dcf}, hash: F7525EDBBC28DC6CB70C95DD7EFE1BB2
    @Test()
    public void isMergeableWhenOtherErrorNotInstanceOfBindingAlreadySetError() {
        /* Branches:
         * (otherError instanceof BindingAlreadySetError) : false
         */
        //Arrange Statement(s)
        ErrorDetail errorDetailMock = mock(ErrorDetail.class);
        try (MockedStatic<Messages> messages = mockStatic(Messages.class)) {
            doReturn(keyMock).when(bindingMock).getKey();
            messages.when(() -> Messages.convert(keyMock)).thenReturn(objectMock);
            List<Object> objectList = new ArrayList<>();
            BindingAlreadySetError target = new BindingAlreadySetError(bindingMock, originalMock, objectList);
            //Act Statement(s)
            boolean result = target.isMergeable(errorDetailMock);
            //Assert statement(s)
            assertThat(result, equalTo(Boolean.FALSE));
            verify(bindingMock).getKey();
            messages.verify(() -> Messages.convert(keyMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${8d5fa27d-1424-363c-a0ae-3906d745cb55}, hash: 14FCFE86059CD4B5427CC5BA677E53C1
    @Test()
    public void formatDetailThrowsNullPointerException() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Messages> messages = mockStatic(Messages.class)) {
            doReturn(keyMock).when(bindingMock).getKey();
            messages.when(() -> Messages.convert(keyMock)).thenReturn(objectMock);
            List<Object> objectList = new ArrayList<>();
            BindingAlreadySetError target = new BindingAlreadySetError(bindingMock, originalMock, objectList);
            Object object = new Object();
            doReturn(object).when(originalMock).getSource();
            Object object2 = new Object();
            doReturn(object2).when(bindingMock).getSource();
            thrown.expect(NullPointerException.class);
            List<ErrorDetail<?>> anyList = new ArrayList<>();
            anyList.add(bindingAlreadySetErrorMock);
            Formatter formatter = new Formatter();
            //Act Statement(s)
            target.formatDetail(anyList, formatter);
            //Assert statement(s)
            verify(bindingMock).getKey();
            messages.verify(() -> Messages.convert(keyMock), atLeast(1));
            verify(originalMock).getSource();
            verify(bindingMock).getSource();
        }
    }

    //Sapient generated method id: ${22e7c14b-c2f8-3631-b7c2-fa54895cb8e5}, hash: 1285FB2B15D58827560BFE3701DAAD00
    @Test()
    public void withSources1Test() {
        //Arrange Statement(s)
        Key keyMock2 = mock(Key.class);
        Object objectMock2 = mock(Object.class, "<init>_object2");
        try (MockedStatic<Messages> messages = mockStatic(Messages.class)) {
            doReturn(keyMock, keyMock2).when(bindingMock).getKey();
            messages.when(() -> Messages.convert(keyMock)).thenReturn(objectMock);
            messages.when(() -> Messages.convert(keyMock2)).thenReturn(objectMock2);
            List<Object> objectList = new ArrayList<>();
            BindingAlreadySetError target = new BindingAlreadySetError(bindingMock, originalMock, objectList);
            List<Object> objectList2 = new ArrayList<>();
            //Act Statement(s)
            BindingAlreadySetError result = target.withSources(objectList2);
            BindingAlreadySetError bindingAlreadySetError = new BindingAlreadySetError(bindingMock, originalMock, objectList2);
            //Assert statement(s)
            assertThat(result, equalTo(bindingAlreadySetError));
            verify(bindingMock, atLeast(2)).getKey();
            messages.verify(() -> Messages.convert(keyMock), atLeast(1));
            messages.verify(() -> Messages.convert(keyMock2), atLeast(1));
        }
    }
}

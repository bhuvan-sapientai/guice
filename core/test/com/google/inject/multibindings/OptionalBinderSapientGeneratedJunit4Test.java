package com.google.inject.multibindings;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import com.google.inject.TypeLiteral;
import org.mockito.MockedStatic;
import com.google.inject.Binder;
import com.google.inject.binder.LinkedBindingBuilder;
import com.google.inject.Key;
import com.google.inject.internal.RealOptionalBinder;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

public class OptionalBinderSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final RealOptionalBinder<Object> delegateMock = mock(RealOptionalBinder.class, "delegate");

    private final Binder binderMock = mock(Binder.class);

    private final Key<Object> keyMock = mock(Key.class);

    private final LinkedBindingBuilder linkedBindingBuilderMock = mock(LinkedBindingBuilder.class);

    //Sapient generated method id: ${0fced300-317b-31e1-9be5-e46ef0fa82df}, hash: 56DD63979238914BFD704025707CCD22
    @Test()
    public void newOptionalBinderTest() {
        //Arrange Statement(s)
        try (MockedStatic<RealOptionalBinder> realOptionalBinder = mockStatic(RealOptionalBinder.class);
             MockedStatic<Key> key = mockStatic(Key.class)) {
            key.when(() -> Key.get(Object.class)).thenReturn(keyMock);
            realOptionalBinder.when(() -> RealOptionalBinder.newRealOptionalBinder(binderMock, keyMock)).thenReturn(delegateMock);
            //Act Statement(s)
            OptionalBinder result = OptionalBinder.newOptionalBinder(binderMock, Object.class);
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            key.verify(() -> Key.get(Object.class), atLeast(1));
            realOptionalBinder.verify(() -> RealOptionalBinder.newRealOptionalBinder(binderMock, keyMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${d6afc647-65f1-3df7-b0ea-18d4d8cf7b09}, hash: AD230E36621BC9C3A0E10C00ACA851CD
    @Test()
    public void newOptionalBinder1Test() {
        //Arrange Statement(s)
        TypeLiteral<Object> typeLiteralMock = mock(TypeLiteral.class);
        try (MockedStatic<RealOptionalBinder> realOptionalBinder = mockStatic(RealOptionalBinder.class);
             MockedStatic<Key> key = mockStatic(Key.class)) {
            key.when(() -> Key.get(typeLiteralMock)).thenReturn(keyMock);
            realOptionalBinder.when(() -> RealOptionalBinder.newRealOptionalBinder(binderMock, keyMock)).thenReturn(delegateMock);
            //Act Statement(s)
            OptionalBinder result = OptionalBinder.newOptionalBinder(binderMock, typeLiteralMock);
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            key.verify(() -> Key.get(typeLiteralMock), atLeast(1));
            realOptionalBinder.verify(() -> RealOptionalBinder.newRealOptionalBinder(binderMock, keyMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${104bb64a-d6c5-3848-b7ce-8e2713bef097}, hash: A5A73D2EB72C52D90321C8ABB83EACFD
    @Test()
    public void newOptionalBinder2Test() {
        //Arrange Statement(s)
        try (MockedStatic<RealOptionalBinder> realOptionalBinder = mockStatic(RealOptionalBinder.class)) {
            realOptionalBinder.when(() -> RealOptionalBinder.newRealOptionalBinder(binderMock, keyMock)).thenReturn(delegateMock);
            //Act Statement(s)
            OptionalBinder result = OptionalBinder.newOptionalBinder(binderMock, keyMock);
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            realOptionalBinder.verify(() -> RealOptionalBinder.newRealOptionalBinder(binderMock, keyMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${4d8418b9-8e85-3fe8-9e5f-1589d6f830e9}, hash: A81CBCBFC2A30FAA7636119DBCC6067E
    @Test()
    public void setDefaultTest() {
        //Arrange Statement(s)
        try (MockedStatic<RealOptionalBinder> realOptionalBinder = mockStatic(RealOptionalBinder.class);
             MockedStatic<Key> key = mockStatic(Key.class)) {
            key.when(() -> Key.get(Object.class)).thenReturn(keyMock);
            realOptionalBinder.when(() -> RealOptionalBinder.newRealOptionalBinder(binderMock, keyMock)).thenReturn(delegateMock);
            OptionalBinder<Object> target = OptionalBinder.newOptionalBinder(binderMock, Object.class);
            doReturn(linkedBindingBuilderMock).when(delegateMock).setDefault();
            //Act Statement(s)
            LinkedBindingBuilder result = target.setDefault();
            //Assert statement(s)
            assertThat(result, equalTo(linkedBindingBuilderMock));
            key.verify(() -> Key.get(Object.class), atLeast(1));
            realOptionalBinder.verify(() -> RealOptionalBinder.newRealOptionalBinder(binderMock, keyMock), atLeast(1));
            verify(delegateMock).setDefault();
        }
    }

    //Sapient generated method id: ${8328d3e5-807e-3d6a-a02a-2a3815a63620}, hash: 02F536C29C43DF4DF28245672EE7B1B9
    @Test()
    public void setBindingTest() {
        //Arrange Statement(s)
        try (MockedStatic<RealOptionalBinder> realOptionalBinder = mockStatic(RealOptionalBinder.class);
             MockedStatic<Key> key = mockStatic(Key.class)) {
            key.when(() -> Key.get(Object.class)).thenReturn(keyMock);
            realOptionalBinder.when(() -> RealOptionalBinder.newRealOptionalBinder(binderMock, keyMock)).thenReturn(delegateMock);
            OptionalBinder<Object> target = OptionalBinder.newOptionalBinder(binderMock, Object.class);
            doReturn(linkedBindingBuilderMock).when(delegateMock).setBinding();
            //Act Statement(s)
            LinkedBindingBuilder result = target.setBinding();
            //Assert statement(s)
            assertThat(result, equalTo(linkedBindingBuilderMock));
            key.verify(() -> Key.get(Object.class), atLeast(1));
            realOptionalBinder.verify(() -> RealOptionalBinder.newRealOptionalBinder(binderMock, keyMock), atLeast(1));
            verify(delegateMock).setBinding();
        }
    }
}

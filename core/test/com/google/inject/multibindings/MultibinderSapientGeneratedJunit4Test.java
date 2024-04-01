package com.google.inject.multibindings;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.lang.annotation.Annotation;

import com.google.inject.TypeLiteral;
import com.google.inject.binder.LinkedBindingBuilder;
import org.mockito.MockedStatic;
import com.google.inject.Binder;
import com.google.inject.Key;
import com.google.inject.internal.RealMultibinder;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

import org.junit.Ignore;

public class MultibinderSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final RealMultibinder<Object> delegateMock = mock(RealMultibinder.class, "delegate");

    private final Annotation annotationMock = mock(Annotation.class);

    private final Binder binderMock = mock(Binder.class);

    private final Key<Object> keyMock = mock(Key.class);

    private final Multibinder multibinderMock = mock(Multibinder.class);

    private final TypeLiteral<Object> typeLiteralMock = mock(TypeLiteral.class);

    //Sapient generated method id: ${a3285671-83d7-30d8-ae7a-14366f0ca70e}, hash: 0E195D86DAF463859272CC9345DD88DD
    @Test()
    public void newSetBinderTest() {
        //Arrange Statement(s)
        try (MockedStatic<Multibinder> multibinder = mockStatic(Multibinder.class, CALLS_REAL_METHODS);
             MockedStatic<Key> key = mockStatic(Key.class)) {
            key.when(() -> Key.get(typeLiteralMock)).thenReturn(keyMock);
            multibinder.when(() -> Multibinder.newSetBinder(binderMock, keyMock)).thenReturn(multibinderMock);
            //Act Statement(s)
            Multibinder result = Multibinder.newSetBinder(binderMock, typeLiteralMock);
            //Assert statement(s)
            assertThat(result, equalTo(multibinderMock));
            key.verify(() -> Key.get(typeLiteralMock), atLeast(1));
            multibinder.verify(() -> Multibinder.newSetBinder(binderMock, keyMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${aa6ee068-af91-31ba-b39c-c6a2899c5d72}, hash: 068A30B5A91E171103AA8617C09F9DC8
    @Test()
    public void newSetBinder1Test() {
        //Arrange Statement(s)
        try (MockedStatic<Multibinder> multibinder = mockStatic(Multibinder.class, CALLS_REAL_METHODS);
             MockedStatic<Key> key = mockStatic(Key.class)) {
            key.when(() -> Key.get(Object.class)).thenReturn(keyMock);
            multibinder.when(() -> Multibinder.newSetBinder(binderMock, keyMock)).thenReturn(multibinderMock);
            //Act Statement(s)
            Multibinder result = Multibinder.newSetBinder(binderMock, Object.class);
            //Assert statement(s)
            assertThat(result, equalTo(multibinderMock));
            key.verify(() -> Key.get(Object.class), atLeast(1));
            multibinder.verify(() -> Multibinder.newSetBinder(binderMock, keyMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${05a09187-c500-3cc9-a4d1-92d654565368}, hash: BD4A73491EF0838B61D7784DCB9A9CBC
    @Test()
    public void newSetBinder2Test() {
        //Arrange Statement(s)
        try (MockedStatic<Multibinder> multibinder = mockStatic(Multibinder.class, CALLS_REAL_METHODS);
             MockedStatic<Key> key = mockStatic(Key.class)) {
            key.when(() -> Key.get(typeLiteralMock, annotationMock)).thenReturn(keyMock);
            multibinder.when(() -> Multibinder.newSetBinder(binderMock, keyMock)).thenReturn(multibinderMock);
            //Act Statement(s)
            Multibinder result = Multibinder.newSetBinder(binderMock, typeLiteralMock, annotationMock);
            //Assert statement(s)
            assertThat(result, equalTo(multibinderMock));
            key.verify(() -> Key.get(typeLiteralMock, annotationMock), atLeast(1));
            multibinder.verify(() -> Multibinder.newSetBinder(binderMock, keyMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${87ebb355-7e0b-3f9f-aa69-2c89153f063e}, hash: BB632C30AC695F574C9A7B2BAFCC7577
    @Test()
    public void newSetBinder3Test() {
        //Arrange Statement(s)
        try (MockedStatic<Multibinder> multibinder = mockStatic(Multibinder.class, CALLS_REAL_METHODS);
             MockedStatic<Key> key = mockStatic(Key.class)) {
            key.when(() -> Key.get(Object.class, annotationMock)).thenReturn(keyMock);
            multibinder.when(() -> Multibinder.newSetBinder(binderMock, keyMock)).thenReturn(multibinderMock);
            //Act Statement(s)
            Multibinder result = Multibinder.newSetBinder(binderMock, Object.class, annotationMock);
            //Assert statement(s)
            assertThat(result, equalTo(multibinderMock));
            key.verify(() -> Key.get(Object.class, annotationMock), atLeast(1));
            multibinder.verify(() -> Multibinder.newSetBinder(binderMock, keyMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${0dfb8fdb-40ab-36ee-8a6f-7b3caf29be8d}, hash: A404EB92E4827C01B879F9449C4C5F24
    @Test()
    public void newSetBinder4Test() {
        //Arrange Statement(s)
        try (MockedStatic<Multibinder> multibinder = mockStatic(Multibinder.class, CALLS_REAL_METHODS);
             MockedStatic<Key> key = mockStatic(Key.class)) {
            key.when(() -> Key.get(typeLiteralMock, Annotation.class)).thenReturn(keyMock);
            multibinder.when(() -> Multibinder.newSetBinder(binderMock, keyMock)).thenReturn(multibinderMock);
            //Act Statement(s)
            Multibinder result = Multibinder.newSetBinder(binderMock, typeLiteralMock, Annotation.class);
            //Assert statement(s)
            assertThat(result, equalTo(multibinderMock));
            key.verify(() -> Key.get(typeLiteralMock, Annotation.class), atLeast(1));
            multibinder.verify(() -> Multibinder.newSetBinder(binderMock, keyMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${1da070f4-2f10-378a-8fb8-799507b89b96}, hash: 91A72690858428F546B64655D38AEE88
    @Test()
    public void newSetBinder5Test() {
        //Arrange Statement(s)
        RealMultibinder<Object> realMultibinderMock = mock(RealMultibinder.class);
        try (MockedStatic<RealMultibinder> realMultibinder = mockStatic(RealMultibinder.class)) {
            realMultibinder.when(() -> RealMultibinder.newRealSetBinder(binderMock, keyMock)).thenReturn(realMultibinderMock);
            //Act Statement(s)
            Multibinder result = Multibinder.newSetBinder(binderMock, keyMock);
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            realMultibinder.verify(() -> RealMultibinder.newRealSetBinder(binderMock, keyMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${dee1c0d0-2cf7-3527-9dfa-5864a8f283e9}, hash: 98DCD1BB5E876833EDDDD7637AE34BE0
    @Test()
    public void newSetBinder6Test() {
        //Arrange Statement(s)
        try (MockedStatic<Multibinder> multibinder = mockStatic(Multibinder.class, CALLS_REAL_METHODS);
             MockedStatic<Key> key = mockStatic(Key.class)) {
            key.when(() -> Key.get(Object.class, Annotation.class)).thenReturn(keyMock);
            multibinder.when(() -> Multibinder.newSetBinder(binderMock, keyMock)).thenReturn(multibinderMock);
            //Act Statement(s)
            Multibinder result = Multibinder.newSetBinder(binderMock, Object.class, Annotation.class);
            //Assert statement(s)
            assertThat(result, equalTo(multibinderMock));
            key.verify(() -> Key.get(Object.class, Annotation.class), atLeast(1));
            multibinder.verify(() -> Multibinder.newSetBinder(binderMock, keyMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${c0580e94-5ea0-3661-aaa4-0795dc7e2aef}, hash: FF2925ED1B285D289D4BCD5F1164FAFD
    @Ignore()
    @Test()
    public void permitDuplicatesTest() {
        //Arrange Statement(s)
        try (MockedStatic<Multibinder> multibinder = mockStatic(Multibinder.class);
             MockedStatic<Key> key = mockStatic(Key.class)) {
            key.when(() -> Key.get(typeLiteralMock, annotationMock)).thenReturn(keyMock);
            multibinder.when(() -> Multibinder.newSetBinder(binderMock, keyMock)).thenReturn(multibinderMock);
            Multibinder<Object> target = Multibinder.newSetBinder(binderMock, typeLiteralMock, annotationMock);
            doNothing().when(delegateMock).permitDuplicates();
            //Act Statement(s)
            Multibinder result = target.permitDuplicates();
            //Assert statement(s)
            assertThat(result, equalTo(target));
            key.verify(() -> Key.get(typeLiteralMock, annotationMock), atLeast(1));
            multibinder.verify(() -> Multibinder.newSetBinder(binderMock, keyMock), atLeast(1));
            verify(delegateMock).permitDuplicates();
        }
    }

    //Sapient generated method id: ${ec2f3da5-eede-3d4b-9493-a710102288c9}, hash: 366FBA862102C563767EA5DB76E26A12
    @Ignore()
    @Test()
    public void addBindingTest() {
        //Arrange Statement(s)
        LinkedBindingBuilder linkedBindingBuilderMock = mock(LinkedBindingBuilder.class);
        try (MockedStatic<Multibinder> multibinder = mockStatic(Multibinder.class);
             MockedStatic<Key> key = mockStatic(Key.class)) {
            key.when(() -> Key.get(typeLiteralMock, annotationMock)).thenReturn(keyMock);
            multibinder.when(() -> Multibinder.newSetBinder(binderMock, keyMock)).thenReturn(multibinderMock);
            Multibinder<Object> target = Multibinder.newSetBinder(binderMock, typeLiteralMock, annotationMock);
            doReturn(linkedBindingBuilderMock).when(delegateMock).addBinding();
            //Act Statement(s)
            LinkedBindingBuilder result = target.addBinding();
            //Assert statement(s)
            assertThat(result, equalTo(linkedBindingBuilderMock));
            key.verify(() -> Key.get(typeLiteralMock, annotationMock), atLeast(1));
            multibinder.verify(() -> Multibinder.newSetBinder(binderMock, keyMock), atLeast(1));
            verify(delegateMock).addBinding();
        }
    }
}

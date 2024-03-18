package com.google.inject.multibindings;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.lang.annotation.Annotation;

import com.google.inject.TypeLiteral;
import org.mockito.MockedStatic;
import com.google.inject.Binder;
import com.google.inject.binder.LinkedBindingBuilder;
import com.google.inject.internal.RealMapBinder;

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

public class MapBinderSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final RealMapBinder<Object, Object> delegateMock = mock(RealMapBinder.class, "delegate");

    private final Annotation annotationMock = mock(Annotation.class);

    private final Binder binderMock = mock(Binder.class);

    private final MapBinder<Object, Object> mapBinderMock = mock(MapBinder.class);

    private final TypeLiteral<Object> typeLiteralMock = mock(TypeLiteral.class);

    private final TypeLiteral<Object> typeLiteralMock2 = mock(TypeLiteral.class);

    //Sapient generated method id: ${3d62251c-d0c6-3ed8-8f57-e9ebb654330b}, hash: AFDBD7CF7CD77BC16D6FE120E5C24D02
    @Ignore()
    @Test()
    public void newMapBinderTest() {
        //Arrange Statement(s)
        try (MockedStatic<RealMapBinder> realMapBinder = mockStatic(RealMapBinder.class)) {
            realMapBinder.when(() -> RealMapBinder.newMapRealBinder(binderMock, typeLiteralMock, typeLiteralMock2)).thenReturn(delegateMock);
            //Act Statement(s)
            MapBinder<Object, Object> result = MapBinder.newMapBinder(binderMock, typeLiteralMock, typeLiteralMock2);
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            realMapBinder.verify(() -> RealMapBinder.newMapRealBinder(binderMock, typeLiteralMock, typeLiteralMock2), atLeast(1));
        }
    }

    //Sapient generated method id: ${151db261-8dfd-364c-b7cf-8eeca2abe358}, hash: D0620AECECC660C72F01BC630B419E98
    @Ignore()
    @Test()
    public void newMapBinder1Test() {
        //Arrange Statement(s)
        try (MockedStatic<MapBinder> mapBinder = mockStatic(MapBinder.class, CALLS_REAL_METHODS);
             MockedStatic<TypeLiteral> typeLiteral = mockStatic(TypeLiteral.class)) {
            typeLiteral.when(() -> TypeLiteral.get(Object.class)).thenReturn(typeLiteralMock).thenReturn(typeLiteralMock2);
            mapBinder.when(() -> MapBinder.newMapBinder(binderMock, typeLiteralMock, typeLiteralMock2)).thenReturn(mapBinderMock);
            //Act Statement(s)
            MapBinder<Object, Object> result = MapBinder.newMapBinder(binderMock, Object.class, Object.class);
            //Assert statement(s)
            assertThat(result, equalTo(mapBinderMock));
            typeLiteral.verify(() -> TypeLiteral.get(Object.class), atLeast(2));
            mapBinder.verify(() -> MapBinder.newMapBinder(binderMock, typeLiteralMock, typeLiteralMock2), atLeast(1));
        }
    }

    //Sapient generated method id: ${8d131aae-e144-3590-bbc8-1182033907b7}, hash: DB402D14BEFE353BA2DA768B470EB191
    @Ignore()
    @Test()
    public void newMapBinder2Test() {
        //Arrange Statement(s)
        try (MockedStatic<RealMapBinder> realMapBinder = mockStatic(RealMapBinder.class)) {
            realMapBinder.when(() -> RealMapBinder.newRealMapBinder(binderMock, typeLiteralMock, typeLiteralMock2, annotationMock)).thenReturn(delegateMock);
            //Act Statement(s)
            MapBinder<Object, Object> result = MapBinder.newMapBinder(binderMock, typeLiteralMock, typeLiteralMock2, annotationMock);
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            realMapBinder.verify(() -> RealMapBinder.newRealMapBinder(binderMock, typeLiteralMock, typeLiteralMock2, annotationMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${dd79a23a-2bb6-37ac-abae-88e0eea315c4}, hash: 1CD8A17D5E3FFF21AEC107DC4E0F71AC
    @Ignore()
    @Test()
    public void newMapBinder3Test() {
        //Arrange Statement(s)
        try (MockedStatic<MapBinder> mapBinder = mockStatic(MapBinder.class, CALLS_REAL_METHODS);
             MockedStatic<TypeLiteral> typeLiteral = mockStatic(TypeLiteral.class)) {
            typeLiteral.when(() -> TypeLiteral.get(Object.class)).thenReturn(typeLiteralMock).thenReturn(typeLiteralMock2);
            mapBinder.when(() -> MapBinder.newMapBinder(binderMock, typeLiteralMock, typeLiteralMock2, annotationMock)).thenReturn(mapBinderMock);
            //Act Statement(s)
            MapBinder<Object, Object> result = MapBinder.newMapBinder(binderMock, Object.class, Object.class, annotationMock);
            //Assert statement(s)
            assertThat(result, equalTo(mapBinderMock));
            typeLiteral.verify(() -> TypeLiteral.get(Object.class), atLeast(2));
            mapBinder.verify(() -> MapBinder.newMapBinder(binderMock, typeLiteralMock, typeLiteralMock2, annotationMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${9918e671-55c2-3c84-8393-9a2349367697}, hash: 58F0359C70E1F64A0E90E60B40823333
    @Ignore()
    @Test()
    public void newMapBinder4Test() {
        //Arrange Statement(s)
        try (MockedStatic<RealMapBinder> realMapBinder = mockStatic(RealMapBinder.class)) {
            realMapBinder.when(() -> RealMapBinder.newRealMapBinder(binderMock, typeLiteralMock, typeLiteralMock2, Annotation.class)).thenReturn(delegateMock);
            //Act Statement(s)
            MapBinder<Object, Object> result = MapBinder.newMapBinder(binderMock, typeLiteralMock, typeLiteralMock2, Annotation.class);
            //Assert statement(s)
            assertThat(result, is(notNullValue()));
            realMapBinder.verify(() -> RealMapBinder.newRealMapBinder(binderMock, typeLiteralMock, typeLiteralMock2, Annotation.class), atLeast(1));
        }
    }

    //Sapient generated method id: ${ccdc1c25-01c0-36e8-a5ca-0785d8e611a0}, hash: 61BB85139B8E2FA3115228467287B533
    @Ignore()
    @Test()
    public void newMapBinder5Test() {
        //Arrange Statement(s)
        try (MockedStatic<MapBinder> mapBinder = mockStatic(MapBinder.class, CALLS_REAL_METHODS);
             MockedStatic<TypeLiteral> typeLiteral = mockStatic(TypeLiteral.class)) {
            typeLiteral.when(() -> TypeLiteral.get(Object.class)).thenReturn(typeLiteralMock).thenReturn(typeLiteralMock2);
            mapBinder.when(() -> MapBinder.newMapBinder(binderMock, typeLiteralMock, typeLiteralMock2, Annotation.class)).thenReturn(mapBinderMock);
            //Act Statement(s)
            MapBinder<Object, Object> result = MapBinder.newMapBinder(binderMock, Object.class, Object.class, Annotation.class);
            //Assert statement(s)
            assertThat(result, equalTo(mapBinderMock));
            typeLiteral.verify(() -> TypeLiteral.get(Object.class), atLeast(2));
            mapBinder.verify(() -> MapBinder.newMapBinder(binderMock, typeLiteralMock, typeLiteralMock2, Annotation.class), atLeast(1));
        }
    }

    //Sapient generated method id: ${c0580e94-5ea0-3661-aaa4-0795dc7e2aef}, hash: B057B19138C607F69ECDD0BB1D2CD880
    @Ignore()
    @Test()
    public void permitDuplicatesTest() {
    }

    //Sapient generated method id: ${ec2f3da5-eede-3d4b-9493-a710102288c9}, hash: 61CCBBAE8A64AEDBD6A22D6DE8E2C523
    @Ignore()
    @Test()
    public void addBindingTest() {
        //Arrange Statement(s)
        LinkedBindingBuilder linkedBindingBuilderMock = mock(LinkedBindingBuilder.class);
    }
}

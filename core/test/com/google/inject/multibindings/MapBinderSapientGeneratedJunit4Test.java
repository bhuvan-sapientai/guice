package com.google.inject.multibindings;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.lang.annotation.Annotation;

import com.google.inject.TypeLiteral;
import org.mockito.MockedStatic;
import com.google.inject.Binder;
import com.google.inject.internal.RealMapBinder;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.is;

import org.junit.Ignore;

public class MapBinderSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Annotation annotationMock = mock(Annotation.class);

    private final Binder binderMock = mock(Binder.class);

    private final MapBinder<Object, Object> mapBinderMock = mock(MapBinder.class);

    private final RealMapBinder<Object, Object> realMapBinderMock = mock(RealMapBinder.class);

    private final TypeLiteral<Object> typeLiteralMock = mock(TypeLiteral.class);

    private final TypeLiteral<Object> typeLiteralMock2 = mock(TypeLiteral.class);

    //Sapient generated method id: ${3d62251c-d0c6-3ed8-8f57-e9ebb654330b}, hash: 528F37CB6CB24AE3C1E039AD7A6EE9E9
    @Ignore()
    @Test()
    public void newMapBinderTest() {
        //Arrange Statement(s)
        try (MockedStatic<RealMapBinder> realMapBinder = mockStatic(RealMapBinder.class)) {
            realMapBinder.when(() -> RealMapBinder.newMapRealBinder(binderMock, typeLiteralMock, typeLiteralMock2)).thenReturn(realMapBinderMock);
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

    //Sapient generated method id: ${8d131aae-e144-3590-bbc8-1182033907b7}, hash: DEA160F084BBCDC7F331F43CA3457603
    @Ignore()
    @Test()
    public void newMapBinder2Test() {
        //Arrange Statement(s)
        try (MockedStatic<RealMapBinder> realMapBinder = mockStatic(RealMapBinder.class)) {
            realMapBinder.when(() -> RealMapBinder.newRealMapBinder(binderMock, typeLiteralMock, typeLiteralMock2, annotationMock)).thenReturn(realMapBinderMock);
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

    //Sapient generated method id: ${9918e671-55c2-3c84-8393-9a2349367697}, hash: 41C38DB435A1765F807F14A283842D19
    @Ignore()
    @Test()
    public void newMapBinder4Test() {
        //Arrange Statement(s)
        try (MockedStatic<RealMapBinder> realMapBinder = mockStatic(RealMapBinder.class)) {
            realMapBinder.when(() -> RealMapBinder.newRealMapBinder(binderMock, typeLiteralMock, typeLiteralMock2, Annotation.class)).thenReturn(realMapBinderMock);
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
}

package com.google.inject;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.MockedStatic;

import java.util.ArrayList;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.anyList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.is;

public class GuiceSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Injector injectorMock = mock(Injector.class);

    //Sapient generated method id: ${e1d092f4-c7fc-3607-8051-8007bd5d0853}, hash: 0C8060538134B80CFF78027B82BFC114
    @Test()
    public void createInjectorTest() {
        //Arrange Statement(s)
        try (MockedStatic<Guice> guice = mockStatic(Guice.class, CALLS_REAL_METHODS)) {
            guice.when(() -> Guice.createInjector(anyList())).thenReturn(injectorMock);
            Module[] moduleArray = new Module[]{};
            //Act Statement(s)
            Injector result = Guice.createInjector(moduleArray);
            //Assert statement(s)
            assertThat(result, equalTo(injectorMock));
            guice.verify(() -> Guice.createInjector(anyList()), atLeast(1));
        }
    }

    //Sapient generated method id: ${3988c885-0081-3dc7-a203-1b929d7bdd28}, hash: FD38687F104CD57C1F74C3FAAF13EEB3
    @Test()
    public void createInjector1Test() {
        //Arrange Statement(s)
        try (MockedStatic<Guice> guice = mockStatic(Guice.class, CALLS_REAL_METHODS)) {
            guice.when(() -> Guice.createInjector(eq(Stage.DEVELOPMENT), (Iterable) any())).thenReturn(injectorMock);
            Iterable<Module> iterable = new ArrayList<>();
            //Act Statement(s)
            Injector result = Guice.createInjector(iterable);
            //Assert statement(s)
            assertThat(result, equalTo(injectorMock));
            guice.verify(() -> Guice.createInjector(eq(Stage.DEVELOPMENT), (Iterable) any()), atLeast(1));
        }
    }

    //Sapient generated method id: ${e9e85f2f-08a1-3084-a0de-83f659df8b4f}, hash: D6296BD7989F63A71138BB16BB7F5F7B
    @Test()
    public void createInjector2Test() {
        //Arrange Statement(s)
        try (MockedStatic<Guice> guice = mockStatic(Guice.class, CALLS_REAL_METHODS)) {
            guice.when(() -> Guice.createInjector(eq(Stage.TOOL), anyList())).thenReturn(injectorMock);
            Module[] moduleArray = new Module[]{};
            //Act Statement(s)
            Injector result = Guice.createInjector(Stage.TOOL, moduleArray);
            //Assert statement(s)
            assertThat(result, equalTo(injectorMock));
            guice.verify(() -> Guice.createInjector(eq(Stage.TOOL), anyList()), atLeast(1));
        }
    }

    //Sapient generated method id: ${b0f85e76-3e99-3dc0-a7b3-2b42c6cc3982}, hash: 89F9622802D021A7FA8B8A2C26FD70E8
    @Test()
    public void createInjector3Test() {
        //Arrange Statement(s)
        Iterable<Module> iterable = new ArrayList<>();

        //Act Statement(s)
        Injector result = Guice.createInjector(Stage.PRODUCTION, iterable);

        //Assert statement(s)
        //TODO: Please implement equals method in Injector for verification of the entire object or you need to adjust respective assertion statements
        assertThat(result, is(notNullValue()));
    }
}

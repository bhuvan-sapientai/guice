package com.google.inject;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.MockedStatic;

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

import org.junit.Ignore;

public class GuiceSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Injector injectorMock = mock(Injector.class);

    private final Iterable iterableMock = mock(Iterable.class);

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

    //Sapient generated method id: ${3988c885-0081-3dc7-a203-1b929d7bdd28}, hash: 0108A54B2D4A24E7A353033806B6D912
    @Test()
    public void createInjector1Test() {
        //Arrange Statement(s)
        try (MockedStatic<Guice> guice = mockStatic(Guice.class, CALLS_REAL_METHODS)) {
            guice.when(() -> Guice.createInjector(Stage.DEVELOPMENT, iterableMock)).thenReturn(injectorMock);
            //Act Statement(s)
            Injector result = Guice.createInjector(iterableMock);
            //Assert statement(s)
            assertThat(result, equalTo(injectorMock));
            guice.verify(() -> Guice.createInjector(Stage.DEVELOPMENT, iterableMock), atLeast(1));
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

    //Sapient generated method id: ${b0f85e76-3e99-3dc0-a7b3-2b42c6cc3982}, hash: 8847218EE509493A8CCB8E5EA04743DF
    @Ignore()
    @Test()
    public void createInjector3Test() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: object of type InternalInjectorCreator
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        Injector result = Guice.createInjector(Stage.PRODUCTION, iterableMock);
        //Assert statement(s)
        //TODO: Please implement equals method in Injector for verification of the entire object or you need to adjust respective assertion statements
        assertThat(result, is(notNullValue()));
    }
}

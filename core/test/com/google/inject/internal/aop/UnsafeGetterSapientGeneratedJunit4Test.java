package com.google.inject.internal.aop;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import sun.misc.Unsafe;
import org.mockito.MockedStatic;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;

import org.junit.Ignore;

public class UnsafeGetterSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Unsafe unsafeMock = mock(Unsafe.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${5fd14203-863a-3e18-886d-f84c86d883d3}, hash: 1D9C263C307B198640314DE10C1366BA
    @Ignore()
    @Test()
    public void getUnsafeTest() throws ReflectiveOperationException {
        //Arrange Statement(s)
        try (MockedStatic<Unsafe> unsafe = mockStatic(Unsafe.class)) {
            unsafe.when(() -> Unsafe.getUnsafe()).thenReturn(unsafeMock);
            //Act Statement(s)
            Unsafe result = UnsafeGetter.getUnsafe();
            //Assert statement(s)
            assertThat(result, equalTo(unsafeMock));
            unsafe.verify(() -> Unsafe.getUnsafe(), atLeast(1));
        }
    }

    //Sapient generated method id: ${46db96fa-329c-3565-8218-339cc3aafec2}, hash: 0588590AB8CCFDD549FBA19588E8815A
    @Ignore()
    @Test()
    public void getUnsafeWhenKNotIsInstanceXThrowsNoSuchFieldError() throws ReflectiveOperationException, SecurityException, IllegalArgumentException, IllegalAccessException {
        /* Branches:
         * (catch-exception (SecurityException)) : true
         * (for-each(k.getDeclaredFields())) : true
         * (k.isInstance(x)) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: f
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Unsafe> unsafe = mockStatic(Unsafe.class)) {
            unsafe.when(() -> Unsafe.getUnsafe()).thenReturn(unsafeMock);
            NoSuchFieldError noSuchFieldError = new NoSuchFieldError("the Unsafe");
            thrown.expect(NoSuchFieldError.class);
            thrown.expectMessage(noSuchFieldError.getMessage());
            //Act Statement(s)
            UnsafeGetter.getUnsafe();
            //Assert statement(s)
            unsafe.verify(() -> Unsafe.getUnsafe(), atLeast(1));
        }
    }
}

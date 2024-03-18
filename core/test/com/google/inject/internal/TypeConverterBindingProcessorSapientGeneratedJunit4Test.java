package com.google.inject.internal;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.mockito.InjectMocks;
import org.junit.After;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import com.google.inject.matcher.Matchers;
import com.google.inject.TypeLiteral;
import org.mockito.MockitoAnnotations;
import com.google.inject.matcher.Matcher;
import org.mockito.MockedStatic;
import com.google.inject.spi.TypeConverter;
import com.google.inject.spi.TypeConverterBinding;

import static org.mockito.Mockito.doNothing;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;

public class TypeConverterBindingProcessorSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final InjectorImpl injectorMock = mock(InjectorImpl.class, "injector");

    private AutoCloseable autoCloseableMocks;

    @InjectMocks()
    private TypeConverterBindingProcessor target;

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    @After()
    public void afterTest() throws Exception {
        if (autoCloseableMocks != null)
            autoCloseableMocks.close();
    }

    //Sapient generated method id: ${3e180b9c-b47e-3dc9-9d83-a6d0fd113ba1}, hash: 40031CDC0355F6950532975044177D11
    @Test()
    public void prepareBuiltInConvertersWhenFirstNotEqualsCapitalized() throws NoSuchMethodException {
        /* Branches:
         * (s.length() == 0) : false  #  inside capitalize method
         * (first == capitalized) : false  #  inside capitalize method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        InjectorImpl injectorMock2 = mock(InjectorImpl.class, "void");
        InjectorBindingData injectorBindingDataMock = mock(InjectorBindingData.class);
        InjectorBindingData injectorBindingDataMock2 = mock(InjectorBindingData.class);
        InjectorBindingData injectorBindingDataMock3 = mock(InjectorBindingData.class);
        InjectorBindingData injectorBindingDataMock4 = mock(InjectorBindingData.class);
        InjectorBindingData injectorBindingDataMock5 = mock(InjectorBindingData.class);
        InjectorBindingData injectorBindingDataMock6 = mock(InjectorBindingData.class);
        InjectorBindingData injectorBindingDataMock7 = mock(InjectorBindingData.class);
        InjectorBindingData injectorBindingDataMock8 = mock(InjectorBindingData.class);
        InjectorBindingData injectorBindingDataMock9 = mock(InjectorBindingData.class);
        InjectorBindingData injectorBindingDataMock10 = mock(InjectorBindingData.class);
        Matcher<Object> matcherMock = mock(Matcher.class);
        Matcher<Class> matcherMock2 = mock(Matcher.class);
        try (MockedStatic<Matchers> matchers = mockStatic(Matchers.class, CALLS_REAL_METHODS)) {
            doNothing().when(injectorBindingDataMock).addConverter((TypeConverterBinding) any());
            doNothing().when(injectorBindingDataMock2).addConverter((TypeConverterBinding) any());
            doNothing().when(injectorBindingDataMock3).addConverter((TypeConverterBinding) any());
            doNothing().when(injectorBindingDataMock4).addConverter((TypeConverterBinding) any());
            doNothing().when(injectorBindingDataMock5).addConverter((TypeConverterBinding) any());
            doNothing().when(injectorBindingDataMock6).addConverter((TypeConverterBinding) any());
            doNothing().when(injectorBindingDataMock7).addConverter((TypeConverterBinding) any());
            doNothing().when(injectorBindingDataMock8).addConverter((TypeConverterBinding) any());
            doNothing().when(injectorBindingDataMock9).addConverter((TypeConverterBinding) any());
            doReturn(injectorBindingDataMock, injectorBindingDataMock2, injectorBindingDataMock3, injectorBindingDataMock4, injectorBindingDataMock5, injectorBindingDataMock6, injectorBindingDataMock7, injectorBindingDataMock8, injectorBindingDataMock9, injectorBindingDataMock10).when(injectorMock2).getBindingData();
            doNothing().when(injectorBindingDataMock10).addConverter((TypeConverterBinding) any());
            matchers.when(() -> Matchers.identicalTo(Character.class)).thenReturn(matcherMock);
            matchers.when(() -> Matchers.subclassesOf(Enum.class)).thenReturn(matcherMock2);
            //Act Statement(s)
            TypeConverterBindingProcessor.prepareBuiltInConverters(injectorMock2);
            //Assert statement(s)
            verify(injectorMock2, times(10)).getBindingData();
            verify(injectorBindingDataMock, atLeast(1)).addConverter((TypeConverterBinding) any());
            verify(injectorBindingDataMock2, atLeast(1)).addConverter((TypeConverterBinding) any());
            verify(injectorBindingDataMock3, atLeast(1)).addConverter((TypeConverterBinding) any());
            verify(injectorBindingDataMock4, atLeast(1)).addConverter((TypeConverterBinding) any());
            verify(injectorBindingDataMock5, atLeast(1)).addConverter((TypeConverterBinding) any());
            verify(injectorBindingDataMock6, atLeast(1)).addConverter((TypeConverterBinding) any());
            verify(injectorBindingDataMock7, atLeast(1)).addConverter((TypeConverterBinding) any());
            verify(injectorBindingDataMock8, atLeast(1)).addConverter((TypeConverterBinding) any());
            verify(injectorBindingDataMock9, atLeast(1)).addConverter((TypeConverterBinding) any());
            verify(injectorBindingDataMock10, atLeast(1)).addConverter((TypeConverterBinding) any());
            matchers.verify(() -> Matchers.identicalTo(Character.class), atLeast(1));
            matchers.verify(() -> Matchers.subclassesOf(Enum.class), atLeast(1));
        }
    }

    //Sapient generated method id: ${51c82482-1f91-3d28-927a-be9a8121f608}, hash: 91A5508C4124E2B854794654C4A91BC2
    @Test()
    public void prepareBuiltInConvertersWhenCaughtNoSuchMethodExceptionThrowsAssertionError() throws NoSuchMethodException, SecurityException {
        /* Branches:
         * (s.length() == 0) : false  #  inside capitalize method
         * (first == capitalized) : false  #  inside capitalize method
         * (catch-exception (NoSuchMethodException)) : true  #  inside convertToPrimitiveType method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        InjectorImpl injectorMock2 = mock(InjectorImpl.class, "void");
        InjectorBindingData injectorBindingDataMock = mock(InjectorBindingData.class);
        InjectorBindingData injectorBindingDataMock2 = mock(InjectorBindingData.class);
        InjectorBindingData injectorBindingDataMock3 = mock(InjectorBindingData.class);
        InjectorBindingData injectorBindingDataMock4 = mock(InjectorBindingData.class);
        InjectorBindingData injectorBindingDataMock5 = mock(InjectorBindingData.class);
        InjectorBindingData injectorBindingDataMock6 = mock(InjectorBindingData.class);
        InjectorBindingData injectorBindingDataMock7 = mock(InjectorBindingData.class);
        Matcher<Object> matcherMock = mock(Matcher.class);
        try (MockedStatic<Matchers> matchers = mockStatic(Matchers.class, CALLS_REAL_METHODS)) {
            doNothing().when(injectorBindingDataMock).addConverter((TypeConverterBinding) any());
            doNothing().when(injectorBindingDataMock2).addConverter((TypeConverterBinding) any());
            doNothing().when(injectorBindingDataMock3).addConverter((TypeConverterBinding) any());
            doNothing().when(injectorBindingDataMock4).addConverter((TypeConverterBinding) any());
            doNothing().when(injectorBindingDataMock5).addConverter((TypeConverterBinding) any());
            doNothing().when(injectorBindingDataMock6).addConverter((TypeConverterBinding) any());
            doReturn(injectorBindingDataMock, injectorBindingDataMock2, injectorBindingDataMock3, injectorBindingDataMock4, injectorBindingDataMock5, injectorBindingDataMock6, injectorBindingDataMock7).when(injectorMock2).getBindingData();
            doNothing().when(injectorBindingDataMock7).addConverter((TypeConverterBinding) any());
            matchers.when(() -> Matchers.identicalTo(Double.class)).thenReturn(matcherMock);
            thrown.expect(AssertionError.class);
            //Act Statement(s)
            TypeConverterBindingProcessor.prepareBuiltInConverters(injectorMock2);
            //Assert statement(s)
            verify(injectorMock2, times(7)).getBindingData();
            verify(injectorBindingDataMock, atLeast(1)).addConverter((TypeConverterBinding) any());
            verify(injectorBindingDataMock2, atLeast(1)).addConverter((TypeConverterBinding) any());
            verify(injectorBindingDataMock3, atLeast(1)).addConverter((TypeConverterBinding) any());
            verify(injectorBindingDataMock4, atLeast(1)).addConverter((TypeConverterBinding) any());
            verify(injectorBindingDataMock5, atLeast(1)).addConverter((TypeConverterBinding) any());
            verify(injectorBindingDataMock6, atLeast(1)).addConverter((TypeConverterBinding) any());
            verify(injectorBindingDataMock7, atLeast(1)).addConverter((TypeConverterBinding) any());
            matchers.verify(() -> Matchers.identicalTo(Double.class), atLeast(1));
        }
    }

    //Sapient generated method id: ${55309d75-df9b-34c4-9f23-f89960e0f65b}, hash: B18D97283FF30EABEA1CD17C20923829
    @Test()
    public void prepareBuiltInConvertersWhenFirstNotEqualsCapitalizedAndCaughtNoSuchMethodExceptionThrowsAssertionError() throws NoSuchMethodException, SecurityException {
        /* Branches:
         * (s.length() == 0) : false  #  inside capitalize method
         * (first == capitalized) : false  #  inside capitalize method
         * (catch-exception (NoSuchMethodException)) : true  #  inside convertToPrimitiveType method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        InjectorImpl injectorMock2 = mock(InjectorImpl.class, "void");
        InjectorBindingData injectorBindingDataMock = mock(InjectorBindingData.class);
        InjectorBindingData injectorBindingDataMock2 = mock(InjectorBindingData.class);
        InjectorBindingData injectorBindingDataMock3 = mock(InjectorBindingData.class);
        Matcher<Object> matcherMock = mock(Matcher.class);
        try (MockedStatic<Matchers> matchers = mockStatic(Matchers.class, CALLS_REAL_METHODS)) {
            doNothing().when(injectorBindingDataMock).addConverter((TypeConverterBinding) any());
            doNothing().when(injectorBindingDataMock2).addConverter((TypeConverterBinding) any());
            doReturn(injectorBindingDataMock, injectorBindingDataMock2, injectorBindingDataMock3).when(injectorMock2).getBindingData();
            doNothing().when(injectorBindingDataMock3).addConverter((TypeConverterBinding) any());
            matchers.when(() -> Matchers.identicalTo(Boolean.class)).thenReturn(matcherMock);
            thrown.expect(AssertionError.class);
            //Act Statement(s)
            TypeConverterBindingProcessor.prepareBuiltInConverters(injectorMock2);
            //Assert statement(s)
            verify(injectorMock2, times(3)).getBindingData();
            verify(injectorBindingDataMock, atLeast(1)).addConverter((TypeConverterBinding) any());
            verify(injectorBindingDataMock2, atLeast(1)).addConverter((TypeConverterBinding) any());
            verify(injectorBindingDataMock3, atLeast(1)).addConverter((TypeConverterBinding) any());
            matchers.verify(() -> Matchers.identicalTo(Boolean.class), atLeast(1));
        }
    }

    //Sapient generated method id: ${0ab3fed6-ee70-3366-b4b3-b4cb06064b3a}, hash: 872A0A030B7B80946F1FDE4148836EFD
    @Test()
    public void prepareBuiltInConvertersWhenSLengthNotEquals0AndFirstNotEqualsCapitalizedAndCaughtNoSuchMethodExcepThrowsAssertionError() throws NoSuchMethodException, SecurityException {
        /* Branches:
         * (s.length() == 0) : false  #  inside capitalize method
         * (first == capitalized) : false  #  inside capitalize method
         * (catch-exception (NoSuchMethodException)) : true  #  inside convertToPrimitiveType method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        InjectorImpl injectorMock2 = mock(InjectorImpl.class, "void");
        InjectorBindingData injectorBindingDataMock = mock(InjectorBindingData.class);
        InjectorBindingData injectorBindingDataMock2 = mock(InjectorBindingData.class);
        InjectorBindingData injectorBindingDataMock3 = mock(InjectorBindingData.class);
        InjectorBindingData injectorBindingDataMock4 = mock(InjectorBindingData.class);
        InjectorBindingData injectorBindingDataMock5 = mock(InjectorBindingData.class);
        Matcher<Object> matcherMock = mock(Matcher.class);
        try (MockedStatic<Matchers> matchers = mockStatic(Matchers.class, CALLS_REAL_METHODS)) {
            doNothing().when(injectorBindingDataMock).addConverter((TypeConverterBinding) any());
            doNothing().when(injectorBindingDataMock2).addConverter((TypeConverterBinding) any());
            doNothing().when(injectorBindingDataMock3).addConverter((TypeConverterBinding) any());
            doNothing().when(injectorBindingDataMock4).addConverter((TypeConverterBinding) any());
            doReturn(injectorBindingDataMock, injectorBindingDataMock2, injectorBindingDataMock3, injectorBindingDataMock4, injectorBindingDataMock5).when(injectorMock2).getBindingData();
            doNothing().when(injectorBindingDataMock5).addConverter((TypeConverterBinding) any());
            matchers.when(() -> Matchers.identicalTo(Short.class)).thenReturn(matcherMock);
            thrown.expect(AssertionError.class);
            //Act Statement(s)
            TypeConverterBindingProcessor.prepareBuiltInConverters(injectorMock2);
            //Assert statement(s)
            verify(injectorMock2, times(5)).getBindingData();
            verify(injectorBindingDataMock, atLeast(1)).addConverter((TypeConverterBinding) any());
            verify(injectorBindingDataMock2, atLeast(1)).addConverter((TypeConverterBinding) any());
            verify(injectorBindingDataMock3, atLeast(1)).addConverter((TypeConverterBinding) any());
            verify(injectorBindingDataMock4, atLeast(1)).addConverter((TypeConverterBinding) any());
            verify(injectorBindingDataMock5, atLeast(1)).addConverter((TypeConverterBinding) any());
            matchers.verify(() -> Matchers.identicalTo(Short.class), atLeast(1));
        }
    }

    //Sapient generated method id: ${857ae7ee-5934-3864-9e26-3402d78c0de1}, hash: E2CA7E60FD79C9961524CD21A19AB052
    @Test()
    public void prepareBuiltInConvertersWhenFirstNotEqualsCapitalizedAndCaughtNoSuchMethodException2ThrowsAssertionError() throws NoSuchMethodException, SecurityException {
        /* Branches:
         * (s.length() == 0) : false  #  inside capitalize method
         * (first == capitalized) : false  #  inside capitalize method
         * (catch-exception (NoSuchMethodException)) : true  #  inside convertToPrimitiveType method
         */
        //Arrange Statement(s)
        InjectorImpl injectorMock2 = mock(InjectorImpl.class, "void");
        InjectorBindingData injectorBindingDataMock = mock(InjectorBindingData.class);
        Matcher<Object> matcherMock = mock(Matcher.class);
        try (MockedStatic<Matchers> matchers = mockStatic(Matchers.class)) {
            doReturn(injectorBindingDataMock).when(injectorMock2).getBindingData();
            doNothing().when(injectorBindingDataMock).addConverter((TypeConverterBinding) any());
            matchers.when(() -> Matchers.identicalTo(Integer.class)).thenReturn(matcherMock);
            thrown.expect(AssertionError.class);
            //Act Statement(s)
            TypeConverterBindingProcessor.prepareBuiltInConverters(injectorMock2);
            //Assert statement(s)
            verify(injectorMock2).getBindingData();
            verify(injectorBindingDataMock).addConverter((TypeConverterBinding) any());
            matchers.verify(() -> Matchers.identicalTo(Integer.class), atLeast(1));
        }
    }

    //Sapient generated method id: ${ec63b8c6-969d-367c-8065-07d9f97aa8fb}, hash: A668424B1C7C4E166496EE94C0869378
    @Test()
    public void prepareBuiltInConvertersWhenFirstNotEqualsCapitalizedAndCaughtNoSuchMethodException3ThrowsAssertionError() throws NoSuchMethodException, SecurityException {
        /* Branches:
         * (s.length() == 0) : false  #  inside capitalize method
         * (first == capitalized) : false  #  inside capitalize method
         * (catch-exception (NoSuchMethodException)) : true  #  inside convertToPrimitiveType method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        InjectorImpl injectorMock2 = mock(InjectorImpl.class, "void");
        InjectorBindingData injectorBindingDataMock = mock(InjectorBindingData.class);
        InjectorBindingData injectorBindingDataMock2 = mock(InjectorBindingData.class);
        InjectorBindingData injectorBindingDataMock3 = mock(InjectorBindingData.class);
        InjectorBindingData injectorBindingDataMock4 = mock(InjectorBindingData.class);
        InjectorBindingData injectorBindingDataMock5 = mock(InjectorBindingData.class);
        InjectorBindingData injectorBindingDataMock6 = mock(InjectorBindingData.class);
        Matcher<Object> matcherMock = mock(Matcher.class);
        try (MockedStatic<Matchers> matchers = mockStatic(Matchers.class, CALLS_REAL_METHODS)) {
            doNothing().when(injectorBindingDataMock).addConverter((TypeConverterBinding) any());
            doNothing().when(injectorBindingDataMock2).addConverter((TypeConverterBinding) any());
            doNothing().when(injectorBindingDataMock3).addConverter((TypeConverterBinding) any());
            doNothing().when(injectorBindingDataMock4).addConverter((TypeConverterBinding) any());
            doNothing().when(injectorBindingDataMock5).addConverter((TypeConverterBinding) any());
            doReturn(injectorBindingDataMock, injectorBindingDataMock2, injectorBindingDataMock3, injectorBindingDataMock4, injectorBindingDataMock5, injectorBindingDataMock6).when(injectorMock2).getBindingData();
            doNothing().when(injectorBindingDataMock6).addConverter((TypeConverterBinding) any());
            matchers.when(() -> Matchers.identicalTo(Float.class)).thenReturn(matcherMock);
            thrown.expect(AssertionError.class);
            //Act Statement(s)
            TypeConverterBindingProcessor.prepareBuiltInConverters(injectorMock2);
            //Assert statement(s)
            verify(injectorMock2, times(6)).getBindingData();
            verify(injectorBindingDataMock, atLeast(1)).addConverter((TypeConverterBinding) any());
            verify(injectorBindingDataMock2, atLeast(1)).addConverter((TypeConverterBinding) any());
            verify(injectorBindingDataMock3, atLeast(1)).addConverter((TypeConverterBinding) any());
            verify(injectorBindingDataMock4, atLeast(1)).addConverter((TypeConverterBinding) any());
            verify(injectorBindingDataMock5, atLeast(1)).addConverter((TypeConverterBinding) any());
            verify(injectorBindingDataMock6, atLeast(1)).addConverter((TypeConverterBinding) any());
            matchers.verify(() -> Matchers.identicalTo(Float.class), atLeast(1));
        }
    }

    //Sapient generated method id: ${a629a0d2-87a5-3215-9bd5-0fe7c5197e3e}, hash: 1FB58F45EF4B815F146DFF44FA92A53C
    @Test()
    public void prepareBuiltInConvertersWhenFirstNotEqualsCapitalizedAndCaughtNoSuchMethodException4ThrowsAssertionError() throws NoSuchMethodException, SecurityException {
        /* Branches:
         * (s.length() == 0) : false  #  inside capitalize method
         * (first == capitalized) : false  #  inside capitalize method
         * (catch-exception (NoSuchMethodException)) : true  #  inside convertToPrimitiveType method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        InjectorImpl injectorMock2 = mock(InjectorImpl.class, "void");
        InjectorBindingData injectorBindingDataMock = mock(InjectorBindingData.class);
        InjectorBindingData injectorBindingDataMock2 = mock(InjectorBindingData.class);
        Matcher<Object> matcherMock = mock(Matcher.class);
        try (MockedStatic<Matchers> matchers = mockStatic(Matchers.class, CALLS_REAL_METHODS)) {
            doNothing().when(injectorBindingDataMock).addConverter((TypeConverterBinding) any());
            doReturn(injectorBindingDataMock, injectorBindingDataMock2).when(injectorMock2).getBindingData();
            doNothing().when(injectorBindingDataMock2).addConverter((TypeConverterBinding) any());
            matchers.when(() -> Matchers.identicalTo(Long.class)).thenReturn(matcherMock);
            thrown.expect(AssertionError.class);
            //Act Statement(s)
            TypeConverterBindingProcessor.prepareBuiltInConverters(injectorMock2);
            //Assert statement(s)
            verify(injectorMock2, times(2)).getBindingData();
            verify(injectorBindingDataMock, atLeast(1)).addConverter((TypeConverterBinding) any());
            verify(injectorBindingDataMock2, atLeast(1)).addConverter((TypeConverterBinding) any());
            matchers.verify(() -> Matchers.identicalTo(Long.class), atLeast(1));
        }
    }

    //Sapient generated method id: ${49868195-2991-38e7-be61-e5f8f61b9092}, hash: 76F7125E1B375D41DDD5CA02CAA1FFDC
    @Test()
    public void prepareBuiltInConvertersWhenFirstNotEqualsCapitalizedAndCaughtNoSuchMethodException5ThrowsAssertionError() throws NoSuchMethodException, SecurityException {
        /* Branches:
         * (s.length() == 0) : false  #  inside capitalize method
         * (first == capitalized) : false  #  inside capitalize method
         * (catch-exception (NoSuchMethodException)) : true  #  inside convertToPrimitiveType method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        InjectorImpl injectorMock2 = mock(InjectorImpl.class, "void");
        InjectorBindingData injectorBindingDataMock = mock(InjectorBindingData.class);
        InjectorBindingData injectorBindingDataMock2 = mock(InjectorBindingData.class);
        InjectorBindingData injectorBindingDataMock3 = mock(InjectorBindingData.class);
        InjectorBindingData injectorBindingDataMock4 = mock(InjectorBindingData.class);
        Matcher<Object> matcherMock = mock(Matcher.class);
        try (MockedStatic<Matchers> matchers = mockStatic(Matchers.class, CALLS_REAL_METHODS)) {
            doNothing().when(injectorBindingDataMock).addConverter((TypeConverterBinding) any());
            doNothing().when(injectorBindingDataMock2).addConverter((TypeConverterBinding) any());
            doNothing().when(injectorBindingDataMock3).addConverter((TypeConverterBinding) any());
            doReturn(injectorBindingDataMock, injectorBindingDataMock2, injectorBindingDataMock3, injectorBindingDataMock4).when(injectorMock2).getBindingData();
            doNothing().when(injectorBindingDataMock4).addConverter((TypeConverterBinding) any());
            matchers.when(() -> Matchers.identicalTo(Byte.class)).thenReturn(matcherMock);
            thrown.expect(AssertionError.class);
            //Act Statement(s)
            TypeConverterBindingProcessor.prepareBuiltInConverters(injectorMock2);
            //Assert statement(s)
            verify(injectorMock2, times(4)).getBindingData();
            verify(injectorBindingDataMock, atLeast(1)).addConverter((TypeConverterBinding) any());
            verify(injectorBindingDataMock2, atLeast(1)).addConverter((TypeConverterBinding) any());
            verify(injectorBindingDataMock3, atLeast(1)).addConverter((TypeConverterBinding) any());
            verify(injectorBindingDataMock4, atLeast(1)).addConverter((TypeConverterBinding) any());
            matchers.verify(() -> Matchers.identicalTo(Byte.class), atLeast(1));
        }
    }

    //Sapient generated method id: ${3aac8d70-6d26-35c3-a38b-c3a6cac3b6bc}, hash: A23529552C282441B32FB4B816EF877C
    @Test()
    public void visit17Test() {
        //Arrange Statement(s)
        Errors errorsMock = mock(Errors.class);
        target = new TypeConverterBindingProcessor(errorsMock);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        InjectorBindingData injectorBindingDataMock = mock(InjectorBindingData.class);
        doReturn(injectorBindingDataMock).when(injectorMock).getBindingData();
        doNothing().when(injectorBindingDataMock).addConverter((TypeConverterBinding) any());
        Object object = new Object();
        Matcher<TypeLiteral<?>> matcherMock = mock(Matcher.class);
        TypeConverter typeConverterMock = mock(TypeConverter.class);
        TypeConverterBinding typeConverterBinding = new TypeConverterBinding(object, matcherMock, typeConverterMock);
        //Act Statement(s)
        Boolean result = target.visit(typeConverterBinding);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
        verify(injectorMock).getBindingData();
        verify(injectorBindingDataMock).addConverter((TypeConverterBinding) any());
    }
}

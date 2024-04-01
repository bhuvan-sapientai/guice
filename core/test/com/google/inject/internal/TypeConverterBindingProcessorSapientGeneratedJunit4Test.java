package com.google.inject.internal;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.mockito.InjectMocks;
import org.junit.After;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import com.google.inject.TypeLiteral;
import org.mockito.MockitoAnnotations;
import com.google.inject.matcher.Matcher;
import com.google.inject.spi.TypeConverter;
import com.google.inject.spi.TypeConverterBinding;

import static org.mockito.Mockito.doNothing;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
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

    //Sapient generated method id: ${3e180b9c-b47e-3dc9-9d83-a6d0fd113ba1}, hash: B751A738D077327A2B5CB43C0EF1E9E0
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
        doNothing().when(injectorBindingDataMock).addConverter((TypeConverterBinding) any());
        InjectorBindingData injectorBindingDataMock2 = mock(InjectorBindingData.class);
        doNothing().when(injectorBindingDataMock2).addConverter((TypeConverterBinding) any());
        InjectorBindingData injectorBindingDataMock3 = mock(InjectorBindingData.class);
        doNothing().when(injectorBindingDataMock3).addConverter((TypeConverterBinding) any());
        InjectorBindingData injectorBindingDataMock4 = mock(InjectorBindingData.class);
        doNothing().when(injectorBindingDataMock4).addConverter((TypeConverterBinding) any());
        InjectorBindingData injectorBindingDataMock5 = mock(InjectorBindingData.class);
        doNothing().when(injectorBindingDataMock5).addConverter((TypeConverterBinding) any());
        InjectorBindingData injectorBindingDataMock6 = mock(InjectorBindingData.class);
        doNothing().when(injectorBindingDataMock6).addConverter((TypeConverterBinding) any());
        InjectorBindingData injectorBindingDataMock7 = mock(InjectorBindingData.class);
        doNothing().when(injectorBindingDataMock7).addConverter((TypeConverterBinding) any());
        InjectorBindingData injectorBindingDataMock8 = mock(InjectorBindingData.class);
        doNothing().when(injectorBindingDataMock8).addConverter((TypeConverterBinding) any());
        InjectorBindingData injectorBindingDataMock9 = mock(InjectorBindingData.class);
        doNothing().when(injectorBindingDataMock9).addConverter((TypeConverterBinding) any());
        InjectorBindingData injectorBindingDataMock10 = mock(InjectorBindingData.class);
        doReturn(injectorBindingDataMock, injectorBindingDataMock2, injectorBindingDataMock3, injectorBindingDataMock4, injectorBindingDataMock5, injectorBindingDataMock6, injectorBindingDataMock7, injectorBindingDataMock8, injectorBindingDataMock9, injectorBindingDataMock10).when(injectorMock2).getBindingData();
        doNothing().when(injectorBindingDataMock10).addConverter((TypeConverterBinding) any());
        //Act Statement(s)
        TypeConverterBindingProcessor.prepareBuiltInConverters(injectorMock2);
        //Assert statement(s)
        verify(injectorMock2, times(10)).getBindingData();
        verify(injectorBindingDataMock).addConverter((TypeConverterBinding) any());
        verify(injectorBindingDataMock2).addConverter((TypeConverterBinding) any());
        verify(injectorBindingDataMock3).addConverter((TypeConverterBinding) any());
        verify(injectorBindingDataMock4).addConverter((TypeConverterBinding) any());
        verify(injectorBindingDataMock5).addConverter((TypeConverterBinding) any());
        verify(injectorBindingDataMock6).addConverter((TypeConverterBinding) any());
        verify(injectorBindingDataMock7).addConverter((TypeConverterBinding) any());
        verify(injectorBindingDataMock8).addConverter((TypeConverterBinding) any());
        verify(injectorBindingDataMock9).addConverter((TypeConverterBinding) any());
        verify(injectorBindingDataMock10).addConverter((TypeConverterBinding) any());
    }

    //Sapient generated method id: ${51c82482-1f91-3d28-927a-be9a8121f608}, hash: 070062B452B37952478CA7F99E03C613
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
        doNothing().when(injectorBindingDataMock).addConverter((TypeConverterBinding) any());
        InjectorBindingData injectorBindingDataMock2 = mock(InjectorBindingData.class);
        doNothing().when(injectorBindingDataMock2).addConverter((TypeConverterBinding) any());
        InjectorBindingData injectorBindingDataMock3 = mock(InjectorBindingData.class);
        doNothing().when(injectorBindingDataMock3).addConverter((TypeConverterBinding) any());
        InjectorBindingData injectorBindingDataMock4 = mock(InjectorBindingData.class);
        doNothing().when(injectorBindingDataMock4).addConverter((TypeConverterBinding) any());
        InjectorBindingData injectorBindingDataMock5 = mock(InjectorBindingData.class);
        doNothing().when(injectorBindingDataMock5).addConverter((TypeConverterBinding) any());
        InjectorBindingData injectorBindingDataMock6 = mock(InjectorBindingData.class);
        doNothing().when(injectorBindingDataMock6).addConverter((TypeConverterBinding) any());
        InjectorBindingData injectorBindingDataMock7 = mock(InjectorBindingData.class);
        doReturn(injectorBindingDataMock, injectorBindingDataMock2, injectorBindingDataMock3, injectorBindingDataMock4, injectorBindingDataMock5, injectorBindingDataMock6, injectorBindingDataMock7).when(injectorMock2).getBindingData();
        doNothing().when(injectorBindingDataMock7).addConverter((TypeConverterBinding) any());
        thrown.expect(AssertionError.class);
        //Act Statement(s)
        TypeConverterBindingProcessor.prepareBuiltInConverters(injectorMock2);
        //Assert statement(s)
        verify(injectorMock2, times(7)).getBindingData();
        verify(injectorBindingDataMock).addConverter((TypeConverterBinding) any());
        verify(injectorBindingDataMock2).addConverter((TypeConverterBinding) any());
        verify(injectorBindingDataMock3).addConverter((TypeConverterBinding) any());
        verify(injectorBindingDataMock4).addConverter((TypeConverterBinding) any());
        verify(injectorBindingDataMock5).addConverter((TypeConverterBinding) any());
        verify(injectorBindingDataMock6).addConverter((TypeConverterBinding) any());
        verify(injectorBindingDataMock7).addConverter((TypeConverterBinding) any());
    }

    //Sapient generated method id: ${55309d75-df9b-34c4-9f23-f89960e0f65b}, hash: 4597FE0449B9DC396ECAC40FAFC4B753
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
        doNothing().when(injectorBindingDataMock).addConverter((TypeConverterBinding) any());
        InjectorBindingData injectorBindingDataMock2 = mock(InjectorBindingData.class);
        doNothing().when(injectorBindingDataMock2).addConverter((TypeConverterBinding) any());
        InjectorBindingData injectorBindingDataMock3 = mock(InjectorBindingData.class);
        doReturn(injectorBindingDataMock, injectorBindingDataMock2, injectorBindingDataMock3).when(injectorMock2).getBindingData();
        doNothing().when(injectorBindingDataMock3).addConverter((TypeConverterBinding) any());
        thrown.expect(AssertionError.class);
        //Act Statement(s)
        TypeConverterBindingProcessor.prepareBuiltInConverters(injectorMock2);
        //Assert statement(s)
        verify(injectorMock2, times(3)).getBindingData();
        verify(injectorBindingDataMock).addConverter((TypeConverterBinding) any());
        verify(injectorBindingDataMock2).addConverter((TypeConverterBinding) any());
        verify(injectorBindingDataMock3).addConverter((TypeConverterBinding) any());
    }

    //Sapient generated method id: ${0ab3fed6-ee70-3366-b4b3-b4cb06064b3a}, hash: D1B8A58616826F68A2C6FCAC59C7035C
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
        doNothing().when(injectorBindingDataMock).addConverter((TypeConverterBinding) any());
        InjectorBindingData injectorBindingDataMock2 = mock(InjectorBindingData.class);
        doNothing().when(injectorBindingDataMock2).addConverter((TypeConverterBinding) any());
        InjectorBindingData injectorBindingDataMock3 = mock(InjectorBindingData.class);
        doNothing().when(injectorBindingDataMock3).addConverter((TypeConverterBinding) any());
        InjectorBindingData injectorBindingDataMock4 = mock(InjectorBindingData.class);
        doNothing().when(injectorBindingDataMock4).addConverter((TypeConverterBinding) any());
        InjectorBindingData injectorBindingDataMock5 = mock(InjectorBindingData.class);
        doReturn(injectorBindingDataMock, injectorBindingDataMock2, injectorBindingDataMock3, injectorBindingDataMock4, injectorBindingDataMock5).when(injectorMock2).getBindingData();
        doNothing().when(injectorBindingDataMock5).addConverter((TypeConverterBinding) any());
        thrown.expect(AssertionError.class);
        //Act Statement(s)
        TypeConverterBindingProcessor.prepareBuiltInConverters(injectorMock2);
        //Assert statement(s)
        verify(injectorMock2, times(5)).getBindingData();
        verify(injectorBindingDataMock).addConverter((TypeConverterBinding) any());
        verify(injectorBindingDataMock2).addConverter((TypeConverterBinding) any());
        verify(injectorBindingDataMock3).addConverter((TypeConverterBinding) any());
        verify(injectorBindingDataMock4).addConverter((TypeConverterBinding) any());
        verify(injectorBindingDataMock5).addConverter((TypeConverterBinding) any());
    }

    //Sapient generated method id: ${857ae7ee-5934-3864-9e26-3402d78c0de1}, hash: 1E6E5DC3542E5D9F8FCF46E4FACFBA7C
    @Test()
    public void prepareBuiltInConvertersWhenFirstNotEqualsCapitalizedAndCaughtNoSuchMethodException2ThrowsAssertionError() throws NoSuchMethodException, SecurityException {
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
        doReturn(injectorBindingDataMock).when(injectorMock2).getBindingData();
        doNothing().when(injectorBindingDataMock).addConverter((TypeConverterBinding) any());
        thrown.expect(AssertionError.class);
        //Act Statement(s)
        TypeConverterBindingProcessor.prepareBuiltInConverters(injectorMock2);
        //Assert statement(s)
        verify(injectorMock2).getBindingData();
        verify(injectorBindingDataMock).addConverter((TypeConverterBinding) any());
    }

    //Sapient generated method id: ${ec63b8c6-969d-367c-8065-07d9f97aa8fb}, hash: 8F45A70BAD954876B61B555426A52F10
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
        doNothing().when(injectorBindingDataMock).addConverter((TypeConverterBinding) any());
        InjectorBindingData injectorBindingDataMock2 = mock(InjectorBindingData.class);
        doNothing().when(injectorBindingDataMock2).addConverter((TypeConverterBinding) any());
        InjectorBindingData injectorBindingDataMock3 = mock(InjectorBindingData.class);
        doNothing().when(injectorBindingDataMock3).addConverter((TypeConverterBinding) any());
        InjectorBindingData injectorBindingDataMock4 = mock(InjectorBindingData.class);
        doNothing().when(injectorBindingDataMock4).addConverter((TypeConverterBinding) any());
        InjectorBindingData injectorBindingDataMock5 = mock(InjectorBindingData.class);
        doNothing().when(injectorBindingDataMock5).addConverter((TypeConverterBinding) any());
        InjectorBindingData injectorBindingDataMock6 = mock(InjectorBindingData.class);
        doReturn(injectorBindingDataMock, injectorBindingDataMock2, injectorBindingDataMock3, injectorBindingDataMock4, injectorBindingDataMock5, injectorBindingDataMock6).when(injectorMock2).getBindingData();
        doNothing().when(injectorBindingDataMock6).addConverter((TypeConverterBinding) any());
        thrown.expect(AssertionError.class);
        //Act Statement(s)
        TypeConverterBindingProcessor.prepareBuiltInConverters(injectorMock2);
        //Assert statement(s)
        verify(injectorMock2, times(6)).getBindingData();
        verify(injectorBindingDataMock).addConverter((TypeConverterBinding) any());
        verify(injectorBindingDataMock2).addConverter((TypeConverterBinding) any());
        verify(injectorBindingDataMock3).addConverter((TypeConverterBinding) any());
        verify(injectorBindingDataMock4).addConverter((TypeConverterBinding) any());
        verify(injectorBindingDataMock5).addConverter((TypeConverterBinding) any());
        verify(injectorBindingDataMock6).addConverter((TypeConverterBinding) any());
    }

    //Sapient generated method id: ${a629a0d2-87a5-3215-9bd5-0fe7c5197e3e}, hash: 95DE1EDF3306C38EABC220816D4A8F1F
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
        doNothing().when(injectorBindingDataMock).addConverter((TypeConverterBinding) any());
        InjectorBindingData injectorBindingDataMock2 = mock(InjectorBindingData.class);
        doReturn(injectorBindingDataMock, injectorBindingDataMock2).when(injectorMock2).getBindingData();
        doNothing().when(injectorBindingDataMock2).addConverter((TypeConverterBinding) any());
        thrown.expect(AssertionError.class);
        //Act Statement(s)
        TypeConverterBindingProcessor.prepareBuiltInConverters(injectorMock2);
        //Assert statement(s)
        verify(injectorMock2, times(2)).getBindingData();
        verify(injectorBindingDataMock).addConverter((TypeConverterBinding) any());
        verify(injectorBindingDataMock2).addConverter((TypeConverterBinding) any());
    }

    //Sapient generated method id: ${49868195-2991-38e7-be61-e5f8f61b9092}, hash: 4261D297EC7A8F47F3A8A233B4CF3C2F
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
        doNothing().when(injectorBindingDataMock).addConverter((TypeConverterBinding) any());
        InjectorBindingData injectorBindingDataMock2 = mock(InjectorBindingData.class);
        doNothing().when(injectorBindingDataMock2).addConverter((TypeConverterBinding) any());
        InjectorBindingData injectorBindingDataMock3 = mock(InjectorBindingData.class);
        doNothing().when(injectorBindingDataMock3).addConverter((TypeConverterBinding) any());
        InjectorBindingData injectorBindingDataMock4 = mock(InjectorBindingData.class);
        doReturn(injectorBindingDataMock, injectorBindingDataMock2, injectorBindingDataMock3, injectorBindingDataMock4).when(injectorMock2).getBindingData();
        doNothing().when(injectorBindingDataMock4).addConverter((TypeConverterBinding) any());
        thrown.expect(AssertionError.class);
        //Act Statement(s)
        TypeConverterBindingProcessor.prepareBuiltInConverters(injectorMock2);
        //Assert statement(s)
        verify(injectorMock2, times(4)).getBindingData();
        verify(injectorBindingDataMock).addConverter((TypeConverterBinding) any());
        verify(injectorBindingDataMock2).addConverter((TypeConverterBinding) any());
        verify(injectorBindingDataMock3).addConverter((TypeConverterBinding) any());
        verify(injectorBindingDataMock4).addConverter((TypeConverterBinding) any());
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

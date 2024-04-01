package com.google.inject.internal;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.List;

import com.google.inject.ProvisionException;
import com.google.inject.spi.Message;
import com.google.inject.spi.TypeListener;
import com.google.inject.spi.ScopeBinding;

import java.lang.reflect.Member;

import com.google.inject.Injector;
import com.google.inject.spi.InterceptorBinding;

import java.util.HashSet;
import java.util.Map;

import com.google.inject.spi.ElementSource;
import com.google.inject.Binding;

import java.util.ArrayList;

import com.google.common.collect.ImmutableSet;
import com.google.inject.Key;

import java.lang.reflect.Constructor;

import com.google.inject.CreationException;
import com.google.common.collect.ArrayListMultimap;

import java.lang.reflect.Method;
import java.lang.annotation.Annotation;

import com.google.inject.TypeLiteral;

import java.lang.reflect.Field;

import com.google.common.collect.ImmutableList;

import java.lang.reflect.Type;
import java.util.Set;

import com.google.inject.spi.TypeListenerBinding;

import java.util.Formatter;
import java.util.Collection;

import com.google.inject.ConfigurationException;
import org.mockito.MockedStatic;
import com.google.inject.spi.TypeConverterBinding;
import com.google.inject.Scope;

import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

import org.junit.Ignore;

public class ErrorsSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Annotation annotationMock = mock(Annotation.class);

    private final Constructor constructorMock = mock(Constructor.class);

    private final Errors errorsMock = mock(Errors.class);

    private final Key keyMock = mock(Key.class);

    private final Member memberMock = mock(Member.class);

    private final Message messageMock = mock(Message.class);

    private final Method methodMock = mock(Method.class);

    private final TypeConverterBinding typeConverterBindingMock = mock(TypeConverterBinding.class);

    private final TypeLiteral typeLiteralMock = mock(TypeLiteral.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${f416a87d-534a-3292-8e99-5a4e824dbfe4}, hash: 7B66AA7B7ADDE2841919BE4B04F3DBCA
    @Test()
    public void checkNotNullWhenReferenceIsNotNull() {
        /* Branches:
         * (reference != null) : true
         */
        //Arrange Statement(s)
        Object object = new Object();
        //Act Statement(s)
        Object result = Errors.checkNotNull(object, "name1");
        //Assert statement(s)
        assertThat(result, equalTo(object));
    }

    //Sapient generated method id: ${628b0aab-d2ac-3184-b3b8-584e871e19b2}, hash: C6D3F1BA24FBDBC2D6AD5D078FC9FC1A
    @Test()
    public void checkNotNullWhenReferenceIsNullThrowsConfigurationException() {
        /* Branches:
         * (reference != null) : false
         */
        //Arrange Statement(s)
        thrown.expect(ConfigurationException.class);
        Object object = null;
        //Act Statement(s)
        Errors.checkNotNull(object, "name1");
    }

    //Sapient generated method id: ${17424626-6bc8-3733-9001-e1af0bb052fd}, hash: 65A00E310C9D4E1000CB099533423CDD
    @Test()
    public void checkConfigurationWhenCondition() {
        /* Branches:
         * (condition) : true
         */
        //Arrange Statement(s)
        Object[] objectArray = new Object[]{};
        //Act Statement(s)
        Errors.checkConfiguration(true, "format1", objectArray);
    }

    //Sapient generated method id: ${fd4fafd6-556f-36db-9ab4-ca2140ca0898}, hash: DCAFAC6677C3D599A83E9A4EF5224723
    @Test()
    public void checkConfigurationWhenNotConditionThrowsConfigurationException() {
        /* Branches:
         * (condition) : false
         */
        //Arrange Statement(s)
        thrown.expect(ConfigurationException.class);
        Object[] objectArray = new Object[]{};
        //Act Statement(s)
        Errors.checkConfiguration(false, "format1", objectArray);
    }

    //Sapient generated method id: ${34875e36-9051-3de1-9973-7dea93445815}, hash: 9A63C9D95799DCE5B8E3FD6F2A953F55
    @Test()
    public void withSourceWhenSourceEqualsSourceProviderUNKNOWN_SOURCE() {
        /* Branches:
         * (source == this.source) : false
         * (source == SourceProvider.UNKNOWN_SOURCE) : true
         */
        //Arrange Statement(s)
        Object object = new Object();
        Errors target = new Errors(object);
        //Act Statement(s)
        Errors result = target.withSource("[unknown source]");
        //Assert statement(s)
        assertThat(result, equalTo(target));
    }

    //Sapient generated method id: ${cc5ab6c6-60bd-3bff-a3cc-25e51fb1f650}, hash: 4DA1B89407C859495E841F63E120A33B
    @Test()
    public void withSourceWhenSourceNotEqualsSourceProviderUNKNOWN_SOURCE() {
        /* Branches:
         * (source == this.source) : false
         * (source == SourceProvider.UNKNOWN_SOURCE) : false
         */
        //Arrange Statement(s)
        Object object = new Object();
        Errors target = new Errors(object);
        Object object2 = new Object();
        //Act Statement(s)
        Errors result = target.withSource(object2);
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${afeac3f7-c51f-3400-8902-062fbce28d5d}, hash: 52A3A0F3561E72EC0CB7F6FAAD1BD874
    @Test()
    public void aopDisabledTest() {
        //Arrange Statement(s)
        InterceptorBinding bindingMock = mock(InterceptorBinding.class);
        Object object = new Object();
        doReturn(object).when(bindingMock).getSource();
        Object object2 = new Object();
        Errors target = spy(new Errors(object2));
        Object[] objectArray = new Object[]{object};
        doReturn(errorsMock).when(target).addMessage(ErrorId.AOP_DISABLED, "Binding interceptor is not supported when bytecode generation is disabled. \nInterceptor bound at: %s", objectArray);
        //Act Statement(s)
        Errors result = target.aopDisabled(bindingMock);
        //Assert statement(s)
        assertThat(result, equalTo(errorsMock));
        verify(bindingMock).getSource();
        verify(target).addMessage(ErrorId.AOP_DISABLED, "Binding interceptor is not supported when bytecode generation is disabled. \nInterceptor bound at: %s", objectArray);
    }

    //Sapient generated method id: ${c4422481-b57b-3a4f-a751-41f86c7f09fd}, hash: A3EEDC5AF70C8FC8866F73101B3BF2F4
    @Test()
    public void missingImplementationTest() {
        //Arrange Statement(s)
        Object object = new Object();
        Errors target = spy(new Errors(object));
        Object[] objectArray = new Object[]{keyMock};
        doReturn(errorsMock).when(target).addMessage(ErrorId.MISSING_IMPLEMENTATION, "No implementation for %s was bound.", objectArray);
        //Act Statement(s)
        Errors result = target.missingImplementation(keyMock);
        //Assert statement(s)
        assertThat(result, equalTo(errorsMock));
        verify(target).addMessage(ErrorId.MISSING_IMPLEMENTATION, "No implementation for %s was bound.", objectArray);
    }

    //Sapient generated method id: ${2a9c19cc-4017-3c8e-8a19-361e08bceab8}, hash: 0BC0C0846F8613516B7506AAF6AEB797
    @Ignore()
    @Test()
    public void missingImplementationWithHintWhenESourceNotEqualsSourceProviderUNKNOWN_SOURCE() {
        /* Branches:
         * (e != null) : true  #  inside getSources method
         * (e.source != SourceProvider.UNKNOWN_SOURCE) : true  #  inside getSources method
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class com.google.inject.internal.MissingImplementationError
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Errors target = spy(new Errors(object));
        doReturn(errorsMock).when(target).addMessage((Message) any());
        Key<Object> keyMock = mock(Key.class);
        Injector injectorMock = mock(Injector.class);
        //Act Statement(s)
        Errors result = target.missingImplementationWithHint(keyMock, injectorMock);
        //Assert statement(s)
        assertThat(result, equalTo(errorsMock));
        verify(target).addMessage((Message) any());
    }

    //Sapient generated method id: ${12a87838-d28c-374a-9207-314bf9eab179}, hash: E3351785CFF213CEA8FCDB729BEF3387
    @Test()
    public void jitDisabledTest() {
        //Arrange Statement(s)
        Object object = new Object();
        Errors target = spy(new Errors(object));
        Object[] objectArray = new Object[]{keyMock};
        doReturn(errorsMock).when(target).addMessage(ErrorId.JIT_DISABLED, "Explicit bindings are required and %s is not explicitly bound.", objectArray);
        //Act Statement(s)
        Errors result = target.jitDisabled(keyMock);
        //Assert statement(s)
        assertThat(result, equalTo(errorsMock));
        verify(target).addMessage(ErrorId.JIT_DISABLED, "Explicit bindings are required and %s is not explicitly bound.", objectArray);
    }

    //Sapient generated method id: ${5df379f1-2914-333e-8807-0a63a31bac9a}, hash: 0F1BCABF44A39AC6CCF1BADED5DB2F9F
    @Test()
    public void jitDisabledInParentTest() {
        //Arrange Statement(s)
        Object object = new Object();
        Errors target = spy(new Errors(object));
        Object[] objectArray = new Object[]{keyMock};
        doReturn(errorsMock).when(target).addMessage(ErrorId.JIT_DISABLED_IN_PARENT, "Explicit bindings are required and %s would be bound in a parent injector.\nPlease add an explicit binding for it, either in the child or the parent.", objectArray);
        //Act Statement(s)
        Errors result = target.jitDisabledInParent(keyMock);
        //Assert statement(s)
        assertThat(result, equalTo(errorsMock));
        verify(target).addMessage(ErrorId.JIT_DISABLED_IN_PARENT, "Explicit bindings are required and %s would be bound in a parent injector.\nPlease add an explicit binding for it, either in the child or the parent.", objectArray);
    }

    //Sapient generated method id: ${cd48e9cf-20fc-3fdc-86ca-66fde869fbd7}, hash: 469023EFD7AB95B0F2B0788832943941
    @Test()
    public void atInjectRequiredWhenESourceNotEqualsSourceProviderUNKNOWN_SOURCE() {
        /* Branches:
         * (e != null) : true  #  inside getSources method
         * (e.source != SourceProvider.UNKNOWN_SOURCE) : true  #  inside getSources method
         */
        //Arrange Statement(s)
        Object object = new Object();
        Errors target = spy(new Errors(object));
        doReturn(errorsMock).when(target).addMessage((Message) any());
        //Act Statement(s)
        Errors result = target.atInjectRequired(typeLiteralMock);
        //Assert statement(s)
        assertThat(result, equalTo(errorsMock));
        verify(target).addMessage((Message) any());
    }

    //Sapient generated method id: ${c84739d7-3af5-3c47-8dee-1d772810a435}, hash: D8FC73C6D97F9E5413E4E088CD597644
    @Test()
    public void converterReturnedNullTest() {
        //Arrange Statement(s)
        try (MockedStatic<Messages> messages = mockStatic(Messages.class)) {
            Object object = new Object();
            Object object2 = new Object();
            messages.when(() -> Messages.convert(object2)).thenReturn(object);
            Object object3 = new Object();
            Errors target = spy(new Errors(object3));
            Object[] objectArray = new Object[]{"stringValue1", object, typeLiteralMock, typeConverterBindingMock};
            doReturn(errorsMock).when(target).addMessage(ErrorId.CONVERTER_RETURNED_NULL, "Received null converting '%s' (bound at %s) to %s\n using %s.", objectArray);
            //Act Statement(s)
            Errors result = target.converterReturnedNull("stringValue1", object2, typeLiteralMock, typeConverterBindingMock);
            //Assert statement(s)
            assertThat(result, equalTo(errorsMock));
            messages.verify(() -> Messages.convert(object2), atLeast(1));
            verify(target).addMessage(ErrorId.CONVERTER_RETURNED_NULL, "Received null converting '%s' (bound at %s) to %s\n using %s.", objectArray);
        }
    }

    //Sapient generated method id: ${3fa58d7f-f721-3b1f-b541-9e574d30c748}, hash: F4F6070B42B16C25A8A2A4C484CE02AC
    @Test()
    public void conversionTypeErrorTest() {
        //Arrange Statement(s)
        try (MockedStatic<Messages> messages = mockStatic(Messages.class)) {
            Object object = new Object();
            Object object2 = new Object();
            messages.when(() -> Messages.convert(object2)).thenReturn(object);
            Object object3 = new Object();
            Errors target = spy(new Errors(object3));
            Object object4 = new Object();
            Object[] objectArray = new Object[]{"stringValue1", object, typeLiteralMock, typeConverterBindingMock, object4};
            doReturn(errorsMock).when(target).addMessage(ErrorId.CONVERSION_TYPE_ERROR, "Type mismatch converting '%s' (bound at %s) to %s\n using %s.\n Converter returned %s.", objectArray);
            //Act Statement(s)
            Errors result = target.conversionTypeError("stringValue1", object2, typeLiteralMock, typeConverterBindingMock, object4);
            //Assert statement(s)
            assertThat(result, equalTo(errorsMock));
            messages.verify(() -> Messages.convert(object2), atLeast(1));
            verify(target).addMessage(ErrorId.CONVERSION_TYPE_ERROR, "Type mismatch converting '%s' (bound at %s) to %s\n using %s.\n Converter returned %s.", objectArray);
        }
    }

    //Sapient generated method id: ${0ea1abf7-9ac0-3b72-8211-7ea92676dfe0}, hash: AE9A5DBA6411911294133B397F5CB436
    @Test()
    public void conversionErrorTest() {
        //Arrange Statement(s)
        try (MockedStatic<Messages> messages = mockStatic(Messages.class)) {
            Object object = new Object();
            Object object2 = new Object();
            messages.when(() -> Messages.convert(object2)).thenReturn(object);
            Object object3 = new Object();
            Errors target = spy(new Errors(object3));
            RuntimeException runtimeException = new RuntimeException();
            Object[] objectArray = new Object[]{"stringValue1", object, typeLiteralMock, typeConverterBindingMock, runtimeException};
            doReturn(errorsMock).when(target).errorInUserCode(runtimeException, "Error converting '%s' (bound at %s) to %s\n using %s.\n Reason: %s", objectArray);
            //Act Statement(s)
            Errors result = target.conversionError("stringValue1", object2, typeLiteralMock, typeConverterBindingMock, runtimeException);
            //Assert statement(s)
            assertThat(result, equalTo(errorsMock));
            messages.verify(() -> Messages.convert(object2), atLeast(1));
            verify(target).errorInUserCode(runtimeException, "Error converting '%s' (bound at %s) to %s\n using %s.\n Reason: %s", objectArray);
        }
    }

    //Sapient generated method id: ${38c8b74d-f824-3a1d-ae96-a05262040a3e}, hash: ABF84BED499476F4ED2884110A9FEB3E
    @Test()
    public void ambiguousTypeConversionTest() {
        //Arrange Statement(s)
        TypeConverterBinding typeConverterBindingMock2 = mock(TypeConverterBinding.class);
        try (MockedStatic<Messages> messages = mockStatic(Messages.class)) {
            Object object = new Object();
            Object object2 = new Object();
            messages.when(() -> Messages.convert(object2)).thenReturn(object);
            Object object3 = new Object();
            Errors target = spy(new Errors(object3));
            Object[] objectArray = new Object[]{"stringValue1", object, typeLiteralMock, typeConverterBindingMock, typeConverterBindingMock2};
            doReturn(errorsMock).when(target).addMessage(ErrorId.AMBIGUOUS_TYPE_CONVERSION, "Multiple converters can convert '%s' (bound at %s) to %s:\n %s and\n %s.\n Please adjust your type converter configuration to avoid overlapping matches.", objectArray);
            //Act Statement(s)
            Errors result = target.ambiguousTypeConversion("stringValue1", object2, typeLiteralMock, typeConverterBindingMock, typeConverterBindingMock2);
            //Assert statement(s)
            assertThat(result, equalTo(errorsMock));
            messages.verify(() -> Messages.convert(object2), atLeast(1));
            verify(target).addMessage(ErrorId.AMBIGUOUS_TYPE_CONVERSION, "Multiple converters can convert '%s' (bound at %s) to %s:\n %s and\n %s.\n Please adjust your type converter configuration to avoid overlapping matches.", objectArray);
        }
    }

    //Sapient generated method id: ${741f4f04-fd56-3d3e-bc39-6752d765426d}, hash: 0F8B1CB3A5C111EE47BBAC73B08BEB60
    @Test()
    public void bindingToProviderTest() {
        //Arrange Statement(s)
        Object object = new Object();
        Errors target = spy(new Errors(object));
        Object[] objectArray = new Object[]{};
        doReturn(errorsMock).when(target).addMessage(ErrorId.BINDING_TO_PROVIDER, "Binding to Provider is not allowed.", objectArray);
        //Act Statement(s)
        Errors result = target.bindingToProvider();
        //Assert statement(s)
        assertThat(result, equalTo(errorsMock));
        verify(target).addMessage(ErrorId.BINDING_TO_PROVIDER, "Binding to Provider is not allowed.", objectArray);
    }

    //Sapient generated method id: ${44134646-edee-3306-a4c6-029b6266cf78}, hash: 646907B352B747BE47E68660A2DA6EA7
    @Test()
    public void notASubtypeTest() {
        //Arrange Statement(s)
        Object object = new Object();
        Errors target = spy(new Errors(object));
        Object[] objectArray = new Object[]{Object.class, Object.class};
        doReturn(errorsMock).when(target).addMessage(ErrorId.NOT_A_SUBTYPE, "%s doesn't extend %s.", objectArray);
        //Act Statement(s)
        Errors result = target.notASubtype(Object.class, Object.class);
        //Assert statement(s)
        assertThat(result, equalTo(errorsMock));
        verify(target).addMessage(ErrorId.NOT_A_SUBTYPE, "%s doesn't extend %s.", objectArray);
    }

    //Sapient generated method id: ${778b8d77-a329-3f29-8f54-17cd4a5ac254}, hash: 5DB07EBF9CF578FD5DCB343AFF4A846A
    @Test()
    public void recursiveImplementationTypeTest() {
        //Arrange Statement(s)
        Object object = new Object();
        Errors target = spy(new Errors(object));
        Object[] objectArray = new Object[]{};
        doReturn(errorsMock).when(target).addMessage(ErrorId.RECURSIVE_IMPLEMENTATION_TYPE, "@ImplementedBy points to the same class it annotates.", objectArray);
        //Act Statement(s)
        Errors result = target.recursiveImplementationType();
        //Assert statement(s)
        assertThat(result, equalTo(errorsMock));
        verify(target).addMessage(ErrorId.RECURSIVE_IMPLEMENTATION_TYPE, "@ImplementedBy points to the same class it annotates.", objectArray);
    }

    //Sapient generated method id: ${3d58b0be-9f05-3425-9a9d-3d86a49eecf5}, hash: 277635C651AE192C8430BA562D5B568A
    @Test()
    public void recursiveProviderTypeTest() {
        //Arrange Statement(s)
        Object object = new Object();
        Errors target = spy(new Errors(object));
        Object[] objectArray = new Object[]{};
        doReturn(errorsMock).when(target).addMessage(ErrorId.RECURSIVE_PROVIDER_TYPE, "@ProvidedBy points to the same class it annotates.", objectArray);
        //Act Statement(s)
        Errors result = target.recursiveProviderType();
        //Assert statement(s)
        assertThat(result, equalTo(errorsMock));
        verify(target).addMessage(ErrorId.RECURSIVE_PROVIDER_TYPE, "@ProvidedBy points to the same class it annotates.", objectArray);
    }

    //Sapient generated method id: ${9da154f2-1f3b-387a-a0ec-b98fc8a5c4a8}, hash: CD56AB4082C267B602940D801BE1E572
    @Test()
    public void missingRuntimeRetentionTest() {
        //Arrange Statement(s)
        try (MockedStatic<Messages> messages = mockStatic(Messages.class)) {
            Object[] objectArray = new Object[]{Annotation.class};
            messages.when(() -> Messages.format("Please annotate %s with @Retention(RUNTIME).", objectArray)).thenReturn("return_of_format1");
            Object object = new Object();
            Errors target = spy(new Errors(object));
            Object[] objectArray2 = new Object[]{};
            doReturn(errorsMock).when(target).addMessage(ErrorId.MISSING_RUNTIME_RETENTION, "return_of_format1", objectArray2);
            //Act Statement(s)
            Errors result = target.missingRuntimeRetention(Annotation.class);
            //Assert statement(s)
            assertThat(result, equalTo(errorsMock));
            messages.verify(() -> Messages.format("Please annotate %s with @Retention(RUNTIME).", objectArray), atLeast(1));
            verify(target).addMessage(ErrorId.MISSING_RUNTIME_RETENTION, "return_of_format1", objectArray2);
        }
    }

    //Sapient generated method id: ${2c3402ec-b06b-3ea7-9ec4-41b3b2188c45}, hash: 5859489F5A2340F9A729FE67EDFDD597
    @Test()
    public void missingScopeAnnotationTest() {
        //Arrange Statement(s)
        try (MockedStatic<Messages> messages = mockStatic(Messages.class)) {
            Object[] objectArray = new Object[]{Annotation.class};
            messages.when(() -> Messages.format("Please annotate %s with @ScopeAnnotation.", objectArray)).thenReturn("return_of_format1");
            Object object = new Object();
            Errors target = spy(new Errors(object));
            Object[] objectArray2 = new Object[]{};
            doReturn(errorsMock).when(target).addMessage(ErrorId.MISSING_SCOPE_ANNOTATION, "return_of_format1", objectArray2);
            //Act Statement(s)
            Errors result = target.missingScopeAnnotation(Annotation.class);
            //Assert statement(s)
            assertThat(result, equalTo(errorsMock));
            messages.verify(() -> Messages.format("Please annotate %s with @ScopeAnnotation.", objectArray), atLeast(1));
            verify(target).addMessage(ErrorId.MISSING_SCOPE_ANNOTATION, "return_of_format1", objectArray2);
        }
    }

    //Sapient generated method id: ${e8003df5-c54d-3a38-9da3-0dcb01ddfce5}, hash: 848643B888CF8A79ADFABE1E0E1918AD
    @Test()
    public void optionalConstructorTest() {
        //Arrange Statement(s)
        Object object = new Object();
        Errors target = spy(new Errors(object));
        Object[] objectArray = new Object[]{constructorMock};
        doReturn(errorsMock).when(target).addMessage(ErrorId.OPTIONAL_CONSTRUCTOR, "%s is annotated @Inject(optional=true), but constructors cannot be optional.", objectArray);
        //Act Statement(s)
        Errors result = target.optionalConstructor(constructorMock);
        //Assert statement(s)
        assertThat(result, equalTo(errorsMock));
        verify(target).addMessage(ErrorId.OPTIONAL_CONSTRUCTOR, "%s is annotated @Inject(optional=true), but constructors cannot be optional.", objectArray);
    }

    //Sapient generated method id: ${969e39fe-38b6-3243-b46e-1862da445e18}, hash: 8607E504BDD914DDC9A738CB5FCA7FD9
    @Test()
    public void cannotBindToGuiceTypeTest() {
        //Arrange Statement(s)
        Object object = new Object();
        Errors target = spy(new Errors(object));
        Object[] objectArray = new Object[]{"simpleName1"};
        doReturn(errorsMock).when(target).addMessage(ErrorId.BINDING_TO_GUICE_TYPE, "Binding to core guice framework type is not allowed: %s.", objectArray);
        //Act Statement(s)
        Errors result = target.cannotBindToGuiceType("simpleName1");
        //Assert statement(s)
        assertThat(result, equalTo(errorsMock));
        verify(target).addMessage(ErrorId.BINDING_TO_GUICE_TYPE, "Binding to core guice framework type is not allowed: %s.", objectArray);
    }

    //Sapient generated method id: ${8a12a1cf-9750-31e3-a090-ce67bdfac3ac}, hash: 6EFA78E9DA3B5C9370466512D022C821
    @Test()
    public void scopeNotFoundWhenESourceNotEqualsSourceProviderUNKNOWN_SOURCE() {
        /* Branches:
         * (e != null) : true  #  inside getSources method
         * (e.source != SourceProvider.UNKNOWN_SOURCE) : true  #  inside getSources method
         */
        //Arrange Statement(s)
        Object object = new Object();
        Errors target = spy(new Errors(object));
        doReturn(errorsMock).when(target).addMessage((Message) any());
        //Act Statement(s)
        Errors result = target.scopeNotFound(Annotation.class);
        //Assert statement(s)
        assertThat(result, equalTo(errorsMock));
        verify(target).addMessage((Message) any());
    }

    //Sapient generated method id: ${b14fb92c-02e3-3417-b862-7f021cef2289}, hash: F6AD1A6C3FCD6FE07445EC4116F96F70
    @Test()
    public void scopeAnnotationOnAbstractTypeTest() {
        //Arrange Statement(s)
        try (MockedStatic<Messages> messages = mockStatic(Messages.class)) {
            Object object = new Object();
            Object object2 = new Object();
            messages.when(() -> Messages.convert(object2)).thenReturn(object);
            Object object3 = new Object();
            Errors target = spy(new Errors(object3));
            Object[] objectArray = new Object[]{Object.class, Annotation.class, object};
            doReturn(errorsMock).when(target).addMessage(ErrorId.SCOPE_ANNOTATION_ON_ABSTRACT_TYPE, "%s is annotated with %s, but scope annotations are not supported for abstract types.\n Bound at %s.", objectArray);
            //Act Statement(s)
            Errors result = target.scopeAnnotationOnAbstractType(Annotation.class, Object.class, object2);
            //Assert statement(s)
            assertThat(result, equalTo(errorsMock));
            messages.verify(() -> Messages.convert(object2), atLeast(1));
            verify(target).addMessage(ErrorId.SCOPE_ANNOTATION_ON_ABSTRACT_TYPE, "%s is annotated with %s, but scope annotations are not supported for abstract types.\n Bound at %s.", objectArray);
        }
    }

    //Sapient generated method id: ${1e95d2b2-5306-3d66-8638-12ba0a0d153c}, hash: 170D2CB5452DCB40CE2FC003F3E2F641
    @Test()
    public void misplacedBindingAnnotationTest() {
        //Arrange Statement(s)
        Object object = new Object();
        Errors target = spy(new Errors(object));
        Object[] objectArray = new Object[]{memberMock, annotationMock};
        doReturn(errorsMock).when(target).addMessage(ErrorId.MISPLACED_BINDING_ANNOTATION, "%s is annotated with %s, but binding annotations should be applied to its parameters instead.", objectArray);
        //Act Statement(s)
        Errors result = target.misplacedBindingAnnotation(memberMock, annotationMock);
        //Assert statement(s)
        assertThat(result, equalTo(errorsMock));
        verify(target).addMessage(ErrorId.MISPLACED_BINDING_ANNOTATION, "%s is annotated with %s, but binding annotations should be applied to its parameters instead.", objectArray);
    }

    //Sapient generated method id: ${1a61cd44-2920-3027-81bd-681d1bcd527d}, hash: FF283D458541417F033B1EC446784310
    @Test()
    public void missingConstructorWhenESourceNotEqualsSourceProviderUNKNOWN_SOURCE() {
        /* Branches:
         * (e != null) : true  #  inside getSources method
         * (e.source != SourceProvider.UNKNOWN_SOURCE) : true  #  inside getSources method
         */
        //Arrange Statement(s)
        Object object = new Object();
        Errors target = spy(new Errors(object));
        doReturn(errorsMock).when(target).addMessage((Message) any());
        //Act Statement(s)
        Errors result = target.missingConstructor(typeLiteralMock);
        //Assert statement(s)
        assertThat(result, equalTo(errorsMock));
        verify(target).addMessage((Message) any());
    }

    //Sapient generated method id: ${89af4506-cfda-39de-b91f-d21994eabe55}, hash: 5050FEE49E47FBBCA34FC50DF9D9F54C
    @Test()
    public void tooManyConstructorsTest() {
        //Arrange Statement(s)
        Object object = new Object();
        Errors target = spy(new Errors(object));
        Object[] objectArray = new Object[]{Object.class, "Injectable classes must have either one (and only one) constructor annotated with @Inject or a zero-argument constructor that is not private."};
        doReturn(errorsMock).when(target).addMessage(ErrorId.TOO_MANY_CONSTRUCTORS, "%s has more than one constructor annotated with @Inject. %s", objectArray);
        //Act Statement(s)
        Errors result = target.tooManyConstructors(Object.class);
        //Assert statement(s)
        assertThat(result, equalTo(errorsMock));
        verify(target).addMessage(ErrorId.TOO_MANY_CONSTRUCTORS, "%s has more than one constructor annotated with @Inject. %s", objectArray);
    }

    //Sapient generated method id: ${6d080a1b-416a-3e5f-9ae1-827a59a2956b}, hash: 4338C1FE94A1D3B7E571132341B92017
    @Test()
    public void constructorNotDefinedByTypeTest() {
        //Arrange Statement(s)
        Object object = new Object();
        Errors target = spy(new Errors(object));
        Object[] objectArray = new Object[]{typeLiteralMock, constructorMock};
        doReturn(errorsMock).when(target).addMessage(ErrorId.CONSTRUCTOR_NOT_DEFINED_BY_TYPE, "%s does not define %s", objectArray);
        //Act Statement(s)
        Errors result = target.constructorNotDefinedByType(constructorMock, typeLiteralMock);
        //Assert statement(s)
        assertThat(result, equalTo(errorsMock));
        verify(target).addMessage(ErrorId.CONSTRUCTOR_NOT_DEFINED_BY_TYPE, "%s does not define %s", objectArray);
    }

    //Sapient generated method id: ${db658d12-5ad8-3b24-90b3-8731fb0d16b9}, hash: F57976C6608FE0545BE7A904CA467768
    @Ignore()
    @Test()
    public void duplicateMapKeyWhenESourceNotEqualsSourceProviderUNKNOWN_SOURCE() {
        /* Branches:
         * (e != null) : true  #  inside getSources method
         * (e.source != SourceProvider.UNKNOWN_SOURCE) : true  #  inside getSources method
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class com.google.inject.internal.DuplicateMapKeyError
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Errors target = spy(new Errors(object));
        doReturn(errorsMock).when(target).addMessage((Message) any());
        Key<Map<Object, Object>> keyMock = mock(Key.class);
        ArrayListMultimap arrayListMultimap = ArrayListMultimap.create();
        //Act Statement(s)
        Errors result = target.duplicateMapKey(keyMock, arrayListMultimap);
        //Assert statement(s)
        assertThat(result, equalTo(errorsMock));
        verify(target).addMessage((Message) any());
    }

    //Sapient generated method id: ${4c9c14ac-00fc-3ae4-93f2-0e4a2ec7dce9}, hash: 9A87703FA47206FCD9A2B36183651A8E
    @Test()
    public void duplicateScopesTest() {
        //Arrange Statement(s)
        ScopeBinding existingMock = mock(ScopeBinding.class);
        Scope scopeMock = mock(Scope.class);
        doReturn(scopeMock).when(existingMock).getScope();
        Object object = new Object();
        doReturn(object).when(existingMock).getSource();
        Object object2 = new Object();
        Errors target = spy(new Errors(object2));
        Scope scopeMock2 = mock(Scope.class);
        Object[] objectArray = new Object[]{scopeMock, Annotation.class, object, scopeMock2};
        doReturn(errorsMock).when(target).addMessage(ErrorId.DUPLICATE_SCOPES, "Scope %s is already bound to %s at %s.\n Cannot bind %s.", objectArray);
        //Act Statement(s)
        Errors result = target.duplicateScopes(existingMock, Annotation.class, scopeMock2);
        //Assert statement(s)
        assertThat(result, equalTo(errorsMock));
        verify(existingMock).getScope();
        verify(existingMock).getSource();
        verify(target).addMessage(ErrorId.DUPLICATE_SCOPES, "Scope %s is already bound to %s at %s.\n Cannot bind %s.", objectArray);
    }

    //Sapient generated method id: ${c01c337a-5056-3ab6-a70e-0f5556a446dd}, hash: F59EB0ED55713273BA888A2D1C152B95
    @Test()
    public void voidProviderMethodTest() {
        //Arrange Statement(s)
        Object object = new Object();
        Errors target = spy(new Errors(object));
        Object[] objectArray = new Object[]{};
        doReturn(errorsMock).when(target).addMessage(ErrorId.VOID_PROVIDER_METHOD, "Provider methods must return a value. Do not return void.", objectArray);
        //Act Statement(s)
        Errors result = target.voidProviderMethod();
        //Assert statement(s)
        assertThat(result, equalTo(errorsMock));
        verify(target).addMessage(ErrorId.VOID_PROVIDER_METHOD, "Provider methods must return a value. Do not return void.", objectArray);
    }

    //Sapient generated method id: ${52d0bc7c-7d2b-3e6e-b458-63043bd7c498}, hash: 21D65D053112ABF84A2552407273285F
    @Test()
    public void missingConstantValuesTest() {
        //Arrange Statement(s)
        Object object = new Object();
        Errors target = spy(new Errors(object));
        Object[] objectArray = new Object[]{};
        doReturn(errorsMock).when(target).addMessage(ErrorId.MISSING_CONSTANT_VALUES, "Missing constant value. Please call to(...).", objectArray);
        //Act Statement(s)
        Errors result = target.missingConstantValues();
        //Assert statement(s)
        assertThat(result, equalTo(errorsMock));
        verify(target).addMessage(ErrorId.MISSING_CONSTANT_VALUES, "Missing constant value. Please call to(...).", objectArray);
    }

    //Sapient generated method id: ${a81520a5-916e-3fa1-abf4-9acaae920bf6}, hash: E04205708685A03049000BBFFFABEDB9
    @Test()
    public void cannotInjectInnerClassTest() {
        //Arrange Statement(s)
        Object object = new Object();
        Errors target = spy(new Errors(object));
        Object[] objectArray = new Object[]{Object.class};
        doReturn(errorsMock).when(target).addMessage(ErrorId.INJECT_INNER_CLASS, "Injecting into inner classes is not supported.  Please use a 'static' class (top-level or nested) instead of %s.", objectArray);
        //Act Statement(s)
        Errors result = target.cannotInjectInnerClass(Object.class);
        //Assert statement(s)
        assertThat(result, equalTo(errorsMock));
        verify(target).addMessage(ErrorId.INJECT_INNER_CLASS, "Injecting into inner classes is not supported.  Please use a 'static' class (top-level or nested) instead of %s.", objectArray);
    }

    //Sapient generated method id: ${e7dc28b8-4b78-3591-b3ea-59f6dc9f8ee9}, hash: 5125CDCA09A0A7E0D0EDB7C05A0E27BD
    @Test()
    public void cannotInjectLocalClassTest() {
        //Arrange Statement(s)
        Object object = new Object();
        Errors target = spy(new Errors(object));
        Object[] objectArray = new Object[]{Object.class};
        doReturn(errorsMock).when(target).addMessage(ErrorId.INJECT_LOCAL_CLASS, "Injecting into local classes is not supported.  Please use a non-local class instead of %s.", objectArray);
        //Act Statement(s)
        Errors result = target.cannotInjectLocalClass(Object.class);
        //Assert statement(s)
        assertThat(result, equalTo(errorsMock));
        verify(target).addMessage(ErrorId.INJECT_LOCAL_CLASS, "Injecting into local classes is not supported.  Please use a non-local class instead of %s.", objectArray);
    }

    //Sapient generated method id: ${d13955b4-8137-3808-9754-df9d4bf07be6}, hash: A7BD915D1435A202E400E7C7440C4D16
    @Test()
    public void duplicateBindingAnnotationsTest() {
        //Arrange Statement(s)
        Object object = new Object();
        Errors target = spy(new Errors(object));
        Object[] objectArray = new Object[]{memberMock, Annotation.class, Annotation.class};
        doReturn(errorsMock).when(target).addMessage(ErrorId.DUPLICATE_BINDING_ANNOTATIONS, "%s has more than one annotation annotated with @BindingAnnotation: %s and %s", objectArray);
        //Act Statement(s)
        Errors result = target.duplicateBindingAnnotations(memberMock, Annotation.class, Annotation.class);
        //Assert statement(s)
        assertThat(result, equalTo(errorsMock));
        verify(target).addMessage(ErrorId.DUPLICATE_BINDING_ANNOTATIONS, "%s has more than one annotation annotated with @BindingAnnotation: %s and %s", objectArray);
    }

    //Sapient generated method id: ${7526feea-3b3a-3ca2-95b1-e55e1827d093}, hash: 2B6E8286C95B3E42EB0EE48443CDA273
    @Test()
    public void staticInjectionOnInterfaceTest() {
        //Arrange Statement(s)
        Object object = new Object();
        Errors target = spy(new Errors(object));
        Object[] objectArray = new Object[]{Object.class};
        doReturn(errorsMock).when(target).addMessage(ErrorId.STATIC_INJECTION_ON_INTERFACE, "%s is an interface, but interfaces have no static injection points.", objectArray);
        //Act Statement(s)
        Errors result = target.staticInjectionOnInterface(Object.class);
        //Assert statement(s)
        assertThat(result, equalTo(errorsMock));
        verify(target).addMessage(ErrorId.STATIC_INJECTION_ON_INTERFACE, "%s is an interface, but interfaces have no static injection points.", objectArray);
    }

    //Sapient generated method id: ${752e145a-95b8-3b0a-891f-db85d13eb344}, hash: DF5B2ED34BE52458F3B68C969CF07012
    @Test()
    public void cannotInjectFinalFieldTest() {
        //Arrange Statement(s)
        Object object = new Object();
        Errors target = spy(new Errors(object));
        Field fieldMock = mock(Field.class);
        Object[] objectArray = new Object[]{fieldMock};
        doReturn(errorsMock).when(target).addMessage(ErrorId.INJECT_FINAL_FIELD, "Injected field %s cannot be final.", objectArray);
        //Act Statement(s)
        Errors result = target.cannotInjectFinalField(fieldMock);
        //Assert statement(s)
        assertThat(result, equalTo(errorsMock));
        verify(target).addMessage(ErrorId.INJECT_FINAL_FIELD, "Injected field %s cannot be final.", objectArray);
    }

    //Sapient generated method id: ${e818a310-0d6c-3a15-b415-0275ed4197e7}, hash: 32AE77377397174CE8B1A0D185D7668E
    @Test()
    public void atTargetIsMissingParameterTest() {
        //Arrange Statement(s)
        Object object = new Object();
        Errors target = spy(new Errors(object));
        Object[] objectArray = new Object[]{annotationMock, "parameterName1", Object.class};
        doReturn(errorsMock).when(target).addMessage(ErrorId.AT_TARGET_IS_MISSING_PARAMETER, "Binding annotation %s must have PARAMETER listed in its @Targets. It was used on constructor parameter %s in %s.", objectArray);
        //Act Statement(s)
        Errors result = target.atTargetIsMissingParameter(annotationMock, "parameterName1", Object.class);
        //Assert statement(s)
        assertThat(result, equalTo(errorsMock));
        verify(target).addMessage(ErrorId.AT_TARGET_IS_MISSING_PARAMETER, "Binding annotation %s must have PARAMETER listed in its @Targets. It was used on constructor parameter %s in %s.", objectArray);
    }

    //Sapient generated method id: ${181df31d-fc21-3bb0-92a2-a6f91af689f1}, hash: 1A51EEA9D82093276586C42D0DD3815F
    @Test()
    public void cannotInjectAbstractMethodTest() {
        //Arrange Statement(s)
        Object object = new Object();
        Errors target = spy(new Errors(object));
        Object[] objectArray = new Object[]{methodMock};
        doReturn(errorsMock).when(target).addMessage(ErrorId.INJECT_ABSTRACT_METHOD, "Injected method %s cannot be abstract.", objectArray);
        //Act Statement(s)
        Errors result = target.cannotInjectAbstractMethod(methodMock);
        //Assert statement(s)
        assertThat(result, equalTo(errorsMock));
        verify(target).addMessage(ErrorId.INJECT_ABSTRACT_METHOD, "Injected method %s cannot be abstract.", objectArray);
    }

    //Sapient generated method id: ${9ff2bffc-563b-3d34-8be9-9cbae2ed2cdb}, hash: ED5783D6A6D05D4E342646AF26B948EC
    @Test()
    public void cannotInjectMethodWithTypeParametersTest() {
        //Arrange Statement(s)
        Object object = new Object();
        Errors target = spy(new Errors(object));
        Object[] objectArray = new Object[]{methodMock};
        doReturn(errorsMock).when(target).addMessage(ErrorId.INJECT_METHOD_WITH_TYPE_PARAMETER, "Injected method %s cannot declare type parameters of its own.", objectArray);
        //Act Statement(s)
        Errors result = target.cannotInjectMethodWithTypeParameters(methodMock);
        //Assert statement(s)
        assertThat(result, equalTo(errorsMock));
        verify(target).addMessage(ErrorId.INJECT_METHOD_WITH_TYPE_PARAMETER, "Injected method %s cannot declare type parameters of its own.", objectArray);
    }

    //Sapient generated method id: ${d274d142-f948-3176-be94-9bef2c1f0842}, hash: 7BE9935C33EEA2FB946FBB45346D8B05
    @Test()
    public void duplicateScopeAnnotationsTest() {
        //Arrange Statement(s)
        Object object = new Object();
        Errors target = spy(new Errors(object));
        Object[] objectArray = new Object[]{Annotation.class, Annotation.class};
        doReturn(errorsMock).when(target).addMessage(ErrorId.DUPLICATE_SCOPE_ANNOTATIONS, "More than one scope annotation was found: %s and %s.", objectArray);
        //Act Statement(s)
        Errors result = target.duplicateScopeAnnotations(Annotation.class, Annotation.class);
        //Assert statement(s)
        assertThat(result, equalTo(errorsMock));
        verify(target).addMessage(ErrorId.DUPLICATE_SCOPE_ANNOTATIONS, "More than one scope annotation was found: %s and %s.", objectArray);
    }

    //Sapient generated method id: ${27ad0fbb-987d-3fcf-aa7b-15a97aa2f331}, hash: 8D9C8AAA2DE4B25FD94725AAEC1FE004
    @Test()
    public void recursiveBindingTest() {
        //Arrange Statement(s)
        Key keyMock2 = mock(Key.class);
        try (MockedStatic<Messages> messages = mockStatic(Messages.class)) {
            Object object = new Object();
            messages.when(() -> Messages.convert(keyMock)).thenReturn(object);
            Object object2 = new Object();
            Errors target = spy(new Errors(object2));
            Object[] objectArray = new Object[]{object};
            doReturn(errorsMock).when(target).addMessage(ErrorId.RECURSIVE_BINDING, "Binding points to itself. Key: %s", objectArray);
            //Act Statement(s)
            Errors result = target.recursiveBinding(keyMock, keyMock2);
            //Assert statement(s)
            assertThat(result, equalTo(errorsMock));
            messages.verify(() -> Messages.convert(keyMock), atLeast(1));
            verify(target).addMessage(ErrorId.RECURSIVE_BINDING, "Binding points to itself. Key: %s", objectArray);
        }
    }

    //Sapient generated method id: ${d08019c2-7b01-3533-8319-0b671e376bdf}, hash: 8D0C70159F9AD50CDD61CD06E16CDA56
    @Test()
    public void bindingAlreadySetWhenESourceNotEqualsSourceProviderUNKNOWN_SOURCE() {
        /* Branches:
         * (e != null) : true  #  inside getSources method
         * (e.source != SourceProvider.UNKNOWN_SOURCE) : true  #  inside getSources method
         */
        //Arrange Statement(s)
        Object object = new Object();
        Errors target = spy(new Errors(object));
        doReturn(errorsMock).when(target).addMessage((Message) any());
        Binding bindingMock = mock(Binding.class);
        Binding bindingMock2 = mock(Binding.class);
        //Act Statement(s)
        Errors result = target.bindingAlreadySet(bindingMock, bindingMock2);
        //Assert statement(s)
        assertThat(result, equalTo(errorsMock));
        verify(target).addMessage((Message) any());
    }

    //Sapient generated method id: ${214e653b-9aba-3a46-92c2-d6a8061e92e1}, hash: E0716BB1AF94444E3C5C4D5376F0B5C1
    @Test()
    public void bindingAlreadySet1Test() {
        //Arrange Statement(s)
        try (MockedStatic<Messages> messages = mockStatic(Messages.class)) {
            Object object = new Object();
            Object object2 = new Object();
            messages.when(() -> Messages.convert(object2)).thenReturn(object);
            Object object3 = new Object();
            Errors target = spy(new Errors(object3));
            Object[] objectArray = new Object[]{keyMock, object};
            doReturn(errorsMock).when(target).addMessage(ErrorId.BINDING_ALREADY_SET, "A binding to %s was already configured at %s.", objectArray);
            //Act Statement(s)
            Errors result = target.bindingAlreadySet(keyMock, object2);
            //Assert statement(s)
            assertThat(result, equalTo(errorsMock));
            messages.verify(() -> Messages.convert(object2), atLeast(1));
            verify(target).addMessage(ErrorId.BINDING_ALREADY_SET, "A binding to %s was already configured at %s.", objectArray);
        }
    }

    //Sapient generated method id: ${616aac5a-a33e-332a-9b10-ed375c782046}, hash: FD4084E0478C91DACCC1CC0EE29B4453
    @Test()
    public void jitBindingAlreadySetTest() {
        //Arrange Statement(s)
        Object object = new Object();
        Errors target = spy(new Errors(object));
        Object[] objectArray = new Object[]{keyMock};
        doReturn(errorsMock).when(target).addMessage(ErrorId.JIT_BINDING_ALREADY_SET, "A just-in-time binding to %s was already configured on a parent injector.", objectArray);
        //Act Statement(s)
        Errors result = target.jitBindingAlreadySet(keyMock);
        //Assert statement(s)
        assertThat(result, equalTo(errorsMock));
        verify(target).addMessage(ErrorId.JIT_BINDING_ALREADY_SET, "A just-in-time binding to %s was already configured on a parent injector.", objectArray);
    }

    //Sapient generated method id: ${709353eb-1695-345a-b1da-102157fa6258}, hash: C95AEE590C5A85403A05C224BBE2C47E
    @Ignore()
    @Test()
    public void childBindingAlreadySetWhenESourceNotEqualsSourceProviderUNKNOWN_SOURCE() {
        /* Branches:
         * (e != null) : true  #  inside getSources method
         * (e.source != SourceProvider.UNKNOWN_SOURCE) : true  #  inside getSources method
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class com.google.inject.internal.ChildBindingAlreadySetError
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Errors target = spy(new Errors(object));
        doReturn(errorsMock).when(target).addMessage((Message) any());
        Set<Object> objectSet = new HashSet<>();
        //Act Statement(s)
        Errors result = target.childBindingAlreadySet(keyMock, objectSet);
        //Assert statement(s)
        assertThat(result, equalTo(errorsMock));
        verify(target).addMessage((Message) any());
    }

    //Sapient generated method id: ${6009d844-3702-3690-8a9e-b3ee6bcf49f9}, hash: FD19A214BC1B890D56058563F67A0B86
    @Test()
    public void errorCheckingDuplicateBindingTest() {
        //Arrange Statement(s)
        try (MockedStatic<Messages> messages = mockStatic(Messages.class)) {
            Object object = new Object();
            Object object2 = new Object();
            messages.when(() -> Messages.convert(object2)).thenReturn(object);
            Object object3 = new Object();
            Errors target = spy(new Errors(object3));
            Throwable throwable = new Throwable();
            Object[] objectArray = new Object[]{keyMock, object, throwable};
            doReturn(errorsMock).when(target).addMessage(ErrorId.OTHER, "A binding to %s was already configured at %s and an error was thrown while checking duplicate bindings.  Error: %s", objectArray);
            //Act Statement(s)
            Errors result = target.errorCheckingDuplicateBinding(keyMock, object2, throwable);
            //Assert statement(s)
            assertThat(result, equalTo(errorsMock));
            messages.verify(() -> Messages.convert(object2), atLeast(1));
            verify(target).addMessage(ErrorId.OTHER, "A binding to %s was already configured at %s and an error was thrown while checking duplicate bindings.  Error: %s", objectArray);
        }
    }

    //Sapient generated method id: ${66f169bc-754f-3970-96f0-377041bd696f}, hash: E2ACD4B897147026CC534F6F1BBD2BFA
    @Ignore()
    @Test()
    public void requestInjectionWithDifferentTypesTest() {
        //Arrange Statement(s)
        Object object = new Object();
        Errors target = spy(new Errors(object));
        Object object2 = new Object();
        TypeLiteral typeLiteralMock2 = mock(TypeLiteral.class);
        Object[] objectArray = new Object[]{"java.lang.Object@662121918", object2, typeLiteralMock, typeLiteralMock2};
        doReturn(errorsMock).when(target).addMessage(ErrorId.REQUEST_INJECTION_WITH_DIFFERENT_TYPES, "Cannot request injection on one instance with two different types. requestInjection was already called for instance %s at %s (with type %s), which is different than type %s.", objectArray);
        Object object3 = new Object();
        //Act Statement(s)
        Errors result = target.requestInjectionWithDifferentTypes(object3, typeLiteralMock, object2, typeLiteralMock2);
        //Assert statement(s)
        assertThat(result, equalTo(errorsMock));
        verify(target).addMessage(ErrorId.REQUEST_INJECTION_WITH_DIFFERENT_TYPES, "Cannot request injection on one instance with two different types. requestInjection was already called for instance %s at %s (with type %s), which is different than type %s.", objectArray);
    }

    //Sapient generated method id: ${db1eed9d-6e2b-38a0-9296-17827b55ac8e}, hash: BCF462374D30F711AB78BF8EF618DF7E
    @Test()
    public void errorNotifyingTypeListenerTest() {
        //Arrange Statement(s)
        TypeListenerBinding listenerMock = mock(TypeListenerBinding.class);
        TypeListener typeListenerMock = mock(TypeListener.class);
        try (MockedStatic<Messages> messages = mockStatic(Messages.class)) {
            doReturn(typeListenerMock).when(listenerMock).getListener();
            Object object = new Object();
            doReturn(object).when(listenerMock).getSource();
            Object object2 = new Object();
            messages.when(() -> Messages.convert(object)).thenReturn(object2);
            Object object3 = new Object();
            Errors target = spy(new Errors(object3));
            Throwable throwable = new Throwable();
            Object[] objectArray = new Object[]{typeListenerMock, object2, typeLiteralMock, throwable};
            doReturn(errorsMock).when(target).errorInUserCode(throwable, "Error notifying TypeListener %s (bound at %s) of %s.\n Reason: %s", objectArray);
            //Act Statement(s)
            Errors result = target.errorNotifyingTypeListener(listenerMock, typeLiteralMock, throwable);
            //Assert statement(s)
            assertThat(result, equalTo(errorsMock));
            verify(listenerMock).getListener();
            verify(listenerMock).getSource();
            messages.verify(() -> Messages.convert(object), atLeast(1));
            verify(target).errorInUserCode(throwable, "Error notifying TypeListener %s (bound at %s) of %s.\n Reason: %s", objectArray);
        }
    }

    //Sapient generated method id: ${41a12b72-8a31-3a71-a815-570e66d888d9}, hash: 5799D2C47ED8AF35B311D24A43BB0301
    @Test()
    public void exposedButNotBoundTest() {
        //Arrange Statement(s)
        Object object = new Object();
        Errors target = spy(new Errors(object));
        Object[] objectArray = new Object[]{keyMock};
        doReturn(errorsMock).when(target).addMessage(ErrorId.EXPOSED_BUT_NOT_BOUND, "Could not expose() %s, it must be explicitly bound.", objectArray);
        //Act Statement(s)
        Errors result = target.exposedButNotBound(keyMock);
        //Assert statement(s)
        assertThat(result, equalTo(errorsMock));
        verify(target).addMessage(ErrorId.EXPOSED_BUT_NOT_BOUND, "Could not expose() %s, it must be explicitly bound.", objectArray);
    }

    //Sapient generated method id: ${45d63db9-4859-36e2-983d-2a25f9b6973e}, hash: EDDFED2F1D104A3191B3296C97EC6C5E
    @Test()
    public void keyNotFullySpecifiedTest() {
        //Arrange Statement(s)
        Object object = new Object();
        Errors target = spy(new Errors(object));
        Object[] objectArray = new Object[]{typeLiteralMock};
        doReturn(errorsMock).when(target).addMessage(ErrorId.KEY_NOT_FULLY_SPECIFIED, "%s cannot be used as a key; It is not fully specified.", objectArray);
        //Act Statement(s)
        Errors result = target.keyNotFullySpecified(typeLiteralMock);
        //Assert statement(s)
        assertThat(result, equalTo(errorsMock));
        verify(target).addMessage(ErrorId.KEY_NOT_FULLY_SPECIFIED, "%s cannot be used as a key; It is not fully specified.", objectArray);
    }

    //Sapient generated method id: ${d9ba4d47-52cd-3a87-99fc-1d3d80783d41}, hash: 3B67E5EAB4B946930D8527A5550DE438
    @Test()
    public void errorEnhancingClassTest() {
        //Arrange Statement(s)
        Object object = new Object();
        Errors target = spy(new Errors(object));
        Throwable throwable = new Throwable();
        Object[] objectArray = new Object[]{Object.class};
        doReturn(errorsMock).when(target).errorInUserCode(throwable, "Unable to method intercept: %s", objectArray);
        //Act Statement(s)
        Errors result = target.errorEnhancingClass(Object.class, throwable);
        //Assert statement(s)
        assertThat(result, equalTo(errorsMock));
        verify(target).errorInUserCode(throwable, "Unable to method intercept: %s", objectArray);
    }

    //Sapient generated method id: ${65b402df-cfcf-3a77-b70a-1e646ac5477b}, hash: BB49621B999AE6B236C3A932A4DC131C
    @Test()
    public void getMessagesFromThrowableWhenThrowableInstanceOfProvisionException() {
        /* Branches:
         * (throwable instanceof ProvisionException) : true
         */
        //Arrange Statement(s)
        ProvisionException provisionExceptionMock = mock(ProvisionException.class);
        Collection<Message> collection = new ArrayList<>();
        doReturn(collection).when(provisionExceptionMock).getErrorMessages();
        //Act Statement(s)
        Collection<Message> result = Errors.getMessagesFromThrowable(provisionExceptionMock);
        //Assert statement(s)
        assertThat(result, equalTo(collection));
        verify(provisionExceptionMock).getErrorMessages();
    }

    //Sapient generated method id: ${39fa141c-7569-37ad-b69a-9a572eda5466}, hash: 2CEC7162378648F45B87321B32EDBA27
    @Test()
    public void getMessagesFromThrowableWhenThrowableInstanceOfConfigurationException() {
        /* Branches:
         * (throwable instanceof ProvisionException) : false
         * (throwable instanceof ConfigurationException) : true
         */
        //Arrange Statement(s)
        ConfigurationException configurationExceptionMock = mock(ConfigurationException.class);
        Collection<Message> collection = new ArrayList<>();
        doReturn(collection).when(configurationExceptionMock).getErrorMessages();
        //Act Statement(s)
        Collection<Message> result = Errors.getMessagesFromThrowable(configurationExceptionMock);
        //Assert statement(s)
        assertThat(result, equalTo(collection));
        verify(configurationExceptionMock).getErrorMessages();
    }

    //Sapient generated method id: ${3d628246-d18d-3cbe-854a-05cf43b4ec12}, hash: D5E210C62D7F01E6869A1501ED4796B0
    @Test()
    public void getMessagesFromThrowableWhenThrowableInstanceOfCreationException() {
        /* Branches:
         * (throwable instanceof ProvisionException) : false
         * (throwable instanceof ConfigurationException) : false
         * (throwable instanceof CreationException) : true
         */
        //Arrange Statement(s)
        CreationException creationExceptionMock = mock(CreationException.class);
        Collection<Message> collection = new ArrayList<>();
        doReturn(collection).when(creationExceptionMock).getErrorMessages();
        //Act Statement(s)
        Collection<Message> result = Errors.getMessagesFromThrowable(creationExceptionMock);
        //Assert statement(s)
        assertThat(result, equalTo(collection));
        verify(creationExceptionMock).getErrorMessages();
    }

    //Sapient generated method id: ${cc428191-0b48-3d42-9800-5a442c15863f}, hash: 6CF6D7F884E449E8A94ABEF386BBDF5F
    @Test()
    public void getMessagesFromThrowableWhenThrowableNotInstanceOfCreationException() {
        /* Branches:
         * (throwable instanceof ProvisionException) : false
         * (throwable instanceof ConfigurationException) : false
         * (throwable instanceof CreationException) : false
         */
        //Arrange Statement(s)
        Throwable throwable = new Throwable();
        //Act Statement(s)
        Collection<Message> result = Errors.getMessagesFromThrowable(throwable);
        ImmutableSet<Message> messageSet = ImmutableSet.of();
        //Assert statement(s)
        assertThat(result, equalTo(messageSet));
    }

    //Sapient generated method id: ${68d021ac-ffc9-3366-bb6c-ecb7d119a64b}, hash: DC3BF6012E95F680263509CA1C58F61C
    @Test()
    public void errorInUserCodeWhenMessagesNotIsEmpty() {
        /* Branches:
         * (!messages.isEmpty()) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Errors> errors = mockStatic(Errors.class)) {
            Collection<Message> collection = new ArrayList<>();
            collection.add(messageMock);
            Throwable throwable = new Throwable();
            errors.when(() -> Errors.getMessagesFromThrowable(throwable)).thenReturn(collection);
            Object object = new Object();
            Errors target = spy(new Errors(object));
            doReturn(errorsMock).when(target).merge(collection);
            Object[] objectArray = new Object[]{};
            //Act Statement(s)
            Errors result = target.errorInUserCode(throwable, "messageFormat1", objectArray);
            //Assert statement(s)
            assertThat(result, equalTo(errorsMock));
            errors.verify(() -> Errors.getMessagesFromThrowable(throwable), atLeast(1));
            verify(target).merge(collection);
        }
    }

    //Sapient generated method id: ${c08cb1b3-44c6-330f-8b4a-ac4c9b3e9092}, hash: A7835B1432817DC000C7DB64315616F9
    @Test()
    public void errorInUserCodeWhenESourceNotEqualsSourceProviderUNKNOWN_SOURCE() {
        /* Branches:
         * (!messages.isEmpty()) : false
         * (e != null) : true  #  inside getSources method
         * (e.source != SourceProvider.UNKNOWN_SOURCE) : true  #  inside getSources method
         */
        //Arrange Statement(s)
        try (MockedStatic<Messages> messages = mockStatic(Messages.class);
             MockedStatic<Errors> errors = mockStatic(Errors.class)) {
            Collection<Message> collection = new ArrayList<>();
            Throwable throwable = new Throwable();
            errors.when(() -> Errors.getMessagesFromThrowable(throwable)).thenReturn(collection);
            Object[] objectArray = new Object[]{};
            messages.when(() -> Messages.create(eq(ErrorId.ERROR_IN_USER_CODE), eq(throwable), (ArrayList) any(), eq("messageFormat1"), eq(objectArray))).thenReturn(messageMock);
            Object object = new Object();
            Errors target = spy(new Errors(object));
            doReturn(errorsMock).when(target).addMessage(messageMock);
            //Act Statement(s)
            Errors result = target.errorInUserCode(throwable, "messageFormat1", objectArray);
            //Assert statement(s)
            assertThat(result, equalTo(target));
            errors.verify(() -> Errors.getMessagesFromThrowable(throwable), atLeast(1));
            messages.verify(() -> Messages.create(eq(ErrorId.ERROR_IN_USER_CODE), eq(throwable), (ArrayList) any(), eq("messageFormat1"), eq(objectArray)));
            verify(target).addMessage(messageMock);
        }
    }

    //Sapient generated method id: ${a5a532ec-d2a7-3248-81cb-e8e54d1cc0ed}, hash: C1F3DC68436ACA333162690568ABA27D
    @Test()
    public void cannotInjectRawProviderTest() {
        //Arrange Statement(s)
        Object object = new Object();
        Errors target = spy(new Errors(object));
        Object[] objectArray = new Object[]{};
        doReturn(errorsMock).when(target).addMessage(ErrorId.INJECT_RAW_PROVIDER, "Cannot inject a Provider that has no type parameter", objectArray);
        //Act Statement(s)
        Errors result = target.cannotInjectRawProvider();
        //Assert statement(s)
        assertThat(result, equalTo(errorsMock));
        verify(target).addMessage(ErrorId.INJECT_RAW_PROVIDER, "Cannot inject a Provider that has no type parameter", objectArray);
    }

    //Sapient generated method id: ${016649a2-26f6-3ade-8577-c2666d9330f2}, hash: 44FFF65125124FDD7C5F1B9D01C5381A
    @Test()
    public void cannotInjectRawMembersInjectorTest() {
        //Arrange Statement(s)
        Object object = new Object();
        Errors target = spy(new Errors(object));
        Object[] objectArray = new Object[]{};
        doReturn(errorsMock).when(target).addMessage(ErrorId.INJECT_RAW_MEMBERS_INJECTOR, "Cannot inject a MembersInjector that has no type parameter", objectArray);
        //Act Statement(s)
        Errors result = target.cannotInjectRawMembersInjector();
        //Assert statement(s)
        assertThat(result, equalTo(errorsMock));
        verify(target).addMessage(ErrorId.INJECT_RAW_MEMBERS_INJECTOR, "Cannot inject a MembersInjector that has no type parameter", objectArray);
    }

    //Sapient generated method id: ${20ede742-3777-3c23-85d7-9b38d317adb8}, hash: A70759E116C141BEF73004CF487A96F7
    @Test()
    public void cannotInjectTypeLiteralOfTest() {
        //Arrange Statement(s)
        Object object = new Object();
        Errors target = spy(new Errors(object));
        Type typeMock = mock(Type.class);
        Object[] objectArray = new Object[]{typeMock};
        doReturn(errorsMock).when(target).addMessage(ErrorId.OTHER, "Cannot inject a TypeLiteral of %s", objectArray);
        //Act Statement(s)
        Errors result = target.cannotInjectTypeLiteralOf(typeMock);
        //Assert statement(s)
        assertThat(result, equalTo(errorsMock));
        verify(target).addMessage(ErrorId.OTHER, "Cannot inject a TypeLiteral of %s", objectArray);
    }

    //Sapient generated method id: ${6271e2ad-592e-305e-918d-4bbb18011877}, hash: 63FFD73F1E84AB5773FA2BB34EC78958
    @Test()
    public void cannotInjectRawTypeLiteralTest() {
        //Arrange Statement(s)
        Object object = new Object();
        Errors target = spy(new Errors(object));
        Object[] objectArray = new Object[]{};
        doReturn(errorsMock).when(target).addMessage(ErrorId.INJECT_RAW_TYPE_LITERAL, "Cannot inject a TypeLiteral that has no type parameter", objectArray);
        //Act Statement(s)
        Errors result = target.cannotInjectRawTypeLiteral();
        //Assert statement(s)
        assertThat(result, equalTo(errorsMock));
        verify(target).addMessage(ErrorId.INJECT_RAW_TYPE_LITERAL, "Cannot inject a TypeLiteral that has no type parameter", objectArray);
    }

    //Sapient generated method id: ${0b274bfe-3934-3697-b981-b6baf6fa4b49}, hash: 1CAD710CFB378E830837F9E548BF3CAC
    @Test()
    public void throwCreationExceptionIfErrorsExistWhenHasErrorsNot() {
        /* Branches:
         * (!hasErrors()) : true
         */
        //Arrange Statement(s)
        Object object = new Object();
        Errors target = spy(new Errors(object));
        doReturn(false).when(target).hasErrors();
        //Act Statement(s)
        target.throwCreationExceptionIfErrorsExist();
        //Assert statement(s)
        verify(target).hasErrors();
    }

    //Sapient generated method id: ${8a16eae3-04d2-35f7-be75-119a51b2ad8e}, hash: 1CF04918724A0C6286F2F6162DE8A393
    @Ignore()
    @Test()
    public void throwCreationExceptionIfErrorsExistWhenHasErrorsThrowsCreationException() {
        /* Branches:
         * (!hasErrors()) : false
         */
        //Arrange Statement(s)
        Object object = new Object();
        Errors target = spy(new Errors(object));
        doReturn(true).when(target).hasErrors();
        List<Message> messageList = new ArrayList<>();
        doReturn(messageList).when(target).getMessages();
        thrown.expect(CreationException.class);
        //Act Statement(s)
        target.throwCreationExceptionIfErrorsExist();
        //Assert statement(s)
        verify(target).hasErrors();
        verify(target).getMessages();
    }

    //Sapient generated method id: ${a8580a8a-dd9a-39cc-b9e1-b4ef35a0e671}, hash: 85D4A7801FA611D81B28271514FEF257
    @Test()
    public void throwConfigurationExceptionIfErrorsExistWhenHasErrorsNot() {
        /* Branches:
         * (!hasErrors()) : true
         */
        //Arrange Statement(s)
        Object object = new Object();
        Errors target = spy(new Errors(object));
        doReturn(false).when(target).hasErrors();
        //Act Statement(s)
        target.throwConfigurationExceptionIfErrorsExist();
        //Assert statement(s)
        verify(target).hasErrors();
    }

    //Sapient generated method id: ${27ace22a-179a-3a05-9a01-ed370fdc2063}, hash: 78226BC26E4895D701063702385D4233
    @Test()
    public void throwConfigurationExceptionIfErrorsExistWhenHasErrorsThrowsConfigurationException() {
        /* Branches:
         * (!hasErrors()) : false
         */
        //Arrange Statement(s)
        Object object = new Object();
        Errors target = spy(new Errors(object));
        doReturn(true).when(target).hasErrors();
        List<Message> messageList = new ArrayList<>();
        doReturn(messageList).when(target).getMessages();
        thrown.expect(ConfigurationException.class);
        //Act Statement(s)
        target.throwConfigurationExceptionIfErrorsExist();
        //Assert statement(s)
        verify(target).hasErrors();
        verify(target).getMessages();
    }

    //Sapient generated method id: ${25fe7b10-8d21-3a87-93d3-ae83d2e04877}, hash: 5AECEB4E321B4FCDC9ECF41D97702C0C
    @Test()
    public void throwProvisionExceptionIfErrorsExistWhenHasErrorsNot() {
        /* Branches:
         * (!hasErrors()) : true
         */
        //Arrange Statement(s)
        Object object = new Object();
        Errors target = spy(new Errors(object));
        doReturn(false).when(target).hasErrors();
        //Act Statement(s)
        target.throwProvisionExceptionIfErrorsExist();
        //Assert statement(s)
        verify(target).hasErrors();
    }

    //Sapient generated method id: ${d9d6aee6-5da1-32f4-b6e1-46b45f4eb54b}, hash: 36C4F612309A6761D5C2FF16690E2C68
    @Ignore()
    @Test()
    public void throwProvisionExceptionIfErrorsExistWhenHasErrorsThrowsProvisionException() {
        /* Branches:
         * (!hasErrors()) : false
         */
        //Arrange Statement(s)
        Object object = new Object();
        Errors target = spy(new Errors(object));
        doReturn(true).when(target).hasErrors();
        List<Message> messageList = new ArrayList<>();
        doReturn(messageList).when(target).getMessages();
        thrown.expect(ProvisionException.class);
        //Act Statement(s)
        target.throwProvisionExceptionIfErrorsExist();
        //Assert statement(s)
        verify(target).hasErrors();
        verify(target).getMessages();
    }

    //Sapient generated method id: ${f656512f-9a0e-38ca-9266-f05e68126e45}, hash: 3E70E6625F653E674A9BBB4B854E28AF
    @Test()
    public void mergeWhenMessagesIsNotEmpty() {
        /* Branches:
         * (e != null) : true  #  inside getSources method
         * (e.source != SourceProvider.UNKNOWN_SOURCE) : true  #  inside getSources method
         * (for-each(messages)) : true
         */
        //Arrange Statement(s)
        Message messageMock2 = mock(Message.class);
        try (MockedStatic<Messages> messages = mockStatic(Messages.class)) {
            messages.when(() -> Messages.mergeSources((ArrayList) any(), eq(messageMock2))).thenReturn(messageMock);
            Object object = new Object();
            Errors target = spy(new Errors(object));
            doReturn(errorsMock).when(target).addMessage(messageMock);
            Collection<Message> collection = new ArrayList<>();
            collection.add(messageMock2);
            //Act Statement(s)
            Errors result = target.merge(collection);
            //Assert statement(s)
            assertThat(result, equalTo(target));
            messages.verify(() -> Messages.mergeSources((ArrayList) any(), eq(messageMock2)));
            verify(target).addMessage(messageMock);
        }
    }

    //Sapient generated method id: ${4ec5de9f-a647-3ec4-a06b-bffa72882f6b}, hash: CA6A646BAA61963565EF8ED69F3970DD
    @Test()
    public void merge1WhenMoreErrorsRootEqualsRoot() {
        /* Branches:
         * (moreErrors.root == root) : true
         */
        //Arrange Statement(s)
        Object object = new Object();
        Errors target = new Errors(object);
        Errors errors = new Errors();
        //Act Statement(s)
        Errors result = target.merge(errors);
        //Assert statement(s)
        assertThat(result, equalTo(target));
    }

    //Sapient generated method id: ${e876de3d-41c8-338f-8f90-1b71d6116f6e}, hash: 0D5D509656873F232060CE9031C6AEA5
    @Test()
    public void merge2Test() {
        //Arrange Statement(s)
        InternalProvisionException ipeMock = mock(InternalProvisionException.class);
        ImmutableList immutableList = ImmutableList.of();
        doReturn(immutableList).when(ipeMock).getErrors();
        Object object = new Object();
        Errors target = spy(new Errors(object));
        doReturn(errorsMock).when(target).merge((ImmutableList) any());
        //Act Statement(s)
        Errors result = target.merge(ipeMock);
        //Assert statement(s)
        assertThat(result, equalTo(target));
        verify(ipeMock).getErrors();
        verify(target).merge((ImmutableList) any());
    }

    //Sapient generated method id: ${ba8e983d-dde3-3556-b925-d794b1e9d5a3}, hash: 87F51DD4ADAEA28A7A024248288613F8
    @Test()
    public void throwIfNewErrorsWhenSizeEqualsExpectedSize() throws ErrorsException {
        /* Branches:
         * (size() == expectedSize) : true
         */
        //Arrange Statement(s)
        Object object = new Object();
        Errors target = spy(new Errors(object));
        doReturn(1).when(target).size();
        //Act Statement(s)
        target.throwIfNewErrors(1);
        //Assert statement(s)
        verify(target).size();
    }

    //Sapient generated method id: ${91a730d4-054c-3601-9558-993c75b50c3c}, hash: E5EF626DD586C5792AEC510B300C5469
    @Ignore()
    @Test()
    public void throwIfNewErrorsWhenSizeNotEqualsExpectedSizeThrowsErrorsException() throws ErrorsException {
        /* Branches:
         * (size() == expectedSize) : false
         */
        //Arrange Statement(s)
        Object object = new Object();
        Errors target = spy(new Errors(object));
        doReturn(1).when(target).size();
        ErrorsException errorsExceptionMock = mock(ErrorsException.class);
        doThrow(errorsExceptionMock).when(target).toException();
        thrown.expect(ErrorsException.class);
        //Act Statement(s)
        target.throwIfNewErrors(2);
        //Assert statement(s)
        verify(target).size();
        verify(target).toException();
    }

    //Sapient generated method id: ${49f05e95-210f-325a-abc6-7f357ad3aca9}, hash: 89DB3DE2DB3EB9F1BCA13499B76171FE
    @Test()
    public void toExceptionTest() {
        //Arrange Statement(s)
        Object object = new Object();
        Errors target = new Errors(object);
        //Act Statement(s)
        ErrorsException result = target.toException();
        //Assert statement(s)
        //TODO: Please implement equals method in ErrorsException for verification of the entire object or you need to adjust respective assertion statements
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${10026af9-c8f2-33e6-987e-8efe1f87fae1}, hash: 6F6B1CB14A57544BE5C796D8B40D652E
    @Ignore()
    @Test()
    public void hasErrorsWhenRootErrorsIsNotNull() {
        /* Branches:
         * (root.errors != null) : true
         */
        //Arrange Statement(s)
        Object object = new Object();
        Errors target = new Errors(object);
        //Act Statement(s)
        boolean result = target.hasErrors();
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
    }

    //Sapient generated method id: ${a4a558d2-57ae-3e0a-bdad-c3a606733dba}, hash: EBEC911D89E52431814AF65402DC2781
    @Test()
    public void hasErrorsWhenRootErrorsIsNull() {
        /* Branches:
         * (root.errors != null) : false
         */
        //Arrange Statement(s)
        Object object = new Object();
        Errors target = new Errors(object);
        //Act Statement(s)
        boolean result = target.hasErrors();
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${bb057be4-9c19-3e7c-a1da-85ca495c1b8b}, hash: 86285A8D8E33678F030490A198503145
    @Test()
    public void addMessageWhenESourceNotEqualsSourceProviderUNKNOWN_SOURCE() {
        /* Branches:
         * (e != null) : true  #  inside getSources method
         * (e.source != SourceProvider.UNKNOWN_SOURCE) : true  #  inside getSources method
         */
        //Arrange Statement(s)
        try (MockedStatic<Messages> messages = mockStatic(Messages.class)) {
            Object[] objectArray = new Object[]{};
            messages.when(() -> Messages.create(eq(ErrorId.OTHER), eq((Throwable) null), (ArrayList) any(), eq("messageFormat1"), eq(objectArray))).thenReturn(messageMock);
            Object object = new Object();
            Errors target = spy(new Errors(object));
            doReturn(errorsMock).when(target).addMessage(messageMock);
            //Act Statement(s)
            Errors result = target.addMessage("messageFormat1", objectArray);
            //Assert statement(s)
            assertThat(result, equalTo(target));
            messages.verify(() -> Messages.create(eq(ErrorId.OTHER), eq((Throwable) null), (ArrayList) any(), eq("messageFormat1"), eq(objectArray)));
            verify(target).addMessage(messageMock);
        }
    }

    //Sapient generated method id: ${5193929b-5b86-3484-afd1-8ae2d24226f1}, hash: 5A6AEA4A38E16DA0D18BF4EA9EE12DFF
    @Test()
    public void addMessage1WhenESourceNotEqualsSourceProviderUNKNOWN_SOURCE() {
        /* Branches:
         * (e != null) : true  #  inside getSources method
         * (e.source != SourceProvider.UNKNOWN_SOURCE) : true  #  inside getSources method
         */
        //Arrange Statement(s)
        try (MockedStatic<Messages> messages = mockStatic(Messages.class)) {
            Object[] objectArray = new Object[]{};
            messages.when(() -> Messages.create(eq(ErrorId.AMBIGUOUS_TYPE_CONVERSION), eq((Throwable) null), (ArrayList) any(), eq("messageFormat1"), eq(objectArray))).thenReturn(messageMock);
            Object object = new Object();
            Errors target = spy(new Errors(object));
            doReturn(errorsMock).when(target).addMessage(messageMock);
            //Act Statement(s)
            Errors result = target.addMessage(ErrorId.AMBIGUOUS_TYPE_CONVERSION, "messageFormat1", objectArray);
            //Assert statement(s)
            assertThat(result, equalTo(target));
            messages.verify(() -> Messages.create(eq(ErrorId.AMBIGUOUS_TYPE_CONVERSION), eq((Throwable) null), (ArrayList) any(), eq("messageFormat1"), eq(objectArray)));
            verify(target).addMessage(messageMock);
        }
    }

    //Sapient generated method id: ${6f8b719f-e187-3c7f-a408-d6c48ae164ae}, hash: 611F1971DAE3CF3E1E66C7BEE38DF8CF
    @Test()
    public void addMessage3WhenRootErrorsIsNull() {
        /* Branches:
         * (root.errors == null) : true
         */
        //Arrange Statement(s)
        Object object = new Object();
        Errors target = new Errors(object);
        //Act Statement(s)
        Errors result = target.addMessage(messageMock);
        //Assert statement(s)
        assertThat(result, equalTo(target));
    }

    //Sapient generated method id: ${d2023724-fb02-31bf-8f56-c852070520c4}, hash: 6136CE712FE894112B10BE4757FDA177
    @Test()
    public void formatTest() {
        //Arrange Statement(s)
        try (MockedStatic<Messages> messages = mockStatic(Messages.class)) {
            Object[] objectArray = new Object[]{};
            messages.when(() -> Messages.format("messageFormat1", objectArray)).thenReturn("return_of_format1");
            //Act Statement(s)
            String result = Errors.format("messageFormat1", objectArray);
            //Assert statement(s)
            assertThat(result, equalTo("return_of_format1"));
            messages.verify(() -> Messages.format("messageFormat1", objectArray), atLeast(1));
        }
    }

    //Sapient generated method id: ${da7e06a5-e7f1-39ca-91ae-84aee54cf97b}, hash: 5C3CE6F004F4C026E8A94B1E98BA6BDE
    @Test()
    public void getMessagesWhenRootErrorsIsNull() {
        /* Branches:
         * (root.errors == null) : true
         */
        //Arrange Statement(s)
        Object object = new Object();
        Errors target = new Errors(object);
        //Act Statement(s)
        List<Message> result = target.getMessages();
        ImmutableList<Message> messageList = ImmutableList.of();
        //Assert statement(s)
        assertThat(result, equalTo(messageList));
    }

    //Sapient generated method id: ${2f347e85-735f-3ce0-8afb-874d407b613a}, hash: 154709A11106D12ECF952D5ECB8EB5D9
    @Test()
    public void getMessagesWhenRootErrorsIsNotNull() {
        /* Branches:
         * (root.errors == null) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: object of type Errors.1
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        Errors target = new Errors(object);
        //Act Statement(s)
        List<Message> result = target.getMessages();
        //Assert statement(s)
        assertThat(result.size(), equalTo(0));
    }

    //Sapient generated method id: ${cb35d346-fafb-3551-8d74-533e982a9bfe}, hash: 565020E4C1DAE397BFAF21A361EF1486
    @Test()
    public void sizeWhenRootErrorsIsNull() {
        /* Branches:
         * (root.errors == null) : true
         */
        //Arrange Statement(s)
        Object object = new Object();
        Errors target = new Errors(object);
        //Act Statement(s)
        int result = target.size();
        //Assert statement(s)
        assertThat(result, equalTo(0));
    }

    //Sapient generated method id: ${5b95feef-3233-3486-bca6-fe9fed523fed}, hash: E7841556C2AFF87974004BD8F6D1B2BB
    @Test()
    public void sizeWhenRootErrorsIsNotNull() {
        /* Branches:
         * (root.errors == null) : false
         */
        //Arrange Statement(s)
        Object object = new Object();
        Errors target = new Errors(object);
        //Act Statement(s)
        int result = target.size();
        //Assert statement(s)
        assertThat(result, equalTo(0));
    }

    //Sapient generated method id: ${bcac3615-eb3e-3c15-88e5-1c9363f33c9d}, hash: 1CCF1F1A88A6F330158874BF7CC79C21
    @Test()
    public void convertTest() {
        //Arrange Statement(s)
        try (MockedStatic<Messages> messages = mockStatic(Messages.class)) {
            Object object = new Object();
            Object object2 = new Object();
            messages.when(() -> Messages.convert(object2)).thenReturn(object);
            //Act Statement(s)
            Object result = Errors.convert(object2);
            //Assert statement(s)
            assertThat(result, equalTo(object));
            messages.verify(() -> Messages.convert(object2), atLeast(1));
        }
    }

    //Sapient generated method id: ${e3567e8f-dc06-372b-ae21-6de4714cfa6e}, hash: 8277FCA387CBF7BE1ED6A3198390A72A
    @Test()
    public void convert1Test() {
        //Arrange Statement(s)
        ElementSource elementSourceMock = mock(ElementSource.class);
        try (MockedStatic<Messages> messages = mockStatic(Messages.class)) {
            Object object = new Object();
            Object object2 = new Object();
            messages.when(() -> Messages.convert(object2, elementSourceMock)).thenReturn(object);
            //Act Statement(s)
            Object result = Errors.convert(object2, elementSourceMock);
            //Assert statement(s)
            assertThat(result, equalTo(object));
            messages.verify(() -> Messages.convert(object2, elementSourceMock), atLeast(1));
        }
    }

    //Sapient generated method id: ${7ac2bf02-0854-3f22-a2b9-60fcbcb98b7f}, hash: 81CEF9C3536D1B039AD5B8D7C024A7E8
    @Test()
    public void formatSourceTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: object of type SourceFormatter
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Formatter formatter = new Formatter();
        Object object = new Object();
        //Act Statement(s)
        Errors.formatSource(formatter, object);
    }
}

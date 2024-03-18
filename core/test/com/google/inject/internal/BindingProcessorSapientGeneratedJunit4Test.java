package com.google.inject.internal;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import com.google.inject.TypeLiteral;
import com.google.inject.spi.PrivateElements;
import com.google.inject.Provider;

import java.util.Set;
import java.util.HashSet;

import com.google.inject.spi.BindingTargetVisitor;
import com.google.inject.Binding;
import com.google.inject.Key;

import static org.mockito.Mockito.doNothing;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;

import org.junit.Ignore;

public class BindingProcessorSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Errors errorsMock = mock(Errors.class, "errors");

    private final ProcessedBindingData processedBindingDataMock = mock(ProcessedBindingData.class, "processedBindingData");

    private final Binding<Object> commandMock = mock(Binding.class);

    private final Errors errorsMock2 = mock(Errors.class);

    private final Initializer initializerMock = mock(Initializer.class);

    private final Key keyMock = mock(Key.class);

    private final TypeLiteral typeLiteralMock = mock(TypeLiteral.class);

    //Sapient generated method id: ${e8054daa-33a6-3374-ae62-f377e25fd4f5}, hash: 36F774473DF39555AFF98558E5AEC898
    @Test()
    public void visit17WhenCommandNotInstanceOfProviderInstanceBinding() {
        /* Branches:
         * (Void.class.equals(rawType)) : true
         * (command instanceof ProviderInstanceBinding) : false
         */
        //Arrange Statement(s)
        doReturn(keyMock).when(commandMock).getKey();
        doReturn(typeLiteralMock).when(keyMock).getTypeLiteral();
        doReturn(Void.class).when(typeLiteralMock).getRawType();
        BindingProcessor target = new BindingProcessor(errorsMock, initializerMock, processedBindingDataMock);
        doReturn(errorsMock2).when(errorsMock).missingConstantValues();
        //Act Statement(s)
        Boolean result = target.visit(commandMock);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
        verify(commandMock).getKey();
        verify(keyMock).getTypeLiteral();
        verify(typeLiteralMock).getRawType();
        verify(errorsMock).missingConstantValues();
    }

    //Sapient generated method id: ${85570228-fd69-3d42-86b7-54fab795f96d}, hash: 3CECC8B4AF4A2D523C758DD6F666465C
    @Test()
    public void visit17WhenRawTypeEqualsProvider() {
        /* Branches:
         * (Void.class.equals(rawType)) : false
         * (rawType == Provider.class) : true
         */
        //Arrange Statement(s)
        doReturn(keyMock).when(commandMock).getKey();
        doReturn(typeLiteralMock).when(keyMock).getTypeLiteral();
        doReturn(Provider.class).when(typeLiteralMock).getRawType();
        BindingProcessor target = new BindingProcessor(errorsMock, initializerMock, processedBindingDataMock);
        doReturn(errorsMock2).when(errorsMock).bindingToProvider();
        //Act Statement(s)
        Boolean result = target.visit(commandMock);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
        verify(commandMock).getKey();
        verify(keyMock).getTypeLiteral();
        verify(typeLiteralMock).getRawType();
        verify(errorsMock).bindingToProvider();
    }

    //Sapient generated method id: ${01be12c5-542e-3606-a788-cfe8aa5812b0}, hash: E87B86BDB692E1199FAEDE2E4EEFDF29
    @Ignore()
    @Test()
    public void visit17WhenRawTypeNotEqualsProvider() {
        /* Branches:
         * (Void.class.equals(rawType)) : false
         * (rawType == Provider.class) : false
         */
        //Arrange Statement(s)
        BindingImpl commandMock = mock(BindingImpl.class);
        doReturn(keyMock).when(commandMock).getKey();
        doReturn(typeLiteralMock).when(keyMock).getTypeLiteral();
        doReturn(java.lang.Object.class).when(typeLiteralMock).getRawType();
        doReturn(false).when(commandMock).acceptTargetVisitor((BindingTargetVisitor) any());
        Errors errors = new Errors();
        BindingProcessor target = new BindingProcessor(errors, initializerMock, processedBindingDataMock);
        //Act Statement(s)
        Boolean result = target.visit((Binding) commandMock);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
        verify(commandMock).getKey();
        verify(keyMock).getTypeLiteral();
        verify(typeLiteralMock).getRawType();
        verify(commandMock).acceptTargetVisitor((BindingTargetVisitor) any());
    }

    //Sapient generated method id: ${61272166-0dfe-334a-8044-e58c49c0d017}, hash: 9FDDE58929DB776574724C129542F767
    @Ignore()
    @Test()
    public void visit18WhenPrivateElementsGetExposedKeysIsNotEmpty() throws Throwable {
        /* Branches:
         * (for-each(privateElements.getExposedKeys())) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class com.google.inject.internal.ExposedBindingImpl
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        PrivateElements privateElementsMock = mock(PrivateElements.class);
        Key<Object> keyMock = mock(Key.class);
        Set<Key<?>> anySet = new HashSet<>();
        anySet.add(keyMock);
        doReturn(anySet).when(privateElementsMock).getExposedKeys();
        Object object = new Object();
        doReturn(object).when(privateElementsMock).getExposedSource(keyMock);
        BindingProcessor target = spy(new BindingProcessor(errorsMock, initializerMock, processedBindingDataMock));
        doNothing().when(processedBindingDataMock).addCreationListener((CreationListener) any());
        doNothing().when(target).putBinding((ExposedBindingImpl) any());
        //Act Statement(s)
        Boolean result = target.visit(privateElementsMock);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
        verify(privateElementsMock).getExposedKeys();
        verify(privateElementsMock).getExposedSource(keyMock);
        verify(processedBindingDataMock).addCreationListener((CreationListener) any());
        verify(target).putBinding((ExposedBindingImpl) any());
    }
}

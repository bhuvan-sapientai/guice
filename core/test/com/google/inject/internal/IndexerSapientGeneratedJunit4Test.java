package com.google.inject.internal;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import com.google.inject.spi.ConstructorBinding;
import com.google.inject.spi.ConvertedConstantBinding;
import com.google.inject.spi.ProviderInstanceBinding;
import jakarta.inject.Provider;
import com.google.inject.Injector;
import com.google.inject.spi.UntargettedBinding;
import com.google.inject.spi.ProviderKeyBinding;
import com.google.inject.spi.ExposedBinding;
import com.google.inject.spi.InstanceBinding;
import com.google.inject.Binding;
import com.google.inject.Key;
import com.google.inject.spi.ProviderBinding;

import java.lang.annotation.Annotation;

import com.google.inject.spi.LinkedKeyBinding;
import com.google.inject.Scope;
import com.google.inject.spi.InjectionPoint;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

import org.junit.Ignore;

public class IndexerSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Injector injectorMock = mock(Injector.class, "injector");

    private final Binding bindingMock = mock(Binding.class);

    private final Key keyMock = mock(Key.class);

    //Sapient generated method id: ${1b0ae768-f1ee-34d6-aa26-ed67c7a436c0}, hash: B5E8D6D0F0B48093F9151E3BFC605777
    @Test()
    public void isIndexableWhenBindingGetKeyGetAnnotationInstanceOfElement() {
        /* Branches:
         * (binding.getKey().getAnnotation() instanceof Element) : true
         */
        //Arrange Statement(s)
        doReturn(keyMock).when(bindingMock).getKey();
        Element elementMock = mock(Element.class);
        doReturn(elementMock).when(keyMock).getAnnotation();
        Indexer target = new Indexer(injectorMock);
        //Act Statement(s)
        boolean result = target.isIndexable(bindingMock);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
        verify(bindingMock).getKey();
        verify(keyMock).getAnnotation();
    }

    //Sapient generated method id: ${64039fa6-ce78-3361-8268-e0d6ee8ebea6}, hash: 9A38459CE68AC8672B8D100C60C3FE8E
    @Test()
    public void isIndexableWhenBindingGetKeyGetAnnotationNotInstanceOfElement() {
        /* Branches:
         * (binding.getKey().getAnnotation() instanceof Element) : false
         */
        //Arrange Statement(s)
        doReturn(keyMock).when(bindingMock).getKey();
        Annotation annotationMock = mock(Annotation.class);
        doReturn(annotationMock).when(keyMock).getAnnotation();
        Indexer target = new Indexer(injectorMock);
        //Act Statement(s)
        boolean result = target.isIndexable(bindingMock);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
        verify(bindingMock).getKey();
        verify(keyMock).getAnnotation();
    }

    //Sapient generated method id: ${3ba0a20b-d2b5-3a50-85d7-1449494cfd43}, hash: D31901AF8CDB7AE711C768A75348FADF
    @Ignore()
    @Test()
    public void visit9Test() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class com.google.inject.internal.Indexer$IndexedBinding
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ConstructorBinding<Object> bindingMock = mock(ConstructorBinding.class);
        InjectionPoint injectionPointMock = mock(InjectionPoint.class);
        doReturn(injectionPointMock).when(bindingMock).getConstructor();
        Indexer target = new Indexer(injectorMock);
        Object object = new Object();
        doReturn(object).when(bindingMock).acceptScopingVisitor(target);
        //Act Statement(s)
        Indexer.IndexedBinding result = target.visit(bindingMock);
        Indexer.IndexedBinding indexerIndexedBinding = new Indexer.IndexedBinding(bindingMock, Indexer.BindingType.CONSTRUCTOR, object, injectionPointMock);
        //Assert statement(s)
        assertThat(result, equalTo(indexerIndexedBinding));
        verify(bindingMock, atLeast(1)).getConstructor();
        verify(bindingMock, atLeast(1)).acceptScopingVisitor(target);
    }

    //Sapient generated method id: ${41dc0abe-cd76-3204-ac8b-8f08f0c7e2cf}, hash: 88DBF222535752473C332C4EDE6C279D
    @Ignore()
    @Test()
    public void visit10Test() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class com.google.inject.internal.Indexer$IndexedBinding
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ConvertedConstantBinding<Object> bindingMock = mock(ConvertedConstantBinding.class);
        Object object = new Object();
        doReturn(object).when(bindingMock).getValue();
        Indexer target = new Indexer(injectorMock);
        Object object2 = new Object();
        doReturn(object2).when(bindingMock).acceptScopingVisitor(target);
        //Act Statement(s)
        Indexer.IndexedBinding result = target.visit(bindingMock);
        Indexer.IndexedBinding indexerIndexedBinding = new Indexer.IndexedBinding(bindingMock, Indexer.BindingType.CONSTANT, object2, object);
        //Assert statement(s)
        assertThat(result, equalTo(indexerIndexedBinding));
        verify(bindingMock, atLeast(1)).getValue();
        verify(bindingMock, atLeast(1)).acceptScopingVisitor(target);
    }

    //Sapient generated method id: ${b928de63-c5b2-34ff-9183-8490fec71b7b}, hash: F454BD720346B966152FB0B4541ED036
    @Ignore()
    @Test()
    public void visit11Test() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class com.google.inject.internal.Indexer$IndexedBinding
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Indexer target = new Indexer(injectorMock);
        ExposedBinding<Object> bindingMock = mock(ExposedBinding.class);
        Object object = new Object();
        doReturn(object).when(bindingMock).acceptScopingVisitor(target);
        //Act Statement(s)
        Indexer.IndexedBinding result = target.visit(bindingMock);
        Indexer.IndexedBinding indexerIndexedBinding = new Indexer.IndexedBinding(bindingMock, Indexer.BindingType.EXPOSED, object, bindingMock);
        //Assert statement(s)
        assertThat(result, equalTo(indexerIndexedBinding));
        verify(bindingMock, atLeast(1)).acceptScopingVisitor(target);
    }

    //Sapient generated method id: ${259a3b13-2b85-30ec-9e4c-7454b90ac355}, hash: 00B003B790D85DFFBADEC3390DA6A340
    @Ignore()
    @Test()
    public void visit12Test() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class com.google.inject.internal.Indexer$IndexedBinding
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        InstanceBinding<Object> bindingMock = mock(InstanceBinding.class);
        Object object = new Object();
        doReturn(object).when(bindingMock).getInstance();
        Indexer target = new Indexer(injectorMock);
        Object object2 = new Object();
        doReturn(object2).when(bindingMock).acceptScopingVisitor(target);
        //Act Statement(s)
        Indexer.IndexedBinding result = target.visit(bindingMock);
        Indexer.IndexedBinding indexerIndexedBinding = new Indexer.IndexedBinding(bindingMock, Indexer.BindingType.INSTANCE, object2, object);
        //Assert statement(s)
        assertThat(result, equalTo(indexerIndexedBinding));
        verify(bindingMock, atLeast(1)).getInstance();
        verify(bindingMock, atLeast(1)).acceptScopingVisitor(target);
    }

    //Sapient generated method id: ${31c6795d-cfba-342a-bce2-39356e29c0f6}, hash: B476F0BF6CA945893052529DCEBDE69D
    @Ignore()
    @Test()
    public void visit13Test() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class com.google.inject.internal.Indexer$IndexedBinding
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        LinkedKeyBinding<Object> bindingMock = mock(LinkedKeyBinding.class);
        Key<Object> keyMock = mock(Key.class);
        doReturn(keyMock).when(bindingMock).getLinkedKey();
        Indexer target = new Indexer(injectorMock);
        Object object = new Object();
        doReturn(object).when(bindingMock).acceptScopingVisitor(target);
        //Act Statement(s)
        Indexer.IndexedBinding result = target.visit(bindingMock);
        Indexer.IndexedBinding indexerIndexedBinding = new Indexer.IndexedBinding(bindingMock, Indexer.BindingType.LINKED_KEY, object, keyMock);
        //Assert statement(s)
        assertThat(result, equalTo(indexerIndexedBinding));
        verify(bindingMock, atLeast(1)).getLinkedKey();
        verify(bindingMock, atLeast(1)).acceptScopingVisitor(target);
    }

    //Sapient generated method id: ${817f26be-6656-3d96-a715-277e6c2127c1}, hash: 835A7BF4A0D3BDA7D781724DE37084D4
    @Test()
    public void visit14Test() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class com.google.inject.internal.Indexer$IndexedBinding
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        //ProviderBinding<Object> bindingMock = mock(ProviderBinding.class);
        //doReturn(keyMock).when(bindingMock).getProvidedKey();
        //Indexer target = new Indexer(injectorMock);
        //Binding bindingMock2 = mock(Binding.class);
        //doReturn(bindingMock2).when(injectorMock).getBinding(keyMock);
        //Object object = new Object();
        //doReturn(object).when(bindingMock).acceptScopingVisitor(target);
        //Act Statement(s)
        //Indexer.IndexedBinding result = target.visit(bindingMock);
        //Indexer.IndexedBinding indexerIndexedBinding = new Indexer.IndexedBinding(bindingMock, Indexer.BindingType.PROVIDED_BY, object, bindingMock2);
        //Assert statement(s)
        //assertThat(result, equalTo(indexerIndexedBinding));
        //verify(bindingMock, atLeast(1)).getProvidedKey();
        //verify(injectorMock).getBinding(keyMock);
        //verify(bindingMock, atLeast(1)).acceptScopingVisitor(target);
    }

    //Sapient generated method id: ${0176dd74-56b3-30d7-9c13-9fce8184aa13}, hash: 91C0D0BE5635276235E0C8C334CB8A75
    @Ignore()
    @Test()
    public void visit15Test() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class com.google.inject.internal.Indexer$IndexedBinding
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ProviderInstanceBinding<Object> bindingMock = mock(ProviderInstanceBinding.class);
        Provider<Object> providerMock = mock(Provider.class);
        doReturn(providerMock).when(bindingMock).getUserSuppliedProvider();
        Indexer target = new Indexer(injectorMock);
        Object object = new Object();
        doReturn(object).when(bindingMock).acceptScopingVisitor(target);
        //Act Statement(s)
        Indexer.IndexedBinding result = target.visit(bindingMock);
        Indexer.IndexedBinding indexerIndexedBinding = new Indexer.IndexedBinding(bindingMock, Indexer.BindingType.PROVIDER_INSTANCE, object, providerMock);
        //Assert statement(s)
        assertThat(result, equalTo(indexerIndexedBinding));
        verify(bindingMock, atLeast(1)).getUserSuppliedProvider();
        verify(bindingMock, atLeast(1)).acceptScopingVisitor(target);
    }

    //Sapient generated method id: ${c9432be0-8ac8-3bdb-ab92-4712b64d21f3}, hash: F70AA28B683DE1A06D975C37ABB96EBA
    @Ignore()
    @Test()
    public void visit16Test() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class com.google.inject.internal.Indexer$IndexedBinding
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ProviderKeyBinding<Object> bindingMock = mock(ProviderKeyBinding.class);
        Key<Provider<Object>> keyMock = mock(Key.class);
        doReturn(keyMock).when(bindingMock).getProviderKey();
        Indexer target = new Indexer(injectorMock);
        Object object = new Object();
        doReturn(object).when(bindingMock).acceptScopingVisitor(target);
        //Act Statement(s)
        Indexer.IndexedBinding result = target.visit(bindingMock);
        Indexer.IndexedBinding indexerIndexedBinding = new Indexer.IndexedBinding(bindingMock, Indexer.BindingType.PROVIDER_KEY, object, keyMock);
        //Assert statement(s)
        assertThat(result, equalTo(indexerIndexedBinding));
        verify(bindingMock, atLeast(1)).getProviderKey();
        verify(bindingMock, atLeast(1)).acceptScopingVisitor(target);
    }

    //Sapient generated method id: ${3aac8d70-6d26-35c3-a38b-c3a6cac3b6bc}, hash: A10F527B05AEB3924879B0812FE73789
    @Ignore()
    @Test()
    public void visit17Test() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class com.google.inject.internal.Indexer$IndexedBinding
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Indexer target = new Indexer(injectorMock);
        UntargettedBinding<Object> bindingMock = mock(UntargettedBinding.class);
        Object object = new Object();
        doReturn(object).when(bindingMock).acceptScopingVisitor(target);
        //Act Statement(s)
        Indexer.IndexedBinding result = target.visit(bindingMock);
        Indexer.IndexedBinding indexerIndexedBinding = new Indexer.IndexedBinding(bindingMock, Indexer.BindingType.UNTARGETTED, object, null);
        //Assert statement(s)
        assertThat(result, equalTo(indexerIndexedBinding));
        verify(bindingMock, atLeast(1)).acceptScopingVisitor(target);
    }

    //Sapient generated method id: ${37f6d440-4d0c-33a3-9b20-8d8726f4913d}, hash: C60A4EE4908635CEBD9450395BBE2D52
    @Test()
    public void visitEagerSingletonTest() {
        //Arrange Statement(s)
        Indexer target = new Indexer(injectorMock);
        //Act Statement(s)
        Object result = target.visitEagerSingleton();
        //Assert statement(s)
        //TODO: Please implement equals method in Object for verification of the entire object or you need to adjust respective assertion statements
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${946d845f-17ea-3c1d-a1f3-2493dc636dc1}, hash: 3885FA601E32055B922EF069BE722F85
    @Test()
    public void visitNoScopingTest() {
        //Arrange Statement(s)
        Indexer target = new Indexer(injectorMock);
        //Act Statement(s)
        Object result = target.visitNoScoping();
        //Assert statement(s)
        //TODO: Please implement equals method in Scope for verification of the entire object or you need to adjust respective assertion statements
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${8682c68b-55b2-3986-9e98-3f3769157704}, hash: F8E8BD83A33711E8B02A812EF1A1017E
    @Test()
    public void visitScopeTest() {
        //Arrange Statement(s)
        Indexer target = new Indexer(injectorMock);
        Scope scopeMock = mock(Scope.class);
        //Act Statement(s)
        Object result = target.visitScope(scopeMock);
        //Assert statement(s)
        assertThat(result, equalTo(scopeMock));
    }

    //Sapient generated method id: ${f4c6867c-fea3-3759-a8f3-7d1df0731b38}, hash: 0904770684DECB8F1639C4C3FE4940C2
    @Test()
    public void visitScopeAnnotationTest() {
        //Arrange Statement(s)
        Indexer target = new Indexer(injectorMock);
        //Act Statement(s)
        Object result = target.visitScopeAnnotation(Annotation.class);
        //Assert statement(s)
        assertThat(result, equalTo(Annotation.class));
    }
}

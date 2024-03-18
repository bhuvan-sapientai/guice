package com.google.inject.spi;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.lang.annotation.Annotation;

import com.google.inject.Scope;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.mock;
import static org.hamcrest.Matchers.is;

public class DefaultBindingScopingVisitorSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    //Sapient generated method id: ${6b3ec4eb-8626-34af-beda-f53d9c472649}, hash: F7AED7929027D616EFBF5E33F52405F6
    @Test()
    public void visitOtherTest() {
        //Arrange Statement(s)
        DefaultBindingScopingVisitor target = new DefaultBindingScopingVisitor();

        //Act Statement(s)
        Object result = target.visitOther();

        //Assert statement(s)
        assertThat(result, is(nullValue()));
    }

    //Sapient generated method id: ${37f6d440-4d0c-33a3-9b20-8d8726f4913d}, hash: A04F952BE292ABA556A9CA7F7635890D
    @Test()
    public void visitEagerSingletonTest() {
        //Arrange Statement(s)
        DefaultBindingScopingVisitor target = new DefaultBindingScopingVisitor();

        //Act Statement(s)
        Object result = target.visitEagerSingleton();

        //Assert statement(s)
        assertThat(result, is(nullValue()));
    }

    //Sapient generated method id: ${8682c68b-55b2-3986-9e98-3f3769157704}, hash: EE9A7027D5825307300BE1FCF087F235
    @Test()
    public void visitScopeTest() {
        //Arrange Statement(s)
        DefaultBindingScopingVisitor target = new DefaultBindingScopingVisitor();
        Scope scopeMock = mock(Scope.class);

        //Act Statement(s)
        Object result = target.visitScope(scopeMock);

        //Assert statement(s)
        assertThat(result, is(nullValue()));
    }

    //Sapient generated method id: ${f4c6867c-fea3-3759-a8f3-7d1df0731b38}, hash: 079A1F63797F163706C6FB363175752B
    @Test()
    public void visitScopeAnnotationTest() {
        //Arrange Statement(s)
        DefaultBindingScopingVisitor target = new DefaultBindingScopingVisitor();

        //Act Statement(s)
        Object result = target.visitScopeAnnotation(Annotation.class);

        //Assert statement(s)
        assertThat(result, is(nullValue()));
    }

    //Sapient generated method id: ${946d845f-17ea-3c1d-a1f3-2493dc636dc1}, hash: 15587EA6F1BB8D9F85456FF06CCE72D9
    @Test()
    public void visitNoScopingTest() {
        //Arrange Statement(s)
        DefaultBindingScopingVisitor target = new DefaultBindingScopingVisitor();

        //Act Statement(s)
        Object result = target.visitNoScoping();

        //Assert statement(s)
        assertThat(result, is(nullValue()));
    }
}

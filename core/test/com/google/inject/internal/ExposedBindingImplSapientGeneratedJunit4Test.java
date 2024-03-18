package com.google.inject.internal;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import com.google.inject.spi.PrivateElements;

import java.util.Set;

import com.google.inject.Injector;
import com.google.inject.spi.BindingTargetVisitor;
import com.google.inject.spi.Dependency;
import com.google.inject.Binder;
import com.google.common.collect.ImmutableSet;
import com.google.inject.Key;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;

import org.junit.Ignore;

public class ExposedBindingImplSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final InjectorImpl injectorImplMock = mock(InjectorImpl.class);

    private final InternalFactory<Object> internalFactoryMock = mock(InternalFactory.class);

    private final Key<Object> keyMock = mock(Key.class);

    private final PrivateElements privateElementsMock = mock(PrivateElements.class);

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${8144240a-8b49-3cdc-8570-b3706c172a53}, hash: 523140439BABC281C820FD1D27849D18
    @Ignore()
    @Test()
    public void acceptTargetVisitorTest() {
        //Arrange Statement(s)
        Object object = new Object();
        ExposedBindingImpl target = new ExposedBindingImpl(injectorImplMock, object, keyMock, internalFactoryMock, privateElementsMock);
        BindingTargetVisitor<Object, Object> visitorMock = mock(BindingTargetVisitor.class);
        Object object2 = new Object();
        doReturn(object2).when(visitorMock).visit(target);
        //Act Statement(s)
        Object result = target.acceptTargetVisitor(visitorMock);
        //Assert statement(s)
        assertThat(result, equalTo(object2));
        verify(visitorMock).visit(target);
    }

    //Sapient generated method id: ${903fef97-987f-323e-a528-d02591a6bcb2}, hash: 7DFF49D3A2CB20B283C17833A83CD4AC
    @Test()
    public void getDependenciesTest() {
        //Arrange Statement(s)
        Object object = new Object();
        ExposedBindingImpl target = new ExposedBindingImpl(injectorImplMock, object, keyMock, internalFactoryMock, privateElementsMock);
        //Act Statement(s)
        Set<Dependency<?>> result = target.getDependencies();
        Key key = Key.get(Injector.class);
        Dependency dependency = Dependency.get(key);
        ImmutableSet<Dependency<?>> anySet = ImmutableSet.of(dependency);
        //Assert statement(s)
        assertThat(result, equalTo(anySet));
    }

    //Sapient generated method id: ${363d3698-f34c-39ad-914f-376a19498023}, hash: 3E86D9612A3C4C9E0348E4798EFEA299
    @Ignore()
    @Test()
    public void toStringTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: object of type MoreObjects.ToStringHelper
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        ExposedBindingImpl target = new ExposedBindingImpl(injectorImplMock, object, keyMock, internalFactoryMock, privateElementsMock);
        //Act Statement(s)
        String result = target.toString();
        //Assert statement(s)
        assertThat(result, equalTo("result1"));
    }

    //Sapient generated method id: ${f7f37a4c-a7b3-393a-9cff-3d97f57aebc6}, hash: BD8FF09D49982CC5B4B39BAD8086BE53
    @Test()
    public void applyToThrowsUnsupportedOperationException() {
        //Arrange Statement(s)
        Object object = new Object();
        ExposedBindingImpl target = new ExposedBindingImpl(injectorImplMock, object, keyMock, internalFactoryMock, privateElementsMock);
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("This element represents a synthetic binding.");
        thrown.expect(UnsupportedOperationException.class);
        thrown.expectMessage(unsupportedOperationException.getMessage());
        Binder binderMock = mock(Binder.class);
        //Act Statement(s)
        target.applyTo(binderMock);
    }
}

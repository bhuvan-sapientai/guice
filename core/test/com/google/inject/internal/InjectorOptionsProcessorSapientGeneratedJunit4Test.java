package com.google.inject.internal;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import com.google.inject.spi.DisableCircularProxiesOption;
import com.google.inject.spi.RequireExactBindingAnnotationsOption;
import com.google.inject.spi.RequireExplicitBindingsOption;
import com.google.inject.spi.RequireAtInjectOnConstructorsOption;
import com.google.inject.Stage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.hamcrest.Matchers.is;

import org.junit.Ignore;

public class InjectorOptionsProcessorSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final Errors errorsMock = mock(Errors.class);

    private final InjectorImpl.InjectorOptions injectorImplInjectorOptionsMock = mock(InjectorImpl.InjectorOptions.class, "TOOL");

    @Rule()
    public ExpectedException thrown = ExpectedException.none();

    //Sapient generated method id: ${3aac8d70-6d26-35c3-a38b-c3a6cac3b6bc}, hash: 13314BC94BAF468CEE8D29997B282CDA
    @Test()
    public void visit17Test() {
        //Arrange Statement(s)
        InjectorOptionsProcessor target = new InjectorOptionsProcessor(errorsMock);
        DisableCircularProxiesOption disableCircularProxiesOptionMock = mock(DisableCircularProxiesOption.class);
        //Act Statement(s)
        Boolean result = target.visit(disableCircularProxiesOptionMock);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
    }

    //Sapient generated method id: ${adb40cd6-6aac-3dd9-a66d-f45be774d602}, hash: 765354F72DFFD2186EF8ECFE2E4F1C02
    @Test()
    public void visit18Test() {
        //Arrange Statement(s)
        InjectorOptionsProcessor target = new InjectorOptionsProcessor(errorsMock);
        RequireExplicitBindingsOption requireExplicitBindingsOptionMock = mock(RequireExplicitBindingsOption.class);
        //Act Statement(s)
        Boolean result = target.visit(requireExplicitBindingsOptionMock);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
    }

    //Sapient generated method id: ${6665edc4-d232-3485-b22b-dccdcbe9861b}, hash: 1F3E85C07753BDA54371FB067F91D7AC
    @Test()
    public void visit19Test() {
        //Arrange Statement(s)
        InjectorOptionsProcessor target = new InjectorOptionsProcessor(errorsMock);
        RequireAtInjectOnConstructorsOption requireAtInjectOnConstructorsOptionMock = mock(RequireAtInjectOnConstructorsOption.class);
        //Act Statement(s)
        Boolean result = target.visit(requireAtInjectOnConstructorsOptionMock);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
    }

    //Sapient generated method id: ${ab5a76a3-e15f-31ee-8886-1ca2a057807b}, hash: ACB5A9FEE7B384538115574F6EEB0C18
    @Test()
    public void visit20Test() {
        //Arrange Statement(s)
        InjectorOptionsProcessor target = new InjectorOptionsProcessor(errorsMock);
        RequireExactBindingAnnotationsOption requireExactBindingAnnotationsOptionMock = mock(RequireExactBindingAnnotationsOption.class);
        //Act Statement(s)
        Boolean result = target.visit(requireExactBindingAnnotationsOptionMock);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
    }

    //Sapient generated method id: ${f874f19e-98d3-30c3-8dd9-aea0284cd545}, hash: A60880413BF6723BAE646F510DAE071C
    @Test()
    public void getOptionsWhenParentOptionsIsNull() {
        /* Branches:
         * (parentOptions == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Errors errors = new Errors();
        InjectorOptionsProcessor target = new InjectorOptionsProcessor(errors);
        InjectorImpl.InjectorOptions injectorImplInjectorOptions = null;
        //Act Statement(s)
        InjectorImpl.InjectorOptions result = target.getOptions(Stage.DEVELOPMENT, injectorImplInjectorOptions);
        //Assert statement(s)
        //TODO: Please implement equals method in InjectorOptions for verification of the entire object or you need to adjust respective assertion statements
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${13a91112-6501-37a6-a81c-0e51d6bfc351}, hash: F3C21A47EFAFCDB27E1DCD15E6DC505F
    @Test()
    public void getOptionsWhenStageNotEqualsParentOptionsStageThrowsIllegalStateException() {
        /* Branches:
         * (parentOptions == null) : false
         * (stage == parentOptions.stage) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Errors errors = new Errors();
        InjectorOptionsProcessor target = new InjectorOptionsProcessor(errors);
        thrown.expect(IllegalStateException.class);
        //Act Statement(s)
        target.getOptions(Stage.DEVELOPMENT, injectorImplInjectorOptionsMock);
    }

    //Sapient generated method id: ${95320061-f666-31dc-9881-9232cd8f827a}, hash: A9FEBAD8F31AC1C544FE28D45D199BDD
    @Ignore()
    @Test()
    public void getOptionsWhenNewInjectorOptionsStageJitDisabledOrParentOptionsJitDisabledDisableCircularProxiesOrParentOptionsDisableC() {
        /* Branches:
         * (parentOptions == null) : false
         * (stage == parentOptions.stage) : true
         * (new InjectorOptions(stage, jitDisabled || parentOptions.jitDisabled, disableCircularProxies || parentOptions.disableCircularProxies, atInjectRequired || parentOptions.atInjectRequired, exactBindingAnnotationsRequired || parentOptions.exactBindingAnnotationsRequired)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Errors errors = new Errors();
        InjectorOptionsProcessor target = new InjectorOptionsProcessor(errors);
        //Act Statement(s)
        InjectorImpl.InjectorOptions result = target.getOptions(Stage.DEVELOPMENT, injectorImplInjectorOptionsMock);
        //Assert statement(s)
        //TODO: Please implement equals method in InjectorOptions for verification of the entire object or you need to adjust respective assertion statements
        assertThat(result, is(notNullValue()));
    }
}

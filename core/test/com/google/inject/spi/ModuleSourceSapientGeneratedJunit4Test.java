package com.google.inject.spi;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.util.List;

import com.google.common.collect.ImmutableList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.hamcrest.Matchers.is;

import org.junit.Ignore;

public class ModuleSourceSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    private final BindingSourceRestriction.PermitMap bindingSourceRestrictionPermitMapMock = mock(BindingSourceRestriction.PermitMap.class, "value1");

    //Sapient generated method id: ${691cf536-b84c-3509-8612-7c4986b1c6f6}, hash: 208F5CD67521F99C5566F049423DA445
    @Test()
    public void createChildTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ModuleSource target = new ModuleSource(Object.class, bindingSourceRestrictionPermitMapMock);
        //Act Statement(s)
        ModuleSource result = target.createChild(Object.class);
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${d135e207-970b-38cd-a568-e565e84fe08c}, hash: 4F2B2EEABA8E5003D38FF18B6046D574
    @Ignore()
    @Test()
    public void getModuleClassNamesWhenCurrentIsNotNull() {
        /* Branches:
         * (current != null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        BindingSourceRestriction.PermitMap bindingSourceRestrictionPermitMapMock = mock(BindingSourceRestriction.PermitMap.class, "true");
        ModuleSource target = new ModuleSource(ModuleSource.class, bindingSourceRestrictionPermitMapMock);
        //Act Statement(s)
        List<String> result = target.getModuleClassNames();
        ImmutableList stringList = ImmutableList.builder().build();
        //Assert statement(s)
        assertThat(result, equalTo(stringList));
    }

    //Sapient generated method id: ${46635190-ed6f-372f-8fe7-39b45c679a75}, hash: 7793863ADCE8F0691F0AE4A3946286E7
    @Test()
    public void sizeWhenParentIsNull() {
        /* Branches:
         * (parent == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ModuleSource target = new ModuleSource(ModuleSource.class, bindingSourceRestrictionPermitMapMock);
        //Act Statement(s)
        int result = target.size();
        //Assert statement(s)
        assertThat(result, equalTo(1));
    }
}

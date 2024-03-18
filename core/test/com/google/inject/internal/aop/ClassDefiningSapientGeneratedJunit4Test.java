package com.google.inject.internal.aop;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.is;

import org.junit.Ignore;

public class ClassDefiningSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    //Sapient generated method id: ${3d0bbb66-c655-3fc9-bcd2-e53aac08c7c7}, hash: 9F98C1C6BD10277987D82CDF2D98F0F9
    @Ignore()
    @Test()
    public void defineTest() throws Exception {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: INSTANCE
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        byte[] byteArray = new byte[]{};
        //Act Statement(s)
        Class<?> result = ClassDefining.define(Object.class, byteArray);
        //Assert statement(s)
        assertThat(result, equalTo(Object.class));
    }

    //Sapient generated method id: ${574eaa68-a42e-3cd3-b082-19045cc65313}, hash: 17CCFAFC240761041066E4569AB2D335
    @Ignore()
    @Test()
    public void hasPackageAccessTest() {
        //Act Statement(s)
        boolean result = ClassDefining.hasPackageAccess();
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${0831b235-7458-34b5-9a55-f4b8beff3df3}, hash: A2C841F27B133D431A80BDC0A8AC2FBF
    @Ignore()
    @Test()
    public void canLoadProxyByNameWhenClassDefinerHolderNotIS_UNSAFE() {
        /* Branches:
         * (!ClassDefinerHolder.IS_UNSAFE) : true
         */
        //Act Statement(s)
        boolean result = ClassDefining.canLoadProxyByName(Object.class);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
    }

    //Sapient generated method id: ${69161f47-b1fc-30ba-81db-d8c2b76472d1}, hash: 8CEFAD4EF9A3BDA3582744E6B55B650C
    @Test()
    public void canDowncastToProxyWhenClassDefinerHolderNotIS_UNSAFE() {
        /* Branches:
         * (!ClassDefinerHolder.IS_UNSAFE) : true
         */
        //Act Statement(s)
        boolean result = ClassDefining.canDowncastToProxy(Object.class);
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
    }

    //Sapient generated method id: ${8f84667f-f4f0-3e82-b3bf-c3b938b78d94}, hash: CB1A4EDB183F80B49906621DEB8EE721
    @Test()
    public void bindClassDefinerWhenUnsafeClassDefinerIsAccessible() {
        /* Branches:
         * (loadingOption == CustomClassLoadingOption.CHILD) : false
         * (UnsafeClassDefiner.isAccessible()) : true
         */
        //Act Statement(s)
        ClassDefiner result = ClassDefining.bindClassDefiner();
        //Assert statement(s)
        //TODO: Please implement equals method in UnsafeClassDefiner for verification of the entire object or you need to adjust respective assertion statements
        assertThat(result, is(notNullValue()));
    }
}

package com.google.inject.internal;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.lang.reflect.Method;
import java.lang.reflect.Field;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Ignore;

public class DeclaredMembersSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    //Sapient generated method id: ${43759b28-f1aa-34d7-9a6d-5748bbd079ca}, hash: EBF250BDD47143D427678697C9E4B645
    @Test()
    public void getDeclaredFieldsTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        Field[] result = DeclaredMembers.getDeclaredFields(Object.class);
        //Assert statement(s)
        assertThat(result.length, equalTo(0));
    }

    //Sapient generated method id: ${49f6484b-88d7-375f-95a6-415651238cc6}, hash: BFDC830CCC971F06A5394560B2C0717B
    @Ignore()
    @Test()
    public void getDeclaredMethodsTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        Method[] result = DeclaredMembers.getDeclaredMethods(Object.class);
        //Assert statement(s)
        assertThat(result.length, equalTo(0));
    }
}

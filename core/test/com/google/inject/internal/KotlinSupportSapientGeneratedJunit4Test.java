package com.google.inject.internal;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.is;

public class KotlinSupportSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    //Sapient generated method id: ${77ba61e1-cd11-3f39-878a-49bd5be97943}, hash: C1159278D50210CC99EAB6A5FA9BA179
    @Test()
    public void getInstanceTest() {

        //Act Statement(s)
        KotlinSupportInterface result = KotlinSupport.getInstance();

        //Assert statement(s)
        //TODO: Please implement equals method in KotlinSupportInterface for verification of the entire object or you need to adjust respective assertion statements
        assertThat(result, is(notNullValue()));
    }
}

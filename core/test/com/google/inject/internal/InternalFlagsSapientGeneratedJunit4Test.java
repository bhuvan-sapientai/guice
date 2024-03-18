package com.google.inject.internal;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Ignore;

public class InternalFlagsSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    //Sapient generated method id: ${e0d8f678-1771-3e49-b42f-c3c100c3ae68}, hash: 53281CAE9C96F402B6EE5C41C35DBAA6
    @Ignore()
    @Test()
    public void getIncludeStackTraceOptionTest() {
        //Act Statement(s)
        InternalFlags.IncludeStackTraceOption result = InternalFlags.getIncludeStackTraceOption();
        //Assert statement(s)
        assertThat(result, equalTo(InternalFlags.IncludeStackTraceOption.OFF));
    }

    //Sapient generated method id: ${675c7a9a-992e-3d0f-9ed8-88626231cf50}, hash: 1CF386A6B6328B42F0343F27DCF45088
    @Ignore()
    @Test()
    public void getCustomClassLoadingOptionTest() {
        //Act Statement(s)
        InternalFlags.CustomClassLoadingOption result = InternalFlags.getCustomClassLoadingOption();
        //Assert statement(s)
        assertThat(result, equalTo(InternalFlags.CustomClassLoadingOption.OFF));
    }

    //Sapient generated method id: ${883e2cb4-72ed-3392-8ea8-ac18f7aa0108}, hash: 11B1BBDD2FA2374AECC939EBDA0662EA
    @Ignore()
    @Test()
    public void getNullableProvidesOptionTest() {
        //Act Statement(s)
        InternalFlags.NullableProvidesOption result = InternalFlags.getNullableProvidesOption();
        //Assert statement(s)
        assertThat(result, equalTo(InternalFlags.NullableProvidesOption.WARN));
    }

    //Sapient generated method id: ${68993385-fb7c-3ae9-91de-e75a94fee0e9}, hash: 5B81B1DF371582216E08C4FA645C60E0
    @Test()
    public void isBytecodeGenEnabledWhenBYTECODE_GEN_OPTIONEqualsBytecodeGenOptionENABLED() {
        /* Branches:
         * (BYTECODE_GEN_OPTION == BytecodeGenOption.ENABLED) : true
         */
        //Act Statement(s)
        boolean result = InternalFlags.isBytecodeGenEnabled();
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
    }

    //Sapient generated method id: ${8fd5aa69-0a4f-38cb-bf90-1d132635e125}, hash: D9441476B2A48375A9ABC4EC7FEA8A5A
    @Ignore()
    @Test()
    public void isBytecodeGenEnabledWhenBYTECODE_GEN_OPTIONNotEqualsBytecodeGenOptionENABLED() {
        /* Branches:
         * (BYTECODE_GEN_OPTION == BytecodeGenOption.ENABLED) : false
         */
        //Act Statement(s)
        boolean result = InternalFlags.isBytecodeGenEnabled();
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }

    //Sapient generated method id: ${3a2b21da-8ada-3ef4-9918-12d3f159778e}, hash: E525C42701A530F7713A27E369484EC9
    @Ignore()
    @Test()
    public void enableColorizeErrorMessagesWhenCOLORIZE_OPTIONEnabled() {
        /* Branches:
         * (COLORIZE_OPTION.enabled()) : true
         */
        //Act Statement(s)
        boolean result = InternalFlags.enableColorizeErrorMessages();
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.TRUE));
    }

    //Sapient generated method id: ${d19081bd-0fcd-3155-9a66-2c38d3824e2c}, hash: E7F08E24A4971CE7133344691A15EB85
    @Test()
    public void enableColorizeErrorMessagesWhenCOLORIZE_OPTIONNotEnabled() {
        /* Branches:
         * (COLORIZE_OPTION.enabled()) : false
         */
        //Act Statement(s)
        boolean result = InternalFlags.enableColorizeErrorMessages();
        //Assert statement(s)
        assertThat(result, equalTo(Boolean.FALSE));
    }
}

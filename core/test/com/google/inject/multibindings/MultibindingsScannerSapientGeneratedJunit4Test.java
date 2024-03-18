package com.google.inject.multibindings;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import com.google.inject.Module;
import com.google.inject.spi.ModuleAnnotatedMethodScanner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.is;

public class MultibindingsScannerSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    //Sapient generated method id: ${ea688a9c-8ad9-3597-aa47-7a13f539b316}, hash: 02C93CFFF658F340D4FEA1C16144915D
    @Test()
    public void asModuleTest() {

        //Act Statement(s)
        Module result = MultibindingsScanner.asModule();

        //Assert statement(s)
        //TODO: Please implement equals method in Module for verification of the entire object or you need to adjust respective assertion statements
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${331e4dd6-3425-37b4-8441-96e411b0fc24}, hash: 048D34F51510216DD05621E5ADFBAF5D
    @Test()
    public void scannerTest() {

        //Act Statement(s)
        ModuleAnnotatedMethodScanner result = MultibindingsScanner.scanner();

        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }
}

package com.google.inject.internal;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.MockedStatic;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

import org.junit.Ignore;

public class PackageNameCompressorSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    //Sapient generated method id: ${d0218db0-7816-3e9a-bb9a-8115898dc9c1}, hash: 355271B1E80BA0865DAC2FB574F977BE
    @Test()
    public void compressPackagesInMessageWhenReplacementMapIsEmpty() {
        /* Branches:
         * (matcher.find()) : false
         * (for-each(names)) : false  #  inside shortenNames method
         * (branch expression (line 216)) : false  #  inside shortenNames method
         * (conflictingShortNames.isEmpty()) : true  #  inside shortenNames method
         * (branch expression (line 244)) : false  #  inside shortenNames method
         * (replacementMap.isEmpty()) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: shortNameToPartsMap - Method: asMap
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        String result = PackageNameCompressor.compressPackagesInMessage("A");
        //Assert statement(s)
        assertThat(result, equalTo("A"));
    }

    //Sapient generated method id: ${bdf0d793-2468-309c-ae6e-78dda9e353bb}, hash: 72C8516E424A97F7FB6FA0A5BF4FF387
    @Test()
    public void compressPackagesInMessageWhenReplacedShortNamesIsEmpty() {
        /* Branches:
         * (matcher.find()) : true
         * (for-each(names)) : true  #  inside shortenNames method
         * (branch expression (line 216)) : true  #  inside shortenNames method
         * (entry.getValue().size() > 1) : true  #  inside shortenNames method
         * (conflictingShortNames.isEmpty()) : false  #  inside shortenNames method
         * (for-each(conflictingShortNames)) : true  #  inside shortenNames method
         * (for-each(partsCollection)) : true  #  inside shortenNames method
         * (!parts.isEmpty()) : true  #  inside shortenNames method
         * (branch expression (line 244)) : true  #  inside shortenNames method
         * (replacementMap.isEmpty()) : false
         * (matcher.find()) : true  #  inside replaceFullNames method
         * (for-each(shortNames)) : true  #  inside replaceFullNames method
         * (replaced.length() < beforeLen) : true  #  inside replaceFullNames method
         * (quoted != null) : true  #  inside replaceFullNames method
         * (replacedShortNames.isEmpty()) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: shortNameToPartsMap - Method: put
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        String result = PackageNameCompressor.compressPackagesInMessage("input1");
        //Assert statement(s)
        assertThat(result, equalTo("input1"));
    }

    //Sapient generated method id: ${dc1e103d-ae5d-388f-815c-ded7a7bf44a9}, hash: E28353029A32456A63891A6164C1D6B5
    @Ignore()
    @Test()
    public void compressPackagesInMessageWhenLegendBuilderLengthEquals0() {
        /* Branches:
         * (matcher.find()) : true
         * (for-each(names)) : true  #  inside shortenNames method
         * (branch expression (line 216)) : true  #  inside shortenNames method
         * (entry.getValue().size() > 1) : true  #  inside shortenNames method
         * (conflictingShortNames.isEmpty()) : false  #  inside shortenNames method
         * (for-each(conflictingShortNames)) : true  #  inside shortenNames method
         * (for-each(partsCollection)) : true  #  inside shortenNames method
         * (!parts.isEmpty()) : true  #  inside shortenNames method
         * (branch expression (line 244)) : true  #  inside shortenNames method
         * (replacementMap.isEmpty()) : false
         * (matcher.find()) : true  #  inside replaceFullNames method
         * (for-each(shortNames)) : true  #  inside replaceFullNames method
         * (replaced.length() < beforeLen) : true  #  inside replaceFullNames method
         * (quoted != null) : true  #  inside replaceFullNames method
         * (replacedShortNames.isEmpty()) : false
         * (for-each(replacementMap.entrySet())) : true  #  inside buildClassNameLegend method
         * (PACKAGES_SKIPPED_IN_LEGEND.contains(prefix)) : true  #  inside buildClassNameLegend method
         * (!shortName.contains(".")) : true  #  inside buildClassNameLegend method
         * (legendBuilder.length() == 0) : true  #  inside buildClassNameLegend method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: shortNameToPartsMap - Method: put
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        String result = PackageNameCompressor.compressPackagesInMessage("input1");
        //Assert statement(s)
        assertThat(result, equalTo("result1"));
    }

    //Sapient generated method id: ${5d3cdae8-dce2-3a14-8912-5a3c2c3b2ada}, hash: 23A25B9138BEAD0F55D161720DF99800
    @Ignore()
    @Test()
    public void compressPackagesInMessageWhenShortNameContains_AndLegendBuilderLengthNotEquals0() {
        /* Branches:
         * (matcher.find()) : true
         * (for-each(names)) : true  #  inside shortenNames method
         * (branch expression (line 216)) : true  #  inside shortenNames method
         * (entry.getValue().size() > 1) : true  #  inside shortenNames method
         * (conflictingShortNames.isEmpty()) : false  #  inside shortenNames method
         * (for-each(conflictingShortNames)) : true  #  inside shortenNames method
         * (for-each(partsCollection)) : true  #  inside shortenNames method
         * (!parts.isEmpty()) : true  #  inside shortenNames method
         * (branch expression (line 244)) : true  #  inside shortenNames method
         * (replacementMap.isEmpty()) : false
         * (matcher.find()) : true  #  inside replaceFullNames method
         * (for-each(shortNames)) : true  #  inside replaceFullNames method
         * (replaced.length() < beforeLen) : true  #  inside replaceFullNames method
         * (quoted != null) : true  #  inside replaceFullNames method
         * (replacedShortNames.isEmpty()) : false
         * (for-each(replacementMap.entrySet())) : true  #  inside buildClassNameLegend method
         * (PACKAGES_SKIPPED_IN_LEGEND.contains(prefix)) : true  #  inside buildClassNameLegend method
         * (!shortName.contains(".")) : false  #  inside buildClassNameLegend method
         * (legendBuilder.length() == 0) : false  #  inside buildClassNameLegend method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated or mocked when calling a method - Variable name: shortNameToPartsMap - Method: put
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Messages> messages = mockStatic(Messages.class, CALLS_REAL_METHODS)) {
            messages.when(() -> Messages.faint("text1")).thenReturn("return_of_faint1");
            //Act Statement(s)
            String result = PackageNameCompressor.compressPackagesInMessage("input1");
            //Assert statement(s)
            assertThat(result, equalTo("result1"));
            messages.verify(() -> Messages.faint("text1"), atLeast(1));
        }
    }
}

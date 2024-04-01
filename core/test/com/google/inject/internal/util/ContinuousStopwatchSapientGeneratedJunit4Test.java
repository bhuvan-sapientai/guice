package com.google.inject.internal.util;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;
import com.google.common.base.Stopwatch;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class ContinuousStopwatchSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    //Sapient generated method id: ${956fb832-abf7-3971-aedb-c516d557eacc}, hash: 4F528906656A5B9D5A5797A5A64E07AD
    @Test()
    public void resetTest() {
        //Arrange Statement(s)
        Stopwatch stopwatch = Stopwatch.createUnstarted();
        ContinuousStopwatch target = new ContinuousStopwatch(stopwatch);

        //Act Statement(s)
        long result = target.reset();

        //Assert statement(s)
        assertThat(result, equalTo(0L));
    }

    //Sapient generated method id: ${afbea7ff-bdb1-3e0e-a6e0-02f5c72e96ee}, hash: 659ED5D8372891BA5E854FE2A106DC95
    @Test()
    public void resetAndLogTest() {
        //Arrange Statement(s)
        Stopwatch stopwatch = Stopwatch.createUnstarted();
        ContinuousStopwatch target = new ContinuousStopwatch(stopwatch);

        //Act Statement(s)
        target.resetAndLog("A");
    }
}

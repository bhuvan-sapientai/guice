package com.google.inject.internal.aop;

import org.junit.rules.Timeout;
import org.junit.Rule;
import org.junit.Test;

import java.util.Collection;
import java.util.ArrayList;
import java.util.function.ToIntFunction;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.is;

import org.junit.Ignore;

public class ImmutableStringTrieSapientGeneratedJunit4Test {

    @Rule()
    public Timeout timeoutRule = Timeout.seconds(5);

    //Sapient generated method id: ${87ad34a9-b533-3fdc-844d-98e6dc844471}, hash: B755B3680B2F4FB7CD8F613668932AC3
    @Ignore()
    @Test()
    public void applyAsIntWhenBranchIndexLessThan0() {
        /* Branches:
         * (keyIndex < keyLength) : true
         * (branchIndex < 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        char[] charArray = new char[]{'A'};
        ImmutableStringTrie target = new ImmutableStringTrie(charArray);
        //Act Statement(s)
        int result = target.applyAsInt("A");
        //Assert statement(s)
        assertThat(result, equalTo(-1));
    }

    //Sapient generated method id: ${3ee2071e-f7ff-38e7-b12b-36eb95af78f6}, hash: 7FF08459A290C7523F14A8ABA5A94182
    @Ignore()
    @Test()
    public void applyAsIntWhenResultAndLEAF_MARKERNotEquals0() {
        /* Branches:
         * (keyIndex < keyLength) : true
         * (branchIndex < 0) : false
         * ((result & LEAF_MARKER) != 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        char[] charArray = new char[]{'A'};
        ImmutableStringTrie target = new ImmutableStringTrie(charArray);
        //Act Statement(s)
        int result = target.applyAsInt("A");
        //Assert statement(s)
        assertThat(result, equalTo(0));
    }

    //Sapient generated method id: ${4ffeb122-4d08-312f-9500-fb611ff63638}, hash: 1E7658B652682CE906189F2D85CC2B89
    @Ignore()
    @Test()
    public void applyAsIntWhenKeyIndexEqualsKeyLengthMinus1() {
        /* Branches:
         * (keyIndex < keyLength) : true
         * (branchIndex < 0) : false
         * ((result & LEAF_MARKER) != 0) : false
         * ((result & BUD_MARKER) != 0) : true
         * (keyIndex == keyLength - 1) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        char[] charArray = new char[]{'A'};
        ImmutableStringTrie target = new ImmutableStringTrie(charArray);
        //Act Statement(s)
        int result = target.applyAsInt("B");
        //Assert statement(s)
        assertThat(result, equalTo(0));
    }

    //Sapient generated method id: ${d5ff5646-93a4-34b5-b581-13707622331d}, hash: 4386289CC5E53FF933E9436EE6B6CA35
    @Ignore()
    @Test()
    public void applyAsIntWhenKeyIndexNotEqualsKeyLengthMinus1AndBranchIndexGreaterThanDataIndex() {
        /* Branches:
         * (keyIndex < keyLength) : true
         * (branchIndex < 0) : false
         * ((result & LEAF_MARKER) != 0) : false
         * ((result & BUD_MARKER) != 0) : true
         * (keyIndex == keyLength - 1) : false
         * (branchIndex > dataIndex) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        char[] charArray = new char[]{'A'};
        ImmutableStringTrie target = new ImmutableStringTrie(charArray);
        //Act Statement(s)
        int result = target.applyAsInt("BC");
        //Assert statement(s)
        assertThat(result, equalTo(-1));
    }

    //Sapient generated method id: ${535af372-d965-3d80-9b33-194bad3c1ee1}, hash: 7D3D1F065CB076B5718269862D55564A
    @Test()
    public void buildTrieWhenNumRowsNotGreaterThan1() {
        /* Branches:
         * (numRows > 1) : false
         */
        //Arrange Statement(s)
        Collection<String> collection = new ArrayList<>();
        collection.add("tableItem1");
        //Act Statement(s)
        ToIntFunction<String> result = ImmutableStringTrie.buildTrie(collection);
        //Assert statement(s)
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${8e427aff-2750-3e93-8d8b-50bdfafd872d}, hash: CCC5CD3A89B8DACB2A66EF737356536C
    @Test()
    public void buildTrieWhenBranchCountGreaterThan0AndNotAllLeaves() {
        /* Branches:
         * (numRows > 1) : true
         * (rowLimit <= trieLimit) : true  #  inside buildTrie method
         * (prevRow < rowLimit) : true  #  inside buildSubTrie method
         * (r < rowLimit) : true  #  inside nextPivotRow method
         * (cells.length() <= column) : false  #  inside nextPivotRow method
         * (cells.charAt(column) != pivot) : true  #  inside nextPivotRow method
         * (c < columnLimit) : true  #  inside nextPivotColumn method
         * (nextPivotRow(table, cells.charAt(c), c, row, rowLimit) < rowLimit) : false  #  inside nextPivotColumn method
         * (nextColumn == columnLimit) : true  #  inside buildSubTrie method
         * (nextColumn - column > 1) : false  #  inside buildSubTrie method
         * (nextColumn < columnLimit) : true  #  inside buildSubTrie method
         * (nextRow < rowLimit) : true  #  inside buildSubTrie method
         * (branchCount > 0) : true  #  inside buildSubTrie method
         * (allLeaves) : false  #  inside buildSubTrie method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Collection<String> collection = new ArrayList<>();
        //Act Statement(s)
        ToIntFunction<String> result = ImmutableStringTrie.buildTrie(collection);
        //Assert statement(s)
        //TODO: Please implement equals method in ImmutableStringTrie for verification of the entire object or you need to adjust respective assertion statements
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${f1661cca-4072-3d43-b6df-10fb15118ed6}, hash: 42D215D207C93D063EFAB9F2AA04BC95
    @Test()
    public void buildTrieWhenNotIsLeafAndNextRowNotLessThanRowLimitAndBranchCountGreaterThan0AndNotAllLeaves() {
        /* Branches:
         * (numRows > 1) : true
         * (rowLimit <= trieLimit) : true  #  inside buildTrie method
         * (prevRow < rowLimit) : true  #  inside buildSubTrie method
         * (r < rowLimit) : true  #  inside nextPivotRow method
         * (cells.length() <= column) : false  #  inside nextPivotRow method
         * (cells.charAt(column) != pivot) : false  #  inside nextPivotRow method
         * (c < columnLimit) : false  #  inside nextPivotColumn method
         * (nextColumn == columnLimit) : true  #  inside buildSubTrie method
         * (nextColumn - column > 1) : false  #  inside buildSubTrie method
         * (nextColumn < columnLimit) : false  #  inside buildSubTrie method
         * (subTrieStart > buf.length()) : false  #  inside buildSubTrie method
         * (isLeaf) : false  #  inside buildSubTrie method
         * (allLeaves) : true  #  inside buildSubTrie method
         * (isLeaf) : false  #  inside buildSubTrie method
         * (nextRow < rowLimit) : false  #  inside buildSubTrie method
         * (branchCount > 0) : true  #  inside buildSubTrie method
         * (allLeaves) : false  #  inside buildSubTrie method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Collection<String> collection = new ArrayList<>();
        collection.add("tableItem1");
        collection.add("tableItem2");
        //Act Statement(s)
        ToIntFunction<String> result = ImmutableStringTrie.buildTrie(collection);
        //Assert statement(s)
        //TODO: Please implement equals method in ImmutableStringTrie for verification of the entire object or you need to adjust respective assertion statements
        assertThat(result, is(notNullValue()));
    }

    //Sapient generated method id: ${9c4a3cfc-57cd-3375-a3de-d0cc8b9cfeae}, hash: F9E3CD544E5A42B21BC018D3F9F3E19A
    @Test()
    public void buildTrieWhenBranchCountGreaterThan0AndAllLeaves() {
        /* Branches:
         * (numRows > 1) : true
         * (rowLimit <= trieLimit) : true  #  inside buildTrie method
         * (prevRow < rowLimit) : true  #  inside buildSubTrie method
         * (r < rowLimit) : true  #  inside nextPivotRow method
         * (cells.length() <= column) : false  #  inside nextPivotRow method
         * (cells.charAt(column) != pivot) : true  #  inside nextPivotRow method
         * (c < columnLimit) : true  #  inside nextPivotColumn method
         * (nextPivotRow(table, cells.charAt(c), c, row, rowLimit) < rowLimit) : false  #  inside nextPivotColumn method
         * (nextColumn == columnLimit) : true  #  inside buildSubTrie method
         * (nextColumn - column > 1) : true  #  inside buildSubTrie method
         * (nextRow - prevRow > 1) : false  #  inside buildSubTrie method
         * (nextColumn < columnLimit) : false  #  inside buildSubTrie method
         * (subTrieStart > buf.length()) : true  #  inside buildSubTrie method
         * (isLeaf) : true  #  inside buildSubTrie method
         * (allLeaves) : true  #  inside buildSubTrie method
         * (isLeaf) : true  #  inside buildSubTrie method
         * (nextRow < rowLimit) : true  #  inside buildSubTrie method
         * (branchCount > 0) : true  #  inside buildSubTrie method
         * (allLeaves) : true  #  inside buildSubTrie method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Collection<String> collection = new ArrayList<>();
        collection.add("tableItem1");
        collection.add("tableItem2");
        //Act Statement(s)
        ToIntFunction<String> result = ImmutableStringTrie.buildTrie(collection);
        //Assert statement(s)
        //TODO: Please implement equals method in ImmutableStringTrie for verification of the entire object or you need to adjust respective assertion statements
        assertThat(result, is(notNullValue()));
    }
}

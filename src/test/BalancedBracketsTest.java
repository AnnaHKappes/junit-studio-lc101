package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    //    POSITIVE TESTS
    @Test
    public void onlyBracketsReturnsTrue(){ assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void wordInBracketsReturnTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void wordOutsideOfBracketsReturnTrue() { assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode")); }

    @Test
    public void wordInsideAndOutsideOfBracketsReturnTrue() { assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]")); }

    @Test
    public void noBracketsReturnTure() {assertTrue(BalancedBrackets.hasBalancedBrackets("")); }

    @Test
    public void nestBracketsReturnTrue() {assertTrue(BalancedBrackets.hasBalancedBrackets("[Launch[Launch[LaunchCode]Code]Code]")); }

    //    NEGATIVE TESTS
    @Test
    public void onlyLeftBracketAndWordReturnFalse() {assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode")); }

    @Test
    public void bracketsInWrongOrderWithWordReturnFalse() {assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code[")); }

    @Test
    public void onlyLeftBracketReturnFalse() {assertFalse(BalancedBrackets.hasBalancedBrackets("[")); }

    @Test
    public void onlyRightBracketReturnFalse() {assertFalse(BalancedBrackets.hasBalancedBrackets("]")); }

    @Test
    public void reversedBracketsReturnFalse() {assertFalse(BalancedBrackets.hasBalancedBrackets("][")); }

}
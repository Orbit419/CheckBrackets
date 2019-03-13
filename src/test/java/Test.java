import org.junit.Assert;

public class Test {
    @org.junit.Test
    public void test1() {
        Assert.assertFalse(CheckBrackets.checkBrackets("asd)"));
    }

    @org.junit.Test
    public void test2() {
        Assert.assertTrue(CheckBrackets.checkBrackets("asd"));
    }

    @org.junit.Test
    public void test3() {
        Assert.assertFalse(CheckBrackets.checkBrackets("asd())"));
    }

    @org.junit.Test
    public void test4() {
        Assert.assertTrue(CheckBrackets.checkBrackets(""));
    }

    @org.junit.Test
    public void test5() {
        Assert.assertTrue(CheckBrackets.checkBrackets(null));
    }

    @org.junit.Test
    public void test6() {
        Assert.assertTrue(CheckBrackets.checkBrackets("()()()"));
    }

    @org.junit.Test
    public void test7() {
        Assert.assertTrue(CheckBrackets.checkBrackets("(())"));
    }

    @org.junit.Test
    public void test8() {
        Assert.assertFalse(CheckBrackets.checkBrackets("(()))"));
    }

    @org.junit.Test
    public void test9() {
        Assert.assertFalse(CheckBrackets.checkBrackets("(())("));
    }
}

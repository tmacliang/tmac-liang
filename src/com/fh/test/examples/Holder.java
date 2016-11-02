package com.fh.test.examples;

/**
 * Holder
 * <p/>
 * Class at risk of failure if not properly published
 *
 * @author Brian Goetz and Tim Peierls
 */
public class Holder {
    @SuppressWarnings("unused")
	private int n;

    public Holder(int n) {
        this.n = n;
    }

    public void assertSanity() {
//        if (n != n)
//            throw new AssertionError("This statement is false.");
    }
}

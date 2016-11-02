package com.fh.test.examples;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import javax.swing.JButton;
import javax.swing.JLabel;

/**
 * ListenerExamples
 *
 * @author Brian Goetz and Tim Peierls
 */
public class ListenerExamples {
    @SuppressWarnings("unused")
	private static ExecutorService exec = Executors.newCachedThreadPool();

    @SuppressWarnings("unused")
	private final JButton colorButton = new JButton("Change color");
    @SuppressWarnings("unused")
	private final Random random = new Random();

    @SuppressWarnings("unused")
	private final JButton computeButton = new JButton("Big computation");

    @SuppressWarnings("unused")
	private final JButton button = new JButton("Do");
    @SuppressWarnings("unused")
	private final JLabel label = new JLabel("idle");

    @SuppressWarnings("unused")
	private final JButton startButton = new JButton("Start");
    @SuppressWarnings("unused")
	private final JButton cancelButton = new JButton("Cancel");
    @SuppressWarnings("unused")
	private Future<?> runningTask = null; // thread-confined
}

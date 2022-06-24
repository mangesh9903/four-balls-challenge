package com.thoughtworks.prereads.fourballschallenge;

import processing.core.PApplet;

/**
 * Class :- Class for Four Balls Challenge.
 *
 * @author Mangesh
 * @since 24-06-2022
 */
public class FourBallsChallenge extends PApplet {

    public static final int CIRCLE = 30;
    public static final int HEIGHT = 800;
    public static final int WIDTH = 1000;
    public static final float ballAtY = (HEIGHT * 1 ) / 5;

    private float ballAtX = 0;

    public static void main(String[] args) {
        PApplet.main("com.thoughtworks.prereads.fourballschallenge.FourBallsChallenge", args);
    }

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        drawCircle(ballAtX, ballAtY);
        ballAtX += 1;
    }

    /**
     * Method :- Method to print balls.
     *
     * @param ballAtX :- passing ballAtX as input.
     * @param ballAtY :- passing ballAtY as input.
     */
    private void drawCircle(float ballAtX, float ballAtY) {
        ellipse(ballAtX, ballAtY, CIRCLE, CIRCLE);
    }
}

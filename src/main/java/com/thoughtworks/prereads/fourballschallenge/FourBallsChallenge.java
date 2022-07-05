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

    public static final float FIRST_BALL_AT_Y_COORDINATE = (HEIGHT * 1) / 5;
    public static final float SECOND_BALL_AT_Y_COORDINATE = (HEIGHT * 2) / 5;
    public static final float THIRD_BALL_AT_Y_COORDINATE = (HEIGHT * 3) / 5;
    public static final float FOURTH_BALL_AT_Y_COORDINATE = (HEIGHT * 4) / 5;

    private float FIRST_BALLS_At_X_COORDINATE = 0;
    private float SECOND_BALLS_At_X_COORDINATE = 0;
    private float THIRD_BALLS_At_X_COORDINATE = 0;
    private float FOURTH_BALLS_At_X_COORDINATE = 0;

    public static void main(String[] args) {
        PApplet.main("com.thoughtworks.prereads.fourballschallenge.FourBallsChallenge", args);
    }

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    /**
     *  Method :- PApplet method to draw circle
     */

    @Override
    public void draw() {
        drawCircle(FIRST_BALLS_At_X_COORDINATE, FIRST_BALL_AT_Y_COORDINATE);
        drawCircle(SECOND_BALLS_At_X_COORDINATE, SECOND_BALL_AT_Y_COORDINATE);
        drawCircle(THIRD_BALLS_At_X_COORDINATE, THIRD_BALL_AT_Y_COORDINATE);
        drawCircle(FOURTH_BALLS_At_X_COORDINATE, FOURTH_BALL_AT_Y_COORDINATE);
        FIRST_BALLS_At_X_COORDINATE += 1;
        SECOND_BALLS_At_X_COORDINATE += 2;
        THIRD_BALLS_At_X_COORDINATE += 3;
        FOURTH_BALLS_At_X_COORDINATE += 4;
    }

    /**
     * Method :- Method to print balls.
     *
     * @param ALL_BALLS_At_X_COORDINATE :- passing ALL_BALLS_At_X_COORDINATE as input.
     * @param BALL_AT_Y_COORDINATE      :- passing BALL_AT_Y_COORDINATE as input.
     */
    private void drawCircle(float ALL_BALLS_At_X_COORDINATE, float BALL_AT_Y_COORDINATE) {
        ellipse(ALL_BALLS_At_X_COORDINATE, BALL_AT_Y_COORDINATE, CIRCLE, CIRCLE);
    }
}

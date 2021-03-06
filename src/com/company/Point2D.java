package com.company;

public class Point2D {
    private float x; // = 0.0f;
    private float y; // = 0.0f;
    private String a;

    public Point2D() {
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public void setXy(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float[] getXy(){
        return new float[]{x,y};
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}

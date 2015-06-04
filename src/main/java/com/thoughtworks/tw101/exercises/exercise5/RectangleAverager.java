package com.thoughtworks.tw101.exercises.exercise5;

public class RectangleAverager {
    private Rectangle[] rectangles;

    public float averageArea(Rectangle[] rectangles) {
        this.rectangles = rectangles;

        float TotalAverage = 0;

        for(Rectangle rectangle : rectangles) {
            TotalAverage+= rectangle.area();
        }

        return TotalAverage/rectangles.length;
    }

}

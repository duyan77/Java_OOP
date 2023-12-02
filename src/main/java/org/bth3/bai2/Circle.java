package org.bth3.bai2;

public class Circle extends Ellipse {
    public Circle(double bk) {
        super(bk, bk);
    }

    @Override
    public String layTen() {
        return "org.bth3.bai2.Circle";
    }
}

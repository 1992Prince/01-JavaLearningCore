package org.tim.oops3_p1_abstractcls;

public abstract class Animal {

    protected String type;
    private String size;
    private double weight;

    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    public abstract void move(String speed);

    public abstract void makeNoise();

    // I don't want subclasses to override this method
    public final String getExplicitType() {
        return getClass().getSimpleName() + " (" + type + ")";
    }
}

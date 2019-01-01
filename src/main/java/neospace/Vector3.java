package neospace;

import java.lang.Math;

public class Vector3 {

    public double x, y, z;

    public Vector3() {
        x = 0;
        y = 0;
        z = 0;
    }

    public Vector3(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getMagnitude() {
        double d = Math.sqrt((x * x) + (y * y) + (z * z));
        return d;
    }

    /*public double getNormalized() { }*/

}
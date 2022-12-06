import java.util.ArrayList;

public class NBody {
    /** the number of planets */
    int N;
    /** the radius of the universe */
    double R;
    /** the number of planets */
    Planet[] P;

    public static double readRadius(String filePath) {
        In fileIn = new In(filePath);
        fileIn.readLine();
        double raduis = fileIn.readDouble();
        return raduis;
    }

    public static Planet[] readPlanets(String filePath) {
        ArrayList<Planet> planetArrays = new ArrayList<Planet>();
        String last = "";
        String test = "";
        In fileIn = new In(filePath);
        fileIn.readInt();
        fileIn.readDouble();
        while (last == "" || last.indexOf(".gif") > 0) {
            test = fileIn.readString();
            if (test.indexOf("e+") < 0) {
                break;
            }
            ;
            double xP = Double.parseDouble(test);
            double yP = fileIn.readDouble();
            double xV = fileIn.readDouble();
            double yV = fileIn.readDouble();
            double M = fileIn.readDouble();
            String img = fileIn.readString();
            Planet planet = new Planet(xP, yP, xV, yV, M, img);
            planetArrays.add(planet);
        }
        Planet[] planets = planetArrays.toArray(new Planet[planetArrays.size()]);
        return planets;
    }

    public static void drawBackground(double radius, String imgPath) {
        StdDraw.setScale(-radius, radius);
        StdDraw.clear();
        StdDraw.picture(0, 0, imgPath);
        StdDraw.show();
    }

    public static void main(String[] args) {
        // Ready a canvas
        double T = Double.parseDouble(args[0]);
        double dt = Double.parseDouble(args[1]);
        String filename = args[2];
        double radius = NBody.readRadius(filename);
        Planet[] planets = NBody.readPlanets(filename);
        StdDraw.enableDoubleBuffering();
        NBody.drawBackground(radius, "images/starfield.jpg");
        for (int i = 0; i < planets.length; i++) {
            planets[i].draw();
        }

        // update animation
        for (double interval = 0; interval < T; interval += dt) {
            double[] xForces = new double[planets.length];
            double[] yForces = new double[planets.length];
            for (int j = 0; j < planets.length; j++) {
                double xForce = planets[j].calcNetForceExertedByX(planets);
                double yForce = planets[j].calcNetForceExertedByY(planets);
                xForces[j] = xForce;
                yForces[j] = yForce;
            }
            ;
            for (int index = 0; index < planets.length; index++) {
                planets[index].update(dt, xForces[index], yForces[index]);
            }
            NBody.drawBackground(radius, "images/starfield.jpg");
            for (int i = 0; i < planets.length; i++) {
                planets[i].draw();
            }
            StdDraw.show();
            interval = 0;
        }

    }
}

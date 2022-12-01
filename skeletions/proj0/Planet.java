public class Planet {
    /**  Its current x position */
    public double xxPos;
    /**  Its current y position */
    public double yyPos;
    /**  ts current velocity in the x direction */
    public double xxVel;
    /** Its current velocity in the y direction */
    public double yyVel;
    /**  Its mass */
    public double mass;
    /** The name of the file that corresponds to the image that depicts the planet (for example .junpier.gif) */
    public String imgFileName;
    static double G = 6.67 * Math.pow(10,-11);
    public Planet(double xP, double yP, double xV, double yV, double m, String img){
      xxPos = xP;
      yyPos = yP;
      xxVel = xV;
      yyVel = yV;
      mass = m;
      imgFileName = img;
    }
    public Planet(Planet p){
      xxPos = p.xxPos;
      yyPos = p.yyPos;
      xxVel = p.xxVel;
      yyVel = p.yyVel;
      mass = p.mass;
      imgFileName = p.imgFileName;
    }
    /** A method to calculate the r of two planet */
    public double calcDistance(Planet rocinante){
      double d_x = Math.abs(rocinante.xxPos - this.xxPos);
      double d_y = Math.abs(rocinante.yyPos - this.yyPos);
      double distance = Math.sqrt(Math.pow(d_x,2) + Math.pow(d_y,2));
      return distance;
    }
    /** A method to calculate the F of two planet */
    public double calcForceExertedBy(Planet rocinante){
      double r = this.calcDistance(rocinante);
      double F = Planet.G * this.mass * rocinante.mass / Math.pow(r, 2);
      return F;
    }
    /** A method to calculate the F_x of two planet */
    public double calcForceExertedByX(Planet rocinante){
      double r = this.calcDistance(rocinante);
      double F = Planet.G * this.mass * rocinante.mass / Math.pow(r, 2);
      double d_x = rocinante.xxPos - this.xxPos;
      double F_x = F * d_x / r;
      return F_x;
    }
    /** A method to calculate the F_y of two planet */
    public double calcForceExertedByY(Planet rocinante){
      double r = this.calcDistance(rocinante);
      double F = Planet.G * this.mass * rocinante.mass / Math.pow(r, 2);
      double d_y = rocinante.yyPos - this.yyPos;
      double F_y = F * d_y / r;
      return F_y;
    }
}

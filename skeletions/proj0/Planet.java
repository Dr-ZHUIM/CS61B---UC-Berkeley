public class Planet {
  /** Its current x position */
  public double xxPos;
  /** Its current y position */
  public double yyPos;
  /** ts current velocity in the x direction */
  public double xxVel;
  /** Its current velocity in the y direction */
  public double yyVel;
  /** Its mass */
  public double mass;
  /**
   * The name of the file that corresponds to the image that depicts the planet
   * (for example .junpier.gif)
   */
  public String imgFileName;
  static double G = 6.67 * Math.pow(10, -11);

  public Planet(double xP, double yP, double xV, double yV, double m, String img) {
    xxPos = xP;
    yyPos = yP;
    xxVel = xV;
    yyVel = yV;
    mass = m;
    imgFileName = img;
  }

  public Planet(Planet p) {
    xxPos = p.xxPos;
    yyPos = p.yyPos;
    xxVel = p.xxVel;
    yyVel = p.yyVel;
    mass = p.mass;
    imgFileName = p.imgFileName;
  }

  /** A method to calculate the r of two planet */
  public double calcDistance(Planet rocinante) {
    double d_x = Math.abs(rocinante.xxPos - this.xxPos);
    double d_y = Math.abs(rocinante.yyPos - this.yyPos);
    return Math.sqrt(Math.pow(d_x, 2) + Math.pow(d_y, 2));
  }

  /** A method to calculate the F of two planet */
  public double calcForceExertedBy(Planet rocinante) {
    double r = this.calcDistance(rocinante);
    return Planet.G * this.mass * rocinante.mass / Math.pow(r, 2);
  }

  /** A method to calculate the F_x of two planet */
  public double calcForceExertedByX(Planet rocinante) {
    double r = this.calcDistance(rocinante);
    double F = Planet.G * this.mass * rocinante.mass / Math.pow(r, 2);
    double d_x = rocinante.xxPos - this.xxPos;
    return F * d_x / r;
  }

  /** A method to calculate the F_y of two planet */
  public double calcForceExertedByY(Planet rocinante) {
    double r = this.calcDistance(rocinante);
    double F = Planet.G * this.mass * rocinante.mass / Math.pow(r, 2);
    double d_y = rocinante.yyPos - this.yyPos;
    return F * d_y / r;
  }

  /** A method to calculate the F_net_x of all the planets you choose on your planet */

  public double calcNetForceExertedByX(Planet[] allPlanets) {
    double F_net_x = 0;
    for (int i = 0; i < allPlanets.length; i++) {
      if (this.equals(allPlanets[i])) {
        continue;
      }
      F_net_x += this.calcForceExertedByX(allPlanets[i]);
    }
    return F_net_x;
  }

  /** A method to calculate the F_net_y of all the planets you choose on your planet */
  public double calcNetForceExertedByY(Planet[] allPlanets) {
    double F_net_y = 0;
    for (int i = 0; i < allPlanets.length; i++) {
      if (this.equals(allPlanets[i])) {
        continue;
      }
      F_net_y += this.calcForceExertedByY(allPlanets[i]);
    }
    return F_net_y;
  }

  /** A method to calculate the updated position of a planet */

  public void update(double dt, double F_net_x, double F_net_y){
    double a_x = F_net_x / this.mass;
    double a_y = F_net_y / this.mass;
    double v_x = this.xxVel + dt * a_x;
    double v_y = this.yyVel + dt * a_y;
    double p_x = this.xxPos + dt * v_x;
    double p_y = this.yyPos + dt * v_y;
    this.xxPos = p_x;
    this.yyPos = p_y;
    this.xxVel = v_x;
    this.yyVel = v_y;
  }

  public void draw(){
    String imgPath = this.imgFileName.indexOf("images/") >= 0 ? this.imgFileName : "images/" +  this.imgFileName ;
    StdDraw.picture(this.xxPos,this.yyPos,imgPath);
  }

}

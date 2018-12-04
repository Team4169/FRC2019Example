import edu.wpi.first.wpilibj.XboxController;
package frc.robot;


/**
 * Add your docs here.
 */
public class OI {
  public static final int DEAD_ZONE = 0.2;
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  XboxController controller1 = new XboxController(0);
  XboxController controller2 = new XboxController(1);
  boolean isDead(double x, double y) {
    if(Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)) < DEAD_ZONE){
      return true;
    }
      else return false;
  }

  double getController1X(Hand hand) {
    if(isDead(controller1.getX(hand), controller1.getY(hand))) {
      return 0;
    }
    else return controller1.getX(hand);
  }

  double getController1Y() {
    if(isDead(controller1.getX(hand), controller1.getY(hand))) {
      return 0;
    }
    else return controller1.getY(hand);
  }
  double getController2X(Hand hand) {
    if(isDead(controller1.getX(hand), controller1.getY(hand))) {
      return 0;
    }
    else return controller2.getX(hand);
  }

  double getController2Y() {
    if(isDead(controller1.getX(hand), controller1.getY(hand))) {
      return 0;
    }
    else return controller2.getY(hand);
  }
}

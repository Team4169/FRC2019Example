import edu.wpi.first.wpilibj.XboxController;

package frc.robot;


/**
 * Add your docs here.
 */
public class OI {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  XboxController controller1 = new XboxController(0);
  XboxController controller2 = new XboxController(1);
  double getController1X(Hand hand) {
    if(Math.abs(controller1.getX(hand)) <= 0.2) {
      return 0;
    }
    else return controller1.getX(hand);
  }

  double getController1Y() {
    if(Math.abs(controller1.getY(hand)) <= 0.2) {
      return 0;
    }
    else return controller1.getY(hand);
  }
  double getController2X(Hand hand) {
    if(Math.abs(controller2.getX(hand)) <= 0.2) {
      return 0;
    }
    else return controller2.getX(hand);
  }

  double getController2Y() {
    if(Math.abs(controller2.getY(hand)) <= 0.2) {
      return 0;
    }
    else return controller2.getY(hand);
  }
}

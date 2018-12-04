import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.GenericHID;
package frc.robot;

/**
* Add your docs here.
*/
public class OI {
HashMap<String, Integer> buttons = new HashMap<String, Integer>();
  buttons.put("A", 0);
  buttons.put("B", 1);
  buttons.put("X", 2);
  buttons.put("Y", 3);
 public static final double DEAD_ZONE = 0.2;
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

 double getController1X() {
   if(isDead(controller1.getX(), controller1.getY())) {
     return 0;
   }
   else return controller1.getX();
 }

 double getController1Y() {
   if(isDead(controller1.getX(), controller1.getY())) {
     return 0;
   }
   else return controller1.getY();
 }
 double getController2X() {
   if(isDead(controller1.getX(), controller1.getY())) {
     return 0;
   }
   else return controller2.getX();
 }

 double getController2Y() {
   if(isDead(controller1.getX(), controller1.getY())) {
     return 0;
   }
   else return controller2.getY();
 }
}



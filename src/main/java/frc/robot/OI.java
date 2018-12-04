import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.GenericHID;
package frc.robot;


/**
* Add your docs here.
*/
public class OI {
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

 double getController1XLeftJoystick() {
   if(isDead(controller1.getX(GenericHID.Hand.kLeft), controller1.getY(GenericHID.Hand.kLeft))) {
     return 0;
   }
   else return controller1.getX(GenericHID.Hand.kLeft);
 }

 double getController1YLeftJoystick() {
   if(isDead(controller1.getX(GenericHID.Hand.kLeft), controller1.getY(GenericHID.Hand.kLeft))) {
     return 0;
   }
   else return controller1.getY(GenericHID.Hand.kLeft);
 }
 double getController2XLeftJoystick() {
   if(isDead(controller1.getX(GenericHID.Hand.kLeft), controller1.getY(GenericHID.Hand.kLeft))) {
     return 0;
   }
   else return controller2.getX(GenericHID.Hand.kLeft);
 }

 double getController2YLeftJoystick() {
   if(isDead(controller1.getX(GenericHID.Hand.kLeft), controller1.getY(GenericHID.Hand.kLeft))) {
     return 0;
   }
   else return controller2.getY(GenericHID.Hand.kLeft);
 }
 double getController1XRightJoystick() {
   if(isDead(controller1.getX(GenericHID.Hand.kRight), controller1.getY(GenericHID.Hand.kRight))) {
     return 0;
   }
   else return controller1.getX(GenericHID.Hand.kRight);
 }

 double getController1YRightJoystick() {
   if(isDead(controller1.getX(GenericHID.Hand.kRight), controller1.getY(GenericHID.Hand.kRight))) {
     return 0;
   }
   else return controller1.getY(GenericHID.Hand.kRight);
 }
 double getController2XRightJoystick() {
   if(isDead(controller1.getX(GenericHID.Hand.kRight), controller1.getY(GenericHID.Hand.kRight))) {
     return 0;
   }
   else return controller2.getX(GenericHID.Hand.kRight);
 }

 double getController2YRightJoystick() {
   if(isDead(controller1.getX(GenericHID.Hand.kRight), controller1.getY(GenericHID.Hand.kRight))) {
     return 0;
   }
   else return controller2.getY(GenericHID.Hand.kRight);
 }
}



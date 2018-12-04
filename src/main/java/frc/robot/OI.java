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

 double getController1XLeft() {
   if(isDead(controller1.getX(GenericHID.Hand(kleft)), controller1.getY(GenericHID.Hand(kleft)))) {
     return 0;
   }
   else return controller1.getX(GenericHID.Hand(kleft));
 }

 double getController1YLeft() {
   if(isDead(controller1.getX(GenericHID.Hand(kleft)), controller1.getY(GenericHID.Hand(kleft)))) {
     return 0;
   }
   else return controller1.getY(GenericHID.Hand(kleft));
 }
 double getController2XLeft() {
   if(isDead(controller1.getX(GenericHID.Hand(kleft)), controller1.getY(GenericHID.Hand(kleft)))) {
     return 0;
   }
   else return controller2.getX(GenericHID.Hand(kleft));
 }

 double getController2YLeft() {
   if(isDead(controller1.getX(GenericHID.Hand(kleft)), controller1.getY(GenericHID.Hand(kleft)))) {
     return 0;
   }
   else return controller2.getY(GenericHID.Hand(kleft));
 }
 double getController1XRight() {
   if(isDead(controller1.getX(GenericHID.Hand(kright)), controller1.getY(GenericHID.Hand(kright)))) {
     return 0;
   }
   else return controller1.getX(GenericHID.Hand(kright));
 }

 double getController1YRight() {
   if(isDead(controller1.getX(GenericHID.Hand(kright)), controller1.getY(GenericHID.Hand(kright)))) {
     return 0;
   }
   else return controller1.getY(GenericHID.Hand(kright));
 }
 double getController2XRight() {
   if(isDead(controller1.getX(GenericHID.Hand(kright)), controller1.getY(GenericHID.Hand(kright)))) {
     return 0;
   }
   else return controller2.getX(GenericHID.Hand(kright));
 }

 double getController2YRight() {
   if(isDead(controller1.getX(GenericHID.Hand(kright)), controller1.getY(GenericHID.Hand(kright)))) {
     return 0;
   }
   else return controller2.getY(GenericHID.Hand(kright));
 }
}



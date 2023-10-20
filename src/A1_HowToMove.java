//public: visible to everyone
//class: template or blueprint
//after class we say the name of the class in this it is A1_HowToMove
//This is the method that your program looks for and executes when you 'run' it
public class A1_HowToMove extends World {
    public void go() {
        for(int i = 0; i<3; i++){
            shape(100, 60);
        }

    }

//        System.out.println("This message will be printed to the window below.");
//        System.out.println("That window is called the dos window");
    //word before fullstop refers to an object/class
    //word after fullstop refers to method/variable
    //Hence the plane.paustime refers to a variable in an object after plane

    //        for (int i = 0; i < 3; i=i+1)
//        {
//            plane.pausetime = 3;
//            plane.startingAngle(0);
//            plane.isTrail = true
//            plane.setColor(100,2,20);
//            plane.trailWidth = 5;
//            plane.move(200);
//            plane.startingAngle(90);
//            plane.move(200);
//            plane.startingAngle(180);
//            plane.move(200);
//            plane.startingAngle(270);
//            plane.move(200);
//            plane.startingAngle(360);
//            plane.startingAngle(315);
//            plane.move(142);
//            plane.startingAngle(405);
//            plane.move(142);
//            plane.teleport(292,390);
//            plane.startingAngle(0);
//            plane.move(20);
//            plane.startingAngle(90);
//            plane.move(60);
//            plane.startingAngle(180);
//            plane.move(20);
//            plane.startingAngle(270);
//            plane.move(60);
//            plane.startingAngle(360);
//            plane.teleport(235,300);
//            plane.startingAngle(0);
//            plane.move(40);
//            plane.startingAngle(90);
//            plane.move(40);
//            plane.startingAngle(180);
//            plane.move(40);
//            plane.startingAngle(270);
//            plane.move(40);
//            plane.startingAngle(360);
//            plane.move(40);
//            plane.teleport(255,300);
//            plane.startingAngle(90);
//            plane.move(40);
//            plane.teleport(235,320);
//            plane.startingAngle(360);
//            plane.move(40);
//            plane.teleport(325,300);
//            plane.startingAngle(0);
//            plane.move(40);
//            plane.startingAngle(90);
//            plane.move(40);
//            plane.startingAngle(180);
//            plane.move(40);
//            plane.startingAngle(270);
//            plane.move(40);
//            plane.startingAngle(360);
//            plane.move(40);
//            plane.teleport(345,300);
//            plane.startingAngle(90);
//            plane.move(40);
//            plane.teleport(325,320);
//            plane.startingAngle(360);
//            plane.move(40);
//            plane.teleport(292,452);
//            plane.startingAngle(45);
//            plane.move(80);
//            plane.teleport(313,452);
//            plane.startingAngle(45);
//            plane.move(80);
//            plane.teleport(349,509);
//            plane.startingAngle(360);
//            plane.move(20);
//        }
//
//    }
//}
    public void shape(int i, int j) {

            plane.pausetime = 8;
            plane.isTrail = true;
            plane.setColor(100,2,20);
            plane.trailWidth = 5;
            plane.turn(j);
            plane.move(i);
            plane.turn(j);
            plane.move(i);
            plane.turn(j);
            plane.move(i);
            plane.turn(j);
            plane.move(i);
            plane.turn(j);
            plane.move(i);
            plane.turn(j);
            plane.move(i);
            plane.isTrail = false;
            plane.move(200);

    }

}



/*

Methods:
- move(int x)
   move() moves the plane forward by the number of pixels specified in the parameter.
   plane.move(10); moves the plane forward 10 pixels.

- startingAngle(int x)
   startingAngle() orients the plane at the angle specified in the parameter.
   plane.startingAngle(0); points the plane to the right.

Attributes:
- boolean isTrail
   isTrail controls whether or not the plane should leave a trail. It can be true or false.
   plane.isTrail = true; causes the plane to leave a trail.

*/
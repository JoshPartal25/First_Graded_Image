public class B0_BasicLoop extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {
        CountDown();
        //drawSquare();
        rowOfSquares();
        //stars();
    }

    //public void stars() {
        //for (int row = 0; row < 6; row = row+1) {
           // for (int stars = 0; stars < row; stars = stars+1)
          //  {
           //     System.out.print("*");
             //   System.out.print("i= " + row + "j= " +stars);
            //}
           // System.out.println("");

      //  }

   // }

   // }
    public void CountDown() {
    for (int i = 7; i > 0; i = i-1){
        System.out.print(i);
    }
    }
    public void drawSquare() {
        for (int i = 0; i < 4; i = i+1) {
            plane.isTrail = true;
            plane.move(50);
            plane.turn(90);
        }
    }
   public void rowOfSquares() {
      plane.pausetime= 2;
      plane.trailWidth= 10;
       for (int k = 1; k < 15; k++){
          for (int j = 1; j < 19; j = j + 1) {
              plane.teleport(j*50, k*50);
            //plane.teleport(k*100, j*100);
              plane.setColor(j*13, j*5, j*12);
            drawSquare();
           }




       }
   }
}









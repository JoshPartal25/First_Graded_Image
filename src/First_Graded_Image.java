public class First_Graded_Image extends World {

    public int red;
    public int blue;
    public int green;

    public void go() {


        plane.loadBackGround("Milton-Academy-Logo.png");          //*** new method to load a diffrent JPG
        System.out.println("This will be printed to the  window. ");
        plane.teleport(0, 0);
        plane.showBackGround();
        System.out.println(plane.howMuchRed());

        for (int row = 1; row < plane.getBackGroundHeight(); row++)    //*** this is using new getBackground
        {
            for (int col = 1; col < plane.getBackGroundWidth(); col++)    //*** this is using new getBackgroun
            {
                plane.teleport(col, row);

                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();

                if (red > 85 && green > 100 && blue > 180) //&&green<240 && blue< 100)
                {
                    plane.setPixelColor(128, 0, 128);
                }

                if ((red > 130 && green > 20 && blue > 25) && (red < 190 && green < 30 && blue < 35)) {
                    plane.setPixelColor(64, 224, 208);
                }

                if ((red > 73 && green > 90 && blue > 40) && (red < 125 && green < 115 && blue < 60)) {
                    plane.setPixelColor(51, 51, 251);
                }

                if (red == 248 && green == 153 && blue == 29) {
                    plane.setPixelColor(128, 0, 0);
                }

                if (red == 0 && green == 70 && blue == 133) {
                    plane.setPixelColor(170, 255, 0);

                }
            }
        }
        plane.pausetime= 1;
        plane.teleport(0, 0);
        for (int i = 0; i < 4; ++i) {
            plane.isTrail = true;
            plane.trailWidth = 10;
            plane.move(395);
            plane.turn(90);
        }
        rowOfSquares();
    }

    public void drawSquare() {
        for (int i = 0; i < 4; ++i) {
            this.plane.isTrail = true;
            this.plane.move(25);
            this.plane.turn(90);
        }

    }

    public void rowOfSquares() {
        plane.pausetime = 1;
        plane.trailWidth = 5;
        for (int k = 0; k < 16; ++k) {
            for (int j = 0; j < 16; ++j) {

                plane.teleport(j * 25, k * 25);
                plane.setColor(j * 13, j * 5, j * 12);
                drawSquare();
            }
        }
    }
}






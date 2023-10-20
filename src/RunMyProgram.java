

/**
 * Created by chales on 3/3/2018.
 */
public class RunMyProgram {
    public static void main(String[] args) {
        World run;

        run = (new First_Graded_Image()   );
        run.planeIcon = "plane.png";
        run.pictureFileName="Screen Shot 2023-10-06 at 1.54.53 PM.png";
        run.HEIGHT=800;
        run.WIDTH=1000;
        run.Refresh();

        //new Thread(run).start();
    }
}

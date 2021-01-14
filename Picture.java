
/**
 * Draw a pretty picture composed of shape objects on a canvas
 * 
 * @author: (Your name)
 * @version: (Date)
 * 
 */
import java.io.File;
import java.io.IOException;

public class Picture {
    public static void main(String[] args) {
        // Get a reference to the canvas for this drawing
        Canvas pic = Canvas.getCanvas();

        // Set the title and background for the picture
        pic.setBackgroundColor("blue");

        // Draw my picture
        Rect sky = new Rect();
        Rect2 r = new Rect2();
        Rect3 r3 = new Rect3();
        Rect4 r4 = new Rect4();
        Rect5 r5 = new Rect5();
        Rect6 r6 = new Rect6();
        Rect b = new Rect();
        Circle c = new Circle();
        Circle2 c2 = new Circle2();
        Circle3 c3 = new Circle3();
        Circle4 c4 = new Circle4();
        Circle5 c5 = new Circle5();
        Circle6 c6 = new Circle6();
        Circle7 c7 = new Circle7();
        Arc a = new Arc();
        Triangle t = new Triangle();
        Tri2 t2 = new Tri2();
        sky.makeVisible();
        r.makeVisible();
        r3.makeVisible();
        r4.makeVisible();
        r5.makeVisible();
        r6.makeVisible();
        c.makeVisible();
        c2.makeVisible();
        c3.makeVisible();
        c4.makeVisible();
        c5.makeVisible();
        c6.makeVisible();
        c7.makeVisible();
        a.makeVisible();
        t.makeVisible();
        t2.makeVisible();
        pic.setTitle("A simpel tree By Ben SHade");

        // Get the filename to save to from the command line arguments, defaulting to
        // MyPicture.png if no argument is given
        String filename;
        if (args.length > 0 && args[0] != null && !args[0].isEmpty()) {
            filename = args[0];
        }
        else {
            filename = "MyPicture.png";
        }

        // Save the picture to a file
        try {
            pic.saveToFile(new File(filename));
            System.out.println("Picture saved to " + filename);
        } catch (IOException e) {
            System.err.println(e);
            System.err.println("Could not save file.");
        }
    }
}
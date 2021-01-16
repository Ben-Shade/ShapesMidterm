
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
        Arc a = new Arc();
        Circle c = new Circle();
        Circle c2 = new Circle(75, 380, 150, Canvas.getColor("green") );
        Circle c3 = new Circle(75, 410, 180, Canvas.getColor("green") );
        Circle c4 = new Circle(75, 320, 180, Canvas.getColor("green") );
        Circle c5 = new Circle(75, 320, 130, Canvas.getColor("green") );
        Circle c6 = new Circle(75, 410, 130, Canvas.getColor("green") );
        Circle c7 = new Circle(75, 380, 180, Canvas.getColor("green") );
        Triangle t2 = new Triangle(60, 70, 380, 540, Canvas.getColor("brown") );
        Rect r = new Rect();
        Rect r2 = new Rect(60, 130, 370, 180, Canvas.getColor("brown") );
        Rect r3 = new Rect(60, 130, 370, 290, Canvas.getColor("brown") );
        Rect r4 = new Rect(60, 170, 370, 420, Canvas.getColor("brown") );
        Rect r5 = new Rect(125, 25, 370, 320, Canvas.getColor("brown") );
        Rect r6 = new Rect(100, 25, 300, 380, Canvas.getColor("brown") );
        Triangle t = new Triangle();
        r.makeVisible();
        r2.makeVisible();
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
        t.makeVisible();
        t2.makeVisible();
        a.makeVisible();
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
import java.io.File;
import java.io.IOException;

public class TestPic
{
    public static void main(String[] args)
    {
        // Get a reference to the canvas for this drawing and set its title.
        Canvas pic = Canvas.getCanvas();
        pic.setTitle("Shapes Constructor Test Picture");
        
        // Draw my picture
        Rect sky = new Rect();
        Rect2 r = new Rect2();
        Rect3 r3 = new Rect3();
        Rect4 r4 = new Rect4();
        Rect b = new Rect();
        Circle c = new Circle();
        Arc a = new Arc();
        Triangle t = new Triangle();
        Tri2 t2 = new Tri2();
        sky.makeVisible();
        r.makeVisible();
        r3.makeVisible();
        r4.makeVisible();
        c.makeVisible();
        a.makeVisible();
        t.makeVisible();
        t2.makeVisible();

        // Save the picture to a file
        String filename = "testpic.png";
        try {
            pic.saveToFile(new File(filename));
            System.out.println("Picture saved to " + filename);
        } catch (IOException e) {
            System.err.println(e);
            System.err.println("Could not save file.");
        }
    }
}
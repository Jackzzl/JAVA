package draw;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
/*
* @author zzl
* @version 2018-11-27
*
* */
public class DrawTest {
    public static void main(String[] args){
        EventQueue.invokeLater(()->{
            JFrame frame = new DrawFrame();
            frame.setTitle("DrawTest");
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}


class DrawFrame extends JFrame {
    public DrawFrame(){
        add(new DrawComponent());
        pack();
    }
}

class DrawComponent extends JComponent{
    private static final int DEFAULT_WIDTH=400;
    private static final int DEFAULT_HEIGHT=400;

    public void paintComponent(Graphics g){
        Graphics2D g2=(Graphics2D)g;
        //draw a rectangle
        double leftX=100;
        double topY=100;
        double width=200;
        double height=150;

        Rectangle2D rect=new Rectangle2D.Double(leftX,topY,width,height);
        g2.draw(rect);

        //draw the closed ellipse

        Ellipse2D ellipse= new Ellipse2D.Double();
        ellipse.setFrame(rect);
        g2.draw(ellipse);

        //draw a diagonal line
        g2.draw(new Line2D.Double(leftX,topY,width,height));

        //draw a circle with the same center
        double centerX=rect.getCenterX();
        double centreY=rect.getCenterY();
        double radius=150;

        Ellipse2D circle=new Ellipse2D.Double();
        circle.setFrameFromCenter(centerX,centreY,centerX+radius,centreY+radius);
        g2.draw(circle);
    }
    public Dimension getPreferredSize(){
        return new Dimension(DEFAULT_WIDTH,DEFAULT_HEIGHT);
    }
}

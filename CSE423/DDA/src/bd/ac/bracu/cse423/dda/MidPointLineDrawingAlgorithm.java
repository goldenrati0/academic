package bd.ac.bracu.cse423.jogltest;

import com.jogamp.opengl.*;
import com.jogamp.opengl.awt.GLCanvas;
import com.jogamp.opengl.glu.GLU;

import javax.swing.*;

class ThirdGLEventListener implements GLEventListener {
    /**
     * Interface to the GLU library.
     */
    private GLU glu;

    /**
     * Take care of initialization here.
     */
    public void init(GLAutoDrawable gld) {
        GL2 gl = gld.getGL().getGL2();
        glu = new GLU();

        gl.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        gl.glViewport(-250, -150, 250, 150);
        gl.glMatrixMode(GL2.GL_PROJECTION);
        gl.glLoadIdentity();
        glu.gluOrtho2D(-250.0, 250.0, -150.0, 150.0);
    }

    /**
     * Take care of drawing here.
     */
    public void display(GLAutoDrawable drawable) {
        GL2 gl = drawable.getGL().getGL2();

        gl.glClear(GL2.GL_COLOR_BUFFER_BIT);
        /*
         * put your code here
         */
        drawLine(gl, 0f, 0f, 100f, 0f);
        drawLine(gl, 50f, -50f, 100f, 0f);
        ;
    }

    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
    }

    public void displayChanged(GLAutoDrawable drawable, boolean modeChanged, boolean deviceChanged) {
    }

    private int findZone(float x1, float y1, float x2, float y2) {
        float dx = x2 - x1;
        float dy = y2 - y1;

        if (Math.abs(dx) >= Math.abs(dy)) {
            if (dx > 0 && dy > 0) {
                return 0;
            } else if (dx > 0 && dy < 0) {
                return 7;
            } else if (dx < 0 && dy > 0) {
                return 3;
            } else {
                return 4;
            }
        } else {
            if (dy > 0 && dx > 0) {
                return 1;
            } else if (dy > 0 && dx < 0) {
                return 2;
            } else if (dy < 0 && dx > 0) {
                return 6;
            } else {
                return 5;
            }
        }
    }

    private void drawLine(GL2 gl, float x1, float y1, float x2, float y2) {
        System.out.println(findZone(x1, y1, x2, y2));


        float dx, dy, d, incE, incNE, x, y;
        dx = x2 - x1;
        dy = y2 - y1;
        d = 2 * dy - dx;
        incE = 2 * dy;
        incNE = 2 * (dy - dx);
        y = y1;

        gl.glPointSize(3.5f);
        gl.glBegin(GL2.GL_POINTS);

        for (x = x1; x <= x2; x++) {
            gl.glVertex2f(x, y);
            if (d > 0) {
                d = d + incNE;
                y = y + 1;
            } else {
                d = d + incE;
            }
        }
        gl.glEnd();
    }

    public void dispose(GLAutoDrawable arg0) {

    }
}

public class MidPointLineDrawingAlgorithm {
    public static void main(String args[]) {
        //getting the capabilities object of GL2 profile
        final GLProfile profile = GLProfile.get(GLProfile.GL2);
        GLCapabilities capabilities = new GLCapabilities(profile);
        // The canvas
        final GLCanvas glcanvas = new GLCanvas(capabilities);
        ThirdGLEventListener b = new ThirdGLEventListener();
        glcanvas.addGLEventListener(b);
        glcanvas.setSize(600, 600);
        //creating frame
        final JFrame frame = new JFrame("Basic frame");
        //adding canvas to frame
        frame.add(glcanvas);
        frame.setSize(800, 700);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
package bd.ac.bracu.cse423;

import com.jogamp.opengl.*;
import com.jogamp.opengl.awt.GLCanvas;
import com.jogamp.opengl.glu.GLU;

import javax.swing.*;

class EllipseThirdGLEventListener implements GLEventListener {
    private GLU glu;

    public void init(GLAutoDrawable gld) {
        GL2 gl = gld.getGL().getGL2();
        glu = new GLU();

        gl.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        gl.glViewport(-250, -150, 250, 150);
        gl.glMatrixMode(GL2.GL_PROJECTION);
        gl.glLoadIdentity();
        glu.gluOrtho2D(-250.0, 250.0, -150.0, 150.0);
    }

    public void display(GLAutoDrawable drawable) {
        GL2 gl = drawable.getGL().getGL2();

        gl.glClear(GL2.GL_COLOR_BUFFER_BIT);
        drawMidPointCircle(gl, 0, 0, 140);

        int xAxis[] = new int[8];
        int yAxis[] = new int[8];
        for (int i = 0; i < xAxis.length; i++) {
            xAxis[i] = (int) (70 * Math.cos((45 * i) * Math.PI / 180));
            yAxis[i] = (int) (70 * Math.sin((45 * i) * Math.PI / 180));
            drawMidPointCircle(gl, xAxis[i], yAxis[i], 70);
        }
    }

    public void reshape(GLAutoDrawable drawable, int x, int y, int width,
                        int height) {
    }

    public void displayChanged(GLAutoDrawable drawable,
                               boolean modeChanged, boolean deviceChanged) {
    }

    private void drawMidPointCircle(GL2 gl, int x1, int y1, int r) {
        gl.glPointSize(3.0f);
        gl.glBegin(GL2.GL_POINTS);

        double x = 0;
        double y = r;
        double d = 1 - r;

        gl.glVertex2d(x + x1, y + y1);
        gl.glVertex2d(y + x1, x + y1);
        gl.glVertex2d(y + x1, -x + y1);
        gl.glVertex2d(x + x1, -y + y1);
        gl.glVertex2d(-x + x1, -y + y1);
        gl.glVertex2d(-y + x1, -x + y1);
        gl.glVertex2d(-y + x1, x + y1);
        gl.glVertex2d(-x + x1, y + y1);

        while ((int) y > (int) x) {
            if ((int) d < 0) d += 2 * x + 3;
            else {
                d += 2 * (x - y) + 5;
                y--;
            }
            x++;
            gl.glVertex2d(x + x1, y + y1);
            gl.glVertex2d(y + x1, x + y1);
            gl.glVertex2d(y + x1, -x + y1);
            gl.glVertex2d(x + x1, -y + y1);
            gl.glVertex2d(-x + x1, -y + y1);
            gl.glVertex2d(-y + x1, -x + y1);
            gl.glVertex2d(-y + x1, x + y1);
            gl.glVertex2d(-x + x1, y + y1);
        }
        gl.glEnd();
    }

    private void drawLineM(GL2 gl, int x1, int y1, int x2, int y2) {

        gl.glPointSize(08.0f);
        gl.glBegin(GL2.GL_POINTS);

        int zone = findZone(x1, y1, x2, y2);

        int tempX1, tempX2;

        switch (zone) {
            case 1:
                tempX1 = x1;
                tempX2 = x2;
                x1 = y1;
                x2 = y2;
                y1 = tempX1;
                y2 = tempX2;
            case 2:
                tempX1 = x1;
                tempX2 = x2;
                x1 = y1;
                x2 = y2;
                y1 = -tempX1;
                y2 = -tempX2;
            case 3:
                x1 = -x1;
                x2 = -x2;
            case 4:
                x1 = -x1;
                x2 = -x2;
                y1 = -y1;
                y2 = -y2;
            case 5:
                tempX1 = x1;
                tempX2 = x2;
                x1 = -y1;
                x2 = -y2;
                y1 = -tempX1;
                y2 = -tempX2;
            case 6:
                tempX1 = x1;
                tempX2 = x2;
                x1 = -y1;
                x2 = -y2;
                y1 = tempX1;
                y2 = tempX2;
            case 7:
                y1 = -y1;
                y2 = -y2;
        }

        int dx = x2 - x1;
        int dy = y2 - y1;

        int d = 2 * dy - dx;
        int incE = 2 * dy;
        int incNE = 2 * (dy - dx);
        double y = y1;
        double x = x1;

        for (x = x1; x <= x2; x++) {
            switch (zone) {
                case 1:
                    gl.glVertex2d(y, x);
                case 2:
                    gl.glVertex2d(-y, x);
                case 3:
                    gl.glVertex2d(-x, y);
                case 4:
                    gl.glVertex2d(-x, -y);
                case 5:
                    gl.glVertex2d(-y, -x);
                case 6:
                    gl.glVertex2d(y, -x);
                case 7:
                    gl.glVertex2d(x, -y);
                default:
                    gl.glVertex2d(x, y);
            }

            if (d > 0) {
                d += incNE;
                y++;
            } else d += incE;
        }
        gl.glEnd();
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

    public void dispose(GLAutoDrawable arg0) {

    }
}

public class Floral {
    public static void main(String args[]) {
        //getting the capabilities object of GL2 profile
        final GLProfile profile = GLProfile.get(GLProfile.GL2);
        GLCapabilities capabilities = new GLCapabilities(profile);
        // The canvas
        final GLCanvas glcanvas = new GLCanvas(capabilities);
        EllipseThirdGLEventListener b = new EllipseThirdGLEventListener();
        glcanvas.addGLEventListener(b);
        glcanvas.setSize(400, 400);
        //creating frame
        final JFrame frame = new JFrame("Basic frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //adding canvas to frame
        frame.add(glcanvas);
        frame.setSize(640, 480);
        frame.setVisible(true);
    }
}
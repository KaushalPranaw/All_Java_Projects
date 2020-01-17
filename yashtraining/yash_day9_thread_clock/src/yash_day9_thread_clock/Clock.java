package yash_day9_thread_clock;
import java.awt.Graphics;
import java.util.Date;
 
public class Clock extends java.applet.Applet implements Runnable {
    private Thread threadObjClock = null;
    public void start() {
        if (threadObjClock == null) {
            threadObjClock = new Thread(this, "My Clock");
            threadObjClock.start();
        }
    }
    public void run() {
    Thread myThread = Thread.currentThread();
        while (threadObjClock == myThread) {
            repaint();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e){ }
        }
    }
    public void paint(Graphics g) {
        Date now = new Date();
        g.drawString(now.getHours() + ":" + 
             now.getMinutes() + ":" + 
             now.getSeconds(), 5, 10);
    }
    public void stop() {
        threadObjClock = null;
    }
}
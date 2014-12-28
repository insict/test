/**
 * Created by INSICT on 06.02.14.
 */
public class Test {
    public static void main(String[] args) {
        Watek w = new Watek();
        new Thread(w).start();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        w.setRun(false);

    }
}

class Watek implements Runnable {

    private boolean run;

    public Watek() {
        run = true;
    }

    @Override
    public void run() {
        while (run) {
            System.out.println(System.nanoTime());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void setRun(boolean run) {
        this.run = run;
    }
}
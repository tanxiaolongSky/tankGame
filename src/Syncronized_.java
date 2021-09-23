public class Syncronized_ {
    public static void main(String[] args) {

        Cat cat = new Cat();
        new Thread(cat).start();
        new Thread(cat).start();
    }
}

class Cat implements Runnable {
    static int ticketNum = 10;
    static boolean loop = true;

    @Override
    public void run() {
        while (loop) {
            sell();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void sell() {
        synchronized (this) {
            if (ticketNum > 0) System.out.println(Thread.currentThread().getName() + "卖票：" + ticketNum--);
            else loop = false;
        }
    }
}
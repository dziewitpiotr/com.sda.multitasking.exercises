package multitask;



public abstract class Producer implements Runnable{

    protected boolean working;
    private Thread watek;
    protected Magazyn magazyn;

    public void start() {
        working = true;
        watek = new Thread(this);
        watek.start();
    }

    public Producer(Magazyn magazyn) {
        this.magazyn = magazyn;
    }
}

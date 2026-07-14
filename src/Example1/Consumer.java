package Example1;

class Consumer implements Runnable {

    private Box box;

    Consumer(Box box){
        this.box = box;
    }

    @Override
    public void run() {

        try {
            for(int i=1;i<=5;i++){

                box.consume();

                Thread.sleep(1500);

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}

package Example1;

class Producer implements Runnable {

    private Box box;

    Producer(Box box){
        this.box = box;
    }

    @Override
    public void run() {

        try {

            for(int i=1;i<=5;i++){

                box.produce("Item " + i);

                Thread.sleep(1000);

            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}

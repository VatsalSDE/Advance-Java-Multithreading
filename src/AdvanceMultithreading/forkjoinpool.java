package AdvanceMultithreading;

import java.util.concurrent.RecursiveTask;

public class forkjoinpool {
    public static void main(String[] args) {

    }
}

class SumTask extends RecursiveTask<Integer>{

    private int[] arr;
    private int start;
    private int end;

    public SumTask(int[] arr , int start , int end){
        this.arr=arr;
        this.start=start;
        this.end=end;
    }
    @Override
    protected Integer compute(){
        // base condition
        if(end-start<=2){
            int sum=0;
            for(int i=start;i<=end;i++){
                sum+=arr[i];
            }
            return sum;
        }

        // main logic
        int mid =(start+end)/2;

        // one part start to mid
        // one part mid +1 to end

        SumTask leftTask= new SumTask(arr,start,mid);
        SumTask rightTask= new SumTask(arr,mid+1,end);

        leftTask.fork();

        int sum2 = rightTask.compute();

        int sum1=rightTask.join();

        return sum1 + sum2;
    }
}

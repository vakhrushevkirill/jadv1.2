import java.util.concurrent.Callable;

class MyThread implements Callable<Integer> {
    public int countMessage = 0;



    @Override
    public Integer call() throws Exception {
        int countIter = 3;
        try {
            while(countMessage <= countIter) {
                Thread.sleep(2500);
                System.out.println(Thread.currentThread().getName() + ". Всем привет!" + " Месседж " + countMessage);
                countMessage++;
            }
        } catch (InterruptedException err) {

        } finally{
            System.out.println(Thread.currentThread().getName() + " завершен." + " Месседж " + countMessage);
        }
        return countMessage;
    }
}
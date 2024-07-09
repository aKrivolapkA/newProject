package src.main.java.lesson14.sinchronizacjaPotokow;

public class CommonResource1 {
    int x = 1;

   synchronized  void increment() { // cенхронезированный метод
       x=1;
        for (int i = 1; i < 5; i++) {
            System.out.printf(" %s  result.x = %d \n", Thread.currentThread().getName(), x);
          x++;
        } try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

    }
    }

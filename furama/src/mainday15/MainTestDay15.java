package mainday15;

import runningApplication.ApplicationRunning;
import subthread.SubThreadTime;

public class MainTestDay15 implements ApplicationRunning {
    public static void main(String[] args) {
        MainTestDay15 mainDay15 = new MainTestDay15();
        mainDay15.run();
    }

    public static void runningRequestDay15() {
        SubThreadTime subThreadTime = new SubThreadTime();
        Thread threadTime = new Thread() {
            @Override
            public void run() {
                subThreadTime.showTime(1);
            }
        };
        Thread threadData = new Thread() {
            @Override
            public void run() {
                subThreadTime.showDataAFile();
            }
        };
        threadTime.start();
        threadData.start();
    }



    @Override
    public void run() {
        runningRequestDay15();

    }

}

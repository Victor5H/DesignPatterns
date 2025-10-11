package codeWithAryan.behavioral.observer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws Exception{
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        CodeWithAryan choding = new CodeWithAryan();

        EmailNotification emailNotification = new EmailNotification(choding);
        PhoneNotification phoneNotification = new PhoneNotification(choding);
        executorService.submit(emailNotification);
        executorService.submit(phoneNotification);
        choding.addSubscriber(emailNotification);choding.addSubscriber(phoneNotification);
        Thread.sleep(1000);
        choding.postNewVideo("latest1");
        choding.removeSubscriber(emailNotification);
        Thread.sleep(1000);
        choding.postNewVideo("latest");



        executorService.shutdown();
    }
}

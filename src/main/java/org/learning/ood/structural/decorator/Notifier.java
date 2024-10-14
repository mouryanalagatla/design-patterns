package org.learning.ood.structural.decorator;

public class Notifier implements INotifier {
    // Concrete Implementation where we supply all the required dependencies.
    @Override
    public void sendNotification(String userId, String message) {
        System.out.println("Mail Notification : " + message +" "+ userId);
    }
}

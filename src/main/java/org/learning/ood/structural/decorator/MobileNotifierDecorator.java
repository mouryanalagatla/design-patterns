package org.learning.ood.structural.decorator;

public class MobileNotifierDecorator extends BaseNotifierDecorator {

    public MobileNotifierDecorator(INotifier INotifier) {
        super(INotifier);
    }

    @Override
    public void sendNotification(String userId, String message) {
        super.sendNotification(userId, message);
        System.out.println("Mobile Notification : " + message + " " + userId);
    }
}

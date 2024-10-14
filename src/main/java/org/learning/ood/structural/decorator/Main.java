package org.learning.ood.structural.decorator;

public class Main {
    public static void main(String[] args) {
        INotifier notifier = new PushNotificationDecorator(
                new MobileNotifierDecorator(
                        new Notifier()
                )
        );
        notifier.sendNotification("123", "Hello World");
    }
}

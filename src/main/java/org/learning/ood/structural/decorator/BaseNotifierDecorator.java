package org.learning.ood.structural.decorator;

public abstract class BaseNotifierDecorator implements INotifier {

    protected final INotifier INotifier;

    public BaseNotifierDecorator(INotifier INotifier) {
        this.INotifier = INotifier;
    }

    @Override
    public void sendNotification(String userId, String message) {
        this.INotifier.sendNotification(userId, message);
    }
}

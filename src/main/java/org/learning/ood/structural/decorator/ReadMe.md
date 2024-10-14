### When to Use the Decorator Pattern
The Decorator Pattern allows you to add new functionality to an existing object without altering its structure. This design pattern falls under the structural category as it acts as a wrapper around an existing class.

#### Example 1: Notification System

In this example, we define INotifier as an interface, and Notifier as a concrete implementation for sending a default type of notification to the user.

`Base Interface`: INotifier
`Concrete Implementation`: Notifier
If we want to extend the capabilities of our notification system to support various types of notifications, such as push notifications or SMS, we can achieve this using the Decorator Pattern.

#### Example 2: Pizza Shop

Consider a pizza shop where we start with a basic pizza represented by an interface, IPizza, and a concrete class, Pizza, that makes a plain pizza.

`Base Interface`: IPizza
`Concrete Class`: Pizza
We can extend the pizza-making process by adding decorators like TomatoDecorator and CheesyDecorator without altering the original pizza class. This allows for greater flexibility and customization in creating different types of pizzas.


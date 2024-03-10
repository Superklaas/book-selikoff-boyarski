package sealed_classes.subclass_nested_permits;

public sealed class Animal permits Animal.Penguin {

    final class Penguin extends Animal {

    }

}

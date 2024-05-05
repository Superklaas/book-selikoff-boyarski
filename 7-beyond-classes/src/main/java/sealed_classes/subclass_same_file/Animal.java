package sealed_classes.subclass_same_file;

public sealed class Animal permits Penguin {
}

final class Penguin extends Animal {}

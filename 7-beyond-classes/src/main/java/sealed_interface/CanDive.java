package sealed_interface;

public sealed interface CanDive extends CanSwim permits CanScubaDive {
}

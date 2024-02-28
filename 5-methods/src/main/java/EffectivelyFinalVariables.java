public class EffectivelyFinalVariables {

    public String zooFriends() {
        final String name = "Harry the Hippo";
        var size = 10;
        final boolean wet;
        if(size > 100) size++;
        name.substring(0);
        wet = true;
        return name;
    }

}

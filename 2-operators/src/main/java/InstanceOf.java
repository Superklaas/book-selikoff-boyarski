public class InstanceOf {

    public static void main(String[] args) {

        Integer zooTime = Integer.valueOf(9);
        Number num = zooTime;
        Object obj = zooTime;

        System.out.println(zooTime instanceof Integer); // true
        System.out.println(num instanceof Integer); // true
        System.out.println(obj instanceof Integer); // true

    }

}

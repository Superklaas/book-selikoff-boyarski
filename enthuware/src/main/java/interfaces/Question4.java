package interfaces;

public class Question4 {}

interface Book{
    public default String getId(){
        return "ISBN123456";
    }
}

interface Encyclopedia extends Book{
    String getId();
}

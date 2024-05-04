package flow_control;

public class ContinueStatement {
    public static void main(String[] args) {
        CLEANING:
		for (char stables = 'a'; stables <= 'd'; stables++) {
            for (int leopard = 1; leopard < 4; leopard++) {
                if (stables == 'b' || leopard == 2) {
                    // continue CLEANING;
                    continue;
                }
                System.out.println("Cleaning: " + stables + "," + leopard);
            }
        }
    }
}

/*
* when using continue
* stables	a
* leopard	1
* print a1 a3 c1 c3 d1 d3
*
* when using continue CLEANING
* a1 c1 d1
* */



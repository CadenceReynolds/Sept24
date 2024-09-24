import java.math.BigDecimal;
import java.math.BigInteger;

public class App {

    public static void main(String[] args) {
        BigInteger num1 = new BigInteger("675839283718976898767534565647543579987634798787654343212");
        BigInteger num2 = new BigInteger("567468274683754287165847162873461872587251876187268437261897097887457645794569766346347546676349462");
        BigInteger GCD = num1.gcd(num2);
        System.out.println(GCD);

        BigDecimal num3 = new BigDecimal("576483748937.20391203819729");
        BigDecimal num4 = new BigDecimal("29372193721937.54039294729");

        num3 = num3.pow(2);
        num4 = num4.pow(2);

        System.out.println(num3);
        System.out.println(num4);

    }




}

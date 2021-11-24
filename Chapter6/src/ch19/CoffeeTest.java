package ch19;

public class CoffeeTest {
    public static void main(String[] args) {

        Coffee etiopiaCoffee = new EtiopiaAmericano();
        etiopiaCoffee.brewing();

        System.out.println();
        Coffee etiopiaLatte = new Latte(etiopiaCoffee);
        etiopiaLatte.brewing();

        System.out.println();
        Coffee etiopiaMocha = new Mocha(new Latte(new EtiopiaAmericano()));
        etiopiaMocha.brewing();


        System.out.println();
        System.out.println();
        Coffee keyaCoffee = new KeyaAmericano();
        keyaCoffee.brewing();

        System.out.println();
        Coffee keyaLatta = new Latte(new KeyaAmericano());
        keyaLatta.brewing();

        System.out.println();
        Coffee keyaMocha = new Mocha(new Latte(new KeyaAmericano()));
        keyaMocha.brewing();

        System.out.println();
        Coffee keyaWhipping = new WhippingCream(new KeyaAmericano());
        keyaWhipping.brewing();
    }
}

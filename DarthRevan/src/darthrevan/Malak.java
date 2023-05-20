package darthrevan;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Malak extends Revan {
    /*Inheritance and other attributes
    */
    private String hairloss;
    private String tattoo;

    public Malak(String lightsaberColor, int MAX_MIDICHLORIANS, String hairloss, String tattoo) {
        super("red");
        this.hairloss = hairloss;
        this.tattoo = tattoo;//Constructor
    }


    /**
     * @return the hairloss
     */
    public String getHairloss() {
        return hairloss;
    }

    /**
     * @param hairloss the hairloss to set
     */
    public void setHairloss(String hairloss) {
        this.hairloss = hairloss;
    }

    /**
     * @return the tattoo
     */
    public String getTattoo() {
        return tattoo;
    }

    /**
     * @param tattoo the tattoo to set
     */
    public void setTattoo(String tattoo) {
        this.tattoo = tattoo;
    }

    public void Malak(String lightsaberColorString, String hairloss, String tattoo) {
        try {
            //Again in case it throws an Exception
            Scanner input = new Scanner(System.in);
            System.out.println("Please give lightsaber Color");
            lightsaberColor = input.nextLine();
            System.out.println("Give amount of hair");//input
            hairloss = input.nextLine();
            System.out.println("Give a tattoo");
            tattoo = input.nextLine();
            if (lightsaberColor.equals("red") && hairloss.equals("bald")) {
                System.out.println("Darth Malak");//Wanted sith
            } else {
                System.out.println("Not Correct Guy");
            }

        } catch (InputMismatchException myInput) {
           myInput.getStackTrace();
            //Catching Exception
            System.out.println("Wrong answer");//Message of wrong input
        }

    }

}

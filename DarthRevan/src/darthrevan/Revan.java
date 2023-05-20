package darthrevan;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Revan {

    protected String lightsaberColor;
    protected final int MAX_MIDICHLORIANS = 18000;//Attributes

    public Revan(String lightsaberColor) {
        this.lightsaberColor = lightsaberColor;
    }

    /**
     * @return the lightsaberColor
     */
    public String getLightsaberColor() {
        return lightsaberColor;
    }

    /**
     * @param lightsaberColor the lightsaberColor to set
     */
    public void setLightsaberColor(String lightsaberColor) {
        this.lightsaberColor = lightsaberColor;//setters getters
    }

    public void LightsaberColor(String lightsaberColor, int MAX_MIDICHLORIANS) throws IOException {
        try {//In case it throws an Exception
            Scanner star = new Scanner(System.in);
            System.out.println("Please mention Revan's Lightsaber Color");
            lightsaberColor = star.nextLine();//Input of lightsaber Color!!!
            switch (lightsaberColor) {
                case "Purple" -> System.out.println("Reborn Revan,capable of beating Darth Malak," + MAX_MIDICHLORIANS + " midichlorians");
                case "Red" -> System.out.println("Ally with Darth Malak");
                default -> System.out.println("Not Revan");
                //Possible cases 
            }
            try (BufferedWriter revie = new BufferedWriter(new FileWriter("Output.txt"))) {
                revie.write("Midichlorians:" + MAX_MIDICHLORIANS + "\n");
                revie.write("LightSaber:" + lightsaberColor);
                //Stroing data in a new file
            }
        } catch (InputMismatchException input) {
            input.getStackTrace();
            //Catching the Exception
            System.out.println("Oops wrong answer try again!!!");//In case of Exceptions possible message
        }
    }

}

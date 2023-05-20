
package darthrevan;

import java.io.IOException;


public class DarthRevan {


    public static void main(String[] args) throws IOException {
        Revan R = new Revan("Purple");//Revan Object
        R.LightsaberColor("Purple", 18000);//Revan Method
        Malak malak = new Malak("red",18000,"bald","lines");//Malak Object
        malak.Malak("red", "bald", "lines");//Malak Method
    }
    
}

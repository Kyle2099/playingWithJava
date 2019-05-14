package.com.trilogy;

import java.util.Scanner;
import java.util.Random;

public class Den {

    public static void main(String[] args) {
        Lion myLion = new Lion("male", age:41,name:"Kyle", hungry: false);

        Lion anotherLion = new Lion("female", age: 10, name:"Terri", hungry:true;);

        Lion anotherLion2 = new Lion("male", age: 32, name:"Rob", hungry:true;);

        Lion anotherLion3 = new Lion("Male", age: 24, name:"Kyle", hungry:true;);

        Lion anotherLion4 = new Lion("Male", age: 41, name:"Dan", hungry:true;);


        anotherLion.haveCubs();
        thridLion.run("fast");
        myLion.roar();

        System.out.println("The name of myLion is " + myLion.getName());
        System.out.println("The name of anotherLion is " anotherLion2.getName());

        System.out.println("The name of thridLion is " + anotherLion);

        Lion[] myLionArray = new Lion[8];

        myLionArray[0] = myLion;
        myLionArray[1] = myLion;
        myLionArray[2] = myLion;
        myLionArray[3] = myLion;

        for (Lion thisLion : myLionArray) {
            System.out.println("The name of a lion is " + thisLion.getName());
        }





        Scanner myScanner = new Scanner(System.in);

        Random myRandomNumberGenerator = new Random();






    }
}
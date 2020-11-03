package PicsArt;

public class Hello {
    public static void main(String[] args) {

        int x, y, z;

        // System.out.println(a+b);
        // System.out.println(a*b);
        // System.out.println(a-b);
        // System.out.println(a%b);
        //System.out.println(a/b);


        x = 4;
        y = 7;
        z = x++ - --y;
        System.out.println(z--);
        System.out.println(++x);
        System.out.println("x =" + x);
        System.out.println("y =" + y);
        System.out.println("z =" + z);


        boolean b = x == 5;
        System.out.println(b);
        System.out.println(x != 6);
        System.out.println(x == 76);
        System.out.println(x > 76);
        System.out.println(x < 76);
        System.out.println(x >= 40);
        System.out.println(x <= 53);


        boolean p = x >= 0 && x <= 10;
        System.out.println(p);

        System.out.println(x < 10 || x % 15 == 0);

        int[] myArray = new int[5];
        myArray[0] = 7;
        myArray[4] = 7;
        System.out.println(myArray[2]);
        System.out.println(myArray.length);
        System.out.println(myArray[myArray.length-1]);


        double[] doubleArray = {1.2 , 32.4};
        // double[] doubleArray = new double [4];
        // doubleArray = 1.2;
        // doubleArray = 32.4;


        x = -45;

        if(x>0)
            System.out.println("pozitive");
        else
            System.out.println("not pozitive");



        if (x>0) {
            System.out.println("pozitive");
        }else {
            if(x<0){
                System.out.println("negative");
            }else{
                System.out.println("zero");}

        }

        x = 21;

        switch (x){
            case 1:
                System.out.println("mek");
                break;
            case 2:
                System.out.println("erku");
                break;
            case 3:
                System.out.println("ereq");
                break;
            default:
                System.out.println("meca");
                break;
        }




    }
}


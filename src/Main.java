import java.util.Random;

public class Main {
    public static void main(String [] args) {

        int i = 10;

        //String s1 = new String("Vishal");
        String s1 = "Vishal";
        System.out.println(s1 + " " + s1.length()) ;
        System.out.println();

        //s1 = new String("BitCode");
        s1 = "BitCode";
        System.out.println(s1 + " " + s1.length()) ;
        System.out.println();

        String s2 = "BitCode";
        System.out.println("s1 == s2 -> " + (s1 == s2));

        int len = "this is a string".length();
        s2.replace('C', 'c');


        //Ragged array
        /*int [][] marks = new int[4][];
        Random random = new Random();

        marks[0] = new int[3];
        marks[1] = new int[4];
        marks[2] = new int[2];
        marks[3] = new int[3];

        for(int i = 0; i < marks.length; i++) {
            for(int j = 0; j < marks[i].length; j++) {
                marks[i][j] = random.nextInt() % 100;
            }
        }
        System.out.println();

        for(int i = 0; i < marks.length; i++) {
            for(int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }*/


        /*//int [] arr = new int[] {11, 22, 33, 44, 55};
        int [] arr = {11, 22, 33, 44, 55};

        arr = new int[] {1, 2, 3, 4, 5, 6};
        //arr = {11, 22}; //will not work*/


        /*Random random = new Random();

        //int [][] marks = new int[3][2];
        int [][] marks = new int[][] { {11, 22}, {33, 44}, {55, 66} };
        //int [][] marks = { {11, 22}, {33, 44}, {55, 66} };

        for(int i = 0; i < marks.length; i++) {
            for(int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }

        for(int i = 0; i < marks.length; i++) {
            for(int j = 0; j < marks[i].length; j++) {
                marks[i][j] = random.nextInt() % 100;
            }
        }
        System.out.println();

        for(int i = 0; i < marks.length; i++) {
            for(int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }*/

        /*char [] carr = new char[5];
        int [] arr = new int[0];*/

        /*Stack s = new Stack(4);
        boolean res = s.push(10);

        if(res) {
            System.out.println("Success action");
        }
        else {
            System.out.println("Fail action");
        }*/

        /*int [] arr = new int[5];

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        arr[0] =10;
        arr[3] = 30;

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        arr = new int[4];
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        arr = new int[6];
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();*/




        /*float f = 3.145678f;
        //int i = f; //not okay because possible loss of data
        int i = (int) f;
        float f1 = 10; //no loss of data so its okay for java*/


    }
}

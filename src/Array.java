public class Array {
    public static void main(String[] args){
    talks1_1();
    talks1_2();
    talks1_3();
    talks4_1();

    }
    public static void talks1_1(){
        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        for (int i = array.length - 1; i >= 0; i--) {
            if (i != 0)
                System.out.print(array[i] + ", ");
            else
                System.out.print(array[i]);
        }
        System.out.println();

    }
    public static void talks1_2(){
        double[] array = {1.57, 7.654, 9.986 };
         for (int i = array.length - 1; i >= 0; i--) {
            if (i != 0)
                System.out.print(array[i] + ", ");
            else
                System.out.print(array[i]);
        }
        System.out.println();
    }
    public static void talks1_3(){
        int[] array = new int[4];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        for (int i = array.length - 1; i >= 0; i--) {
            if (i != 0)
                System.out.print(array[i] + ", ");
            else
                System.out.println(array[i]);
        }
        System.out.println();

    }
    public static void talks4_1() {
        int[] array = new int[3];
        array[0] = 1;
        array[1] = 5;
        array[2] = 8;
                for (int i = 0; i < 3; i++) {
            if (array[i] % 2 != 0) {
                array[i] = array[i] + 1;
                System.out.print(array[i] + " ");
            }

            else
                System.out.print(array[i] + " ");
        }
    }

}
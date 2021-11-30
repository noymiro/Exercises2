import java.util.Arrays;
public class Exe6 {


        public static void main(String[] args) {
            int arrB[] = {10, 20, 30, 40, 50, 60, 70};
            int arrC[] = {10, 19, 30, 39, 50, 58, 70};
            int arrA[] = intersection(arrB, arrC);
            boolean equal = strangers(arrA);
            System.out.println(Arrays.toString(arrA));
            System.out.println(equal);
        }

        public static int[] intersection(int[] newArrB, int[] newArrC) {
            int i;
            int j;
            int g = 0;
            int value = 0;
            int[] arrCheck = new int[newArrB.length];
            for (i = 0; i < newArrB.length; i++) {
                for (j = 0; j < newArrC.length; j++) {
                    if (newArrB[i] == newArrC[j]) {
                        arrCheck[g] = newArrB[i];
                        g++;
                        value++;
                    }
                }
            }
            int[] arrA = new int[value];
            for (g=0;g<=arrCheck.length-1;g++){
                if (arrCheck[g] != 0){
                    arrA [g]= arrCheck [g];
                }
            }
            return arrA;
        }

        public static boolean strangers ( int[] newArrA){
            boolean equal;
            if (newArrA.length==0) {
                equal = false;
            } else
            {
                equal = true;
            }
            return equal;
        }
}

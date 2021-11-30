
public class Exe4 {


    public static void main(String[] args) {
        int arr[] = {1, 4, 7, 1, 8, 9, 2, 1, 3, 8};
        int [] array2=numbersArr(arr);
        for (int i = 0; i < arr.length-1 ; i++) {
            System.out.print(array2[i]);
        }

    }
    public static boolean check(int number , int index , int[] array){
        boolean isDuplicate = false;
        for (int i = index; i >=0 ; i--) {
            if (array[i]==number){
                isDuplicate = true;
                break;
            }
        }
        return isDuplicate;
    }

    public static int[] numbersArr(int arr[]) {
        int[] array1 = new int[arr.length];
        int j = -1;
            for (int i = 0; i < (arr.length-1); i++) {
                if (!check(arr[i],j,array1)) {
                    j++;
                    array1[j] = arr[i];
                }
            }
        return array1;
    }
}




    //כתבו פונקציה המקבלת מערך של מספרים, ומחזירה מערך של מספרים ללא כפילויות.
    // כלומר, אם המערך המקורי הוא {1,4,7,1,8,9,2,1,3,8,0}, המערך המוחזר יהיה {1,4,7,8,9,2,3,0}.



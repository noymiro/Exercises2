public class Exe5 {
        public static void main(String[] args) {
            int upDownArray[] = {1,3,6,11,10,9,4,2,0};
            int summitIndex = check (upDownArray);

            System.out.println("The summit index is:" +summitIndex);
        }

        public static int check (int [] newArray){
            int summitIndex=0;
            int i;
            for ( i = 0; i< newArray.length-1; i++) {
                if (newArray[i] <= newArray[i + 1]) {
                    summitIndex++;
                }
                if (newArray[i]>newArray[i+1]){
                    for (i=i;i<newArray.length-1;i++)
                    {
                        if (newArray[i]<newArray[i+1]){
                            summitIndex = -1;
                        }
                    }
                }
            }
            return summitIndex;
        }
    }
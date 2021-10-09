
public class task1 {

    public static void main(String[] args) {

//Given an integer array nums, return the third distinct
// maximum number in this array. If the third maximum does not exist,
// return the maximum number.

        int [] numsArray1 = {1, 2, 3, 4, 5};
        int [] numsArray2 = {7, 2, 4, 9, 11};
        int [] numsArray3 = {12, 1, 65, 88, 65};

//Array 1

      /*  int max1 = numsArray1[0];
        int max2 = numsArray1[0];
        int max3 = numsArray1[0];
        for (int i = 0; i < numsArray1.length; i++){
            if (max1 < numsArray1[i]){
                max3 = max2;
                max2 = max3;
                max1 = numsArray1[i];
            }
        }
        System.out.println("the third maximum number in Array1 is " + max3);*/

//array 2
        int max1 = numsArray2[0];
        int max2 = numsArray2[0];
        int max3 = numsArray2[0];
        for (int i = 0; i < numsArray2.length; i++){
            if (max1 < numsArray2[i]){
                max3 = max2;
                max2 = max3;
                max1 = numsArray2[i];
            }
        }
        System.out.println("the third maximum number in Array2 is " + max3);

//Array 3
/*
        int max1 = numsArray3[0];
        int max2 = numsArray3[0];
        int max3 = numsArray3[0];
        for (int i = 0; i < numsArray3.length; i++){
            if (max1 < numsArray3[i]){
                max3 = max2;
                max2 = max3;
                max1 = numsArray3[i];
            }
        }
        System.out.println("the third maximum number in Array3 is " + max3);*/



    }
}
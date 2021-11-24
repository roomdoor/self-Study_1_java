package ch20;

public class ArrayTest {

    public static void main(String[] args) {

        int[] arr = new int[10]; //new int[] {1,2,3,4,5,6,7,,8,9,10} 이렇게 쓰면 for 문 없이 직접 초기화 가능
        int total = 0;

        for (int i = 0, num = 1; i < arr.length; i++) {
            arr[i] = num++;
        }

        for (int num : arr) { // 배열 0 엘리먼트 부터 n-1 엘리먼트 (처음부터 끝까지) 쓸떄 이렇게 씀) enhanced for 문
            total += num;
        }
        System.out.println(total);
//
//        double[] arr1 = new double[8];
//        int count = 0;
//
//
//        for (int i = 0, j = 0; i < 4; i++) {
//            arr1[i] +=  j + 0.7;
//            count++;
//            j++;
//        }
//
//        double mul = 1;
//
//        for(int i = 0; i < count; i++){
//            System.out.println(arr1[i]);
//            System.out.println(count);
//        }
//        for (int j = 0; j < count; j++){
//
//            mul = mul*arr1[j];
//        }
//
//        System.out.println(mul);






    }


}

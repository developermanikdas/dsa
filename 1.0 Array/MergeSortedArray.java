class MergeSortedArray {

    public static void solution(int[] arr1, int m, int[] arr2, int n ){

        int i = m-1;  // last valid(non-zero) index of arr1 
        int j = n-1;  // last index of arr1
        int k = m+n-1;  // last index of arr1

        while (i>= 0 && j>=0) {
            if(arr2[j] > arr1[i]){
                arr1[k] = arr2[j];
                j--;
            }else{
                arr1[k] = arr1[i];
                i--;
            }

            k--; 
        }

        while(j >= 0){
            arr1[k] = arr2[j]; 
            j--;
            k--; 
        }

        for(int l = 0; l< m+n; l++){
            System.out.println(arr1[l]);
        }

    }
    public static void main(String[] args){

        int[] arr1 = {2,4,5,0,0,0,0};
        int[] arr2 = {1,3,6,7};
        int m = 3;
        int n = 4; 

        solution(arr1, m, arr2, n);

    }
}

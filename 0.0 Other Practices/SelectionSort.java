class SelectionSort {
public static void main(String[] args){
        int[] arr = {5, 4, 1, 3, 2};

        int n = arr.length; 
        
        for(int i = 0; i < n; i++){
            int max = arr[i]; 
            for(int j = 0; j < n; j++){
                if(arr[j] > max){
                    max = arr[j]; 
                }
                System.out.println(max);
            }
            arr[i] = max; 
        }
        
        for(int num : arr){
            System.out.print(num + " "); 
        }
    }
}

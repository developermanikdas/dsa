class SingleNumber {

    public static void solution(int[] arr){
        int sum = 0; 
        for(int i=0; i< arr.length; i++){
            sum = sum^arr[i]; 
        }
        System.out.println(sum);
    }
    public static void main(String[] args){
        int[] arr = {1,4,2,4,1,2,6};
        solution(arr); 
    }
}

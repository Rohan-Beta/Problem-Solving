class Firstclass {
    public static void main(String[] args) {
        
        int arr[] = {2 , 40 , 3 , 1};

        int max = arr[0];
        int min = max;

        for(int i = 0; i < arr.length; i += 1) {

            if(arr[i] > max) {
                max = arr[i];
            }
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}

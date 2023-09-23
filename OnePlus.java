public class OnePlus {
    public static int[] onePlus(int[] num){
        int len=num.length;
        if(num[len-1]<9){
            num[len-1]+=1;
            return num;
        }
        else{
            int arr[]=new int[len+1];
            for(int i=0;i<len-1;i++){
                arr[i]=num[i];
            }
            arr[len-1]=1;
            arr[len]=0;
            return arr;
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,9};
        for(int i=0;i<arr.length;i++)
        System.out.print(arr[i]+" ");
        System.out.println();
        int arr1[]=onePlus(arr);
        for(int i=0;i<arr1.length;i++)
        System.out.print(arr1[i]+" ");
        System.out.println();
        
    }
    
    
}

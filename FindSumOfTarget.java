import java.util.*;
public class FindSumOfTarget {
    public static ArrayList<ArrayList<Integer>> findTargetIndex(int[] arr,int target,ArrayList<ArrayList<Integer>> ansList,ArrayList<Integer> list,int sum,int index){
        if(arr.length==index){
            if(sum==target){
                ansList.add(new ArrayList<>(list));
            }
            return ansList;
        }
        sum+=arr[index];
        list.add(index);
        findTargetIndex(arr,target,ansList,list,sum,index+1);
        list.remove(list.size()-1);
        sum-=arr[index];
        findTargetIndex(arr,target,ansList,list,sum,index+1);
        return ansList;
    }

    public static ArrayList<ArrayList<Integer>> findSumOfTarget(int[] arr,int target){
        ArrayList<ArrayList<Integer>> ansList=new ArrayList<>();
        ArrayList<Integer> list=new ArrayList<>();
        return findTargetIndex(arr,target,ansList,list,0,0);
    }
    public static void main(String[] args) {
        int arr[]={3,2,4};
        int target=6;
        ArrayList<ArrayList<Integer>> ans=findSumOfTarget(arr,target);
        for(ArrayList<Integer> list:ans){
            System.out.print("[");
            for(Integer ele:list){
                System.out.print(ele+" ");
            }
            System.out.println("]");
        }
    }
}

import java.util.HashMap;
public class MissingNumber{
public static int findMissingNumber(int[]arr){
HashMap<Integer,Integer>numCount=new HashMap<>();
for(inti=0;i<arr.length;i++){
if(arr[i]>0&&arr[i]<=10){
if(numCount.containsKey(arr[i])){
numCount.put(arr[i],numCount.get(arr[i])+1);
}else{
numCount.put(arr[i],1);
}
}
}
intmissingNumber=1;
for(inti=1;i<=10;i++){
if(!numCount.containsKey(i)){
missingNumber=i;
break;
}elseif(numCount.get(i)==0){
missingNumber=i;
break;
}
}
returnmissingNumber;
}
public static void main(String[]args){
int[]arr={1,3,5,7,9,2,4,6};
System.out.println("Smallestpositivenumbermissing:"+findMissingNumber(arr));
}
}
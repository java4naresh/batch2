class DuplicateElements{
 public static void main(String args[]){
   int arr[]= {3,7,8,9,5,7,9};
   for(int i=0;i<arr.length-1;i++){
  for(int j=i+1;j<arr.length;j++){
  if (arr[i] == arr[j]){
      System.out.println("duplicate elements is"+ arr[j]);
}
}
}
}
}
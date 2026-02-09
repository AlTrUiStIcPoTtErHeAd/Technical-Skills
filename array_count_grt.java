//Give an array count number of element having atleast one element greater than it self  
//Observation-For very max element there won't br greater than itself
/*Pseudo code:
1.iterate and find max elemnt from the array 
2.iterate and get the number of element that are not equal to the max 
3.Increment max*/


class array_count_grt {
    public static void main(String[] args) {
        int count=0;
        int ar[]={-1,2,3,4,-5,6};
        int max=ar[0];
        for (int i =0;i <ar.length; i++) {
            if (ar[i]>max){
                max=ar[i];
            }
        }
        
        for (int i = 0; i <ar.length; i++) {
            if (max>ar[i]) {
                count+=1;
            }
        }
        System.out.println(count);
    }
        
    }
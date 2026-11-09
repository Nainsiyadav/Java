
// class  reverseString{
//     public static void revString(char[] s){
//         int first = 0;
//         int end = s.length-1;
//         while(first < end){
//             char temp = s[first];
//             s[first] = s[end];
//             s[end] = temp;
//             first++;
//             end--;
//         }
//     }
//     public static void main(String args[]){
//     char[] s = {'a','b','c'};
//     revString(s);
//     System.out.print(s);
//     }
// }

public class reverseString{
    public static void pairs(int[] number){
        int sum = 0;
        for(int i=0;i<number.length;i++){
            int curr = number[i];
            for(int j=i+1;j<number.length;j++){
                sum = curr+number[j];
            }
            System.out.println();

        }
        System.out.print(sum);
    }
    public static void main(String[] args){
        int[] number = {2,4,6,8,10};
        pairs(number);

    }
}

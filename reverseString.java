
class  reverseString{
    public static void revString(char[] s){
        int first = 0;
        int end = s.length-1;
        while(first < end){
            char temp = s[first];
            s[first] = s[end];
            s[end] = temp;
            first++;
            end--;
        }
    }
    public static void main(String args[]){
    char[] s = {'a','b','c'};
    revString(s);
    System.out.print(s);
    }
}

import java.util.*;
// public class string{
//     public static void main(String args[]){
//         char arr[]={'a','b','c','d'};
//         String str1="abcd";
//         String str2=new String("xyz");
//         //Strings are immutable
//         Scanner sc= new Scanner(System.in);
//         String name;
//         name=sc.nextLine();
//         System.out.println(name);
//         String fullname="Tony Stark";
//         System.out.println(fullname.length());
//         String firstName="Shraddha";
//         String lastName="Khapra";
//         String wholeName=firstName+" "+lastName;
//         System.out.println(wholeName);
//         System.out.println(wholeName.charAt(1));

//     }
// }

// public class string{
//     public static void printLetters(String str){
//         for(int i=0; i<str.length(); i++){
//             System.out.print(str.charAt(i)+" ");
//         }
//         System.out.println();
//     }
//     public static void main(String args[]){
//         String fullname="Shraddha khapra";
//         printLetters(fullname);
//     }
// }

//Check for String

// public class string{
//     public static boolean isPalindrome(String str){
//         for(int i=0; i<str.length()/2; i++){
//             int n=str.length();
//             if(str.charAt(i)!=str.charAt(n-1-i)){
//                 //not a palindrome
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void main(String args[]){
//         String str="racecar";
//         System.out.println(isPalindrome(str));

//     }

// }

// public class string{
//     public static int getShortestPath(String path){
//         int x=0, y=0;
//         for(int i=0; i<path.length(); i++){
//             char dir=path.charAt(i);
//             //south
//             if(dir=='S'){
//                 y--;
//             }
//             //north
//             else if(dir=='N'){
//                 y++;
//             }
//             //West
//             else if(dir=='W'){
//                 x--;
//             }
//             //EAST
//             else{
//                 x++;
//             }
//         }
        
//         return  (int)Math.sqrt(x*x + y*y);
//     }
//     public static void main(String args[]){
//         String path="WNEENESENNN";
//         System.out.println(getShortestPath(path));

//     }
// }

//STRING COMPARISION
// public class string{
//     public static void main(String args[]){
//         String s1="Tony";
//         String s2="Tony";
//         String s3= new String("Tony");
//         if(s1==s2){
//             System.out.println("Both string are equal");
//         }else { 
//             System.out.println("String are not equal");
//         } 
//         if(s1==s3){
//             System.out.println("Both string are equal");
//         }else{
//             System.out.println("Both string are not equal");
//         }
//     }
// }

//SUBSTRING
// public class string{
//     public static String substring(String str, int si, int ei){
//         String substr="";
//         for(int i=si; i<ei; i++){
//             substr += str.charAt(i);
//         }
//         return substr;
//     }
//     public static void main(String args[]){
//         //SUBSTRING
//         String str="HELLOW WORLD";
//         System.out.println(substring(str,0,5));
//     }
// }

//comparision of string in lexographical order
// public class string{
//     public static void main(String args[]){
//         String fruits[]={"apple","mango","banana"};
//         String largest=fruits[0];
//         for(int i=1; i<fruits.length; i++){
//             if(largest.compareTo(fruits[i])<0){
//                 largest=fruits[i];
//             }

//         }
//         System.out.println(largest);
//     }
// }



//STRING BUILDER
// public class string{
//     public static void main(String args[]){
//         StringBuilder sb=new StringBuilder("");
//         for(char ch='a' ; ch<='z' ; ch++){
//             sb.append(ch);
//         }
//         System.out.println(sb);
//     }
// }



//STRING CONVERT EACH THE FIRST LETTER EACH WORD TO UPPERCASE
// public class string{
//     public static String toUpperCase(String str){
//         StringBuilder sb= new StringBuilder("");
//         char ch=Character.toUpperCase(str.charAt(0));
//         sb.append(ch);
//         for(int i=1; i<str.length(); i++){
//             if(str.charAt(i) ==' ' && i<str.length()-1){
//                 sb.append(str.charAt(i));
//                 i++;
//                 sb.append(Character.toUpperCase(str.charAt(i)));
//             }else{
//                 sb.append(str.charAt(i));
//             }

//         } 
//         return sb.toString();
//     }
//     public static void main(String args[]){
//         String str="hi, i am shraddha";
//         System.out.println(toUpperCase(str));
//     }
// }


//STRING COMPRESSION
//aaabbcccdd   ---> a3b2c3d2

public class string{
    public static String Compress(String str){
        String newStr="";
        for(int i=0; i<str.length(); i++){
            Integer count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            newStr +=str.charAt(i);
            if(count>1){
                newStr+=count.toString();
            }
        }
        return newStr;
    }
    public static void main(String args[]){
        String str="aaabbcccdd";
        System.out.println(Compress(str));
    }
}
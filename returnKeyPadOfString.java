public class solution {

	// Return a string array that contains all the possible strings
  
	public static String helper(int n){
         String str[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        return str[n];
         //  return str;
    //    if(n==1){
      //      String[] str={""};
        //    return str;
        //}
        
        
//        else if(n==2){
//           String[] str={"a","b","c"};
//             return str;
//         }
//        else if(n==3){
//             String[] str={"d","e","f"};
//             return str;
//         }
//        else if(n==4){
//             String[] str={"g","h","i"};
//             return str;
//         }
//          else if(n==5){
//             String[] str={"j","k","l"};
//             return str;
//         }
        
//       else  if(n==6){
//             String[] str={"m","n","o"};
//             return str;
//         }
//        else if(n==7){
//             String[] str={"p","q","r","s"};
//             return str;
//         }
//         else if(n==8){
//             String[] str={"t","u","v"};
//             return str;
//         }
//        else  {
//             String[] str={"w","x","y","z"};
//             return str;
//         }
        
    
     }
    
    public static String[] keypad(int n){
		// Write your code here

        if(n==0){
            String []ans={""};
            return ans;
        }
       int rem=n%10;
        String [] key=keypad(n/10);
        String  outcome=helper(rem);
        String [] ans=new String[outcome.length()*key.length] ;
        int k=0;
        for(int i=0;i<key.length;i++){
            
            for(int j=0;j<outcome.length();j++){
                
                ans[k]=key[i]+outcome.charAt(j);
                k++;
                
            }
        }
        
        return ans;
	}
	
}

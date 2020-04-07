public class solution {
    
    
    public static String[] helper(int n){
        
      if(n==1){
            String [] str={""};
            return str;
        }
        
        if(n==2){
            String [] str={"a","b","c"};
            return str;
        }
        
        if(n==3){
            String [] str={"d","e","f"};
            return str;
        }
        if(n==4){
            String [] str={"g","h","i"};
            return str;
        }
        
        if(n==5){
            String [] str={"j","k","l"};
            return str;
        }
        
        if(n==6){
            String [] str={"m","n","o"};
            return str;
        }
        
        if(n==7){
            String [] str={"p","q","r","s"};
            return str;
        }
        
        if(n==8){
            String [] str={"t","u","v"};
            return str;
        }
        
        if(n==9){
            String [] str={"w","x","y","z"};
            return str;
        }
        return null;
    }
    public static void printkeyPad(int input,String outputsofar){
        
        if(input==0){
            System.out.println(outputsofar);
            return;
        }
        
        String[] key=helper(input%10);
        
        for(int i=0;i<key.length;i++){
            printkeyPad(input/10,key[i]+outputsofar);
        }
    }

	public static void printKeypad(int input){
		
      
        printkeyPad(input,"");
	}
}

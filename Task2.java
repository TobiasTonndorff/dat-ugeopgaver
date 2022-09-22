public class Orddeler {  
    public static void main(String[] args) {  
       printPartOfWord();
    }  
    public static void printPartOfWord(){
        String s1="København";    
        String substr = s1.substring(0); 
        System.out.println(substr);  
        String substr2 = s1.substring(1,5); 
        System.out.println(substr2);    
       

    }
}  
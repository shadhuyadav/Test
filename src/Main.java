import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

System.out.println(SameChar("amr","ram"));
    }

    public static boolean SameChar(String a,String b){
        Set<Character> charSet=new HashSet<Character>();
boolean flag=true;
        if(a.length()==b.length()){

            for(int i=0;i<a.length();i++){

                charSet.add(a.charAt(i));
            }
            for (int j=0;j<b.length();j++){
                if(charSet.contains(b.charAt(j))){

                }else {
                    flag=false;
                    break;
                }
            }

        }else {
            return false;
        }
        return flag;

    }
}
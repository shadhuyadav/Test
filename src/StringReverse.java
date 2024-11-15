public class StringReverse {

    public static void main(String args[]){

        String str="I Am Not String";

        //"g ni rtS toNmAI"
        int k=0;
        for(int i=str.length()-1;i>=0;i--){

            for(int j=k;j<=str.length()-2;k++){
                if(" ".equals(Character.toString(str.charAt(j)))){
                    System.out.print(" ");

                }
                //System.out.println(" k="+k);
                k++;
                break;

            }
            System.out.print(str.charAt(i));


        }



    }
}

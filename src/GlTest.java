import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GlTest {

    public static void main(String[] args){

        List<String>   strList= Stream.of("aa","bb","cc","dd","aa","bb","aa","dd","aa").map(String::toUpperCase).collect(Collectors.toList());



        Map<String,Integer> mp=new HashMap<String,Integer>();



        for(int i=0;i<strList.size();i++){



            if(mp.containsKey(strList.get(i))){

                int k=mp.get(strList.get(i));
                k++;
                mp.put(strList.get(i),k);

            }else {

                mp.put(strList.get(i),1);
            }

        }

        System.out.println(mp);

    }

}

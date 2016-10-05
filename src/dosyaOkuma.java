import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by cenk.akdeniz on 19.12.2015.
 */
public class dosyaOkuma {

    public List dosyadanOku(String path){
        List  list = new ArrayList();
        int count =0;

        try {
            File file = new File(path);
            FileReader fileReader = new FileReader(file);
            String line;

            BufferedReader br = new BufferedReader(fileReader);

            while ((line = br.readLine()) != null) {
                list.add(line);
                //System.out.println(line);
                count++;

            }

            br.close();
        }

        catch (IOException ex){
            ex.printStackTrace();
        }
    return list;
    }

    public void dosyaYazma(String yazilacakdosya,List list)throws Exception{

        try {
            File file = new File(yazilacakdosya);
            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fileWriter = new FileWriter(file, false);
            BufferedWriter bWriter = new BufferedWriter(fileWriter);
            for(int i = 0; i<list.size(); i++){
                String hold ;
                if(list.get(i) instanceof String)
                   hold=String.valueOf(list.get(i));
                else{
                    hold=(String)list.get(i);
                }

                bWriter.write(hold);
                bWriter.newLine();
            }

            bWriter.close();
        }
        catch (IOException ex){
            ex.printStackTrace();
        }


    }


}


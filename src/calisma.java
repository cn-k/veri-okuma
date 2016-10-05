/**
 * Created by cenk.akdeniz on 17.12.2015.
 */
public class calisma {

    public static void main(String[] args) {
      /*  List list = new ArrayList();
        List list2 = new ArrayList();
        biletOkuma boo = new biletOkuma();
        Random rnd = new Random(10000);
        for (int i =0; i<100 ; i++ ){
            list.add(rnd.nextInt());
            System.out.println(rnd.nextInt());
        }
        Random rnd2 = new Random(10000);
        for (int i =0; i<10000 ; i++ ){
            list2.add(rnd.nextInt());
        }

        try {
            boo.biletYaz("D:\\Users\\cenk.akdeniz\\Desktop\\bilet.xls",list);
            boo.biletYaz("D:\\Users\\cenk.akdeniz\\Desktop\\whiteList.xls",list2);
        }
            catch (IOException ex){
            ex.printStackTrace();
        }
*/

        dosyaOkuma doo = new dosyaOkuma();
        doo.dosyadanOku("D:\\Users\\cenk.akdeniz\\Desktop\\bilet.csv");
    }
}

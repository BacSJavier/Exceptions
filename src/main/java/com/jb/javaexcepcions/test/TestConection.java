
import src.main.java.com.jb.javaexcepcions.models.Conection;
public class TestConection {
    public static void main(String[] args) throws Exception {
        /*OPCION 1 
        Conection conn = null;
        try{
        conn = new Conection();
        conn.CollectData();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if(conn != null){
            conn.CloseConection();
            }
        }*/

        /*OPCION 2 */
        try(Conection con = new Conection()){
            con.CollectData();  
        }catch(IllegalStateException e){
            e.printStackTrace();
        }   
    }
}


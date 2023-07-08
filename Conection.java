public class Conection implements AutoCloseable {
    public Conection(){
        System.out.println("Conection created");
        //throw new IllegalStateException(); 

    }
    public void CollectData(){
        System.out.println("Collecting data...");
        throw new IllegalStateException();
    }
    public void CloseConection(){
        System.out.println("Closing data...");
    }
    @Override
    public void close() throws Exception {
        CloseConection();
    }
    
}

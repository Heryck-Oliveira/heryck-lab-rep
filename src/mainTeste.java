public class mainTeste {
    public static void main(String[] args) throws Exception {
        Thread t1 = new Thread(new ProblemaUm(0));
        Thread t2 = new Thread(new ProblemaUm(1)); 
        t1.start();
        t2.start();
        
         try {
            t1.join();
            t2.join();    
        } catch (Exception e) {
            System.out.println("Erro");
        }
    }
}
 
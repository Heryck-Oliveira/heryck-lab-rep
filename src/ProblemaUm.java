public class ProblemaUm implements Runnable {
    
    static boolean[] want = {false, false};
    int id;
    static int counter;
    static int turn = 0;

    ProblemaUm(int id){
        this.id = id;
    }

    @Override
    public void run() {
        for (int i=0;i<10;i++){
            System.out.println("Id: "+ id + ", sera adicionado um ao contador");
            want[id]= true;
            while (want[(id+1)%2]){
                if(turn == (id+1)%2){
                    want[id]=false;
                    while(turn != id){}
                    want[id]=true;
                }
            }
            counter +=1;
            System.out.println("o valor de counter é: "+ counter);
            turn = (id+1)%2;
            want[id]=false;
        }
        
    }
}

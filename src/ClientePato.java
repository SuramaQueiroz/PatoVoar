public class ClientePato {
    public  static  void main(String[]args){
        PatoPreto pato = new PatoPreto();
        PeruBelga peru = new PeruBelga();

        PeruAdpter peruAdpter=new PeruAdpter(peru);
        Pato[]patos={pato,peruAdpter};

        for (Pato p: patos){
            p.grasnar();
            System.out.println();
            p.voar();
            System.out.println();

        }


    }
}

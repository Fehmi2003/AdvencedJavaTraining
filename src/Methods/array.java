package Methods;

public class array {
    public static void main(String[] args) {
        //10 elemanlı bir diziye eleman olarak dizi indeksinin karesini atayan uygulama
        int [] sayilar=new int[10];
        for (int index=0;index<sayilar.length;index++){
           // sayilar[index]=index*index;
            sayilar[index]=(int)Math.pow(index,2);
        }
        for (int index=0; index<sayilar.length;index++){
            System.out.println("Eleman: "+sayilar[index]);
        }
    }
}

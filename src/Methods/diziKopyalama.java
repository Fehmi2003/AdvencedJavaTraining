package Methods;

public class diziKopyalama {
    public static void main(String[] args) {
        int [] anaDizi={1,2,4,77};
        int [] kopyaDizi= new int[anaDizi.length];
        for (
                int index=0; index<anaDizi.length;index++

        )
            kopyaDizi[index]=anaDizi[index];
        for (int sayi:kopyaDizi){
            System.out.println("Kopya dizi elemanı :"+sayi);
        }
        //arraycopy dizi kopyalama 

    }

}

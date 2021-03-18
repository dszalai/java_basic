public class LegkisebbKozosTobbszoros {

   //static int[] t = new int[3]; tömb deklarálás és értékadás
   public static void main(String[] args){

   
    
    int maradek=0;
    int lnko=1;
    double lkt=1;

    int a= Integer.valueOf(args[0]);
    int b= Integer.valueOf(args[1]);

    //legnagyobb közös osztó meghatározása
    while(b>0){
        maradek=b;
        b=a%b;
        a=maradek;
        lnko=a;
    }

    //a legkisebb közös többszörös kiszámítható a két tag szorzatából, osztva a legnagyobb közös osztóval
    lkt=  Integer.valueOf(args[0])*Integer.valueOf(args[1])/lnko;


    System.out.println(""+lkt);
   }


}

//hf: legnagyobb közös osztó, legkisebb közös többszörös
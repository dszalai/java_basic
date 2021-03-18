public class LegnagyobbKozosOszto {

   //static int[] t = new int[3]; tömb deklarálás és értékadás
   public static void main(String[] args){

   
    
    int maradek=0;
    int lnko=1;

    int a= Integer.valueOf(args[0]);
    int b= Integer.valueOf(args[1]);

    while(b>0){
        maradek=b;
        b=a%b;
        a=maradek;
        lnko=a;
    }

    System.out.println(""+lnko);
   }


}

//hf: legnagyobb közös osztó, legkisebb közös többszörös
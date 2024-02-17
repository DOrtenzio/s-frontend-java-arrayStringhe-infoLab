import java.util.Scanner;

public class Es1{
    public static void main(String [] args){
        String lunga="",corta="";
        String [] parole=new String[10];
        Scanner in=new Scanner(System.in);
        for (int i=0;i<parole.length;i++){
            System.out.print("Inserire parametro "+(i+1)+": ");
            parole[i]=in.nextLine();
        }
        for (int p=0;p<parole.length;p++){
            if (p==0)
                corta=parole[p];
            else{
                if (parole[p].length()>lunga.length())
                    lunga=parole[p];
                if (parole[p].length()<corta.length())
                    corta=parole[p];
            }
        }
            System.out.println("La stringa più lunga inserita è: "+lunga+" composta da "+lunga.length()+" caratteri.");
            System.out.println("La stringa più corta inserita è: "+corta+" composta da "+corta.length()+" caratteri.");
    }
}
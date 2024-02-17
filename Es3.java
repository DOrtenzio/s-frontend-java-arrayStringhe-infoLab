import java.util.Scanner;

public class Es3{
    public static void main(String [] args){
        String [] parole=new String[10];
        boolean isCrescente=true;
        Scanner in=new Scanner(System.in);
        for (int i=0;i<parole.length;i++){
            System.out.print("Inserire parametro "+(i+1)+": ");
            parole[i]=in.nextLine();
        }
        for (int p=0;p<parole.length-1;p++){
            if (parole[p].compareToIgnoreCase(parole[p+1])>0){
                isCrescente=false;
                break;
            }
        }
        if (isCrescente==true)
            System.out.println("L'array è ordinato in base all'ordine alfabetico.");
        else
            System.out.println("L'array non è ordinato in base all'ordine alfabetico.");
    }
}
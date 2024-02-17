import java.util.Scanner;

public class Es2{
    public static void main(String [] args){
        String [] parole=new String[10];
        boolean isPresente=false;
        Scanner in=new Scanner(System.in);
        for (int i=0;i<parole.length;i++){
            System.out.print("Inserire parametro "+(i+1)+": ");
            parole[i]=in.nextLine();
        }
        System.out.println("Inserire la stringa da ricercare nell'array:");
        String ricercata=in.nextLine();
        for (int p=0;p<parole.length-1;p++){
            if (parole[p].equalsIgnoreCase(ricercata)){
                isPresente=true;
                break;
            }
        }
        if (isPresente==true)
            System.out.println("L'array contiene la stringa.");
        else
            System.out.println("L'array non contiene la stringa.");
    }
}
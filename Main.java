package palabrapalindroma;

import java.util.Scanner;

public class Main {
    
    public static Scanner scan;

    public static void main(String[] args) {
        
        String p = ObtenPalabra();
        boolean palindromo = EsPalindromo(p);
    }
    
    public static String ObtenPalabra()
    {
        scan = new Scanner(System.in);
        
        System.out.println("Escriba una palabra: ");

        String palabra = scan.next();
        
        return palabra;
    }
    
    public static boolean EsPalindromo(String p)
    {
        char simbols [] = new char[p.length()];
        
        char temp [] = new char[p.length()];
        
        boolean espalindromo = false;

        int tam_palabra = p.length()-1;
        int cont_tam = 0;
        
        for(int i = 0; i < simbols.length; i++)
        {
            simbols[i] = p.charAt(i);
        }
        
        for (int i = 0; i < simbols.length; i++)
        {
            temp[tam_palabra] = simbols[i];
            tam_palabra--;
        }
        
        for(int j = 0; j < p.length(); j++)
        {
            if(simbols[j] == temp[j])
            {
                cont_tam++;
            }
        }
        
        espalindromo = (cont_tam == p.length());
        
        if(espalindromo)
        {
            System.out.println("Es palabra palindroma");
        }
        else
        {
            System.out.println("No es palabra palindroma");
        }
        
        temp = null;
        
        return espalindromo;
    }
}

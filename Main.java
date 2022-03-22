/*
Exercicio Bin2Dec da lista AppIdeas
Ele pega um numero que o usuario fornece, verifica na classe bin2dec, com o metodo verifier se é binario, se não for, ele pede para digitar o numero novamente,
se for binario, ele manda para o metodo conversos, e faz a conversão

Problemas no codigo:
ele é obrigatorio digitar 8 numeros, se tiver mais, ele faz o certo, que é o trim para 8 digitos e ignora o resto,
se for menor que 8, ele retorna uma Exception, que não sei resolver.

Resolução:
foi feito a verificação de quantidade de digitos que foi digitado pelo usuario, se a diferença foi maior ou igual a 0, ele pega a diferença,
e adiciona Zeros a esquerda, e depois contatena o numero que o usuario botou, e segue o codigo.

e se a diferença for menor que 0 (logo, maior que 8 digitos), ele trimma os digitos adicionais e segue a conversão
*/

import java.util.*;


class bin2dec{
    public int conversor(String bin){
        int dec = Integer.parseInt(bin,2);
        
        return dec;
    }
  
    public boolean verifier(String bin){
            for(int i=0;i!=bin.length();i++){
             if(bin.charAt(i) != '0')
                if(bin.charAt(i) != '1')
                    return false;
            }
        return true;
    }
}

public class Main{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        bin2dec bd = new bin2dec();
        
        String temp="";
        int dif;
        do{
            System.out.println("\nType the binary number: "); 
                String linha = sc.nextLine();
            dif=8-linha.length();
            
            if(dif>=0){
                while(dif-- > 0)
	                temp = temp.concat("0");
                temp = temp.concat(linha);
            }   
            else
                temp = linha.substring(0, 8);
        
            if(bd.verifier(temp))
                System.out.print("The number in decimal: " + bd.conversor(temp));
            else
                System.out.printf("\nNumber is not a binary!");
        }
        while(!bd.verifier(temp));
    }
}
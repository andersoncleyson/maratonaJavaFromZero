package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
    public static void main(String[] args) {
        // \d = Todos os digitos
        // \D = Tudo o que não for digito
        // \s = Espaços em branco \t \n \f \r
        // \S = Todos os caracters excluíndo os brancos
        // \w = a-ZA-Z, digitos, _
        // \W = Tudo o que não for incluso no \w
        // []
        // ? Zero ou uma
        // * zero ou mais
        // + uma ou mais
        // {n, m} de n até m
        // ()
        // | o(v|o)o ovo / oco
        // $
        // .
        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";

        String texto = "12 0x 0x 0xFFABC 0X10G 0X1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto: "+texto);
        System.out.println("indice: 0123456789");
        System.out.println("regex "+regex);
        System.out.println("Posições encontradas");
        while (matcher.find()){
            System.out.println(matcher.start()+" "+matcher.group()+"\n");
        }

        int numeroHEX = 0X109;
        System.out.println(numeroHEX);
    }
}


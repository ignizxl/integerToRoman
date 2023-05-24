/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.inteiropararomano;

import java.util.Scanner;

/**
 *
 * @author João Igor
 */
public class InteiroParaRomano {

    public static void main(String[] args) {
        //cria o objeto ler pra capturar a entrada de dados pelo teclado
        Scanner ler = new Scanner(System.in);
        //deixando o vetor de simbolos e o vetor de valores já predefinidos
        //obs: precisei insererir os seguintes simbolos e valores
        // iv = 4
        // ix = 9
        // xl = 40
        // cd = 400
        // cm = 900
        String simbolos[] = {"M","CM", "D", "CD", "C", "XC", "L", "XL" , "X", "IX", "V", "IV", "I"};
        int valores[] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        
        //inicianlizando nRomano como uma string vazia 
        String nRomano= "";
        //pede um entrada de dado, converte pra int e armazena em nInteiro
        int nInteiro = ler.nextInt();
        //crio um laço for pra iniciar varrendo do maior para o menor elemento
        for (int i = 0; i < 13; i++){
            //enquanto a minha entrada de dados for maior ou igual ao valor na posição [i], faça
            while (nInteiro >= valores[i]){
                //adiciono na variável nromano o simbolo na posição i (que é o simbolo da vez)
                nRomano = nRomano + simbolos[i];
                //e por fim eu decremento a minha entrada de dados pelo valor da vez que é valor na posição i
                nInteiro = nInteiro - valores[i];           
            } 
        }
        // e por fim, printo na tela o nRomano que é o resultado final
        System.out.println(nRomano);
    }
}

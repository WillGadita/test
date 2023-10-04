package br.com.teste;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class ListaGeneros {

    public static void main(String[] args) {

        System.out.println(" *** Lista por sexo Feminino ***");

        List<HomensMulheres> lista = new HomensMulheres(null, null).pessoasGenero();
        lista.stream()
                .filter(genero -> genero.getSexo().equals("Feminino"));



        }
        @Test
        public void testeGeneros(){
        List<HomensMulheres> lista = new HomensMulheres(null, null).pessoasGenero();

        List<HomensMulheres> mulheres = lista.stream()
                .filter(genero -> genero.getSexo().equals("Feminino"))
                .toList();



    }
}





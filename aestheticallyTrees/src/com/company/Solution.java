package com.company;

public class Solution {

    public int solution(int[] A) {
        int treesToCut = 0;
        int indexTree = 0;
        int
        int i = 0;
        if (A.length > 2) {
            while (treesToCut < 2 && i < A.length - 1) {
                if ((A[i] > A[i - 1] && A[i] < A[i + 1]) || (A[i] < A[i - 1] && A[i] > A[i + 1])) {
                    indexTree = i;
                    treesToCut++;
                }
            }
            //check how many trees can be cutted

        }



        return (treesToCut == 0) ? 0 : (treesToCut > 1) ? -1 : indexTree;
    }

    /**
     * @param A
     * @return
     */
    private int isAesthetically(int[] A) {
        int treesToCut = 0;
        int indexTree = 0;
        int i = 0;
        if (A.length > 2) {
            while (treesToCut < 2 && i < A.length - 1) {
                if ((A[i] > A[i - 1] && A[i] < A[i + 1]) || (A[i] < A[i - 1] && A[i] > A[i + 1])) {
                    indexTree = i;
                    treesToCut++;
                }
            }
        }
        return (treesToCut == 0) ? 0 : (treesToCut > 1) ? -1 : indexTree;
    }


}
/*
 * Un jardinero está obsesionado con la estética de una plantación de árboles.
 * Se considera que es estéticamente correcto si los árboles se intercalan en altura.
 * El jardinero sólo podrá cortar uno de los árboles por un tema de preservación natural
 * Existen N árboles consecutivos representados en un arreglo de N elementos donde A[N] se corresponde
 * con la altura del n-ésimo árbol
 *
 * Se deberá realizar una función la cual recibe por parámetro el arreglo de árboles y debe retornar
 * la cantidad de árboles distintos que pueden cortarse, en caso que el arreglo sea estéticamente correcto
 * deberá retornar 0, en caso que no sea posible dejarlo estéticamente correcto deberá retornar -1.
 *
 * por ejemplo si el arreglo es: [3,4,5,3,7]
 * deberá retornar 3 ya que pueden cortarse el índice 0, 1 y 2
 *
 * si el arreglo fuera: [1,2,3,4,5]
 * deberá retornar -1
 *
 *
 *
 *
 *
 * */
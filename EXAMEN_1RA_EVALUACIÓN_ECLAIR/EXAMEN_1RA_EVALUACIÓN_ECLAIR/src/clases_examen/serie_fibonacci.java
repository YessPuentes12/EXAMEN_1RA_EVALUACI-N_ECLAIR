/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clases_examen;

/**
 *
 * @author Omar Carrillo
 */
public class serie_fibonacci {
    private int a1;
    private int a2;
    private int n;

    public void Fib() {
        a1 = 1;
        a2 = 1;
        n = 7;
    }
//-----------------------------------------------------------------------------  
    public void Fib2(int A1, int A2, int N) {
        a1 = A1;
        a2 = A2;
        n = N;
    }
//-----------------------------------------------------------------------------  
    public int getA1() {
        return a1;
    }

    public void setA1(int auno) {
        a1 = auno;
    }
//-----------------------------------------------------------------------------  
    public int getA2() {
        return a2;
    }

    public void setA2(int ados) {
        a2 = ados;
    }
//-----------------------------------------------------------------------------  
    public int getN() {
        return n;
    }

    public void setN(int ndos) {
       n = ndos;
    }
//-----------------------------------------------------------------------------  
    public void Serie() {
        int a = a1, b = a2, c;
        System.out.print(a + " " + b);

        for(int i = 3; i <= n; i++) {
            c = a + b;
            System.out.print("-" + c);
            a = b;
            b = c;
        }
    
}
}

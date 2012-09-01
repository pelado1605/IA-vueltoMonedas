/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Ruben
 */
public final class Individuo {

    private int[] c200 = new int[4];
    private int[] c100 = new int[4];
    private int[] c50 = new int[4];
    private int[] c25 = new int[4];
    private int[] c10 = new int[4];
    private int[] c5 = new int[4];
    private float aptitud = 0;

    public Individuo() {
    }

    public Individuo(int c200, int c100, int c50, int c25, int c10, int c5) {
        setC10(c10);
        setC100(c100);
        setC200(c200);
        setC25(c25);
        setC5(c5);
        setC50(c50);
    }

    private int[] convertirABinario(int entrada) {
        int[] salida = new int[4];

        for (int i = 3; i > -1; i--) {

            salida[i] = entrada % 2;
            entrada = entrada / 2;
        }
        return salida;
    }

    private int convertirAEntero(int[] entrada) {
        int salida = 0;
        for (int i = 0; i < 4; i++) {
            salida += entrada[i] * ((int) Math.pow(2, (3 - i)));
        }
        return salida;
    }

    public int getVuelto() {
        int vuelto = getC10() * 10 + getC5() * 5 + getC25() * 25 + getC50() * 50
                + getC100() * 100 + getC200() * 200;

        return vuelto;
    }

    public int contarMonedas() {
        return getC10() + getC100() + getC200() + getC25() + getC5() + getC50();
    }

    public void setAptitud(float aptitud) {
        this.aptitud = aptitud;
    }

    public void setC10(int c10) {
        this.c10 = convertirABinario(c10);
    }

    public void setC100(int c100) {
        this.c100 = convertirABinario(c100);
    }

    public void setC200(int c200) {
        this.c200 = convertirABinario(c200);
    }

    public void setC25(int c25) {
        this.c25 = convertirABinario(c25);
    }

    public void setC5(int c5) {
        this.c5 = convertirABinario(c5);
    }

    public void setC50(int c50) {
        this.c50 = convertirABinario(c50);
    }

    public float getAptitud() {
        return aptitud;
    }

    public int[] getC10Binario() {
        return c10;
    }

    public int[] getC100Binario() {
        return c100;
    }

    public int[] getC200Binario() {
        return c200;
    }

    public int[] getC25Binario() {
        return c25;
    }

    public int[] getC5Binario() {
        return c5;
    }

    public int[] getC50Binario() {
        return c50;
    }

    public int getC10() {
        return convertirAEntero(c10);
    }

    public int getC100() {
        return convertirAEntero(c100);
    }

    public int getC200() {
        return convertirAEntero(c200);
    }

    public int getC25() {
        return convertirAEntero(c25);
    }

    public int getC5() {
        return convertirAEntero(c5);
    }

    public int getC50() {
        return convertirAEntero(c50);
    }

    public static void main(String[] args) {
//        Individuo i = new Individuo();
//        int[] a = i.convertirABinario(17);
//        for (int j : a) {
//            System.out.print(j);
//        }
//        int b = i.convertirAEntero(a);
//        System.out.println();
//        System.out.println(b);
//        
//        float aptitudCalculada = 0;
//        int a = 300;
//        aptitudCalculada =+ 3*2 + 5*2 + 4*2;
//        
//        System.out.println(aptitudCalculada);
//
//        List<Float> list = new ArrayList();
//        list.add((float) 23.5);
//        list.add((float) 100.3);
//        list.add((float) 45.4);
//        list.add((float) 4.3);
//        list.add((float) 300.6);
//
//        for (Float elen : list) {
//            System.out.println(elen);
//        }
//        
//        System.out.println();
//
//        Collections.sort(list);
//        
//        for (Float elen : list) {
//            System.out.println(elen);
//        }
        
        byte a = 12;
        byte b = 0xc;
        byte c = 0b110000;
        short d = 0b111111111111111;
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
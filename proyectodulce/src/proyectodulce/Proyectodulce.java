/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectodulce;

/**
 *
 * @author dulce
 */
public class Proyectodulce {

    private static int numeroAlumnos;
    private static int numeroAlumnosBarcelona;
    private static int numeroAlumnosRM;
    
    public static double porcentaje(int numa,int numb){
        numeroAlumnos=numa;
        numeroAlumnosBarcelona=numb;
        
        return numb*100/numa;
    }
    public static double porcentajeRM(int numa,int numRM){
        return numRM*100/numa;
    }
public static void decisionFinal(double pbar,double prmd){
    
    if(pbar==prmd){
        System.out.println( "¿De verdad no queremos un partido de la Champions Barça-Real Madrid?");
    }else{
        int x=numeroAlumnosBarcelona- numeroAlumnosRM;
        System.out.println("Menos mal que hay" +x+ "sensatos");
    }
    
}
    public static void main(String[] args) {
        numeroAlumnos=11;
        numeroAlumnosBarcelona=5;
        numeroAlumnosRM=numeroAlumnos-numeroAlumnosBarcelona;
        System.out.println(porcentaje(numeroAlumnos,numeroAlumnosBarcelona)+"%");
        System.out.println(porcentajeRM(numeroAlumnos, numeroAlumnosRM)+"%");
    }

}

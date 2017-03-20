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

    public static void main(String[] args) {
        numeroAlumnos=11;
        numeroAlumnosBarcelona=5;
        numeroAlumnosRM=numeroAlumnos-numeroAlumnosBarcelona;
        System.out.println(porcentaje(numeroAlumnos,numeroAlumnosBarcelona)+"%");
        System.out.println(porcentajeRM(numeroAlumnos, numeroAlumnosRM)+"%");
    }

}

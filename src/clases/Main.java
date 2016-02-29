/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Scanner;

/**
 *
 * @author Juansebastian
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        boolean indicador = true;
        boolean indicadorEstudiante = false;
        int opcion;
        
        String nombre, apellido;       //Los datos del estudiante
        int codigo;
        
        String nombreCurso;     //Los datos del curso
        int codigoCurso;
        int creditoCurso;
        double notaCurso;
        
        double promedio;
        boolean prueba;
        
        
        Scanner entrada = new Scanner(System.in);
        Estudiante est;
        
        est = new Estudiante();
        
        while(indicador == true)
        {
            
            menuEst();
            System.out.print("Digite su opcion: ");
            opcion = entrada.nextInt();
            
            switch(opcion)
                
            {
                case 1:
                
                if (indicadorEstudiante == false)
                {
                    
                    System.out.println("Registrando estudiante...\n");
                    
                    System.out.print("NOMBRE: ");
                    entrada.nextLine();
                    
                    nombre = entrada.nextLine();
                    
                    System.out.print("APELLIDO: ");
                    
                    apellido = entrada.next();
                    entrada.nextLine();
                    
                    System.out.print("CODIGO: ");
                    codigo = entrada.nextInt();
                    
                    est.registrar(nombre, apellido, codigo);
                    
                    indicadorEstudiante = true;
                    
                    
                }
                
                else{
                    
                    System.out.println("Ya se ha  registrado al estudiante"); 
                   
                }
                
                break;
                
                case 2:
                    
                if(indicadorEstudiante == true)
                {
                    
                    System.out.println("Registrando curso...\n");
                    
                    System.out.print("Nombre del curso: ");
                    
                    entrada.nextLine();
                    nombreCurso = entrada.nextLine();
                    
                    
                    
                    System.out.print("Codigo curso: ");
                    codigoCurso = entrada.nextInt();
                    
                    System.out.print("Creditos curso: ");
                    creditoCurso = entrada.nextInt();
                    
                    
                    est.registrarCurso(nombreCurso, codigoCurso, creditoCurso);
                    
                  
                }
                
                else{
                    
                    System.out.println("Antes de realizar esta operacion se debera registrar el estudiante primero");
                    
                    
                }
                
                break;
                            
                case 3:
                    
                    
                    if(indicadorEstudiante == true){
                        
                        System.out.println("Consultando curso...\n");
                        
                        System.out.print("Ingrese codigo del curso: ");
                        codigoCurso = entrada.nextInt();
                        
                        System.out.println("Codigo Ingresado: "+ codigoCurso);
                        
                        System.out.print("El curso es: ");
                        est.consultarCurso(codigoCurso);
                        
                       
                        
                    }
                    
                    else{
                        
                        System.out.println("Antes de realizar esta operacion se debera registrar el estudiante primero");
                        
                    }
                    
                    
                    break;
                    
                case 4: 
                    
                    if(indicadorEstudiante == true){
                        
                        System.out.println("Asignando Nota...\n");
                        
                        System.out.print("Codigo del curso: ");
                        codigoCurso = entrada.nextInt();
                        
                        System.out.print("Nota del curso: ");
                        notaCurso = entrada.nextDouble();
                        
                        est.asignarNota(codigoCurso, notaCurso);
                        
                        
                        
                        
                        
                    }
                    else{
                        
                        System.out.println("Antes de realizar esta operacion se debera registrar el estudiante primero");
                        
                        
                    }
                    
                    
                    break;
                    
                case 5:
                    
                    if(indicadorEstudiante == true)
                    {
                        
                        System.out.println("Calculando Promedio...\n");
                        
                        
                        promedio = est.calcularPromedio();
                        
                        System.out.println("El promedio es: "+promedio);
                        
                    }
                    
                    else
                    {
                        
                        System.out.println("Antes de realizar esta operacion se debera registrar el estudiante primero");
                        
                    }
                    
                    break;
                
                    
                case 6: 
                    
                    
                    if(indicadorEstudiante == true)
                    {
                        
                        System.out.println("Consultando prueba academica...\n");
                        prueba = est.pruebaAcademica();
                        
                        if(prueba == true)
                        {
                            
                            System.out.println("El estudiante esta en prueba academica");
                            
                        }
                        else
                            
                        {
                           System.out.println("El estudiante no esta en prueba academica"); 
                            
                        }
                        
                        
                    }
                    
                    
                    else{
                        
                        System.out.println("Antes de realizar esta operacion se debera registrar el estudiante primero");
                     
                    }
                    
                    
                    break;
                    
                    
                default: 
                    
                    
                    System.out.println("Opcion no valida");
                    
                    
                
            }
            
            
            System.out.print("\nDesea continuar (1.Sí 2.No): ");
            opcion = entrada.nextInt();
            
            if(opcion == 2)
            indicador = false;
            
            
            
            
        }
        
        
        
        
        
        
        
        
    }
    
    public static void menuEst()
    {
        
        System.out.println("Menu");
        
        System.out.println("1- Registrar estudiante");
        System.out.println("2- Registrar curso");
        System.out.println("3- Consultar curso");
        System.out.println("4- Asignar Notar");
        System.out.println("5- Calcular Promedio");
        System.out.println("6- Consultar pueba academica");
        
        System.out.println();
        
    }
    
    
    
    
    
}

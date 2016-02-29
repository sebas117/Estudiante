/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;



/**
 *
 * @author Juansebastian
 */
public class Estudiante {

    private String nombre; 
    private String apellido;
    private int codigo;

    private Curso curso1;
    private Curso curso2;
    private Curso curso3;
    private Curso curso4;
    private Curso curso5;

    private int cursosRegistrados;

    

    public void registrar(String nombre, String apellido, int codigo) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.codigo = codigo;

        this.cursosRegistrados = 0;

    }

    public void registrarCurso(String nombre, int codigo, int creditos) {
        
        
        
        if (this.cursosRegistrados == 0) {

            this.curso1 = new Curso(nombre, codigo, creditos);

        } else if (this.cursosRegistrados == 1) {

            this.curso2 = new Curso(nombre, codigo, creditos);

        } else if (this.cursosRegistrados == 2) {
            this.curso3 = new Curso(nombre, codigo, creditos);

        } else if (this.cursosRegistrados == 3) {
            this.curso4 = new Curso(nombre, codigo, creditos);

        } else if (this.cursosRegistrados == 4) {

            this.curso5 = new Curso(nombre, codigo, creditos);

        } else {

            System.out.println("Ya se registraron todos los cursos disponibles");

        }
        this.cursosRegistrados++;
    }

    public void consultarCurso(int cod) {

        if (this.cursosRegistrados >= 1) {

            if (this.curso1.getCodigo() == cod) {

                System.out.println(this.curso1.getNombre());

            } else if (this.cursosRegistrados >= 2) {

                if (this.curso2.getCodigo() == cod) {

                    System.out.println(this.curso2.getNombre());

                } else if (this.cursosRegistrados >= 3) {

                    if (this.curso3.getCodigo() == cod) {

                        System.out.println(this.curso3.getNombre());

                    } else if (this.cursosRegistrados >= 4) {

                        if (this.curso4.getCodigo() == cod) {

                            System.out.println(this.curso4.getNombre());

                        } else if (this.cursosRegistrados >= 5) {

                            if (this.curso5.getCodigo() == cod) {

                                System.out.println(this.curso5.getNombre());

                            } else {

                                System.out.println("No existe un curso con el codigo especificado");

                            }

                        } else {

                            System.out.println("No existe un curso con el codigo especificado");

                        }

                    } else {

                        System.out.println("No existe un curso con el codigo especificado");

                    }

                } else {

                    System.out.println("No existe un curso con el codigo especificado");

                }

            } else {

                System.out.println("No existe un curso con el codigo especificado");

            }

        } else {

            System.out.println("No existe un curso con el codigo especificado");

        }

    }

    public void asignarNota(int codigo, double nota) {

        if (this.cursosRegistrados >= 1) {

            if (this.curso1.getCodigo() == codigo) {

                this.curso1.ponerNota(nota);

            } else if (this.cursosRegistrados >= 2) {

                if (this.curso2.getCodigo() == codigo) {

                    this.curso2.ponerNota(nota);

                } else if (this.cursosRegistrados >= 3) {

                    if (this.curso3.getCodigo() == codigo) {

                        this.curso3.ponerNota(nota);

                    } else if (this.cursosRegistrados >= 4) {

                        if (this.curso4.getCodigo() == codigo) {

                            this.curso4.ponerNota(nota);

                        } else if (this.cursosRegistrados >= 5) {

                            if (this.curso5.getCodigo() == codigo) {

                                this.curso5.ponerNota(nota);

                            } else {

                                System.out.println("No existe un curso con el codigo especificado");

                            }

                        } else {

                            System.out.println("No existe un curso con el codigo especificado");

                        }

                    } else {

                        System.out.println("No existe un curso con el codigo especificado");

                    }

                } else {

                    System.out.println("No existe un curso con el codigo especificado");

                }

            } else {

                System.out.println("No existe un curso con el codigo especificado");

            }

        } else {

            System.out.println("No existe un curso con el codigo especificado");

        }

    }

    public double calcularPromedio() {

        double promedio = 0;
        int creditos = 0;

        if (this.cursosRegistrados >= 1) {

            promedio = promedio + (this.curso1.getNota() * this.curso1.getCreditos());
            creditos = creditos + this.curso1.getCreditos();

            if (this.cursosRegistrados >= 2) {

                promedio = promedio + (this.curso2.getNota() * this.curso2.getCreditos());
                creditos = creditos + this.curso2.getCreditos();

                if (this.cursosRegistrados >= 3) {

                    promedio = promedio + (this.curso3.getNota() * this.curso3.getCreditos());
                    creditos = creditos + this.curso3.getCreditos();

                    if (this.cursosRegistrados >= 4) {

                        promedio = promedio + (this.curso4.getNota() * this.curso4.getCreditos());
                        creditos = creditos + this.curso4.getCreditos();

                        if (this.cursosRegistrados >= 5) {

                            promedio = promedio + (this.curso5.getNota() * this.curso5.getCreditos());
                            creditos = creditos + this.curso5.getCreditos();

                        }

                    }

                }

            }

        }

        double resultado = promedio / creditos;

        return resultado;

    }

    public boolean pruebaAcademica() {

        double resultado;

        resultado = this.calcularPromedio();

        if (resultado >= 3.25) {
            return false;
        } else {
            return true;
        }

    }

}

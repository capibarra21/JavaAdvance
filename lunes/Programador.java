/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Herencia (Especialización/Generalización): 
Indica que una subclase hereda los métodos y atributos especificados 
por una Super Clase, por ende la Subclase además de poseer sus propios métodos
y atributos,  poseerá las características y atributos visibles de la Super Clase 
(public y protected),
Agregación: 
Para modelar objetos complejos, n bastan los tipos de datos básicos que proveen
los lenguajes: enteros, reales y secuencias de caracteres. Cuando se requiere 
componer objetos que son instancias de clases definidas por el desarrollador de 
la aplicación.
Asociación: 
La relación entre clases conocida como Asociación, permite asociar objetos que 
colaboran entre si. Cabe destacar que no es una relación fuerte, es decir, 
el tiempo de vida de un objeto no depende del otro.
Dependencia o Instanciación (uso): 
Representa un tipo de relación muy particular, en la que una clase es 
instanciada (su instanciación es dependiente de otro objeto/clase). 
Se denota por una flecha punteada.

Una clase abstracta
 se denota con el nombre de la clase y de los métodos con 
letra "itálica". Esto indica que la clase definida no puede ser instanciada 
pues posee métodos abstractos (aún no han sido definidos, es decir, sin 
implementación). La única forma de utilizarla es definiendo subclases, 
que implementan los métodos abstractos definidos.
Una clase parametrizada se denota con un subcuadro en el extremo superior de la
clase, en donde se especifican los parámetros que deben ser pasados a la clase 
para que esta pueda ser instanciada.
 */
package lunes;

/**
 *Herencia
 * @author HP
 */

class Empleado{
    float salario = 40000;
}
public class Programador extends Empleado{
    int bono = 10000;
   
    public static void main(String[] args){
        String msg = "";
        Programador p = new Programador();
        msg+="El salario del programador es: "+p.salario;
        System.out.println(msg);
        System.out.println("El bono es: " + p.bono);
    }
    
    
}

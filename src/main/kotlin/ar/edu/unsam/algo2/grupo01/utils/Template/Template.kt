package ar.edu.unsam.algo2.grupo01.utils.Template

// TEMPLATE PARA TIPOS DE ALGO: Un método plantilla que tiene comportamiento
// común a las clases y un método primitivo que tendrá que responder cada una de las clases específicas
// TEMPLATE PARA METODOS DENTRO DE ALGUNA CLASE: se agrega una funcion a la funcion template
// y se la deja sin implementacion para poder ser llamada por cada una de las subclases

abstract class Template(open var constructor: Int) {
    fun templParent(): Boolean = constructor > 5 && condicionPropia()
    abstract fun condicionPropia():Boolean
}

//Clase templateOne toma por parametro el valor que le pasara al constructor de la clase Padre.
class TemplateOne(override var constructor: Int) : Template(constructor){
    override fun condicionPropia(): Boolean {
        //aca hago algo distinto a mi clase hermana
        return true
    }
}

class TemplateTwo(override var constructor: Int) : Template(constructor){
    override fun condicionPropia(): Boolean {
        //aca hago algo distinto a mi clase hermana
        return false
    }
}
package ar.edu.unsam.algo2.grupo01.utils.NullObject

// NULL OBJECT: no tiene comportamiento bajo ese metodo q hereda

abstract class Object() {
   open fun devolverAlgo(){
        //hacer algo
    }
}

class NotNullObject : Object() {

    override fun devolverAlgo()  {
        // hace otra cosa
    }
}

class NullObject : Object(){
    override fun devolverAlgo() {
        // no pondrias nada
    }
}
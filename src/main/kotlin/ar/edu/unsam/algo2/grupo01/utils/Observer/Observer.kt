package ar.edu.unsam.algo2.grupo01.utils.Observer

import java.nio.file.attribute.UserDefinedFileAttributeView

class Parent{
    lateinit var listaDeObservers: MutableList<Observer>

    fun suscribir(observer: Observer){
        listaDeObservers.add(observer)
    }
    
    fun remove(observer: Observer){
        listaDeObservers.remove(observer)
    }
    
    fun accionEnSi(){
        //la accion en SI, que sea de interes a algun observer

        // y luego notifico
        listaDeObservers.forEach { it -> it.ejecutarObserver("") }
    }
}

// OBSERVER: mecanismo de suscripcion a un evento
interface Observer {
    fun ejecutarObserver(parent: String) {}
}

class ObsOne(val num: Int) : Observer {
    override fun ejecutarObserver(parent: String) { num }
}

class ObsTwo : Observer {
    override fun ejecutarObserver(parent: String) {}
}
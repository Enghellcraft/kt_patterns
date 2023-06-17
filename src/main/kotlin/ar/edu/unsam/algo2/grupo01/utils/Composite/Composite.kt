package ar.edu.unsam.algo2.grupo01.utils.Composite

// COMPOSITE: jerarquia de ramas y hojas, mediante la implementacion de una interfaz comun a las 2 clases

interface IComposite {

    fun compositePattern()
    fun algo(){}

}

class Hoja:IComposite{
    override fun compositePattern(){}
}

class Rama:IComposite{

    var listaDeHojas: MutableList<IComposite> = mutableListOf()


    override fun compositePattern(){
        listaDeHojas.forEach{ it -> it.algo()}
    }
}


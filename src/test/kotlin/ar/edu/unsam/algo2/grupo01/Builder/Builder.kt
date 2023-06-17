package ar.edu.unsam.algo2.grupo01.Builder

//BUILDER: crea una instanciade un objeto

class Cosa(num: Int) {
}

class CosaBuilder {

    var cosa = Cosa(5)


    fun crearCosa(): CosaBuilder {
        return this
    }

    fun crearCosaMasGrande(): CosaBuilder {
        cosa = Cosa(50)
        return this
    }

    fun build(): Cosa {
        return cosa
    }
}

// TEST: val cajaGrande = CosaBuilder().crearCosaMasGrande().build()
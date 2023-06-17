package ar.edu.unsam.algo2.grupo01.utils.Strategy


// STRATEGY: cada clase que hereda de ella tiene un comportamiento propio

interface IStrategy {
    fun stratfun(num: Int) {}
}

// Pueden ser objects
class StrategyOne : IStrategy{
    override fun stratfun(num: Int) {}
}

class StrategyTwo : IStrategy{
    override fun stratfun(num: Int) {}
}

class StrategyThree : IStrategy{
    override fun stratfun(num: Int) {}

}
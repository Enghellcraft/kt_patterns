package ar.edu.unsam.algo2.grupo01.utils.Command

// COMMAD: toma pedidos y realiza todas las acciones


class User {

}

abstract class Invoker{
    var commands: MutableList<Command> = mutableListOf()
    fun executeCommand() {
        commands.forEach { it.doExecute() }
    }
}

interface Command {

    
    fun execute(){
        // accion de cada uno
    }

    fun metodo2(){
        // accion comun a cada uno
    }

    fun doExecute() {
        execute()
        metodo2()
    }

}

class commandImpl1(var users: MutableList<User>) : Command{
    override fun execute() {
        users.forEach { doSomething() }
    }

    fun doSomething() {}
}

class commandImpl2(var users: MutableList<User>) : Command{
    override fun execute() {

    }
}



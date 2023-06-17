package ar.edu.unsam.algo2.grupo01.utils.MailSender

//MAIL SENDER: crea un elemento encargado de realizar ese comportamiento
data class Mail (var to: String, var subject: String)

interface MailSender {
    fun enviarMail(mail:Mail)
}

class Service(var mailSender: MailSender) {

    var to: String = "coco"
    var subject: String = "coca"

    var mail =  Mail("El ${to}", "Hagamos la ${subject}")
    // El coco, Hagamos la coca
    fun enviarMensaje() {
        mailSender.enviarMail(
            mail
        )
    }
}

package br.edu.ifsp.dmo1.login_datastore.data

object User {
    private const val email = "admin@email.com"
    private const val passwd = 123456L               //mudar?

    fun autenticate(email: String, password: Long) = this.email == email && this.passwd == password
}
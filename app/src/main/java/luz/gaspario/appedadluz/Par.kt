package luz.gaspario.appedadluz

class Par {
    fun ParImpar(num: Int): String {

        val resultado:String
        if (num % 2 == 0) {
            resultado = "Es par"
        }
        else
        {
            resultado = "Es impar"
        }
        return resultado
    }
}
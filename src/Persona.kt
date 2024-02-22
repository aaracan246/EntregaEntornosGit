abstract class Persona(val nombre: String, var edad: Int, var humor: Boolean) {

    fun saludar(): String = "Hola gente"

    fun contarChiste(): String {
        return if (humor) {
            "-Papá, papá, quiero ir al circo.\n" +
                    "-¿Qué dices niño? Quién quiera verte que venga a casa."
        } else {
            "No estoy de humor para contar chistes."
        }
    }

}
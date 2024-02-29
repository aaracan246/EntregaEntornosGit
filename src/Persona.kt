enum class Estado{DAÑADO,SANO,HERIDO}
abstract class Persona(val nombre: String, var edad: Int, var humor: Boolean, var estado: Estado, var fuerza: Int) {
    fun pelear(){}





}
class Cuerpo(nombre: String, edad: Int, humor: Boolean, estado: Estado,
             fuerza: Int
):Persona(nombre, edad, humor, estado, fuerza, ){
    fun sanando(humor: Boolean,estado: Estado){
        if (estado == Estado.DAÑADO){
            println("Te estas curando...")
            println("Tu estado actual es:${Estado.HERIDO}")
            this.estado = Estado.HERIDO

        } else if (estado == Estado.HERIDO){

            println("Te estas curando...")
            this.estado = Estado.SANO
            println("Tu estado actual es:${Estado.SANO}")

        }else {
            println("Estas sanísimo.")
            this.estado = Estado.SANO
        }

    }
}
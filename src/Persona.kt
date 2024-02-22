enum class TIPO_ROPA{

    PAYASO, OFICINISTA, UNIFORME_POLICIA, UNIFORME_BOMBERO
}

enum class ARMA{

    PEZ_COMICAMENTE_GRANDE, MALETIN, PISTOLA, MANGUERA
}


abstract class Persona(val nombre: String, var edad: Int, var humor: Boolean = true) {


    fun enfadarse(){

        humor = !humor

    }
}

class Payaso(nombre: String, edad: Int, humor: Boolean, tipoDeRopa: TIPO_ROPA, arma: ARMA): Persona(nombre, edad, humor){




}

class Oficinista(nombre: String, edad: Int, humor: Boolean, tipoDeRopa: TIPO_ROPA, arma: ARMA): Persona(nombre, edad, humor){

}

class Policia(nombre: String, edad: Int, humor: Boolean, tipoDeRopa: TIPO_ROPA, arma: ARMA): Persona(nombre, edad, humor){

}

class Bombero(nombre: String, edad: Int, humor: Boolean, tipoDeRopa: TIPO_ROPA, arma: ARMA): Persona(nombre, edad, humor){

}
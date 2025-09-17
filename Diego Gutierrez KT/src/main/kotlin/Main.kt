import kotlinx.coroutines.runBlocking // importe esto porque me lo pedi el runblocking

fun main() = runBlocking {
    val envios = mutableListOf<BaseEnvio>() //mutableList priv. tiene objetos de base de envios


    try {   // intento de envio con try, para poder ver o hacer pruebas
        envios.add(EnvioNormal(codigo ="A01",
            peso = 4.5,
            origen = "Valparaiso",
            destino = "Santiago"))

        envios.add(EnvioExpress(codigo = "A02",
            peso = 12.0,
            origen = "Santiago",
            destino = "Rancagua", urgente = true))

        envios.add(EnvioNormal(codigo = "A03",
            peso = 7.0,
            origen = "Conecepcion",
            destino = "Santiago"))

        envios.add(EnvioExpress(codigo = "A04",
            peso = 2.0,
            origen = "Santiago",
            destino = "Rio de janeiro", urgente = false))

        envios.add(EnvioNormal(codigo = "A05",
            peso = 2.0,
            origen = "Antofagasta",
            destino = "La Serena"))

        envios.add(EnvioExpress(codigo = "A06",
            peso = 10.3,
            origen = "Paine",
            destino = "Santiago",
            urgente = false))

        envios.add(EnvioNormal(codigo = "A07",
            peso = 5.2,
            origen = "Santiago",
            destino = "Graneros"))


        val aSantiago = envios.filter { it.destino == "Santiago" }
        println("Envios hacia Santiago: $aSantiago")// filtro solo de santiago

        //val aLaserena = envios.filter { it.destino == "La serena" }
        //println("Envios hacia la serena prueba")


        val codigos = envios.map { it.codigo }
        println("Codigos de envios: $codigos") // map transforma el elemnto


        val total = envios.sumOf { it.calcularCostoEnvio() }
        println("El costo de envio es de : $total") //suM0F suma los valores dando el total (con el metodo de costo de envio en  )
                                                     //envioexprees

        val resultado = simularProcesamiento(envios.first())
        when (resultado) { //llama a clase de estadoprocesamiento  60


            is EstadoProcesamiento.Procesando -> println("Se esta procesando el envio ")
            is EstadoProcesamiento.Exito -> println(resultado.mensaje)
            is EstadoProcesamiento.Fallo -> println("Error  : ${resultado.error}")
        }
    } catch (e: IllegalArgumentException) {
        println("Error : ${e.message}")
    }
}

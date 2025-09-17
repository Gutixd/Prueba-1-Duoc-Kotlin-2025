import kotlinx.coroutines.delay // import de delay

sealed class EstadoProcesamiento {
    object Procesando : EstadoProcesamiento()

    data class Exito(val mensaje: String) : EstadoProcesamiento() // mensaje con exito
    data class Fallo(val error: String) : EstadoProcesamiento() // mensaje sin exito
}


suspend fun simularProcesamiento(envio: BaseEnvio): EstadoProcesamiento {
    println(EstadoProcesamiento.Procesando)
    delay(2000) // delay de 2000 ms (2Segundo)
    return EstadoProcesamiento.Exito("El envio ${envio.codigo} fue procesado correctamente.")
}
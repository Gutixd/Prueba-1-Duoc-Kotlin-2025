open class BaseEnvio(
    val codigo: String,
    val peso: Double,
    val origen: String,
    val destino: String
) {
    open fun calcularCostoEnvio(): Double = 1000.0
}   // se debe retornar un valor de base de 10000

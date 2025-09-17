class EnvioExpress(
    codigo: String,
    peso: Double,
    origen: String,
    destino: String,

    val urgente: Boolean // true o false ""
)

    :  BaseEnvio(codigo, peso, origen, destino) {

    override fun calcularCostoEnvio(): Double { //Metodo para calcular  el costo de envio y se le agrega un cargo de 50%
        val base = super.calcularCostoEnvio()

        return if (urgente) base * 1.5 else base //50%
    }
}
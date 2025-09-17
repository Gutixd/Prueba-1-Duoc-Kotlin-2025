# Sistema de Gestión de Envíos

Sistema modular para la gestión y cálculo de costos de envíos, desarrollado en Kotlin con soporte para programación asíncrona.

## Características

- **Clase Base**: `BaseEnvio` con propiedades básicas y cálculo de costo base
- **Tipos de Envío**:
  - `EnvioNormal`: Envíos estándar con costo base
  - `EnvioExpress`: Envíos prioritarios con recargo del 50% para servicios urgentes
- **Procesamiento Asíncrono**: Simulación de procesamiento con estados y delays
- **Operaciones de Lista**: Filtrado, mapeo y sumatoria de envíos

## Estructura del Proyecto
📦 src/

├── 📄 BaseEnvio.kt # Clase base abstracta

├── 📄 EnvioNormal.kt # Implementación de envío normal

├── 📄 EnvioExpress.kt # Implementación de envío express

├── 📄 EstadoProcesamiento.kt # Estados del procesamiento (sealed class)

└── 📄 Main.kt # Punto de entrada y ejemplos de uso



## Tecnologías

- Kotlin 1.8+
- Kotlin Coroutines para operaciones asíncronas
- Programación orientada a objetos con herencia y polimorfismo

## Uso

El sistema permite crear diferentes tipos de envíos, calcular sus costos, filtrar por destino y simular procesamientos asíncronos.

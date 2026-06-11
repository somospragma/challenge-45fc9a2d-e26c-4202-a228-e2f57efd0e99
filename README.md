# Optimización de flujos de eventos en un sistema de monitoreo de transacciones

En un sistema de monitoreo de transacciones financieras, se reciben eventos de múltiples orígenes (bancos, fintech, sistemas de pago). El sistema debe procesar estos eventos de manera reactiva, asegurando la resiliencia, escalabilidad y confiabilidad del código. Los eventos incluyen transacciones exitosas, fallidas y en espera, cada uno con atributos específicos (ID de transacción, monto, timestamp, origen). El sistema debe manejar la consistencia de los datos, la idempotencia de las transacciones y la recuperación ante fallos de los orígenes de eventos.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | programación reactiva |
| **Nivel** | junior-l2 |
| **Tipo** | mixed |
| **Tiempo estimado** | 8 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y generará un ZIP listo para usar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: Un IDE o editor de código.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y generará un archivo ZIP descargable. Descárgalo y extráelo en la carpeta donde quieras trabajar.
- Verifica que el proyecto arranca sin errores.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no genera el ZIP automáticamente al terminar el análisis, escríbele: "genera el ZIP ahora".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Exploración y modelado de eventos

**Objetivo:** Identificar y modelar los eventos provenientes de los diferentes orígenes.

**Tiempo estimado:** 2 horas

**Instrucciones:**

- Enumera los diferentes tipos de eventos que se reciben en el sistema de monitoreo de transacciones.
- Modela cada tipo de evento con sus atributos específicos.
- Identifica las restricciones y ambigüedades en los eventos recibidos.

**Entregable:** Modelo de eventos con sus atributos y restricciones identificadas.

<details>
<summary>Pistas de conocimiento</summary>

- Considera la cardinalidad y los tipos de datos de los atributos de los eventos.
- Piensa en las posibles inconsistencias entre los eventos de diferentes orígenes.

</details>

### Fase 2: Implementación de operadores reactivos

**Objetivo:** Implementar operadores reactivos para procesar los eventos de manera eficiente y resiliente.

**Tiempo estimado:** 3 horas

**Instrucciones:**

- Selecciona los operadores reactivos adecuados para filtrar, transformar y combinar los eventos recibidos.
- Asegura la idempotencia de las transacciones y la consistencia de los datos.
- Maneja los errores y fallos de los orígenes de eventos de manera resiliente.

**Entregable:** Flujo reactivo que procesa los eventos con operadores adecuados, asegurando idempotencia y consistencia.

<details>
<summary>Pistas de conocimiento</summary>

- Considera el uso de operadores como filter, map, concatMap y retry.
- Piensa en cómo manejar los eventos duplicados y los fallos temporales de los orígenes.

</details>

### Fase 3: Optimización y resiliencia

**Objetivo:** Optimizar el flujo reactivo y asegurar la resiliencia del sistema ante fallos.

**Tiempo estimado:** 3 horas

**Instrucciones:**

- Optimiza el flujo reactivo para mejorar la escalabilidad y el rendimiento.
- Asegura la resiliencia del sistema ante fallos de los orígenes de eventos y del propio sistema.
- Evalúa y selecciona las estrategias de recuperación adecuadas.

**Entregable:** Flujo reactivo optimizado y resiliente, con estrategias de recuperación adecuadas.

<details>
<summary>Pistas de conocimiento</summary>

- Considera el uso de backpressure y buffering para mejorar la escalabilidad.
- Piensa en cómo implementar retry y fallback para la resiliencia.
- Evalúa diferentes estrategias de recuperación y selecciona la más adecuada para el dominio.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué son los operadores reactivos y cómo se utilizan en el procesamiento de eventos?
- **paraQueSirve**: ¿Para qué sirve asegurar la idempotencia y la consistencia en el procesamiento de eventos?
- **comoSeUsa**: ¿Cómo se implementan los operadores reactivos para filtrar, transformar y combinar eventos?
- **erroresComunes**: ¿Cuáles son los errores comunes al procesar eventos reactivos y cómo se pueden evitar?
- **queDecisionesImplica**: ¿Qué decisiones implica la selección de estrategias de recuperación en un sistema reactivo?

## Criterios de Evaluacion

- Modelo de eventos con atributos y restricciones identificadas.
- Flujo reactivo que procesa eventos con operadores adecuados, asegurando idempotencia y consistencia.
- Flujo reactivo optimizado y resiliente, con estrategias de recuperación adecuadas.

---

*Reto generado automaticamente por Challenge Generator - Pragma*

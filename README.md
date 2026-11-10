# Ejercicio 2 — BancoPlata

Programación 1 · Universidad Libre · Docente: Andrés Castaño

## Cómo ejecutarlo

```bash
javac -d out src/*.java
java -cp out Main
```

## Qué hace

Envía notificaciones de transferencias y códigos de seguridad a los usuarios por distintos canales: SMS, correo, push y WhatsApp.

## Qué se resolvió

- **Antes:** un bloque `if/else` repetido en dos métodos decidía qué canal crear según un texto. WhatsApp no tenía clase ni rama, así que su notificación no salía, y cada canal nuevo obligaba a modificar código que ya funcionaba.
- **Ahora:** se aplicó **Factory Method**. Todos los canales implementan la interfaz `Canal`, y cada canal tiene su creador (`CreadorSms`, `CreadorEmail`, `CreadorPush`, `CreadorWhatsApp`) que extiende `CreadorCanal`. `ServicioNotificaciones` ya no conoce las clases concretas. Para agregar un canal nuevo solo se crean clases nuevas, sin tocar las existentes.

package exercises

import java.nio.file.Files
import java.nio.file.Paths

/*
5. Simple To Do List
 */

fun main() {
    val address = Paths.get("C:/Users/Camila Grandini/Desktop/teste.txt")

    try {
        val text = Files.readAllBytes(address)
        val read = String(text)

        println(read)

    } catch (e: Exception) {
    }

}
package exercises

import java.io.File
import java.io.FileOutputStream

/*
5. Simple To Do List
 */

fun main() {

    try {
        val file = FileOutputStream("file.txt")

        val stream = File("file.txt").inputStream()

        stream.close()

        File("file.txt").writeText("I'm writing in a new file!!\nThis is the file number 1")
        File("file.txt").forEachLine { println(it) }

    } catch (e: Exception) {
        print("Error while writing the file")
    }
}

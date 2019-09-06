package exercises

import java.io.File
import java.io.FileOutputStream

/*
5. Simple To Do List
 */

fun main(args: Array<String>) {

    try {
        val file = FileOutputStream("file.txt")

        val stream = File("file.txt").inputStream()

        stream.close()

        File("file.txt").writeText(
            "The command in this code file it's for:\n" +
                    "1. Create a txt file;\n" +
                    "2. Write text on this txt;\n" +
                    "3. Read what was written"
        )

        stream.close()
        File("file.txt").forEachLine { println(it) }

    } catch (e: Exception) {
        print("Error while writing the file")
    }
}

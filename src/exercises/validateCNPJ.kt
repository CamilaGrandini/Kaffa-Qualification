package exercises

/*
1. Validate CNPJ Format (Mask)
2. Validate CNPJ Digits
 */

fun isCNPJ(document: String): Boolean {
    val numbers = arrayListOf<Int>()

    document.filter { it.isDigit() }.forEach {
        numbers.add(it.toString().toInt())
    }

    //verifying digit 1
    val vd1  =  11 - (arrayOf(5, 4, 3, 2, 9, 8, 7, 6, 5, 4, 3, 2).mapIndexed { index, i ->
        i * numbers[index]
    }).sum().rem(11)
    numbers.add(vd1)

    //verifying digit 2
    val vd2  =  11 - (arrayOf(6, 5, 4, 3, 2, 9, 8, 7, 6, 5, 4, 3, 2).mapIndexed { index, i ->
        i * numbers[index]
    }).sum().rem(11)

    return numbers[12] == vd1 && numbers[13] == vd2
}

fun main(args: Array<String>) {
    val expected = "([0-9]{2})([0-9]{3})([0-9]{3})([0-9]{4}([0-9]{2}))".toRegex()

    //format = XX.XXX.XXX/YYYY-ZZ
    val expectedFormat = "$1.$2.$3/$4-$5"

    print("Enter a CNPJ: ")
    val formattedCNPJ = readLine()!!.replace(expected, expectedFormat)

    if (isCNPJ(formattedCNPJ))
        println("CNPJ $formattedCNPJ is valid!")
    else println("Invalid CNPJ!")
}
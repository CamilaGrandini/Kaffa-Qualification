package exercises

/*
1. Validate CNPJ Format (Mask)
 */

fun main() {

    val expected = "([0-9]{2})([0-9]{3})([0-9]{3})([0-9]{4}([0-9]{2}))".toRegex()

    //format = XX.XXX.XXX/YYYY-ZZ
    val expectedFormat = "$1.$2.$3/$4-$5"

    print("Enter a CNPJ: ")
    val formattedCNPJ = readLine()!!.replace(expected, expectedFormat)
    print("Your formatted CNPJ is: $formattedCNPJ")

}
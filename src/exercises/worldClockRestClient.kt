package exercises

import java.net.URL

/*
5. Rest Client - World Clock
 */

fun main() {
    print(getJasonFromURL("http://worldclockapi.com/api/json/utc/now"))

}

fun getJasonFromURL(wantedURL: String): String = URL(wantedURL).readText()
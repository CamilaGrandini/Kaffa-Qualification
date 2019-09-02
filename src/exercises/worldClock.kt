package exercises

import java.net.URL

/*
5. Rest Client - World Clock
 */

fun main() {

    val clockURL = "http://worldclockapi.com/api/json/utc/now"
    val resultsApi = worldClock(clockURL)

    val dateTime = resultsApi.split(",").find {
        it.contains("currentDateTime")
    }

    print(dateTime)

}

fun worldClock(wantedURL: String): String = URL(wantedURL).readText()
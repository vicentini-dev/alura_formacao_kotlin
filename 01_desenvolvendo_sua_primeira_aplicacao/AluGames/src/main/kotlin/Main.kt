import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse

fun main() {
    val url = "https://www.cheapshark.com/api/1.0/games?title=batman"

    val client: HttpClient = HttpClient.newHttpClient()
    val request = HttpRequest.newBuilder().uri(URI.create(url)).build()
    val response = client.send<String>(request, HttpResponse.BodyHandlers.ofString())

    println(response)
    println(response.body())
}
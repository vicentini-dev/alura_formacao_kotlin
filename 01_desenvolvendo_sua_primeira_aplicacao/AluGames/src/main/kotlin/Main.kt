import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse

fun main() {
    val url = "https://www.cheapshark.com/api/1.0/games?title=batman"

    val client = HttpClient.newHttpClient()
    val request = HttpRequest.newBuilder().uri(URI.create(url)).build()
    val response = client.send<String>(request, HttpResponse.BodyHandlers.ofString())

    println(response)
    println(response.body())

    val jogo1 = Jogo()
    jogo1.nome = "LEGO Batman"
    jogo1.capa = "https:\\/\\/cdn.fanatical.com\\/production\\/product\\/400x225\\/105f34ca-7757-47ad-953e-7df7f016741e.jpeg"
}
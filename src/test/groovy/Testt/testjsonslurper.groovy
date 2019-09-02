//package Testt
import com.github.tomakehurst.wiremock.WireMockServer
import groovy.json.JsonSlurper
import org.apache.http.impl.client.CloseableHttpClient
/*class testjsonslurper {
    static String json1 = '''
{
  "name": "John",  
  "age": 20
}
'''

    public static void main(String[] args) {
        String name = "name=John"
        def value = new JsonSlurper().parseText(json1).find{ it = name}
println(value)
        //find { it == name }
//        println(value)
    }

}*/
/*
class testjsonslurper
{
    private RestTemplate restTemplate;
    WireMockServer wireMockServer = new WireMockServer()
    wireMockServer.start()
    configureFor("localhost", 8080)
    stubFor(get(urlEqualTo("/baeldung")).willReturn(aResponse() withBody("Welcome to Baeldung!")));

    String serverUrl = buildApiMethodUrl();
    ResponseEntity<String> response = restTemplate.getForEntity(serverUrl,
            String.class
    )

private String buildApiMethodUrl() {
    return String.format("http://localhost:%d/api/message",
            this.wireMockServer.port()


}
}
*/

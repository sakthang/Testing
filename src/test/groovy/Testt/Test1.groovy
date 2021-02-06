package Testt
import groovy.json.JsonOutput
import groovy.json.JsonSlurper
import org.chiknrice.test.SpringifiedConcordionRunner
import org.concordion.api.MultiValueResult
import org.junit.runner.RunWith
import org.springframework.test.context.ContextConfiguration
import org.xml.sax.helpers.ParserAdapter
import wslite.rest.ContentType
import wslite.rest.RESTClient
import wslite.http.HTTPRequest

@RunWith(SpringifiedConcordionRunner)
@ContextConfiguration(classes = GroovyClassLoader)
//sample test case
//@Grab('com.github.groovy-wslite:groovy-wslite:1.1.2')
class Test1  {
    def greetingFor(String firstname) {
        [
                firstname: firstname,
        ]
    }

    def invalidcustomer(Integer invalidcust) {
        [
                invalidcust: invalidcust
        ]
    }

    def splittingname(String name) {
        String[] str = name.split()
        String firstName = str[0]
        String lastName = str[1]
        [
                firstName: firstName,
                lastName1: lastName
        ]
    }

    def split1(String name1) {
        String[] str1 = name1.split()
        //String firstName = str1[0]
        //String lastName = str1[1]
        return new MultiValueResult()
                .with("firstName1", str1[0])
                .with("lastName1", str1[1]);
    }

    def gettest1(Integer value) {

        RESTClient client
        client = new RESTClient("https://webflux.josdem.io/")
        def response = client.get(path: '/sanity/ping')
        [
                value: response.statusCode
        ]

        // println("Hello" +obj.toJson(response))
        // println("Helloooo "+response.statusCode)
    }

    def testpost1(Integer value2) {
        try {
            println("hellllooo")
            println(baseurl)
            RESTClient client1
            client1 = new RESTClient("https://reqres.in")
           // client1.httpClient.sslTrustAllCerts = true
            def response1 = client1.post(
                    path: '/api/users?name="josdem"&job="less"')
                   // requestContentType: 'application/json'
            [
                    value2: response1.statusCode
            ]
         //   println("Hello1" + obj.toJson(response1))
            println("Hello2")
            }
            catch (Exception ex ) {
                println(ex)
            }
        }

    def setValues(one1, two2, three3)
    {
        one1 = Integer.parseInt(one1)
        two2 = Integer.parseInt(two)
        three3 = Integer.parseInt(three)
        Testing setAdd = new Testing(one1, two2, three3)
       int result = one1+two2+three3
        [
                result : result
        ]
    }
}


/*
class Test1 {
     static void main(String[] args)  {
         int n1 = 100
         int n2 = 200
        Testing t1 = new Testing(n1,n2)
        t1.display()
    }
}
*/
package Testt
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
class Testing1 {
    String one1
    String two2
    String three3
    Testing2 test
    void setvalues(one1,  two2,  three3) {

        one1 = Integer.parseInt(one1.trim())
        two2 = Integer.parseInt(two2.trim())
        three3 = Integer.parseInt(three3.trim())
        test = new Testing2(one1, two2, three3)
    }
    def getadd()
    {
        int result = test.getOne1() + test.getTwo2() + test.getThree3()
        [
                result : result
        ]
    }
}



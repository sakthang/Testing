# sample
## Examples
### [Test message returned for a valid customer] (- "greetingFor")
**Given** value of [Sakthi kumaran](- '#name')
**When** post service receives a POST Credit Sale [for the customer](- "#result=greetingFor(#name)")
**Then** assert [Sakthi kumaran](- "?=#result.firstname")

###[Verification of results for a Customer] (- "CustomerInfo")
***Given*** When a customer number is [509434](- "#invalidcust")
***When*** the customer invalid check is implemented [For the invalid Customer](- "#result1=invalidcustomer(#invalidcust)")
***Then*** assert [509434](- "?=#result1.invalidcust")

###[Verification of  customer split] (- "Customersplit")
***Given*** When a customer name is [Ram Prasad](- "#custname")
***When*** the split method is executed [For the given customer](- "#result2=splittingname(#custname)")
***Then*** assert [Ram](- "?=#result2.firstName") and [Prasad](- "?=#result2.lastName")

### [Examples](- "simple-names")
| Full Name               | First Name      | Last Name |
| ---------------         | --------------- | --------------- |
| [John Smith][split1]     | [John][first]   | [Smith][last] |
| [David Peterson][split1] | [David][first]  | [Peterson][last] |

[split1]: - "#result3 = split1(#TEXT)"
[first]: - "?=#result3.firstName1"
[last]:  - "?=#result3.lastName1"

###[Verification for testing the rest services] (- "Rest Services")
***Given*** Test a response code for the customer [509434](- "#value") 
***When*** the get method is invoked [for the customer](- "#result3=gettest1(#value)")
***Then*** assert [200](- "?=#result3.value")


###[Verification for testing the rest post services] (- "Rest Services1")
***Given*** Test a response code for the customer [76066611](- "#value2") 
***When*** the get method is invoked [for the customer](- "#result4=testpost1(#value2)")
***Then*** assert [201](- "?=#result4.value2")


###[emaples using verification of data] (- "Resting in services")
|[test][][number one][one]   |[number 2][two]    |[number three][three]   |
|------------------          |-----------------  |----------------------  |
|100                         |400                |300                     |

[one]: - "#one"
[two]: - "#two"
[three]: - "#three"
[test]: - "setValues(#one,#two,#three)"

***When*** Data is [value is](- "#result5=getadd()")
***Then*** Result is [600](- "?=result5.addvalue))


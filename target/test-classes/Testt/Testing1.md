###[emaples using verification of data] 
|[test][][Summing](- "c:example")  |[number one][one]           |[number 2][two]    |[number three][three]   |[Result][sumresult]
|--------------------------------- |------------------          |-----------------  |----------------------  |--------------------
|Resting 1                         |100                         |400                |300                     |800
|Resting 2                         |200                         |600                |100                     |900 

[test]: - "setvalues(#one,#two,#three)"
[one]: - "#one"
[two]: - "#two"
[three]: - "#three"
[sumresult]: - "#Result"

***When** Perform the add [addition result](- "#result1=getadd()")
***Then*** Result is [sumresult](- "?=#result1.result")

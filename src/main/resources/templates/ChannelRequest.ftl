{
  "data": [
    {
      "header": {
        "id": "${exchange.properties.channelIdHeader}",
        "type": "${exchange.properties.channelTypeHeader}"
      },
       <#if exchange.properties.channelId??>
      	"channelID": "${exchange.properties.channelId}",
       </#if>
       <#if exchange.properties.consumerId??>
     	 "consumerID": "${exchange.properties.consumerId}"
      </#if> 
      <#if exchange.properties.path??>
      	"path":"${exchange.properties.path}"
      </#if> 
    }
  ]
}
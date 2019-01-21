{
	"endPoints": [{
			"url": "{{endpoint}}/channel/get-status",
			"request": "{\"data\": [{\"header\":{\"type\": \"channel\",\"id\": \"1001773866\"},\"channelId\": \"NDB\",\"consumerId\": \"SVN\"}]}"
		},
		{
			"url": "{{endpoint}}/transaction/get-status",
			"request": "{\"data\":[{\"header\": {\"id\": \"123456780\",\"type\": \"transactionSatus\"},\"path\": \"/transaction/get-status\"}]}"
		}
	]
}
from twilio.rest import TwilioRestClient

account_sid="*****"
auth_token="*****"
client=TwilioRestClient(account_sid,auth_token)

message=client.sms.messages.create(
	body="My name is Khan and I'm not terrorist",
	to="+***",#cell phone no
	from_="+**"# twilio no
	)
print(message.sid)
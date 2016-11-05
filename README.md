# default-java-telegrambot

[![Build Status](https://travis-ci.org/itjustworksteam/default-java-telegrambot.svg?branch=master)](https://travis-ci.org/itjustworksteam/default-java-telegrambot)

## GETTING STARTED

On Telegram:

* start a chat with the BotFather
* use the command ```/newbot``` to create a new bot
* give it a name
* give it a unique identifier that ends with the word ```bot```
* Remember the bot token that Telegram gives to you if all go right

On your laptop/server:

* You have to install java oracle jdk 8 to continue
* clone this repository
* compile it with: ```./gradlew clean check stage```
* remember to set up this environment variables: ```TELEGRAM_SERVER_TOKEN```, ```TELEGRAM_BOT_TOKEN```, ```PORT```
* run it with: ```java -cp build/libs/yourbot.jar it.itjustworks.yourbot.server.Server```
* run tests with: ```./gradlew clean check jacocoTestReport```

* For the documentation please see the [Telegram API](https://core.telegram.org/bots/api)
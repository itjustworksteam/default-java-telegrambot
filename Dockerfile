FROM therickys93/alpinejava
ADD . /telegrambot
WORKDIR /telegrambot
RUN ./gradlew clean check stage
CMD bash run.sh

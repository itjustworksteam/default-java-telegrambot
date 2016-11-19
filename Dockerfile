FROM therickys93/ubuntu14java
ADD . /telegrambot
WORKDIR /telegrambot
RUN ./gradlew clean check stage
CMD bash run.sh
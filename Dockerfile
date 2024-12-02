#Указываем базовый образ, с использованием которого будет производиться формирование докер-образа приложения.
FROM openjdk:17

#Создаем папку "app" внутри контейнера.
RUN mkdir /app

#Копируем собранное веб-приложение в папку "app" внутри контейнера под новым именем "devops-greeting-service.jar"
COPY ./build/libs/*.jar /app/greeting-service.jar

#Задаем порт внутри контейнера, по которому будет работать приложение.
EXPOSE 8080

#Устанавливаем рабочую директорию внутри контейнера.
WORKDIR /app

#Запускаем собранное ранее веб-приложение внутри контейнера при помощи данной команды.
CMD java -jar greeting-service.jar
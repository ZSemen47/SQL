### Инструкция по запуску SUT
1. Запустить контейнер командой `docker-compose up --force-recreate`
2. Запустить приложение командой `java -jar ./artifacts/app-deadline.jar -P:jdbc.url=jdbc:mysql://localhost:3306/app -P:jdbc.user=app -P:jdbc.password=pass`
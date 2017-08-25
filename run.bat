cd registration-service
start cmd /k mvn spring-boot:run
timeout 10 >nul
cd ../greeting-service
start cmd /k mvn spring-boot:run
cd ../client-greeting-service
start cmd /k mvn spring-boot:run
timeout 15 >nul
start http://localhost:3333
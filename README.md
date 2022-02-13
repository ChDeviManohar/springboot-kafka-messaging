# springboot-kafka-messaging
Kafka messaging for publishing and consuming messages in spring boot application

#confluent kafka install using docker:
1. Download or copy the contents of the Confluent Platform all-in-one Docker Compose file
>curl --silent --output docker-compose.yml https://raw.githubusercontent.com/confluentinc/cp-all-in-one/7.0.1-post/cp-all-in-one/docker-compose.yml

2.Start the Confluent Platform stack with the -d option to run in detached mode:
>docker-compose up -d

3. Verify that the services are up and running:
>docker-compose ps

4. After a few minutes, if the state of any component isn’t Up, 
run the docker-compose up -d command again, or try docker-compose restart <image-name>
  
  
  ![image](https://user-images.githubusercontent.com/76479386/153755979-57806ac1-823d-42b4-a22d-645a2b0e6d1d.png)

  
  
#Producer and Consumer Logs
  ![image](https://user-images.githubusercontent.com/76479386/153760572-a18bb70d-e3ec-4acd-974b-8bd9765b20b3.png)


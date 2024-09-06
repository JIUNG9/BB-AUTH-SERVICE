
# Blooming-blooms MICROSERVICE.AUTH-SERVICE

## Description
This is the Blooming-blooms auth-service, designed for sophisticated authentication and authorization. It features four filter chains, each tailored for specific roles (social-user, oauth2, store-manager, system-admin) to separate concerns. I distinguish between the social-user filter chain and the oauth2 filter chain. The oauth2 filters are dedicated to authenticating with the oauth2 remote server and retrieving data from it. By separating these two filter chains, I can inject different AuthenticationSuccessHandlers for when Oauth2 authentication and user authentication succeed. (There is a requirement for user sign-up: users who have terminated their membership cannot register as a member within 24 hours to prevent abuse.)

---------
## Getting Started

### Prerequisites

#### Install(Mac brew)
```
brew install redis
```
#### Install(Window)
```
sudo apt-get install redis
```

### Usage 

#### Redis
```
redis-cli -h host -p port -a password
```

## API Documentation

https://www.notion.so/0acd63e526144ac3aeac0bea0413704a?pvs=4

## ERD

https://www.erdcloud.com/d/PSD5Cgi6GrFQbdxgK

## System Architecture
![image](https://github.com/JIUNG9/BB-APIGATEWAY-SERVICE/assets/60885635/ba580899-5ef3-4dda-b242-8d4d84666640)


<!-- Backend Languages and Tools -->
## Backend Languages and Tools
<p align="left">
  <!-- Database Icons -->
  <a href="https://www.mysql.com/" target="_blank" rel="noreferrer"> <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/mysql/mysql-original-wordmark.svg" alt="mysql" width="40" height="40"/> </a>&nbsp;&nbsp;&nbsp;&nbsp
   <a href="https://redis.io" target="_blank" rel="noreferrer"> <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/redis/redis-original-wordmark.svg" alt="redis" width="40" height="40"/> </a>&nbsp;&nbsp;&nbsp; &nbsp;
  <a href="https://kafka.apache.org/" target="_blank" rel="noreferrer"> <img src="https://www.vectorlogo.zone/logos/apache_kafka/apache_kafka-icon.svg" alt="kafka" width="40" height="40"/> </a>&nbsp;&nbsp;&nbsp; &nbsp;
  <!-- Framework Icons -->
  <a href="https://spring.io/" target="_blank" rel="noreferrer"> <img src="https://www.vectorlogo.zone/logos/springio/springio-icon.svg" alt="spring" width="40" height="40"/> </a>
</p>




## Contacts

📫 How to reach me **rnwldnd7248@gmai.com**

 📄 Know about my experiences [https://www.notion.so/704f524047084978836216b3621dc12e?pvs=4](https://www.notion.so/704f524047084978836216b3621dc12e?pvs=4)

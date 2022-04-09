# Secure pseudo queue Application


## Steps to check proof of concept 
1. Open Postman and select HTTP verb as Post and add the following url to the request
   https://sender-microservice.herokuapp.com/sender/sendTransaction
   Add the sample transaction request mentioned in the question to the Request body in raw(JSON) section
   For more details or help checkout the screenshot in the following url:
   https://imgur.com/SEMKVnJ

   Sample Json to add in body :
   {
    "accountNumber": "AccNaassa",
	 "type": "credit",
	 "amount": "1222",
	 "currency": "inr",
	 "accountFrom": "1234343"
   } 


2. To check the POC that object was added in the receiver microservice 
   get the account number received in the previous step and add it to the following URL
   https://receiver-microservice.herokuapp.com/receiver/<add here and remove angled braces>
   then you will get the object back that was used in the previous step

3. To prove that the object was sent as encrypted and decrypted and then added to the database I have attached the screenshot of  the logs of the application, which prove that it was decrypted and then added to database.
screenshot: https://imgur.com/d1isJBc



## Running the application on local
* You should have java 11 or jdk 1.8 installed on your machine along with spring tool suite or similar ide prior to cloning the repository.
* Clone the git repos mentioned below in your local machine.

https://github.com/amitabh19/SenderService
https://github.com/amitabh19/ReceiverService

* Import the project from file system in your IDE.
* Let the project build.
* After the build is completed right click on project and select run as spring boot application.
* **Follow the above steps for both the git repos(receiver and sender microservices)**
* Follow the proof of concept mentioned in readme to check if it works

# Email for help : amitabh19101998@gmail.com


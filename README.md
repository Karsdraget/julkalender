# Julkalender

## Todo

* Create a first hatch
  - Work on the template
  - Get the border around the panel  

* Klura på ett annat proj efter sessionen 5/1


* Create date check function
  - It isn't legal to open before the correct date
  - 
  
* Get Selenium up and running
  - stage should not run Selenium

* Get Cucumber up and running

* Initiate an admin site
  - Preview function - tjuvtitta
 
* Create mail for tometen@karsdraget.se 

## Build

Build and start the project:

```
./gradlew clean stage --daemon; java -jar build/libs/julkalender-all.jar
```

## Logging

Tail the application log

```
heroku logs --app idagus --tail
```

## Access

Access it at 
[localhost:8080](http://localhost:8080)

or live

[http://idagus.herokuapp.com/](http://idagus.herokuapp.com/)


### Mail account

tomten.karsdraget@gmail.com

pw: kd + old phone number, without area code


## Decision log

Motivate decisions here. We might wonder why we chose to do stuff, let this section contain our motivations.

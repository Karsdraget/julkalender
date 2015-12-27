# Julkalender

## Todo

* Create a first hatch

* Get Selenium up and running
  - stage should not run Selenium

* Get Cucumber up and running

* Initiate an admin site


* Change owner of Heroku account to Kårsdraget
  - Blocked, we are waiting for David

* Create a google analytics account
 - medlem@karsdraget.se can't get a Analytics account
 
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

## Decision log

Motivate decisions here. We might wonder why we chose to do stuff, let this section contain our motivations.

// @Library('your-library-name')_
@Library('github.com/arvid-erickson/jenkinslibdevel')_
/*
library(
  identifier: 'jenkinslibdevel@master',
  retriever: modernSCM(
    [
      $class: 'GitSCMSource',
      remote: 'https://github.com/arvid-erickson/jenkinslibdevel.git'
    ]
  )
)
*/
  boolean testValue = false
  stage("Checkout") { 
    println 'Checkout stage'
  }  
  stage("build") { 
    println 'Build stage' 
    sayHello()
  }
  stage("Deployment") {
    println 'Deployment'
    print(testValue)
  }
  stage("Activation") {
    println 'Activation'
  }
  stage("Restart") {
    println 'Restart'
  }
  stage("Cleanup") {
    println 'Cleanup'
  }
/*
pipeline()
*/

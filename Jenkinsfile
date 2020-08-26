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
  stage("Checkout") { 
    println 'Checkout stage'
  }  
  stage("build") { 
    println 'Build stage' 
    sayHello()
  }
  stage("Deployment") {
    println 'Deployment'
  }
  stage("Activation") {
    println 'Activation'
  }
  stage("Restart") {
    println 'Restart'
  }
  stage("Cleanup") {
    println 'Testing clenaup f(x) call'
//    cleanup()
//    printparms()
  }
/*
pipeline()
*/

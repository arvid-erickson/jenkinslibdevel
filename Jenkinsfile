// @Library('your-library-name')_

library(
  identifier: 'jenkins-shared-library@1.0.4',
  retriever: modernSCM(
    [
      $class: 'GitSCMSource',
      remote: 'https://github.com/hoto/jenkins-shared-library.git'
    ]
  )
)
pipeline {
  agent any
  stages {
  stage('Where is Jenkins Shared Library cloned') {
      steps {
        script {
          sh 'ls -la ../050-shared-library-where-is-it-cloned@libs/jenkins-shared-library'
        }
      }
    }
  }
}

/* Original code - 20200814 DO NOT DELETE!!!
@Library('github.com/arvid-erickson/jenkinslibdevel') _

env.workspace = ''
    
stage('pull library (1)') {
    sayHello()
}  
stage('pull library (2)') {
    sayHello()
}
stage('pull library (3)') {
    HelloDemo2()
}  
stage('pull library (4)') {
    sayHello()
}  
stage('pull a second library (3)') {
    HelloDemo2()
}
*/

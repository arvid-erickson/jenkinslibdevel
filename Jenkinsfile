// @Library('your-library-name')_

library(
  identifier: 'jenkins-shared-library@1.0.4',
  retriever: modernSCM(
    [
      $class: 'GitSCMSource',
      // remote: 'https://github.com/hoto/jenkins-shared-library.git'
      remote: 'github.com/arvid-erickson/jenkinslibdevel/jenkinslibdevel.git'
    ]
  )
)
/*
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
*/
stage('build') {
}
stage('Deployment') {
}
stage('Activation') {
}
stage('Restart') {
}
stage('Cleanup') {
}

/* Original code - 20200814 DO NOT DELETE!!!
@Library('github.com/arvid-erickson/jenkinslibdevel') _
*/

// @Library('your-library-name')_
@Library('github.com/arvid-erickson/jenkinslibdevel')_

library(
  identifier: 'jenkinslibdevel@master',
  retriever: modernSCM(
    [
      $class: 'GitSCMSource',
      remote: 'https://github.com/arvid-erickson/jenkinslibdevel.git'
    ]
  )
)

pipeline {
  agent any
  stages {
  stage('Where is Jenkins Shared Library cloned') {
      steps {
        script {
          // sh 'ls -la ../002-stages-scripted-style@libs/jenkins-shared-library'
          echo 'calling nothing'
          sh 'ls -la .'
        }
      }
    }
  }
}


/* Original code - 20200814 DO NOT DELETE!!!
@Library('github.com/arvid-erickson/jenkinslibdevel') _
*/

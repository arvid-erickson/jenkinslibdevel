// @Library('your-library-name')_

library(
  identifier: 'jenkins-shared-library@1.0.4',
  retriever: modernSCM(
    [
      $class: 'GitSCMSource',
   //   remote: 'https://github.com/hoto/jenkins-shared-library.git'
      remote: 'github.com/arvid-erickson/jenkinslibdevel.git'
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
        }
      }
    }
  }
}


/* Original code - 20200814 DO NOT DELETE!!!
@Library('github.com/arvid-erickson/jenkinslibdevel') _
*/

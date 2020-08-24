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
/*
pipeline()

vars/pipeline()


  stage("Checkout") {}
  stage("build") { build() }
  stage("Deployment") {}
  stage("Activation") {}
  stage("Restart") {}
  stage("Cleanup") {}
*/
/*
pipeline{
    agent any
    environment{
        MY_FILE = fileExists '/tmp/myfile'
    } 
    stages{ */
        stage('Build'){
            steps {
                echo "Build"
            }
        }
        stage('Deploy'){
            steps {
                echo "Deploy"
            }
        } 
/*
    }
}
*/

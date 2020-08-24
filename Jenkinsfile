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
pipeline{
    agent any
    environment{
        MY_FILE = fileExists '/tmp/myfile'
    }
//    stages{
        stage('conditional if exists'){
            when { expression { MY_FILE == 'true' } }
            steps {
                echo "file exists"
            }
        }
        stage('conditional if not exists'){
            when { expression { MY_FILE == 'false' } }
            steps {
                echo "file does not exist"
            }
        }
  //  }
}
